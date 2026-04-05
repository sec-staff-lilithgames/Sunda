package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e1 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lt.b f92455c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f1 f92456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(f1 f1Var, lt.b bVar) {
        super(f1Var.f92493c.f92679f);
        this.f92456e = f1Var;
        this.f92455c = bVar;
    }

    @Override // xr.c2
    public void runInContext() {
        f1 f1Var = this.f92456e;
        j1 j1Var = f1Var.f92493c;
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall$Listener.onReady");
        try {
            lt.c.attachTag(j1Var.f92675b);
            lt.c.linkIn(this.f92455c);
            if (f1Var.f92492b == null) {
                try {
                    f1Var.f92491a.onReady();
                } catch (Throwable th2) {
                    wr.m6 m6VarWithDescription = wr.m6.f91038f.withCause(th2).withDescription("Failed to call onReady.");
                    f1Var.f92492b = m6VarWithDescription;
                    j1Var.f92683j.cancel(m6VarWithDescription);
                }
            }
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th3) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
