package oc;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class e0 extends c1 {

    /* renamed from: f, reason: collision with root package name */
    public final cd.h f78839f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f78840g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f78841h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f78842i;

    public e0(Class cls, cd.h hVar, Object obj, Object obj2) {
        super(cls);
        this.f78839f = hVar;
        this.f78840g = obj;
        this.f78841h = obj2;
        this.f78842i = cls.isPrimitive();
    }

    @Override // jc.q
    public Object getEmptyValue(jc.k kVar) throws jc.r {
        return this.f78841h;
    }

    @Override // oc.c1, jc.q, mc.v
    public dd.a getNullAccessPattern() {
        return this.f78842i ? dd.a.f51983e : this.f78840g == null ? dd.a.f51981b : dd.a.f51982c;
    }

    @Override // jc.q, mc.v
    public final Object getNullValue(jc.k kVar) throws jc.r {
        if (this.f78842i && kVar.isEnabled(jc.l.FAIL_ON_NULL_FOR_PRIMITIVES)) {
            kVar.reportInputMismatch(this, "Cannot map `null` into type %s (set DeserializationConfig.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES to 'false' to allow)", dd.i.classNameOf(handledType()));
        }
        return this.f78840g;
    }

    @Override // oc.c1, jc.q
    public final cd.h logicalType() {
        return this.f78839f;
    }
}
