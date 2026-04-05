package qe;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import bf.b1;
import com.google.android.exoplayer2.a1;
import com.google.android.exoplayer2.audio.l1;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.g1;
import com.google.android.exoplayer2.util.i1;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import de.h0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class t extends com.google.android.exoplayer2.f {
    public static final byte[] G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final ArrayDeque A;
    public boolean A0;
    public final l1 B;
    public com.google.android.exoplayer2.r B0;
    public z0 C;
    public ce.f C0;
    public z0 D;
    public b D0;
    public de.n E;
    public long E0;
    public de.n F;
    public boolean F0;
    public MediaCrypto G;
    public boolean H;
    public long I;
    public float J;
    public float K;
    public o L;
    public z0 M;
    public MediaFormat N;
    public boolean O;
    public float P;
    public ArrayDeque Q;
    public a R;
    public r S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f82858a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f82859b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f82860c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f82861d0;

    /* renamed from: e0, reason: collision with root package name */
    public i f82862e0;

    /* renamed from: f0, reason: collision with root package name */
    public long f82863f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f82864g0;

    /* renamed from: h0, reason: collision with root package name */
    public int f82865h0;

    /* renamed from: i0, reason: collision with root package name */
    public ByteBuffer f82866i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f82867j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f82868k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f82869l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f82870m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f82871n0;

    /* renamed from: o0, reason: collision with root package name */
    public boolean f82872o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f82873p0;

    /* renamed from: q, reason: collision with root package name */
    public final m f82874q;

    /* renamed from: q0, reason: collision with root package name */
    public int f82875q0;

    /* renamed from: r, reason: collision with root package name */
    public final v f82876r;

    /* renamed from: r0, reason: collision with root package name */
    public int f82877r0;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f82878s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f82879s0;

    /* renamed from: t, reason: collision with root package name */
    public final float f82880t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f82881t0;

    /* renamed from: u, reason: collision with root package name */
    public final ce.h f82882u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f82883u0;

    /* renamed from: v, reason: collision with root package name */
    public final ce.h f82884v;

    /* renamed from: v0, reason: collision with root package name */
    public long f82885v0;

    /* renamed from: w, reason: collision with root package name */
    public final ce.h f82886w;

    /* renamed from: w0, reason: collision with root package name */
    public long f82887w0;

    /* renamed from: x, reason: collision with root package name */
    public final h f82888x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f82889x0;

    /* renamed from: y, reason: collision with root package name */
    public final ArrayList f82890y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f82891y0;

    /* renamed from: z, reason: collision with root package name */
    public final MediaCodec.BufferInfo f82892z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f82893z0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public static final b f82898d = new b(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET);

        /* renamed from: a, reason: collision with root package name */
        public final long f82899a;

        /* renamed from: b, reason: collision with root package name */
        public final long f82900b;

        /* renamed from: c, reason: collision with root package name */
        public final g1 f82901c = new g1();

        public b(long j10, long j11, long j12) {
            this.f82899a = j10;
            this.f82900b = j12;
        }
    }

    public t(int i10, m mVar, v vVar, boolean z10, float f10) {
        super(i10);
        this.f82874q = mVar;
        this.f82876r = (v) com.google.android.exoplayer2.util.a.checkNotNull(vVar);
        this.f82878s = z10;
        this.f82880t = f10;
        this.f82882u = ce.h.newNoDataInstance();
        this.f82884v = new ce.h(0);
        this.f82886w = new ce.h(2);
        h hVar = new h();
        this.f82888x = hVar;
        this.f82890y = new ArrayList();
        this.f82892z = new MediaCodec.BufferInfo();
        this.J = 1.0f;
        this.K = 1.0f;
        this.I = C.TIME_UNSET;
        this.A = new ArrayDeque();
        U(b.f82898d);
        hVar.ensureSpaceForWrite(0);
        hVar.f12237e.order(ByteOrder.nativeOrder());
        this.B = new l1();
        this.P = -1.0f;
        this.T = 0;
        this.f82873p0 = 0;
        this.f82864g0 = -1;
        this.f82865h0 = -1;
        this.f82863f0 = C.TIME_UNSET;
        this.f82885v0 = C.TIME_UNSET;
        this.f82887w0 = C.TIME_UNSET;
        this.E0 = C.TIME_UNSET;
        this.f82875q0 = 0;
        this.f82877r0 = 0;
    }

    public final void A() throws Exception {
        z0 z0Var;
        if (this.L != null || this.f82869l0 || (z0Var = this.C) == null) {
            return;
        }
        if (this.F == null && W(z0Var)) {
            z0 z0Var2 = this.C;
            n();
            String str = z0Var2.f28802n;
            boolean zEquals = MimeTypes.AUDIO_AAC.equals(str);
            h hVar = this.f82888x;
            if (zEquals || MimeTypes.AUDIO_MPEG.equals(str) || MimeTypes.AUDIO_OPUS.equals(str)) {
                hVar.setMaxSampleCount(32);
            } else {
                hVar.setMaxSampleCount(1);
            }
            this.f82869l0 = true;
            return;
        }
        T(this.F);
        String str2 = this.C.f28802n;
        de.n nVar = this.E;
        if (nVar != null) {
            ce.b cryptoConfig = nVar.getCryptoConfig();
            if (this.G == null) {
                if (cryptoConfig == null) {
                    if (this.E.getError() == null) {
                        return;
                    }
                } else if (cryptoConfig instanceof h0) {
                    h0 h0Var = (h0) cryptoConfig;
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(h0Var.f52133a, h0Var.f52134b);
                        this.G = mediaCrypto;
                        this.H = !h0Var.f52135c && mediaCrypto.requiresSecureDecoderComponent(str2);
                    } catch (MediaCryptoException e10) {
                        throw a(e10, this.C, false, 6006);
                    }
                }
            }
            if (h0.f52132d && (cryptoConfig instanceof h0)) {
                int state = this.E.getState();
                if (state == 1) {
                    de.m mVar = (de.m) com.google.android.exoplayer2.util.a.checkNotNull(this.E.getError());
                    throw a(mVar, this.C, false, mVar.f52151b);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            B(this.G, this.H);
        } catch (a e11) {
            throw a(e11, this.C, false, 4001);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(android.media.MediaCrypto r13, boolean r14) throws java.lang.Exception {
        /*
            r12 = this;
            java.util.ArrayDeque r0 = r12.Q
            r1 = 0
            if (r0 != 0) goto L3b
            java.util.List r0 = r12.t(r14)     // Catch: qe.x -> L18
            java.util.ArrayDeque r2 = new java.util.ArrayDeque     // Catch: qe.x -> L18
            r2.<init>()     // Catch: qe.x -> L18
            r12.Q = r2     // Catch: qe.x -> L18
            boolean r3 = r12.f82878s     // Catch: qe.x -> L18
            if (r3 == 0) goto L1b
            r2.addAll(r0)     // Catch: qe.x -> L18
            goto L2d
        L18:
            r0 = move-exception
            r13 = r0
            goto L30
        L1b:
            boolean r2 = r0.isEmpty()     // Catch: qe.x -> L18
            if (r2 != 0) goto L2d
            java.util.ArrayDeque r2 = r12.Q     // Catch: qe.x -> L18
            r3 = 0
            java.lang.Object r0 = r0.get(r3)     // Catch: qe.x -> L18
            qe.r r0 = (qe.r) r0     // Catch: qe.x -> L18
            r2.add(r0)     // Catch: qe.x -> L18
        L2d:
            r12.R = r1     // Catch: qe.x -> L18
            goto L3b
        L30:
            qe.t$a r0 = new qe.t$a
            com.google.android.exoplayer2.z0 r1 = r12.C
            r2 = -49998(0xffffffffffff3cb2, float:NaN)
            r0.<init>(r1, r13, r14, r2)
            throw r0
        L3b:
            java.util.ArrayDeque r0 = r12.Q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc7
            java.util.ArrayDeque r0 = r12.Q
            java.lang.Object r0 = r0.peekFirst()
            r2 = r0
            qe.r r2 = (qe.r) r2
        L4c:
            qe.o r0 = r12.L
            if (r0 != 0) goto Lc4
            java.util.ArrayDeque r0 = r12.Q
            java.lang.Object r0 = r0.peekFirst()
            r3 = r0
            qe.r r3 = (qe.r) r3
            boolean r0 = r12.V(r3)
            if (r0 != 0) goto L60
            return
        L60:
            r12.z(r3, r13)     // Catch: java.lang.Exception -> L64
            goto L4c
        L64:
            r0 = move-exception
            java.lang.String r4 = "MediaCodecRenderer"
            if (r3 != r2) goto L79
            java.lang.String r0 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            com.google.android.exoplayer2.util.f0.w(r4, r0)     // Catch: java.lang.Exception -> L77
            r5 = 50
            java.lang.Thread.sleep(r5)     // Catch: java.lang.Exception -> L77
            r12.z(r3, r13)     // Catch: java.lang.Exception -> L77
            goto L4c
        L77:
            r0 = move-exception
            goto L7a
        L79:
            throw r0     // Catch: java.lang.Exception -> L77
        L7a:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Failed to initialize decoder: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.google.android.exoplayer2.util.f0.w(r4, r5, r0)
            java.util.ArrayDeque r4 = r12.Q
            r4.removeFirst()
            qe.t$a r4 = new qe.t$a
            com.google.android.exoplayer2.z0 r5 = r12.C
            r4.<init>(r5, r0, r14, r3)
            r12.C(r4)
            qe.t$a r0 = r12.R
            if (r0 != 0) goto La1
            r12.R = r4
            goto Lb8
        La1:
            qe.t$a r5 = new qe.t$a
            java.lang.String r6 = r0.getMessage()
            java.lang.Throwable r7 = r0.getCause()
            java.lang.String r8 = r0.f82894b
            boolean r9 = r0.f82895c
            qe.r r10 = r0.f82896e
            java.lang.String r11 = r0.f82897f
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.R = r5
        Lb8:
            java.util.ArrayDeque r0 = r12.Q
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc1
            goto L4c
        Lc1:
            qe.t$a r13 = r12.R
            throw r13
        Lc4:
            r12.Q = r1
            return
        Lc7:
            qe.t$a r13 = new qe.t$a
            com.google.android.exoplayer2.z0 r0 = r12.C
            r2 = -49999(0xffffffffffff3cb1, float:NaN)
            r13.<init>(r0, r1, r14, r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.t.B(android.media.MediaCrypto, boolean):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        if (r13 != false) goto L120;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ce.k F(com.google.android.exoplayer2.a1 r13) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.t.F(com.google.android.exoplayer2.a1):ce.k");
    }

    public void I(long j10) {
        this.E0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.A;
            if (arrayDeque.isEmpty() || j10 < ((b) arrayDeque.peek()).f82899a) {
                return;
            }
            U((b) arrayDeque.poll());
            J();
        }
    }

    public final void M() throws Exception {
        int i10 = this.f82877r0;
        if (i10 == 1) {
            r();
            return;
        }
        if (i10 == 2) {
            r();
            Z();
        } else if (i10 != 3) {
            this.f82891y0 = true;
            Q();
        } else {
            P();
            A();
        }
    }

    public abstract boolean N(long j10, long j11, o oVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, z0 z0Var);

    public final boolean O(int i10) throws Exception {
        a1 a1Var = this.f27449e;
        a1Var.clear();
        ce.h hVar = this.f82882u;
        hVar.clear();
        int iJ = j(a1Var, hVar, i10 | 4);
        if (iJ == -5) {
            F(a1Var);
            return true;
        }
        if (iJ != -4 || !hVar.isEndOfStream()) {
            return false;
        }
        this.f82889x0 = true;
        M();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P() {
        try {
            o oVar = this.L;
            if (oVar != null) {
                oVar.release();
                this.C0.f12225b++;
                E(this.S.f82850a);
            }
            this.L = null;
            try {
                MediaCrypto mediaCrypto = this.G;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.L = null;
            try {
                MediaCrypto mediaCrypto2 = this.G;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void R() {
        this.f82864g0 = -1;
        this.f82884v.f12237e = null;
        this.f82865h0 = -1;
        this.f82866i0 = null;
        this.f82863f0 = C.TIME_UNSET;
        this.f82881t0 = false;
        this.f82879s0 = false;
        this.f82859b0 = false;
        this.f82860c0 = false;
        this.f82867j0 = false;
        this.f82868k0 = false;
        this.f82890y.clear();
        this.f82885v0 = C.TIME_UNSET;
        this.f82887w0 = C.TIME_UNSET;
        this.E0 = C.TIME_UNSET;
        i iVar = this.f82862e0;
        if (iVar != null) {
            iVar.reset();
        }
        this.f82875q0 = 0;
        this.f82877r0 = 0;
        this.f82873p0 = this.f82872o0 ? 1 : 0;
    }

    public final void S() {
        R();
        this.B0 = null;
        this.f82862e0 = null;
        this.Q = null;
        this.S = null;
        this.M = null;
        this.N = null;
        this.O = false;
        this.f82883u0 = false;
        this.P = -1.0f;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f82858a0 = false;
        this.f82861d0 = false;
        this.f82872o0 = false;
        this.f82873p0 = 0;
        this.H = false;
    }

    public final void T(de.n nVar) {
        de.n.replaceSession(this.E, nVar);
        this.E = nVar;
    }

    public final void U(b bVar) {
        this.D0 = bVar;
        long j10 = bVar.f82900b;
        if (j10 != C.TIME_UNSET) {
            this.F0 = true;
            H(j10);
        }
    }

    public boolean V(r rVar) {
        return true;
    }

    public boolean W(z0 z0Var) {
        return false;
    }

    public abstract int X(v vVar, z0 z0Var);

    public final boolean Y(z0 z0Var) throws Exception {
        if (n1.f28506a >= 23 && this.L != null && this.f82877r0 != 3 && getState() != 0) {
            float fV = v(this.K, (z0[]) com.google.android.exoplayer2.util.a.checkNotNull(this.f27455k));
            float f10 = this.P;
            if (f10 != fV) {
                if (fV == -1.0f) {
                    if (this.f82879s0) {
                        this.f82875q0 = 1;
                        this.f82877r0 = 3;
                        return false;
                    }
                    P();
                    A();
                    return false;
                }
                if (f10 != -1.0f || fV > this.f82880t) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fV);
                    this.L.setParameters(bundle);
                    this.P = fV;
                }
            }
        }
        return true;
    }

    public final void Z() throws MediaCryptoException, com.google.android.exoplayer2.r {
        ce.b cryptoConfig = this.F.getCryptoConfig();
        if (cryptoConfig instanceof h0) {
            try {
                this.G.setMediaDrmSession(((h0) cryptoConfig).f52134b);
            } catch (MediaCryptoException e10) {
                throw a(e10, this.C, false, 6006);
            }
        }
        T(this.F);
        this.f82875q0 = 0;
        this.f82877r0 = 0;
    }

    public final void a0(long j10) {
        z0 z0Var = (z0) this.D0.f82901c.pollFloor(j10);
        if (z0Var == null && this.F0 && this.N != null) {
            z0Var = (z0) this.D0.f82901c.pollFirst();
        }
        if (z0Var != null) {
            this.D = z0Var;
        } else if (!this.O || this.D == null) {
            return;
        }
        G(this.D, this.N);
        this.O = false;
        this.F0 = false;
    }

    @Override // com.google.android.exoplayer2.f
    public void b() throws MediaCryptoException {
        this.C = null;
        U(b.f82898d);
        this.A.clear();
        s();
    }

    @Override // com.google.android.exoplayer2.f
    public void c(boolean z10, boolean z11) {
        this.C0 = new ce.f();
    }

    @Override // com.google.android.exoplayer2.f
    public void d(long j10, boolean z10) throws Exception {
        this.f82889x0 = false;
        this.f82891y0 = false;
        this.A0 = false;
        if (this.f82869l0) {
            this.f82888x.clear();
            this.f82886w.clear();
            this.f82870m0 = false;
            this.B.reset();
        } else if (s()) {
            A();
        }
        if (this.D0.f82901c.size() > 0) {
            this.f82893z0 = true;
        }
        this.D0.f82901c.clear();
        this.A.clear();
    }

    @Override // com.google.android.exoplayer2.f
    public void f() {
        try {
            n();
            P();
        } finally {
            de.n.replaceSession(this.F, null);
            this.F = null;
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.b3
    public abstract /* synthetic */ String getName();

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // com.google.android.exoplayer2.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.google.android.exoplayer2.z0[] r13, long r14, long r16) {
        /*
            r12 = this;
            qe.t$b r13 = r12.D0
            long r0 = r13.f82900b
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            qe.t$b r4 = new qe.t$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.U(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.A
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.f82885v0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.E0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            qe.t$b r5 = new qe.t$b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.U(r5)
            qe.t$b r13 = r12.D0
            long r13 = r13.f82900b
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.J()
        L51:
            return
        L52:
            qe.t$b r5 = new qe.t$b
            long r6 = r12.f82885v0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.t.i(com.google.android.exoplayer2.z0[], long, long):void");
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isEnded() {
        return this.f82891y0;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isReady() {
        if (this.C != null) {
            if (!(hasReadStreamToEnd() ? this.f27458n : ((b1) com.google.android.exoplayer2.util.a.checkNotNull(this.f27454j)).isReady())) {
                if ((this.f82865h0 >= 0) || (this.f82863f0 != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.f82863f0)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(long r18, long r20) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.t.k(long, long):boolean");
    }

    public ce.k l(r rVar, z0 z0Var, z0 z0Var2) {
        return new ce.k(rVar.f82850a, z0Var, z0Var2, 0, 1);
    }

    public p m(IllegalStateException illegalStateException, r rVar) {
        return new p(illegalStateException, rVar);
    }

    public final void n() {
        this.f82871n0 = false;
        this.f82888x.clear();
        this.f82886w.clear();
        this.f82870m0 = false;
        this.f82869l0 = false;
        this.B.reset();
    }

    public final boolean o() throws MediaCryptoException, com.google.android.exoplayer2.r {
        if (!this.f82879s0) {
            Z();
            return true;
        }
        this.f82875q0 = 1;
        if (this.V || this.X) {
            this.f82877r0 = 3;
            return false;
        }
        this.f82877r0 = 2;
        return true;
    }

    public final boolean p(long j10, long j11) throws Exception {
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean zN;
        int iDequeueOutputBufferIndex;
        boolean z12;
        int i10 = this.f82865h0;
        MediaCodec.BufferInfo bufferInfo2 = this.f82892z;
        if (i10 < 0) {
            if (this.Y && this.f82881t0) {
                try {
                    iDequeueOutputBufferIndex = this.L.dequeueOutputBufferIndex(bufferInfo2);
                } catch (IllegalStateException unused) {
                    M();
                    if (this.f82891y0) {
                        P();
                    }
                }
            } else {
                iDequeueOutputBufferIndex = this.L.dequeueOutputBufferIndex(bufferInfo2);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex != -2) {
                    if (this.f82861d0 && (this.f82889x0 || this.f82875q0 == 2)) {
                        M();
                        return false;
                    }
                    return false;
                }
                this.f82883u0 = true;
                MediaFormat outputFormat = this.L.getOutputFormat();
                if (this.T != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f82860c0 = true;
                    return true;
                }
                if (this.f82858a0) {
                    outputFormat.setInteger("channel-count", 1);
                }
                this.N = outputFormat;
                this.O = true;
                return true;
            }
            if (this.f82860c0) {
                this.f82860c0 = false;
                this.L.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                M();
                return false;
            }
            this.f82865h0 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = this.L.getOutputBuffer(iDequeueOutputBufferIndex);
            this.f82866i0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f82866i0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.Z && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j12 = this.f82885v0;
                if (j12 != C.TIME_UNSET) {
                    bufferInfo2.presentationTimeUs = j12;
                }
            }
            long j13 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f82890y;
            int size = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    z12 = false;
                    break;
                }
                if (((Long) arrayList.get(i11)).longValue() == j13) {
                    arrayList.remove(i11);
                    z12 = true;
                    break;
                }
                i11++;
            }
            this.f82867j0 = z12;
            long j14 = this.f82887w0;
            long j15 = bufferInfo2.presentationTimeUs;
            this.f82868k0 = j14 == j15;
            a0(j15);
        }
        if (this.Y && this.f82881t0) {
            try {
                z10 = false;
                z11 = true;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zN = N(j10, j11, this.L, this.f82866i0, this.f82865h0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f82867j0, this.f82868k0, this.D);
            } catch (IllegalStateException unused3) {
                M();
                if (!this.f82891y0) {
                    return z10;
                }
                P();
                return z10;
            }
        } else {
            z10 = false;
            z11 = true;
            bufferInfo = bufferInfo2;
            zN = N(j10, j11, this.L, this.f82866i0, this.f82865h0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f82867j0, this.f82868k0, this.D);
        }
        if (!zN) {
            return z10;
        }
        I(bufferInfo.presentationTimeUs);
        boolean z13 = (bufferInfo.flags & 4) != 0 ? z11 : z10;
        this.f82865h0 = -1;
        this.f82866i0 = null;
        if (!z13) {
            return z11;
        }
        M();
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean q() throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.t.q():boolean");
    }

    public final void r() {
        try {
            this.L.flush();
        } finally {
            R();
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public void render(long j10, long j11) throws Exception {
        boolean z10 = false;
        if (this.A0) {
            this.A0 = false;
            M();
        }
        com.google.android.exoplayer2.r rVar = this.B0;
        if (rVar != null) {
            this.B0 = null;
            throw rVar;
        }
        try {
            if (this.f82891y0) {
                Q();
                return;
            }
            if (this.C != null || O(2)) {
                A();
                if (this.f82869l0) {
                    i1.beginSection("bypassRender");
                    while (k(j10, j11)) {
                    }
                    i1.endSection();
                } else if (this.L != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    i1.beginSection("drainAndFeed");
                    while (p(j10, j11)) {
                        if (!(this.I == C.TIME_UNSET || SystemClock.elapsedRealtime() - jElapsedRealtime < this.I)) {
                            break;
                        }
                    }
                    while (q()) {
                        if (!(this.I == C.TIME_UNSET || SystemClock.elapsedRealtime() - jElapsedRealtime < this.I)) {
                            break;
                        }
                    }
                    i1.endSection();
                } else {
                    this.C0.f12227d += ((b1) com.google.android.exoplayer2.util.a.checkNotNull(this.f27454j)).skipData(j10 - this.f27456l);
                    O(1);
                }
                this.C0.ensureUpdated();
            }
        } catch (IllegalStateException e10) {
            int i10 = n1.f28506a;
            if (i10 < 21 || !(e10 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e10.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e10;
                }
            }
            C(e10);
            if (i10 >= 21) {
                if (e10 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e10).isRecoverable() : false) {
                    z10 = true;
                }
            }
            if (z10) {
                P();
            }
            throw a(m(e10, this.S), this.C, z10, 4003);
        }
    }

    public final boolean s() throws MediaCryptoException {
        if (this.L == null) {
            return false;
        }
        int i10 = this.f82877r0;
        if (i10 == 3 || this.V || ((this.W && !this.f82883u0) || (this.X && this.f82881t0))) {
            P();
            return true;
        }
        if (i10 == 2) {
            int i11 = n1.f28506a;
            com.google.android.exoplayer2.util.a.checkState(i11 >= 23);
            if (i11 >= 23) {
                try {
                    Z();
                } catch (com.google.android.exoplayer2.r e10) {
                    f0.w("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    P();
                    return true;
                }
            }
        }
        r();
        return false;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public void setPlaybackSpeed(float f10, float f11) throws Exception {
        this.J = f10;
        this.K = f11;
        Y(this.M);
    }

    public void setRenderTimeLimitMs(long j10) {
        this.I = j10;
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.b3
    public final int supportsFormat(z0 z0Var) throws com.google.android.exoplayer2.r {
        try {
            return X(this.f82876r, z0Var);
        } catch (x e10) {
            throw a(e10, z0Var, false, 4002);
        }
    }

    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.b3
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final List t(boolean z10) {
        z0 z0Var = this.C;
        v vVar = this.f82876r;
        List listW = w(vVar, z0Var, z10);
        if (!listW.isEmpty() || !z10) {
            return listW;
        }
        List listW2 = w(vVar, this.C, false);
        if (!listW2.isEmpty()) {
            f0.w("MediaCodecRenderer", "Drm session requires secure decoder for " + this.C.f28802n + ", but no secure decoder available. Trying to proceed with " + listW2 + ".");
        }
        return listW2;
    }

    public boolean u() {
        return false;
    }

    public float v(float f10, z0[] z0VarArr) {
        return -1.0f;
    }

    public abstract List w(v vVar, z0 z0Var, boolean z10);

    public abstract l x(r rVar, z0 z0Var, MediaCrypto mediaCrypto, float f10);

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0189  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(qe.r r17, android.media.MediaCrypto r18) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.t.z(qe.r, android.media.MediaCrypto):void");
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final String f82894b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f82895c;

        /* renamed from: e, reason: collision with root package name */
        public final r f82896e;

        /* renamed from: f, reason: collision with root package name */
        public final String f82897f;

        public a(z0 z0Var, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + z0Var, th2, z0Var.f28802n, z10, null, "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(z0 z0Var, Throwable th2, boolean z10, r rVar) {
            String str = "Decoder init failed: " + rVar.f82850a + ", " + z0Var;
            String str2 = z0Var.f28802n;
            String diagnosticInfo = null;
            if (n1.f28506a >= 21 && (th2 instanceof MediaCodec.CodecException)) {
                diagnosticInfo = ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            this(str, th2, str2, z10, rVar, diagnosticInfo);
        }

        public a(String str, Throwable th2, String str2, boolean z10, r rVar, String str3) {
            super(str, th2);
            this.f82894b = str2;
            this.f82895c = z10;
            this.f82896e = rVar;
            this.f82897f = str3;
        }
    }

    public void J() {
    }

    public void Q() {
    }

    @Override // com.google.android.exoplayer2.f
    public void g() {
    }

    @Override // com.google.android.exoplayer2.f
    public void h() {
    }

    public void C(Exception exc) {
    }

    public void E(String str) {
    }

    public void H(long j10) {
    }

    public void K(ce.h hVar) {
    }

    public void L(z0 z0Var) {
    }

    public void y(ce.h hVar) {
    }

    public void G(z0 z0Var, MediaFormat mediaFormat) {
    }

    public void D(String str, long j10, long j11) {
    }
}
