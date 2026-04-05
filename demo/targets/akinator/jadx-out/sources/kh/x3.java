package kh;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum x3 implements Internal.EnumLite {
    UNSPECIFIED(0),
    INT64(1),
    BOOL(2),
    STRING(3),
    DOUBLE(4),
    UNRECOGNIZED(-1);


    /* renamed from: j, reason: collision with root package name */
    public static final v3 f71109j = new v3();

    /* renamed from: b, reason: collision with root package name */
    public final int f71111b;

    x3(int i10) {
        this.f71111b = i10;
    }

    public static x3 forNumber(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED;
        }
        if (i10 == 1) {
            return INT64;
        }
        if (i10 == 2) {
            return BOOL;
        }
        if (i10 == 3) {
            return STRING;
        }
        if (i10 != 4) {
            return null;
        }
        return DOUBLE;
    }

    public static Internal.EnumLiteMap<x3> internalGetValueMap() {
        return f71109j;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return w3.f71087a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f71111b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static x3 valueOf(int i10) {
        return forNumber(i10);
    }
}
