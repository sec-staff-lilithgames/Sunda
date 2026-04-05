package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class m0 implements a2 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f89982a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f89983b;

    /* renamed from: c, reason: collision with root package name */
    public final xw.g f89984c;

    public m0(l0 l0Var, xw.g gVar, Class cls) throws Exception {
        this.f89982a = l0Var;
        this.f89983b = cls;
        this.f89984c = gVar;
    }

    @Override // vw.a2
    public Object getInstance() throws Exception {
        xw.g gVar = this.f89984c;
        if (gVar.isReference()) {
            return gVar.getValue();
        }
        Object m0Var = getInstance(this.f89983b);
        if (m0Var != null) {
            setInstance(m0Var);
        }
        return m0Var;
    }

    @Override // vw.a2
    public Class getType() {
        return this.f89983b;
    }

    @Override // vw.a2
    public boolean isReference() {
        return this.f89984c.isReference();
    }

    @Override // vw.a2
    public Object setInstance(Object obj) throws Exception {
        xw.g gVar = this.f89984c;
        if (gVar != null) {
            gVar.setValue(obj);
        }
        return obj;
    }

    public Object getInstance(Class cls) throws Exception {
        return this.f89982a.getInstance(cls).getInstance();
    }
}
