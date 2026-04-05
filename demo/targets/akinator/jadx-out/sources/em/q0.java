package em;

import io.bidmachine.protobuf.Waterfall;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class q0 implements x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r0 f54728a;

    public q0(r0 r0Var) {
        this.f54728a = r0Var;
    }

    @Override // em.x0, nm.c
    public void onCanceled() {
        this.f54728a.b("Request is canceled");
    }

    @Override // em.x0, nm.b
    public void onFail(pr.a aVar) {
        this.f54728a.b(aVar != null ? aVar.getMessage() : "Unknown");
    }

    @Override // em.x0, nm.b
    public void onSuccess(Waterfall.Configuration configuration) {
        r0 r0Var = this.f54728a;
        if (configuration == null) {
            r0Var.b("Configuration response is null");
            return;
        }
        nm.a.d(r0Var.f54731a, new p0(r0Var, 3));
        r0Var.c(configuration);
        if (r0Var.f54743m.get() || !configuration.getShouldBreak()) {
            r0Var.a();
            return;
        }
        nm.a.d(r0Var.f54731a, new p0(r0Var, 2));
        r0Var.f54752v = null;
        r0Var.f54741k.set(false);
    }
}
