package com.android.billingclient.api;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class ExternalOfferReportingDetails {

    /* renamed from: a, reason: collision with root package name */
    public final String f12608a;

    public ExternalOfferReportingDetails(String str) {
        this.f12608a = new JSONObject(str).optString("externalTransactionToken");
    }

    public String getExternalTransactionToken() {
        return this.f12608a;
    }
}
