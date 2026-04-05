package vw;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class v3 implements c4 {

    /* renamed from: a, reason: collision with root package name */
    public final o f90159a;

    /* renamed from: b, reason: collision with root package name */
    public final s3 f90160b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90161c;

    /* renamed from: d, reason: collision with root package name */
    public final xw.f f90162d;

    public v3(l0 l0Var, xw.f fVar, xw.f fVar2, String str) {
        this.f90159a = new o(l0Var, fVar);
        this.f90160b = new s3(l0Var, fVar2);
        this.f90161c = str;
        this.f90162d = fVar2;
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar) throws Exception {
        Collection collection = (Collection) this.f90159a.getInstance();
        if (collection == null) {
            return null;
        }
        yw.p parent = pVar.getParent();
        String name = pVar.getName();
        while (pVar != null) {
            Object obj = this.f90160b.read(pVar);
            if (obj != null) {
                collection.add(obj);
            }
            pVar = parent.getNext(name);
        }
        return collection;
    }

    @Override // vw.c4, vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        yw.p parent = pVar.getParent();
        String name = pVar.getName();
        while (pVar != null) {
            if (!this.f90160b.validate(pVar)) {
                return false;
            }
            pVar = parent.getNext(name);
        }
        return true;
    }

    @Override // vw.c4, vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        yw.h0 parent = h0Var.getParent();
        yw.t mode = h0Var.getMode();
        if (!h0Var.isCommitted()) {
            h0Var.remove();
        }
        for (Object obj2 : (Collection) obj) {
            if (obj2 != null) {
                yw.h0 child = parent.getChild(this.f90161c);
                if (!this.f90159a.setOverride(this.f90162d, obj2, child)) {
                    child.setMode(mode);
                    this.f90160b.write(child, obj2);
                }
            }
        }
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        Collection collection = (Collection) obj;
        if (collection != null) {
            yw.p parent = pVar.getParent();
            String name = pVar.getName();
            while (pVar != null) {
                Object obj2 = this.f90160b.read(pVar);
                if (obj2 != null) {
                    collection.add(obj2);
                }
                pVar = parent.getNext(name);
            }
            return collection;
        }
        return read(pVar);
    }
}
