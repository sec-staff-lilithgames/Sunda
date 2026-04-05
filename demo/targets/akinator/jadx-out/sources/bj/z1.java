package bj;

import com.google.protobuf.Internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public enum z1 implements Internal.EnumLite {
    UNSPECIFIED_RENDER_ERROR(0),
    IMAGE_FETCH_ERROR(1),
    IMAGE_DISPLAY_ERROR(2),
    IMAGE_UNSUPPORTED_FORMAT(3);


    /* renamed from: h, reason: collision with root package name */
    public static final x1 f9698h = new x1();

    /* renamed from: b, reason: collision with root package name */
    public final int f9700b;

    z1(int i10) {
        this.f9700b = i10;
    }

    public static z1 forNumber(int i10) {
        if (i10 == 0) {
            return UNSPECIFIED_RENDER_ERROR;
        }
        if (i10 == 1) {
            return IMAGE_FETCH_ERROR;
        }
        if (i10 == 2) {
            return IMAGE_DISPLAY_ERROR;
        }
        if (i10 != 3) {
            return null;
        }
        return IMAGE_UNSUPPORTED_FORMAT;
    }

    public static Internal.EnumLiteMap<z1> internalGetValueMap() {
        return f9698h;
    }

    public static Internal.EnumVerifier internalGetVerifier() {
        return y1.f9688a;
    }

    @Override // com.google.protobuf.Internal.EnumLite
    public final int getNumber() {
        return this.f9700b;
    }

    @Deprecated
    public static z1 valueOf(int i10) {
        return forNumber(i10);
    }
}
