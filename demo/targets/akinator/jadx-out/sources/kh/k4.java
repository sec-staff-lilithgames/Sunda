package kh;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum k4 implements Internal.EnumLite {
    HISTORY_UNSPECIFIED(0),
    ORIGINALLY_SINGLE_PATTERN(1),
    FUTURE_MULTI_PATTERN(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final i4 f71023h = new i4();

    /* renamed from: b, reason: collision with root package name */
    public final int f71025b;

    k4(int i10) {
        this.f71025b = i10;
    }

    public static k4 forNumber(int i10) {
        if (i10 == 0) {
            return HISTORY_UNSPECIFIED;
        }
        if (i10 == 1) {
            return ORIGINALLY_SINGLE_PATTERN;
        }
        if (i10 != 2) {
            return null;
        }
        return FUTURE_MULTI_PATTERN;
    }

    public static Internal.EnumLiteMap<k4> internalGetValueMap() {
        return f71023h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return j4.f71015a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f71025b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static k4 valueOf(int i10) {
        return forNumber(i10);
    }
}
