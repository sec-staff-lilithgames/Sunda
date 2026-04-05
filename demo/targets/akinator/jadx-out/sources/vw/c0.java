package vw;

import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class c0 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final n2 f89715a;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f89716b;

    /* renamed from: c, reason: collision with root package name */
    public final n0 f89717c;

    /* renamed from: d, reason: collision with root package name */
    public final yw.t0 f89718d;

    /* renamed from: e, reason: collision with root package name */
    public final n1 f89719e;

    public c0(l0 l0Var, n1 n1Var, xw.f fVar) throws Exception {
        this.f89715a = new n2(l0Var, fVar);
        this.f89716b = n1Var.getValue(l0Var);
        this.f89717c = n1Var.getKey(l0Var);
        this.f89718d = l0Var.getStyle();
        this.f89719e = n1Var;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        a2 n2Var = this.f89715a.getInstance(pVar);
        Object a2Var = n2Var.getInstance();
        if (n2Var.isReference()) {
            return a2Var;
        }
        Map map = (Map) a2Var;
        while (true) {
            yw.p next = pVar.getNext();
            if (next == null) {
                return map;
            }
            map.put(this.f89717c.read(next), this.f89716b.read(next));
        }
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        yw.p next;
        a2 n2Var = this.f89715a.getInstance(pVar);
        if (n2Var.isReference()) {
            return true;
        }
        n2Var.setInstance(null);
        n2Var.getType();
        do {
            next = pVar.getNext();
            if (next == null) {
                return true;
            }
            if (!this.f89717c.validate(next)) {
                return false;
            }
        } while (this.f89716b.validate(next));
        return false;
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        Map map = (Map) obj;
        for (Object obj2 : map.keySet()) {
            yw.h0 child = h0Var.getChild(((yw.l) this.f89718d).getElement(this.f89719e.getEntry()));
            Object obj3 = map.get(obj2);
            this.f89717c.write(child, obj2);
            this.f89716b.write(child, obj3);
        }
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        a2 n2Var = this.f89715a.getInstance(pVar);
        if (n2Var.isReference()) {
            return n2Var.getInstance();
        }
        n2Var.setInstance(obj);
        if (obj == null) {
            return obj;
        }
        Map map = (Map) obj;
        while (true) {
            yw.p next = pVar.getNext();
            if (next == null) {
                return map;
            }
            map.put(this.f89717c.read(next), this.f89716b.read(next));
        }
    }
}
