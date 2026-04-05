package kh;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public enum d0 implements Internal.EnumLite {
    CHANGE_TYPE_UNSPECIFIED(0),
    ADDED(1),
    REMOVED(2),
    MODIFIED(3),
    UNRECOGNIZED(-1);


    /* renamed from: i, reason: collision with root package name */
    public static final b0 f70996i = new b0();

    /* renamed from: b, reason: collision with root package name */
    public final int f70998b;

    d0(int i10) {
        this.f70998b = i10;
    }

    public static d0 forNumber(int i10) {
        if (i10 == 0) {
            return CHANGE_TYPE_UNSPECIFIED;
        }
        if (i10 == 1) {
            return ADDED;
        }
        if (i10 == 2) {
            return REMOVED;
        }
        if (i10 != 3) {
            return null;
        }
        return MODIFIED;
    }

    public static Internal.EnumLiteMap<d0> internalGetValueMap() {
        return f70996i;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return c0.f70987a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f70998b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static d0 valueOf(int i10) {
        return forNumber(i10);
    }
}
