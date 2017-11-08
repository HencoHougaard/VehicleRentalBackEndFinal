package com.VehicleRental.factories;

import com.VehicleRental.domain.*;

import java.math.BigDecimal;
import java.util.Date;

public class BillingFactory {
    public static Billing buildBilling(Date billingDate, BigDecimal amountOwed, BigDecimal amountPaid, BigDecimal amountOutstanding, Rental rental) {
        Billing billing = new Billing.Builder()
                .billingDate(billingDate)
                .amountOwed(amountOwed)
                .amountPaid(amountPaid)
                .amountOutstanding(amountOutstanding)
                .rental(rental)
                .build();
        return billing;
    }
}
