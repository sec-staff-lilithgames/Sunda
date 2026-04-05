package io;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Surface;
import androidx.core.app.NotificationCompat;
import ao.o1;
import com.amazon.device.ads.DtbConstants;
import com.facebook.ads.AdError;
import com.google.android.gms.common.Scopes;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.device.MimeTypes;
import gn.k2;
import gn.x0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.common.util.p0;
import io.bidmachine.media3.common.util.q0;
import io.bidmachine.media3.common.util.w0;
import io.bidmachine.media3.exoplayer.r0;
import io.bidmachine.media3.exoplayer.r1;
import io.bidmachine.media3.exoplayer.u1;
import io.bidmachine.media3.exoplayer.video.PlaceholderSurface;
import io.w;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import nh.b5;
import sh.w1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class k extends xn.w implements x {

    /* renamed from: w1, reason: collision with root package name */
    public static final int[] f62129w1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, DtbConstants.DEFAULT_PLAYER_HEIGHT};

    /* renamed from: x1, reason: collision with root package name */
    public static boolean f62130x1;

    /* renamed from: y1, reason: collision with root package name */
    public static boolean f62131y1;
    public final Context H0;
    public final boolean I0;
    public final f0 J0;
    public final int K0;
    public final boolean L0;
    public final w M0;
    public final w.a N0;
    public final io.a O0;
    public final long P0;
    public final PriorityQueue Q0;
    public b R0;
    public boolean S0;
    public boolean T0;
    public l0 U0;
    public boolean V0;
    public List W0;
    public Surface X0;
    public PlaceholderSurface Y0;
    public p0 Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f62132a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f62133b1;

    /* renamed from: c1, reason: collision with root package name */
    public int f62134c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f62135d1;

    /* renamed from: e1, reason: collision with root package name */
    public int f62136e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f62137f1;

    /* renamed from: g1, reason: collision with root package name */
    public int f62138g1;

    /* renamed from: h1, reason: collision with root package name */
    public long f62139h1;

    /* renamed from: i1, reason: collision with root package name */
    public int f62140i1;

    /* renamed from: j1, reason: collision with root package name */
    public long f62141j1;

    /* renamed from: k1, reason: collision with root package name */
    public k2 f62142k1;

    /* renamed from: l1, reason: collision with root package name */
    public k2 f62143l1;

    /* renamed from: m1, reason: collision with root package name */
    public int f62144m1;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f62145n1;

    /* renamed from: o1, reason: collision with root package name */
    public int f62146o1;

    /* renamed from: p1, reason: collision with root package name */
    public c f62147p1;

    /* renamed from: q1, reason: collision with root package name */
    public v f62148q1;

    /* renamed from: r1, reason: collision with root package name */
    public long f62149r1;

    /* renamed from: s1, reason: collision with root package name */
    public long f62150s1;

    /* renamed from: t1, reason: collision with root package name */
    public boolean f62151t1;

    /* renamed from: u1, reason: collision with root package name */
    public boolean f62152u1;

    /* renamed from: v1, reason: collision with root package name */
    public int f62153v1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f62154a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f62155b;

        /* renamed from: d, reason: collision with root package name */
        public xn.m f62157d;

        /* renamed from: e, reason: collision with root package name */
        public long f62158e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f62159f;

        /* renamed from: g, reason: collision with root package name */
        public Handler f62160g;

        /* renamed from: h, reason: collision with root package name */
        public g0 f62161h;

        /* renamed from: i, reason: collision with root package name */
        public int f62162i;

        /* renamed from: k, reason: collision with root package name */
        public l0 f62164k;

        /* renamed from: l, reason: collision with root package name */
        public boolean f62165l;

        /* renamed from: c, reason: collision with root package name */
        public xn.z f62156c = xn.z.f92166a;

        /* renamed from: j, reason: collision with root package name */
        public float f62163j = 30.0f;

        /* renamed from: m, reason: collision with root package name */
        public long f62166m = C.TIME_UNSET;

        public a(Context context) {
            this.f62154a = context;
            this.f62157d = xn.m.getDefault(context);
        }

        public k build() {
            io.bidmachine.media3.common.util.a.checkState(!this.f62155b);
            Handler handler = this.f62160g;
            io.bidmachine.media3.common.util.a.checkState((handler == null && this.f62161h == null) || !(handler == null || this.f62161h == null));
            this.f62155b = true;
            return new k(this);
        }

        public a experimentalSetLateThresholdToDropDecoderInputUs(long j10) {
            this.f62166m = j10;
            return this;
        }

        public a experimentalSetParseAv1SampleDependencies(boolean z10) {
            this.f62165l = z10;
            return this;
        }

        public a setAllowedJoiningTimeMs(long j10) {
            this.f62158e = j10;
            return this;
        }

        public a setAssumedMinimumCodecOperatingRate(float f10) {
            this.f62163j = f10;
            return this;
        }

        public a setCodecAdapterFactory(xn.m mVar) {
            this.f62157d = mVar;
            return this;
        }

        public a setEnableDecoderFallback(boolean z10) {
            this.f62159f = z10;
            return this;
        }

        public a setEventHandler(Handler handler) {
            this.f62160g = handler;
            return this;
        }

        public a setEventListener(g0 g0Var) {
            this.f62161h = g0Var;
            return this;
        }

        public a setMaxDroppedFramesToNotify(int i10) {
            this.f62162i = i10;
            return this;
        }

        public a setMediaCodecSelector(xn.z zVar) {
            this.f62156c = zVar;
            return this;
        }

        public a setVideoSink(l0 l0Var) {
            this.f62164k = l0Var;
            return this;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f62167a;

        /* renamed from: b, reason: collision with root package name */
        public final int f62168b;

        /* renamed from: c, reason: collision with root package name */
        public final int f62169c;

        public b(int i10, int i11, int i12) {
            this.f62167a = i10;
            this.f62168b = i11;
            this.f62169c = i12;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c implements xn.o, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f62170b;

        public c(xn.p pVar) {
            Handler handlerCreateHandlerForCurrentLooper = a1.createHandlerForCurrentLooper(this);
            this.f62170b = handlerCreateHandlerForCurrentLooper;
            pVar.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        public final void a(long j10) {
            Surface surface;
            k kVar = k.this;
            if (this != kVar.f62147p1 || kVar.N == null) {
                return;
            }
            if (j10 == Long.MAX_VALUE) {
                kVar.f92155z0 = true;
                return;
            }
            try {
                f0 f0Var = kVar.J0;
                kVar.i0(j10);
                k2 k2Var = kVar.f62142k1;
                if (!k2Var.equals(k2.f57977d) && !k2Var.equals(kVar.f62143l1)) {
                    kVar.f62143l1 = k2Var;
                    f0Var.videoSizeChanged(k2Var);
                }
                kVar.B0.f61280e++;
                if (kVar.M0.onFrameReleasedIsFirstFrame() && (surface = kVar.X0) != null) {
                    f0Var.renderedFirstFrame(surface);
                    kVar.f62132a1 = true;
                }
                kVar.O(j10);
            } catch (io.bidmachine.media3.exoplayer.a0 e10) {
                kVar.A0 = e10;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            a(a1.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // xn.o
        public void onFrameRendered(xn.p pVar, long j10, long j11) {
            if (a1.f60679a >= 30) {
                a(j10);
            } else {
                Handler handler = this.f62170b;
                handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j10 >> 32), (int) j10));
            }
        }
    }

    public k(a aVar) {
        super(2, aVar.f62157d, aVar.f62156c, aVar.f62159f, aVar.f62163j);
        Context applicationContext = aVar.f62154a.getApplicationContext();
        this.H0 = applicationContext;
        this.K0 = aVar.f62162i;
        this.U0 = aVar.f62164k;
        this.J0 = new f0(aVar.f62160g, aVar.f62161h);
        this.I0 = this.U0 == null;
        this.M0 = new w(applicationContext, this, aVar.f62158e);
        this.N0 = new w.a();
        this.L0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.Z0 = p0.f60777c;
        this.f62133b1 = 1;
        this.f62134c1 = 0;
        this.f62142k1 = k2.f57977d;
        this.f62146o1 = 0;
        this.f62143l1 = null;
        this.f62144m1 = -1000;
        long j10 = C.TIME_UNSET;
        this.f62149r1 = C.TIME_UNSET;
        this.f62150s1 = C.TIME_UNSET;
        this.O0 = aVar.f62165l ? new io.a() : null;
        this.Q0 = new PriorityQueue();
        long j11 = aVar.f62166m;
        this.P0 = j11 != C.TIME_UNSET ? -j11 : j10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getCodecMaxInputSize(xn.s r11, io.bidmachine.media3.common.b r12) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.k.getCodecMaxInputSize(xn.s, io.bidmachine.media3.common.b):int");
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
    public static boolean j0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.k.j0(java.lang.String):boolean");
    }

    public static List k0(Context context, xn.z zVar, io.bidmachine.media3.common.b bVar, boolean z10, boolean z11) throws xn.c0 {
        String str = bVar.f60665o;
        if (str == null) {
            return b5.of();
        }
        if (a1.f60679a >= 26 && "video/dolby-vision".equals(str) && !j.doesDisplaySupportDolbyVision(context)) {
            List<xn.s> alternativeDecoderInfos = xn.h0.getAlternativeDecoderInfos(zVar, bVar, z10, z11);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return xn.h0.getDecoderInfosSoftMatch(zVar, bVar, z10, z11);
    }

    public static int l0(xn.s sVar, io.bidmachine.media3.common.b bVar) {
        int i10 = bVar.f60666p;
        List list = bVar.f60668r;
        if (i10 == -1) {
            return getCodecMaxInputSize(sVar, bVar);
        }
        int size = list.size();
        int length = 0;
        for (int i11 = 0; i11 < size; i11++) {
            length += ((byte[]) list.get(i11)).length;
        }
        return bVar.f60666p + length;
    }

    public static int supportsFormat(Context context, xn.z zVar, io.bidmachine.media3.common.b bVar) throws xn.c0 {
        return u0(context, zVar, bVar);
    }

    public static int u0(Context context, xn.z zVar, io.bidmachine.media3.common.b bVar) throws xn.c0 {
        boolean z10;
        int i10 = 0;
        if (!x0.isVideo(bVar.f60665o)) {
            return u1.create(0);
        }
        boolean z11 = bVar.f60669s != null;
        List listK0 = k0(context, zVar, bVar, z11, false);
        if (z11 && listK0.isEmpty()) {
            listK0 = k0(context, zVar, bVar, false, false);
        }
        if (listK0.isEmpty()) {
            return u1.create(1);
        }
        int i11 = bVar.N;
        if (i11 != 0 && i11 != 2) {
            return u1.create(2);
        }
        xn.s sVar = (xn.s) listK0.get(0);
        boolean zIsFormatSupported = sVar.isFormatSupported(bVar);
        if (zIsFormatSupported) {
            z10 = true;
        } else {
            for (int i12 = 1; i12 < listK0.size(); i12++) {
                xn.s sVar2 = (xn.s) listK0.get(i12);
                if (sVar2.isFormatSupported(bVar)) {
                    z10 = false;
                    zIsFormatSupported = true;
                    sVar = sVar2;
                    break;
                }
            }
            z10 = true;
        }
        int i13 = zIsFormatSupported ? 4 : 3;
        int i14 = sVar.isSeamlessAdaptationSupported(bVar) ? 16 : 8;
        int i15 = sVar.f92117g ? 64 : 0;
        int i16 = z10 ? 128 : 0;
        if (a1.f60679a >= 26 && "video/dolby-vision".equals(bVar.f60665o) && !j.doesDisplaySupportDolbyVision(context)) {
            i16 = NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (zIsFormatSupported) {
            List listK02 = k0(context, zVar, bVar, z11, true);
            if (!listK02.isEmpty()) {
                xn.s sVar3 = xn.h0.getDecoderInfosSortedByFormatSupport(listK02, bVar).get(0);
                if (sVar3.isFormatSupported(bVar) && sVar3.isSeamlessAdaptationSupported(bVar)) {
                    i10 = 32;
                }
            }
        }
        return u1.create(i13, i14, i10, i15, i16);
    }

    @Override // xn.w
    public final xn.l B(xn.s sVar, io.bidmachine.media3.common.b bVar, MediaCrypto mediaCrypto, float f10) {
        gn.n nVar;
        b bVar2;
        Point point;
        int i10;
        int i11;
        int i12;
        char c10;
        boolean z10;
        Pair<Integer, Integer> codecProfileAndLevel;
        int codecMaxInputSize;
        String str = sVar.f92113c;
        io.bidmachine.media3.common.b[] bVarArr = (io.bidmachine.media3.common.b[]) io.bidmachine.media3.common.util.a.checkNotNull(this.f61245l);
        int i13 = bVar.f60672v;
        float f11 = bVar.f60674x;
        gn.n nVar2 = bVar.C;
        int i14 = bVar.f60673w;
        int iL0 = l0(sVar, bVar);
        if (bVarArr.length == 1) {
            if (iL0 != -1 && (codecMaxInputSize = getCodecMaxInputSize(sVar, bVar)) != -1) {
                iL0 = Math.min((int) (iL0 * 1.5f), codecMaxInputSize);
            }
            bVar2 = new b(i13, i14, iL0);
            nVar = nVar2;
        } else {
            int length = bVarArr.length;
            int iMax = i13;
            int iMax2 = i14;
            int i15 = 0;
            boolean z11 = false;
            while (i15 < length) {
                io.bidmachine.media3.common.b bVarBuild = bVarArr[i15];
                io.bidmachine.media3.common.b[] bVarArr2 = bVarArr;
                if (nVar2 != null && bVarBuild.C == null) {
                    bVarBuild = bVarBuild.buildUpon().setColorInfo(nVar2).build();
                }
                if (sVar.canReuseCodec(bVar, bVarBuild).f61296d != 0) {
                    int i16 = bVarBuild.f60672v;
                    i11 = length;
                    int i17 = bVarBuild.f60673w;
                    i12 = i15;
                    c10 = 65535;
                    z11 |= i16 == -1 || i17 == -1;
                    iMax = Math.max(iMax, i16);
                    iMax2 = Math.max(iMax2, i17);
                    iL0 = Math.max(iL0, l0(sVar, bVarBuild));
                } else {
                    i11 = length;
                    i12 = i15;
                    c10 = 65535;
                }
                length = i11;
                i15 = i12 + 1;
                bVarArr = bVarArr2;
            }
            if (z11) {
                io.bidmachine.media3.common.util.b0.w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                boolean z12 = i14 > i13;
                int i18 = z12 ? i14 : i13;
                boolean z13 = z12;
                int i19 = z12 ? i13 : i14;
                float f12 = i19 / i18;
                int i20 = 0;
                while (true) {
                    point = null;
                    nVar = nVar2;
                    if (i20 >= 9) {
                        break;
                    }
                    int i21 = f62129w1[i20];
                    int i22 = i20;
                    int i23 = (int) (i21 * f12);
                    if (i21 <= i18 || i23 <= i19) {
                        break;
                    }
                    if (!z13) {
                        i23 = i21;
                    }
                    if (!z13) {
                        i21 = i23;
                    }
                    Point pointAlignVideoSizeV21 = sVar.alignVideoSizeV21(i23, i21);
                    if (pointAlignVideoSizeV21 != null) {
                        i10 = i19;
                        point = pointAlignVideoSizeV21;
                        if (sVar.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, f11)) {
                            break;
                        }
                    } else {
                        i10 = i19;
                    }
                    i20 = i22 + 1;
                    nVar2 = nVar;
                    i19 = i10;
                }
                Point point2 = point;
                if (point2 != null) {
                    iMax = Math.max(iMax, point2.x);
                    iMax2 = Math.max(iMax2, point2.y);
                    iL0 = Math.max(iL0, getCodecMaxInputSize(sVar, bVar.buildUpon().setWidth(iMax).setHeight(iMax2).build()));
                    io.bidmachine.media3.common.util.b0.w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            } else {
                nVar = nVar2;
            }
            bVar2 = new b(iMax, iMax2, iL0);
        }
        this.R0 = bVar2;
        int i24 = this.f62145n1 ? this.f62146o1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i14);
        io.bidmachine.media3.common.util.e0.setCsdBuffers(mediaFormat, bVar.f60668r);
        io.bidmachine.media3.common.util.e0.maybeSetFloat(mediaFormat, "frame-rate", f11);
        io.bidmachine.media3.common.util.e0.maybeSetInteger(mediaFormat, "rotation-degrees", bVar.f60675y);
        io.bidmachine.media3.common.util.e0.maybeSetColorInfo(mediaFormat, nVar);
        if ("video/dolby-vision".equals(bVar.f60665o) && (codecProfileAndLevel = xn.h0.getCodecProfileAndLevel(bVar)) != null) {
            io.bidmachine.media3.common.util.e0.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar2.f62167a);
        mediaFormat.setInteger("max-height", bVar2.f62168b);
        io.bidmachine.media3.common.util.e0.maybeSetInteger(mediaFormat, "max-input-size", bVar2.f62169c);
        int i25 = a1.f60679a;
        if (i25 >= 23) {
            mediaFormat.setInteger(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f10 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f10);
            }
        }
        if (this.L0) {
            z10 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z10 = true;
        }
        if (i24 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z10);
            mediaFormat.setInteger("audio-session-id", i24);
        }
        if (i25 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f62144m1));
        }
        Surface surfaceM0 = m0(sVar);
        if (this.U0 != null && !a1.isFrameDropAllowedOnSurfaceInput(this.H0)) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        return xn.l.createForVideoDecoding(sVar, mediaFormat, bVar, surfaceM0, mediaCrypto);
    }

    @Override // xn.w
    public final void C(nn.g gVar) {
        if (this.T0) {
            ByteBuffer byteBuffer = (ByteBuffer) io.bidmachine.media3.common.util.a.checkNotNull(gVar.f77083i);
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
                        xn.p pVar = (xn.p) io.bidmachine.media3.common.util.a.checkNotNull(this.N);
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        pVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // xn.w
    public final boolean H(io.bidmachine.media3.common.b bVar) throws io.bidmachine.media3.exoplayer.a0 {
        l0 l0Var = this.U0;
        if (l0Var == null || l0Var.isInitialized()) {
            return true;
        }
        try {
            return this.U0.initialize(bVar);
        } catch (k0 e10) {
            throw a(e10, bVar, false, 7000);
        }
    }

    @Override // xn.w
    public final void I(Exception exc) {
        io.bidmachine.media3.common.util.b0.e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.J0.videoCodecError(exc);
    }

    @Override // xn.w
    public final void J(String str, long j10, long j11) {
        this.J0.decoderInitialized(str, j10, j11);
        this.S0 = j0(str);
        this.T0 = ((xn.s) io.bidmachine.media3.common.util.a.checkNotNull(this.U)).isHdr10PlusOutOfBandMetadataSupported();
        p0();
    }

    @Override // xn.w
    public final void K(String str) {
        this.J0.decoderReleased(str);
    }

    @Override // xn.w
    public final io.bidmachine.media3.exoplayer.k L(r0 r0Var) throws io.bidmachine.media3.exoplayer.a0 {
        io.bidmachine.media3.exoplayer.k kVarL = super.L(r0Var);
        this.J0.inputFormatChanged((io.bidmachine.media3.common.b) io.bidmachine.media3.common.util.a.checkNotNull(r0Var.f61543b), kVarL);
        return kVarL;
    }

    @Override // xn.w
    public final void M(io.bidmachine.media3.common.b bVar, MediaFormat mediaFormat) {
        int integer;
        int i10;
        xn.p pVar = this.N;
        if (pVar != null) {
            pVar.setVideoScalingMode(this.f62133b1);
        }
        if (this.f62145n1) {
            i10 = bVar.f60672v;
            integer = bVar.f60673w;
        } else {
            io.bidmachine.media3.common.util.a.checkNotNull(mediaFormat);
            boolean z10 = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z10 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z10 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i10 = integer2;
        }
        float f10 = bVar.f60676z;
        int i11 = bVar.f60675y;
        if (i11 == 90 || i11 == 270) {
            f10 = 1.0f / f10;
            int i12 = integer;
            integer = i10;
            i10 = i12;
        }
        this.f62142k1 = new k2(i10, integer, f10);
        l0 l0Var = this.U0;
        if (l0Var == null || !this.f62151t1) {
            this.M0.setFrameRate(bVar.f60674x);
        } else {
            io.bidmachine.media3.common.b bVarBuild = bVar.buildUpon().setWidth(i10).setHeight(integer).setPixelWidthHeightRatio(f10).build();
            List<Object> listOf = this.W0;
            if (listOf == null) {
                listOf = b5.of();
            }
            l0Var.onInputStreamChanged(1, bVarBuild, listOf);
        }
        this.f62151t1 = false;
    }

    @Override // xn.w
    public final void O(long j10) {
        super.O(j10);
        if (this.f62145n1) {
            return;
        }
        this.f62138g1--;
    }

    @Override // xn.w
    public final void P() {
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.signalEndOfCurrentInputStream();
            this.U0.setStreamTimestampInfo(this.C0.f92162b, -this.f62149r1);
        } else {
            this.M0.onProcessedStreamChange();
        }
        this.f62151t1 = true;
        p0();
    }

    @Override // xn.w
    public final void Q(nn.g gVar) {
        Surface surface;
        ByteBuffer byteBuffer;
        io.a aVar = this.O0;
        if (aVar != null && ((xn.s) io.bidmachine.media3.common.util.a.checkNotNull(this.U)).f92112b.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = gVar.f77080f) != null) {
            aVar.queueInputBuffer(byteBuffer);
        }
        this.f62153v1 = 0;
        boolean z10 = this.f62145n1;
        if (!z10) {
            this.f62138g1++;
        }
        if (a1.f60679a >= 23 || !z10) {
            return;
        }
        long j10 = gVar.f77082h;
        i0(j10);
        k2 k2Var = this.f62142k1;
        boolean zEquals = k2Var.equals(k2.f57977d);
        f0 f0Var = this.J0;
        if (!zEquals && !k2Var.equals(this.f62143l1)) {
            this.f62143l1 = k2Var;
            f0Var.videoSizeChanged(k2Var);
        }
        this.B0.f61280e++;
        if (this.M0.onFrameReleasedIsFirstFrame() && (surface = this.X0) != null) {
            f0Var.renderedFirstFrame(surface);
            this.f62132a1 = true;
        }
        O(j10);
    }

    @Override // xn.w
    public final void R(r1 r1Var) {
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.setWakeupListener(r1Var);
        }
    }

    @Override // xn.w
    public final boolean T(long j10, long j11, xn.p pVar, ByteBuffer byteBuffer, int i10, int i11, int i12, long j12, boolean z10, boolean z11, io.bidmachine.media3.common.b bVar) throws io.bidmachine.media3.exoplayer.a0 {
        int i13;
        io.bidmachine.media3.common.util.a.checkNotNull(pVar);
        long j13 = j12 - this.C0.f92163c;
        int i14 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.Q0;
            Long l9 = (Long) priorityQueue.peek();
            if (l9 == null || l9.longValue() >= j12) {
                break;
            }
            i14++;
            priorityQueue.poll();
        }
        v0(i14, 0);
        l0 l0Var = this.U0;
        if (l0Var != null) {
            if (!z10 || z11) {
                return l0Var.handleInputFrame(j12 + (-this.f62149r1), z11, new i(this, pVar, i10, j13));
            }
            t0(pVar, i10);
            return true;
        }
        int frameReleaseAction = this.M0.getFrameReleaseAction(j12, j10, j11, this.C0.f92162b, z10, z11, this.N0);
        w.a aVar = this.N0;
        if (frameReleaseAction == 0) {
            long jNanoTime = ((q0) b()).nanoTime();
            v vVar = this.f62148q1;
            if (vVar != null) {
                vVar.onVideoFrameAboutToBeRendered(j13, jNanoTime, bVar, this.P);
            }
            q0(pVar, i10, jNanoTime);
            w0(aVar.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            xn.p pVar2 = (xn.p) io.bidmachine.media3.common.util.a.checkStateNotNull(pVar);
            long releaseTimeNs = aVar.getReleaseTimeNs();
            long earlyUs = aVar.getEarlyUs();
            if (releaseTimeNs == this.f62141j1) {
                t0(pVar2, i10);
            } else {
                v vVar2 = this.f62148q1;
                if (vVar2 != null) {
                    i13 = i10;
                    vVar2.onVideoFrameAboutToBeRendered(j13, releaseTimeNs, bVar, this.P);
                } else {
                    i13 = i10;
                }
                q0(pVar2, i13, releaseTimeNs);
            }
            w0(earlyUs);
            this.f62141j1 = releaseTimeNs;
            return true;
        }
        if (frameReleaseAction == 2) {
            w0.beginSection("dropVideoBuffer");
            pVar.releaseOutputBuffer(i10, false);
            w0.endSection();
            v0(0, 1);
            w0(aVar.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 3) {
            t0(pVar, i10);
            w0(aVar.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 4 || frameReleaseAction == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(frameReleaseAction));
    }

    @Override // xn.w
    public final void W() {
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.signalEndOfCurrentInputStream();
        }
    }

    @Override // xn.w
    public final void X() {
        super.X();
        this.Q0.clear();
        this.f62152u1 = false;
        this.f62138g1 = 0;
        this.f62153v1 = 0;
        io.a aVar = this.O0;
        if (aVar != null) {
            aVar.reset();
        }
    }

    @Override // xn.w
    public final boolean c0(nn.g gVar) {
        ByteBuffer byteBuffer;
        if (!hasReadStreamToEnd() && !gVar.isLastSample()) {
            long j10 = this.f62150s1;
            if (j10 != C.TIME_UNSET && j10 - (gVar.f77082h - this.C0.f92163c) > 100000 && !gVar.isEncrypted()) {
                boolean z10 = gVar.f77082h < this.f61247n;
                if ((z10 || this.f62152u1) && !gVar.hasSupplementalData()) {
                    boolean zNotDependedOn = gVar.notDependedOn();
                    PriorityQueue priorityQueue = this.Q0;
                    if (zNotDependedOn) {
                        gVar.clear();
                        if (z10) {
                            this.B0.f61279d++;
                            return true;
                        }
                        if (this.f62152u1) {
                            priorityQueue.add(Long.valueOf(gVar.f77082h));
                            this.f62153v1++;
                            return true;
                        }
                    } else {
                        io.a aVar = this.O0;
                        if (aVar != null && ((xn.s) io.bidmachine.media3.common.util.a.checkNotNull(this.U)).f92112b.equals(MimeTypes.VIDEO_AV1) && (byteBuffer = gVar.f77080f) != null) {
                            boolean z11 = z10 || this.f62153v1 <= 0;
                            ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                            byteBufferAsReadOnlyBuffer.flip();
                            int iSampleLimitAfterSkippingNonReferenceFrame = aVar.sampleLimitAfterSkippingNonReferenceFrame(byteBufferAsReadOnlyBuffer, z11);
                            boolean z12 = ((b) io.bidmachine.media3.common.util.a.checkNotNull(this.R0)).f62169c + iSampleLimitAfterSkippingNonReferenceFrame < byteBufferAsReadOnlyBuffer.capacity();
                            if (iSampleLimitAfterSkippingNonReferenceFrame != byteBufferAsReadOnlyBuffer.limit() && z12) {
                                ((ByteBuffer) io.bidmachine.media3.common.util.a.checkNotNull(gVar.f77080f)).position(iSampleLimitAfterSkippingNonReferenceFrame);
                                if (z10) {
                                    this.B0.f61279d++;
                                    return true;
                                }
                                if (this.f62152u1) {
                                    priorityQueue.add(Long.valueOf(gVar.f77082h));
                                    this.f62153v1++;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void d() {
        f0 f0Var = this.J0;
        this.f62143l1 = null;
        this.f62150s1 = C.TIME_UNSET;
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.onRendererDisabled();
        } else {
            this.M0.onDisabled();
        }
        p0();
        this.f62132a1 = false;
        this.f62147p1 = null;
        try {
            super.d();
        } finally {
            f0Var.disabled(this.B0);
            f0Var.videoSizeChanged(k2.f57977d);
        }
    }

    @Override // xn.w
    public final boolean d0(xn.s sVar) {
        return n0(sVar);
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void e(boolean z10, boolean z11) {
        super.e(z10, z11);
        boolean z12 = c().f61578b;
        io.bidmachine.media3.common.util.a.checkState((z12 && this.f62146o1 == 0) ? false : true);
        if (this.f62145n1 != z12) {
            this.f62145n1 = z12;
            V();
        }
        this.J0.enabled(this.B0);
        boolean z13 = this.V0;
        w wVar = this.M0;
        if (!z13) {
            if (this.W0 != null && this.U0 == null) {
                s sVarBuild = new m(this.H0, wVar).setClock(b()).build();
                sVarBuild.setTotalVideoInputCount(1);
                this.U0 = sVarBuild.getSink(0);
            }
            this.V0 = true;
        }
        l0 l0Var = this.U0;
        if (l0Var == null) {
            wVar.setClock(b());
            wVar.onEnabled(z11);
            return;
        }
        l0Var.setListener(new h(this), w1.directExecutor());
        v vVar = this.f62148q1;
        if (vVar != null) {
            this.U0.setVideoFrameMetadataListener(vVar);
        }
        if (this.X0 != null && !this.Z0.equals(p0.f60777c)) {
            this.U0.setOutputSurfaceInfo(this.X0, this.Z0);
        }
        this.U0.setChangeFrameRateStrategy(this.f62134c1);
        this.U0.setPlaybackSpeed(this.L);
        List<Object> list = this.W0;
        if (list != null) {
            this.U0.setVideoEffects(list);
        }
        this.U0.onRendererEnabled(z11);
        r1 r1Var = this.I;
        if (r1Var != null) {
            this.U0.setWakeupListener(r1Var);
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public void enableMayRenderStartOfStream() {
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.enableMayRenderStartOfStream();
        } else {
            this.M0.allowReleaseFirstFrameBeforeStarted();
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void f(long j10, boolean z10) throws io.bidmachine.media3.exoplayer.a0 {
        l0 l0Var = this.U0;
        if (l0Var != null) {
            if (!z10) {
                l0Var.flush(true);
            }
            this.U0.setStreamTimestampInfo(this.C0.f92162b, -this.f62149r1);
            this.f62151t1 = true;
        }
        super.f(j10, z10);
        l0 l0Var2 = this.U0;
        w wVar = this.M0;
        if (l0Var2 == null) {
            wVar.reset();
        }
        if (z10) {
            l0 l0Var3 = this.U0;
            if (l0Var3 != null) {
                l0Var3.join(false);
            } else {
                wVar.join(false);
            }
        }
        p0();
        this.f62137f1 = 0;
    }

    @Override // xn.w
    public final int f0(xn.z zVar, io.bidmachine.media3.common.b bVar) {
        return u0(this.H0, zVar, bVar);
    }

    @Override // io.bidmachine.media3.exoplayer.i
    public final void g() {
        l0 l0Var = this.U0;
        if (l0Var == null || !this.I0) {
            return;
        }
        l0Var.release();
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.u1
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void h() {
        try {
            super.h();
        } finally {
            this.V0 = false;
            this.f62149r1 = C.TIME_UNSET;
            PlaceholderSurface placeholderSurface = this.Y0;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.Y0 = null;
            }
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1, io.bidmachine.media3.exoplayer.n1
    public void handleMessage(int i10, Object obj) throws io.bidmachine.media3.exoplayer.a0 {
        if (i10 == 1) {
            r0(obj);
            return;
        }
        if (i10 == 7) {
            v vVar = (v) io.bidmachine.media3.common.util.a.checkNotNull(obj);
            this.f62148q1 = vVar;
            l0 l0Var = this.U0;
            if (l0Var != null) {
                l0Var.setVideoFrameMetadataListener(vVar);
                return;
            }
            return;
        }
        if (i10 == 10) {
            int iIntValue = ((Integer) io.bidmachine.media3.common.util.a.checkNotNull(obj)).intValue();
            if (this.f62146o1 != iIntValue) {
                this.f62146o1 = iIntValue;
                if (this.f62145n1) {
                    V();
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            int iIntValue2 = ((Integer) io.bidmachine.media3.common.util.a.checkNotNull(obj)).intValue();
            this.f62133b1 = iIntValue2;
            xn.p pVar = this.N;
            if (pVar != null) {
                pVar.setVideoScalingMode(iIntValue2);
                return;
            }
            return;
        }
        if (i10 == 5) {
            int iIntValue3 = ((Integer) io.bidmachine.media3.common.util.a.checkNotNull(obj)).intValue();
            this.f62134c1 = iIntValue3;
            l0 l0Var2 = this.U0;
            if (l0Var2 != null) {
                l0Var2.setChangeFrameRateStrategy(iIntValue3);
                return;
            } else {
                this.M0.setChangeFrameRateStrategy(iIntValue3);
                return;
            }
        }
        if (i10 == 13) {
            setVideoEffects((List) io.bidmachine.media3.common.util.a.checkNotNull(obj));
            return;
        }
        if (i10 == 14) {
            p0 p0Var = (p0) io.bidmachine.media3.common.util.a.checkNotNull(obj);
            if (p0Var.getWidth() == 0 || p0Var.getHeight() == 0) {
                return;
            }
            this.Z0 = p0Var;
            l0 l0Var3 = this.U0;
            if (l0Var3 != null) {
                l0Var3.setOutputSurfaceInfo((Surface) io.bidmachine.media3.common.util.a.checkStateNotNull(this.X0), p0Var);
                return;
            }
            return;
        }
        if (i10 != 16) {
            if (i10 != 17) {
                super.handleMessage(i10, obj);
                return;
            }
            Surface surface = this.X0;
            r0(null);
            ((k) io.bidmachine.media3.common.util.a.checkNotNull(obj)).handleMessage(1, surface);
            return;
        }
        this.f62144m1 = ((Integer) io.bidmachine.media3.common.util.a.checkNotNull(obj)).intValue();
        xn.p pVar2 = this.N;
        if (pVar2 != null && a1.f60679a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f62144m1));
            pVar2.setParameters(bundle);
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void i() {
        this.f62136e1 = 0;
        this.f62135d1 = ((q0) b()).elapsedRealtime();
        this.f62139h1 = 0L;
        this.f62140i1 = 0;
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.onRendererStarted();
        } else {
            this.M0.onStarted();
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isEnded() {
        if (!super.isEnded()) {
            return false;
        }
        l0 l0Var = this.U0;
        return l0Var == null || l0Var.isEnded();
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        l0 l0Var = this.U0;
        if (l0Var != null) {
            return l0Var.isReady(zIsReady);
        }
        if (zIsReady && (this.N == null || this.f62145n1)) {
            return true;
        }
        return this.M0.isReady(zIsReady);
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void j() {
        o0();
        int i10 = this.f62140i1;
        if (i10 != 0) {
            this.J0.reportVideoFrameProcessingOffset(this.f62139h1, i10);
            this.f62139h1 = 0L;
            this.f62140i1 = 0;
        }
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.onRendererStopped();
        } else {
            this.M0.onStopped();
        }
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i
    public final void k(io.bidmachine.media3.common.b[] bVarArr, long j10, long j11, ao.k0 k0Var) {
        super.k(bVarArr, j10, j11, k0Var);
        if (this.f62149r1 == C.TIME_UNSET) {
            this.f62149r1 = j10;
        }
        gn.u1 u1Var = this.f61251r;
        if (u1Var.isEmpty()) {
            this.f62150s1 = C.TIME_UNSET;
        } else {
            this.f62150s1 = u1Var.getPeriodByUid(((ao.k0) io.bidmachine.media3.common.util.a.checkNotNull(k0Var)).f7718a, new gn.r1()).getDurationUs();
        }
    }

    public final Surface m0(xn.s sVar) {
        l0 l0Var = this.U0;
        if (l0Var != null) {
            return l0Var.getInputSurface();
        }
        Surface surface = this.X0;
        if (surface != null) {
            return surface;
        }
        if (a1.f60679a >= 35 && sVar.f92120j) {
            return null;
        }
        io.bidmachine.media3.common.util.a.checkState(s0(sVar));
        PlaceholderSurface placeholderSurface = this.Y0;
        if (placeholderSurface != null && placeholderSurface.f61581b != sVar.f92116f && placeholderSurface != null) {
            placeholderSurface.release();
            this.Y0 = null;
        }
        if (this.Y0 == null) {
            this.Y0 = PlaceholderSurface.newInstance(this.H0, sVar.f92116f);
        }
        return this.Y0;
    }

    @Override // xn.w
    public final io.bidmachine.media3.exoplayer.k n(xn.s sVar, io.bidmachine.media3.common.b bVar, io.bidmachine.media3.common.b bVar2) {
        io.bidmachine.media3.exoplayer.k kVarCanReuseCodec = sVar.canReuseCodec(bVar, bVar2);
        int i10 = kVarCanReuseCodec.f61297e;
        b bVar3 = (b) io.bidmachine.media3.common.util.a.checkNotNull(this.R0);
        if (bVar2.f60672v > bVar3.f62167a || bVar2.f60673w > bVar3.f62168b) {
            i10 |= NotificationCompat.FLAG_LOCAL_ONLY;
        }
        if (l0(sVar, bVar2) > bVar3.f62169c) {
            i10 |= 64;
        }
        int i11 = i10;
        return new io.bidmachine.media3.exoplayer.k(sVar.f92111a, bVar, bVar2, i11 != 0 ? 0 : kVarCanReuseCodec.f61296d, i11);
    }

    public final boolean n0(xn.s sVar) {
        if (this.U0 != null) {
            return true;
        }
        Surface surface = this.X0;
        if (surface == null || !surface.isValid()) {
            return (a1.f60679a >= 35 && sVar.f92120j) || s0(sVar);
        }
        return true;
    }

    @Override // xn.w
    public final xn.r o(IllegalStateException illegalStateException, xn.s sVar) {
        return new g(illegalStateException, sVar, this.X0);
    }

    public final void o0() {
        if (this.f62136e1 > 0) {
            long jElapsedRealtime = ((q0) b()).elapsedRealtime();
            this.J0.droppedFrames(this.f62136e1, jElapsedRealtime - this.f62135d1);
            this.f62136e1 = 0;
            this.f62135d1 = jElapsedRealtime;
        }
    }

    public final void p0() {
        int i10;
        xn.p pVar;
        if (!this.f62145n1 || (i10 = a1.f60679a) < 23 || (pVar = this.N) == null) {
            return;
        }
        this.f62147p1 = new c(pVar);
        if (i10 >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            pVar.setParameters(bundle);
        }
    }

    public final void q0(xn.p pVar, int i10, long j10) {
        Surface surface;
        w0.beginSection("releaseOutputBuffer");
        pVar.releaseOutputBuffer(i10, j10);
        w0.endSection();
        this.B0.f61280e++;
        this.f62137f1 = 0;
        if (this.U0 == null) {
            k2 k2Var = this.f62142k1;
            boolean zEquals = k2Var.equals(k2.f57977d);
            f0 f0Var = this.J0;
            if (!zEquals && !k2Var.equals(this.f62143l1)) {
                this.f62143l1 = k2Var;
                f0Var.videoSizeChanged(k2Var);
            }
            if (!this.M0.onFrameReleasedIsFirstFrame() || (surface = this.X0) == null) {
                return;
            }
            f0Var.renderedFirstFrame(surface);
            this.f62132a1 = true;
        }
    }

    public final void r0(Object obj) throws io.bidmachine.media3.exoplayer.a0 {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.X0;
        f0 f0Var = this.J0;
        if (surface2 == surface) {
            if (surface != null) {
                k2 k2Var = this.f62143l1;
                if (k2Var != null) {
                    f0Var.videoSizeChanged(k2Var);
                }
                Surface surface3 = this.X0;
                if (surface3 == null || !this.f62132a1) {
                    return;
                }
                f0Var.renderedFirstFrame(surface3);
                return;
            }
            return;
        }
        this.X0 = surface;
        l0 l0Var = this.U0;
        w wVar = this.M0;
        if (l0Var == null) {
            wVar.setOutputSurface(surface);
        }
        this.f62132a1 = false;
        int state = getState();
        xn.p pVar = this.N;
        if (pVar != null && this.U0 == null) {
            xn.s sVar = (xn.s) io.bidmachine.media3.common.util.a.checkNotNull(this.U);
            boolean zN0 = n0(sVar);
            int i10 = a1.f60679a;
            if (i10 < 23 || !zN0 || this.S0) {
                V();
                F();
            } else {
                Surface surfaceM0 = m0(sVar);
                if (i10 >= 23 && surfaceM0 != null) {
                    pVar.setOutputSurface(surfaceM0);
                } else {
                    if (i10 < 35) {
                        throw new IllegalStateException();
                    }
                    pVar.detachOutputSurface();
                }
            }
        }
        if (surface != null) {
            k2 k2Var2 = this.f62143l1;
            if (k2Var2 != null) {
                f0Var.videoSizeChanged(k2Var2);
            }
        } else {
            this.f62143l1 = null;
            l0 l0Var2 = this.U0;
            if (l0Var2 != null) {
                l0Var2.clearOutputSurfaceInfo();
            }
        }
        if (state == 2) {
            l0 l0Var3 = this.U0;
            if (l0Var3 != null) {
                l0Var3.join(true);
            } else {
                wVar.join(true);
            }
        }
        p0();
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public void render(long j10, long j11) throws MediaCryptoException, io.bidmachine.media3.exoplayer.a0 {
        l0 l0Var = this.U0;
        if (l0Var != null) {
            try {
                l0Var.render(j10, j11);
            } catch (k0 e10) {
                throw a(e10, e10.f62172b, false, AdError.SHOW_CALLED_BEFORE_LOAD_ERROR_CODE);
            }
        }
        super.render(j10, j11);
    }

    public final boolean s0(xn.s sVar) {
        if (a1.f60679a < 23 || this.f62145n1 || j0(sVar.f92111a)) {
            return false;
        }
        return !sVar.f92116f || PlaceholderSurface.isSecureSupported(this.H0);
    }

    @Override // xn.w, io.bidmachine.media3.exoplayer.i, io.bidmachine.media3.exoplayer.s1
    public void setPlaybackSpeed(float f10, float f11) throws io.bidmachine.media3.exoplayer.a0 {
        super.setPlaybackSpeed(f10, f11);
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.setPlaybackSpeed(f10);
        } else {
            this.M0.setPlaybackSpeed(f10);
        }
    }

    public void setVideoEffects(List<Object> list) {
        this.W0 = list;
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.setVideoEffects(list);
        }
    }

    @Override // io.x
    public boolean shouldDropFrame(long j10, long j11, boolean z10) {
        return j10 < -30000 && !z10;
    }

    @Override // io.x
    public boolean shouldForceReleaseFrame(long j10, long j11) {
        return j10 < -30000 && j11 > 100000;
    }

    @Override // io.x
    public boolean shouldIgnoreFrame(long j10, long j11, long j12, boolean z10, boolean z11) throws io.bidmachine.media3.exoplayer.a0 {
        int iSkipData;
        long j13 = this.P0;
        if (j13 != C.TIME_UNSET) {
            this.f62152u1 = j11 > this.f61247n + 200000 && j10 < j13;
        }
        if (j10 >= -500000 || z10 || (iSkipData = ((o1) io.bidmachine.media3.common.util.a.checkNotNull(this.f61244k)).skipData(j11 - this.f61246m)) == 0) {
            return false;
        }
        PriorityQueue priorityQueue = this.Q0;
        if (z11) {
            io.bidmachine.media3.exoplayer.j jVar = this.B0;
            int i10 = jVar.f61279d + iSkipData;
            jVar.f61279d = i10;
            jVar.f61281f += this.f62138g1;
            jVar.f61279d = priorityQueue.size() + i10;
        } else {
            this.B0.f61285j++;
            v0(priorityQueue.size() + iSkipData, this.f62138g1);
        }
        if (u()) {
            F();
        }
        l0 l0Var = this.U0;
        if (l0Var != null) {
            l0Var.flush(false);
        }
        return true;
    }

    public final void t0(xn.p pVar, int i10) {
        w0.beginSection("skipVideoBuffer");
        pVar.releaseOutputBuffer(i10, false);
        w0.endSection();
        this.B0.f61281f++;
    }

    public final void v0(int i10, int i11) {
        io.bidmachine.media3.exoplayer.j jVar = this.B0;
        jVar.f61283h += i10;
        int i12 = i10 + i11;
        jVar.f61282g += i12;
        this.f62136e1 += i12;
        int i13 = this.f62137f1 + i12;
        this.f62137f1 = i13;
        jVar.f61284i = Math.max(i13, jVar.f61284i);
        int i14 = this.K0;
        if (i14 <= 0 || this.f62136e1 < i14) {
            return;
        }
        o0();
    }

    @Override // xn.w
    public final int w(nn.g gVar) {
        return (a1.f60679a < 34 || !this.f62145n1 || gVar.f77082h >= this.f61247n) ? 0 : 32;
    }

    public final void w0(long j10) {
        this.B0.addVideoFrameProcessingOffset(j10);
        this.f62139h1 += j10;
        this.f62140i1++;
    }

    @Override // xn.w
    public final boolean x() {
        return this.f62145n1 && a1.f60679a < 23;
    }

    @Override // xn.w
    public final float y(float f10, io.bidmachine.media3.common.b[] bVarArr) {
        float fMax = -1.0f;
        for (io.bidmachine.media3.common.b bVar : bVarArr) {
            float f11 = bVar.f60674x;
            if (f11 != -1.0f) {
                fMax = Math.max(fMax, f11);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f10;
    }

    @Override // xn.w
    public final List z(xn.z zVar, io.bidmachine.media3.common.b bVar, boolean z10) {
        return xn.h0.getDecoderInfosSortedByFormatSupport(k0(this.H0, zVar, bVar, z10, this.f62145n1), bVar);
    }

    @Deprecated
    public k(Context context, xn.z zVar) {
        this(new a(context).setMediaCodecSelector(zVar));
    }

    @Deprecated
    public k(Context context, xn.z zVar, long j10) {
        this(new a(context).setMediaCodecSelector(zVar).setAllowedJoiningTimeMs(j10));
    }

    @Deprecated
    public k(Context context, xn.z zVar, long j10, Handler handler, g0 g0Var, int i10) {
        this(new a(context).setMediaCodecSelector(zVar).setAllowedJoiningTimeMs(j10).setEventHandler(handler).setEventListener(g0Var).setMaxDroppedFramesToNotify(i10));
    }

    @Deprecated
    public k(Context context, xn.z zVar, long j10, boolean z10, Handler handler, g0 g0Var, int i10) {
        this(new a(context).setMediaCodecSelector(zVar).setAllowedJoiningTimeMs(j10).setEnableDecoderFallback(z10).setEventHandler(handler).setEventListener(g0Var).setMaxDroppedFramesToNotify(i10));
    }

    @Deprecated
    public k(Context context, xn.m mVar, xn.z zVar, long j10, boolean z10, Handler handler, g0 g0Var, int i10) {
        this(new a(context).setMediaCodecSelector(zVar).setCodecAdapterFactory(mVar).setAllowedJoiningTimeMs(j10).setEnableDecoderFallback(z10).setEventHandler(handler).setEventListener(g0Var).setMaxDroppedFramesToNotify(i10));
    }

    @Deprecated
    public k(Context context, xn.m mVar, xn.z zVar, long j10, boolean z10, Handler handler, g0 g0Var, int i10, float f10) {
        this(new a(context).setMediaCodecSelector(zVar).setCodecAdapterFactory(mVar).setAllowedJoiningTimeMs(j10).setEnableDecoderFallback(z10).setEventHandler(handler).setEventListener(g0Var).setMaxDroppedFramesToNotify(i10).setAssumedMinimumCodecOperatingRate(f10));
    }

    @Deprecated
    public k(Context context, xn.m mVar, xn.z zVar, long j10, boolean z10, Handler handler, g0 g0Var, int i10, float f10, m0 m0Var) {
        this(new a(context).setMediaCodecSelector(zVar).setCodecAdapterFactory(mVar).setAllowedJoiningTimeMs(j10).setEnableDecoderFallback(z10).setEventHandler(handler).setEventListener(g0Var).setMaxDroppedFramesToNotify(i10).setAssumedMinimumCodecOperatingRate(f10).setVideoSink(m0Var == null ? null : ((s) m0Var).getSink(0)));
    }

    @Deprecated
    public k(Context context, xn.m mVar, xn.z zVar, long j10, boolean z10, Handler handler, g0 g0Var, int i10, float f10, l0 l0Var) {
        this(new a(context).setMediaCodecSelector(zVar).setCodecAdapterFactory(mVar).setAllowedJoiningTimeMs(j10).setEnableDecoderFallback(z10).setEventHandler(handler).setEventListener(g0Var).setMaxDroppedFramesToNotify(i10).setAssumedMinimumCodecOperatingRate(f10).setVideoSink(l0Var));
    }
}
