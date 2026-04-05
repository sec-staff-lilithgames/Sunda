package kh;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum r2 implements Internal.EnumLite {
    VALUE_TYPE_UNSPECIFIED(0),
    BOOL(1),
    INT64(2),
    DOUBLE(3),
    STRING(4),
    DISTRIBUTION(5),
    MONEY(6),
    UNRECOGNIZED(-1);


    /* renamed from: l, reason: collision with root package name */
    public static final p2 f71068l = new p2();

    /* renamed from: b, reason: collision with root package name */
    public final int f71070b;

    r2(int i10) {
        this.f71070b = i10;
    }

    public static r2 forNumber(int i10) {
        switch (i10) {
            case 0:
                return VALUE_TYPE_UNSPECIFIED;
            case 1:
                return BOOL;
            case 2:
                return INT64;
            case 3:
                return DOUBLE;
            case 4:
                return STRING;
            case 5:
                return DISTRIBUTION;
            case 6:
                return MONEY;
            default:
                return null;
        }
    }

    public static Internal.EnumLiteMap<r2> internalGetValueMap() {
        return f71068l;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return q2.f71053a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f71070b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static r2 valueOf(int i10) {
        return forNumber(i10);
    }
}
