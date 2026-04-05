package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class md extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lt.b f92804c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pd f92805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(pd pdVar, lt.b bVar) {
        super(pdVar.f92905c);
        this.f92805e = pdVar;
        this.f92804c = bVar;
    }

    @Override // xr.c2
    public void runInContext() {
        pd pdVar = this.f92805e;
        try {
            lt.f fVarTraceTask = lt.c.traceTask("ServerCallListener(app).halfClosed");
            try {
                lt.c.attachTag(pdVar.f92907e);
                lt.c.linkIn(this.f92804c);
                fe feVar = pdVar.f92908f;
                if (feVar == null) {
                    throw new IllegalStateException("listener unset");
                }
                feVar.halfClosed();
                if (fVarTraceTask != null) {
                    fVarTraceTask.close();
                }
            } finally {
            }
        } catch (Throwable th2) {
            pd.a(pdVar, th2);
            throw th2;
        }
    }
}
