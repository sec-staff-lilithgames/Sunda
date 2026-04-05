package yr;

import java.io.EOFException;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import mh.p1;
import wr.c4;
import wr.e4;
import wr.m6;
import wr.u2;
import wr.z3;
import xr.c5;
import xr.fb;
import xr.g5;
import xr.l1;
import xr.te;
import xr.v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class w extends g5 implements d1 {
    public final pw.g A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public final h G;
    public final g1 H;
    public final d0 I;
    public boolean J;
    public final lt.e K;
    public e1 L;
    public int M;
    public final /* synthetic */ x N;

    /* renamed from: x, reason: collision with root package name */
    public final int f95102x;

    /* renamed from: y, reason: collision with root package name */
    public final Object f95103y;

    /* renamed from: z, reason: collision with root package name */
    public List f95104z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(x xVar, int i10, te teVar, Object obj, h hVar, g1 g1Var, d0 d0Var, int i11, String str) {
        super(i10, teVar, xVar.f92446a);
        this.N = xVar;
        pw.g gVar = x.f95110p;
        this.f92553u = mh.h0.f74628c;
        this.A = new pw.g();
        this.B = false;
        this.C = false;
        this.D = false;
        this.J = true;
        this.M = -1;
        this.f95103y = p1.checkNotNull(obj, "lock");
        this.G = hVar;
        this.H = g1Var;
        this.I = d0Var;
        this.E = i11;
        this.F = i11;
        this.f95102x = i11;
        this.K = lt.c.createTag(str);
    }

    public static void h(w wVar, e4 e4Var, String str) {
        boolean z10;
        String str2;
        e4 e4Var2;
        x xVar = wVar.N;
        String str3 = xVar.f95114k;
        String str4 = xVar.f95112i;
        boolean z11 = xVar.f95118o;
        d0 d0Var = wVar.I;
        if (d0Var.B == null) {
            z10 = true;
            e4Var2 = e4Var;
            str2 = str;
        } else {
            z10 = false;
            str2 = str;
            e4Var2 = e4Var;
        }
        wVar.f95104z = l.createRequestHeaders(e4Var2, str2, str3, str4, z11, z10);
        m6 m6Var = d0Var.f94870v;
        if (m6Var != null) {
            xVar.f95115l.transportReportStatus(m6Var, l1.f92751f, true, new e4());
        } else {
            if (d0Var.f94862n.size() < d0Var.E) {
                d0Var.m(xVar);
                return;
            }
            d0Var.F.add(xVar);
            if (!d0Var.f94874z) {
                d0Var.f94874z = true;
                v6 v6Var = d0Var.H;
                if (v6Var != null) {
                    v6Var.onTransportActive();
                }
            }
            if (xVar.shouldBeCountedForInUse()) {
                d0Var.P.updateObjectInUse(xVar, true);
            }
        }
    }

    public static void i(w wVar, pw.g gVar, boolean z10, boolean z11) {
        if (wVar.D) {
            return;
        }
        if (!wVar.J) {
            p1.checkState(wVar.M != -1, "streamId should be set");
            wVar.H.data(z10, wVar.L, gVar, z11);
        } else {
            wVar.A.write(gVar, (int) gVar.size());
            wVar.B |= z10;
            wVar.C |= z11;
        }
    }

    @Override // xr.g5, xr.d, xr.m, xr.m9
    public void bytesRead(int i10) {
        int i11 = this.F - i10;
        this.F = i11;
        float f10 = i11;
        int i12 = this.f95102x;
        if (f10 <= i12 * 0.5f) {
            int i13 = i12 - i11;
            this.E += i13;
            this.F = i11 + i13;
            this.G.windowUpdate(this.M, i13);
        }
    }

    @Override // xr.g5, xr.d, xr.m, xr.m9
    public void deframeFailed(Throwable th2) throws EOFException {
        j(new e4(), true, m6.fromThrowable(th2));
    }

    @Override // xr.g5, xr.d, xr.m, xr.m9
    public void deframerClosed(boolean z10) {
        l1 l1Var = l1.f92748b;
        if (this.f92370p) {
            this.I.d(this.M, null, l1Var, false, null, null);
        } else {
            this.I.d(this.M, null, l1Var, false, as.a.CANCEL, null);
        }
        super.deframerClosed(z10);
    }

    public final void j(e4 e4Var, boolean z10, m6 m6Var) throws EOFException {
        if (this.D) {
            return;
        }
        this.D = true;
        if (!this.J) {
            this.I.d(this.M, m6Var, l1.f92748b, z10, as.a.CANCEL, e4Var);
            return;
        }
        d0 d0Var = this.I;
        LinkedList linkedList = d0Var.F;
        x xVar = this.N;
        linkedList.remove(xVar);
        d0Var.h(xVar);
        this.f95104z = null;
        this.A.clear();
        this.J = false;
        if (e4Var == null) {
            e4Var = new e4();
        }
        transportReportStatus(m6Var, true, e4Var);
    }

    @Override // xr.g5, xr.d, xr.m, xr.w, xr.b0
    public void runOnTransportThread(Runnable runnable) {
        synchronized (this.f95103y) {
            runnable.run();
        }
    }

    public void start(int i10) {
        p1.checkState(this.M == -1, "the stream has been started with id %s", i10);
        this.M = i10;
        g1 g1Var = this.H;
        this.L = g1Var.createState(this, i10);
        x xVar = this.N;
        w wVar = xVar.f95115l;
        super.onStreamAllocated();
        wVar.f92780d.reportLocalStreamStarted();
        if (this.J) {
            this.G.synStream(xVar.f95118o, false, this.M, 0, this.f95104z);
            xVar.f95113j.clientOutboundHeaders();
            this.f95104z = null;
            pw.g gVar = this.A;
            if (gVar.size() > 0) {
                g1Var.data(this.B, this.L, gVar, this.C);
            }
            this.J = false;
        }
    }

    public void transportDataReceived(pw.g gVar, boolean z10, int i10) throws Throwable {
        Throwable th2;
        int size = this.E - (((int) gVar.size()) + i10);
        this.E = size;
        this.F -= i10;
        if (size < 0) {
            this.G.rstStream(this.M, as.a.FLOW_CONTROL_ERROR);
            this.I.d(this.M, m6.f91046n.withDescription("Received data size exceeded our receiving window size"), l1.f92748b, false, null, null);
            return;
        }
        j0 j0Var = new j0(gVar);
        m6 m6Var = this.f92551s;
        boolean z11 = false;
        if (m6Var != null) {
            this.f92551s = m6Var.augmentDescription("DATA-----------------------------\n" + fb.readAsString(j0Var, this.f92553u));
            j0Var.close();
            if (this.f92551s.getDescription().length() > 1000 || z10) {
                j(this.f92552t, false, this.f92551s);
                return;
            }
            return;
        }
        if (!this.f92554v) {
            j(new e4(), false, m6.f91046n.withDescription("headers not received before payload"));
            return;
        }
        int i11 = j0Var.readableBytes();
        p1.checkNotNull(j0Var, "frame");
        try {
            if (this.f92371q) {
                xr.e.f92445g.log(Level.INFO, "Received data on closed stream");
                j0Var.close();
            } else {
                try {
                    this.f92777a.deframe(j0Var);
                } catch (Throwable th3) {
                    try {
                        deframeFailed(th3);
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (!z11) {
                            throw th2;
                        }
                        j0Var.close();
                        throw th2;
                    }
                }
            }
            if (z10) {
                if (i11 > 0) {
                    this.f92551s = m6.f91046n.withDescription("Received unexpected EOS on non-empty DATA frame from server");
                } else {
                    this.f92551s = m6.f91046n.withDescription("Received unexpected EOS on empty DATA frame from server");
                }
                e4 e4Var = new e4();
                this.f92552t = e4Var;
                transportReportStatus(this.f92551s, false, e4Var);
            }
        } catch (Throwable th5) {
            th2 = th5;
            z11 = true;
        }
    }

    /* JADX WARN: Finally extract failed */
    public void transportHeadersReceived(List<as.e> list, boolean z10) throws EOFException {
        m6 m6VarAugmentDescription;
        z3 z3Var = g5.f92550w;
        if (z10) {
            e4 e4VarConvertTrailers = k1.convertTrailers(list);
            p1.checkNotNull(e4VarConvertTrailers, "trailers");
            if (this.f92551s == null && !this.f92554v) {
                m6 m6VarG = g5.g(e4VarConvertTrailers);
                this.f92551s = m6VarG;
                if (m6VarG != null) {
                    this.f92552t = e4VarConvertTrailers;
                }
            }
            m6 m6Var = this.f92551s;
            if (m6Var != null) {
                m6 m6VarAugmentDescription2 = m6Var.augmentDescription("trailers: " + e4VarConvertTrailers);
                this.f92551s = m6VarAugmentDescription2;
                j(this.f92552t, false, m6VarAugmentDescription2);
                return;
            }
            c4 c4Var = u2.f91151b;
            m6 m6Var2 = (m6) e4VarConvertTrailers.get(c4Var);
            if (m6Var2 != null) {
                m6VarAugmentDescription = m6Var2.withDescription((String) e4VarConvertTrailers.get(u2.f91150a));
            } else if (this.f92554v) {
                m6VarAugmentDescription = m6.f91039g.withDescription("missing GRPC status in response");
            } else {
                Integer num = (Integer) e4VarConvertTrailers.get(z3Var);
                m6VarAugmentDescription = (num != null ? c5.httpStatusToGrpcStatus(num.intValue()) : m6.f91046n.withDescription("missing HTTP status code")).augmentDescription("missing GRPC status, inferred error from HTTP status code");
            }
            e4VarConvertTrailers.discardAll(z3Var);
            e4VarConvertTrailers.discardAll(c4Var);
            e4VarConvertTrailers.discardAll(u2.f91150a);
            p1.checkNotNull(m6VarAugmentDescription, "status");
            p1.checkNotNull(e4VarConvertTrailers, "trailers");
            if (this.f92371q) {
                xr.e.f92445g.log(Level.INFO, "Received trailers on closed stream:\n {1}\n {2}", new Object[]{m6VarAugmentDescription, e4VarConvertTrailers});
                return;
            } else {
                this.f92363i.clientInboundTrailers(e4VarConvertTrailers);
                transportReportStatus(m6VarAugmentDescription, false, e4VarConvertTrailers);
                return;
            }
        }
        e4 e4VarConvertHeaders = k1.convertHeaders(list);
        p1.checkNotNull(e4VarConvertHeaders, "headers");
        m6 m6Var3 = this.f92551s;
        if (m6Var3 != null) {
            this.f92551s = m6Var3.augmentDescription("headers: " + e4VarConvertHeaders);
            return;
        }
        try {
            if (this.f92554v) {
                m6 m6VarWithDescription = m6.f91046n.withDescription("Received headers twice");
                this.f92551s = m6VarWithDescription;
                if (m6VarWithDescription != null) {
                    this.f92551s = m6VarWithDescription.augmentDescription("headers: " + e4VarConvertHeaders);
                    this.f92552t = e4VarConvertHeaders;
                    this.f92553u = g5.f(e4VarConvertHeaders);
                    return;
                }
                return;
            }
            Integer num2 = (Integer) e4VarConvertHeaders.get(z3Var);
            if (num2 != null && num2.intValue() >= 100 && num2.intValue() < 200) {
                m6 m6Var4 = this.f92551s;
                if (m6Var4 != null) {
                    this.f92551s = m6Var4.augmentDescription("headers: " + e4VarConvertHeaders);
                    this.f92552t = e4VarConvertHeaders;
                    this.f92553u = g5.f(e4VarConvertHeaders);
                    return;
                }
                return;
            }
            this.f92554v = true;
            m6 m6VarG2 = g5.g(e4VarConvertHeaders);
            this.f92551s = m6VarG2;
            if (m6VarG2 != null) {
                this.f92551s = m6VarG2.augmentDescription("headers: " + e4VarConvertHeaders);
                this.f92552t = e4VarConvertHeaders;
                this.f92553u = g5.f(e4VarConvertHeaders);
                return;
            }
            e4VarConvertHeaders.discardAll(z3Var);
            e4VarConvertHeaders.discardAll(u2.f91151b);
            e4VarConvertHeaders.discardAll(u2.f91150a);
            e(e4VarConvertHeaders);
            m6 m6Var5 = this.f92551s;
            if (m6Var5 != null) {
                this.f92551s = m6Var5.augmentDescription("headers: " + e4VarConvertHeaders);
                this.f92552t = e4VarConvertHeaders;
                this.f92553u = g5.f(e4VarConvertHeaders);
            }
        } catch (Throwable th2) {
            m6 m6Var6 = this.f92551s;
            if (m6Var6 != null) {
                this.f92551s = m6Var6.augmentDescription("headers: " + e4VarConvertHeaders);
                this.f92552t = e4VarConvertHeaders;
                this.f92553u = g5.f(e4VarConvertHeaders);
            }
            throw th2;
        }
    }
}
