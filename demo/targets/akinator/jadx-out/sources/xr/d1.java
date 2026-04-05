package xr;

import wr.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d1 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lt.b f92375c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr.m6 f92376e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wr.e4 f92377f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f1 f92378g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(f1 f1Var, lt.b bVar, wr.m6 m6Var, wr.e4 e4Var) {
        super(f1Var.f92493c.f92679f);
        this.f92378g = f1Var;
        this.f92375c = bVar;
        this.f92376e = m6Var;
        this.f92377f = e4Var;
    }

    public final void a() {
        wr.m6 m6Var = this.f92376e;
        wr.e4 e4Var = this.f92377f;
        wr.m6 m6Var2 = this.f92378g.f92492b;
        if (m6Var2 != null) {
            e4Var = new wr.e4();
            m6Var = m6Var2;
        }
        this.f92378g.f92493c.f92684k = true;
        try {
            f1 f1Var = this.f92378g;
            j1 j1Var = f1Var.f92493c;
            p.a aVar = f1Var.f92491a;
            j1Var.getClass();
            aVar.onClose(m6Var, e4Var);
        } finally {
            this.f92378g.f92493c.b();
            this.f92378g.f92493c.f92678e.reportCallEnded(m6Var.isOk());
        }
    }

    @Override // xr.c2
    public void runInContext() {
        lt.f fVarTraceTask = lt.c.traceTask("ClientCall$Listener.onClose");
        try {
            lt.c.attachTag(this.f92378g.f92493c.f92675b);
            lt.c.linkIn(this.f92375c);
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
