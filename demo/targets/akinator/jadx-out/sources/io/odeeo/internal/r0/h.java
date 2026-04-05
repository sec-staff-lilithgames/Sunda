package io.odeeo.internal.r0;

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
import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.common.Scopes;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import io.odeeo.internal.b.n;
import io.odeeo.internal.b.q0;
import io.odeeo.internal.b.t;
import io.odeeo.internal.b.u;
import io.odeeo.internal.q0.f0;
import io.odeeo.internal.q0.g0;
import io.odeeo.internal.q0.p;
import io.odeeo.internal.q0.s;
import io.odeeo.internal.r.h;
import io.odeeo.internal.r.m;
import io.odeeo.internal.r0.l;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class h extends io.odeeo.internal.r.k {

    /* renamed from: p1, reason: collision with root package name */
    public static final int[] f66171p1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};

    /* renamed from: q1, reason: collision with root package name */
    public static boolean f66172q1;

    /* renamed from: r1, reason: collision with root package name */
    public static boolean f66173r1;
    public final Context G0;
    public final k H0;
    public final l.a I0;
    public final long J0;
    public final int K0;
    public final boolean L0;
    public a M0;
    public boolean N0;
    public boolean O0;
    public Surface P0;
    public d Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public boolean V0;
    public long W0;
    public long X0;
    public long Y0;
    public int Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f66174a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f66175b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f66176c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f66177d1;

    /* renamed from: e1, reason: collision with root package name */
    public long f66178e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f66179f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f66180g1;

    /* renamed from: h1, reason: collision with root package name */
    public int f66181h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f66182i1;

    /* renamed from: j1, reason: collision with root package name */
    public float f66183j1;

    /* renamed from: k1, reason: collision with root package name */
    public m f66184k1;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f66185l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f66186m1;

    /* renamed from: n1, reason: collision with root package name */
    public b f66187n1;

    /* renamed from: o1, reason: collision with root package name */
    public j f66188o1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f66189a;

        /* renamed from: b, reason: collision with root package name */
        public final int f66190b;

        /* renamed from: c, reason: collision with root package name */
        public final int f66191c;

        public a(int i10, int i11, int i12) {
            this.f66189a = i10;
            this.f66190b = i11;
            this.f66191c = i12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b implements h.c, Handler.Callback {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f66192a;

        public b(io.odeeo.internal.r.h hVar) {
            Handler handlerCreateHandlerForCurrentLooper = g0.createHandlerForCurrentLooper(this);
            this.f66192a = handlerCreateHandlerForCurrentLooper;
            hVar.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        public final void a(long j10) {
            h hVar = h.this;
            if (this != hVar.f66187n1) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                hVar.W();
                return;
            }
            try {
                hVar.h(j10);
            } catch (n e10) {
                h.this.a(e10);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(g0.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // io.odeeo.internal.r.h.c
        public void onFrameRendered(io.odeeo.internal.r.h hVar, long j10, long j11) {
            if (g0.f65861a >= 30) {
                a(j10);
            } else {
                this.f66192a.sendMessageAtFrontOfQueue(Message.obtain(this.f66192a, 0, (int) (j10 >> 32), (int) j10));
            }
        }
    }

    public h(Context context, io.odeeo.internal.r.l lVar) {
        this(context, lVar, 0L);
    }

    public static boolean O() {
        return "NVIDIA".equals(g0.f65863c);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:610:0x082a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean P() {
        /*
            Method dump skipped, instructions count: 3046
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.r0.h.P():boolean");
    }

    public static boolean f(long j10) {
        return j10 < -30000;
    }

    public static boolean g(long j10) {
        return j10 < -500000;
    }

    @Override // io.odeeo.internal.r.k
    public void A() {
        super.A();
        M();
    }

    @Override // io.odeeo.internal.r.k
    public void G() {
        super.G();
        this.f66175b1 = 0;
    }

    public final void M() {
        io.odeeo.internal.r.h hVarS;
        this.T0 = false;
        if (g0.f65861a < 23 || !this.f66185l1 || (hVarS = s()) == null) {
            return;
        }
        this.f66187n1 = new b(hVarS);
    }

    public final void N() {
        this.f66184k1 = null;
    }

    public final void Q() {
        if (this.Z0 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.I0.droppedFrames(this.Z0, jElapsedRealtime - this.Y0);
            this.Z0 = 0;
            this.Y0 = jElapsedRealtime;
        }
    }

    public void R() {
        this.V0 = true;
        if (this.T0) {
            return;
        }
        this.T0 = true;
        this.I0.renderedFirstFrame(this.P0);
        this.R0 = true;
    }

    public final void S() {
        int i10 = this.f66179f1;
        if (i10 != 0) {
            this.I0.reportVideoFrameProcessingOffset(this.f66178e1, i10);
            this.f66178e1 = 0L;
            this.f66179f1 = 0;
        }
    }

    public final void T() {
        int i10 = this.f66180g1;
        if (i10 == -1 && this.f66181h1 == -1) {
            return;
        }
        m mVar = this.f66184k1;
        if (mVar != null && mVar.f66224a == i10 && mVar.f66225b == this.f66181h1 && mVar.f66226c == this.f66182i1 && mVar.f66227d == this.f66183j1) {
            return;
        }
        m mVar2 = new m(this.f66180g1, this.f66181h1, this.f66182i1, this.f66183j1);
        this.f66184k1 = mVar2;
        this.I0.videoSizeChanged(mVar2);
    }

    public final void U() {
        if (this.R0) {
            this.I0.renderedFirstFrame(this.P0);
        }
    }

    public final void V() {
        m mVar = this.f66184k1;
        if (mVar != null) {
            this.I0.videoSizeChanged(mVar);
        }
    }

    public final void W() {
        K();
    }

    public final void X() {
        Surface surface = this.P0;
        d dVar = this.Q0;
        if (surface == dVar) {
            this.P0 = null;
        }
        dVar.release();
        this.Q0 = null;
    }

    public final void Y() {
        this.X0 = this.J0 > 0 ? SystemClock.elapsedRealtime() + this.J0 : C.TIME_UNSET;
    }

    @Override // io.odeeo.internal.r.k
    public boolean b(io.odeeo.internal.r.j jVar) {
        return this.P0 != null || c(jVar);
    }

    @Override // io.odeeo.internal.r.k
    public void c(long j10) {
        super.c(j10);
        if (this.f66185l1) {
            return;
        }
        this.f66175b1--;
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0, io.odeeo.internal.b.q0
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void h() {
        super.h();
        this.Z0 = 0;
        this.Y0 = SystemClock.elapsedRealtime();
        this.f66177d1 = SystemClock.elapsedRealtime() * 1000;
        this.f66178e1 = 0L;
        this.f66179f1 = 0;
        this.H0.onStarted();
    }

    @Override // io.odeeo.internal.b.e, io.odeeo.internal.b.p0, io.odeeo.internal.b.m0.b
    public void handleMessage(int i10, Object obj) throws n {
        if (i10 == 1) {
            a(obj);
            return;
        }
        if (i10 == 7) {
            this.f66188o1 = (j) obj;
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f66186m1 != iIntValue) {
                this.f66186m1 = iIntValue;
                if (this.f66185l1) {
                    E();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                super.handleMessage(i10, obj);
                return;
            } else {
                this.H0.setChangeFrameRateStrategy(((Integer) obj).intValue());
                return;
            }
        }
        this.S0 = ((Integer) obj).intValue();
        io.odeeo.internal.r.h hVarS = s();
        if (hVarS != null) {
            hVarS.setVideoScalingMode(this.S0);
        }
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void i() {
        this.X0 = C.TIME_UNSET;
        Q();
        S();
        this.H0.onStopped();
        super.i();
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public boolean isReady() {
        d dVar;
        if (super.isReady() && (this.T0 || (((dVar = this.Q0) != null && this.P0 == dVar) || s() == null || this.f66185l1))) {
            this.X0 = C.TIME_UNSET;
            return true;
        }
        if (this.X0 == C.TIME_UNSET) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.X0) {
            return true;
        }
        this.X0 = C.TIME_UNSET;
        return false;
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e, io.odeeo.internal.b.p0
    public void setPlaybackSpeed(float f10, float f11) throws n {
        super.setPlaybackSpeed(f10, f11);
        this.H0.onPlaybackSpeed(f10);
    }

    @Override // io.odeeo.internal.r.k
    public boolean u() {
        return this.f66185l1 && g0.f65861a < 23;
    }

    public h(Context context, io.odeeo.internal.r.l lVar, long j10) {
        this(context, lVar, j10, null, null, 0);
    }

    @Override // io.odeeo.internal.r.k
    public void b(io.odeeo.internal.e.g gVar) throws n {
        boolean z10 = this.f66185l1;
        if (!z10) {
            this.f66175b1++;
        }
        if (g0.f65861a >= 23 || !z10) {
            return;
        }
        h(gVar.f63707e);
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void f() {
        N();
        M();
        this.R0 = false;
        this.H0.onDisabled();
        this.f66187n1 = null;
        try {
            super.f();
        } finally {
            this.I0.disabled(this.B0);
        }
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void g() {
        try {
            super.g();
        } finally {
            if (this.Q0 != null) {
                X();
            }
        }
    }

    public h(Context context, io.odeeo.internal.r.l lVar, long j10, Handler handler, l lVar2, int i10) {
        this(context, h.b.f66053a, lVar, j10, false, handler, lVar2, i10, 30.0f);
    }

    @Override // io.odeeo.internal.r.k
    public int a(io.odeeo.internal.r.l lVar, t tVar) throws m.c {
        int i10 = 0;
        if (!io.odeeo.internal.q0.t.isVideo(tVar.f62971l)) {
            return q0.create(0);
        }
        boolean z10 = tVar.f62974o != null;
        List<io.odeeo.internal.r.j> listA = a(lVar, tVar, z10, false);
        if (z10 && listA.isEmpty()) {
            listA = a(lVar, tVar, false, false);
        }
        if (listA.isEmpty()) {
            return q0.create(1);
        }
        if (!io.odeeo.internal.r.k.c(tVar)) {
            return q0.create(2);
        }
        io.odeeo.internal.r.j jVar = listA.get(0);
        boolean zIsFormatSupported = jVar.isFormatSupported(tVar);
        int i11 = jVar.isSeamlessAdaptationSupported(tVar) ? 16 : 8;
        if (zIsFormatSupported) {
            List<io.odeeo.internal.r.j> listA2 = a(lVar, tVar, z10, true);
            if (!listA2.isEmpty()) {
                io.odeeo.internal.r.j jVar2 = listA2.get(0);
                if (jVar2.isFormatSupported(tVar) && jVar2.isSeamlessAdaptationSupported(tVar)) {
                    i10 = 32;
                }
            }
        }
        return q0.create(zIsFormatSupported ? 4 : 3, i11, i10);
    }

    public h(Context context, io.odeeo.internal.r.l lVar, long j10, boolean z10, Handler handler, l lVar2, int i10) {
        this(context, h.b.f66053a, lVar, j10, z10, handler, lVar2, i10, 30.0f);
    }

    public boolean c(long j10, long j11) {
        return f(j10) && j11 > 100000;
    }

    public h(Context context, h.b bVar, io.odeeo.internal.r.l lVar, long j10, boolean z10, Handler handler, l lVar2, int i10) {
        this(context, bVar, lVar, j10, z10, handler, lVar2, i10, 30.0f);
    }

    public void c(io.odeeo.internal.r.h hVar, int i10, long j10) {
        f0.beginSection("skipVideoBuffer");
        hVar.releaseOutputBuffer(i10, false);
        f0.endSection();
        this.B0.f63698f++;
    }

    public h(Context context, h.b bVar, io.odeeo.internal.r.l lVar, long j10, boolean z10, Handler handler, l lVar2, int i10, float f10) {
        super(2, bVar, lVar, z10, f10);
        this.J0 = j10;
        this.K0 = i10;
        Context applicationContext = context.getApplicationContext();
        this.G0 = applicationContext;
        this.H0 = new k(applicationContext);
        this.I0 = new l.a(handler, lVar2);
        this.L0 = O();
        this.X0 = C.TIME_UNSET;
        this.f66180g1 = -1;
        this.f66181h1 = -1;
        this.f66183j1 = -1.0f;
        this.S0 = 1;
        this.f66186m1 = 0;
        N();
    }

    public boolean b(long j10, long j11, boolean z10) {
        return f(j10) && !z10;
    }

    public void i(long j10) {
        this.B0.addVideoFrameProcessingOffset(j10);
        this.f66178e1 += j10;
        this.f66179f1++;
    }

    public boolean b(long j10, boolean z10) throws n {
        int iA = a(j10);
        if (iA == 0) {
            return false;
        }
        io.odeeo.internal.e.e eVar = this.B0;
        eVar.f63701i++;
        int i10 = this.f66175b1 + iA;
        if (z10) {
            eVar.f63698f += i10;
        } else {
            b(i10);
        }
        q();
        return true;
    }

    @Override // io.odeeo.internal.r.k
    public void g(String str) {
        this.I0.decoderReleased(str);
    }

    public void h(long j10) throws n {
        e(j10);
        T();
        this.B0.f63697e++;
        R();
        c(j10);
    }

    public final boolean c(io.odeeo.internal.r.j jVar) {
        if (g0.f65861a < 23 || this.f66185l1 || h(jVar.f66056a)) {
            return false;
        }
        return !jVar.f66062g || d.isSecureSupported(this.G0);
    }

    public static int c(io.odeeo.internal.r.j jVar, t tVar) {
        if (tVar.f62972m != -1) {
            int size = tVar.f62973n.size();
            int length = 0;
            for (int i10 = 0; i10 < size; i10++) {
                length += tVar.f62973n.get(i10).length;
            }
            return tVar.f62972m + length;
        }
        return a(jVar, tVar);
    }

    public void b(int i10) {
        io.odeeo.internal.e.e eVar = this.B0;
        eVar.f63699g += i10;
        this.Z0 += i10;
        int i11 = this.f66174a1 + i10;
        this.f66174a1 = i11;
        eVar.f63700h = Math.max(i11, eVar.f63700h);
        int i12 = this.K0;
        if (i12 <= 0 || this.Z0 < i12) {
            return;
        }
        Q();
    }

    public boolean h(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (h.class) {
            try {
                if (!f66172q1) {
                    f66173r1 = P();
                    f66172q1 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f66173r1;
    }

    public void b(io.odeeo.internal.r.h hVar, int i10, long j10) {
        T();
        f0.beginSection("releaseOutputBuffer");
        hVar.releaseOutputBuffer(i10, true);
        f0.endSection();
        this.f66177d1 = SystemClock.elapsedRealtime() * 1000;
        this.B0.f63697e++;
        this.f66174a1 = 0;
        R();
    }

    @Override // io.odeeo.internal.r.k
    public List<io.odeeo.internal.r.j> a(io.odeeo.internal.r.l lVar, t tVar, boolean z10) throws m.c {
        return a(lVar, tVar, z10, this.f66185l1);
    }

    public static List<io.odeeo.internal.r.j> a(io.odeeo.internal.r.l lVar, t tVar, boolean z10, boolean z11) throws m.c {
        Pair<Integer, Integer> codecProfileAndLevel;
        String str = tVar.f62971l;
        if (str == null) {
            return Collections.EMPTY_LIST;
        }
        List<io.odeeo.internal.r.j> decoderInfosSortedByFormatSupport = io.odeeo.internal.r.m.getDecoderInfosSortedByFormatSupport(lVar.getDecoderInfos(str, z10, z11), tVar);
        if ("video/dolby-vision".equals(str) && (codecProfileAndLevel = io.odeeo.internal.r.m.getCodecProfileAndLevel(tVar)) != null) {
            int iIntValue = ((Integer) codecProfileAndLevel.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                decoderInfosSortedByFormatSupport.addAll(lVar.getDecoderInfos("video/hevc", z10, z11));
            } else if (iIntValue == 512) {
                decoderInfosSortedByFormatSupport.addAll(lVar.getDecoderInfos("video/avc", z10, z11));
            }
        }
        return Collections.unmodifiableList(decoderInfosSortedByFormatSupport);
    }

    public static Point b(io.odeeo.internal.r.j jVar, t tVar) {
        int i10 = tVar.f62977r;
        int i11 = tVar.f62976q;
        boolean z10 = i10 > i11;
        int i12 = z10 ? i10 : i11;
        if (z10) {
            i10 = i11;
        }
        float f10 = i10 / i12;
        for (int i13 : f66171p1) {
            int i14 = (int) (i13 * f10);
            if (i13 <= i12 || i14 <= i10) {
                break;
            }
            if (g0.f65861a >= 21) {
                int i15 = z10 ? i14 : i13;
                if (!z10) {
                    i13 = i14;
                }
                Point pointAlignVideoSizeV21 = jVar.alignVideoSizeV21(i15, i13);
                if (jVar.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, tVar.f62978s)) {
                    return pointAlignVideoSizeV21;
                }
            } else {
                try {
                    int iCeilDivide = g0.ceilDivide(i13, 16) * 16;
                    int iCeilDivide2 = g0.ceilDivide(i14, 16) * 16;
                    if (iCeilDivide * iCeilDivide2 <= io.odeeo.internal.r.m.maxH264DecodableFrameSize()) {
                        int i16 = z10 ? iCeilDivide2 : iCeilDivide;
                        if (!z10) {
                            iCeilDivide = iCeilDivide2;
                        }
                        return new Point(i16, iCeilDivide);
                    }
                } catch (m.c unused) {
                }
            }
        }
        return null;
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void a(boolean z10, boolean z11) throws n {
        super.a(z10, z11);
        boolean z12 = a().f62958a;
        io.odeeo.internal.q0.a.checkState((z12 && this.f66186m1 == 0) ? false : true);
        if (this.f66185l1 != z12) {
            this.f66185l1 = z12;
            E();
        }
        this.I0.enabled(this.B0);
        this.H0.onEnabled();
        this.U0 = z11;
        this.V0 = false;
    }

    @Override // io.odeeo.internal.r.k, io.odeeo.internal.b.e
    public void a(long j10, boolean z10) throws n {
        super.a(j10, z10);
        M();
        this.H0.onPositionReset();
        this.f66176c1 = C.TIME_UNSET;
        this.W0 = C.TIME_UNSET;
        this.f66174a1 = 0;
        if (z10) {
            Y();
        } else {
            this.X0 = C.TIME_UNSET;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [io.odeeo.internal.b.e, io.odeeo.internal.r.k, io.odeeo.internal.r0.h] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.view.Surface] */
    public final void a(Object obj) throws n {
        d dVarNewInstanceV17 = obj instanceof Surface ? (Surface) obj : null;
        if (dVarNewInstanceV17 == null) {
            d dVar = this.Q0;
            if (dVar != null) {
                dVarNewInstanceV17 = dVar;
            } else {
                io.odeeo.internal.r.j jVarT = t();
                if (jVarT != null && c(jVarT)) {
                    dVarNewInstanceV17 = d.newInstanceV17(this.G0, jVarT.f66062g);
                    this.Q0 = dVarNewInstanceV17;
                }
            }
        }
        if (this.P0 != dVarNewInstanceV17) {
            this.P0 = dVarNewInstanceV17;
            this.H0.onSurfaceChanged(dVarNewInstanceV17);
            this.R0 = false;
            int state = getState();
            io.odeeo.internal.r.h hVarS = s();
            if (hVarS != null) {
                if (g0.f65861a >= 23 && dVarNewInstanceV17 != null && !this.N0) {
                    a(hVarS, dVarNewInstanceV17);
                } else {
                    E();
                    z();
                }
            }
            if (dVarNewInstanceV17 != null && dVarNewInstanceV17 != this.Q0) {
                V();
                M();
                if (state == 2) {
                    Y();
                    return;
                }
                return;
            }
            N();
            M();
            return;
        }
        if (dVarNewInstanceV17 == null || dVarNewInstanceV17 == this.Q0) {
            return;
        }
        V();
        U();
    }

    @Override // io.odeeo.internal.r.k
    public h.a a(io.odeeo.internal.r.j jVar, t tVar, MediaCrypto mediaCrypto, float f10) {
        d dVar = this.Q0;
        if (dVar != null && dVar.f66141a != jVar.f66062g) {
            X();
        }
        String str = jVar.f66058c;
        a aVarA = a(jVar, tVar, d());
        this.M0 = aVarA;
        MediaFormat mediaFormatA = a(tVar, str, aVarA, f10, this.L0, this.f66185l1 ? this.f66186m1 : 0);
        if (this.P0 == null) {
            if (c(jVar)) {
                if (this.Q0 == null) {
                    this.Q0 = d.newInstanceV17(this.G0, jVar.f66062g);
                }
                this.P0 = this.Q0;
            } else {
                throw new IllegalStateException();
            }
        }
        return h.a.createForVideoDecoding(jVar, mediaFormatA, tVar, this.P0, mediaCrypto);
    }

    @Override // io.odeeo.internal.r.k
    public io.odeeo.internal.e.i a(io.odeeo.internal.r.j jVar, t tVar, t tVar2) {
        io.odeeo.internal.e.i iVarCanReuseCodec = jVar.canReuseCodec(tVar, tVar2);
        int i10 = iVarCanReuseCodec.f63719e;
        int i11 = tVar2.f62976q;
        a aVar = this.M0;
        if (i11 > aVar.f66189a || tVar2.f62977r > aVar.f66190b) {
            i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (c(jVar, tVar2) > this.M0.f66191c) {
            i10 |= 64;
        }
        int i12 = i10;
        return new io.odeeo.internal.e.i(jVar.f66056a, tVar, tVar2, i12 != 0 ? 0 : iVarCanReuseCodec.f63718d, i12);
    }

    @Override // io.odeeo.internal.r.k
    public float a(float f10, t tVar, t[] tVarArr) {
        float fMax = -1.0f;
        for (t tVar2 : tVarArr) {
            float f11 = tVar2.f62978s;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // io.odeeo.internal.r.k
    public void a(String str, long j10, long j11) {
        this.I0.decoderInitialized(str, j10, j11);
        this.N0 = h(str);
        this.O0 = ((io.odeeo.internal.r.j) io.odeeo.internal.q0.a.checkNotNull(t())).isHdr10PlusOutOfBandMetadataSupported();
        if (g0.f65861a < 23 || !this.f66185l1) {
            return;
        }
        this.f66187n1 = new b((io.odeeo.internal.r.h) io.odeeo.internal.q0.a.checkNotNull(s()));
    }

    @Override // io.odeeo.internal.r.k
    public void a(Exception exc) {
        p.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.I0.videoCodecError(exc);
    }

    @Override // io.odeeo.internal.r.k
    public io.odeeo.internal.e.i a(u uVar) throws n {
        io.odeeo.internal.e.i iVarA = super.a(uVar);
        this.I0.inputFormatChanged(uVar.f63020b, iVarA);
        return iVarA;
    }

    @Override // io.odeeo.internal.r.k
    public void a(t tVar, MediaFormat mediaFormat) {
        int integer;
        int integer2;
        io.odeeo.internal.r.h hVarS = s();
        if (hVarS != null) {
            hVarS.setVideoScalingMode(this.S0);
        }
        if (this.f66185l1) {
            this.f66180g1 = tVar.f62976q;
            this.f66181h1 = tVar.f62977r;
        } else {
            io.odeeo.internal.q0.a.checkNotNull(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z10) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.f66180g1 = integer;
            if (z10) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.f66181h1 = integer2;
        }
        float f10 = tVar.f62980u;
        this.f66183j1 = f10;
        if (g0.f65861a >= 21) {
            int i10 = tVar.f62979t;
            if (i10 == 90 || i10 == 270) {
                int i11 = this.f66180g1;
                this.f66180g1 = this.f66181h1;
                this.f66181h1 = i11;
                this.f66183j1 = 1.0f / f10;
            }
        } else {
            this.f66182i1 = tVar.f62979t;
        }
        this.H0.onFormatChanged(tVar.f62978s);
    }

    @Override // io.odeeo.internal.r.k
    public void a(io.odeeo.internal.e.g gVar) throws n {
        if (this.O0) {
            ByteBuffer byteBuffer = (ByteBuffer) io.odeeo.internal.q0.a.checkNotNull(gVar.f63708f);
            if (byteBuffer.remaining() >= 7) {
                byte b10 = byteBuffer.get();
                short s10 = byteBuffer.getShort();
                short s11 = byteBuffer.getShort();
                byte b11 = byteBuffer.get();
                byte b12 = byteBuffer.get();
                byteBuffer.position(0);
                if (b10 == -75 && s10 == 60 && s11 == 1 && b11 == 4 && b12 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(s(), bArr);
                }
            }
        }
    }

    @Override // io.odeeo.internal.r.k
    public boolean a(long j10, long j11, io.odeeo.internal.r.h hVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, t tVar) throws n, InterruptedException {
        boolean z12;
        boolean z13;
        h hVar2;
        io.odeeo.internal.q0.a.checkNotNull(hVar);
        if (this.W0 == C.TIME_UNSET) {
            this.W0 = j10;
        }
        if (j12 != this.f66176c1) {
            this.H0.onNextFrame(j12);
            this.f66176c1 = j12;
        }
        long jW = w();
        long j13 = j12 - jW;
        if (z10 && !z11) {
            c(hVar, i10, j13);
            return true;
        }
        double dX = x();
        boolean z14 = getState() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j14 = (long) ((j12 - j10) / dX);
        if (z14) {
            j14 -= jElapsedRealtime - j11;
        }
        if (this.P0 == this.Q0) {
            if (!f(j14)) {
                return false;
            }
            c(hVar, i10, j13);
            i(j14);
            return true;
        }
        long j15 = jElapsedRealtime - this.f66177d1;
        if (this.V0 ? this.T0 : !(z14 || this.U0)) {
            z12 = true;
            z13 = false;
        } else {
            z12 = true;
            z13 = true;
        }
        if (this.X0 == C.TIME_UNSET && j10 >= jW && (z13 || (z14 && c(j14, j15)))) {
            long jNanoTime = System.nanoTime();
            a(j13, jNanoTime, tVar);
            if (g0.f65861a >= 21) {
                a(hVar, i10, j13, jNanoTime);
                hVar2 = this;
            } else {
                hVar2 = this;
                hVar2.b(hVar, i10, j13);
            }
            hVar2.i(j14);
            return z12;
        }
        if (z14 && j10 != this.W0) {
            long jNanoTime2 = System.nanoTime();
            long jAdjustReleaseTime = this.H0.adjustReleaseTime((j14 * 1000) + jNanoTime2);
            long j16 = (jAdjustReleaseTime - jNanoTime2) / 1000;
            boolean z15 = this.X0 != C.TIME_UNSET ? z12 : false;
            if (a(j16, j11, z11) && b(j10, z15)) {
                return false;
            }
            if (b(j16, j11, z11)) {
                if (z15) {
                    c(hVar, i10, j13);
                } else {
                    a(hVar, i10, j13);
                }
                i(j16);
                return z12;
            }
            if (g0.f65861a >= 21) {
                if (j16 < ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT) {
                    a(j13, jAdjustReleaseTime, tVar);
                    a(hVar, i10, j13, jAdjustReleaseTime);
                    i(j16);
                    return z12;
                }
            } else if (j16 < CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                if (j16 > 11000) {
                    try {
                        Thread.sleep((j16 - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                a(j13, jAdjustReleaseTime, tVar);
                b(hVar, i10, j13);
                i(j16);
                return z12;
            }
        }
        return false;
    }

    public final void a(long j10, long j11, t tVar) {
        j jVar = this.f66188o1;
        if (jVar != null) {
            jVar.onVideoFrameAboutToBeRendered(j10, j11, tVar, v());
        }
    }

    public boolean a(long j10, long j11, boolean z10) {
        return g(j10) && !z10;
    }

    public void a(io.odeeo.internal.r.h hVar, int i10, long j10) {
        f0.beginSection("dropVideoBuffer");
        hVar.releaseOutputBuffer(i10, false);
        f0.endSection();
        b(1);
    }

    public void a(io.odeeo.internal.r.h hVar, int i10, long j10, long j11) {
        T();
        f0.beginSection("releaseOutputBuffer");
        hVar.releaseOutputBuffer(i10, j11);
        f0.endSection();
        this.f66177d1 = SystemClock.elapsedRealtime() * 1000;
        this.B0.f63697e++;
        this.f66174a1 = 0;
        R();
    }

    public static void a(io.odeeo.internal.r.h hVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        hVar.setParameters(bundle);
    }

    public void a(io.odeeo.internal.r.h hVar, Surface surface) {
        hVar.setOutputSurface(surface);
    }

    public static void a(MediaFormat mediaFormat, int i10) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i10);
    }

    public MediaFormat a(t tVar, String str, a aVar, float f10, boolean z10, int i10) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", tVar.f62976q);
        mediaFormat.setInteger("height", tVar.f62977r);
        s.setCsdBuffers(mediaFormat, tVar.f62973n);
        s.maybeSetFloat(mediaFormat, "frame-rate", tVar.f62978s);
        s.maybeSetInteger(mediaFormat, "rotation-degrees", tVar.f62979t);
        s.maybeSetColorInfo(mediaFormat, tVar.f62983x);
        if ("video/dolby-vision".equals(tVar.f62971l) && (codecProfileAndLevel = io.odeeo.internal.r.m.getCodecProfileAndLevel(tVar)) != null) {
            s.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f66189a);
        mediaFormat.setInteger("max-height", aVar.f66190b);
        s.maybeSetInteger(mediaFormat, "max-input-size", aVar.f66191c);
        if (g0.f65861a >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (z10) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i10 != 0) {
            a(mediaFormat, i10);
        }
        return mediaFormat;
    }

    public a a(io.odeeo.internal.r.j jVar, t tVar, t[] tVarArr) {
        int iA;
        int iMax = tVar.f62976q;
        int iMax2 = tVar.f62977r;
        int iC = c(jVar, tVar);
        if (tVarArr.length == 1) {
            if (iC != -1 && (iA = a(jVar, tVar)) != -1) {
                iC = Math.min((int) (iC * 1.5f), iA);
            }
            return new a(iMax, iMax2, iC);
        }
        int length = tVarArr.length;
        boolean z10 = false;
        for (int i10 = 0; i10 < length; i10++) {
            t tVarBuild = tVarArr[i10];
            if (tVar.f62983x != null && tVarBuild.f62983x == null) {
                tVarBuild = tVarBuild.buildUpon().setColorInfo(tVar.f62983x).build();
            }
            if (jVar.canReuseCodec(tVar, tVarBuild).f63718d != 0) {
                int i11 = tVarBuild.f62976q;
                z10 |= i11 == -1 || tVarBuild.f62977r == -1;
                iMax = Math.max(iMax, i11);
                iMax2 = Math.max(iMax2, tVarBuild.f62977r);
                iC = Math.max(iC, c(jVar, tVarBuild));
            }
        }
        if (z10) {
            p.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point pointB = b(jVar, tVar);
            if (pointB != null) {
                iMax = Math.max(iMax, pointB.x);
                iMax2 = Math.max(iMax2, pointB.y);
                iC = Math.max(iC, a(jVar, tVar.buildUpon().setWidth(iMax).setHeight(iMax2).build()));
                p.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new a(iMax, iMax2, iC);
    }

    @Override // io.odeeo.internal.r.k
    public io.odeeo.internal.r.i a(Throwable th2, io.odeeo.internal.r.j jVar) {
        return new g(th2, jVar, this.P0);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(io.odeeo.internal.r.j r10, io.odeeo.internal.b.t r11) {
        /*
            int r0 = r11.f62976q
            int r1 = r11.f62977r
            r2 = -1
            if (r0 == r2) goto Lc4
            if (r1 != r2) goto Lb
            goto Lc4
        Lb:
            java.lang.String r3 = r11.f62971l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            r6 = 1
            java.lang.String r7 = "video/hevc"
            r8 = 2
            if (r4 == 0) goto L34
            android.util.Pair r11 = io.odeeo.internal.r.m.getCodecProfileAndLevel(r11)
            if (r11 == 0) goto L33
            java.lang.Object r11 = r11.first
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            r3 = 512(0x200, float:7.17E-43)
            if (r11 == r3) goto L31
            if (r11 == r6) goto L31
            if (r11 != r8) goto L33
        L31:
            r3 = r5
            goto L34
        L33:
            r3 = r7
        L34:
            r3.getClass()
            int r11 = r3.hashCode()
            r4 = 4
            r9 = 3
            switch(r11) {
                case -1664118616: goto L73;
                case -1662541442: goto L6c;
                case 1187890754: goto L61;
                case 1331836730: goto L58;
                case 1599127256: goto L4d;
                case 1599127257: goto L42;
                default: goto L40;
            }
        L40:
            r6 = r2
            goto L7d
        L42:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L4b
            goto L40
        L4b:
            r6 = 5
            goto L7d
        L4d:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L56
            goto L40
        L56:
            r6 = r4
            goto L7d
        L58:
            boolean r11 = r3.equals(r5)
            if (r11 != 0) goto L5f
            goto L40
        L5f:
            r6 = r9
            goto L7d
        L61:
            java.lang.String r11 = "video/mp4v-es"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L6a
            goto L40
        L6a:
            r6 = r8
            goto L7d
        L6c:
            boolean r11 = r3.equals(r7)
            if (r11 != 0) goto L7d
            goto L40
        L73:
            java.lang.String r11 = "video/3gpp"
            boolean r11 = r3.equals(r11)
            if (r11 != 0) goto L7c
            goto L40
        L7c:
            r6 = 0
        L7d:
            switch(r6) {
                case 0: goto Lbd;
                case 1: goto Lba;
                case 2: goto Lbd;
                case 3: goto L81;
                case 4: goto Lbd;
                case 5: goto Lba;
                default: goto L80;
            }
        L80:
            return r2
        L81:
            java.lang.String r11 = io.odeeo.internal.q0.g0.f65864d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lb9
            java.lang.String r3 = io.odeeo.internal.q0.g0.f65863c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto Laa
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r11)
            if (r3 != 0) goto Lb9
            java.lang.String r3 = "AFTS"
            boolean r11 = r3.equals(r11)
            if (r11 == 0) goto Laa
            boolean r10 = r10.f66062g
            if (r10 == 0) goto Laa
            goto Lb9
        Laa:
            r10 = 16
            int r11 = io.odeeo.internal.q0.g0.ceilDivide(r0, r10)
            int r10 = io.odeeo.internal.q0.g0.ceilDivide(r1, r10)
            int r10 = r10 * r11
            int r10 = r10 * 256
        Lb7:
            r4 = r8
            goto Lc0
        Lb9:
            return r2
        Lba:
            int r10 = r0 * r1
            goto Lc0
        Lbd:
            int r10 = r0 * r1
            goto Lb7
        Lc0:
            int r10 = r10 * r9
            int r4 = r4 * r8
            int r10 = r10 / r4
            return r10
        Lc4:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.odeeo.internal.r0.h.a(io.odeeo.internal.r.j, io.odeeo.internal.b.t):int");
    }
}
