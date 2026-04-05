package com.android.billingclient.api;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f12790a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f12791b;

    public /* synthetic */ w(Object obj, int i10) {
        this.f12791b = obj;
        this.f12790a = i10;
    }

    public static w a(String str) {
        if (str.length() == 0) {
            throw new NumberFormatException("empty string");
        }
        char cCharAt = str.charAt(0);
        int i10 = 16;
        if (str.startsWith("0x") || str.startsWith("0X")) {
            str = str.substring(2);
        } else if (cCharAt == '#') {
            str = str.substring(1);
        } else if (cCharAt != '0' || str.length() <= 1) {
            i10 = 10;
        } else {
            str = str.substring(1);
            i10 = 8;
        }
        return new w(str, i10);
    }
}
