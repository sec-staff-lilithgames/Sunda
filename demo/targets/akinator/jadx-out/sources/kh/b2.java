package kh;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum b2 implements Internal.EnumLite {
    LAUNCH_STAGE_UNSPECIFIED(0),
    EARLY_ACCESS(1),
    ALPHA(2),
    BETA(3),
    GA(4),
    DEPRECATED(5),
    UNRECOGNIZED(-1);


    /* renamed from: k, reason: collision with root package name */
    public static final z1 f70982k = new z1();

    /* renamed from: b, reason: collision with root package name */
    public final int f70984b;

    b2(int i10) {
        this.f70984b = i10;
    }

    public static b2 forNumber(int i10) {
        if (i10 == 0) {
            return LAUNCH_STAGE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return EARLY_ACCESS;
        }
        if (i10 == 2) {
            return ALPHA;
        }
        if (i10 == 3) {
            return BETA;
        }
        if (i10 == 4) {
            return GA;
        }
        if (i10 != 5) {
            return null;
        }
        return DEPRECATED;
    }

    public static Internal.EnumLiteMap<b2> internalGetValueMap() {
        return f70982k;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return a2.f70973a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f70984b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static b2 valueOf(int i10) {
        return forNumber(i10);
    }
}
