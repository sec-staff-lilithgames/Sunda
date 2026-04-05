package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f24065a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f24067c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f24068d;

    public a(String str, String str2, String str3) {
        String strTrim = str != null ? str.trim() : null;
        this.f24065a = strTrim;
        String strTrim2 = str2 != null ? str2.trim() : null;
        this.f24066b = strTrim2;
        String strTrim3 = str3 != null ? str3.trim() : null;
        this.f24067c = strTrim3;
        this.f24068d = (TextUtils.isEmpty(strTrim) || TextUtils.isEmpty(strTrim2) || TextUtils.isEmpty(strTrim3) || !strTrim3.contains("[TIME]")) ? false : true;
    }
}
