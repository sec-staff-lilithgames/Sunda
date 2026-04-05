package sf;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import bf.b1;
import com.amazon.device.ads.DtbConstants;
import com.google.android.exoplayer2.b3;
import com.google.android.exoplayer2.c3;
import com.google.android.exoplayer2.util.a1;
import com.google.android.exoplayer2.util.c1;
import com.google.android.exoplayer2.util.f0;
import com.google.android.exoplayer2.util.i0;
import com.google.android.exoplayer2.util.i1;
import com.google.android.exoplayer2.util.l0;
import com.google.android.exoplayer2.util.n1;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.exoplayer2.z0;
import com.google.android.gms.common.Scopes;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import nh.b5;
import qe.c0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h extends qe.t {

    /* renamed from: p1, reason: collision with root package name */
    public static final int[] f85642p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};

    /* renamed from: q1, reason: collision with root package name */
    public static boolean f85643q1;

    /* renamed from: r1, reason: collision with root package name */
    public static boolean f85644r1;
    public final Context H0;
    public final s I0;
    public final v J0;
    public final c K0;
    public final long L0;
    public final int M0;
    public final boolean N0;
    public a O0;
    public boolean P0;
    public boolean Q0;
    public Surface R0;
    public PlaceholderSurface S0;
    public boolean T0;
    public int U0;
    public boolean V0;
    public boolean W0;
    public boolean X0;
    public long Y0;
    public long Z0;

    /* renamed from: a1, reason: collision with root package name */
    public long f85645a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f85646b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f85647c1;

    /* renamed from: d1, reason: collision with root package name */
    public int f85648d1;

    /* renamed from: e1, reason: collision with root package name */
    public long f85649e1;

    /* renamed from: f1, reason: collision with root package name */
    public long f85650f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f85651g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f85652h1;

    /* renamed from: i1, reason: collision with root package name */
    public long f85653i1;

    /* renamed from: j1, reason: collision with root package name */
    public x f85654j1;

    /* renamed from: k1, reason: collision with root package name */
    public x f85655k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f85656l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f85657m1;

    /* renamed from: n1, reason: collision with root package name */
    public b f85658n1;

    /* renamed from: o1, reason: collision with root package name */
    public l f85659o1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f85660a;

        /* renamed from: b, reason: collision with root package name */
        public final int f85661b;

        /* renamed from: c, reason: collision with root package name */
        public final int f85662c;

        public a(int i10, int i11, int i12) {
            this.f85660a = i10;
            this.f85661b = i11;
            this.f85662c = i12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements qe.n, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f85663b;

        public b(qe.o oVar) {
            Handler handlerCreateHandlerForCurrentLooper = n1.createHandlerForCurrentLooper(this);
            this.f85663b = handlerCreateHandlerForCurrentLooper;
            oVar.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        public final void a(long j10) {
            h hVar = h.this;
            if (this != hVar.f85658n1 || hVar.L == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                hVar.A0 = true;
                return;
            }
            try {
                hVar.a0(j10);
                hVar.g0(hVar.f85654j1);
                hVar.C0.f12228e++;
                hVar.f0();
                hVar.I(j10);
            } catch (com.google.android.exoplayer2.r e10) {
                hVar.B0 = e10;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(n1.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // qe.n
        public void onFrameRendered(qe.o oVar, long j10, long j11) {
            if (n1.f28506a >= 30) {
                a(j10);
            } else {
                Handler handler = this.f85663b;
                handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final s f85665a;

        /* renamed from: b, reason: collision with root package name */
        public final h f85666b;

        /* renamed from: e, reason: collision with root package name */
        public Handler f85669e;

        /* renamed from: f, reason: collision with root package name */
        public CopyOnWriteArrayList f85670f;

        /* renamed from: g, reason: collision with root package name */
        public Pair f85671g;

        /* renamed from: h, reason: collision with root package name */
        public Pair f85672h;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque f85667c = new ArrayDeque();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayDeque f85668d = new ArrayDeque();

        /* renamed from: i, reason: collision with root package name */
        public int f85673i = -1;

        /* renamed from: j, reason: collision with root package name */
        public boolean f85674j = true;

        /* renamed from: k, reason: collision with root package name */
        public final x f85675k = x.f85734g;

        /* renamed from: l, reason: collision with root package name */
        public long f85676l = C.TIME_UNSET;

        /* renamed from: m, reason: collision with root package name */
        public final long f85677m = C.TIME_UNSET;

        public c(s sVar, h hVar) {
            this.f85665a = sVar;
            this.f85666b = hVar;
        }

        public MediaFormat amendMediaFormatKeys(MediaFormat mediaFormat) {
            if (n1.f28506a >= 29 && this.f85666b.H0.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        public void clearOutputSurfaceInfo() {
            com.google.android.exoplayer2.util.a.checkNotNull(null).getClass();
            throw new ClassCastException();
        }

        public void flush() {
            com.google.android.exoplayer2.util.a.checkStateNotNull(null);
            throw null;
        }

        public long getCorrectedFramePresentationTimeUs(long j10, long j11) {
            com.google.android.exoplayer2.util.a.checkState(this.f85677m != C.TIME_UNSET);
            return (j10 + j11) - this.f85677m;
        }

        public Surface getInputSurface() {
            com.google.android.exoplayer2.util.a.checkNotNull(null).getClass();
            throw new ClassCastException();
        }

        public boolean isEnabled() {
            return false;
        }

        public boolean isReady() {
            Pair pair = this.f85672h;
            return pair == null || !((a1) pair.second).equals(a1.f28409c);
        }

        public boolean maybeEnable(z0 z0Var, long j10) throws com.google.android.exoplayer2.r {
            Pair pairCreate;
            int i10;
            boolean z10 = true;
            com.google.android.exoplayer2.util.a.checkState(!isEnabled());
            if (!this.f85674j) {
                return false;
            }
            if (this.f85670f == null) {
                this.f85674j = false;
                return false;
            }
            this.f85669e = n1.createHandlerForCurrentLooper();
            sf.b bVar = z0Var.f28814z;
            h hVar = this.f85666b;
            hVar.getClass();
            if (sf.b.isTransferHdr(bVar)) {
                pairCreate = bVar.f85614e == 7 ? Pair.create(bVar, bVar.buildUpon().setColorTransfer(6).build()) : Pair.create(bVar, bVar);
            } else {
                sf.b bVar2 = sf.b.f85606h;
                pairCreate = Pair.create(bVar2, bVar2);
            }
            try {
                if (n1.f28506a < 21) {
                    z10 = false;
                }
                if (!z10 && (i10 = z0Var.f28810v) != 0) {
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f85670f;
                    i.createRotationEffect(i10);
                    copyOnWriteArrayList.add(0, null);
                }
                i.getFrameProcessorFactory();
                Objects.requireNonNull(this.f85669e);
                throw null;
            } catch (Exception e10) {
                throw hVar.a(e10, z0Var, false, 7000);
            }
        }

        public boolean maybeRegisterFrame(z0 z0Var, long j10, boolean z10) {
            com.google.android.exoplayer2.util.a.checkStateNotNull(null);
            com.google.android.exoplayer2.util.a.checkState(this.f85673i != -1);
            throw null;
        }

        public void onCodecInitialized(String str) {
            this.f85673i = n1.getMaxPendingFramesCountForMediaCodecDecoders(this.f85666b.H0, str, false);
        }

        public void releaseProcessedFrames(long j10, long j11) {
            com.google.android.exoplayer2.util.a.checkStateNotNull(null);
            ArrayDeque arrayDeque = this.f85667c;
            if (arrayDeque.isEmpty()) {
                return;
            }
            h hVar = this.f85666b;
            boolean z10 = hVar.getState() == 2;
            long jLongValue = ((Long) com.google.android.exoplayer2.util.a.checkNotNull((Long) arrayDeque.peek())).longValue();
            long j12 = jLongValue + this.f85677m;
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j13 = (long) ((j12 - j10) / hVar.J);
            if (z10) {
                j13 -= jElapsedRealtime - j11;
            }
            if (hVar.k0(j10, j13)) {
                com.google.android.exoplayer2.util.a.checkStateNotNull(null);
                throw null;
            }
            if (!z10 || j10 == hVar.Y0 || j13 > ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                return;
            }
            s sVar = this.f85665a;
            sVar.onNextFrame(j12);
            long jAdjustReleaseTime = sVar.adjustReleaseTime((j13 * 1000) + System.nanoTime());
            long jNanoTime = (jAdjustReleaseTime - System.nanoTime()) / 1000;
            hVar.getClass();
            if (jNanoTime < -30000) {
                com.google.android.exoplayer2.util.a.checkStateNotNull(null);
                throw null;
            }
            ArrayDeque arrayDeque2 = this.f85668d;
            if (!arrayDeque2.isEmpty() && j12 > ((Long) ((Pair) arrayDeque2.peek()).first).longValue()) {
                this.f85671g = (Pair) arrayDeque2.remove();
            }
            z0 z0Var = (z0) this.f85671g.second;
            l lVar = hVar.f85659o1;
            if (lVar != null) {
                lVar.onVideoFrameAboutToBeRendered(jLongValue, jAdjustReleaseTime, z0Var, hVar.N);
            }
            if (this.f85676l >= j12) {
                this.f85676l = C.TIME_UNSET;
                hVar.g0(this.f85675k);
            }
            com.google.android.exoplayer2.util.a.checkStateNotNull(null);
            throw null;
        }

        public boolean releasedLastFrame() {
            return false;
        }

        public void reset() {
            com.google.android.exoplayer2.util.a.checkNotNull(null).getClass();
            throw new ClassCastException();
        }

        public void setInputFormat(z0 z0Var) {
            if (com.google.android.exoplayer2.util.a.checkNotNull(null) != null) {
                throw new ClassCastException();
            }
            new com.google.android.exoplayer2.util.q(z0Var.f28807s, z0Var.f28808t).setPixelWidthHeightRatio(z0Var.f28811w).build();
            throw null;
        }

        public void setOutputSurfaceInfo(Surface surface, a1 a1Var) {
            Pair pair = this.f85672h;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((a1) this.f85672h.second).equals(a1Var)) {
                return;
            }
            this.f85672h = Pair.create(surface, a1Var);
            if (isEnabled()) {
                if (com.google.android.exoplayer2.util.a.checkNotNull(null) != null) {
                    throw new ClassCastException();
                }
                new c1(surface, a1Var.getWidth(), a1Var.getHeight());
                throw null;
            }
        }

        public void setVideoEffects(List<com.google.android.exoplayer2.util.l> list) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f85670f;
            if (copyOnWriteArrayList == null) {
                this.f85670f = new CopyOnWriteArrayList(list);
            } else {
                copyOnWriteArrayList.clear();
                this.f85670f.addAll(list);
            }
        }
    }

    public h(Context context, qe.v vVar) {
        this(context, vVar, 0L);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean c0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.h.c0(java.lang.String):boolean");
    }

    public static List d0(Context context, qe.v vVar, z0 z0Var, boolean z10, boolean z11) throws qe.x {
        String str = z0Var.f28802n;
        if (str == null) {
            return b5.of();
        }
        if (n1.f28506a >= 26 && "video/dolby-vision".equals(str) && !g.doesDisplaySupportDolbyVision(context)) {
            List<qe.r> alternativeDecoderInfos = c0.getAlternativeDecoderInfos(vVar, z0Var, z10, z11);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return c0.getDecoderInfosSoftMatch(vVar, z0Var, z10, z11);
    }

    public static int e0(qe.r rVar, z0 z0Var) {
        int i10 = z0Var.f28803o;
        List list = z0Var.f28804p;
        if (i10 == -1) {
            return getCodecMaxInputSize(rVar, z0Var);
        }
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return z0Var.f28803o + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getCodecMaxInputSize(qe.r r10, com.google.android.exoplayer2.z0 r11) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sf.h.getCodecMaxInputSize(qe.r, com.google.android.exoplayer2.z0):int");
    }

    @Override // qe.t
    public final void C(Exception exc) {
        f0.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.J0.videoCodecError(exc);
    }

    @Override // qe.t
    public final void D(String str, long j10, long j11) {
        this.J0.decoderInitialized(str, j10, j11);
        this.P0 = c0(str);
        this.Q0 = ((qe.r) com.google.android.exoplayer2.util.a.checkNotNull(this.S)).isHdr10PlusOutOfBandMetadataSupported();
        if (n1.f28506a >= 23 && this.f85656l1) {
            this.f85658n1 = new b((qe.o) com.google.android.exoplayer2.util.a.checkNotNull(this.L));
        }
        this.K0.onCodecInitialized(str);
    }

    @Override // qe.t
    public final void E(String str) {
        this.J0.decoderReleased(str);
    }

    @Override // qe.t
    public final ce.k F(com.google.android.exoplayer2.a1 a1Var) throws Exception {
        ce.k kVarF = super.F(a1Var);
        this.J0.inputFormatChanged(a1Var.f27030b, kVarF);
        return kVarF;
    }

    @Override // qe.t
    public final void G(z0 z0Var, MediaFormat mediaFormat) {
        int integer;
        int i10;
        qe.o oVar = this.L;
        if (oVar != null) {
            oVar.setVideoScalingMode(this.U0);
        }
        int i11 = 0;
        if (this.f85656l1) {
            i10 = z0Var.f28807s;
            integer = z0Var.f28808t;
        } else {
            com.google.android.exoplayer2.util.a.checkNotNull(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = z0Var.f28811w;
        int i12 = z0Var.f28810v;
        int i13 = n1.f28506a;
        c cVar = this.K0;
        if (i13 >= 21) {
            if (i12 == 90 || i12 == 270) {
                f10 = 1.0f / f10;
                int i14 = integer;
                integer = i10;
                i10 = i14;
            }
        } else if (!cVar.isEnabled()) {
            i11 = i12;
        }
        this.f85654j1 = new x(i10, integer, i11, f10);
        this.I0.onFormatChanged(z0Var.f28809u);
        if (cVar.isEnabled()) {
            cVar.setInputFormat(z0Var.buildUpon().setWidth(i10).setHeight(integer).setRotationDegrees(i11).setPixelWidthHeightRatio(f10).build());
        }
    }

    @Override // qe.t
    public final void I(long j10) {
        super.I(j10);
        if (this.f85656l1) {
            return;
        }
        this.f85648d1--;
    }

    @Override // qe.t
    public final void J() {
        b0();
    }

    @Override // qe.t
    public final void K(ce.h hVar) {
        boolean z10 = this.f85656l1;
        if (!z10) {
            this.f85648d1++;
        }
        if (n1.f28506a >= 23 || !z10) {
            return;
        }
        long j10 = hVar.f12239g;
        a0(j10);
        g0(this.f85654j1);
        this.C0.f12228e++;
        f0();
        I(j10);
    }

    @Override // qe.t
    public final void L(z0 z0Var) throws com.google.android.exoplayer2.r {
        c cVar = this.K0;
        if (cVar.isEnabled()) {
            return;
        }
        cVar.maybeEnable(z0Var, this.D0.f82900b);
    }

    @Override // qe.t
    public final boolean N(long j10, long j11, qe.o oVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, z0 z0Var) throws Exception {
        long j13;
        boolean z12;
        int iSkipData;
        int i13;
        boolean z13;
        com.google.android.exoplayer2.util.a.checkNotNull(oVar);
        if (this.Y0 == C.TIME_UNSET) {
            this.Y0 = j10;
        }
        long j14 = this.f85649e1;
        s sVar = this.I0;
        c cVar = this.K0;
        if (j12 != j14) {
            if (!cVar.isEnabled()) {
                sVar.onNextFrame(j12);
            }
            this.f85649e1 = j12;
        }
        long j15 = j12 - this.D0.f82900b;
        if (z10 && !z11) {
            m0(oVar, i10);
            return true;
        }
        boolean z14 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        boolean z15 = z14;
        long j16 = (long) ((j12 - j10) / this.J);
        if (z15) {
            j16 -= jElapsedRealtime - j11;
        }
        if (this.R0 == this.S0) {
            if (j16 >= -30000) {
                return false;
            }
            m0(oVar, i10);
            o0(j16);
            return true;
        }
        if (k0(j10, j16)) {
            if (!cVar.isEnabled()) {
                i13 = i10;
                z13 = true;
            } else if (cVar.maybeRegisterFrame(z0Var, j15, z11)) {
                i13 = i10;
                z13 = false;
            }
            i0(oVar, z0Var, i13, j15, z13);
            o0(j16);
            return true;
        }
        if (z15) {
            long j17 = j16;
            if (j10 != this.Y0) {
                long jNanoTime = System.nanoTime();
                long jAdjustReleaseTime = sVar.adjustReleaseTime((j17 * 1000) + jNanoTime);
                long j18 = !cVar.isEnabled() ? (jAdjustReleaseTime - jNanoTime) / 1000 : j17;
                boolean z16 = this.Z0 != C.TIME_UNSET;
                if (j18 < -500000 && !z11 && (iSkipData = ((b1) com.google.android.exoplayer2.util.a.checkNotNull(this.f27454j)).skipData(j10 - this.f27456l)) != 0) {
                    if (z16) {
                        ce.f fVar = this.C0;
                        fVar.f12227d += iSkipData;
                        fVar.f12229f += this.f85648d1;
                    } else {
                        this.C0.f12233j++;
                        n0(iSkipData, this.f85648d1);
                    }
                    if (s()) {
                        A();
                    }
                    if (cVar.isEnabled()) {
                        cVar.flush();
                        return false;
                    }
                } else {
                    if (j18 < -30000 && !z11) {
                        if (z16) {
                            m0(oVar, i10);
                            z12 = true;
                        } else {
                            i1.beginSection("dropVideoBuffer");
                            oVar.releaseOutputBuffer(i10, false);
                            i1.endSection();
                            z12 = true;
                            n0(0, 1);
                        }
                        o0(j18);
                        return z12;
                    }
                    if (cVar.isEnabled()) {
                        cVar.releaseProcessedFrames(j10, j11);
                        if (cVar.maybeRegisterFrame(z0Var, j15, z11)) {
                            i0(oVar, z0Var, i10, j15, false);
                            return true;
                        }
                    } else if (n1.f28506a >= 21) {
                        if (j18 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                            if (jAdjustReleaseTime == this.f85653i1) {
                                m0(oVar, i10);
                                j13 = jAdjustReleaseTime;
                            } else {
                                l lVar = this.f85659o1;
                                if (lVar != null) {
                                    j13 = jAdjustReleaseTime;
                                    lVar.onVideoFrameAboutToBeRendered(j15, j13, z0Var, this.N);
                                } else {
                                    j13 = jAdjustReleaseTime;
                                }
                                j0(oVar, i10, j13);
                            }
                            o0(j18);
                            this.f85653i1 = j13;
                            return true;
                        }
                    } else if (j18 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                        if (j18 > 11000) {
                            try {
                                Thread.sleep((j18 - 10000) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        l lVar2 = this.f85659o1;
                        if (lVar2 != null) {
                            lVar2.onVideoFrameAboutToBeRendered(j15, jAdjustReleaseTime, z0Var, this.N);
                        }
                        h0(oVar, i10);
                        o0(j18);
                        return true;
                    }
                }
            }
        }
        return false;
        return false;
    }

    @Override // qe.t
    public final void R() {
        super.R();
        this.f85648d1 = 0;
    }

    @Override // qe.t
    public final boolean V(qe.r rVar) {
        return this.R0 != null || l0(rVar);
    }

    @Override // qe.t
    public final int X(qe.v vVar, z0 z0Var) throws qe.x {
        boolean z10;
        int i10 = 0;
        if (!l0.isVideo(z0Var.f28802n)) {
            return b3.create(0);
        }
        boolean z11 = z0Var.f28805q != null;
        Context context = this.H0;
        List listD0 = d0(context, vVar, z0Var, z11, false);
        if (z11 && listD0.isEmpty()) {
            listD0 = d0(context, vVar, z0Var, false, false);
        }
        if (listD0.isEmpty()) {
            return b3.create(1);
        }
        int i11 = z0Var.I;
        if (i11 != 0 && i11 != 2) {
            return b3.create(2);
        }
        qe.r rVar = (qe.r) listD0.get(0);
        boolean zIsFormatSupported = rVar.isFormatSupported(z0Var);
        if (zIsFormatSupported) {
            z10 = true;
        } else {
            for (int i12 = 1; i12 < listD0.size(); i12++) {
                qe.r rVar2 = (qe.r) listD0.get(i12);
                if (rVar2.isFormatSupported(z0Var)) {
                    z10 = false;
                    zIsFormatSupported = true;
                    rVar = rVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i13 = zIsFormatSupported ? 4 : 3;
        int i14 = rVar.isSeamlessAdaptationSupported(z0Var) ? 16 : 8;
        int i15 = rVar.f82856g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (n1.f28506a >= 26 && "video/dolby-vision".equals(z0Var.f28802n) && !g.doesDisplaySupportDolbyVision(context)) {
            i16 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zIsFormatSupported) {
            List listD02 = d0(context, vVar, z0Var, z11, true);
            if (!listD02.isEmpty()) {
                qe.r rVar3 = c0.getDecoderInfosSortedByFormatSupport(listD02, z0Var).get(0);
                if (rVar3.isFormatSupported(z0Var) && rVar3.isSeamlessAdaptationSupported(z0Var)) {
                    i10 = 32;
                }
            }
        }
        return b3.create(i13, i14, i10, i15, i16);
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void b() {
        v vVar = this.J0;
        this.f85655k1 = null;
        b0();
        this.T0 = false;
        this.f85658n1 = null;
        try {
            super.b();
        } finally {
            vVar.disabled(this.C0);
            vVar.videoSizeChanged(x.f85734g);
        }
    }

    public final void b0() {
        qe.o oVar;
        this.V0 = false;
        if (n1.f28506a < 23 || !this.f85656l1 || (oVar = this.L) == null) {
            return;
        }
        this.f85658n1 = new b(oVar);
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void c(boolean z10, boolean z11) {
        super.c(z10, z11);
        boolean z12 = ((c3) com.google.android.exoplayer2.util.a.checkNotNull(this.f27450f)).f27356a;
        com.google.android.exoplayer2.util.a.checkState((z12 && this.f85657m1 == 0) ? false : true);
        if (this.f85656l1 != z12) {
            this.f85656l1 = z12;
            P();
        }
        this.J0.enabled(this.C0);
        this.W0 = z11;
        this.X0 = false;
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void d(long j10, boolean z10) throws Exception {
        super.d(j10, z10);
        c cVar = this.K0;
        if (cVar.isEnabled()) {
            cVar.flush();
        }
        b0();
        this.I0.onPositionReset();
        long jElapsedRealtime = C.TIME_UNSET;
        this.f85649e1 = C.TIME_UNSET;
        this.Y0 = C.TIME_UNSET;
        this.f85647c1 = 0;
        if (!z10) {
            this.Z0 = C.TIME_UNSET;
            return;
        }
        long j11 = this.L0;
        if (j11 > 0) {
            jElapsedRealtime = SystemClock.elapsedRealtime() + j11;
        }
        this.Z0 = jElapsedRealtime;
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void f() {
        c cVar = this.K0;
        try {
            super.f();
        } finally {
            if (cVar.isEnabled()) {
                cVar.reset();
            }
            PlaceholderSurface placeholderSurface = this.S0;
            if (placeholderSurface != null) {
                if (this.R0 == placeholderSurface) {
                    this.R0 = null;
                }
                placeholderSurface.release();
                this.S0 = null;
            }
        }
    }

    public final void f0() {
        this.X0 = true;
        if (this.V0) {
            return;
        }
        this.V0 = true;
        this.J0.renderedFirstFrame(this.R0);
        this.T0 = true;
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void g() {
        this.f85646b1 = 0;
        this.f85645a1 = SystemClock.elapsedRealtime();
        this.f85650f1 = SystemClock.elapsedRealtime() * 1000;
        this.f85651g1 = 0L;
        this.f85652h1 = 0;
        this.I0.onStarted();
    }

    public final void g0(x xVar) {
        if (xVar.equals(x.f85734g) || xVar.equals(this.f85655k1)) {
            return;
        }
        this.f85655k1 = xVar;
        this.J0.videoSizeChanged(xVar);
    }

    @Override // qe.t, com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.b3
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // qe.t, com.google.android.exoplayer2.f
    public final void h() {
        this.Z0 = C.TIME_UNSET;
        int i10 = this.f85646b1;
        v vVar = this.J0;
        if (i10 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            vVar.droppedFrames(this.f85646b1, jElapsedRealtime - this.f85645a1);
            this.f85646b1 = 0;
            this.f85645a1 = jElapsedRealtime;
        }
        int i11 = this.f85652h1;
        if (i11 != 0) {
            vVar.reportVideoFrameProcessingOffset(this.f85651g1, i11);
            this.f85651g1 = 0L;
            this.f85652h1 = 0;
        }
        this.I0.onStopped();
    }

    public final void h0(qe.o oVar, int i10) {
        i1.beginSection("releaseOutputBuffer");
        oVar.releaseOutputBuffer(i10, true);
        i1.endSection();
        this.C0.f12228e++;
        this.f85647c1 = 0;
        if (this.K0.isEnabled()) {
            return;
        }
        this.f85650f1 = SystemClock.elapsedRealtime() * 1000;
        g0(this.f85654j1);
        f0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v7, types: [android.view.Surface] */
    @Override // com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2, com.google.android.exoplayer2.t2
    public void handleMessage(int i10, Object obj) throws Exception {
        Surface surface;
        s sVar = this.I0;
        c cVar = this.K0;
        if (i10 != 1) {
            if (i10 == 7) {
                this.f85659o1 = (l) obj;
                return;
            }
            if (i10 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f85657m1 != iIntValue) {
                    this.f85657m1 = iIntValue;
                    if (this.f85656l1) {
                        P();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i10 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.U0 = iIntValue2;
                qe.o oVar = this.L;
                if (oVar != null) {
                    oVar.setVideoScalingMode(iIntValue2);
                    return;
                }
                return;
            }
            if (i10 == 5) {
                sVar.setChangeFrameRateStrategy(((Integer) obj).intValue());
                return;
            }
            if (i10 == 13) {
                cVar.setVideoEffects((List) com.google.android.exoplayer2.util.a.checkNotNull(obj));
                return;
            }
            if (i10 != 14) {
                super.handleMessage(i10, obj);
                return;
            }
            a1 a1Var = (a1) com.google.android.exoplayer2.util.a.checkNotNull(obj);
            if (a1Var.getWidth() == 0 || a1Var.getHeight() == 0 || (surface = this.R0) == null) {
                return;
            }
            cVar.setOutputSurfaceInfo(surface, a1Var);
            return;
        }
        PlaceholderSurface placeholderSurfaceNewInstanceV17 = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurfaceNewInstanceV17 == null) {
            PlaceholderSurface placeholderSurface = this.S0;
            if (placeholderSurface != null) {
                placeholderSurfaceNewInstanceV17 = placeholderSurface;
            } else {
                qe.r rVar = this.S;
                if (rVar != null && l0(rVar)) {
                    placeholderSurfaceNewInstanceV17 = PlaceholderSurface.newInstanceV17(this.H0, rVar.f82855f);
                    this.S0 = placeholderSurfaceNewInstanceV17;
                }
            }
        }
        Surface surface2 = this.R0;
        v vVar = this.J0;
        if (surface2 == placeholderSurfaceNewInstanceV17) {
            if (placeholderSurfaceNewInstanceV17 == null || placeholderSurfaceNewInstanceV17 == this.S0) {
                return;
            }
            x xVar = this.f85655k1;
            if (xVar != null) {
                vVar.videoSizeChanged(xVar);
            }
            if (this.T0) {
                vVar.renderedFirstFrame(this.R0);
                return;
            }
            return;
        }
        this.R0 = placeholderSurfaceNewInstanceV17;
        sVar.onSurfaceChanged(placeholderSurfaceNewInstanceV17);
        this.T0 = false;
        int state = getState();
        qe.o oVar2 = this.L;
        if (oVar2 != null && !cVar.isEnabled()) {
            if (n1.f28506a < 23 || placeholderSurfaceNewInstanceV17 == null || this.P0) {
                P();
                A();
            } else {
                oVar2.setOutputSurface(placeholderSurfaceNewInstanceV17);
            }
        }
        if (placeholderSurfaceNewInstanceV17 == null || placeholderSurfaceNewInstanceV17 == this.S0) {
            this.f85655k1 = null;
            b0();
            if (cVar.isEnabled()) {
                cVar.clearOutputSurfaceInfo();
                return;
            }
            return;
        }
        x xVar2 = this.f85655k1;
        if (xVar2 != null) {
            vVar.videoSizeChanged(xVar2);
        }
        b0();
        if (state == 2) {
            long j10 = this.L0;
            this.Z0 = j10 > 0 ? SystemClock.elapsedRealtime() + j10 : C.TIME_UNSET;
        }
        if (cVar.isEnabled()) {
            cVar.setOutputSurfaceInfo(placeholderSurfaceNewInstanceV17, a1.f28409c);
        }
    }

    public final void i0(qe.o oVar, z0 z0Var, int i10, long j10, boolean z10) {
        l lVar;
        c cVar = this.K0;
        long correctedFramePresentationTimeUs = cVar.isEnabled() ? cVar.getCorrectedFramePresentationTimeUs(j10, this.D0.f82900b) * 1000 : System.nanoTime();
        if (z10 && (lVar = this.f85659o1) != null) {
            lVar.onVideoFrameAboutToBeRendered(j10, correctedFramePresentationTimeUs, z0Var, this.N);
        }
        if (n1.f28506a >= 21) {
            j0(oVar, i10, correctedFramePresentationTimeUs);
        } else {
            h0(oVar, i10);
        }
    }

    @Override // qe.t, com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isEnded() {
        boolean zIsEnded = super.isEnded();
        c cVar = this.K0;
        return cVar.isEnabled() ? zIsEnded & cVar.releasedLastFrame() : zIsEnded;
    }

    @Override // qe.t, com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady()) {
            c cVar = this.K0;
            if ((!cVar.isEnabled() || cVar.isReady()) && (this.V0 || (((placeholderSurface = this.S0) != null && this.R0 == placeholderSurface) || this.L == null || this.f85656l1))) {
                this.Z0 = C.TIME_UNSET;
                return true;
            }
        }
        if (this.Z0 == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.Z0) {
            return true;
        }
        this.Z0 = C.TIME_UNSET;
        return false;
    }

    public final void j0(qe.o oVar, int i10, long j10) {
        i1.beginSection("releaseOutputBuffer");
        oVar.releaseOutputBuffer(i10, j10);
        i1.endSection();
        this.C0.f12228e++;
        this.f85647c1 = 0;
        if (this.K0.isEnabled()) {
            return;
        }
        this.f85650f1 = SystemClock.elapsedRealtime() * 1000;
        g0(this.f85654j1);
        f0();
    }

    public final boolean k0(long j10, long j11) {
        boolean z10 = getState() == 2;
        return this.Z0 == C.TIME_UNSET && j10 >= this.D0.f82900b && ((this.X0 ? !this.V0 : !(!z10 && !this.W0)) || (z10 && j11 < -30000 && (SystemClock.elapsedRealtime() * 1000) - this.f85650f1 > 100000));
    }

    @Override // qe.t
    public final ce.k l(qe.r rVar, z0 z0Var, z0 z0Var2) {
        ce.k kVarCanReuseCodec = rVar.canReuseCodec(z0Var, z0Var2);
        int i10 = kVarCanReuseCodec.f12248e;
        int i11 = z0Var2.f28807s;
        a aVar = this.O0;
        if (i11 > aVar.f85660a || z0Var2.f28808t > aVar.f85661b) {
            i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (e0(rVar, z0Var2) > this.O0.f85662c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new ce.k(rVar.f82850a, z0Var, z0Var2, i12 != 0 ? 0 : kVarCanReuseCodec.f12247d, i12);
    }

    public final boolean l0(qe.r rVar) {
        if (n1.f28506a < 23 || this.f85656l1 || c0(rVar.f82850a)) {
            return false;
        }
        return !rVar.f82855f || PlaceholderSurface.isSecureSupported(this.H0);
    }

    @Override // qe.t
    public final qe.p m(IllegalStateException illegalStateException, qe.r rVar) {
        return new f(illegalStateException, rVar, this.R0);
    }

    public final void m0(qe.o oVar, int i10) {
        i1.beginSection("skipVideoBuffer");
        oVar.releaseOutputBuffer(i10, false);
        i1.endSection();
        this.C0.f12229f++;
    }

    public final void n0(int i10, int i11) {
        int i12;
        ce.f fVar = this.C0;
        fVar.f12231h += i10;
        int i13 = i10 + i11;
        fVar.f12230g += i13;
        this.f85646b1 += i13;
        int i14 = this.f85647c1 + i13;
        this.f85647c1 = i14;
        fVar.f12232i = Math.max(i14, fVar.f12232i);
        int i15 = this.M0;
        if (i15 <= 0 || (i12 = this.f85646b1) < i15 || i12 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.J0.droppedFrames(this.f85646b1, jElapsedRealtime - this.f85645a1);
        this.f85646b1 = 0;
        this.f85645a1 = jElapsedRealtime;
    }

    public final void o0(long j10) {
        this.C0.addVideoFrameProcessingOffset(j10);
        this.f85651g1 += j10;
        this.f85652h1++;
    }

    @Override // qe.t, com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public void render(long j10, long j11) throws Exception {
        super.render(j10, j11);
        c cVar = this.K0;
        if (cVar.isEnabled()) {
            cVar.releaseProcessedFrames(j10, j11);
        }
    }

    @Override // qe.t, com.google.android.exoplayer2.f, com.google.android.exoplayer2.z2
    public void setPlaybackSpeed(float f10, float f11) throws Exception {
        super.setPlaybackSpeed(f10, f11);
        this.I0.onPlaybackSpeed(f10);
    }

    @Override // qe.t
    public final boolean u() {
        return this.f85656l1 && n1.f28506a < 23;
    }

    @Override // qe.t
    public final float v(float f10, z0[] z0VarArr) {
        float fMax = -1.0f;
        for (z0 z0Var : z0VarArr) {
            float f11 = z0Var.f28809u;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // qe.t
    public final List w(qe.v vVar, z0 z0Var, boolean z10) {
        return c0.getDecoderInfosSortedByFormatSupport(d0(this.H0, vVar, z0Var, z10, this.f85656l1), z0Var);
    }

    @Override // qe.t
    public final qe.l x(qe.r rVar, z0 z0Var, MediaCrypto mediaCrypto, float f10) {
        sf.b bVar;
        a aVar;
        Point point;
        z0[] z0VarArr;
        int i10;
        char c10;
        boolean z10;
        Pair<Integer, Integer> codecProfileAndLevel;
        int codecMaxInputSize;
        PlaceholderSurface placeholderSurface = this.S0;
        if (placeholderSurface != null && placeholderSurface.f28633b != rVar.f82855f) {
            if (this.R0 == placeholderSurface) {
                this.R0 = null;
            }
            placeholderSurface.release();
            this.S0 = null;
        }
        String str = rVar.f82852c;
        z0[] z0VarArr2 = (z0[]) com.google.android.exoplayer2.util.a.checkNotNull(this.f27455k);
        int i11 = z0Var.f28807s;
        float f11 = z0Var.f28809u;
        int i12 = z0Var.f28808t;
        sf.b bVar2 = z0Var.f28814z;
        int iE0 = e0(rVar, z0Var);
        if (z0VarArr2.length == 1) {
            if (iE0 != -1 && (codecMaxInputSize = getCodecMaxInputSize(rVar, z0Var)) != -1) {
                iE0 = Math.min((int) (iE0 * 1.5f), codecMaxInputSize);
            }
            aVar = new a(i11, i12, iE0);
            bVar = bVar2;
        } else {
            int length = z0VarArr2.length;
            int iMax = i11;
            int iMax2 = i12;
            int i13 = 0;
            boolean z11 = false;
            while (i13 < length) {
                z0 z0VarBuild = z0VarArr2[i13];
                int i14 = i13;
                if (bVar2 != null && z0VarBuild.f28814z == null) {
                    z0VarBuild = z0VarBuild.buildUpon().setColorInfo(bVar2).build();
                }
                if (rVar.canReuseCodec(z0Var, z0VarBuild).f12247d != 0) {
                    int i15 = z0VarBuild.f28807s;
                    z0VarArr = z0VarArr2;
                    int i16 = z0VarBuild.f28808t;
                    i10 = length;
                    c10 = 65535;
                    z11 |= i15 == -1 || i16 == -1;
                    iMax = Math.max(iMax, i15);
                    iMax2 = Math.max(iMax2, i16);
                    iE0 = Math.max(iE0, e0(rVar, z0VarBuild));
                } else {
                    z0VarArr = z0VarArr2;
                    i10 = length;
                    c10 = 65535;
                }
                i13 = i14 + 1;
                z0VarArr2 = z0VarArr;
                length = i10;
            }
            if (z11) {
                f0.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z12 = i12 > i11;
                int i17 = z12 ? i12 : i11;
                boolean z13 = z12;
                int i18 = z12 ? i11 : i12;
                float f12 = i18 / i17;
                bVar = bVar2;
                int i19 = 0;
                while (i19 < 9) {
                    int i20 = f85642p1[i19];
                    int i21 = i19;
                    int i22 = (int) (i20 * f12);
                    if (i20 <= i17 || i22 <= i18) {
                        break;
                    }
                    int i23 = i18;
                    int i24 = i17;
                    if (n1.f28506a >= 21) {
                        int i25 = z13 ? i22 : i20;
                        if (!z13) {
                            i20 = i22;
                        }
                        Point pointAlignVideoSizeV21 = rVar.alignVideoSizeV21(i25, i20);
                        if (rVar.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, f11)) {
                            point = pointAlignVideoSizeV21;
                            break;
                        }
                        i19 = i21 + 1;
                        i18 = i23;
                        i17 = i24;
                    } else {
                        try {
                            int iCeilDivide = n1.ceilDivide(i20, 16) * 16;
                            int iCeilDivide2 = n1.ceilDivide(i22, 16) * 16;
                            if (iCeilDivide * iCeilDivide2 <= c0.maxH264DecodableFrameSize()) {
                                int i26 = z13 ? iCeilDivide2 : iCeilDivide;
                                if (!z13) {
                                    iCeilDivide = iCeilDivide2;
                                }
                                point = new Point(i26, iCeilDivide);
                            } else {
                                i19 = i21 + 1;
                                i18 = i23;
                                i17 = i24;
                            }
                        } catch (qe.x unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    iE0 = Math.max(iE0, getCodecMaxInputSize(rVar, z0Var.buildUpon().setWidth(iMax).setHeight(iMax2).build()));
                    f0.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                bVar = bVar2;
            }
            aVar = new a(iMax, iMax2, iE0);
        }
        this.O0 = aVar;
        int i27 = this.f85656l1 ? this.f85657m1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i11);
        mediaFormat.setInteger("height", i12);
        i0.setCsdBuffers(mediaFormat, z0Var.f28804p);
        i0.maybeSetFloat(mediaFormat, "frame-rate", f11);
        i0.maybeSetInteger(mediaFormat, "rotation-degrees", z0Var.f28810v);
        i0.maybeSetColorInfo(mediaFormat, bVar);
        if ("video/dolby-vision".equals(z0Var.f28802n) && (codecProfileAndLevel = c0.getCodecProfileAndLevel(z0Var)) != null) {
            i0.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f85660a);
        mediaFormat.setInteger("max-height", aVar.f85661b);
        i0.maybeSetInteger(mediaFormat, "max-input-size", aVar.f85662c);
        if (n1.f28506a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.N0) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i27 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i27);
        }
        if (this.R0 == null) {
            if (!l0(rVar)) {
                throw new IllegalStateException();
            }
            if (this.S0 == null) {
                this.S0 = PlaceholderSurface.newInstanceV17(this.H0, rVar.f82855f);
            }
            this.R0 = this.S0;
        }
        c cVar = this.K0;
        if (cVar.isEnabled()) {
            mediaFormat = cVar.amendMediaFormatKeys(mediaFormat);
        }
        return qe.l.createForVideoDecoding(rVar, mediaFormat, z0Var, cVar.isEnabled() ? cVar.getInputSurface() : this.R0, mediaCrypto);
    }

    @Override // qe.t
    public final void y(ce.h hVar) {
        if (this.Q0) {
            ByteBuffer byteBuffer = (ByteBuffer) com.google.android.exoplayer2.util.a.checkNotNull(hVar.f12240h);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4) {
                    if (b12 == 0 || b12 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        qe.o oVar = this.L;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        oVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    public h(Context context, qe.v vVar, long j10) {
        this(context, vVar, j10, null, null, 0);
    }

    public h(Context context, qe.v vVar, long j10, Handler handler, w wVar, int i10) {
        this(context, qe.m.f82848a, vVar, j10, false, handler, wVar, i10, 30.0f);
    }

    public h(Context context, qe.v vVar, long j10, boolean z10, Handler handler, w wVar, int i10) {
        this(context, qe.m.f82848a, vVar, j10, z10, handler, wVar, i10, 30.0f);
    }

    public h(Context context, qe.m mVar, qe.v vVar, long j10, boolean z10, Handler handler, w wVar, int i10) {
        this(context, mVar, vVar, j10, z10, handler, wVar, i10, 30.0f);
    }

    public h(Context context, qe.m mVar, qe.v vVar, long j10, boolean z10, Handler handler, w wVar, int i10, float f10) {
        super(2, mVar, vVar, z10, f10);
        this.L0 = j10;
        this.M0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.H0 = applicationContext;
        s sVar = new s(applicationContext);
        this.I0 = sVar;
        this.J0 = new v(handler, wVar);
        this.K0 = new c(sVar, this);
        this.N0 = "NVIDIA".equals(n1.f28508c);
        this.Z0 = C.TIME_UNSET;
        this.U0 = 1;
        this.f85654j1 = x.f85734g;
        this.f85657m1 = 0;
        this.f85655k1 = null;
    }
}
