package bj;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum j0 implements Internal.EnumLite {
    UNKNOWN_EVENT_TYPE(0),
    IMPRESSION_EVENT_TYPE(1),
    CLICK_EVENT_TYPE(2);


    /* renamed from: g, reason: collision with root package name */
    public static final h0 f9644g = new h0();

    /* renamed from: b, reason: collision with root package name */
    public final int f9646b;

    j0(int i10) {
        this.f9646b = i10;
    }

    public static j0 forNumber(int i10) {
        if (i10 == 0) {
            return UNKNOWN_EVENT_TYPE;
        }
        if (i10 == 1) {
            return IMPRESSION_EVENT_TYPE;
        }
        if (i10 != 2) {
            return null;
        }
        return CLICK_EVENT_TYPE;
    }

    public static Internal.EnumLiteMap<j0> internalGetValueMap() {
        return f9644g;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return i0.f9640a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f9646b;
    }

    @Deprecated
    public static j0 valueOf(int i10) {
        return forNumber(i10);
    }
}
