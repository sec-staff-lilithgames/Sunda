package ad;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class r extends t {

    /* renamed from: b, reason: collision with root package name */
    public final Class f4293b;

    /* renamed from: c, reason: collision with root package name */
    public final jc.w f4294c;

    public r(t tVar, Class<?> cls, jc.w wVar) {
        super(tVar);
        this.f4293b = cls;
        this.f4294c = wVar;
    }

    @Override // ad.t
    public t newWith(Class<?> cls, jc.w wVar) {
        return new n(this, this.f4293b, this.f4294c, cls, wVar);
    }

    @Override // ad.t
    public jc.w serializerFor(Class<?> cls) {
        if (cls == this.f4293b) {
            return this.f4294c;
        }
        return null;
    }
}
