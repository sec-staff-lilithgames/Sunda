package xr;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class nd extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lt.b f92828c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ve f92829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pd f92830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd(pd pdVar, lt.b bVar, ve veVar) {
        super(pdVar.f92905c);
        this.f92830f = pdVar;
        this.f92828c = bVar;
        this.f92829e = veVar;
    }

    @Override // xr.c2
    public void runInContext() {
        pd pdVar = this.f92830f;
        try {
            lt.f fVarTraceTask = lt.c.traceTask("ServerCallListener(app).messagesAvailable");
            try {
                lt.c.attachTag(pdVar.f92907e);
                lt.c.linkIn(this.f92828c);
                fe feVar = pdVar.f92908f;
                if (feVar == null) {
                    throw new IllegalStateException("listener unset");
                }
                feVar.messagesAvailable(this.f92829e);
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
