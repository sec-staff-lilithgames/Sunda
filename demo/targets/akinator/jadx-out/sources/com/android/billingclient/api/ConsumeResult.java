package com.android.billingclient.api;

import j1.o2;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ConsumeResult {

    /* renamed from: a, reason: collision with root package name */
    public final BillingResult f12602a;

    /* renamed from: b, reason: collision with root package name */
    public final String f12603b;

    public ConsumeResult(BillingResult billingResult, String str) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        this.f12602a = billingResult;
        this.f12603b = str;
    }

    public static /* synthetic */ ConsumeResult copy$default(ConsumeResult consumeResult, BillingResult billingResult, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            billingResult = consumeResult.f12602a;
        }
        if ((i10 & 2) != 0) {
            str = consumeResult.f12603b;
        }
        return consumeResult.copy(billingResult, str);
    }

    public final BillingResult component1() {
        return this.f12602a;
    }

    public final String component2() {
        return this.f12603b;
    }

    public final ConsumeResult copy(BillingResult billingResult, String str) {
        e0.checkNotNullParameter(billingResult, "billingResult");
        return new ConsumeResult(billingResult, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConsumeResult)) {
            return false;
        }
        ConsumeResult consumeResult = (ConsumeResult) obj;
        return e0.areEqual(this.f12602a, consumeResult.f12602a) && e0.areEqual(this.f12603b, consumeResult.f12603b);
    }

    public final BillingResult getBillingResult() {
        return this.f12602a;
    }

    public final String getPurchaseToken() {
        return this.f12603b;
    }

    public int hashCode() {
        int iHashCode = this.f12602a.hashCode() * 31;
        String str = this.f12603b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConsumeResult(billingResult=");
        sb2.append(this.f12602a);
        sb2.append(", purchaseToken=");
        return o2.o(sb2, this.f12603b, ")");
    }
}
