package bj;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum u0 implements Internal.EnumLite {
    UNSPECIFIED_FETCH_ERROR(0),
    SERVER_ERROR(1),
    CLIENT_ERROR(2),
    NETWORK_ERROR(3);


    /* renamed from: h, reason: collision with root package name */
    public static final s0 f9668h = new s0();

    /* renamed from: b, reason: collision with root package name */
    public final int f9670b;

    u0(int i10) {
        this.f9670b = i10;
    }

    public static u0 forNumber(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED_FETCH_ERROR;
        }
        if (i10 == 1) {
            return SERVER_ERROR;
        }
        if (i10 == 2) {
            return CLIENT_ERROR;
        }
        if (i10 != 3) {
            return null;
        }
        return NETWORK_ERROR;
    }

    public static Internal.EnumLiteMap<u0> internalGetValueMap() {
        return f9668h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return t0.f9663a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f9670b;
    }

    @Deprecated
    public static u0 valueOf(int i10) {
        return forNumber(i10);
    }
}
