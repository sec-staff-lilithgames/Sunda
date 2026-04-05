package xt;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class w0 extends mt.c {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i[] f93528b;

    public w0(mt.i[] iVarArr) {
        this.f93528b = iVarArr;
    }

    @Override // mt.c
    public void subscribeActual(mt.f fVar) {
        pt.b bVar = new pt.b();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        mt.i[] iVarArr = this.f93528b;
        v0 v0Var = new v0(fVar, atomicBoolean, bVar, iVarArr.length + 1);
        fVar.onSubscribe(bVar);
        for (mt.i iVar : iVarArr) {
            if (bVar.isDisposed()) {
                return;
            }
            if (iVar == null) {
                bVar.dispose();
                v0Var.onError(new NullPointerException("A completable source is null"));
                return;
            }
            iVar.subscribe(v0Var);
        }
        v0Var.onComplete();
    }
}
