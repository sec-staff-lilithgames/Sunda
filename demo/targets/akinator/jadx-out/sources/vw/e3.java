package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e3 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f89778a;

    /* renamed from: b, reason: collision with root package name */
    public final xw.g f89779b;

    /* renamed from: c, reason: collision with root package name */
    public final Class f89780c;

    public e3(l0 l0Var, xw.g gVar) {
        this.f89780c = gVar.getType();
        this.f89778a = l0Var;
        this.f89779b = gVar;
    }

    @Override // vw.a2
    public Object getInstance() throws Exception {
        xw.g gVar = this.f89779b;
        if (gVar.isReference()) {
            return gVar.getValue();
        }
        Object e3Var = getInstance(this.f89780c);
        if (gVar != null) {
            gVar.setValue(e3Var);
        }
        return e3Var;
    }

    @Override // vw.a2
    public Class getType() {
        return this.f89780c;
    }

    @Override // vw.a2
    public boolean isReference() {
        return this.f89779b.isReference();
    }

    @Override // vw.a2
    public Object setInstance(Object obj) {
        xw.g gVar = this.f89779b;
        if (gVar != null) {
            gVar.setValue(obj);
        }
        return obj;
    }

    public Object getInstance(Class cls) throws Exception {
        return this.f89778a.getInstance(cls).getInstance();
    }
}
