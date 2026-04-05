package vw;

import java.util.Collection;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class x3 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final o f90221a;

    /* renamed from: b, reason: collision with root package name */
    public final s3 f90222b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90223c;

    /* renamed from: d, reason: collision with root package name */
    public final xw.f f90224d;

    public x3(l0 l0Var, xw.f fVar, xw.f fVar2, String str) {
        this.f90221a = new o(l0Var, fVar);
        this.f90222b = new s3(l0Var, fVar2);
        this.f90223c = str;
        this.f90224d = fVar2;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        a2 oVar = this.f90221a.getInstance(pVar);
        Object a2Var = oVar.getInstance();
        if (oVar.isReference()) {
            return a2Var;
        }
        Collection collection = (Collection) a2Var;
        while (true) {
            yw.p next = pVar.getNext();
            if (next == null) {
                return collection;
            }
            collection.add(this.f90222b.read(next));
        }
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        a2 oVar = this.f90221a.getInstance(pVar);
        if (oVar.isReference()) {
            return true;
        }
        oVar.setInstance(null);
        oVar.getType();
        while (true) {
            yw.p next = pVar.getNext();
            if (next == null) {
                return true;
            }
            this.f90222b.validate(next);
        }
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        for (Object obj2 : (Collection) obj) {
            if (obj2 != null) {
                yw.h0 child = h0Var.getChild(this.f90223c);
                if (!this.f90221a.setOverride(this.f90224d, obj2, child)) {
                    this.f90222b.write(child, obj2);
                }
            }
        }
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        a2 oVar = this.f90221a.getInstance(pVar);
        if (oVar.isReference()) {
            return oVar.getInstance();
        }
        oVar.setInstance(obj);
        if (obj == null) {
            return obj;
        }
        Collection collection = (Collection) obj;
        while (true) {
            yw.p next = pVar.getNext();
            if (next == null) {
                return collection;
            }
            collection.add(this.f90222b.read(next));
        }
    }
}
