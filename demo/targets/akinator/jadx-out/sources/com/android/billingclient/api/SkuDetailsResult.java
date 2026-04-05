package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class SkuDetailsResult {

    /* renamed from: a, reason: collision with root package name */
    public final BillingResult f12686a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12687b;

    public SkuDetailsResult(BillingResult billingResult, List<? extends SkuDetails> list) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        this.f12686a = billingResult;
        this.f12687b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SkuDetailsResult copy$default(SkuDetailsResult skuDetailsResult, BillingResult billingResult, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = skuDetailsResult.f12686a;
        }
        if ((i10 & 2) != 0) {
            list = skuDetailsResult.f12687b;
        }
        return skuDetailsResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.f12686a;
    }

    public final List<SkuDetails> component2() {
        return this.f12687b;
    }

    public final SkuDetailsResult copy(BillingResult billingResult, List<? extends SkuDetails> list) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        return new SkuDetailsResult(billingResult, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SkuDetailsResult)) {
            return false;
        }
        SkuDetailsResult skuDetailsResult = (SkuDetailsResult) obj;
        return e0.areEqual(this.f12686a, skuDetailsResult.f12686a) && e0.areEqual(this.f12687b, skuDetailsResult.f12687b);
    }

    public final BillingResult getBillingResult() {
        return this.f12686a;
    }

    public final List<SkuDetails> getSkuDetailsList() {
        return this.f12687b;
    }

    public int hashCode() {
        int iHashCode = this.f12686a.hashCode() * 31;
        List list = this.f12687b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "SkuDetailsResult(billingResult=" + this.f12686a + ", skuDetailsList=" + this.f12687b + ")";
    }
}
