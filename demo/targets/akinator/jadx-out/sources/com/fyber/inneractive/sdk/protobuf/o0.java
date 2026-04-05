package com.fyber.inneractive.sdk.protobuf;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract /* synthetic */ class o0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f26448a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f26449b;

    static {
        int[] iArr = new int[JavaType.values().length];
        f26449b = iArr;
        try {
            iArr[JavaType.BYTE_STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f26449b[JavaType.MESSAGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f26449b[JavaType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[p0.values().length];
        f26448a = iArr2;
        try {
            iArr2[p0.MAP.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f26448a[p0.VECTOR.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f26448a[p0.SCALAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
