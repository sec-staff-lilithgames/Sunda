package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k0 {
    public long A;
    public long B;
    public long C;
    public long D;
    public boolean E;
    public long F;
    public long G;

    /* renamed from: a, reason: collision with root package name */
    public final j0 f27164a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f27165b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f27166c;

    /* renamed from: d, reason: collision with root package name */
    public int f27167d;

    /* renamed from: e, reason: collision with root package name */
    public int f27168e;

    /* renamed from: f, reason: collision with root package name */
    public i0 f27169f;

    /* renamed from: g, reason: collision with root package name */
    public int f27170g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f27171h;

    /* renamed from: i, reason: collision with root package name */
    public long f27172i;

    /* renamed from: j, reason: collision with root package name */
    public float f27173j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f27174k;

    /* renamed from: l, reason: collision with root package name */
    public long f27175l;

    /* renamed from: m, reason: collision with root package name */
    public long f27176m;

    /* renamed from: n, reason: collision with root package name */
    public Method f27177n;

    /* renamed from: o, reason: collision with root package name */
    public long f27178o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f27179p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f27180q;

    /* renamed from: r, reason: collision with root package name */
    public long f27181r;

    /* renamed from: s, reason: collision with root package name */
    public long f27182s;

    /* renamed from: t, reason: collision with root package name */
    public long f27183t;

    /* renamed from: u, reason: collision with root package name */
    public long f27184u;

    /* renamed from: v, reason: collision with root package name */
    public long f27185v;

    /* renamed from: w, reason: collision with root package name */
    public int f27186w;

    /* renamed from: x, reason: collision with root package name */
    public int f27187x;

    /* renamed from: y, reason: collision with root package name */
    public long f27188y;

    /* renamed from: z, reason: collision with root package name */
    public long f27189z;

    public k0(j0 j0Var) {
        this.f27164a = (j0) com.google.android.exoplayer2.util.a.checkNotNull(j0Var);
        if (com.google.android.exoplayer2.util.n1.f28506a >= 18) {
            try {
                this.f27177n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f27165b = new long[10];
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            r12 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r12.f27188y
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 == 0) goto L29
            r4 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r4
            long r0 = r0 - r2
            float r2 = r12.f27173j
            long r0 = com.google.android.exoplayer2.util.n1.getMediaDurationForPlayoutDuration(r0, r2)
            int r2 = r12.f27170g
            long r0 = com.google.android.exoplayer2.util.n1.durationUsToSampleCount(r0, r2)
            long r2 = r12.B
            long r4 = r12.A
            long r4 = r4 + r0
            long r0 = java.lang.Math.min(r2, r4)
            return r0
        L29:
            long r2 = r12.f27182s
            long r2 = r0 - r2
            r6 = 5
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 < 0) goto L91
            android.media.AudioTrack r2 = r12.f27166c
            java.lang.Object r2 = com.google.android.exoplayer2.util.a.checkNotNull(r2)
            android.media.AudioTrack r2 = (android.media.AudioTrack) r2
            int r3 = r2.getPlayState()
            r6 = 1
            if (r3 != r6) goto L43
            goto L8f
        L43:
            int r2 = r2.getPlaybackHeadPosition()
            long r6 = (long) r2
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            boolean r2 = r12.f27171h
            r8 = 0
            if (r2 == 0) goto L62
            r2 = 2
            if (r3 != r2) goto L5f
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L5f
            long r10 = r12.f27183t
            r12.f27185v = r10
        L5f:
            long r10 = r12.f27185v
            long r6 = r6 + r10
        L62:
            int r2 = com.google.android.exoplayer2.util.n1.f28506a
            r10 = 29
            if (r2 > r10) goto L80
            int r2 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r2 != 0) goto L7e
            long r10 = r12.f27183t
            int r2 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r2 <= 0) goto L7e
            r2 = 3
            if (r3 != r2) goto L7e
            long r2 = r12.f27189z
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L8f
            r12.f27189z = r0
            goto L8f
        L7e:
            r12.f27189z = r4
        L80:
            long r2 = r12.f27183t
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L8d
            long r2 = r12.f27184u
            r4 = 1
            long r2 = r2 + r4
            r12.f27184u = r2
        L8d:
            r12.f27183t = r6
        L8f:
            r12.f27182s = r0
        L91:
            long r0 = r12.f27183t
            long r2 = r12.f27184u
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.k0.a():long");
    }

    public final void b() {
        this.f27175l = 0L;
        this.f27187x = 0;
        this.f27186w = 0;
        this.f27176m = 0L;
        this.D = 0L;
        this.G = 0L;
        this.f27174k = false;
    }

    public int getAvailableBufferSize(long j10) {
        return this.f27168e - ((int) (j10 - (a() * this.f27167d)));
    }

    public long getCurrentPositionUs(boolean z10) {
        long j10;
        long jSampleCountToDurationUs;
        long j11;
        Method method;
        int playState = ((AudioTrack) com.google.android.exoplayer2.util.a.checkNotNull(this.f27166c)).getPlayState();
        j0 j0Var = this.f27164a;
        long j12 = 1000;
        if (playState == 3) {
            long jNanoTime = System.nanoTime() / 1000;
            if (jNanoTime - this.f27176m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
                long jSampleCountToDurationUs2 = com.google.android.exoplayer2.util.n1.sampleCountToDurationUs(a(), this.f27170g);
                if (jSampleCountToDurationUs2 != 0) {
                    int i10 = this.f27186w;
                    long playoutDurationForMediaDuration = com.google.android.exoplayer2.util.n1.getPlayoutDurationForMediaDuration(jSampleCountToDurationUs2, this.f27173j) - jNanoTime;
                    long[] jArr = this.f27165b;
                    jArr[i10] = playoutDurationForMediaDuration;
                    this.f27186w = (this.f27186w + 1) % 10;
                    int i11 = this.f27187x;
                    if (i11 < 10) {
                        this.f27187x = i11 + 1;
                    }
                    this.f27176m = jNanoTime;
                    this.f27175l = 0L;
                    int i12 = 0;
                    while (true) {
                        int i13 = this.f27187x;
                        if (i12 >= i13) {
                            break;
                        }
                        this.f27175l = (jArr[i12] / i13) + this.f27175l;
                        i12++;
                        j12 = j12;
                    }
                }
                j10 = 1000;
            }
            j10 = j12;
            if (!this.f27171h) {
                i0 i0Var = (i0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27169f);
                if (i0Var.maybePollTimestamp(jNanoTime)) {
                    long timestampSystemTimeUs = i0Var.getTimestampSystemTimeUs();
                    long timestampPositionFrames = i0Var.getTimestampPositionFrames();
                    j11 = 5000000;
                    long jSampleCountToDurationUs3 = com.google.android.exoplayer2.util.n1.sampleCountToDurationUs(a(), this.f27170g);
                    if (Math.abs(timestampSystemTimeUs - jNanoTime) > 5000000) {
                        ((z0) j0Var).onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, jNanoTime, jSampleCountToDurationUs3);
                        i0Var.rejectTimestamp();
                    } else if (Math.abs(com.google.android.exoplayer2.util.n1.sampleCountToDurationUs(timestampPositionFrames, this.f27170g) - jSampleCountToDurationUs3) > 5000000) {
                        ((z0) j0Var).onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, jNanoTime, jSampleCountToDurationUs3);
                        i0Var.rejectTimestamp();
                    } else {
                        i0Var.acceptTimestamp();
                    }
                } else {
                    j11 = 5000000;
                }
                if (this.f27180q && (method = this.f27177n) != null && jNanoTime - this.f27181r >= 500000) {
                    try {
                        long jIntValue = (((Integer) com.google.android.exoplayer2.util.n1.castNonNull((Integer) method.invoke(com.google.android.exoplayer2.util.a.checkNotNull(this.f27166c), null))).intValue() * j10) - this.f27172i;
                        this.f27178o = jIntValue;
                        long jMax = Math.max(jIntValue, 0L);
                        this.f27178o = jMax;
                        if (jMax > j11) {
                            ((z0) j0Var).onInvalidLatency(jMax);
                            this.f27178o = 0L;
                        }
                    } catch (Exception unused) {
                        this.f27177n = null;
                    }
                    this.f27181r = jNanoTime;
                }
            }
        } else {
            j10 = 1000;
        }
        long jNanoTime2 = System.nanoTime() / j10;
        i0 i0Var2 = (i0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27169f);
        boolean zHasAdvancingTimestamp = i0Var2.hasAdvancingTimestamp();
        if (zHasAdvancingTimestamp) {
            jSampleCountToDurationUs = com.google.android.exoplayer2.util.n1.getMediaDurationForPlayoutDuration(jNanoTime2 - i0Var2.getTimestampSystemTimeUs(), this.f27173j) + com.google.android.exoplayer2.util.n1.sampleCountToDurationUs(i0Var2.getTimestampPositionFrames(), this.f27170g);
        } else {
            jSampleCountToDurationUs = this.f27187x == 0 ? com.google.android.exoplayer2.util.n1.sampleCountToDurationUs(a(), this.f27170g) : com.google.android.exoplayer2.util.n1.getMediaDurationForPlayoutDuration(this.f27175l + jNanoTime2, this.f27173j);
            if (!z10) {
                jSampleCountToDurationUs = Math.max(0L, jSampleCountToDurationUs - this.f27178o);
            }
        }
        if (this.E != zHasAdvancingTimestamp) {
            this.G = this.D;
            this.F = this.C;
        }
        long j13 = jNanoTime2 - this.G;
        if (j13 < 1000000) {
            long mediaDurationForPlayoutDuration = com.google.android.exoplayer2.util.n1.getMediaDurationForPlayoutDuration(j13, this.f27173j) + this.F;
            long j14 = (j13 * j10) / 1000000;
            jSampleCountToDurationUs = (((j10 - j14) * mediaDurationForPlayoutDuration) + (jSampleCountToDurationUs * j14)) / j10;
        }
        if (!this.f27174k) {
            long j15 = this.C;
            if (jSampleCountToDurationUs > j15) {
                this.f27174k = true;
                ((z0) j0Var).onPositionAdvancing(System.currentTimeMillis() - com.google.android.exoplayer2.util.n1.usToMs(com.google.android.exoplayer2.util.n1.getPlayoutDurationForMediaDuration(com.google.android.exoplayer2.util.n1.usToMs(jSampleCountToDurationUs - j15), this.f27173j)));
            }
        }
        this.D = jNanoTime2;
        this.C = jSampleCountToDurationUs;
        this.E = zHasAdvancingTimestamp;
        return jSampleCountToDurationUs;
    }

    public void handleEndOfStream(long j10) {
        this.A = a();
        this.f27188y = SystemClock.elapsedRealtime() * 1000;
        this.B = j10;
    }

    public boolean hasPendingData(long j10) {
        if (j10 <= com.google.android.exoplayer2.util.n1.durationUsToSampleCount(getCurrentPositionUs(false), this.f27170g)) {
            return this.f27171h && ((AudioTrack) com.google.android.exoplayer2.util.a.checkNotNull(this.f27166c)).getPlayState() == 2 && a() == 0;
        }
        return true;
    }

    public boolean isPlaying() {
        return ((AudioTrack) com.google.android.exoplayer2.util.a.checkNotNull(this.f27166c)).getPlayState() == 3;
    }

    public boolean isStalled(long j10) {
        return this.f27189z != C.TIME_UNSET && j10 > 0 && SystemClock.elapsedRealtime() - this.f27189z >= 200;
    }

    public boolean mayHandleBuffer(long j10) {
        int playState = ((AudioTrack) com.google.android.exoplayer2.util.a.checkNotNull(this.f27166c)).getPlayState();
        if (this.f27171h) {
            if (playState == 2) {
                this.f27179p = false;
                return false;
            }
            if (playState == 1 && a() == 0) {
                return false;
            }
        }
        boolean z10 = this.f27179p;
        boolean zHasPendingData = hasPendingData(j10);
        this.f27179p = zHasPendingData;
        if (z10 && !zHasPendingData && playState != 1) {
            ((z0) this.f27164a).onUnderrun(this.f27168e, com.google.android.exoplayer2.util.n1.usToMs(this.f27172i));
        }
        return true;
    }

    public boolean pause() {
        b();
        if (this.f27188y != C.TIME_UNSET) {
            return false;
        }
        ((i0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27169f)).reset();
        return true;
    }

    public void reset() {
        b();
        this.f27166c = null;
        this.f27169f = null;
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f27166c = audioTrack;
        this.f27167d = i11;
        this.f27168e = i12;
        this.f27169f = new i0(audioTrack);
        this.f27170g = audioTrack.getSampleRate();
        this.f27171h = z10 && com.google.android.exoplayer2.util.n1.f28506a < 23 && (i10 == 5 || i10 == 6);
        boolean zIsEncodingLinearPcm = com.google.android.exoplayer2.util.n1.isEncodingLinearPcm(i10);
        this.f27180q = zIsEncodingLinearPcm;
        this.f27172i = zIsEncodingLinearPcm ? com.google.android.exoplayer2.util.n1.sampleCountToDurationUs(i12 / i11, this.f27170g) : -9223372036854775807L;
        this.f27183t = 0L;
        this.f27184u = 0L;
        this.f27185v = 0L;
        this.f27179p = false;
        this.f27188y = C.TIME_UNSET;
        this.f27189z = C.TIME_UNSET;
        this.f27181r = 0L;
        this.f27178o = 0L;
        this.f27173j = 1.0f;
    }

    public void setAudioTrackPlaybackSpeed(float f10) {
        this.f27173j = f10;
        i0 i0Var = this.f27169f;
        if (i0Var != null) {
            i0Var.reset();
        }
        b();
    }

    public void start() {
        ((i0) com.google.android.exoplayer2.util.a.checkNotNull(this.f27169f)).reset();
    }
}
