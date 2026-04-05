package cu;

import mt.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class n0 implements fu.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final tw.c[] f51036a;

    /* renamed from: b, reason: collision with root package name */
    public final tw.c[] f51037b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q0 f51038c;

    public n0(q0 q0Var, tw.c[] cVarArr, tw.c[] cVarArr2) {
        this.f51038c = q0Var;
        this.f51036a = cVarArr;
        this.f51037b = cVarArr2;
    }

    @Override // fu.b0
    public void onWorker(int i10, m0.a aVar) {
        this.f51038c.b(i10, this.f51036a, this.f51037b, aVar);
    }
}
