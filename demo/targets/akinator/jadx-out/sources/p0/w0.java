package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w0 extends g3 {

    /* renamed from: b, reason: collision with root package name */
    public final x0 f80565b;

    public w0(kv.l lVar) {
        super(new i.f(12));
        this.f80565b = new x0(lVar);
    }

    @Override // p0.g3
    public h3 defaultProvidedValue$runtime(Object obj) {
        return new h3(this, obj, obj == null, null, null, null, true);
    }

    @Override // p0.l0
    public x0 getDefaultValueHolder$runtime() {
        return this.f80565b;
    }
}
