package kh;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum x1 implements Internal.EnumLite {
    STRING(0),
    BOOL(1),
    INT64(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final v1 f71099h = new v1();

    /* renamed from: b, reason: collision with root package name */
    public final int f71101b;

    x1(int i10) {
        this.f71101b = i10;
    }

    public static x1 forNumber(int i10) {
        if (i10 == 0) {
            return STRING;
        }
        if (i10 == 1) {
            return BOOL;
        }
        if (i10 != 2) {
            return null;
        }
        return INT64;
    }

    public static Internal.EnumLiteMap<x1> internalGetValueMap() {
        return f71099h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return w1.f71086a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f71101b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static x1 valueOf(int i10) {
        return forNumber(i10);
    }
}
