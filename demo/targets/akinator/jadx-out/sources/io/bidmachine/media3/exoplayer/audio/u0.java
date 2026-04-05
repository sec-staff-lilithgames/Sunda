package io.bidmachine.media3.exoplayer.audio;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import nh.b5;
import nh.ej;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class u0 implements v {

    /* renamed from: l0, reason: collision with root package name */
    public static final Object f61020l0 = new Object();

    /* renamed from: m0, reason: collision with root package name */
    public static ScheduledExecutorService f61021m0;

    /* renamed from: n0, reason: collision with root package name */
    public static int f61022n0;
    public p0 A;
    public gn.h B;
    public n0 C;
    public n0 D;
    public gn.c1 E;
    public boolean F;
    public ByteBuffer G;
    public int H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public boolean N;
    public boolean O;
    public long P;
    public float Q;
    public ByteBuffer R;
    public int S;
    public ByteBuffer T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public boolean Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f61023a;

    /* renamed from: a0, reason: collision with root package name */
    public gn.i f61024a0;

    /* renamed from: b, reason: collision with root package name */
    public final hn.i f61025b;

    /* renamed from: b0, reason: collision with root package name */
    public h f61026b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f61027c;

    /* renamed from: c0, reason: collision with root package name */
    public boolean f61028c0;

    /* renamed from: d, reason: collision with root package name */
    public final z f61029d;

    /* renamed from: d0, reason: collision with root package name */
    public long f61030d0;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f61031e;

    /* renamed from: e0, reason: collision with root package name */
    public long f61032e0;

    /* renamed from: f, reason: collision with root package name */
    public final b5 f61033f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f61034f0;

    /* renamed from: g, reason: collision with root package name */
    public final b5 f61035g;

    /* renamed from: g0, reason: collision with root package name */
    public boolean f61036g0;

    /* renamed from: h, reason: collision with root package name */
    public final y f61037h;

    /* renamed from: h0, reason: collision with root package name */
    public Looper f61038h0;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayDeque f61039i;

    /* renamed from: i0, reason: collision with root package name */
    public long f61040i0;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f61041j;

    /* renamed from: j0, reason: collision with root package name */
    public long f61042j0;

    /* renamed from: k, reason: collision with root package name */
    public int f61043k;

    /* renamed from: k0, reason: collision with root package name */
    public Handler f61044k0;

    /* renamed from: l, reason: collision with root package name */
    public t0 f61045l;

    /* renamed from: m, reason: collision with root package name */
    public final q0 f61046m;

    /* renamed from: n, reason: collision with root package name */
    public final q0 f61047n;

    /* renamed from: o, reason: collision with root package name */
    public final i0 f61048o;

    /* renamed from: p, reason: collision with root package name */
    public final g0 f61049p;

    /* renamed from: q, reason: collision with root package name */
    public final io.bidmachine.media3.exoplayer.b0 f61050q;

    /* renamed from: r, reason: collision with root package name */
    public final j0 f61051r;

    /* renamed from: s, reason: collision with root package name */
    public on.f0 f61052s;

    /* renamed from: t, reason: collision with root package name */
    public s f61053t;

    /* renamed from: u, reason: collision with root package name */
    public l0 f61054u;

    /* renamed from: v, reason: collision with root package name */
    public l0 f61055v;

    /* renamed from: w, reason: collision with root package name */
    public hn.e f61056w;

    /* renamed from: x, reason: collision with root package name */
    public AudioTrack f61057x;

    /* renamed from: y, reason: collision with root package name */
    public d f61058y;

    /* renamed from: z, reason: collision with root package name */
    public AudioCapabilitiesReceiver f61059z;

    public u0(k0 k0Var) {
        Context context = k0Var.f60959a;
        this.f61023a = context;
        this.B = gn.h.f57892g;
        this.f61058y = context != null ? null : k0Var.f60960b;
        this.f61025b = k0Var.f60961c;
        this.f61027c = k0Var.f60962d;
        this.f61041j = io.bidmachine.media3.common.util.a1.f60679a >= 23 && k0Var.f60963e;
        this.f61043k = 0;
        this.f61048o = k0Var.f60965g;
        this.f61049p = (g0) io.bidmachine.media3.common.util.a.checkNotNull(k0Var.f60967i);
        this.f61037h = new y(new r0(this));
        z zVar = new z();
        this.f61029d = zVar;
        f1 f1Var = new f1();
        this.f61031e = f1Var;
        this.f61033f = b5.of((f1) new hn.m(), (f1) zVar, f1Var);
        this.f61035g = b5.of((f1) new e1(), (f1) zVar, f1Var);
        this.Q = 1.0f;
        this.Z = 0;
        this.f61024a0 = new gn.i(0, 0.0f);
        gn.c1 c1Var = gn.c1.f57844d;
        this.D = new n0(c1Var, 0L, 0L);
        this.E = c1Var;
        this.F = false;
        this.f61039i = new ArrayDeque();
        this.f61046m = new q0();
        this.f61047n = new q0();
        this.f61050q = k0Var.f60968j;
        this.f61051r = k0Var.f60966h;
    }

    public static boolean j(AudioTrack audioTrack) {
        return io.bidmachine.media3.common.util.a1.f60679a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r10) {
        /*
            r9 = this;
            boolean r0 = r9.p()
            boolean r1 = r9.f61027c
            hn.i r2 = r9.f61025b
            if (r0 != 0) goto L2e
            boolean r0 = r9.f61028c0
            if (r0 != 0) goto L28
            io.bidmachine.media3.exoplayer.audio.l0 r0 = r9.f61055v
            int r3 = r0.f60974c
            if (r3 != 0) goto L28
            io.bidmachine.media3.common.b r0 = r0.f60972a
            int r0 = r0.G
            if (r1 == 0) goto L21
            boolean r0 = io.bidmachine.media3.common.util.a1.isEncodingHighResolutionPcm(r0)
            if (r0 == 0) goto L21
            goto L28
        L21:
            gn.c1 r0 = r9.E
            gn.c1 r0 = r2.applyPlaybackParameters(r0)
            goto L2a
        L28:
            gn.c1 r0 = gn.c1.f57844d
        L2a:
            r9.E = r0
        L2c:
            r4 = r0
            goto L31
        L2e:
            gn.c1 r0 = gn.c1.f57844d
            goto L2c
        L31:
            boolean r0 = r9.f61028c0
            if (r0 != 0) goto L4f
            io.bidmachine.media3.exoplayer.audio.l0 r0 = r9.f61055v
            int r3 = r0.f60974c
            if (r3 != 0) goto L4f
            io.bidmachine.media3.common.b r0 = r0.f60972a
            int r0 = r0.G
            if (r1 == 0) goto L48
            boolean r0 = io.bidmachine.media3.common.util.a1.isEncodingHighResolutionPcm(r0)
            if (r0 == 0) goto L48
            goto L4f
        L48:
            boolean r0 = r9.F
            boolean r0 = r2.applySkipSilenceEnabled(r0)
            goto L50
        L4f:
            r0 = 0
        L50:
            r9.F = r0
            io.bidmachine.media3.exoplayer.audio.n0 r3 = new io.bidmachine.media3.exoplayer.audio.n0
            r0 = 0
            long r5 = java.lang.Math.max(r0, r10)
            io.bidmachine.media3.exoplayer.audio.l0 r10 = r9.f61055v
            long r0 = r9.g()
            long r7 = r10.framesToDurationUs(r0)
            r3.<init>(r4, r5, r7)
            java.util.ArrayDeque r10 = r9.f61039i
            r10.add(r3)
            io.bidmachine.media3.exoplayer.audio.l0 r10 = r9.f61055v
            hn.e r10 = r10.f60980i
            r9.f61056w = r10
            r10.flush()
            io.bidmachine.media3.exoplayer.audio.s r10 = r9.f61053t
            if (r10 == 0) goto L80
            boolean r11 = r9.F
            io.bidmachine.media3.exoplayer.audio.z0 r10 = (io.bidmachine.media3.exoplayer.audio.z0) r10
            r10.onSkipSilenceEnabledChanged(r11)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.u0.a(long):void");
    }

    public final AudioTrack b(p pVar, gn.h hVar, int i10, io.bidmachine.media3.common.b bVar) throws r {
        try {
            AudioTrack audioTrack = this.f61051r.getAudioTrack(pVar, hVar, i10);
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new r(state, pVar.f60998b, pVar.f60999c, pVar.f60997a, bVar, pVar.f61001e, null);
        } catch (IllegalArgumentException | UnsupportedOperationException e10) {
            throw new r(0, pVar.f60998b, pVar.f60999c, pVar.f60997a, bVar, pVar.f61001e, e10);
        }
    }

    public final AudioTrack c(l0 l0Var) throws r {
        try {
            AudioTrack audioTrackB = b(l0Var.buildAudioTrackConfig(), this.B, this.Z, l0Var.f60972a);
            io.bidmachine.media3.exoplayer.b0 b0Var = this.f61050q;
            if (b0Var == null) {
                return audioTrackB;
            }
            ((io.bidmachine.media3.exoplayer.j0) b0Var).onOffloadedPlayback(j(audioTrackB));
            return audioTrackB;
        } catch (r e10) {
            s sVar = this.f61053t;
            if (sVar != null) {
                ((z0) sVar).onAudioSinkError(e10);
            }
            throw e10;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void configure(io.bidmachine.media3.common.b bVar, int i10, int[] iArr) throws q {
        int i11;
        int i12;
        hn.e eVar;
        int i13;
        boolean z10;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int bufferSizeInBytes;
        k();
        String str = bVar.f60665o;
        int i18 = bVar.E;
        int i19 = bVar.G;
        boolean zEquals = MimeTypes.AUDIO_RAW.equals(str);
        boolean z12 = this.f61041j;
        if (zEquals) {
            io.bidmachine.media3.common.util.a.checkArgument(io.bidmachine.media3.common.util.a1.isEncodingLinearPcm(i19));
            int pcmFrameSize = io.bidmachine.media3.common.util.a1.getPcmFrameSize(i19, i18);
            x4 x4Var = new x4();
            if (this.f61027c && io.bidmachine.media3.common.util.a1.isEncodingHighResolutionPcm(i19)) {
                x4Var.addAll((Iterable<Object>) this.f61035g);
            } else {
                x4Var.addAll((Iterable<Object>) this.f61033f);
                x4Var.add((Object[]) this.f61025b.getAudioProcessors());
            }
            hn.e eVar2 = new hn.e(x4Var.build());
            if (eVar2.equals(this.f61056w)) {
                eVar2 = this.f61056w;
            }
            this.f61031e.setTrimFrameCount(bVar.H, bVar.I);
            this.f61029d.setChannelMap(iArr);
            try {
                hn.f fVarConfigure = eVar2.configure(new hn.f(bVar));
                int i20 = fVarConfigure.f59040c;
                int i21 = fVarConfigure.f59039b;
                i11 = fVarConfigure.f59038a;
                int audioTrackChannelConfig = io.bidmachine.media3.common.util.a1.getAudioTrackChannelConfig(i21);
                int pcmFrameSize2 = io.bidmachine.media3.common.util.a1.getPcmFrameSize(i20, i21);
                i12 = 0;
                i14 = i20;
                i15 = audioTrackChannelConfig;
                z11 = z12;
                i16 = pcmFrameSize2;
                eVar = eVar2;
                i13 = pcmFrameSize;
                z10 = false;
            } catch (hn.g e10) {
                throw new q(e10, bVar);
            }
        } else {
            hn.e eVar3 = new hn.e(b5.of());
            i11 = bVar.F;
            j formatOffloadSupport = this.f61043k != 0 ? getFormatOffloadSupport(bVar) : j.f60951d;
            if (this.f61043k == 0 || !formatOffloadSupport.f60952a) {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.f61058y.getEncodingAndChannelConfigForPassthrough(bVar, this.B);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new q("Unable to configure passthrough for: " + bVar, bVar);
                }
                int iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i12 = 2;
                eVar = eVar3;
                i13 = -1;
                z10 = false;
                i14 = iIntValue;
                i15 = iIntValue2;
                z11 = z12;
                i16 = -1;
            } else {
                int encoding = gn.x0.getEncoding((String) io.bidmachine.media3.common.util.a.checkNotNull(str), bVar.f60661k);
                int audioTrackChannelConfig2 = io.bidmachine.media3.common.util.a1.getAudioTrackChannelConfig(i18);
                z10 = formatOffloadSupport.f60953b;
                eVar = eVar3;
                i14 = encoding;
                i12 = 1;
                i13 = -1;
                i16 = -1;
                i15 = audioTrackChannelConfig2;
                z11 = true;
            }
        }
        if (i14 == 0) {
            throw new q("Invalid output encoding (mode=" + i12 + ") for: " + bVar, bVar);
        }
        if (i15 == 0) {
            throw new q("Invalid output channel config (mode=" + i12 + ") for: " + bVar, bVar);
        }
        int i22 = bVar.f60660j;
        if (MimeTypes.AUDIO_DTS_EXPRESS.equals(str) && i22 == -1) {
            i22 = 768000;
        }
        int i23 = i22;
        if (i10 != 0) {
            bufferSizeInBytes = i10;
            i17 = i11;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i11, i15, i14);
            io.bidmachine.media3.common.util.a.checkState(minBufferSize != -2);
            i17 = i11;
            bufferSizeInBytes = ((w0) this.f61048o).getBufferSizeInBytes(minBufferSize, i14, i12, i16 != -1 ? i16 : 1, i17, i23, z11 ? 8.0d : 1.0d);
        }
        this.f61034f0 = false;
        l0 l0Var = new l0(bVar, i13, i12, i16, i17, i15, i14, bufferSizeInBytes, eVar, z11, z10, this.f61028c0);
        if (i()) {
            this.f61054u = l0Var;
        } else {
            this.f61055v = l0Var;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(long r11) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.u0.d(long):void");
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void disableTunneling() throws IllegalStateException {
        if (this.f61028c0) {
            this.f61028c0 = false;
            flush();
        }
    }

    public final boolean e() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.f61056w.isOperational()) {
            d(Long.MIN_VALUE);
            return this.T == null;
        }
        this.f61056w.queueEndOfStream();
        m(Long.MIN_VALUE);
        return this.f61056w.isEnded() && ((byteBuffer = this.T) == null || !byteBuffer.hasRemaining());
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void enableTunnelingV21() throws IllegalStateException {
        io.bidmachine.media3.common.util.a.checkState(this.Y);
        if (this.f61028c0) {
            return;
        }
        this.f61028c0 = true;
        flush();
    }

    public final long f() {
        return this.f61055v.f60974c == 0 ? this.I / r0.f60973b : this.J;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void flush() throws IllegalStateException {
        p0 p0Var;
        if (i()) {
            this.I = 0L;
            this.J = 0L;
            this.K = 0L;
            this.L = 0L;
            this.f61036g0 = false;
            this.M = 0;
            this.D = new n0(this.E, 0L, 0L);
            this.P = 0L;
            this.C = null;
            this.f61039i.clear();
            this.R = null;
            this.S = 0;
            this.T = null;
            this.V = false;
            this.U = false;
            this.W = false;
            this.G = null;
            this.H = 0;
            this.f61031e.resetTrimmedFrameCount();
            hn.e eVar = this.f61055v.f60980i;
            this.f61056w = eVar;
            eVar.flush();
            if (this.f61037h.isPlaying()) {
                this.f61057x.pause();
            }
            if (j(this.f61057x)) {
                ((t0) io.bidmachine.media3.common.util.a.checkNotNull(this.f61045l)).unregister(this.f61057x);
            }
            p pVarBuildAudioTrackConfig = this.f61055v.buildAudioTrackConfig();
            l0 l0Var = this.f61054u;
            if (l0Var != null) {
                this.f61055v = l0Var;
                this.f61054u = null;
            }
            this.f61037h.reset();
            if (io.bidmachine.media3.common.util.a1.f60679a >= 24 && (p0Var = this.A) != null) {
                p0Var.release();
                this.A = null;
            }
            AudioTrack audioTrack = this.f61057x;
            s sVar = this.f61053t;
            Handler handler = new Handler(Looper.myLooper());
            synchronized (f61020l0) {
                try {
                    if (f61021m0 == null) {
                        f61021m0 = io.bidmachine.media3.common.util.a1.newSingleThreadScheduledExecutor("ExoPlayer:AudioTrackReleaseThread");
                    }
                    f61022n0++;
                    f61021m0.schedule(new al.a(25, audioTrack, sVar, handler, pVarBuildAudioTrackConfig), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f61057x = null;
        }
        this.f61047n.clear();
        this.f61046m.clear();
        this.f61040i0 = 0L;
        this.f61042j0 = 0L;
        Handler handler2 = this.f61044k0;
        if (handler2 != null) {
            ((Handler) io.bidmachine.media3.common.util.a.checkNotNull(handler2)).removeCallbacksAndMessages(null);
        }
    }

    public final long g() {
        return this.f61055v.f60974c == 0 ? io.bidmachine.media3.common.util.a1.ceilDivide(this.K, r0.f60975d) : this.L;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public gn.h getAudioAttributes() {
        return this.B;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public long getAudioTrackBufferSizeUs() {
        if (!i()) {
            return C.TIME_UNSET;
        }
        if (io.bidmachine.media3.common.util.a1.f60679a >= 23) {
            return e0.getAudioTrackBufferSizeUs(this.f61057x, this.f61055v);
        }
        return io.bidmachine.media3.common.util.a1.scaleLargeValue(this.f61055v.f60979h, 1000000L, this.f61055v.f60974c == 0 ? r0.f60976e * r0.f60975d : w0.a(r0.f60978g), RoundingMode.DOWN);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public long getCurrentPositionUs(boolean z10) {
        ArrayDeque arrayDeque;
        long j10;
        if (!i() || this.O) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f61037h.getCurrentPositionUs(), this.f61055v.framesToDurationUs(g()));
        while (true) {
            arrayDeque = this.f61039i;
            if (arrayDeque.isEmpty() || jMin < ((n0) arrayDeque.getFirst()).f60994c) {
                break;
            }
            this.D = (n0) arrayDeque.remove();
        }
        n0 n0Var = this.D;
        long j11 = jMin - n0Var.f60994c;
        long mediaDurationForPlayoutDuration = io.bidmachine.media3.common.util.a1.getMediaDurationForPlayoutDuration(j11, n0Var.f60992a.f57847a);
        boolean zIsEmpty = arrayDeque.isEmpty();
        hn.i iVar = this.f61025b;
        if (zIsEmpty) {
            long mediaDuration = iVar.getMediaDuration(j11);
            n0 n0Var2 = this.D;
            j10 = n0Var2.f60993b + mediaDuration;
            n0Var2.f60995d = mediaDuration - mediaDurationForPlayoutDuration;
        } else {
            n0 n0Var3 = this.D;
            j10 = n0Var3.f60993b + mediaDurationForPlayoutDuration + n0Var3.f60995d;
        }
        long skippedOutputFrameCount = iVar.getSkippedOutputFrameCount();
        long jFramesToDurationUs = this.f61055v.framesToDurationUs(skippedOutputFrameCount) + j10;
        long j12 = this.f61040i0;
        if (skippedOutputFrameCount > j12) {
            long jFramesToDurationUs2 = this.f61055v.framesToDurationUs(skippedOutputFrameCount - j12);
            this.f61040i0 = skippedOutputFrameCount;
            this.f61042j0 += jFramesToDurationUs2;
            if (this.f61044k0 == null) {
                this.f61044k0 = new Handler(Looper.myLooper());
            }
            this.f61044k0.removeCallbacksAndMessages(null);
            this.f61044k0.postDelayed(new com.unity3d.services.banners.view.a(this, 24), 100L);
        }
        return jFramesToDurationUs;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public j getFormatOffloadSupport(io.bidmachine.media3.common.b bVar) {
        return this.f61034f0 ? j.f60951d : this.f61049p.getAudioOffloadSupport(bVar, this.B);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public int getFormatSupport(io.bidmachine.media3.common.b bVar) {
        k();
        String str = bVar.f60665o;
        int i10 = bVar.G;
        if (!MimeTypes.AUDIO_RAW.equals(str)) {
            return this.f61058y.isPassthroughPlaybackSupported(bVar, this.B) ? 2 : 0;
        }
        if (io.bidmachine.media3.common.util.a1.isEncodingLinearPcm(i10)) {
            return (i10 == 2 || (this.f61027c && i10 == 4)) ? 2 : 1;
        }
        io.bidmachine.media3.common.util.b0.w("DefaultAudioSink", "Invalid PCM encoding: " + i10);
        return 0;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public gn.c1 getPlaybackParameters() {
        return this.E;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public boolean getSkipSilenceEnabled() {
        return this.F;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() throws io.bidmachine.media3.exoplayer.audio.r {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.u0.h():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0146, code lost:
    
        if (r13 == 0) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b  */
    @Override // io.bidmachine.media3.exoplayer.audio.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleBuffer(java.nio.ByteBuffer r19, long r20, int r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.u0.handleBuffer(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void handleDiscontinuity() {
        this.N = true;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public boolean hasPendingData() {
        if (i()) {
            return !(io.bidmachine.media3.common.util.a1.f60679a >= 29 && this.f61057x.isOffloadedPlayback() && this.W) && this.f61037h.hasPendingData(g());
        }
        return false;
    }

    public final boolean i() {
        return this.f61057x != null;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public boolean isEnded() {
        if (i()) {
            return this.U && !hasPendingData();
        }
        return true;
    }

    public final void k() {
        Context context;
        if (this.f61059z == null && (context = this.f61023a) != null) {
            this.f61038h0 = Looper.myLooper();
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(context, new d0(this), this.B, this.f61026b0);
            this.f61059z = audioCapabilitiesReceiver;
            this.f61058y = audioCapabilitiesReceiver.register();
        }
        io.bidmachine.media3.common.util.a.checkNotNull(this.f61058y);
    }

    public final void l() throws IllegalStateException {
        if (this.V) {
            return;
        }
        this.V = true;
        this.f61037h.handleEndOfStream(g());
        if (j(this.f61057x)) {
            this.W = false;
        }
        this.f61057x.stop();
        this.H = 0;
    }

    public final void m(long j10) throws Exception {
        d(j10);
        if (this.T != null) {
            return;
        }
        if (!this.f61056w.isOperational()) {
            ByteBuffer byteBuffer = this.R;
            if (byteBuffer != null) {
                o(byteBuffer);
                d(j10);
                return;
            }
            return;
        }
        while (!this.f61056w.isEnded()) {
            do {
                ByteBuffer output = this.f61056w.getOutput();
                if (output.hasRemaining()) {
                    o(output);
                    d(j10);
                } else {
                    ByteBuffer byteBuffer2 = this.R;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f61056w.queueInput(this.R);
                    }
                }
            } while (this.T == null);
            return;
        }
    }

    public final void n() {
        if (i()) {
            try {
                this.f61057x.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.E.f57847a).setPitch(this.E.f57848b).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                io.bidmachine.media3.common.util.b0.w("DefaultAudioSink", "Failed to set playback params", e10);
            }
            gn.c1 c1Var = new gn.c1(this.f61057x.getPlaybackParams().getSpeed(), this.f61057x.getPlaybackParams().getPitch());
            this.E = c1Var;
            this.f61037h.setAudioTrackPlaybackSpeed(c1Var.f57847a);
        }
    }

    public final void o(ByteBuffer byteBuffer) {
        io.bidmachine.media3.common.util.a.checkState(this.T == null);
        if (byteBuffer.hasRemaining()) {
            if (this.f61055v.f60974c == 0) {
                int iDurationUsToSampleCount = (int) io.bidmachine.media3.common.util.a1.durationUsToSampleCount(io.bidmachine.media3.common.util.a1.msToUs(20L), this.f61055v.f60976e);
                long jG = g();
                if (jG < iDurationUsToSampleCount) {
                    l0 l0Var = this.f61055v;
                    byteBuffer = c1.rampUpVolume(byteBuffer, l0Var.f60978g, l0Var.f60975d, (int) jG, iDurationUsToSampleCount);
                }
            }
            this.T = byteBuffer;
        }
    }

    public void onAudioCapabilitiesChanged(d dVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f61038h0;
        if (looper != looperMyLooper) {
            String name = AbstractJsonLexerKt.NULL;
            String name2 = looper == null ? AbstractJsonLexerKt.NULL : looper.getThread().getName();
            if (looperMyLooper != null) {
                name = looperMyLooper.getThread().getName();
            }
            throw new IllegalStateException(e3.g.l("Current looper (", name, ") is not the playback looper (", name2, ")"));
        }
        d dVar2 = this.f61058y;
        if (dVar2 == null || dVar.equals(dVar2)) {
            return;
        }
        this.f61058y = dVar;
        s sVar = this.f61053t;
        if (sVar != null) {
            ((z0) sVar).onAudioCapabilitiesChanged();
        }
    }

    public final boolean p() {
        l0 l0Var = this.f61055v;
        return l0Var != null && l0Var.f60981j && io.bidmachine.media3.common.util.a1.f60679a >= 23;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void pause() throws IllegalStateException {
        this.X = false;
        if (i()) {
            if (this.f61037h.pause() || j(this.f61057x)) {
                this.f61057x.pause();
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void play() throws IllegalStateException {
        this.X = true;
        if (i()) {
            this.f61037h.start();
            this.f61057x.play();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void playToEndOfStream() throws IllegalStateException, u {
        if (!this.U && i() && e()) {
            l();
            this.U = true;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f61059z;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void reset() throws IllegalStateException {
        flush();
        ej it = this.f61033f.iterator();
        while (it.hasNext()) {
            ((hn.h) it.next()).reset();
        }
        ej it2 = this.f61035g.iterator();
        while (it2.hasNext()) {
            ((hn.h) it2.next()).reset();
        }
        hn.e eVar = this.f61056w;
        if (eVar != null) {
            eVar.reset();
        }
        this.X = false;
        this.f61034f0 = false;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setAudioAttributes(gn.h hVar) throws IllegalStateException {
        if (this.B.equals(hVar)) {
            return;
        }
        this.B = hVar;
        if (this.f61028c0) {
            return;
        }
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f61059z;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setAudioAttributes(hVar);
        }
        flush();
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setAudioSessionId(int i10) throws IllegalStateException {
        if (this.Z != i10) {
            this.Z = i10;
            this.Y = i10 != 0;
            flush();
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setAuxEffectInfo(gn.i iVar) {
        if (this.f61024a0.equals(iVar)) {
            return;
        }
        int i10 = iVar.f57936a;
        float f10 = iVar.f57937b;
        AudioTrack audioTrack = this.f61057x;
        if (audioTrack != null) {
            if (this.f61024a0.f57936a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f61057x.setAuxEffectSendLevel(f10);
            }
        }
        this.f61024a0 = iVar;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setClock(io.bidmachine.media3.common.util.g gVar) {
        this.f61037h.setClock(gVar);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setListener(s sVar) {
        this.f61053t = sVar;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setOffloadDelayPadding(int i10, int i11) {
        l0 l0Var;
        AudioTrack audioTrack = this.f61057x;
        if (audioTrack == null || !j(audioTrack) || (l0Var = this.f61055v) == null || !l0Var.f60982k) {
            return;
        }
        this.f61057x.setOffloadDelayPadding(i10, i11);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setOffloadMode(int i10) {
        io.bidmachine.media3.common.util.a.checkState(io.bidmachine.media3.common.util.a1.f60679a >= 29);
        this.f61043k = i10;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public /* bridge */ /* synthetic */ void setOutputStreamOffsetUs(long j10) {
        super.setOutputStreamOffsetUs(j10);
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setPlaybackParameters(gn.c1 c1Var) {
        this.E = new gn.c1(io.bidmachine.media3.common.util.a1.constrainValue(c1Var.f57847a, 0.1f, 8.0f), io.bidmachine.media3.common.util.a1.constrainValue(c1Var.f57848b, 0.1f, 8.0f));
        if (p()) {
            n();
            return;
        }
        n0 n0Var = new n0(c1Var, C.TIME_UNSET, C.TIME_UNSET);
        if (i()) {
            this.C = n0Var;
        } else {
            this.D = n0Var;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setPlayerId(on.f0 f0Var) {
        this.f61052s = f0Var;
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        this.f61026b0 = audioDeviceInfo == null ? null : new h(audioDeviceInfo);
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f61059z;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.setRoutedDevice(audioDeviceInfo);
        }
        AudioTrack audioTrack = this.f61057x;
        if (audioTrack != null) {
            e0.setPreferredDeviceOnAudioTrack(audioTrack, this.f61026b0);
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setSkipSilenceEnabled(boolean z10) {
        this.F = z10;
        n0 n0Var = new n0(p() ? gn.c1.f57844d : this.E, C.TIME_UNSET, C.TIME_UNSET);
        if (i()) {
            this.C = n0Var;
        } else {
            this.D = n0Var;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public void setVolume(float f10) {
        if (this.Q != f10) {
            this.Q = f10;
            if (i()) {
                this.f61057x.setVolume(this.Q);
            }
        }
    }

    @Override // io.bidmachine.media3.exoplayer.audio.v
    public boolean supportsFormat(io.bidmachine.media3.common.b bVar) {
        return getFormatSupport(bVar) != 0;
    }
}
