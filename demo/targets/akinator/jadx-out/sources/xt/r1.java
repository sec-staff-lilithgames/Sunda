package xt;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f93485b;

    /* renamed from: c, reason: collision with root package name */
    public final pt.b f93486c;

    /* renamed from: e, reason: collision with root package name */
    public final mt.f f93487e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t1 f93488f;

    public r1(t1 t1Var, AtomicBoolean atomicBoolean, pt.b bVar, mt.f fVar) {
        this.f93488f = t1Var;
        this.f93485b = atomicBoolean;
        this.f93486c = bVar;
        this.f93487e = fVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f93485b.compareAndSet(false, true)) {
            this.f93486c.clear();
            t1 t1Var = this.f93488f;
            mt.i iVar = t1Var.f93510g;
            if (iVar != null) {
                iVar.subscribe(new q1(this));
            } else {
                this.f93487e.onError(new TimeoutException(iu.m.timeoutMessage(t1Var.f93507c, t1Var.f93508e)));
            }
        }
    }
}
