package cu;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q0 extends lu.b {

    /* renamed from: a, reason: collision with root package name */
    public final lu.b f51050a;

    /* renamed from: b, reason: collision with root package name */
    public final mt.m0 f51051b;

    /* renamed from: c, reason: collision with root package name */
    public final int f51052c;

    public q0(lu.b bVar, mt.m0 m0Var, int i10) {
        this.f51050a = bVar;
        this.f51051b = m0Var;
        this.f51052c = i10;
    }

    public final void b(int i10, tw.c[] cVarArr, tw.c[] cVarArr2, m0.a aVar) {
        tw.c cVar = cVarArr[i10];
        int i11 = this.f51052c;
        eu.c cVar2 = new eu.c(i11);
        if (cVar instanceof vt.a) {
            cVarArr2[i10] = new o0((vt.a) cVar, i11, cVar2, aVar);
        } else {
            cVarArr2[i10] = new p0(cVar, i11, cVar2, aVar);
        }
    }

    @Override // lu.b
    public int parallelism() {
        return this.f51050a.parallelism();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lu.b
    public void subscribe(tw.c[] cVarArr) {
        if (a(cVarArr)) {
            int length = cVarArr.length;
            tw.c[] cVarArr2 = new tw.c[length];
            mt.m0 m0Var = this.f51051b;
            if (m0Var instanceof fu.c0) {
                ((fu.c0) m0Var).createWorkers(length, new n0(this, cVarArr, cVarArr2));
            } else {
                for (int i10 = 0; i10 < length; i10++) {
                    b(i10, cVarArr, cVarArr2, m0Var.createWorker());
                }
            }
            this.f51050a.subscribe(cVarArr2);
        }
    }
}
