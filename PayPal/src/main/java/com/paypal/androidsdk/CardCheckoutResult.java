package com.paypal.androidsdk;

import android.net.Uri;

public class CardCheckoutResult implements CheckoutResult {

    private String orderId;

    public static CardCheckoutResult newInstance(String orderId) {
        // TODO: implement
        return new CardCheckoutResult();
    }

    public static CardCheckoutResult from(Uri uri) {
        // TODO: implement
        return new CardCheckoutResult();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
