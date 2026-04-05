package com.google.gson.internal.bind;

import com.google.gson.stream.JsonToken;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract /* synthetic */ class u0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f30032a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        f30032a = iArr;
        try {
            iArr[JsonToken.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f30032a[JsonToken.STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f30032a[JsonToken.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
