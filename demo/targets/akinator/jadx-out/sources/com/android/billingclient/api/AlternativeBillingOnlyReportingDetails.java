package com.android.billingclient.api;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class AlternativeBillingOnlyReportingDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f12564a;

    public AlternativeBillingOnlyReportingDetails(String str) {
        this.f12564a = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.f12564a;
    }
}
