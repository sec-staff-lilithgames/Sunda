package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class i {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f29996a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f29996a = iArr;
        try {
            iArr[JsonToken.NAME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f29996a[JsonToken.END_ARRAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f29996a[JsonToken.END_OBJECT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f29996a[JsonToken.END_DOCUMENT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
