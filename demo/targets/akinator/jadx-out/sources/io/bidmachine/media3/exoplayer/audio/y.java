package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioTrack;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class y {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;
    public boolean H;
    public long I;
    public io.bidmachine.media3.common.util.g J;

    /* renamed from: a, reason: collision with root package name */
    public final x f61087a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f61088b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f61089c;

    /* renamed from: d, reason: collision with root package name */
    public int f61090d;

    /* renamed from: e, reason: collision with root package name */
    public int f61091e;

    /* renamed from: f, reason: collision with root package name */
    public w f61092f;

    /* renamed from: g, reason: collision with root package name */
    public int f61093g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f61094h;

    /* renamed from: i, reason: collision with root package name */
    public long f61095i;

    /* renamed from: j, reason: collision with root package name */
    public float f61096j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f61097k;

    /* renamed from: l, reason: collision with root package name */
    public long f61098l;

    /* renamed from: m, reason: collision with root package name */
    public long f61099m;

    /* renamed from: n, reason: collision with root package name */
    public Method f61100n;

    /* renamed from: o, reason: collision with root package name */
    public long f61101o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f61102p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f61103q;

    /* renamed from: r, reason: collision with root package name */
    public long f61104r;

    /* renamed from: s, reason: collision with root package name */
    public long f61105s;

    /* renamed from: t, reason: collision with root package name */
    public long f61106t;

    /* renamed from: u, reason: collision with root package name */
    public long f61107u;

    /* renamed from: v, reason: collision with root package name */
    public long f61108v;

    /* renamed from: w, reason: collision with root package name */
    public int f61109w;

    /* renamed from: x, reason: collision with root package name */
    public int f61110x;

    /* renamed from: y, reason: collision with root package name */
    public long f61111y;

    /* renamed from: z, reason: collision with root package name */
    public long f61112z;

    public y(x xVar) {
        this.f61087a = (x) io.bidmachine.media3.common.util.a.checkNotNull(xVar);
        try {
            this.f61100n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f61088b = new long[10];
        this.J = io.bidmachine.media3.common.util.g.f60717a;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            r12 = this;
            long r0 = r12.f61111y
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.b()
            long r2 = r12.B
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            io.bidmachine.media3.common.util.g r0 = r12.J
            io.bidmachine.media3.common.util.q0 r0 = (io.bidmachine.media3.common.util.q0) r0
            long r0 = r0.elapsedRealtime()
            long r4 = r12.f61105s
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L93
            android.media.AudioTrack r4 = r12.f61089c
            java.lang.Object r4 = io.bidmachine.media3.common.util.a.checkNotNull(r4)
            android.media.AudioTrack r4 = (android.media.AudioTrack) r4
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L38
            goto L91
        L38:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            boolean r4 = r12.f61094h
            r8 = 0
            if (r4 == 0) goto L57
            r4 = 2
            if (r5 != r4) goto L54
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L54
            long r10 = r12.f61106t
            r12.f61108v = r10
        L54:
            long r10 = r12.f61108v
            long r6 = r6 + r10
        L57:
            int r4 = io.bidmachine.media3.common.util.a1.f60679a
            r10 = 29
            if (r4 > r10) goto L75
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L73
            long r10 = r12.f61106t
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L73
            r4 = 3
            if (r5 != r4) goto L73
            long r4 = r12.f61112z
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L91
            r12.f61112z = r0
            goto L91
        L73:
            r12.f61112z = r2
        L75:
            long r2 = r12.f61106t
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L8f
            boolean r4 = r12.H
            if (r4 == 0) goto L88
            long r4 = r12.I
            long r4 = r4 + r2
            r12.I = r4
            r2 = 0
            r12.H = r2
            goto L8f
        L88:
            long r2 = r12.f61107u
            r4 = 1
            long r2 = r2 + r4
            r12.f61107u = r2
        L8f:
            r12.f61106t = r6
        L91:
            r12.f61105s = r0
        L93:
            long r0 = r12.f61106t
            long r2 = r12.I
            long r0 = r0 + r2
            long r2 = r12.f61107u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.media3.exoplayer.audio.y.a():long");
    }

    public final long b() {
        if (((AudioTrack) io.bidmachine.media3.common.util.a.checkNotNull(this.f61089c)).getPlayState() == 2) {
            return this.A;
        }
        return this.A + io.bidmachine.media3.common.util.a1.durationUsToSampleCount(io.bidmachine.media3.common.util.a1.getMediaDurationForPlayoutDuration(io.bidmachine.media3.common.util.a1.msToUs(((io.bidmachine.media3.common.util.q0) this.J).elapsedRealtime()) - this.f61111y, this.f61096j), this.f61093g);
    }

    public final void c() {
        this.f61098l = 0L;
        this.f61110x = 0;
        this.f61109w = 0;
        this.f61099m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f61097k = false;
    }

    public void expectRawPlaybackHeadReset() {
        this.H = true;
        w wVar = this.f61092f;
        if (wVar != null) {
            wVar.expectTimestampFramePositionReset();
        }
    }

    public int getAvailableBufferSize(long j10) {
        return this.f61091e - ((int) (j10 - (a() * this.f61090d)));
    }

    public long getCurrentPositionUs() {
        long j10;
        long jMax;
        Method method;
        AudioTrack audioTrack = (AudioTrack) io.bidmachine.media3.common.util.a.checkNotNull(this.f61089c);
        int playState = audioTrack.getPlayState();
        x xVar = this.f61087a;
        long j11 = 1000;
        if (playState == 3) {
            long jNanoTime = ((io.bidmachine.media3.common.util.q0) this.J).nanoTime() / 1000;
            if (jNanoTime - this.f61099m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                long jSampleCountToDurationUs = io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(a(), this.f61093g);
                if (jSampleCountToDurationUs != 0) {
                    int i10 = this.f61109w;
                    long playoutDurationForMediaDuration = io.bidmachine.media3.common.util.a1.getPlayoutDurationForMediaDuration(jSampleCountToDurationUs, this.f61096j) - jNanoTime;
                    long[] jArr = this.f61088b;
                    jArr[i10] = playoutDurationForMediaDuration;
                    this.f61109w = (this.f61109w + 1) % 10;
                    int i11 = this.f61110x;
                    if (i11 < 10) {
                        this.f61110x = i11 + 1;
                    }
                    this.f61099m = jNanoTime;
                    this.f61098l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f61110x;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f61098l += jArr[i12] / i13;
                        i12++;
                        j11 = j11;
                    }
                }
                j10 = 1000;
            }
            j10 = j11;
            if (!this.f61094h) {
                w wVar = (w) io.bidmachine.media3.common.util.a.checkNotNull(this.f61092f);
                if (wVar.maybePollTimestamp(jNanoTime)) {
                    long timestampSystemTimeUs = wVar.getTimestampSystemTimeUs();
                    long timestampPositionFrames = wVar.getTimestampPositionFrames();
                    long jSampleCountToDurationUs2 = io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(a(), this.f61093g);
                    if (Math.abs(timestampSystemTimeUs - jNanoTime) > 5000000) {
                        ((r0) xVar).onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, jNanoTime, jSampleCountToDurationUs2);
                        wVar.rejectTimestamp();
                    } else if (Math.abs(io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(timestampPositionFrames, this.f61093g) - jSampleCountToDurationUs2) > 5000000) {
                        ((r0) xVar).onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, jNanoTime, jSampleCountToDurationUs2);
                        jNanoTime = jNanoTime;
                        wVar.rejectTimestamp();
                    } else {
                        jNanoTime = jNanoTime;
                        wVar.acceptTimestamp();
                    }
                }
                if (this.f61103q && (method = this.f61100n) != null && jNanoTime - this.f61104r >= 500000) {
                    try {
                        long jIntValue = (((Integer) io.bidmachine.media3.common.util.a1.castNonNull((Integer) method.invoke(io.bidmachine.media3.common.util.a.checkNotNull(this.f61089c), null))).intValue() * j10) - this.f61095i;
                        this.f61101o = jIntValue;
                        long jMax2 = Math.max(jIntValue, 0L);
                        this.f61101o = jMax2;
                        if (jMax2 > 5000000) {
                            ((r0) xVar).onInvalidLatency(jMax2);
                            this.f61101o = 0L;
                        }
                    } catch (Exception unused) {
                        this.f61100n = null;
                    }
                    this.f61104r = jNanoTime;
                }
            }
        } else {
            j10 = 1000;
        }
        long jNanoTime2 = ((io.bidmachine.media3.common.util.q0) this.J).nanoTime() / j10;
        w wVar2 = (w) io.bidmachine.media3.common.util.a.checkNotNull(this.f61092f);
        boolean zHasAdvancingTimestamp = wVar2.hasAdvancingTimestamp();
        if (zHasAdvancingTimestamp) {
            jMax = io.bidmachine.media3.common.util.a1.getMediaDurationForPlayoutDuration(jNanoTime2 - wVar2.getTimestampSystemTimeUs(), this.f61096j) + io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(wVar2.getTimestampPositionFrames(), this.f61093g);
        } else {
            jMax = Math.max(0L, (this.f61110x == 0 ? this.f61111y != C.TIME_UNSET ? io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(b(), this.f61093g) : io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(a(), this.f61093g) : io.bidmachine.media3.common.util.a1.getMediaDurationForPlayoutDuration(this.f61098l + jNanoTime2, this.f61096j)) - this.f61101o);
            if (this.f61111y != C.TIME_UNSET) {
                jMax = Math.min(io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(this.B, this.f61093g), jMax);
            }
        }
        if (this.E != zHasAdvancingTimestamp) {
            this.G = this.D;
            this.F = this.C;
        }
        long j12 = jNanoTime2 - this.G;
        if (j12 < 1000000) {
            long mediaDurationForPlayoutDuration = io.bidmachine.media3.common.util.a1.getMediaDurationForPlayoutDuration(j12, this.f61096j) + this.F;
            long j13 = (j12 * j10) / 1000000;
            jMax = (((j10 - j13) * mediaDurationForPlayoutDuration) + (jMax * j13)) / j10;
        }
        if (!this.f61097k && jMax > this.C && audioTrack.getPlayState() == 3) {
            this.f61097k = true;
            ((r0) xVar).onPositionAdvancing(((io.bidmachine.media3.common.util.q0) this.J).currentTimeMillis() - io.bidmachine.media3.common.util.a1.usToMs(io.bidmachine.media3.common.util.a1.getPlayoutDurationForMediaDuration(io.bidmachine.media3.common.util.a1.usToMs(jMax - this.C), this.f61096j)));
        }
        this.D = jNanoTime2;
        this.C = jMax;
        this.E = zHasAdvancingTimestamp;
        return jMax;
    }

    public void handleEndOfStream(long j10) {
        this.A = a();
        this.f61111y = io.bidmachine.media3.common.util.a1.msToUs(((io.bidmachine.media3.common.util.q0) this.J).elapsedRealtime());
        this.B = j10;
    }

    public boolean hasPendingData(long j10) {
        if (j10 <= io.bidmachine.media3.common.util.a1.durationUsToSampleCount(getCurrentPositionUs(), this.f61093g)) {
            return this.f61094h && ((AudioTrack) io.bidmachine.media3.common.util.a.checkNotNull(this.f61089c)).getPlayState() == 2 && a() == 0;
        }
        return true;
    }

    public boolean isPlaying() {
        return ((AudioTrack) io.bidmachine.media3.common.util.a.checkNotNull(this.f61089c)).getPlayState() == 3;
    }

    public boolean isStalled(long j10) {
        return this.f61112z != C.TIME_UNSET && j10 > 0 && ((io.bidmachine.media3.common.util.q0) this.J).elapsedRealtime() - this.f61112z >= 200;
    }

    public boolean mayHandleBuffer(long j10) {
        int playState = ((AudioTrack) io.bidmachine.media3.common.util.a.checkNotNull(this.f61089c)).getPlayState();
        if (this.f61094h) {
            if (playState == 2) {
                this.f61102p = false;
                return false;
            }
            if (playState == 1 && a() == 0) {
                return false;
            }
        }
        boolean z10 = this.f61102p;
        boolean zHasPendingData = hasPendingData(j10);
        this.f61102p = zHasPendingData;
        if (z10 && !zHasPendingData && playState != 1) {
            ((r0) this.f61087a).onUnderrun(this.f61091e, io.bidmachine.media3.common.util.a1.usToMs(this.f61095i));
        }
        return true;
    }

    public boolean pause() {
        c();
        if (this.f61111y == C.TIME_UNSET) {
            ((w) io.bidmachine.media3.common.util.a.checkNotNull(this.f61092f)).reset();
            return true;
        }
        this.A = a();
        return false;
    }

    public void reset() {
        c();
        this.f61089c = null;
        this.f61092f = null;
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f61089c = audioTrack;
        this.f61090d = i11;
        this.f61091e = i12;
        this.f61092f = new w(audioTrack);
        this.f61093g = audioTrack.getSampleRate();
        this.f61094h = z10 && io.bidmachine.media3.common.util.a1.f60679a < 23 && (i10 == 5 || i10 == 6);
        boolean zIsEncodingLinearPcm = io.bidmachine.media3.common.util.a1.isEncodingLinearPcm(i10);
        this.f61103q = zIsEncodingLinearPcm;
        this.f61095i = zIsEncodingLinearPcm ? io.bidmachine.media3.common.util.a1.sampleCountToDurationUs(i12 / i11, this.f61093g) : -9223372036854775807L;
        this.f61106t = 0L;
        this.f61107u = 0L;
        this.H = false;
        this.I = 0L;
        this.f61108v = 0L;
        this.f61102p = false;
        this.f61111y = C.TIME_UNSET;
        this.f61112z = C.TIME_UNSET;
        this.f61104r = 0L;
        this.f61101o = 0L;
        this.f61096j = 1.0f;
    }

    public void setAudioTrackPlaybackSpeed(float f10) {
        this.f61096j = f10;
        w wVar = this.f61092f;
        if (wVar != null) {
            wVar.reset();
        }
        c();
    }

    public void setClock(io.bidmachine.media3.common.util.g gVar) {
        this.J = gVar;
    }

    public void start() {
        if (this.f61111y != C.TIME_UNSET) {
            this.f61111y = io.bidmachine.media3.common.util.a1.msToUs(((io.bidmachine.media3.common.util.q0) this.J).elapsedRealtime());
        }
        ((w) io.bidmachine.media3.common.util.a.checkNotNull(this.f61092f)).reset();
    }
}
