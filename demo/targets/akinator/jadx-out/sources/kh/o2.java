package kh;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum o2 implements Internal.EnumLite {
    METRIC_KIND_UNSPECIFIED(0),
    GAUGE(1),
    DELTA(2),
    CUMULATIVE(3),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    public static final m2 f71046i = new m2();

    /* renamed from: b, reason: collision with root package name */
    public final int f71048b;

    o2(int i10) {
        this.f71048b = i10;
    }

    public static o2 forNumber(int i10) {
        if (i10 == 0) {
            return METRIC_KIND_UNSPECIFIED;
        }
        if (i10 == 1) {
            return GAUGE;
        }
        if (i10 == 2) {
            return DELTA;
        }
        if (i10 != 3) {
            return null;
        }
        return CUMULATIVE;
    }

    public static Internal.EnumLiteMap<o2> internalGetValueMap() {
        return f71046i;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return n2.f71039a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f71048b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static o2 valueOf(int i10) {
        return forNumber(i10);
    }
}
