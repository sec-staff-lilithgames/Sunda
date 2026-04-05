package io.bidmachine.iab.vast;

import io.bidmachine.iab.vast.activity.VastView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class o implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f60506b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ VastView f60507c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qm.b f60508e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ t f60509f;

    public o(t tVar, a0 a0Var, VastView vastView, qm.b bVar) {
        this.f60509f = tVar;
        this.f60506b = a0Var;
        this.f60507c = vastView;
        this.f60508e = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        a0 a0Var = this.f60506b;
        if (a0Var != null) {
            ((vm.a) a0Var).onShowFailed(this.f60507c, this.f60509f, this.f60508e);
        }
    }
}
