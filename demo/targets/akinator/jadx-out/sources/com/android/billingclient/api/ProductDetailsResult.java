package com.android.billingclient.api;

import java.util.List;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ProductDetailsResult {

    /* renamed from: a, reason: collision with root package name */
    public final BillingResult f12648a;

    /* renamed from: b, reason: collision with root package name */
    public final List f12649b;

    public ProductDetailsResult(BillingResult billingResult, List<ProductDetails> list) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        this.f12648a = billingResult;
        this.f12649b = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ProductDetailsResult copy$default(ProductDetailsResult productDetailsResult, BillingResult billingResult, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = productDetailsResult.f12648a;
        }
        if ((i10 & 2) != 0) {
            list = productDetailsResult.f12649b;
        }
        return productDetailsResult.copy(billingResult, list);
    }

    public final BillingResult component1() {
        return this.f12648a;
    }

    public final List<ProductDetails> component2() {
        return this.f12649b;
    }

    public final ProductDetailsResult copy(BillingResult billingResult, List<ProductDetails> list) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        return new ProductDetailsResult(billingResult, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsResult)) {
            return false;
        }
        ProductDetailsResult productDetailsResult = (ProductDetailsResult) obj;
        return e0.areEqual(this.f12648a, productDetailsResult.f12648a) && e0.areEqual(this.f12649b, productDetailsResult.f12649b);
    }

    public final BillingResult getBillingResult() {
        return this.f12648a;
    }

    public final List<ProductDetails> getProductDetailsList() {
        return this.f12649b;
    }

    public int hashCode() {
        int iHashCode = this.f12648a.hashCode() * 31;
        List list = this.f12649b;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ProductDetailsResult(billingResult=" + this.f12648a + ", productDetailsList=" + this.f12649b + ")";
    }
}
