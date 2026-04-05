package br;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final x f9994a;

    /* renamed from: b, reason: collision with root package name */
    public final float f9995b;

    /* renamed from: c, reason: collision with root package name */
    public final float f9996c;

    public u(x type, float f10, float f11) {
        kotlin.jvm.internal.e0.checkNotNullParameter(type, "type");
        this.f9994a = type;
        this.f9995b = f10;
        this.f9996c = f11;
    }

    public final float getThreshold() {
        return this.f9995b;
    }

    public final x getType() {
        return this.f9994a;
    }

    public final float getWeight() {
        return this.f9996c;
    }
}
