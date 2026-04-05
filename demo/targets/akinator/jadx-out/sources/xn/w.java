package xn;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import ao.o1;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.q0;
import io.bidmachine.media3.common.util.t0;
import io.bidmachine.media3.common.util.w0;
import io.bidmachine.media3.exoplayer.audio.b1;
import io.bidmachine.media3.exoplayer.r0;
import io.bidmachine.media3.exoplayer.r1;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import ko.u0;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class w extends io.bidmachine.media3.exoplayer.i {
    public static final byte[] G0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final g A;
    public io.bidmachine.media3.exoplayer.a0 A0;
    public final MediaCodec.BufferInfo B;
    public io.bidmachine.media3.exoplayer.j B0;
    public final ArrayDeque C;
    public b C0;
    public final b1 D;
    public long D0;
    public io.bidmachine.media3.common.b E;
    public boolean E0;
    public io.bidmachine.media3.common.b F;
    public boolean F0;
    public sn.o G;
    public sn.o H;
    public r1 I;
    public MediaCrypto J;
    public long K;
    public float L;
    public float M;
    public p N;
    public io.bidmachine.media3.common.b O;
    public MediaFormat P;
    public boolean Q;
    public float R;
    public ArrayDeque S;
    public a T;
    public s U;
    public int V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f92123a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f92124b0;

    /* renamed from: c0, reason: collision with root package name */
    public long f92125c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f92126d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f92127e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f92128f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f92129g0;

    /* renamed from: h0, reason: collision with root package name */
    public ByteBuffer f92130h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f92131i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f92132j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f92133k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f92134l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f92135m0;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f92136n0;

    /* renamed from: o0, reason: collision with root package name */
    public int f92137o0;

    /* renamed from: p0, reason: collision with root package name */
    public int f92138p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f92139q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f92140r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f92141s0;

    /* renamed from: t, reason: collision with root package name */
    public final m f92142t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f92143t0;

    /* renamed from: u, reason: collision with root package name */
    public final z f92144u;

    /* renamed from: u0, reason: collision with root package name */
    public long f92145u0;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f92146v;

    /* renamed from: v0, reason: collision with root package name */
    public long f92147v0;

    /* renamed from: w, reason: collision with root package name */
    public final float f92148w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f92149w0;

    /* renamed from: x, reason: collision with root package name */
    public final nn.g f92150x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f92151x0;

    /* renamed from: y, reason: collision with root package name */
    public final nn.g f92152y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f92153y0;

    /* renamed from: z, reason: collision with root package name */
    public final nn.g f92154z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f92155z0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: e, reason: collision with root package name */
        public static final b f92160e = new b(C.TIME_UNSET, C.TIME_UNSET, C.TIME_UNSET);

        /* renamed from: a, reason: collision with root package name */
        public final long f92161a;

        /* renamed from: b, reason: collision with root package name */
        public final long f92162b;

        /* renamed from: c, reason: collision with root package name */
        public final long f92163c;

        /* renamed from: d, reason: collision with root package name */
        public final t0 f92164d = new t0();

        public b(long j10, long j11, long j12) {
            this.f92161a = j10;
            this.f92162b = j11;
            this.f92163c = j12;
        }
    }

    public w(int i10, m mVar, z zVar, boolean z10, float f10) {
        super(i10);
        this.f92142t = mVar;
        this.f92144u = (z) io.bidmachine.media3.common.util.a.checkNotNull(zVar);
        this.f92146v = z10;
        this.f92148w = f10;
        this.f92150x = nn.g.newNoDataInstance();
        this.f92152y = new nn.g(0);
        this.f92154z = new nn.g(2);
        g gVar = new g();
        this.A = gVar;
        this.B = new MediaCodec.BufferInfo();
        this.L = 1.0f;
        this.M = 1.0f;
        this.K = C.TIME_UNSET;
        this.C = new ArrayDeque();
        this.C0 = b.f92160e;
        gVar.ensureSpaceForWrite(0);
        gVar.f77080f.order(ByteOrder.nativeOrder());
        this.D = new b1();
        this.R = -1.0f;
        this.V = 0;
        this.f92137o0 = 0;
        this.f92128f0 = -1;
        this.f92129g0 = -1;
        this.f92127e0 = C.TIME_UNSET;
        this.f92145u0 = C.TIME_UNSET;
        this.f92147v0 = C.TIME_UNSET;
        this.D0 = C.TIME_UNSET;
        this.f92125c0 = C.TIME_UNSET;
        this.f92138p0 = 0;
        this.f92139q0 = 0;
        this.B0 = new io.bidmachine.media3.exoplayer.j();
    }

    public long A(long j10, long j11, boolean z10) {
        return super.getDurationToProgressUs(j10, j11);
    }

    public abstract l B(s sVar, io.bidmachine.media3.common.b bVar, MediaCrypto mediaCrypto, float f10);

    public void C(nn.g gVar) {
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(xn.s r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.w.D(xn.s, android.media.MediaCrypto):void");
    }

    public final boolean E(long j10, long j11) {
        if (j11 >= j10) {
            return false;
        }
        io.bidmachine.media3.common.b bVar = this.F;
        return (bVar != null && Objects.equals(bVar.f60665o, MimeTypes.AUDIO_OPUS) && u0.needToDecodeOpusFrame(j10, j11)) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void F() throws io.bidmachine.media3.exoplayer.a0 {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.w.F():void");
    }

    public final void G(MediaCrypto mediaCrypto, boolean z10) throws a {
        io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.E);
        if (this.S == null) {
            try {
                List listV = v(z10);
                ArrayDeque arrayDeque = new ArrayDeque();
                this.S = arrayDeque;
                if (this.f92146v) {
                    arrayDeque.addAll(listV);
                } else if (!listV.isEmpty()) {
                    this.S.add((s) listV.get(0));
                }
                this.T = null;
            } catch (c0 e10) {
                throw new a(bVar, e10, z10, -49998);
            }
        }
        if (this.S.isEmpty()) {
            throw new a(bVar, (Throwable) null, z10, -49999);
        }
        ArrayDeque arrayDeque2 = (ArrayDeque) io.bidmachine.media3.common.util.a.checkNotNull(this.S);
        while (this.N == null) {
            s sVar = (s) io.bidmachine.media3.common.util.a.checkNotNull((s) arrayDeque2.peekFirst());
            if (!H(bVar) || !d0(sVar)) {
                return;
            }
            try {
                D(sVar, mediaCrypto);
            } catch (Exception e11) {
                io.bidmachine.media3.common.util.b0.w("MediaCodecRenderer", "Failed to initialize decoder: " + sVar, e11);
                arrayDeque2.removeFirst();
                a aVar = new a(bVar, e11, z10, sVar);
                I(aVar);
                if (this.T == null) {
                    this.T = aVar;
                } else {
                    a aVar2 = this.T;
                    this.T = new a(aVar2.getMessage(), aVar2.getCause(), aVar2.f92156b, aVar2.f92157c, aVar2.f92158e, aVar2.f92159f);
                }
                if (arrayDeque2.isEmpty()) {
                    throw this.T;
                }
            }
        }
        this.S = null;
    }

    public boolean H(io.bidmachine.media3.common.b bVar) {
        return true;
    }

    public void I(Exception exc) {
    }

    public void J(String str, long j10, long j11) {
    }

    public void K(String str) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e1, code lost:
    
        if (r4.requiresSecureDecoder((java.lang.String) io.bidmachine.media3.common.util.a.checkNotNull(r8.f60665o)) == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.bidmachine.media3.exoplayer.k L(io.bidmachine.media3.exoplayer.r0 r14) throws io.bidmachine.media3.exoplayer.a0 {
        /*
            Method dump skipped, instructions count: 448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.w.L(io.bidmachine.media3.exoplayer.r0):io.bidmachine.media3.exoplayer.k");
    }

    public void M(io.bidmachine.media3.common.b bVar, MediaFormat mediaFormat) {
    }

    public void N(long j10) {
    }

    public void O(long j10) {
        this.D0 = j10;
        while (true) {
            ArrayDeque arrayDeque = this.C;
            if (arrayDeque.isEmpty() || j10 < ((b) arrayDeque.peek()).f92161a) {
                return;
            }
            a0((b) io.bidmachine.media3.common.util.a.checkNotNull((b) arrayDeque.poll()));
            P();
        }
    }

    public void P() {
    }

    public void Q(nn.g gVar) {
    }

    public void R(r1 r1Var) {
    }

    public final void S() throws MediaCryptoException, io.bidmachine.media3.exoplayer.a0 {
        int i10 = this.f92139q0;
        if (i10 == 1) {
            t();
            return;
        }
        if (i10 == 2) {
            t();
            h0();
        } else if (i10 != 3) {
            this.f92151x0 = true;
            W();
        } else {
            V();
            F();
        }
    }

    public abstract boolean T(long j10, long j11, p pVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, io.bidmachine.media3.common.b bVar);

    public final boolean U(int i10) throws MediaCryptoException, io.bidmachine.media3.exoplayer.a0 {
        r0 r0Var = this.f61238e;
        r0Var.clear();
        nn.g gVar = this.f92150x;
        gVar.clear();
        int iL = l(r0Var, gVar, i10 | 4);
        if (iL == -5) {
            L(r0Var);
            return true;
        }
        if (iL != -4 || !gVar.isEndOfStream()) {
            return false;
        }
        this.f92149w0 = true;
        S();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void V() {
        try {
            p pVar = this.N;
            if (pVar != null) {
                pVar.release();
                this.B0.f61277b++;
                K(((s) io.bidmachine.media3.common.util.a.checkNotNull(this.U)).f92111a);
            }
            this.N = null;
            try {
                MediaCrypto mediaCrypto = this.J;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.N = null;
            try {
                MediaCrypto mediaCrypto2 = this.J;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void W() {
    }

    public void X() {
        this.f92128f0 = -1;
        this.f92152y.f77080f = null;
        this.f92129g0 = -1;
        this.f92130h0 = null;
        this.f92127e0 = C.TIME_UNSET;
        this.f92141s0 = false;
        this.f92125c0 = C.TIME_UNSET;
        this.f92140r0 = false;
        this.Z = false;
        this.f92123a0 = false;
        this.f92131i0 = false;
        this.f92132j0 = false;
        this.f92145u0 = C.TIME_UNSET;
        this.f92147v0 = C.TIME_UNSET;
        this.D0 = C.TIME_UNSET;
        this.f92138p0 = 0;
        this.f92139q0 = 0;
        this.f92137o0 = this.f92136n0 ? 1 : 0;
    }

    public final void Y() {
        X();
        this.A0 = null;
        this.S = null;
        this.U = null;
        this.O = null;
        this.P = null;
        this.Q = false;
        this.f92143t0 = false;
        this.R = -1.0f;
        this.V = 0;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.f92124b0 = false;
        this.f92126d0 = false;
        this.f92136n0 = false;
        this.f92137o0 = 0;
    }

    public final void Z(sn.o oVar) {
        sn.o.replaceSession(this.G, oVar);
        this.G = oVar;
    }

    public final void a0(b bVar) {
        this.C0 = bVar;
        long j10 = bVar.f92163c;
        if (j10 != C.TIME_UNSET) {
            this.E0 = true;
            N(j10);
        }
    }

    public final boolean b0(long j10) {
        return this.K == C.TIME_UNSET || ((q0) b()).elapsedRealtime() - j10 < this.K;
    }

    public boolean c0(nn.g gVar) {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public void d() throws MediaCryptoException {
        this.E = null;
        a0(b.f92160e);
        this.C.clear();
        u();
    }

    public boolean d0(s sVar) {
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public void e(boolean z10, boolean z11) {
        this.B0 = new io.bidmachine.media3.exoplayer.j();
    }

    public boolean e0(io.bidmachine.media3.common.b bVar) {
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public /* bridge */ /* synthetic */ void enableMayRenderStartOfStream() {
        super.enableMayRenderStartOfStream();
    }

    public void experimentalEnableProcessedStreamChangedAtStart() {
        this.F0 = true;
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public void f(long j10, boolean z10) throws io.bidmachine.media3.exoplayer.a0 {
        this.f92149w0 = false;
        this.f92151x0 = false;
        this.f92155z0 = false;
        if (this.f92133k0) {
            this.A.clear();
            this.f92154z.clear();
            this.f92134l0 = false;
            this.D.reset();
        } else if (u()) {
            F();
        }
        if (this.C0.f92164d.size() > 0) {
            this.f92153y0 = true;
        }
        this.C0.f92164d.clear();
        this.C.clear();
    }

    public abstract int f0(z zVar, io.bidmachine.media3.common.b bVar);

    public final boolean g0(io.bidmachine.media3.common.b bVar) throws io.bidmachine.media3.exoplayer.a0 {
        if (a1.f60679a >= 23 && this.N != null && this.f92139q0 != 3 && getState() != 0) {
            float f10 = this.M;
            float fY = y(f10, (io.bidmachine.media3.common.b[]) io.bidmachine.media3.common.util.a.checkNotNull(this.f61245l));
            float f11 = this.R;
            if (f11 != fY) {
                if (fY == -1.0f) {
                    if (this.f92140r0) {
                        this.f92138p0 = 1;
                        this.f92139q0 = 3;
                        return false;
                    }
                    V();
                    F();
                    return false;
                }
                if (f11 != -1.0f || fY > this.f92148w) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fY);
                    ((p) io.bidmachine.media3.common.util.a.checkNotNull(this.N)).setParameters(bundle);
                    this.R = fY;
                }
            }
        }
        return true;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public final long getDurationToProgressUs(long j10, long j11) {
        return A(j10, j11, this.f92126d0);
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public abstract /* synthetic */ String getName();

    @Override // io.bidmachine.media3.exoplayer.i
    public void h() {
        try {
            p();
            V();
        } finally {
            sn.o.replaceSession(this.H, null);
            this.H = null;
        }
    }

    public final void h0() throws MediaCryptoException, io.bidmachine.media3.exoplayer.a0 {
        nn.b cryptoConfig = ((sn.o) io.bidmachine.media3.common.util.a.checkNotNull(this.H)).getCryptoConfig();
        if (cryptoConfig instanceof sn.j0) {
            try {
                ((MediaCrypto) io.bidmachine.media3.common.util.a.checkNotNull(this.J)).setMediaDrmSession(((sn.j0) cryptoConfig).f85990b);
            } catch (MediaCryptoException e10) {
                throw a(e10, this.E, false, 6006);
            }
        }
        Z(this.H);
        this.f92138p0 = 0;
        this.f92139q0 = 0;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.n1
    public void handleMessage(int i10, Object obj) throws io.bidmachine.media3.exoplayer.a0 {
        if (i10 != 11) {
            super.handleMessage(i10, obj);
            return;
        }
        r1 r1Var = (r1) io.bidmachine.media3.common.util.a.checkNotNull((r1) obj);
        this.I = r1Var;
        R(r1Var);
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public void i() {
    }

    public final void i0(long j10) {
        io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) this.C0.f92164d.pollFloor(j10);
        if (bVar == null && this.E0 && this.P != null) {
            bVar = (io.bidmachine.media3.common.b) this.C0.f92164d.pollFirst();
        }
        if (bVar != null) {
            this.F = bVar;
        } else if (!this.Q || this.F == null) {
            return;
        }
        M((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.F), this.P);
        this.Q = false;
        this.E0 = false;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isEnded() {
        return this.f92151x0;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isReady() {
        if (this.E != null) {
            if (!(hasReadStreamToEnd() ? this.f61249p : ((o1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61244k)).isReady())) {
                if ((this.f92129g0 >= 0) || (this.f92127e0 != C.TIME_UNSET && ((q0) b()).elapsedRealtime() < this.f92127e0)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public void j() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        if (r4 >= r0) goto L16;
     */
    @Override // io.bidmachine.media3.exoplayer.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(io.bidmachine.media3.common.b[] r12, long r13, long r15, ao.k0 r17) {
        /*
            r11 = this;
            xn.w$b r12 = r11.C0
            long r0 = r12.f92163c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            xn.w$b r4 = new xn.w$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.a0(r4)
            boolean r12 = r11.F0
            if (r12 == 0) goto L56
            r11.P()
            return
        L24:
            java.util.ArrayDeque r12 = r11.C
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.f92145u0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.D0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            xn.w$b r4 = new xn.w$b
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.a0(r4)
            xn.w$b r12 = r11.C0
            long r12 = r12.f92163c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.P()
        L56:
            return
        L57:
            xn.w$b r0 = new xn.w$b
            long r1 = r11.f92145u0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.w.k(io.bidmachine.media3.common.b[], long, long, ao.k0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(long r18, long r20) throws io.bidmachine.media3.exoplayer.a0 {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.w.m(long, long):boolean");
    }

    public io.bidmachine.media3.exoplayer.k n(s sVar, io.bidmachine.media3.common.b bVar, io.bidmachine.media3.common.b bVar2) {
        return new io.bidmachine.media3.exoplayer.k(sVar.f92111a, bVar, bVar2, 0, 1);
    }

    public r o(IllegalStateException illegalStateException, s sVar) {
        return new r(illegalStateException, sVar);
    }

    public final void p() {
        this.f92135m0 = false;
        this.A.clear();
        this.f92154z.clear();
        this.f92134l0 = false;
        this.f92133k0 = false;
        this.D.reset();
    }

    public final boolean q() throws MediaCryptoException, io.bidmachine.media3.exoplayer.a0 {
        if (!this.f92140r0) {
            h0();
            return true;
        }
        this.f92138p0 = 1;
        if (this.X) {
            this.f92139q0 = 3;
            return false;
        }
        this.f92139q0 = 2;
        return true;
    }

    public final boolean r(long j10, long j11) throws MediaCryptoException, io.bidmachine.media3.exoplayer.a0 {
        boolean z10;
        boolean z11;
        MediaCodec.BufferInfo bufferInfo;
        boolean zT;
        int iDequeueOutputBufferIndex;
        p pVar = (p) io.bidmachine.media3.common.util.a.checkNotNull(this.N);
        int i10 = this.f92129g0;
        MediaCodec.BufferInfo bufferInfo2 = this.B;
        if (i10 < 0) {
            if (this.Y && this.f92141s0) {
                try {
                    iDequeueOutputBufferIndex = pVar.dequeueOutputBufferIndex(bufferInfo2);
                } catch (IllegalStateException unused) {
                    S();
                    if (this.f92151x0) {
                        V();
                    }
                }
            } else {
                iDequeueOutputBufferIndex = pVar.dequeueOutputBufferIndex(bufferInfo2);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    this.f92143t0 = true;
                    MediaFormat outputFormat = ((p) io.bidmachine.media3.common.util.a.checkNotNull(this.N)).getOutputFormat();
                    if (this.V != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f92123a0 = true;
                        return true;
                    }
                    this.P = outputFormat;
                    this.Q = true;
                    return true;
                }
                if (this.f92124b0 && (this.f92149w0 || this.f92138p0 == 2)) {
                    S();
                }
                long j12 = this.f92125c0;
                if (j12 != C.TIME_UNSET && j12 + 100 < ((q0) b()).currentTimeMillis()) {
                    S();
                    return false;
                }
                return false;
            }
            if (this.f92123a0) {
                this.f92123a0 = false;
                pVar.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                S();
                return false;
            }
            this.f92129g0 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = pVar.getOutputBuffer(iDequeueOutputBufferIndex);
            this.f92130h0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f92130h0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j13 = bufferInfo2.presentationTimeUs;
            this.f92131i0 = j13 < this.f61247n;
            long j14 = this.f92147v0;
            this.f92132j0 = j14 != C.TIME_UNSET && j14 <= j13;
            i0(j13);
        }
        if (this.Y && this.f92141s0) {
            try {
                z10 = false;
                z11 = true;
                bufferInfo = bufferInfo2;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zT = T(j10, j11, pVar, this.f92130h0, this.f92129g0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f92131i0, this.f92132j0, (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.F));
            } catch (IllegalStateException unused3) {
                S();
                if (!this.f92151x0) {
                    return z10;
                }
                V();
                return z10;
            }
        } else {
            z10 = false;
            z11 = true;
            bufferInfo = bufferInfo2;
            zT = T(j10, j11, pVar, this.f92130h0, this.f92129g0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f92131i0, this.f92132j0, (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.F));
        }
        if (!zT) {
            return z10;
        }
        O(bufferInfo.presentationTimeUs);
        boolean z12 = (bufferInfo.flags & 4) != 0 ? z11 : z10;
        if (!z12 && this.f92141s0 && this.f92132j0) {
            this.f92125c0 = ((q0) b()).currentTimeMillis();
        }
        this.f92129g0 = -1;
        this.f92130h0 = null;
        if (!z12) {
            return z11;
        }
        S();
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s() throws android.media.MediaCryptoException, io.bidmachine.media3.exoplayer.a0 {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xn.w.s():boolean");
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public void setPlaybackSpeed(float f10, float f11) throws io.bidmachine.media3.exoplayer.a0 {
        this.L = f10;
        this.M = f11;
        g0(this.O);
    }

    public void setRenderTimeLimitMs(long j10) {
        this.K = j10;
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.u1
    public final int supportsFormat(io.bidmachine.media3.common.b bVar) throws io.bidmachine.media3.exoplayer.a0 {
        try {
            return f0(this.f92144u, bVar);
        } catch (c0 e10) {
            throw a(e10, bVar, false, 4002);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.u1
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final void t() {
        try {
            ((p) io.bidmachine.media3.common.util.a.checkStateNotNull(this.N)).flush();
        } finally {
            X();
        }
    }

    public final boolean u() throws MediaCryptoException {
        if (this.N == null) {
            return false;
        }
        int i10 = this.f92139q0;
        if (i10 == 3 || ((this.W && !this.f92143t0) || (this.X && this.f92141s0))) {
            V();
            return true;
        }
        if (i10 == 2) {
            int i11 = a1.f60679a;
            io.bidmachine.media3.common.util.a.checkState(i11 >= 23);
            if (i11 >= 23) {
                try {
                    h0();
                } catch (io.bidmachine.media3.exoplayer.a0 e10) {
                    io.bidmachine.media3.common.util.b0.w("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e10);
                    V();
                    return true;
                }
            }
        }
        t();
        return false;
    }

    public final List v(boolean z10) {
        io.bidmachine.media3.common.b bVar = (io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(this.E);
        z zVar = this.f92144u;
        List listZ = z(zVar, bVar, z10);
        if (!listZ.isEmpty() || !z10) {
            return listZ;
        }
        List listZ2 = z(zVar, bVar, false);
        if (!listZ2.isEmpty()) {
            io.bidmachine.media3.common.util.b0.w("MediaCodecRenderer", "Drm session requires secure decoder for " + bVar.f60665o + ", but no secure decoder available. Trying to proceed with " + listZ2 + ".");
        }
        return listZ2;
    }

    public int w(nn.g gVar) {
        return 0;
    }

    public boolean x() {
        return false;
    }

    public float y(float f10, io.bidmachine.media3.common.b[] bVarArr) {
        return -1.0f;
    }

    public abstract List z(z zVar, io.bidmachine.media3.common.b bVar, boolean z10);

    @Override // io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public void render(long j10, long j11) throws MediaCryptoException, io.bidmachine.media3.exoplayer.a0 {
        boolean z10 = false;
        if (this.f92155z0) {
            this.f92155z0 = false;
            S();
        }
        io.bidmachine.media3.exoplayer.a0 a0Var = this.A0;
        if (a0Var != null) {
            this.A0 = null;
            throw a0Var;
        }
        try {
            if (this.f92151x0) {
                W();
                return;
            }
            if (this.E != null || U(2)) {
                F();
                if (this.f92133k0) {
                    w0.beginSection("bypassRender");
                    while (m(j10, j11)) {
                    }
                    w0.endSection();
                } else if (this.N != null) {
                    long jElapsedRealtime = ((q0) b()).elapsedRealtime();
                    w0.beginSection("drainAndFeed");
                    while (r(j10, j11) && b0(jElapsedRealtime)) {
                    }
                    while (s() && b0(jElapsedRealtime)) {
                    }
                    w0.endSection();
                } else {
                    this.B0.f61279d += ((o1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61244k)).skipData(j10 - this.f61246m);
                    U(1);
                }
                this.B0.ensureUpdated();
            }
        } catch (MediaCodec.CryptoException e10) {
            throw a(e10, this.E, false, a1.getErrorCodeForMediaDrmErrorCode(e10.getErrorCode()));
        } catch (IllegalStateException e11) {
            boolean z11 = e11 instanceof MediaCodec.CodecException;
            if (!z11) {
                StackTraceElement[] stackTrace = e11.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals(QpyI.Zvqr)) {
                    throw e11;
                }
            }
            I(e11);
            if (z11 && ((MediaCodec.CodecException) e11).isRecoverable()) {
                z10 = true;
            }
            if (z10) {
                V();
            }
            r rVarO = o(e11, this.U);
            throw a(rVarO, this.E, z10, rVarO.f92110b == 1101 ? 4006 : 4003);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends Exception {

        /* renamed from: b, reason: collision with root package name */
        public final String f92156b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f92157c;

        /* renamed from: e, reason: collision with root package name */
        public final s f92158e;

        /* renamed from: f, reason: collision with root package name */
        public final String f92159f;

        public a(io.bidmachine.media3.common.b bVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + bVar, th2, bVar.f60665o, z10, null, "io.bidmachine.media3.exoplayer.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10));
        }

        public a(io.bidmachine.media3.common.b bVar, Throwable th2, boolean z10, s sVar) {
            this("Decoder init failed: " + sVar.f92111a + ", " + bVar, th2, bVar.f60665o, z10, sVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null);
        }

        public a(String str, Throwable th2, String str2, boolean z10, s sVar, String str3) {
            super(str, th2);
            this.f92156b = str2;
            this.f92157c = z10;
            this.f92158e = sVar;
            this.f92159f = str3;
        }
    }
}
