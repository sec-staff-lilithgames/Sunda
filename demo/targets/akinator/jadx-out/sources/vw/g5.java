package vw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class g5 {

    /* renamed from: a, reason: collision with root package name */
    public final l0 f89838a;

    /* renamed from: b, reason: collision with root package name */
    public final yw.t0 f89839b;

    public g5(l0 l0Var) {
        this.f89839b = l0Var.getStyle();
        this.f89838a = l0Var;
    }

    public final u a(Class cls) throws g4 {
        n nVar = new n(cls);
        if (cls != null) {
            return new u(this.f89838a, nVar);
        }
        throw new g4("Can not instantiate null class", new Object[0]);
    }

    public Object read(yw.p pVar, Class cls) throws Exception {
        Object obj = a(cls).read(pVar);
        if (obj == null) {
            return null;
        }
        Class<?> cls2 = obj.getClass();
        if (((yw.l) this.f89839b).getElement(this.f89838a.getName(cls2)) != null) {
            return obj;
        }
        throw new g4("Root annotation required for %s", cls2);
    }

    public boolean validate(yw.p pVar, Class cls) throws Exception {
        u uVarA = a(cls);
        if (((yw.l) this.f89839b).getElement(this.f89838a.getName(cls)) != null) {
            return uVarA.validate(pVar);
        }
        throw new g4("Root annotation required for %s", cls);
    }

    public void write(yw.h0 h0Var, Object obj) throws Exception {
        write(h0Var, obj, obj.getClass());
    }

    public void write(yw.h0 h0Var, Object obj, Class cls) throws Exception {
        Class<?> cls2 = obj.getClass();
        String element = ((yw.l) this.f89839b).getElement(this.f89838a.getName(cls2));
        if (element == null) {
            throw new g4("Root annotation required for %s", cls2);
        }
        write(h0Var, obj, cls, element);
    }

    public Object read(yw.p pVar, Object obj) throws Exception {
        Class<?> cls = obj.getClass();
        Object obj2 = a(cls).read(pVar, obj);
        if (((yw.l) this.f89839b).getElement(this.f89838a.getName(cls)) != null) {
            return obj2;
        }
        throw new g4("Root annotation required for %s", cls);
    }

    public void write(yw.h0 h0Var, Object obj, Class cls, String str) throws Exception {
        yw.h0 child = h0Var.getChild(str);
        n nVar = new n(cls);
        if (obj != null) {
            Class<?> cls2 = obj.getClass();
            l0 l0Var = this.f89838a;
            q0 decorator = l0Var.getDecorator(cls2);
            if (decorator != null) {
                decorator.decorate(child);
            }
            if (!l0Var.setOverride(nVar, obj, child)) {
                a(cls2).write(child, obj);
            }
        }
        child.commit();
    }
}
