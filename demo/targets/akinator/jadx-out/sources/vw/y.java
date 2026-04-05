package vw;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y implements c4 {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f90230a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f90231b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f90232c;

    /* renamed from: d, reason: collision with root package name */
    public final yw.t0 f90233d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f90234e;

    public y(l0 l0Var, n1 n1Var, xw.f fVar) throws Exception {
        this.f90230a = new n2(l0Var, fVar);
        this.f90231b = n1Var.getValue(l0Var);
        this.f90232c = n1Var.getKey(l0Var);
        this.f90233d = l0Var.getStyle();
        this.f90234e = n1Var;
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar) throws Exception {
        Map map = (Map) this.f90230a.getInstance();
        if (map == null) {
            return null;
        }
        yw.p parent = pVar.getParent();
        String name = pVar.getName();
        while (pVar != null) {
            map.put(this.f90232c.read(pVar), this.f90231b.read(pVar));
            pVar = parent.getNext(name);
        }
        return map;
    }

    @Override // vw.c4, vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        yw.p parent = pVar.getParent();
        String name = pVar.getName();
        while (pVar != null) {
            if (!this.f90232c.validate(pVar) || !this.f90231b.validate(pVar)) {
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
        Map map = (Map) obj;
        if (!h0Var.isCommitted()) {
            h0Var.remove();
        }
        String element = ((yw.l) this.f90233d).getElement(this.f90234e.getEntry());
        for (Object obj2 : map.keySet()) {
            yw.h0 child = parent.getChild(element);
            Object obj3 = map.get(obj2);
            child.setMode(mode);
            this.f90232c.write(child, obj2);
            this.f90231b.write(child, obj3);
        }
    }

    @Override // vw.c4, vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        Map map = (Map) obj;
        if (map != null) {
            yw.p parent = pVar.getParent();
            String name = pVar.getName();
            while (pVar != null) {
                map.put(this.f90232c.read(pVar), this.f90231b.read(pVar));
                pVar = parent.getNext(name);
            }
            return map;
        }
        return read(pVar);
    }
}
