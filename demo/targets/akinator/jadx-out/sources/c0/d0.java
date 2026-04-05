package c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d0 implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f11430a;

    public d0(l0 floatDecaySpec) {
        kotlin.jvm.internal.e0.checkNotNullParameter(floatDecaySpec, "floatDecaySpec");
        this.f11430a = floatDecaySpec;
    }

    @Override // c0.c0
    public <V extends v> m3 vectorize(n2 typeConverter) {
        kotlin.jvm.internal.e0.checkNotNullParameter(typeConverter, "typeConverter");
        return new r3(this.f11430a);
    }
}
