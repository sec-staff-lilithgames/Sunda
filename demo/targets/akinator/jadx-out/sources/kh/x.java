package kh;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum x implements Internal.EnumLite {
    PATH_TRANSLATION_UNSPECIFIED(0),
    CONSTANT_ADDRESS(1),
    APPEND_PATH_TO_ADDRESS(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final v f71092h = new v();

    /* renamed from: b, reason: collision with root package name */
    public final int f71094b;

    x(int i10) {
        this.f71094b = i10;
    }

    public static x forNumber(int i10) {
        if (i10 == 0) {
            return PATH_TRANSLATION_UNSPECIFIED;
        }
        if (i10 == 1) {
            return CONSTANT_ADDRESS;
        }
        if (i10 != 2) {
            return null;
        }
        return APPEND_PATH_TO_ADDRESS;
    }

    public static Internal.EnumLiteMap<x> internalGetValueMap() {
        return f71092h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return w.f71084a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f71094b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static x valueOf(int i10) {
        return forNumber(i10);
    }
}
