package com.gateway.gateway.modules.pagseguro.Domain.Enum;

public enum StatusPayment {
    PENDING("Pendente"),
    APROVED("Aprovado"),
    DENIED("Cancelado"),
    UNPAID("Não pago");

    private final String statusPayment;

    private StatusPayment(String statusPayment) {
        this.statusPayment = statusPayment;
    }

    public String StatusPaymentString() {
        return statusPayment;
    }
}
