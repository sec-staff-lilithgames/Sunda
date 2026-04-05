package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C3384p {

    /* renamed from: a, reason: collision with root package name */
    private final Boolean f38052a;

    public C3384p(JSONObject adFormatAuctionSettings) {
        kotlin.jvm.internal.e0.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f38052a = adFormatAuctionSettings.has(C3401q.f38197a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(C3401q.f38197a)) : null;
    }

    public final Boolean a() {
        return this.f38052a;
    }
}
