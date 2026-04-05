package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ld extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lt.b f92774c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pd f92776f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld(pd pdVar, lt.b bVar, wr.m6 m6Var) {
        super(pdVar.f92905c);
        this.f92776f = pdVar;
        this.f92774c = bVar;
        this.f92775e = m6Var;
    }

    @Override // xr.c2
    public void runInContext() {
        pd pdVar = this.f92776f;
        lt.f fVarTraceTask = lt.c.traceTask("ServerCallListener(app).closed");
        try {
            lt.c.attachTag(pdVar.f92907e);
            lt.c.linkIn(this.f92774c);
            fe feVar = pdVar.f92908f;
            if (feVar == null) {
                throw new IllegalStateException("listener unset");
            }
            feVar.closed(this.f92775e);
            if (fVarTraceTask != null) {
                fVarTraceTask.close();
            }
        } catch (Throwable th2) {
            if (fVarTraceTask != null) {
                try {
                    fVarTraceTask.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }
}
