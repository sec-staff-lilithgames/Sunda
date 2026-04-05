package vw;

import java.lang.reflect.Array;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class t3 implements n0 {

    /* renamed from: a, reason: collision with root package name */
    public final c f90103a;

    /* renamed from: b, reason: collision with root package name */
    public final s3 f90104b;

    /* renamed from: c, reason: collision with root package name */
    public final String f90105c;

    /* renamed from: d, reason: collision with root package name */
    public final xw.f f90106d;

    /* renamed from: e, reason: collision with root package name */
    public final xw.f f90107e;

    public t3(l0 l0Var, xw.f fVar, xw.f fVar2, String str) {
        this.f90103a = new c(l0Var, fVar);
        this.f90104b = new s3(l0Var, fVar2);
        this.f90105c = str;
        this.f90106d = fVar2;
        this.f90107e = fVar;
    }

    @Override // vw.n0
    public Object read(yw.p pVar) throws Exception {
        a2 cVar = this.f90103a.getInstance(pVar);
        Object a2Var = cVar.getInstance();
        return !cVar.isReference() ? read(pVar, a2Var) : a2Var;
    }

    @Override // vw.n0
    public boolean validate(yw.p pVar) throws Exception {
        a2 cVar = this.f90103a.getInstance(pVar);
        if (cVar.isReference()) {
            return true;
        }
        cVar.setInstance(null);
        cVar.getType();
        while (true) {
            yw.p next = pVar.getNext();
            if (next == null) {
                return true;
            }
            this.f90104b.validate(next);
        }
    }

    @Override // vw.n0
    public void write(yw.h0 h0Var, Object obj) throws Exception {
        int length = Array.getLength(obj);
        for (int i10 = 0; i10 < length; i10++) {
            yw.h0 child = h0Var.getChild(this.f90105c);
            if (child == null) {
                return;
            }
            Object obj2 = Array.get(obj, i10);
            if (obj2 != null && !this.f90103a.setOverride(this.f90106d, obj2, child)) {
                this.f90104b.write(child, obj2);
            }
        }
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
                Array.set(obj, i10, this.f90104b.read(next));
                i10++;
            } else {
                throw new y0("Array length missing or incorrect for %s at %s", this.f90107e, position);
            }
        }
    }
}
