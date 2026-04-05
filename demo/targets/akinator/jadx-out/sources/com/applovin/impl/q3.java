package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.mediation.MaxAdFormat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class q3 {

    /* renamed from: a, reason: collision with root package name */
    private a f15122a;

    /* renamed from: b, reason: collision with root package name */
    private String f15123b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        AD_UNIT_ID,
        AD_FORMAT,
        AD
    }

    public q3(a aVar, String str) {
        this.f15122a = aVar;
        this.f15123b = str;
    }

    public a a() {
        return this.f15122a;
    }

    public String b() {
        return this.f15123b;
    }

    public static q3 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new q3(a.AD_UNIT_ID, str);
    }

    public static q3 a(MaxAdFormat maxAdFormat) {
        String label = maxAdFormat.getLabel();
        if (TextUtils.isEmpty(label)) {
            return null;
        }
        return new q3(a.AD_FORMAT, label);
    }

    public static q3 a(v2 v2Var) {
        String strP = v2Var.P();
        MaxAdFormat format = v2Var.getFormat();
        if (TextUtils.isEmpty(strP) || format == null) {
            return null;
        }
        return new n3(new g3(strP, format));
    }
}
