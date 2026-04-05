package vw;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class w implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f90172a;

    /* renamed from: b, reason: collision with root package name */
    public final g5 f90173b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90174c;

    /* renamed from: d, reason: collision with root package name */
    public final xw.f f90175d;

    /* renamed from: e, reason: collision with root package name */
    public final xw.f f90176e;

    public w(l0 l0Var, xw.f fVar, xw.f fVar2, String str) {
        this.f90172a = new c(l0Var, fVar);
        this.f90173b = new g5(l0Var);
        this.f90174c = str;
        this.f90175d = fVar2;
        this.f90176e = fVar;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        a2 cVar = this.f90172a.getInstance(pVar);
        Object a2Var = cVar.getInstance();
        return !cVar.isReference() ? read(pVar, a2Var) : a2Var;
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        a2 cVar = this.f90172a.getInstance(pVar);
        if (cVar.isReference()) {
            return true;
        }
        cVar.setInstance(null);
        Class type = cVar.getType();
        while (true) {
            yw.p next = pVar.getNext();
            if (next == null) {
                return true;
            }
            if (!next.isEmpty()) {
                this.f90173b.validate(next, type);
            }
        }
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            this.f90173b.write(h0Var, Array.get(obj, i10), this.f90175d.getType(), this.f90174c);
        }
        h0Var.commit();
    }

    @Override // vw.n0
    public Object read(yw.p pVar, Object obj) throws Exception {
        int length = Array.getLength(obj);
        int i10 = 0;
        while (true) {
            yw.k0 position = pVar.getPosition();
            yw.p next = pVar.getNext();
            if (next == null) {
                return obj;
            }
            if (i10 < length) {
                Array.set(obj, i10, !next.isEmpty() ? this.f90173b.read(next, this.f90175d.getType()) : null);
                i10++;
            } else {
                throw new y0("Array length missing or incorrect for %s at %s", this.f90176e, position);
            }
        }
    }
}
