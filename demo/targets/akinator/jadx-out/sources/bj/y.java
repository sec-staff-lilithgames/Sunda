package bj;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum y implements Internal.EnumLite {
    UNKNOWN_TRIGGER(0),
    APP_LAUNCH(1),
    ON_FOREGROUND(2),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    public static final w f9685h = new w();

    /* renamed from: b, reason: collision with root package name */
    public final int f9687b;

    y(int i10) {
        this.f9687b = i10;
    }

    public static y forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_TRIGGER;
        }
        if (i10 == 1) {
            return APP_LAUNCH;
        }
        if (i10 != 2) {
            return null;
        }
        return ON_FOREGROUND;
    }

    public static Internal.EnumLiteMap<y> internalGetValueMap() {
        return f9685h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return x.f9680a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f9687b;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Deprecated
    public static y valueOf(int i10) {
        return forNumber(i10);
    }
}
