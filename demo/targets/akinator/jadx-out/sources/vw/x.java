package vw;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class x implements c4 {

    /* renamed from: a, reason: collision with root package name */
    public final o f90202a;

    /* renamed from: b, reason: collision with root package name */
    public final g5 f90203b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90204c;

    /* renamed from: d, reason: collision with root package name */
    public final xw.f f90205d;

    /* renamed from: e, reason: collision with root package name */
    public final xw.f f90206e;

    public x(l0 l0Var, xw.f fVar, xw.f fVar2, String str) {
        this.f90202a = new o(l0Var, fVar);
        this.f90203b = new g5(l0Var);
        this.f90205d = fVar2;
        this.f90206e = fVar;
        this.f90204c = str;
    }

    public final void a(yw.p pVar, Collection collection) throws Exception {
        yw.p parent = pVar.getParent();
        String name = pVar.getName();
        while (pVar != null) {
            xw.f fVar = this.f90205d;
            Object obj = this.f90203b.read(pVar, fVar.getType());
            Class<?> cls = obj.getClass();
            if (!fVar.getType().isAssignableFrom(cls)) {
                throw new p3("Entry %s does not match %s for %s", cls, fVar, this.f90206e);
            }
            collection.add(obj);
            pVar = parent.getNext(name);
        }
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar) throws Exception {
        Collection collection = (Collection) this.f90202a.getInstance();
        if (collection == null) {
            return null;
        }
        a(pVar, collection);
        return collection;
    }

    @Override // vw.c4, vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        yw.p parent = pVar.getParent();
        Class type = this.f90205d.getType();
        String name = pVar.getName();
        while (pVar != null) {
            if (!this.f90203b.validate(pVar, type)) {
                return false;
            }
            pVar = parent.getNext(name);
        }
        return true;
    }

    @Override // vw.c4, vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        Collection collection = (Collection) obj;
        yw.h0 parent = h0Var.getParent();
        if (!h0Var.isCommitted()) {
            h0Var.remove();
        }
        write(parent, collection);
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        Collection collection = (Collection) obj;
        if (collection != null) {
            a(pVar, collection);
            return collection;
        }
        return read(pVar);
    }

    public void write(yw.h0 h0Var, Collection collection) throws Exception {
        for (Object obj : collection) {
            if (obj != null) {
                Class type = this.f90205d.getType();
                Class<?> cls = obj.getClass();
                if (type.isAssignableFrom(cls)) {
                    this.f90203b.write(h0Var, obj, type, this.f90204c);
                } else {
                    throw new p3("Entry %s does not match %s for %s", cls, type, this.f90206e);
                }
            }
        }
    }
}
