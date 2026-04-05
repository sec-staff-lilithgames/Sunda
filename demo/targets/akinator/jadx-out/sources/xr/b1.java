package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class b1 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lt.b f92264c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92265e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ f1 f92266f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(f1 f1Var, lt.b bVar, wr.e4 e4Var) {
        super(f1Var.f92493c.f92679f);
        this.f92266f = f1Var;
        this.f92264c = bVar;
        this.f92265e = e4Var;
    }

    @Override // xr.c2
    public void runInContext() {
        f1 f1Var = this.f92266f;
        j1 j1Var = f1Var.f92493c;
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall$Listener.headersRead");
        try {
            lt.c.attachTag(j1Var.f92675b);
            lt.c.linkIn(this.f92264c);
            if (f1Var.f92492b == null) {
                try {
                    f1Var.f92491a.onHeaders(this.f92265e);
                } catch (Throwable th2) {
                    wr.m6 m6VarWithDescription = wr.m6.f91038f.withCause(th2).withDescription("Failed to read headers");
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
