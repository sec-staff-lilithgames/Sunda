package xr;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class vd extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ wr.n0 f93200c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lt.e f93201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lt.b f93202f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f93203g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ee f93204h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pd f93205i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ sh.a2 f93206j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ te f93207k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f93208l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Executor f93209m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yd f93210n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd(yd ydVar, wr.n0 n0Var, lt.e eVar, lt.b bVar, String str, ee eeVar, pd pdVar, sh.a2 a2Var, te teVar, wr.e4 e4Var, Executor executor) {
        super(n0Var);
        this.f93210n = ydVar;
        this.f93200c = n0Var;
        this.f93201e = eVar;
        this.f93202f = bVar;
        this.f93203g = str;
        this.f93204h = eeVar;
        this.f93205i = pdVar;
        this.f93206j = a2Var;
        this.f93207k = teVar;
        this.f93208l = e4Var;
        this.f93209m = executor;
    }

    public final void a() throws Throwable {
        Throwable th2;
        wr.n0 n0Var = this.f93200c;
        pd pdVar = this.f93205i;
        sh.a2 a2Var = this.f93206j;
        String str = this.f93203g;
        ee eeVar = this.f93204h;
        yd ydVar = this.f93210n;
        zd zdVar = ydVar.f93271d;
        try {
            wr.t5 t5VarLookupMethod = zdVar.f93340e.lookupMethod(str);
            if (t5VarLookupMethod == null) {
                t5VarLookupMethod = zdVar.f93341f.lookupMethod(str, eeVar.getAuthority());
            }
            if (t5VarLookupMethod == null) {
                wr.m6 m6VarWithDescription = wr.m6.f91045m.withDescription("Method not found: " + str);
                pdVar.c(zd.A);
                eeVar.close(m6VarWithDescription, new wr.e4());
                n0Var.cancel(null);
                a2Var.cancel(false);
                return;
            }
            wr.t5 t5VarA = yd.a(ydVar, eeVar, t5VarLookupMethod, this.f93207k);
            try {
                try {
                    try {
                        th2 = null;
                        try {
                            a2Var.set(new xd(ydVar, new id(eeVar, t5VarA.getMethodDescriptor(), this.f93208l, this.f93200c, zdVar.f93355t, zdVar.f93356u, zdVar.f93359x, this.f93201e), t5VarA.getServerCallHandler()));
                        } catch (Throwable th3) {
                            th = th3;
                            pdVar.c(zd.A);
                            eeVar.close(wr.m6.fromThrowable(th), new wr.e4());
                            n0Var.cancel(th2);
                            a2Var.cancel(false);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = null;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th2 = null;
                }
            } catch (Throwable th6) {
                th = th6;
                th2 = null;
            }
        } catch (Throwable th7) {
            th = th7;
            th2 = null;
        }
    }

    @Override // xr.c2
    public void runInContext() {
        lt.f fVarTraceTask = lt.c.traceTask("ServerTransportListener$MethodLookup.startCall");
        try {
            lt.c.attachTag(this.f93201e);
            lt.c.linkIn(this.f93202f);
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
