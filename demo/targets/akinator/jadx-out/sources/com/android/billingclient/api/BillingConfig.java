package com.android.billingclient.api;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class BillingConfig {

    /* renamed from: a, reason: collision with root package name */
    public final String f12571a;

    public BillingConfig(String str) {
        this.f12571a = new JSONObject(str).optString("countryCode");
    }

    public String getCountryCode() {
        return this.f12571a;
    }
}
