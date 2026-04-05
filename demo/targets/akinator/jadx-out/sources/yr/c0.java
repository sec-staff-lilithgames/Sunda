package yr;

import i2.hQ.aTNDubNmpwAqdU;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import wr.j6;
import wr.m6;
import xr.a5;
import xr.j5;
import xr.l1;
import xr.v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements as.b, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final g0 f94844b;

    /* renamed from: c, reason: collision with root package name */
    public final as.c f94845c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94846e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d0 f94847f;

    public c0(d0 d0Var, as.c cVar) {
        this.f94847f = d0Var;
        Level level = Level.FINE;
        this.f94844b = new g0(d0.class);
        this.f94846e = true;
        this.f94845c = cVar;
    }

    @Override // as.b
    public void ackSettings() {
    }

    @Override // as.b
    public void alternateService(int i10, String str, pw.l lVar, String str2, int i11, long j10) {
    }

    @Override // as.b
    public void data(boolean z10, int i10, pw.k kVar, int i11, int i12) throws IOException {
        x xVar;
        this.f94844b.b(e0.f94876b, i10, kVar.getBuffer(), i11, z10);
        d0 d0Var = this.f94847f;
        synchronized (d0Var.f94859k) {
            xVar = (x) d0Var.f94862n.get(Integer.valueOf(i10));
        }
        if (xVar != null) {
            long j10 = i11;
            kVar.require(j10);
            pw.g gVar = new pw.g();
            gVar.write(kVar.getBuffer(), j10);
            lt.c.event("OkHttpClientTransport$ClientFrameHandler.data", xVar.f95115l.K);
            synchronized (this.f94847f.f94859k) {
                xVar.f95115l.transportDataReceived(gVar, z10, i12 - i11);
            }
        } else {
            if (!this.f94847f.g(i10)) {
                d0.a(this.f94847f, "Received data for unknown stream: " + i10);
                return;
            }
            synchronized (this.f94847f.f94859k) {
                this.f94847f.f94857i.rstStream(i10, as.a.STREAM_CLOSED);
            }
            kVar.skip(i11);
        }
        d0 d0Var2 = this.f94847f;
        int i13 = d0Var2.f94867s + i12;
        d0Var2.f94867s = i13;
        if (i13 >= d0Var2.f94854f * 0.5f) {
            synchronized (d0Var2.f94859k) {
                this.f94847f.f94857i.windowUpdate(0, r8.f94867s);
            }
            this.f94847f.f94867s = 0;
        }
    }

    @Override // as.b
    public void goAway(int i10, as.a aVar, pw.l lVar) {
        this.f94844b.c(e0.f94876b, i10, aVar, lVar);
        as.a aVar2 = as.a.ENHANCE_YOUR_CALM;
        d0 d0Var = this.f94847f;
        if (aVar == aVar2) {
            String strUtf8 = lVar.utf8();
            d0.U.log(Level.WARNING, this + ": Received GOAWAY with ENHANCE_YOUR_CALM. Debug data: " + strUtf8);
            if ("too_many_pings".equals(strUtf8)) {
                d0Var.M.run();
            }
        }
        m6 m6VarAugmentDescription = a5.statusForCode(aVar.f7938b).augmentDescription("Received Goaway");
        if (lVar.size() > 0) {
            m6VarAugmentDescription = m6VarAugmentDescription.augmentDescription(lVar.utf8());
        }
        Map map = d0.T;
        d0Var.k(i10, null, m6VarAugmentDescription);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0063  */
    @Override // as.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void headers(boolean r6, boolean r7, int r8, int r9, java.util.List<as.e> r10, as.f r11) {
        /*
            r5 = this;
            yr.g0 r6 = r5.f94844b
            yr.e0 r9 = yr.e0.f94876b
            r6.d(r9, r8, r10, r7)
            yr.d0 r6 = r5.f94847f
            int r6 = r6.N
            r9 = 2147483647(0x7fffffff, float:NaN)
            r11 = 0
            if (r6 == r9) goto L63
            r0 = 0
            r6 = r11
        L14:
            int r9 = r10.size()
            if (r6 >= r9) goto L34
            java.lang.Object r9 = r10.get(r6)
            as.e r9 = (as.e) r9
            pw.l r2 = r9.f7946a
            int r2 = r2.size()
            int r2 = r2 + 32
            pw.l r9 = r9.f7947b
            int r9 = r9.size()
            int r9 = r9 + r2
            long r2 = (long) r9
            long r0 = r0 + r2
            int r6 = r6 + 1
            goto L14
        L34:
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = java.lang.Math.min(r0, r2)
            int r6 = (int) r0
            yr.d0 r9 = r5.f94847f
            int r9 = r9.N
            if (r6 <= r9) goto L63
            wr.m6 r0 = wr.m6.f91043k
            java.util.Locale r1 = java.util.Locale.US
            if (r7 == 0) goto L4b
            java.lang.String r1 = "trailer"
            goto L4d
        L4b:
            java.lang.String r1 = "header"
        L4d:
            java.lang.String r2 = "Response "
            java.lang.String r3 = " metadata larger than "
            java.lang.String r4 = ": "
            java.lang.StringBuilder r9 = a.b.r(r9, r2, r1, r3, r4)
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            wr.m6 r6 = r0.withDescription(r6)
            goto L64
        L63:
            r6 = 0
        L64:
            yr.d0 r9 = r5.f94847f
            java.lang.Object r9 = r9.f94859k
            monitor-enter(r9)
            yr.d0 r0 = r5.f94847f     // Catch: java.lang.Throwable -> L8b
            java.util.HashMap r0 = r0.f94862n     // Catch: java.lang.Throwable -> L8b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L8b
            yr.x r0 = (yr.x) r0     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L8f
            yr.d0 r6 = r5.f94847f     // Catch: java.lang.Throwable -> L8b
            boolean r6 = r6.g(r8)     // Catch: java.lang.Throwable -> L8b
            if (r6 == 0) goto L8d
            yr.d0 r6 = r5.f94847f     // Catch: java.lang.Throwable -> L8b
            yr.h r6 = r6.f94857i     // Catch: java.lang.Throwable -> L8b
            as.a r7 = as.a.STREAM_CLOSED     // Catch: java.lang.Throwable -> L8b
            r6.rstStream(r8, r7)     // Catch: java.lang.Throwable -> L8b
            goto Lb5
        L8b:
            r6 = move-exception
            goto Lcc
        L8d:
            r11 = 1
            goto Lb5
        L8f:
            if (r6 != 0) goto La0
            java.lang.String r6 = "OkHttpClientTransport$ClientFrameHandler.headers"
            yr.w r1 = r0.f95115l     // Catch: java.lang.Throwable -> L8b
            lt.e r1 = r1.K     // Catch: java.lang.Throwable -> L8b
            lt.c.event(r6, r1)     // Catch: java.lang.Throwable -> L8b
            yr.w r6 = r0.f95115l     // Catch: java.lang.Throwable -> L8b
            r6.transportHeadersReceived(r10, r7)     // Catch: java.lang.Throwable -> L8b
            goto Lb5
        La0:
            if (r7 != 0) goto Lab
            yr.d0 r7 = r5.f94847f     // Catch: java.lang.Throwable -> L8b
            yr.h r7 = r7.f94857i     // Catch: java.lang.Throwable -> L8b
            as.a r10 = as.a.CANCEL     // Catch: java.lang.Throwable -> L8b
            r7.rstStream(r8, r10)     // Catch: java.lang.Throwable -> L8b
        Lab:
            yr.w r7 = r0.f95115l     // Catch: java.lang.Throwable -> L8b
            wr.e4 r10 = new wr.e4     // Catch: java.lang.Throwable -> L8b
            r10.<init>()     // Catch: java.lang.Throwable -> L8b
            r7.transportReportStatus(r6, r11, r10)     // Catch: java.lang.Throwable -> L8b
        Lb5:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            if (r11 == 0) goto Lcb
            yr.d0 r6 = r5.f94847f
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r9 = "Received header for unknown stream: "
            r7.<init>(r9)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            yr.d0.a(r6, r7)
        Lcb:
            return
        Lcc:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L8b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.c0.headers(boolean, boolean, int, int, java.util.List, as.f):void");
    }

    @Override // as.b
    public void ping(boolean z10, int i10, int i11) {
        j5 j5Var;
        long j10 = (i10 << 32) | (i11 & 4294967295L);
        this.f94844b.e(e0.f94876b, j10);
        if (!z10) {
            synchronized (this.f94847f.f94859k) {
                this.f94847f.f94857i.ping(true, i10, i11);
            }
            return;
        }
        synchronized (this.f94847f.f94859k) {
            try {
                j5 j5Var2 = this.f94847f.f94872x;
                j5Var = null;
                if (j5Var2 == null) {
                    d0.U.warning("Received unexpected ping ack. No ping outstanding");
                } else if (j5Var2.payload() == j10) {
                    d0 d0Var = this.f94847f;
                    j5 j5Var3 = d0Var.f94872x;
                    d0Var.f94872x = null;
                    j5Var = j5Var3;
                } else {
                    Logger logger = d0.U;
                    Level level = Level.WARNING;
                    Locale locale = Locale.US;
                    logger.log(level, "Received unexpected ping ack. Expecting " + this.f94847f.f94872x.payload() + ", got " + j10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (j5Var != null) {
            j5Var.complete();
        }
    }

    @Override // as.b
    public void priority(int i10, int i11, int i12, boolean z10) {
    }

    @Override // as.b
    public void pushPromise(int i10, int i11, List<as.e> list) throws IOException {
        this.f94844b.g(e0.f94876b, i10, i11, list);
        synchronized (this.f94847f.f94859k) {
            this.f94847f.f94857i.rstStream(i10, as.a.PROTOCOL_ERROR);
        }
    }

    @Override // as.b
    public void rstStream(int i10, as.a aVar) {
        this.f94844b.h(e0.f94876b, i10, aVar);
        m6 m6VarAugmentDescription = d0.o(aVar).augmentDescription("Rst Stream");
        boolean z10 = m6VarAugmentDescription.getCode() == j6.CANCELLED || m6VarAugmentDescription.getCode() == j6.DEADLINE_EXCEEDED;
        synchronized (this.f94847f.f94859k) {
            try {
                x xVar = (x) this.f94847f.f94862n.get(Integer.valueOf(i10));
                if (xVar != null) {
                    lt.c.event("OkHttpClientTransport$ClientFrameHandler.rstStream", xVar.f95115l.K);
                    this.f94847f.d(i10, m6VarAugmentDescription, aVar == as.a.REFUSED_STREAM ? l1.f92749c : l1.f92748b, z10, null, null);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // as.b
    public void settings(boolean z10, as.p pVar) {
        boolean zInitialOutboundWindowSize;
        this.f94844b.i(e0.f94876b, pVar);
        synchronized (this.f94847f.f94859k) {
            try {
                if (z0.isSet(pVar, 4)) {
                    this.f94847f.E = z0.get(pVar, 4);
                }
                if (z0.isSet(pVar, 7)) {
                    zInitialOutboundWindowSize = this.f94847f.f94858j.initialOutboundWindowSize(z0.get(pVar, 7));
                } else {
                    zInitialOutboundWindowSize = false;
                }
                if (this.f94846e) {
                    d0 d0Var = this.f94847f;
                    d0Var.f94869u = d0Var.f94856h.filterTransport(d0Var.f94869u);
                    this.f94847f.f94856h.transportReady();
                    this.f94846e = false;
                }
                this.f94847f.f94857i.ackSettings(pVar);
                if (zInitialOutboundWindowSize) {
                    this.f94847f.f94858j.writeStreams();
                }
                this.f94847f.l();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    @Override // as.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void windowUpdate(int r8, long r9) {
        /*
            r7 = this;
            yr.g0 r0 = r7.f94844b
            yr.e0 r1 = yr.e0.f94876b
            r0.j(r1, r8, r9)
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 != 0) goto L2a
            java.lang.String r9 = "Received 0 flow control window increment."
            if (r8 != 0) goto L17
            yr.d0 r8 = r7.f94847f
            yr.d0.a(r8, r9)
            return
        L17:
            yr.d0 r0 = r7.f94847f
            wr.m6 r10 = wr.m6.f91046n
            wr.m6 r2 = r10.withDescription(r9)
            xr.l1 r3 = xr.l1.f92748b
            as.a r5 = as.a.PROTOCOL_ERROR
            r6 = 0
            r4 = 0
            r1 = r8
            r0.d(r1, r2, r3, r4, r5, r6)
            return
        L2a:
            r1 = r8
            yr.d0 r8 = r7.f94847f
            java.lang.Object r8 = r8.f94859k
            monitor-enter(r8)
            if (r1 != 0) goto L40
            yr.d0 r0 = r7.f94847f     // Catch: java.lang.Throwable -> L3d
            yr.g1 r0 = r0.f94858j     // Catch: java.lang.Throwable -> L3d
            r1 = 0
            int r9 = (int) r9     // Catch: java.lang.Throwable -> L3d
            r0.windowUpdate(r1, r9)     // Catch: java.lang.Throwable -> L3d
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
            return
        L3d:
            r0 = move-exception
            r9 = r0
            goto L87
        L40:
            yr.d0 r0 = r7.f94847f     // Catch: java.lang.Throwable -> L3d
            java.util.HashMap r0 = r0.f94862n     // Catch: java.lang.Throwable -> L3d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> L3d
            yr.x r0 = (yr.x) r0     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L65
            yr.d0 r2 = r7.f94847f     // Catch: java.lang.Throwable -> L3d
            yr.g1 r2 = r2.f94858j     // Catch: java.lang.Throwable -> L3d
            yr.w r0 = r0.f95115l     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r3 = r0.f95103y     // Catch: java.lang.Throwable -> L3d
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L3d
            yr.e1 r0 = r0.L     // Catch: java.lang.Throwable -> L61
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
            int r9 = (int) r9
            r2.windowUpdate(r0, r9)     // Catch: java.lang.Throwable -> L3d
            goto L6f
        L61:
            r0 = move-exception
            r9 = r0
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L61
            throw r9     // Catch: java.lang.Throwable -> L3d
        L65:
            yr.d0 r9 = r7.f94847f     // Catch: java.lang.Throwable -> L3d
            boolean r9 = r9.g(r1)     // Catch: java.lang.Throwable -> L3d
            if (r9 != 0) goto L6f
            r9 = 1
            goto L70
        L6f:
            r9 = 0
        L70:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
            if (r9 == 0) goto L86
            yr.d0 r8 = r7.f94847f
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Received window_update for unknown stream: "
            r9.<init>(r10)
            r9.append(r1)
            java.lang.String r9 = r9.toString()
            yr.d0.a(r8, r9)
        L86:
            return
        L87:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L3d
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: yr.c0.windowUpdate(int, long):void");
    }

    @Override // java.lang.Runnable
    public void run() throws IOException {
        m6 m6VarWithDescription;
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(aTNDubNmpwAqdU.AHYYtGVRswAR);
        while (((as.l) this.f94845c).nextFrame(this)) {
            try {
                v6 v6Var = this.f94847f.H;
                if (v6Var != null) {
                    v6Var.onDataReceived();
                }
            } catch (Throwable th2) {
                try {
                    d0 d0Var = this.f94847f;
                    as.a aVar = as.a.PROTOCOL_ERROR;
                    m6 m6VarWithCause = m6.f91046n.withDescription("error in frame handler").withCause(th2);
                    Map map = d0.T;
                    d0Var.k(0, aVar, m6VarWithCause);
                    try {
                        this.f94845c.close();
                    } catch (IOException e10) {
                        e = e10;
                        d0.U.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
                    } catch (RuntimeException e11) {
                        if (!"bio == null".equals(e11.getMessage())) {
                            throw e11;
                        }
                    }
                } catch (Throwable th3) {
                    try {
                        this.f94845c.close();
                    } catch (IOException e12) {
                        d0.U.log(Level.INFO, "Exception closing frame reader", (Throwable) e12);
                    } catch (RuntimeException e13) {
                        if (!"bio == null".equals(e13.getMessage())) {
                            throw e13;
                        }
                    }
                    this.f94847f.f94856h.transportTerminated();
                    Thread.currentThread().setName(name);
                    throw th3;
                }
            }
        }
        synchronized (this.f94847f.f94859k) {
            m6VarWithDescription = this.f94847f.f94870v;
        }
        if (m6VarWithDescription == null) {
            m6VarWithDescription = m6.f91047o.withDescription("End of stream or IOException");
        }
        this.f94847f.k(0, as.a.INTERNAL_ERROR, m6VarWithDescription);
        try {
            this.f94845c.close();
        } catch (IOException e14) {
            e = e14;
            d0.U.log(Level.INFO, "Exception closing frame reader", (Throwable) e);
        } catch (RuntimeException e15) {
            if (!"bio == null".equals(e15.getMessage())) {
                throw e15;
            }
        }
        this.f94847f.f94856h.transportTerminated();
        Thread.currentThread().setName(name);
    }
}
