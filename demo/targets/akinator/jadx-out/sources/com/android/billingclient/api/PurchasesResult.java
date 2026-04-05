package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class PurchasesResult {

    /* renamed from: a, reason: collision with root package name */
    public final BillingResult f12668a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12669b;

    public PurchasesResult(BillingResult billingResult, List<? extends Purchase> purchasesList) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        e0.checkNotNullParameter(purchasesList, "purchasesList");
        this.f12668a = billingResult;
        this.f12669b = purchasesList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchasesResult copy$default(PurchasesResult purchasesResult, BillingResult billingResult, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = purchasesResult.f12668a;
        }
        if ((i10 & 2) != 0) {
            list = purchasesResult.f12669b;
        }
        return purchasesResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.f12668a;
    }

    public final List<Purchase> component2() {
        return this.f12669b;
    }

    public final PurchasesResult copy(BillingResult billingResult, List<? extends Purchase> purchasesList) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        e0.checkNotNullParameter(purchasesList, "purchasesList");
        return new PurchasesResult(billingResult, purchasesList);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchasesResult)) {
            return false;
        }
        PurchasesResult purchasesResult = (PurchasesResult) obj;
        return e0.areEqual(this.f12668a, purchasesResult.f12668a) && e0.areEqual(this.f12669b, purchasesResult.f12669b);
    }

    public final BillingResult getBillingResult() {
        return this.f12668a;
    }

    public final List<Purchase> getPurchasesList() {
        return this.f12669b;
    }

    public int hashCode() {
        return this.f12669b.hashCode() + (this.f12668a.hashCode() * 31);
    }

    public String toString() {
        return "PurchasesResult(billingResult=" + this.f12668a + ", purchasesList=" + this.f12669b + ")";
    }
}
