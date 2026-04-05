package vw;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class d5 implements c4 {

    /* renamed from: a, reason: collision with root package name */
    public final o f89749a;

    /* renamed from: b, reason: collision with root package name */
    public final s3 f89750b;

    public d5(l0 l0Var, xw.f fVar, i2 i2Var) {
        n nVar = new n(String.class);
        this.f89749a = new o(l0Var, fVar);
        this.f89750b = new s3(l0Var, nVar);
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar) throws Exception {
        a2 oVar = this.f89749a.getInstance(pVar);
        return oVar.isReference() ? oVar.getInstance() : read(pVar, oVar.getInstance());
    }

    @Override // vw.c4, vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        return true;
    }

    @Override // vw.c4, vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        yw.h0 parent = h0Var.getParent();
        Iterator it = ((Collection) obj).iterator();
        while (it.hasNext()) {
            this.f89750b.write(parent, it.next());
        }
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        Collection collection = (Collection) obj;
        Object obj2 = this.f89750b.read(pVar);
        if (obj2 != null) {
            collection.add(obj2);
        }
        return obj;
    }
}
