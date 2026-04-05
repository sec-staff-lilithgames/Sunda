package io.odeeo.internal.r;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import com.facebook.ads.AdError;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.u;
import io.odeeo.internal.e.g;
import io.odeeo.internal.f.f;
import io.odeeo.internal.q0.d0;
import io.odeeo.internal.q0.f0;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.r.h;
import io.odeeo.internal.r.m;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class k extends io.odeeo.internal.b.e {
    public static final byte[] F0 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public final long[] A;
    public io.odeeo.internal.b.n A0;
    public t B;
    public io.odeeo.internal.e.e B0;
    public t C;
    public long C0;
    public io.odeeo.internal.f.f D;
    public long D0;
    public io.odeeo.internal.f.f E;
    public int E0;
    public MediaCrypto F;
    public boolean G;
    public long H;
    public float I;
    public float J;
    public h K;
    public t L;
    public MediaFormat M;
    public boolean N;
    public float O;
    public ArrayDeque<j> P;
    public a Q;
    public j R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public boolean Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f66067a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f66068b0;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f66069c0;

    /* renamed from: d0, reason: collision with root package name */
    public e f66070d0;

    /* renamed from: e0, reason: collision with root package name */
    public long f66071e0;

    /* renamed from: f0, reason: collision with root package name */
    public int f66072f0;

    /* renamed from: g0, reason: collision with root package name */
    public int f66073g0;

    /* renamed from: h0, reason: collision with root package name */
    public ByteBuffer f66074h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f66075i0;

    /* renamed from: j0, reason: collision with root package name */
    public boolean f66076j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f66077k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f66078l0;

    /* renamed from: m0, reason: collision with root package name */
    public boolean f66079m0;

    /* renamed from: n, reason: collision with root package name */
    public final h.b f66080n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f66081n0;

    /* renamed from: o, reason: collision with root package name */
    public final l f66082o;

    /* renamed from: o0, reason: collision with root package name */
    public int f66083o0;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f66084p;

    /* renamed from: p0, reason: collision with root package name */
    public int f66085p0;

    /* renamed from: q, reason: collision with root package name */
    public final float f66086q;

    /* renamed from: q0, reason: collision with root package name */
    public int f66087q0;

    /* renamed from: r, reason: collision with root package name */
    public final io.odeeo.internal.e.g f66088r;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f66089r0;

    /* renamed from: s, reason: collision with root package name */
    public final io.odeeo.internal.e.g f66090s;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f66091s0;

    /* renamed from: t, reason: collision with root package name */
    public final io.odeeo.internal.e.g f66092t;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f66093t0;

    /* renamed from: u, reason: collision with root package name */
    public final d f66094u;

    /* renamed from: u0, reason: collision with root package name */
    public long f66095u0;

    /* renamed from: v, reason: collision with root package name */
    public final d0<t> f66096v;

    /* renamed from: v0, reason: collision with root package name */
    public long f66097v0;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList<Long> f66098w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f66099w0;

    /* renamed from: x, reason: collision with root package name */
    public final MediaCodec.BufferInfo f66100x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f66101x0;

    /* renamed from: y, reason: collision with root package name */
    public final long[] f66102y;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f66103y0;

    /* renamed from: z, reason: collision with root package name */
    public final long[] f66104z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f66105z0;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a extends Exception {

        /* renamed from: a, reason: collision with root package name */
        public final String f66106a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f66107b;

        /* renamed from: c, reason: collision with root package name */
        public final j f66108c;

        /* renamed from: d, reason: collision with root package name */
        public final String f66109d;

        /* renamed from: e, reason: collision with root package name */
        public final a f66110e;

        public a(t tVar, Throwable th2, boolean z10, int i10) {
            this("Decoder init failed: [" + i10 + "], " + tVar, th2, tVar.f62971l, z10, null, a(i10), null);
        }

        public final a a(a aVar) {
            return new a(getMessage(), getCause(), this.f66106a, this.f66107b, this.f66108c, this.f66109d, aVar);
        }

        public a(t tVar, Throwable th2, boolean z10, j jVar) {
            this("Decoder init failed: " + jVar.f66056a + ", " + tVar, th2, tVar.f62971l, z10, jVar, g0.f65861a >= 21 ? a(th2) : null, null);
        }

        public static String a(Throwable th2) {
            if (th2 instanceof MediaCodec.CodecException) {
                return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
            }
            return null;
        }

        public a(String str, Throwable th2, String str2, boolean z10, j jVar, String str3, a aVar) {
            super(str, th2);
            this.f66106a = str2;
            this.f66107b = z10;
            this.f66108c = jVar;
            this.f66109d = str3;
            this.f66110e = aVar;
        }

        public static String a(int i10) {
            return "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_" + (i10 < 0 ? "neg_" : "") + Math.abs(i10);
        }
    }

    public k(int i10, h.b bVar, l lVar, boolean z10, float f10) {
        super(i10);
        this.f66080n = bVar;
        this.f66082o = (l) io.odeeo.internal.q0.a.checkNotNull(lVar);
        this.f66084p = z10;
        this.f66086q = f10;
        this.f66088r = io.odeeo.internal.e.g.newNoDataInstance();
        this.f66090s = new io.odeeo.internal.e.g(0);
        this.f66092t = new io.odeeo.internal.e.g(2);
        d dVar = new d();
        this.f66094u = dVar;
        this.f66096v = new d0<>();
        this.f66098w = new ArrayList<>();
        this.f66100x = new MediaCodec.BufferInfo();
        this.I = 1.0f;
        this.J = 1.0f;
        this.H = C.TIME_UNSET;
        this.f66102y = new long[10];
        this.f66104z = new long[10];
        this.A = new long[10];
        this.C0 = C.TIME_UNSET;
        this.D0 = C.TIME_UNSET;
        dVar.ensureSpaceForWrite(0);
        dVar.f63705c.order(ByteOrder.nativeOrder());
        this.O = -1.0f;
        this.S = 0;
        this.f66083o0 = 0;
        this.f66072f0 = -1;
        this.f66073g0 = -1;
        this.f66071e0 = C.TIME_UNSET;
        this.f66095u0 = C.TIME_UNSET;
        this.f66097v0 = C.TIME_UNSET;
        this.f66085p0 = 0;
        this.f66087q0 = 0;
    }

    private void B() throws io.odeeo.internal.b.n, MediaCryptoException {
        int i10 = this.f66087q0;
        if (i10 == 1) {
            p();
            return;
        }
        if (i10 == 2) {
            p();
            L();
        } else if (i10 == 3) {
            D();
        } else {
            this.f66101x0 = true;
            F();
        }
    }

    private void c(io.odeeo.internal.f.f fVar) {
        io.odeeo.internal.f.f.replaceSession(this.E, fVar);
        this.E = fVar;
    }

    private boolean o() throws io.odeeo.internal.b.n, MediaCryptoException {
        h hVar = this.K;
        if (hVar == null || this.f66085p0 == 2 || this.f66099w0) {
            return false;
        }
        if (this.f66072f0 < 0) {
            int iDequeueInputBufferIndex = hVar.dequeueInputBufferIndex();
            this.f66072f0 = iDequeueInputBufferIndex;
            if (iDequeueInputBufferIndex < 0) {
                return false;
            }
            this.f66090s.f63705c = this.K.getInputBuffer(iDequeueInputBufferIndex);
            this.f66090s.clear();
        }
        if (this.f66085p0 == 1) {
            if (!this.f66069c0) {
                this.f66091s0 = true;
                this.K.queueInputBuffer(this.f66072f0, 0, 0, 0L, 4);
                I();
            }
            this.f66085p0 = 2;
            return false;
        }
        if (this.f66067a0) {
            this.f66067a0 = false;
            ByteBuffer byteBuffer = this.f66090s.f63705c;
            byte[] bArr = F0;
            byteBuffer.put(bArr);
            this.K.queueInputBuffer(this.f66072f0, 0, bArr.length, 0L, 0);
            I();
            this.f66089r0 = true;
            return true;
        }
        if (this.f66083o0 == 1) {
            for (int i10 = 0; i10 < this.L.f62973n.size(); i10++) {
                this.f66090s.f63705c.put(this.L.f62973n.get(i10));
            }
            this.f66083o0 = 2;
        }
        int iPosition = this.f66090s.f63705c.position();
        u uVarB = b();
        try {
            int iA = a(uVarB, this.f66090s, 0);
            if (hasReadStreamToEnd()) {
                this.f66097v0 = this.f66095u0;
            }
            if (iA == -3) {
                return false;
            }
            if (iA == -5) {
                if (this.f66083o0 == 2) {
                    this.f66090s.clear();
                    this.f66083o0 = 1;
                }
                a(uVarB);
                return true;
            }
            if (this.f66090s.isEndOfStream()) {
                if (this.f66083o0 == 2) {
                    this.f66090s.clear();
                    this.f66083o0 = 1;
                }
                this.f66099w0 = true;
                if (!this.f66089r0) {
                    B();
                    return false;
                }
                try {
                    if (!this.f66069c0) {
                        this.f66091s0 = true;
                        this.K.queueInputBuffer(this.f66072f0, 0, 0, 0L, 4);
                        I();
                    }
                    return false;
                } catch (MediaCodec.CryptoException e10) {
                    throw a(e10, this.B, g0.getErrorCodeForMediaDrmErrorCode(e10.getErrorCode()));
                }
            }
            if (!this.f66089r0 && !this.f66090s.isKeyFrame()) {
                this.f66090s.clear();
                if (this.f66083o0 == 2) {
                    this.f66083o0 = 1;
                }
                return true;
            }
            boolean zIsEncrypted = this.f66090s.isEncrypted();
            if (zIsEncrypted) {
                this.f66090s.f63704b.increaseClearDataFirstSubSampleBy(iPosition);
            }
            if (this.T && !zIsEncrypted) {
                io.odeeo.internal.q0.u.discardToSps(this.f66090s.f63705c);
                if (this.f66090s.f63705c.position() == 0) {
                    return true;
                }
                this.T = false;
            }
            io.odeeo.internal.e.g gVar = this.f66090s;
            long jUpdateAndGetPresentationTimeUs = gVar.f63707e;
            e eVar = this.f66070d0;
            if (eVar != null) {
                jUpdateAndGetPresentationTimeUs = eVar.updateAndGetPresentationTimeUs(this.B, gVar);
                this.f66095u0 = Math.max(this.f66095u0, this.f66070d0.getLastOutputBufferPresentationTimeUs(this.B));
            }
            long j10 = jUpdateAndGetPresentationTimeUs;
            if (this.f66090s.isDecodeOnly()) {
                this.f66098w.add(Long.valueOf(j10));
            }
            if (this.f66103y0) {
                this.f66096v.add(j10, this.B);
                this.f66103y0 = false;
            }
            this.f66095u0 = Math.max(this.f66095u0, j10);
            this.f66090s.flip();
            if (this.f66090s.hasSupplementalData()) {
                a(this.f66090s);
            }
            b(this.f66090s);
            try {
                if (zIsEncrypted) {
                    this.K.queueSecureInputBuffer(this.f66072f0, 0, this.f66090s.f63704b, j10, 0);
                } else {
                    this.K.queueInputBuffer(this.f66072f0, 0, this.f66090s.f63705c.limit(), j10, 0);
                }
                I();
                this.f66089r0 = true;
                this.f66083o0 = 0;
                this.B0.f63695c++;
                return true;
            } catch (MediaCodec.CryptoException e11) {
                throw a(e11, this.B, g0.getErrorCodeForMediaDrmErrorCode(e11.getErrorCode()));
            }
        } catch (g.a e12) {
            a(e12);
            a(0);
            p();
            return true;
        }
    }

    public final void C() {
        this.f66093t0 = true;
        MediaFormat outputFormat = this.K.getOutputFormat();
        if (this.S != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
            this.f66068b0 = true;
            return;
        }
        if (this.Z) {
            outputFormat.setInteger("channel-count", 1);
        }
        this.M = outputFormat;
        this.N = true;
    }

    public final void D() throws io.odeeo.internal.b.n {
        E();
        z();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void E() {
        try {
            h hVar = this.K;
            if (hVar != null) {
                hVar.release();
                this.B0.f63694b++;
                g(this.R.f66056a);
            }
            this.K = null;
            try {
                MediaCrypto mediaCrypto = this.F;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.K = null;
            try {
                MediaCrypto mediaCrypto2 = this.F;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th2;
            } finally {
            }
        }
    }

    public void G() {
        I();
        J();
        this.f66071e0 = C.TIME_UNSET;
        this.f66091s0 = false;
        this.f66089r0 = false;
        this.f66067a0 = false;
        this.f66068b0 = false;
        this.f66075i0 = false;
        this.f66076j0 = false;
        this.f66098w.clear();
        this.f66095u0 = C.TIME_UNSET;
        this.f66097v0 = C.TIME_UNSET;
        e eVar = this.f66070d0;
        if (eVar != null) {
            eVar.reset();
        }
        this.f66085p0 = 0;
        this.f66087q0 = 0;
        this.f66083o0 = this.f66081n0 ? 1 : 0;
    }

    public void H() {
        G();
        this.A0 = null;
        this.f66070d0 = null;
        this.P = null;
        this.R = null;
        this.L = null;
        this.M = null;
        this.N = false;
        this.f66093t0 = false;
        this.O = -1.0f;
        this.S = 0;
        this.T = false;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = false;
        this.Z = false;
        this.f66069c0 = false;
        this.f66081n0 = false;
        this.f66083o0 = 0;
        this.G = false;
    }

    public final void I() {
        this.f66072f0 = -1;
        this.f66090s.f63705c = null;
    }

    public final void J() {
        this.f66073g0 = -1;
        this.f66074h0 = null;
    }

    public final void K() {
        this.f66105z0 = true;
    }

    public final void L() throws MediaCryptoException, io.odeeo.internal.b.n {
        try {
            this.F.setMediaDrmSession(a(this.E).f63937b);
            b(this.E);
            this.f66085p0 = 0;
            this.f66087q0 = 0;
        } catch (MediaCryptoException e10) {
            throw a(e10, this.B, 6006);
        }
    }

    public float a(float f10, t tVar, t[] tVarArr) {
        return -1.0f;
    }

    public abstract int a(l lVar, t tVar) throws m.c;

    public abstract h.a a(j jVar, t tVar, MediaCrypto mediaCrypto, float f10);

    public abstract List<j> a(l lVar, t tVar, boolean z10) throws m.c;

    public abstract boolean a(long j10, long j11, h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t tVar) throws io.odeeo.internal.b.n;

    public void b(io.odeeo.internal.e.g gVar) throws io.odeeo.internal.b.n {
    }

    public final boolean d(long j10) {
        return this.H == C.TIME_UNSET || SystemClock.elapsedRealtime() - j10 < this.H;
    }

    public final void e(long j10) throws io.odeeo.internal.b.n {
        t tVarPollFloor = this.f66096v.pollFloor(j10);
        if (tVarPollFloor == null && this.N) {
            tVarPollFloor = this.f66096v.pollFirst();
        }
        if (tVarPollFloor != null) {
            this.C = tVarPollFloor;
        } else if (!this.N || this.C == null) {
            return;
        }
        a(this.C, this.M);
        this.N = false;
    }

    @Override // io.odeeo.internal.b.e
    public void f() {
        this.B = null;
        this.C0 = C.TIME_UNSET;
        this.D0 = C.TIME_UNSET;
        this.E0 = 0;
        r();
    }

    public void g(String str) {
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isEnded() {
        return this.f66101x0;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isReady() {
        if (this.B == null) {
            return false;
        }
        if (e() || y()) {
            return true;
        }
        return this.f66071e0 != C.TIME_UNSET && SystemClock.elapsedRealtime() < this.f66071e0;
    }

    public final void j() throws io.odeeo.internal.b.n {
        io.odeeo.internal.q0.a.checkState(!this.f66099w0);
        u uVarB = b();
        this.f66092t.clear();
        do {
            this.f66092t.clear();
            int iA = a(uVarB, this.f66092t, 0);
            if (iA == -5) {
                a(uVarB);
                return;
            }
            if (iA != -4) {
                if (iA != -3) {
                    throw new IllegalStateException();
                }
                return;
            } else {
                if (this.f66092t.isEndOfStream()) {
                    this.f66099w0 = true;
                    return;
                }
                if (this.f66103y0) {
                    t tVar = (t) io.odeeo.internal.q0.a.checkNotNull(this.B);
                    this.C = tVar;
                    a(tVar, (MediaFormat) null);
                    this.f66103y0 = false;
                }
                this.f66092t.flip();
            }
        } while (this.f66094u.append(this.f66092t));
        this.f66078l0 = true;
    }

    public final void k() {
        this.f66079m0 = false;
        this.f66094u.clear();
        this.f66092t.clear();
        this.f66078l0 = false;
        this.f66077k0 = false;
    }

    public final boolean l() {
        if (this.f66089r0) {
            this.f66085p0 = 1;
            if (this.U || this.W) {
                this.f66087q0 = 3;
                return false;
            }
            this.f66087q0 = 1;
        }
        return true;
    }

    public final void m() throws io.odeeo.internal.b.n {
        if (!this.f66089r0) {
            D();
        } else {
            this.f66085p0 = 1;
            this.f66087q0 = 3;
        }
    }

    public final boolean n() throws MediaCryptoException, io.odeeo.internal.b.n {
        if (this.f66089r0) {
            this.f66085p0 = 1;
            if (this.U || this.W) {
                this.f66087q0 = 3;
                return false;
            }
            this.f66087q0 = 2;
        } else {
            L();
        }
        return true;
    }

    public final void p() {
        try {
            this.K.flush();
        } finally {
            G();
        }
    }

    public final boolean q() throws io.odeeo.internal.b.n {
        boolean zR = r();
        if (zR) {
            z();
        }
        return zR;
    }

    public boolean r() {
        if (this.K == null) {
            return false;
        }
        if (this.f66087q0 == 3 || this.U || ((this.V && !this.f66093t0) || (this.W && this.f66091s0))) {
            E();
            return true;
        }
        p();
        return false;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public void render(long j10, long j11) throws io.odeeo.internal.b.n, MediaCryptoException {
        boolean z10 = false;
        if (this.f66105z0) {
            this.f66105z0 = false;
            B();
        }
        io.odeeo.internal.b.n nVar = this.A0;
        if (nVar != null) {
            this.A0 = null;
            throw nVar;
        }
        try {
            if (this.f66101x0) {
                F();
                return;
            }
            if (this.B != null || a(2)) {
                z();
                if (this.f66077k0) {
                    f0.beginSection("bypassRender");
                    while (a(j10, j11)) {
                    }
                    f0.endSection();
                } else if (this.K != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    f0.beginSection("drainAndFeed");
                    while (b(j10, j11) && d(jElapsedRealtime)) {
                    }
                    while (o() && d(jElapsedRealtime)) {
                    }
                    f0.endSection();
                } else {
                    this.B0.f63696d += a(j10);
                    a(1);
                }
                this.B0.ensureUpdated();
            }
        } catch (IllegalStateException e10) {
            if (!a(e10)) {
                throw e10;
            }
            a((Exception) e10);
            if (g0.f65861a >= 21 && c(e10)) {
                z10 = true;
            }
            if (z10) {
                E();
            }
            throw a(a(e10, t()), this.B, z10, 4003);
        }
    }

    public final h s() {
        return this.K;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public void setPlaybackSpeed(float f10, float f11) throws io.odeeo.internal.b.n {
        this.I = f10;
        this.J = f11;
        d(this.L);
    }

    public void setRenderTimeLimitMs(long j10) {
        this.H = j10;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.q0
    public final int supportsFormat(t tVar) throws io.odeeo.internal.b.n {
        try {
            return a(this.f66082o, tVar);
        } catch (m.c e10) {
            throw a(e10, tVar, 4002);
        }
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.q0
    public final int supportsMixedMimeTypeAdaptation() {
        return 8;
    }

    public final j t() {
        return this.R;
    }

    public boolean u() {
        return false;
    }

    public final MediaFormat v() {
        return this.M;
    }

    public final long w() {
        return this.D0;
    }

    public float x() {
        return this.I;
    }

    public final boolean y() {
        return this.f66073g0 >= 0;
    }

    public final void z() throws io.odeeo.internal.b.n {
        t tVar;
        if (this.K != null || this.f66077k0 || (tVar = this.B) == null) {
            return;
        }
        if (this.E == null && b(tVar)) {
            a(this.B);
            return;
        }
        b(this.E);
        String str = this.B.f62971l;
        io.odeeo.internal.f.f fVar = this.D;
        if (fVar != null) {
            if (this.F == null) {
                io.odeeo.internal.f.n nVarA = a(fVar);
                if (nVarA != null) {
                    try {
                        MediaCrypto mediaCrypto = new MediaCrypto(nVarA.f63936a, nVarA.f63937b);
                        this.F = mediaCrypto;
                        this.G = !nVarA.f63938c && mediaCrypto.requiresSecureDecoderComponent(str);
                    } catch (MediaCryptoException e10) {
                        throw a(e10, this.B, 6006);
                    }
                } else if (this.D.getError() == null) {
                    return;
                }
            }
            if (io.odeeo.internal.f.n.f63935d) {
                int state = this.D.getState();
                if (state == 1) {
                    f.a aVar = (f.a) io.odeeo.internal.q0.a.checkNotNull(this.D.getError());
                    throw a(aVar, this.B, aVar.f63917a);
                }
                if (state != 4) {
                    return;
                }
            }
        }
        try {
            a(this.F, this.G);
        } catch (a e11) {
            throw a(e11, this.B, 4001);
        }
    }

    public void a(t tVar, MediaFormat mediaFormat) throws io.odeeo.internal.b.n {
    }

    public boolean b(t tVar) {
        return false;
    }

    @Override // io.odeeo.internal.b.e
    public void g() {
        try {
            k();
            E();
        } finally {
            c((io.odeeo.internal.f.f) null);
        }
    }

    public void a(io.odeeo.internal.e.g gVar) throws io.odeeo.internal.b.n {
    }

    public boolean b(j jVar) {
        return true;
    }

    public void c(long j10) {
        while (true) {
            int i10 = this.E0;
            if (i10 == 0 || j10 < this.A[0]) {
                return;
            }
            long[] jArr = this.f66102y;
            this.C0 = jArr[0];
            this.D0 = this.f66104z[0];
            int i11 = i10 - 1;
            this.E0 = i11;
            System.arraycopy(jArr, 1, jArr, 0, i11);
            long[] jArr2 = this.f66104z;
            System.arraycopy(jArr2, 1, jArr2, 0, this.E0);
            long[] jArr3 = this.A;
            System.arraycopy(jArr3, 1, jArr3, 0, this.E0);
            A();
        }
    }

    public final boolean d(t tVar) throws io.odeeo.internal.b.n {
        if (g0.f65861a >= 23 && this.K != null && this.f66087q0 != 3 && getState() != 0) {
            float fA = a(this.J, tVar, d());
            float f10 = this.O;
            if (f10 == fA) {
                return true;
            }
            if (fA == -1.0f) {
                m();
                return false;
            }
            if (f10 == -1.0f && fA <= this.f66086q) {
                return true;
            }
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fA);
            this.K.setParameters(bundle);
            this.O = fA;
        }
        return true;
    }

    public void a(Exception exc) {
    }

    public final void b(io.odeeo.internal.f.f fVar) {
        io.odeeo.internal.f.f.replaceSession(this.D, fVar);
        this.D = fVar;
    }

    public void a(String str, long j10, long j11) {
    }

    public static boolean f(String str) {
        return g0.f65861a == 29 && "c2.android.aac.decoder".equals(str);
    }

    public final void a(io.odeeo.internal.b.n nVar) {
        this.A0 = nVar;
    }

    public final boolean b(long j10, long j11) throws io.odeeo.internal.b.n, MediaCryptoException {
        boolean z10;
        boolean zA;
        h hVar;
        ByteBuffer byteBuffer;
        int i10;
        MediaCodec.BufferInfo bufferInfo;
        int iDequeueOutputBufferIndex;
        if (!y()) {
            if (this.X && this.f66091s0) {
                try {
                    iDequeueOutputBufferIndex = this.K.dequeueOutputBufferIndex(this.f66100x);
                } catch (IllegalStateException unused) {
                    B();
                    if (this.f66101x0) {
                        E();
                    }
                    return false;
                }
            } else {
                iDequeueOutputBufferIndex = this.K.dequeueOutputBufferIndex(this.f66100x);
            }
            if (iDequeueOutputBufferIndex < 0) {
                if (iDequeueOutputBufferIndex == -2) {
                    C();
                    return true;
                }
                if (this.f66069c0 && (this.f66099w0 || this.f66085p0 == 2)) {
                    B();
                }
                return false;
            }
            if (this.f66068b0) {
                this.f66068b0 = false;
                this.K.releaseOutputBuffer(iDequeueOutputBufferIndex, false);
                return true;
            }
            MediaCodec.BufferInfo bufferInfo2 = this.f66100x;
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                B();
                return false;
            }
            this.f66073g0 = iDequeueOutputBufferIndex;
            ByteBuffer outputBuffer = this.K.getOutputBuffer(iDequeueOutputBufferIndex);
            this.f66074h0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(this.f66100x.offset);
                ByteBuffer byteBuffer2 = this.f66074h0;
                MediaCodec.BufferInfo bufferInfo3 = this.f66100x;
                byteBuffer2.limit(bufferInfo3.offset + bufferInfo3.size);
            }
            if (this.Y) {
                MediaCodec.BufferInfo bufferInfo4 = this.f66100x;
                if (bufferInfo4.presentationTimeUs == 0 && (bufferInfo4.flags & 4) != 0) {
                    long j12 = this.f66095u0;
                    if (j12 != C.TIME_UNSET) {
                        bufferInfo4.presentationTimeUs = j12;
                    }
                }
            }
            this.f66075i0 = b(this.f66100x.presentationTimeUs);
            long j13 = this.f66097v0;
            long j14 = this.f66100x.presentationTimeUs;
            this.f66076j0 = j13 == j14;
            e(j14);
        }
        if (this.X && this.f66091s0) {
            try {
                hVar = this.K;
                byteBuffer = this.f66074h0;
                i10 = this.f66073g0;
                bufferInfo = this.f66100x;
                z10 = false;
            } catch (IllegalStateException unused2) {
                z10 = false;
            }
            try {
                zA = a(j10, j11, hVar, byteBuffer, i10, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f66075i0, this.f66076j0, this.C);
            } catch (IllegalStateException unused3) {
                B();
                if (this.f66101x0) {
                    E();
                }
                return z10;
            }
        } else {
            z10 = false;
            h hVar2 = this.K;
            ByteBuffer byteBuffer3 = this.f66074h0;
            int i11 = this.f66073g0;
            MediaCodec.BufferInfo bufferInfo5 = this.f66100x;
            zA = a(j10, j11, hVar2, byteBuffer3, i11, bufferInfo5.flags, 1, bufferInfo5.presentationTimeUs, this.f66075i0, this.f66076j0, this.C);
        }
        if (zA) {
            c(this.f66100x.presentationTimeUs);
            boolean z11 = (this.f66100x.flags & 4) != 0 ? true : z10;
            J();
            if (!z11) {
                return true;
            }
            B();
        }
        return z10;
    }

    @Override // io.odeeo.internal.b.e
    public void a(boolean z10, boolean z11) throws io.odeeo.internal.b.n {
        this.B0 = new io.odeeo.internal.e.e();
    }

    public static boolean e(String str) {
        int i10 = g0.f65861a;
        if (i10 < 18) {
            return true;
        }
        if (i10 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) {
            return true;
        }
        if (i10 == 19 && g0.f65864d.startsWith("SM-G800")) {
            return "OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str);
        }
        return false;
    }

    @Override // io.odeeo.internal.b.e
    public void a(t[] tVarArr, long j10, long j11) throws io.odeeo.internal.b.n {
        if (this.D0 == C.TIME_UNSET) {
            io.odeeo.internal.q0.a.checkState(this.C0 == C.TIME_UNSET);
            this.C0 = j10;
            this.D0 = j11;
            return;
        }
        int i10 = this.E0;
        if (i10 == this.f66104z.length) {
            p.w("MediaCodecRenderer", "Too many stream changes, so dropping offset: " + this.f66104z[this.E0 - 1]);
        } else {
            this.E0 = i10 + 1;
        }
        long[] jArr = this.f66102y;
        int i11 = this.E0 - 1;
        jArr[i11] = j10;
        this.f66104z[i11] = j11;
        this.A[i11] = this.f66095u0;
    }

    public static boolean c(t tVar) {
        int i10 = tVar.E;
        return i10 == 0 || i10 == 2;
    }

    public static boolean c(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).isRecoverable();
        }
        return false;
    }

    public static boolean c(String str) {
        int i10 = g0.f65861a;
        if (i10 <= 23 && "OMX.google.vorbis.decoder".equals(str)) {
            return true;
        }
        if (i10 > 19) {
            return false;
        }
        String str2 = g0.f65862b;
        if ("hb2000".equals(str2) || "stvm8".equals(str2)) {
            return "OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str);
        }
        return false;
    }

    public static boolean d(String str) {
        return g0.f65861a == 21 && "OMX.google.aac.decoder".equals(str);
    }

    @Override // io.odeeo.internal.b.e
    public void a(long j10, boolean z10) throws io.odeeo.internal.b.n {
        this.f66099w0 = false;
        this.f66101x0 = false;
        this.f66105z0 = false;
        if (this.f66077k0) {
            this.f66094u.clear();
            this.f66092t.clear();
            this.f66078l0 = false;
        } else {
            q();
        }
        if (this.f66096v.size() > 0) {
            this.f66103y0 = true;
        }
        this.f66096v.clear();
        int i10 = this.E0;
        if (i10 != 0) {
            int i11 = i10 - 1;
            this.D0 = this.f66104z[i11];
            this.C0 = this.f66102y[i11];
            this.E0 = 0;
        }
    }

    public void A() {
    }

    public void F() throws io.odeeo.internal.b.n {
    }

    @Override // io.odeeo.internal.b.e
    public void h() {
    }

    @Override // io.odeeo.internal.b.e
    public void i() {
    }

    public i a(Throwable th2, j jVar) {
        return new i(th2, jVar);
    }

    public final boolean a(int i10) throws io.odeeo.internal.b.n, MediaCryptoException {
        u uVarB = b();
        this.f66088r.clear();
        int iA = a(uVarB, this.f66088r, i10 | 4);
        if (iA == -5) {
            a(uVarB);
            return true;
        }
        if (iA != -4 || !this.f66088r.isEndOfStream()) {
            return false;
        }
        this.f66099w0 = true;
        B();
        return false;
    }

    public final void a(MediaCrypto mediaCrypto, boolean z10) throws a {
        if (this.P == null) {
            try {
                List<j> listA = a(z10);
                ArrayDeque<j> arrayDeque = new ArrayDeque<>();
                this.P = arrayDeque;
                if (this.f66084p) {
                    arrayDeque.addAll(listA);
                } else if (!listA.isEmpty()) {
                    this.P.add(listA.get(0));
                }
                this.Q = null;
            } catch (m.c e10) {
                throw new a(this.B, e10, z10, -49998);
            }
        }
        if (!this.P.isEmpty()) {
            while (this.K == null) {
                j jVarPeekFirst = this.P.peekFirst();
                if (!b(jVarPeekFirst)) {
                    return;
                }
                try {
                    a(jVarPeekFirst, mediaCrypto);
                } catch (Exception e11) {
                    p.w("MediaCodecRenderer", "Failed to initialize decoder: " + jVarPeekFirst, e11);
                    this.P.removeFirst();
                    a aVar = new a(this.B, e11, z10, jVarPeekFirst);
                    a(aVar);
                    if (this.Q != null) {
                        this.Q = this.Q.a(aVar);
                    } else {
                        this.Q = aVar;
                    }
                    if (this.P.isEmpty()) {
                        throw this.Q;
                    }
                }
            }
            this.P = null;
            return;
        }
        throw new a(this.B, (Throwable) null, z10, -49999);
    }

    public final boolean b(long j10) {
        int size = this.f66098w.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f66098w.get(i10).longValue() == j10) {
                this.f66098w.remove(i10);
                return true;
            }
        }
        return false;
    }

    public static boolean b(IllegalStateException illegalStateException) {
        return illegalStateException instanceof MediaCodec.CodecException;
    }

    public static boolean b(String str) {
        if (g0.f65861a >= 21 || !"OMX.SEC.mp3.dec".equals(str) || !"samsung".equals(g0.f65863c)) {
            return false;
        }
        String str2 = g0.f65862b;
        return str2.startsWith("baffin") || str2.startsWith("grand") || str2.startsWith("fortuna") || str2.startsWith("gprimelte") || str2.startsWith("j2y18lte") || str2.startsWith("ms01");
    }

    public static boolean b(String str, t tVar) {
        return g0.f65861a <= 18 && tVar.f62984y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
    }

    public final List<j> a(boolean z10) throws m.c {
        List<j> listA = a(this.f66082o, this.B, z10);
        if (!listA.isEmpty() || !z10) {
            return listA;
        }
        List<j> listA2 = a(this.f66082o, this.B, false);
        if (!listA2.isEmpty()) {
            p.w("MediaCodecRenderer", "Drm session requires secure decoder for " + this.B.f62971l + ", but no secure decoder available. Trying to proceed with " + listA2 + ".");
        }
        return listA2;
    }

    public final void a(t tVar) {
        k();
        String str = tVar.f62971l;
        if (!MimeTypes.AUDIO_AAC.equals(str) && !MimeTypes.AUDIO_MPEG.equals(str) && !MimeTypes.AUDIO_OPUS.equals(str)) {
            this.f66094u.setMaxSampleCount(1);
        } else {
            this.f66094u.setMaxSampleCount(32);
        }
        this.f66077k0 = true;
    }

    public final void a(j jVar, MediaCrypto mediaCrypto) throws Exception {
        String str = jVar.f66056a;
        float fA = g0.f65861a < 23 ? -1.0f : a(this.J, this.B, d());
        float f10 = fA > this.f66086q ? fA : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        f0.beginSection("createCodec:" + str);
        this.K = this.f66080n.createAdapter(a(jVar, this.B, mediaCrypto, f10));
        long jElapsedRealtime2 = SystemClock.elapsedRealtime();
        this.R = jVar;
        this.O = f10;
        this.L = this.B;
        this.S = a(str);
        this.T = a(str, this.L);
        this.U = e(str);
        this.V = f(str);
        this.W = c(str);
        this.X = d(str);
        this.Y = b(str);
        this.Z = b(str, this.L);
        this.f66069c0 = a(jVar) || u();
        if (this.K.needsReconfiguration()) {
            this.f66081n0 = true;
            this.f66083o0 = 1;
            this.f66067a0 = this.S != 0;
        }
        if ("c2.android.mp3.decoder".equals(jVar.f66056a)) {
            this.f66070d0 = new e();
        }
        if (getState() == 2) {
            this.f66071e0 = SystemClock.elapsedRealtime() + 1000;
        }
        this.B0.f63693a++;
        a(str, jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime);
    }

    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public io.odeeo.internal.e.i a(io.odeeo.internal.b.u r12) throws io.odeeo.internal.b.n {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.r.k.a(io.odeeo.internal.b.u):io.odeeo.internal.e.i");
    }

    public io.odeeo.internal.e.i a(j jVar, t tVar, t tVar2) {
        return new io.odeeo.internal.e.i(jVar.f66056a, tVar, tVar2, 0, 1);
    }

    public final boolean a(j jVar, t tVar, io.odeeo.internal.f.f fVar, io.odeeo.internal.f.f fVar2) throws io.odeeo.internal.b.n {
        io.odeeo.internal.f.n nVarA;
        if (fVar == fVar2) {
            return false;
        }
        if (fVar2 == null || fVar == null || g0.f65861a < 23) {
            return true;
        }
        UUID uuid = io.odeeo.internal.b.h.f62713e;
        if (uuid.equals(fVar.getSchemeUuid()) || uuid.equals(fVar2.getSchemeUuid()) || (nVarA = a(fVar2)) == null) {
            return true;
        }
        return !jVar.f66062g && (nVarA.f63938c ? false : fVar2.requiresSecureDecoder(tVar.f62971l));
    }

    public final io.odeeo.internal.f.n a(io.odeeo.internal.f.f fVar) throws io.odeeo.internal.b.n {
        io.odeeo.internal.e.b cryptoConfig = fVar.getCryptoConfig();
        if (cryptoConfig != null && !(cryptoConfig instanceof io.odeeo.internal.f.n)) {
            throw a(new IllegalArgumentException("Expecting FrameworkCryptoConfig but found: " + cryptoConfig), this.B, AdError.MEDIAVIEW_MISSING_ERROR_CODE);
        }
        return (io.odeeo.internal.f.n) cryptoConfig;
    }

    public final boolean a(long j10, long j11) throws io.odeeo.internal.b.n {
        boolean z10;
        io.odeeo.internal.q0.a.checkState(!this.f66101x0);
        if (this.f66094u.hasSamples()) {
            d dVar = this.f66094u;
            z10 = false;
            if (!a(j10, j11, null, dVar.f63705c, this.f66073g0, 0, dVar.getSampleCount(), this.f66094u.getFirstSampleTimeUs(), this.f66094u.isDecodeOnly(), this.f66094u.isEndOfStream(), this.C)) {
                return false;
            }
            c(this.f66094u.getLastSampleTimeUs());
            this.f66094u.clear();
        } else {
            z10 = false;
        }
        if (this.f66099w0) {
            this.f66101x0 = true;
            return z10;
        }
        if (this.f66078l0) {
            io.odeeo.internal.q0.a.checkState(this.f66094u.append(this.f66092t));
            this.f66078l0 = z10;
        }
        if (this.f66079m0) {
            if (this.f66094u.hasSamples()) {
                return true;
            }
            k();
            this.f66079m0 = z10;
            z();
            if (!this.f66077k0) {
                return z10;
            }
        }
        j();
        if (this.f66094u.hasSamples()) {
            this.f66094u.flip();
        }
        if (this.f66094u.hasSamples() || this.f66099w0 || this.f66079m0) {
            return true;
        }
        return z10;
    }

    public static boolean a(IllegalStateException illegalStateException) {
        if (g0.f65861a >= 21 && b(illegalStateException)) {
            return true;
        }
        StackTraceElement[] stackTrace = illegalStateException.getStackTrace();
        return stackTrace.length > 0 && stackTrace[0].getClassName().equals("android.media.MediaCodec");
    }

    public final int a(String str) {
        int i10 = g0.f65861a;
        if (i10 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
            String str2 = g0.f65864d;
            if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                return 2;
            }
        }
        if (i10 >= 24) {
            return 0;
        }
        if (!"OMX.Nvidia.h264.decode".equals(str) && !"OMX.Nvidia.h264.decode.secure".equals(str)) {
            return 0;
        }
        String str3 = g0.f65862b;
        return ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) ? 1 : 0;
    }

    public static boolean a(String str, t tVar) {
        return g0.f65861a < 21 && tVar.f62973n.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
    }

    public static boolean a(j jVar) {
        String str = jVar.f66056a;
        int i10 = g0.f65861a;
        if (i10 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) {
            return true;
        }
        if (i10 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) {
            return true;
        }
        if (i10 > 29 || !("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) {
            return "Amazon".equals(g0.f65863c) && "AFTS".equals(g0.f65864d) && jVar.f66062g;
        }
        return true;
    }
}
