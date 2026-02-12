#UNTESTABLE

import org.junit.jupiter.api.Test;

class ExternalServiceUntestableTest {

    static class PaymentGatewayClient {
        String processPayment() {
            // Simulating a dependency that is not implemented or available
            throw new UnsupportedOperationException(
                "Payment gateway not configured for test environment"
            );
        }
    }

    @Test
    void shouldBeUntestableDueToMissingDependency() {
        PaymentGatewayClient client = new PaymentGatewayClient();

        // Test cannot proceed due to missing external dependency
        client.processPayment();
    }
}
