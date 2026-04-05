package com.ironsource;

import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class Hd {

    /* renamed from: a, reason: collision with root package name */
    private final String f34622a;

    /* renamed from: b, reason: collision with root package name */
    private final Integer f34623b;

    public Hd(JSONObject features, String nameKey, String amountKey) {
        kotlin.jvm.internal.e0.checkNotNullParameter(features, "features");
        kotlin.jvm.internal.e0.checkNotNullParameter(nameKey, "nameKey");
        kotlin.jvm.internal.e0.checkNotNullParameter(amountKey, "amountKey");
        this.f34622a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.f34623b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    public final Integer a() {
        return this.f34623b;
    }

    public final String b() {
        return this.f34622a;
    }
}
