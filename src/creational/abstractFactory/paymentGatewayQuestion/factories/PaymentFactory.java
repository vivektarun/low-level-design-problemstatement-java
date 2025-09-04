package creational.abstractFactory.paymentGatewayQuestion.factories;

import creational.abstractFactory.paymentGatewayQuestion.products.paymentProcessor.Processor;
import creational.abstractFactory.paymentGatewayQuestion.products.refundProcessor.Refund;
import creational.abstractFactory.paymentGatewayQuestion.products.transactionVerifier.Verifier;

public interface PaymentFactory {
    Processor createPaymentProcessor();
    Refund createRefundProcessor();
    Verifier createTransactionVerifier();

    default void produceCompletePaymentGateway() {

    }
}
