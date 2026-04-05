package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class PurchaseHistoryResult {

    /* renamed from: a, reason: collision with root package name */
    public final BillingResult f12666a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12667b;

    public PurchaseHistoryResult(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        this.f12666a = billingResult;
        this.f12667b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PurchaseHistoryResult copy$default(PurchaseHistoryResult purchaseHistoryResult, BillingResult billingResult, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = purchaseHistoryResult.f12666a;
        }
        if ((i10 & 2) != 0) {
            list = purchaseHistoryResult.f12667b;
        }
        return purchaseHistoryResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.f12666a;
    }

    public final List<PurchaseHistoryRecord> component2() {
        return this.f12667b;
    }

    public final PurchaseHistoryResult copy(BillingResult billingResult, List<? extends PurchaseHistoryRecord> list) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        return new PurchaseHistoryResult(billingResult, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PurchaseHistoryResult)) {
            return false;
        }
        PurchaseHistoryResult purchaseHistoryResult = (PurchaseHistoryResult) obj;
        return e0.areEqual(this.f12666a, purchaseHistoryResult.f12666a) && e0.areEqual(this.f12667b, purchaseHistoryResult.f12667b);
    }

    public final BillingResult getBillingResult() {
        return this.f12666a;
    }

    public final List<PurchaseHistoryRecord> getPurchaseHistoryRecordList() {
        return this.f12667b;
    }

    public int hashCode() {
        int iHashCode = this.f12666a.hashCode() * 31;
        List list = this.f12667b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.f12666a + ", purchaseHistoryRecordList=" + this.f12667b + ")";
    }
}
