package bj;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum q0 implements Internal.EnumLite {
    POLICY_UNSPECIFIED(0),
    DISCARD_OLDEST(1),
    IGNORE_NEWEST(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final o0 f9660h = new o0();

    /* renamed from: b, reason: collision with root package name */
    public final int f9662b;

    q0(int i10) {
        this.f9662b = i10;
    }

    public static q0 forNumber(int i10) {
        if (i10 == 0) {
            return POLICY_UNSPECIFIED;
        }
        if (i10 == 1) {
            return DISCARD_OLDEST;
        }
        if (i10 != 2) {
            return null;
        }
        return IGNORE_NEWEST;
    }

    public static Internal.EnumLiteMap<q0> internalGetValueMap() {
        return f9660h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return p0.f9648a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f9662b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static q0 valueOf(int i10) {
        return forNumber(i10);
    }
}
