package bj;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum g0 implements Internal.EnumLite {
    UNKNOWN_DISMISS_TYPE(0),
    AUTO(1),
    CLICK(2),
    SWIPE(3);


    /* renamed from: h, reason: collision with root package name */
    public static final e0 f9636h = new e0();

    /* renamed from: b, reason: collision with root package name */
    public final int f9638b;

    g0(int i10) {
        this.f9638b = i10;
    }

    public static g0 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_DISMISS_TYPE;
        }
        if (i10 == 1) {
            return AUTO;
        }
        if (i10 == 2) {
            return CLICK;
        }
        if (i10 != 3) {
            return null;
        }
        return SWIPE;
    }

    public static Internal.EnumLiteMap<g0> internalGetValueMap() {
        return f9636h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return f0.f9630a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f9638b;
    }

    @Deprecated
    public static g0 valueOf(int i10) {
        return forNumber(i10);
    }
}
