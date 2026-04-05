package yr;

import androidx.core.app.NotificationCompat;
import mh.p1;
import wr.m6;
import xr.ff;
import xr.te;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class r0 extends xr.k {

    /* renamed from: e, reason: collision with root package name */
    public final String f95012e;

    /* renamed from: f, reason: collision with root package name */
    public final a f95013f;

    /* renamed from: g, reason: collision with root package name */
    public final q0 f95014g;

    /* renamed from: h, reason: collision with root package name */
    public final ff f95015h;

    /* renamed from: i, reason: collision with root package name */
    public final wr.c f95016i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends xr.j implements d1, y0 {
        public final lt.e A;
        public final e1 B;

        /* renamed from: q, reason: collision with root package name */
        public final v0 f95017q;

        /* renamed from: r, reason: collision with root package name */
        public final int f95018r;

        /* renamed from: s, reason: collision with root package name */
        public final int f95019s;

        /* renamed from: t, reason: collision with root package name */
        public final Object f95020t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f95021u;

        /* renamed from: v, reason: collision with root package name */
        public int f95022v;

        /* renamed from: w, reason: collision with root package name */
        public int f95023w;

        /* renamed from: x, reason: collision with root package name */
        public final h f95024x;

        /* renamed from: y, reason: collision with root package name */
        public final g1 f95025y;

        /* renamed from: z, reason: collision with root package name */
        public boolean f95026z;

        public a(v0 v0Var, int i10, int i11, te teVar, Object obj, h hVar, g1 g1Var, int i12, ff ffVar, String str) {
            super(i11, teVar, ffVar);
            this.f95021u = false;
            this.f95017q = (v0) p1.checkNotNull(v0Var, NotificationCompat.CATEGORY_TRANSPORT);
            this.f95018r = i10;
            this.f95020t = p1.checkNotNull(obj, "lock");
            this.f95024x = hVar;
            this.f95025y = g1Var;
            this.f95022v = i12;
            this.f95023w = i12;
            this.f95019s = i12;
            this.A = lt.c.createTag(str);
            this.B = g1Var.createState(this, i10);
        }

        @Override // xr.j, xr.m, xr.m9
        public void bytesRead(int i10) {
            int i11 = this.f95023w - i10;
            this.f95023w = i11;
            float f10 = i11;
            int i12 = this.f95019s;
            if (f10 <= i12 * 0.5f) {
                int i13 = i12 - i11;
                this.f95022v += i13;
                this.f95023w = i11 + i13;
                h hVar = this.f95024x;
                hVar.windowUpdate(this.f95018r, i13);
                hVar.flush();
            }
        }

        @Override // xr.j, xr.m, xr.m9
        public void deframeFailed(Throwable th2) {
            m6 m6VarFromThrowable = m6.fromThrowable(th2);
            if (this.f95021u) {
                return;
            }
            this.f95021u = true;
            h hVar = this.f95024x;
            int i10 = this.f95018r;
            hVar.rstStream(i10, as.a.INTERNAL_ERROR);
            transportReportStatus(m6VarFromThrowable);
            this.f95017q.e(i10, true);
        }

        @Override // yr.y0
        public e1 getOutboundFlowState() {
            return this.B;
        }

        @Override // yr.y0
        public boolean hasReceivedEndOfStream() {
            boolean z10;
            synchronized (this.f95020t) {
                z10 = this.f95026z;
            }
            return z10;
        }

        @Override // yr.y0
        public void inboundDataReceived(pw.g gVar, int i10, int i11, boolean z10) {
            synchronized (this.f95020t) {
                try {
                    lt.c.event("OkHttpServerTransport$FrameHandler.data", this.A);
                    if (z10) {
                        this.f95026z = true;
                    }
                    this.f95022v -= i10 + i11;
                    this.f95023w -= i11;
                    super.inboundDataReceived(new j0(gVar), z10);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // yr.y0
        public void inboundRstReceived(m6 m6Var) {
            lt.c.event("OkHttpServerTransport$FrameHandler.rstStream", this.A);
            transportReportStatus(m6Var);
        }

        @Override // yr.y0
        public int inboundWindowAvailable() {
            int i10;
            synchronized (this.f95020t) {
                i10 = this.f95022v;
            }
            return i10;
        }

        @Override // xr.j, xr.m, xr.w, xr.b0
        public void runOnTransportThread(Runnable runnable) {
            synchronized (this.f95020t) {
                runnable.run();
            }
        }
    }

    public r0(a aVar, wr.c cVar, String str, te teVar, ff ffVar) {
        super(new c1(), teVar);
        this.f95014g = new q0(this);
        this.f95013f = (a) p1.checkNotNull(aVar, "state");
        this.f95016i = (wr.c) p1.checkNotNull(cVar, "transportAttrs");
        this.f95012e = str;
        this.f95015h = (ff) p1.checkNotNull(ffVar, "transportTracer");
    }

    @Override // xr.n
    public final xr.m b() {
        return this.f95013f;
    }

    @Override // xr.k, xr.ee
    public wr.c getAttributes() {
        return this.f95016i;
    }

    @Override // xr.k, xr.ee
    public String getAuthority() {
        return this.f95012e;
    }

    @Override // xr.k, xr.ee
    public int streamId() {
        return this.f95013f.f95018r;
    }
}
