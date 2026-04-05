package xr;

import wr.k5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class ud extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wr.n0 f93142c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt.b f93143e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lt.e f93144f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sh.a2 f93145g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ String f93146h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f93147i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ee f93148j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ pd f93149k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud(yd ydVar, wr.n0 n0Var, lt.b bVar, lt.e eVar, sh.a2 a2Var, String str, wr.e4 e4Var, ee eeVar, pd pdVar) {
        super(n0Var);
        this.f93142c = n0Var;
        this.f93143e = bVar;
        this.f93144f = eVar;
        this.f93145g = a2Var;
        this.f93146h = str;
        this.f93147i = e4Var;
        this.f93148j = eeVar;
        this.f93149k = pdVar;
    }

    public final void a() {
        wr.n0 n0Var = this.f93142c;
        pd pdVar = this.f93149k;
        qd qdVar = zd.A;
        sh.a2 a2Var = this.f93145g;
        if (a2Var.isCancelled()) {
            return;
        }
        try {
            String str = this.f93146h;
            xd xdVar = (xd) sh.b1.getDone(a2Var);
            wr.e4 e4Var = this.f93147i;
            wr.m5 m5Var = xdVar.f93242b;
            id idVar = xdVar.f93241a;
            k5.a aVarStartCall = m5Var.startCall(idVar, e4Var);
            if (aVarStartCall != null) {
                pdVar.c(new hd(idVar, aVarStartCall, idVar.f92652d));
                n0Var.addListener(new td(this), sh.w1.directExecutor());
            } else {
                throw new NullPointerException("startCall() returned a null listener for method " + str);
            }
        } finally {
        }
    }

    @Override // xr.c2
    public void runInContext() {
        lt.f fVarTraceTask = lt.c.traceTask("ServerTransportListener$HandleServerCall.startCall");
        try {
            lt.c.linkIn(this.f93143e);
            lt.c.attachTag(this.f93144f);
            a();
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
