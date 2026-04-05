package com.google.android.exoplayer2.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.l2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutorService;
import nh.b5;
import nh.ej;
import nh.x4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c1 implements h0 {

    /* renamed from: h0, reason: collision with root package name */
    public static final Object f27061h0 = new Object();

    /* renamed from: i0, reason: collision with root package name */
    public static ExecutorService f27062i0;

    /* renamed from: j0, reason: collision with root package name */
    public static int f27063j0;
    public x0 A;
    public x0 B;
    public l2 C;
    public boolean D;
    public ByteBuffer E;
    public int F;
    public long G;
    public long H;
    public long I;
    public long J;
    public int K;
    public boolean L;
    public boolean M;
    public long N;
    public float O;
    public ByteBuffer P;
    public int Q;
    public ByteBuffer R;
    public byte[] S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public l0 Z;

    /* renamed from: a, reason: collision with root package name */
    public final Context f27064a;

    /* renamed from: a0, reason: collision with root package name */
    public r0 f27065a0;

    /* renamed from: b, reason: collision with root package name */
    public final v f27066b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f27067b0;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27068c;

    /* renamed from: c0, reason: collision with root package name */
    public long f27069c0;

    /* renamed from: d, reason: collision with root package name */
    public final n0 f27070d;

    /* renamed from: d0, reason: collision with root package name */
    public long f27071d0;

    /* renamed from: e, reason: collision with root package name */
    public final s1 f27072e;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f27073e0;

    /* renamed from: f, reason: collision with root package name */
    public final b5 f27074f;

    /* renamed from: f0, reason: collision with root package name */
    public boolean f27075f0;

    /* renamed from: g, reason: collision with root package name */
    public final b5 f27076g;

    /* renamed from: g0, reason: collision with root package name */
    public Looper f27077g0;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.android.exoplayer2.util.g f27078h;

    /* renamed from: i, reason: collision with root package name */
    public final k0 f27079i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayDeque f27080j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f27081k;

    /* renamed from: l, reason: collision with root package name */
    public final int f27082l;

    /* renamed from: m, reason: collision with root package name */
    public b1 f27083m;

    /* renamed from: n, reason: collision with root package name */
    public final y0 f27084n;

    /* renamed from: o, reason: collision with root package name */
    public final y0 f27085o;

    /* renamed from: p, reason: collision with root package name */
    public final t0 f27086p;

    /* renamed from: q, reason: collision with root package name */
    public final com.google.android.exoplayer2.t f27087q;

    /* renamed from: r, reason: collision with root package name */
    public zd.c0 f27088r;

    /* renamed from: s, reason: collision with root package name */
    public e0 f27089s;

    /* renamed from: t, reason: collision with root package name */
    public v0 f27090t;

    /* renamed from: u, reason: collision with root package name */
    public v0 f27091u;

    /* renamed from: v, reason: collision with root package name */
    public r f27092v;

    /* renamed from: w, reason: collision with root package name */
    public AudioTrack f27093w;

    /* renamed from: x, reason: collision with root package name */
    public n f27094x;

    /* renamed from: y, reason: collision with root package name */
    public AudioCapabilitiesReceiver f27095y;

    /* renamed from: z, reason: collision with root package name */
    public k f27096z;

    public c1(u0 u0Var) {
        Context context = u0Var.f27292a;
        this.f27064a = context;
        this.f27094x = context != null ? n.getCapabilities(context) : u0Var.f27293b;
        this.f27066b = u0Var.f27294c;
        int i10 = com.google.android.exoplayer2.util.n1.f28506a;
        this.f27068c = i10 >= 21 && u0Var.f27295d;
        this.f27081k = i10 >= 23 && u0Var.f27296e;
        this.f27082l = i10 >= 29 ? u0Var.f27297f : 0;
        this.f27086p = u0Var.f27298g;
        com.google.android.exoplayer2.util.g gVar = new com.google.android.exoplayer2.util.g(com.google.android.exoplayer2.util.d.f28436a);
        this.f27078h = gVar;
        gVar.open();
        this.f27079i = new k0(new z0(this));
        n0 n0Var = new n0();
        this.f27070d = n0Var;
        s1 s1Var = new s1();
        this.f27072e = s1Var;
        this.f27074f = b5.of((s1) new r1(), (s1) n0Var, s1Var);
        this.f27076g = b5.of(new q1());
        this.O = 1.0f;
        this.f27096z = k.f27152i;
        this.Y = 0;
        this.Z = new l0(0, 0.0f);
        l2 l2Var = l2.f27634f;
        this.B = new x0(l2Var, 0L, 0L);
        this.C = l2Var;
        this.D = false;
        this.f27080j = new ArrayDeque();
        this.f27084n = new y0(100L);
        this.f27085o = new y0(100L);
        this.f27087q = u0Var.f27299h;
    }

    public static AudioFormat e(int i10, int i11, int i12) {
        return new AudioFormat.Builder().setSampleRate(i10).setChannelMask(i11).setEncoding(i12).build();
    }

    public static boolean j(AudioTrack audioTrack) {
        return com.google.android.exoplayer2.util.n1.f28506a >= 29 && audioTrack.isOffloadedPlayback();
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
            boolean r0 = r9.n()
            boolean r1 = r9.f27068c
            com.google.android.exoplayer2.audio.v r2 = r9.f27066b
            if (r0 != 0) goto L2e
            boolean r0 = r9.f27067b0
            if (r0 != 0) goto L28
            com.google.android.exoplayer2.audio.v0 r0 = r9.f27091u
            int r3 = r0.f27302c
            if (r3 != 0) goto L28
            com.google.android.exoplayer2.z0 r0 = r0.f27300a
            int r0 = r0.C
            if (r1 == 0) goto L21
            boolean r0 = com.google.android.exoplayer2.util.n1.isEncodingHighResolutionPcm(r0)
            if (r0 == 0) goto L21
            goto L28
        L21:
            com.google.android.exoplayer2.l2 r0 = r9.C
            com.google.android.exoplayer2.l2 r0 = r2.applyPlaybackParameters(r0)
            goto L2a
        L28:
            com.google.android.exoplayer2.l2 r0 = com.google.android.exoplayer2.l2.f27634f
        L2a:
            r9.C = r0
        L2c:
            r4 = r0
            goto L31
        L2e:
            com.google.android.exoplayer2.l2 r0 = com.google.android.exoplayer2.l2.f27634f
            goto L2c
        L31:
            boolean r0 = r9.f27067b0
            if (r0 != 0) goto L4f
            com.google.android.exoplayer2.audio.v0 r0 = r9.f27091u
            int r3 = r0.f27302c
            if (r3 != 0) goto L4f
            com.google.android.exoplayer2.z0 r0 = r0.f27300a
            int r0 = r0.C
            if (r1 == 0) goto L48
            boolean r0 = com.google.android.exoplayer2.util.n1.isEncodingHighResolutionPcm(r0)
            if (r0 == 0) goto L48
            goto L4f
        L48:
            boolean r0 = r9.D
            boolean r0 = r2.applySkipSilenceEnabled(r0)
            goto L50
        L4f:
            r0 = 0
        L50:
            r9.D = r0
            com.google.android.exoplayer2.audio.x0 r3 = new com.google.android.exoplayer2.audio.x0
            r0 = 0
            long r5 = java.lang.Math.max(r0, r10)
            com.google.android.exoplayer2.audio.v0 r10 = r9.f27091u
            long r0 = r9.g()
            long r7 = r10.framesToDurationUs(r0)
            r3.<init>(r4, r5, r7)
            java.util.ArrayDeque r10 = r9.f27080j
            r10.add(r3)
            com.google.android.exoplayer2.audio.v0 r10 = r9.f27091u
            com.google.android.exoplayer2.audio.r r10 = r10.f27308i
            r9.f27092v = r10
            r10.flush()
            com.google.android.exoplayer2.audio.e0 r10 = r9.f27089s
            if (r10 == 0) goto L80
            boolean r11 = r9.D
            com.google.android.exoplayer2.audio.h1 r10 = (com.google.android.exoplayer2.audio.h1) r10
            r10.onSkipSilenceEnabledChanged(r11)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.c1.a(long):void");
    }

    public final AudioTrack b(v0 v0Var) throws d0 {
        try {
            AudioTrack audioTrackBuildAudioTrack = v0Var.buildAudioTrack(this.f27067b0, this.f27096z, this.Y);
            com.google.android.exoplayer2.t tVar = this.f27087q;
            if (tVar == null) {
                return audioTrackBuildAudioTrack;
            }
            ((com.google.android.exoplayer2.p0) tVar).onExperimentalOffloadedPlayback(j(audioTrackBuildAudioTrack));
            return audioTrackBuildAudioTrack;
        } catch (d0 e10) {
            e0 e0Var = this.f27089s;
            if (e0Var != null) {
                ((h1) e0Var).onAudioSinkError(e10);
            }
            throw e10;
        }
    }

    public final boolean c() throws Exception {
        ByteBuffer byteBuffer;
        if (this.f27092v.isOperational()) {
            this.f27092v.queueEndOfStream();
            k(Long.MIN_VALUE);
            return this.f27092v.isEnded() && ((byteBuffer = this.R) == null || !byteBuffer.hasRemaining());
        }
        ByteBuffer byteBuffer2 = this.R;
        if (byteBuffer2 == null) {
            return true;
        }
        p(byteBuffer2, Long.MIN_VALUE);
        return this.R == null;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void configure(com.google.android.exoplayer2.z0 z0Var, int i10, int[] iArr) throws c0 {
        r rVar;
        int iIntValue;
        int i11;
        int i12;
        boolean z10;
        int i13;
        int i14;
        int i15;
        int bufferSizeInBytes;
        int[] iArr2;
        String str = z0Var.f28802n;
        int i16 = z0Var.B;
        int i17 = z0Var.A;
        int i18 = z0Var.C;
        boolean zEquals = MimeTypes.AUDIO_RAW.equals(str);
        boolean z11 = this.f27081k;
        if (zEquals) {
            com.google.android.exoplayer2.util.a.checkArgument(com.google.android.exoplayer2.util.n1.isEncodingLinearPcm(i18));
            int pcmFrameSize = com.google.android.exoplayer2.util.n1.getPcmFrameSize(i18, i17);
            x4 x4Var = new x4();
            if (this.f27068c && com.google.android.exoplayer2.util.n1.isEncodingHighResolutionPcm(i18)) {
                x4Var.addAll((Iterable<Object>) this.f27076g);
            } else {
                x4Var.addAll((Iterable<Object>) this.f27074f);
                x4Var.add((Object[]) this.f27066b.getAudioProcessors());
            }
            rVar = new r(x4Var.build());
            if (rVar.equals(this.f27092v)) {
                rVar = this.f27092v;
            }
            this.f27072e.setTrimFrameCount(z0Var.D, z0Var.E);
            if (com.google.android.exoplayer2.util.n1.f28506a < 21 && i17 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i19 = 0; i19 < 6; i19++) {
                    iArr2[i19] = i19;
                }
            } else {
                iArr2 = iArr;
            }
            this.f27070d.setChannelMap(iArr2);
            try {
                s sVarConfigure = rVar.configure(new s(i16, i17, i18));
                int i20 = sVarConfigure.f27281c;
                int i21 = sVarConfigure.f27280b;
                i16 = sVarConfigure.f27279a;
                iIntValue = com.google.android.exoplayer2.util.n1.getAudioTrackChannelConfig(i21);
                int pcmFrameSize2 = com.google.android.exoplayer2.util.n1.getPcmFrameSize(i20, i21);
                i12 = i20;
                i11 = 0;
                i13 = pcmFrameSize;
                z10 = z11;
                i14 = pcmFrameSize2;
            } catch (t e10) {
                throw new c0(e10, z0Var);
            }
        } else {
            rVar = new r(b5.of());
            if (o(this.f27096z, z0Var)) {
                int encoding = com.google.android.exoplayer2.util.l0.getEncoding((String) com.google.android.exoplayer2.util.a.checkNotNull(z0Var.f28802n), z0Var.f28799k);
                iIntValue = com.google.android.exoplayer2.util.n1.getAudioTrackChannelConfig(i17);
                i12 = encoding;
                i13 = -1;
                i14 = -1;
                z10 = true;
                i11 = 1;
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = d().getEncodingAndChannelConfigForPassthrough(z0Var);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new c0("Unable to configure passthrough for: " + z0Var, z0Var);
                }
                int iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i11 = 2;
                i12 = iIntValue2;
                z10 = z11;
                i13 = -1;
                i14 = -1;
            }
        }
        if (i12 == 0) {
            throw new c0("Invalid output encoding (mode=" + i11 + ") for: " + z0Var, z0Var);
        }
        if (iIntValue == 0) {
            throw new c0("Invalid output channel config (mode=" + i11 + ") for: " + z0Var, z0Var);
        }
        if (i10 != 0) {
            i15 = i16;
            bufferSizeInBytes = i10;
        } else {
            int minBufferSize = AudioTrack.getMinBufferSize(i16, iIntValue, i12);
            com.google.android.exoplayer2.util.a.checkState(minBufferSize != -2);
            i15 = i16;
            bufferSizeInBytes = ((e1) this.f27086p).getBufferSizeInBytes(minBufferSize, i12, i11, i14 != -1 ? i14 : 1, i15, z0Var.f28798j, z10 ? 8.0d : 1.0d);
        }
        this.f27073e0 = false;
        v0 v0Var = new v0(z0Var, i13, i11, i14, i15, iIntValue, i12, bufferSizeInBytes, rVar, z10);
        if (i()) {
            this.f27090t = v0Var;
        } else {
            this.f27091u = v0Var;
        }
    }

    public final n d() {
        Context context;
        if (this.f27095y == null && (context = this.f27064a) != null) {
            this.f27077g0 = Looper.myLooper();
            AudioCapabilitiesReceiver audioCapabilitiesReceiver = new AudioCapabilitiesReceiver(context, new o0(this));
            this.f27095y = audioCapabilitiesReceiver;
            this.f27094x = audioCapabilitiesReceiver.register();
        }
        return this.f27094x;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void disableTunneling() throws IllegalStateException {
        if (this.f27067b0) {
            this.f27067b0 = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void enableTunnelingV21() throws IllegalStateException {
        com.google.android.exoplayer2.util.a.checkState(com.google.android.exoplayer2.util.n1.f28506a >= 21);
        com.google.android.exoplayer2.util.a.checkState(this.X);
        if (this.f27067b0) {
            return;
        }
        this.f27067b0 = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void experimentalFlushWithoutAudioTrackRelease() throws IllegalStateException {
        if (com.google.android.exoplayer2.util.n1.f28506a < 25) {
            flush();
            return;
        }
        this.f27085o.clear();
        this.f27084n.clear();
        if (i()) {
            l();
            k0 k0Var = this.f27079i;
            if (k0Var.isPlaying()) {
                this.f27093w.pause();
            }
            this.f27093w.flush();
            k0Var.reset();
            AudioTrack audioTrack = this.f27093w;
            v0 v0Var = this.f27091u;
            this.f27079i.setAudioTrack(audioTrack, v0Var.f27302c == 2, v0Var.f27306g, v0Var.f27303d, v0Var.f27307h);
            this.M = true;
        }
    }

    public final long f() {
        return this.f27091u.f27302c == 0 ? this.G / r0.f27301b : this.H;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void flush() throws IllegalStateException {
        if (i()) {
            l();
            if (this.f27079i.isPlaying()) {
                this.f27093w.pause();
            }
            if (j(this.f27093w)) {
                ((b1) com.google.android.exoplayer2.util.a.checkNotNull(this.f27083m)).unregister(this.f27093w);
            }
            if (com.google.android.exoplayer2.util.n1.f28506a < 21 && !this.X) {
                this.Y = 0;
            }
            v0 v0Var = this.f27090t;
            if (v0Var != null) {
                this.f27091u = v0Var;
                this.f27090t = null;
            }
            this.f27079i.reset();
            AudioTrack audioTrack = this.f27093w;
            com.google.android.exoplayer2.util.g gVar = this.f27078h;
            gVar.close();
            synchronized (f27061h0) {
                try {
                    if (f27062i0 == null) {
                        f27062i0 = com.google.android.exoplayer2.util.n1.newSingleThreadExecutor("ExoPlayer:AudioTrackReleaseThread");
                    }
                    f27063j0++;
                    f27062i0.execute(new af.n(26, audioTrack, gVar));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f27093w = null;
        }
        this.f27085o.clear();
        this.f27084n.clear();
    }

    public final long g() {
        return this.f27091u.f27302c == 0 ? this.I / r0.f27303d : this.J;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public k getAudioAttributes() {
        return this.f27096z;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public long getCurrentPositionUs(boolean z10) {
        ArrayDeque arrayDeque;
        long mediaDurationForPlayoutDuration;
        if (!i() || this.M) {
            return Long.MIN_VALUE;
        }
        long jMin = Math.min(this.f27079i.getCurrentPositionUs(z10), this.f27091u.framesToDurationUs(g()));
        while (true) {
            arrayDeque = this.f27080j;
            if (arrayDeque.isEmpty() || jMin < ((x0) arrayDeque.getFirst()).f27323c) {
                break;
            }
            this.B = (x0) arrayDeque.remove();
        }
        x0 x0Var = this.B;
        long j10 = jMin - x0Var.f27323c;
        boolean zEquals = x0Var.f27321a.equals(l2.f27634f);
        v vVar = this.f27066b;
        if (zEquals) {
            mediaDurationForPlayoutDuration = this.B.f27322b + j10;
        } else if (arrayDeque.isEmpty()) {
            mediaDurationForPlayoutDuration = vVar.getMediaDuration(j10) + this.B.f27322b;
        } else {
            x0 x0Var2 = (x0) arrayDeque.getFirst();
            mediaDurationForPlayoutDuration = x0Var2.f27322b - com.google.android.exoplayer2.util.n1.getMediaDurationForPlayoutDuration(x0Var2.f27323c - jMin, this.B.f27321a.f27637b);
        }
        return this.f27091u.framesToDurationUs(vVar.getSkippedOutputFrameCount()) + mediaDurationForPlayoutDuration;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public int getFormatSupport(com.google.android.exoplayer2.z0 z0Var) {
        String str = z0Var.f28802n;
        int i10 = z0Var.C;
        if (MimeTypes.AUDIO_RAW.equals(str)) {
            if (!com.google.android.exoplayer2.util.n1.isEncodingLinearPcm(i10)) {
                com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.p(i10, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i10 != 2 && (!this.f27068c || i10 != 4)) {
                return 1;
            }
        } else if ((this.f27073e0 || !o(this.f27096z, z0Var)) && !d().isPassthroughPlaybackSupported(z0Var)) {
            return 0;
        }
        return 2;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public l2 getPlaybackParameters() {
        return this.C;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public boolean getSkipSilenceEnabled() {
        return this.D;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h() throws com.google.android.exoplayer2.audio.d0 {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.c1.h():boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0144, code lost:
    
        if (r13 == 0) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x008a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009c  */
    @Override // com.google.android.exoplayer2.audio.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleBuffer(java.nio.ByteBuffer r19, long r20, int r22) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 540
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.c1.handleBuffer(java.nio.ByteBuffer, long, int):boolean");
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void handleDiscontinuity() {
        this.L = true;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public boolean hasPendingData() {
        return i() && this.f27079i.hasPendingData(g());
    }

    public final boolean i() {
        return this.f27093w != null;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public boolean isEnded() {
        if (i()) {
            return this.U && !hasPendingData();
        }
        return true;
    }

    public final void k(long j10) throws Exception {
        ByteBuffer output;
        if (!this.f27092v.isOperational()) {
            ByteBuffer byteBuffer = this.P;
            if (byteBuffer == null) {
                byteBuffer = u.f27291a;
            }
            p(byteBuffer, j10);
            return;
        }
        while (!this.f27092v.isEnded()) {
            do {
                output = this.f27092v.getOutput();
                if (output.hasRemaining()) {
                    p(output, j10);
                } else {
                    ByteBuffer byteBuffer2 = this.P;
                    if (byteBuffer2 == null || !byteBuffer2.hasRemaining()) {
                        return;
                    } else {
                        this.f27092v.queueInput(this.P);
                    }
                }
            } while (!output.hasRemaining());
            return;
        }
    }

    public final void l() {
        this.G = 0L;
        this.H = 0L;
        this.I = 0L;
        this.J = 0L;
        this.f27075f0 = false;
        this.K = 0;
        this.B = new x0(this.C, 0L, 0L);
        this.N = 0L;
        this.A = null;
        this.f27080j.clear();
        this.P = null;
        this.Q = 0;
        this.R = null;
        this.V = false;
        this.U = false;
        this.E = null;
        this.F = 0;
        this.f27072e.resetTrimmedFrameCount();
        r rVar = this.f27091u.f27308i;
        this.f27092v = rVar;
        rVar.flush();
    }

    public final void m() {
        if (i()) {
            try {
                this.f27093w.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(this.C.f27637b).setPitch(this.C.f27638c).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e10) {
                com.google.android.exoplayer2.util.f0.w("DefaultAudioSink", "Failed to set playback params", e10);
            }
            l2 l2Var = new l2(this.f27093w.getPlaybackParams().getSpeed(), this.f27093w.getPlaybackParams().getPitch());
            this.C = l2Var;
            this.f27079i.setAudioTrackPlaybackSpeed(l2Var.f27637b);
        }
    }

    public final boolean n() {
        v0 v0Var = this.f27091u;
        return v0Var != null && v0Var.f27309j && com.google.android.exoplayer2.util.n1.f28506a >= 23;
    }

    public final boolean o(k kVar, com.google.android.exoplayer2.z0 z0Var) {
        int i10;
        int encoding;
        int audioTrackChannelConfig;
        int i11 = com.google.android.exoplayer2.util.n1.f28506a;
        if (i11 >= 29 && (i10 = this.f27082l) != 0 && (encoding = com.google.android.exoplayer2.util.l0.getEncoding((String) com.google.android.exoplayer2.util.a.checkNotNull(z0Var.f28802n), z0Var.f28799k)) != 0 && (audioTrackChannelConfig = com.google.android.exoplayer2.util.n1.getAudioTrackChannelConfig(z0Var.A)) != 0) {
            AudioFormat audioFormatE = e(z0Var.B, audioTrackChannelConfig, encoding);
            AudioAttributes audioAttributes = kVar.getAudioAttributesV21().f27128a;
            int playbackOffloadSupport = i11 >= 31 ? AudioManager.getPlaybackOffloadSupport(audioFormatE, audioAttributes) : !AudioManager.isOffloadedPlaybackSupported(audioFormatE, audioAttributes) ? 0 : (i11 == 30 && com.google.android.exoplayer2.util.n1.f28509d.startsWith("Pixel")) ? 2 : 1;
            if (playbackOffloadSupport != 0) {
                if (playbackOffloadSupport == 1) {
                    boolean z10 = (z0Var.D == 0 && z0Var.E == 0) ? false : true;
                    boolean z11 = i10 == 1;
                    if (!z10 || !z11) {
                    }
                } else if (playbackOffloadSupport != 2) {
                    throw new IllegalStateException();
                }
                return true;
            }
        }
        return false;
    }

    public void onAudioCapabilitiesChanged(n nVar) {
        com.google.android.exoplayer2.util.a.checkState(this.f27077g0 == Looper.myLooper());
        if (nVar.equals(d())) {
            return;
        }
        this.f27094x = nVar;
        e0 e0Var = this.f27089s;
        if (e0Var != null) {
            ((h1) e0Var).onAudioCapabilitiesChanged();
        }
    }

    public final void p(ByteBuffer byteBuffer, long j10) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        int iWrite2;
        e0 e0Var;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.R;
            if (byteBuffer3 != null) {
                com.google.android.exoplayer2.util.a.checkArgument(byteBuffer3 == byteBuffer);
            } else {
                this.R = byteBuffer;
                if (com.google.android.exoplayer2.util.n1.f28506a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.S;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.S = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.S, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.T = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i10 = com.google.android.exoplayer2.util.n1.f28506a;
            if (i10 < 21) {
                int availableBufferSize = this.f27079i.getAvailableBufferSize(this.I);
                if (availableBufferSize > 0) {
                    iWrite = this.f27093w.write(this.S, this.T, Math.min(iRemaining2, availableBufferSize));
                    if (iWrite > 0) {
                        this.T += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.f27067b0) {
                com.google.android.exoplayer2.util.a.checkState(j10 != C.TIME_UNSET);
                if (j10 == Long.MIN_VALUE) {
                    j10 = this.f27069c0;
                } else {
                    this.f27069c0 = j10;
                }
                AudioTrack audioTrack = this.f27093w;
                if (i10 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1, j10 * 1000);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.E == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.E = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.E.putInt(1431633921);
                    }
                    if (this.F == 0) {
                        this.E.putInt(4, iRemaining2);
                        this.E.putLong(8, j10 * 1000);
                        this.E.position(0);
                        this.F = iRemaining2;
                    }
                    int iRemaining3 = this.E.remaining();
                    if (iRemaining3 > 0) {
                        iWrite = audioTrack.write(this.E, iRemaining3, 1);
                        if (iWrite < 0) {
                            this.F = 0;
                        } else if (iWrite < iRemaining3) {
                            iWrite = 0;
                        }
                    }
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.F = 0;
                    } else {
                        this.F -= iWrite2;
                    }
                }
                iWrite = iWrite2;
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f27093w.write(byteBuffer2, iRemaining2, 1);
            }
            this.f27071d0 = SystemClock.elapsedRealtime();
            y0 y0Var = this.f27085o;
            if (iWrite < 0) {
                g0 g0Var = new g0(iWrite, this.f27091u.f27300a, ((i10 >= 24 && iWrite == -6) || iWrite == -32) && this.J > 0);
                e0 e0Var2 = this.f27089s;
                if (e0Var2 != null) {
                    ((h1) e0Var2).onAudioSinkError(g0Var);
                }
                if (g0Var.f27125c) {
                    this.f27094x = n.f27212c;
                    throw g0Var;
                }
                y0Var.throwExceptionIfDeadlineIsReached(g0Var);
                return;
            }
            y0Var.clear();
            if (j(this.f27093w)) {
                if (this.J > 0) {
                    this.f27075f0 = false;
                }
                if (this.W && (e0Var = this.f27089s) != null && iWrite < iRemaining2 && !this.f27075f0) {
                    ((h1) e0Var).onOffloadBufferFull();
                }
            }
            int i11 = this.f27091u.f27302c;
            if (i11 == 0) {
                this.I += iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i11 != 0) {
                    com.google.android.exoplayer2.util.a.checkState(byteBuffer2 == this.P);
                    this.J = (this.K * this.Q) + this.J;
                }
                this.R = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void pause() throws IllegalStateException {
        this.W = false;
        if (i() && this.f27079i.pause()) {
            this.f27093w.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void play() throws IllegalStateException {
        this.W = true;
        if (i()) {
            this.f27079i.start();
            this.f27093w.play();
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void playToEndOfStream() throws IllegalStateException, g0 {
        if (!this.U && i() && c()) {
            if (!this.V) {
                this.V = true;
                this.f27079i.handleEndOfStream(g());
                this.f27093w.stop();
                this.F = 0;
            }
            this.U = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void release() {
        AudioCapabilitiesReceiver audioCapabilitiesReceiver = this.f27095y;
        if (audioCapabilitiesReceiver != null) {
            audioCapabilitiesReceiver.unregister();
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void reset() throws IllegalStateException {
        flush();
        ej it = this.f27074f.iterator();
        while (it.hasNext()) {
            ((u) it.next()).reset();
        }
        ej it2 = this.f27076g.iterator();
        while (it2.hasNext()) {
            ((u) it2.next()).reset();
        }
        r rVar = this.f27092v;
        if (rVar != null) {
            rVar.reset();
        }
        this.W = false;
        this.f27073e0 = false;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setAudioAttributes(k kVar) throws IllegalStateException {
        if (this.f27096z.equals(kVar)) {
            return;
        }
        this.f27096z = kVar;
        if (this.f27067b0) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setAudioSessionId(int i10) throws IllegalStateException {
        if (this.Y != i10) {
            this.Y = i10;
            this.X = i10 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setAuxEffectInfo(l0 l0Var) {
        if (this.Z.equals(l0Var)) {
            return;
        }
        int i10 = l0Var.f27197a;
        float f10 = l0Var.f27198b;
        AudioTrack audioTrack = this.f27093w;
        if (audioTrack != null) {
            if (this.Z.f27197a != i10) {
                audioTrack.attachAuxEffect(i10);
            }
            if (i10 != 0) {
                this.f27093w.setAuxEffectSendLevel(f10);
            }
        }
        this.Z = l0Var;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setListener(e0 e0Var) {
        this.f27089s = e0Var;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public /* bridge */ /* synthetic */ void setOutputStreamOffsetUs(long j10) {
        super.setOutputStreamOffsetUs(j10);
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setPlaybackParameters(l2 l2Var) {
        this.C = new l2(com.google.android.exoplayer2.util.n1.constrainValue(l2Var.f27637b, 0.1f, 8.0f), com.google.android.exoplayer2.util.n1.constrainValue(l2Var.f27638c, 0.1f, 8.0f));
        if (n()) {
            m();
            return;
        }
        x0 x0Var = new x0(l2Var, C.TIME_UNSET, C.TIME_UNSET);
        if (i()) {
            this.A = x0Var;
        } else {
            this.B = x0Var;
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setPlayerId(zd.c0 c0Var) {
        this.f27088r = c0Var;
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setPreferredDevice(AudioDeviceInfo audioDeviceInfo) {
        r0 r0Var = audioDeviceInfo == null ? null : new r0(audioDeviceInfo);
        this.f27065a0 = r0Var;
        AudioTrack audioTrack = this.f27093w;
        if (audioTrack != null) {
            p0.setPreferredDeviceOnAudioTrack(audioTrack, r0Var);
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setSkipSilenceEnabled(boolean z10) {
        this.D = z10;
        x0 x0Var = new x0(n() ? l2.f27634f : this.C, C.TIME_UNSET, C.TIME_UNSET);
        if (i()) {
            this.A = x0Var;
        } else {
            this.B = x0Var;
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public void setVolume(float f10) {
        if (this.O != f10) {
            this.O = f10;
            if (i()) {
                if (com.google.android.exoplayer2.util.n1.f28506a >= 21) {
                    this.f27093w.setVolume(this.O);
                    return;
                }
                AudioTrack audioTrack = this.f27093w;
                float f11 = this.O;
                audioTrack.setStereoVolume(f11, f11);
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.h0
    public boolean supportsFormat(com.google.android.exoplayer2.z0 z0Var) {
        return getFormatSupport(z0Var) != 0;
    }
}
