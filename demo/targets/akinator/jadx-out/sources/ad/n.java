package ad;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class n extends t {

    /* renamed from: b, reason: collision with root package name */
    public final Class f4284b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f4285c;

    /* renamed from: d, reason: collision with root package name */
    public final jc.w f4286d;

    /* renamed from: e, reason: collision with root package name */
    public final jc.w f4287e;

    public n(t tVar, Class<?> cls, jc.w wVar, Class<?> cls2, jc.w wVar2) {
        super(tVar);
        this.f4284b = cls;
        this.f4286d = wVar;
        this.f4285c = cls2;
        this.f4287e = wVar2;
    }

    @Override // ad.t
    public t newWith(Class<?> cls, jc.w wVar) {
        return new p(this, new s[]{new s(this.f4284b, this.f4286d), new s(this.f4285c, this.f4287e), new s(cls, wVar)});
    }

    @Override // ad.t
    public jc.w serializerFor(Class<?> cls) {
        if (cls == this.f4284b) {
            return this.f4286d;
        }
        if (cls == this.f4285c) {
            return this.f4287e;
        }
        return null;
    }
}
