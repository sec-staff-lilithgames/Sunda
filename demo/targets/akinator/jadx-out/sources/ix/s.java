package ix;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum s implements Internal.EnumLite {
    UNKNOWN(0),
    UNRECOGNIZED(-1);


    /* renamed from: f, reason: collision with root package name */
    public static final q f68437f = new q();

    /* renamed from: b, reason: collision with root package name */
    public final int f68439b;

    s(int i10) {
        this.f68439b = i10;
    }

    public static s forNumber(int i10) {
        if (i10 != 0) {
            return null;
        }
        return UNKNOWN;
    }

    public static Internal.EnumLiteMap<s> internalGetValueMap() {
        return f68437f;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return r.f68434a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f68439b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static s valueOf(int i10) {
        return forNumber(i10);
    }
}
