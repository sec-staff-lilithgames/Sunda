package xt;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class a2 extends mt.n0 {

    /* renamed from: b, reason: collision with root package name */
    public final mt.i f93371b;

    /* renamed from: c, reason: collision with root package name */
    public final Callable f93372c;

    /* renamed from: e, reason: collision with root package name */
    public final Object f93373e;

    public a2(mt.i iVar, Callable<Object> callable, Object obj) {
        this.f93371b = iVar;
        this.f93373e = obj;
        this.f93372c = callable;
    }

    @Override // mt.n0
    public final void subscribeActual(mt.q0 q0Var) {
        this.f93371b.subscribe(new z1(this, q0Var));
    }
}
