# Numbers Configuration API

The Numbers Configuration API allows you to manage phone numbers for your Infobip account. You can search for available numbers, purchase them, configure them for various use cases, and release them when no longer needed.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Quick Start](#quick-start)
- [API Operations](#api-operations)
  - [Search Available Numbers](#search-available-numbers)
  - [Purchase a Number](#purchase-a-number)
  - [Get All Numbers](#get-all-numbers)
  - [Get Number Configuration](#get-number-configuration)
  - [Update Number Configuration](#update-number-configuration)
  - [Release a Number](#release-a-number)
- [Examples](#examples)
- [Error Handling](#error-handling)

## Prerequisites

Before using the Numbers Configuration API, ensure you have:

1. An Infobip account
2. API key for authentication
3. Required permissions to manage phone numbers

## Quick Start

```java
import com.infobip.ApiClient;
import com.infobip.ApiKey;
import com.infobip.BaseUrl;
import com.infobip.api.NumbersConfigurationApi;
import com.infobip.model.*;

// Initialize the API client
ApiClient client = ApiClient.forApiKey(ApiKey.from("YOUR_API_KEY"))
    .withBaseUrl(BaseUrl.from("https://api.infobip.com"))
    .build();

// Create the Numbers Configuration API instance
NumbersConfigurationApi api = new NumbersConfigurationApi(client);
```

## API Operations

### Search Available Numbers

Search for available phone numbers that can be purchased.

```java
try {
    NumbersSearchResponse response = api.searchAvailableNumbers("US")
        .capability("SMS")
        .type("MOBILE")
        .execute();
    
    for (NumbersAvailableNumber number : response.getNumbers()) {
        System.out.println("Available: " + number.getPhoneNumber());
        System.out.println("Monthly Price: " + number.getMonthlyPrice() + " " + number.getCurrency());
        System.out.println("Capabilities - SMS: " + number.getCapabilities().getSms());
    }
} catch (ApiException e) {
    System.err.println("Error searching numbers: " + e.getMessage());
}
```

**Parameters:**
- `countryCode` (required): ISO 3166-1 alpha-2 country code (e.g., "US", "GB", "DE")
- `capability` (optional): Required capability - "SMS", "VOICE", "MMS", or "FAX"
- `type` (optional): Number type - "MOBILE", "LANDLINE", "TOLL_FREE", etc.

### Purchase a Number

Purchase an available phone number and configure it.

```java
try {
    // Create configuration for the number
    NumbersConfigurationRequest config = new NumbersConfigurationRequest()
        .callbackUrl("https://example.com/webhook")
        .applicationId("your-app-id")
        .label("Customer Support Line");
    
    // Create purchase request
    NumbersPurchaseRequest request = new NumbersPurchaseRequest()
        .phoneNumber("+12025551234")
        .configuration(config);
    
    // Purchase the number
    NumbersConfigurationResponse response = api.purchaseNumber(request).execute();
    
    System.out.println("Purchased: " + response.getPhoneNumber());
    System.out.println("Number ID: " + response.getNumberId());
    System.out.println("Status: " + response.getStatus());
} catch (ApiException e) {
    System.err.println("Error purchasing number: " + e.getMessage());
}
```

### Get All Numbers

Retrieve a paginated list of all owned phone numbers.

```java
try {
    NumbersPageResponse response = api.getNumbers()
        .page(0)
        .pageSize(20)
        .execute();
    
    System.out.println("Total Numbers: " + response.getTotalResults());
    
    for (NumbersConfigurationResponse number : response.getResults()) {
        System.out.println("Number: " + number.getPhoneNumber());
        System.out.println("  ID: " + number.getNumberId());
        System.out.println("  Type: " + number.getType());
        System.out.println("  Status: " + number.getStatus());
        System.out.println("  Callback URL: " + number.getCallbackUrl());
    }
} catch (ApiException e) {
    System.err.println("Error fetching numbers: " + e.getMessage());
}
```

**Parameters:**
- `page` (optional): Page number, default is 0
- `pageSize` (optional): Results per page, default is 20

### Get Number Configuration

Retrieve configuration details for a specific phone number.

```java
try {
    String numberId = "num-123456";
    NumbersConfigurationResponse response = api.getNumberConfiguration(numberId).execute();
    
    System.out.println("Phone Number: " + response.getPhoneNumber());
    System.out.println("Country Code: " + response.getCountryCode());
    System.out.println("Type: " + response.getType());
    System.out.println("Status: " + response.getStatus());
    System.out.println("Callback URL: " + response.getCallbackUrl());
    System.out.println("Application ID: " + response.getApplicationId());
    System.out.println("Label: " + response.getLabel());
    
    // Check capabilities
    NumbersConfigurationCapabilities caps = response.getCapabilities();
    System.out.println("SMS Enabled: " + caps.getSms());
    System.out.println("Voice Enabled: " + caps.getVoice());
    System.out.println("MMS Enabled: " + caps.getMms());
} catch (ApiException e) {
    System.err.println("Error fetching number configuration: " + e.getMessage());
}
```

### Update Number Configuration

Update the configuration for an existing phone number.

```java
try {
    String numberId = "num-123456";
    
    NumbersConfigurationRequest request = new NumbersConfigurationRequest()
        .callbackUrl("https://example.com/new-webhook")
        .applicationId("new-app-id")
        .entityId("entity-123")
        .label("Updated Label");
    
    NumbersConfigurationResponse response = api.updateNumberConfiguration(numberId, request).execute();
    
    System.out.println("Updated: " + response.getPhoneNumber());
    System.out.println("New Callback URL: " + response.getCallbackUrl());
    System.out.println("Updated At: " + response.getUpdatedAt());
} catch (ApiException e) {
    System.err.println("Error updating number configuration: " + e.getMessage());
}
```

### Release a Number

Release (delete) a phone number from your account.

```java
try {
    String numberId = "num-123456";
    api.releaseNumber(numberId).execute();
    
    System.out.println("Number successfully released");
} catch (ApiException e) {
    System.err.println("Error releasing number: " + e.getMessage());
}
```

**Warning:** This operation is permanent. Once a number is released, you will lose access to it and may not be able to reclaim it.

## Examples

### Complete Workflow: Search, Purchase, Configure, and Use

```java
import com.infobip.ApiClient;
import com.infobip.ApiException;
import com.infobip.ApiKey;
import com.infobip.BaseUrl;
import com.infobip.api.NumbersConfigurationApi;
import com.infobip.model.*;

public class NumbersWorkflowExample {
    
    public static void main(String[] args) {
        // Initialize API client
        ApiClient client = ApiClient.forApiKey(ApiKey.from("YOUR_API_KEY"))
            .withBaseUrl(BaseUrl.from("https://api.infobip.com"))
            .build();
        
        NumbersConfigurationApi api = new NumbersConfigurationApi(client);
        
        try {
            // Step 1: Search for available numbers
            System.out.println("Searching for available numbers...");
            NumbersSearchResponse searchResponse = api.searchAvailableNumbers("US")
                .capability("SMS")
                .execute();
            
            if (searchResponse.getNumbers().isEmpty()) {
                System.out.println("No available numbers found");
                return;
            }
            
            // Step 2: Select and purchase a number
            String selectedNumber = searchResponse.getNumbers().get(0).getPhoneNumber();
            System.out.println("Purchasing: " + selectedNumber);
            
            NumbersConfigurationRequest config = new NumbersConfigurationRequest()
                .callbackUrl("https://example.com/webhook")
                .applicationId("my-app-123")
                .label("Main Business Line");
            
            NumbersPurchaseRequest purchaseRequest = new NumbersPurchaseRequest()
                .phoneNumber(selectedNumber)
                .configuration(config);
            
            NumbersConfigurationResponse purchaseResponse = api.purchaseNumber(purchaseRequest).execute();
            String numberId = purchaseResponse.getNumberId();
            System.out.println("Number purchased successfully! ID: " + numberId);
            
            // Step 3: Verify configuration
            System.out.println("\nVerifying configuration...");
            NumbersConfigurationResponse getResponse = api.getNumberConfiguration(numberId).execute();
            System.out.println("Status: " + getResponse.getStatus());
            System.out.println("Callback URL: " + getResponse.getCallbackUrl());
            
            // Step 4: Update configuration if needed
            System.out.println("\nUpdating configuration...");
            NumbersConfigurationRequest updateConfig = new NumbersConfigurationRequest()
                .callbackUrl("https://example.com/new-webhook")
                .label("Updated Business Line");
            
            NumbersConfigurationResponse updateResponse = 
                api.updateNumberConfiguration(numberId, updateConfig).execute();
            System.out.println("Configuration updated successfully");
            System.out.println("New Callback URL: " + updateResponse.getCallbackUrl());
            
        } catch (ApiException e) {
            System.err.println("API Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
```

### Async Operations

All operations support asynchronous execution:

```java
import com.infobip.ApiCallback;
import com.infobip.ApiException;

// Async search
api.searchAvailableNumbers("US")
    .capability("SMS")
    .executeAsync(new ApiCallback<NumbersSearchResponse>() {
        @Override
        public void onSuccess(NumbersSearchResponse response) {
            System.out.println("Found " + response.getNumbers().size() + " numbers");
        }
        
        @Override
        public void onFailure(ApiException exception) {
            System.err.println("Error: " + exception.getMessage());
        }
        
        @Override
        public void onUploadProgress(long bytesWritten, long contentLength, boolean done) {
            // Not applicable for GET requests
        }
        
        @Override
        public void onDownloadProgress(long bytesRead, long contentLength, boolean done) {
            if (done) {
                System.out.println("Download complete");
            }
        }
    });
```

## Error Handling

The API throws `ApiException` for errors. Always wrap API calls in try-catch blocks:

```java
try {
    NumbersConfigurationResponse response = api.getNumberConfiguration(numberId).execute();
    // Process response
} catch (ApiException e) {
    System.err.println("Error Code: " + e.getResponseStatusCode());
    System.err.println("Error Message: " + e.getMessage());
    System.err.println("Error Body: " + e.getRawResponseBody());
    
    // Handle specific error codes
    switch (e.getResponseStatusCode()) {
        case 404:
            System.err.println("Number not found");
            break;
        case 400:
            System.err.println("Invalid request parameters");
            break;
        case 401:
            System.err.println("Authentication failed");
            break;
        case 403:
            System.err.println("Insufficient permissions");
            break;
        default:
            System.err.println("Unexpected error occurred");
    }
}
```

## Common Use Cases

### Setting up SMS-capable numbers for marketing campaigns

```java
NumbersSearchResponse response = api.searchAvailableNumbers("US")
    .capability("SMS")
    .type("TOLL_FREE")
    .execute();

for (NumbersAvailableNumber number : response.getNumbers()) {
    if (number.getCapabilities().getSms() && 
        Double.parseDouble(number.getMonthlyPrice()) < 5.0) {
        // Purchase affordable SMS-capable number
        // ...
    }
}
```

### Managing multiple numbers with labels

```java
// Purchase numbers with descriptive labels
String[] labels = {"Sales", "Support", "Marketing"};

for (String label : labels) {
    NumbersConfigurationRequest config = new NumbersConfigurationRequest()
        .label(label + " Department")
        .callbackUrl("https://example.com/webhook/" + label.toLowerCase());
    
    // Purchase and configure
    // ...
}

// Later, list all numbers and identify by label
NumbersPageResponse numbers = api.getNumbers().execute();
for (NumbersConfigurationResponse number : numbers.getResults()) {
    System.out.println(number.getLabel() + ": " + number.getPhoneNumber());
}
```

## Model Classes

### Key Enums

- **NumbersType**: `MOBILE`, `LANDLINE`, `TOLL_FREE`, `SHARED_SHORT_CODE`, `DEDICATED_SHORT_CODE`
- **NumbersStatus**: `AVAILABLE`, `PENDING`, `ACTIVE`, `SUSPENDED`, `RELEASED`
- **NumbersCapability**: `SMS`, `VOICE`, `MMS`, `FAX`

### Key Models

- **NumbersConfigurationRequest**: Configuration for creating/updating numbers
- **NumbersConfigurationResponse**: Complete number configuration details
- **NumbersPurchaseRequest**: Request to purchase a number
- **NumbersSearchRequest**: Search criteria for available numbers
- **NumbersSearchResponse**: List of available numbers
- **NumbersPageResponse**: Paginated list of owned numbers
- **NumbersAvailableNumber**: Details about an available number
- **NumbersConfigurationCapabilities**: Capability flags for a number

## Best Practices

1. **Always check availability** before attempting to purchase a number
2. **Use labels** to organize and identify numbers in your system
3. **Configure callback URLs** to receive delivery reports and inbound messages
4. **Handle errors gracefully** and implement retry logic for transient failures
5. **Use pagination** when fetching large lists of numbers
6. **Test with async operations** for better performance in production
7. **Release unused numbers** to avoid unnecessary charges

## Support

For additional help:
- [Infobip Developer Portal](https://www.infobip.com/docs)
- [API Reference Documentation](https://www.infobip.com/docs/api)
- Support: support@infobip.com

