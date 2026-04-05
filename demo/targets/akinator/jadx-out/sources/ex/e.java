package ex;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public enum e implements Internal.EnumLite {
    UNKNOWN(0),
    UPDATE_APP_KEY_LIST(1),
    UNRECOGNIZED(-1);


    /* renamed from: g, reason: collision with root package name */
    public static final c f55185g = new c();

    /* renamed from: b, reason: collision with root package name */
    public final int f55187b;

    e(int i10) {
        this.f55187b = i10;
    }

    public static e forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN;
        }
        if (i10 != 1) {
            return null;
        }
        return UPDATE_APP_KEY_LIST;
    }

    public static Internal.EnumLiteMap<e> internalGetValueMap() {
        return f55185g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return d.f55181a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f55187b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static e valueOf(int i10) {
        return forNumber(i10);
    }
}
