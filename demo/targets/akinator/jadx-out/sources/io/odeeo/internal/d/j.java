package io.odeeo.internal.d;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.g0;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class j {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* renamed from: a, reason: collision with root package name */
    public final a f63378a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f63379b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f63380c;

    /* renamed from: d, reason: collision with root package name */
    public int f63381d;

    /* renamed from: e, reason: collision with root package name */
    public int f63382e;

    /* renamed from: f, reason: collision with root package name */
    public i f63383f;

    /* renamed from: g, reason: collision with root package name */
    public int f63384g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f63385h;

    /* renamed from: i, reason: collision with root package name */
    public long f63386i;

    /* renamed from: j, reason: collision with root package name */
    public float f63387j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f63388k;

    /* renamed from: l, reason: collision with root package name */
    public long f63389l;

    /* renamed from: m, reason: collision with root package name */
    public long f63390m;

    /* renamed from: n, reason: collision with root package name */
    public Method f63391n;

    /* renamed from: o, reason: collision with root package name */
    public long f63392o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f63393p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f63394q;

    /* renamed from: r, reason: collision with root package name */
    public long f63395r;

    /* renamed from: s, reason: collision with root package name */
    public long f63396s;

    /* renamed from: t, reason: collision with root package name */
    public long f63397t;

    /* renamed from: u, reason: collision with root package name */
    public long f63398u;

    /* renamed from: v, reason: collision with root package name */
    public int f63399v;

    /* renamed from: w, reason: collision with root package name */
    public int f63400w;

    /* renamed from: x, reason: collision with root package name */
    public long f63401x;

    /* renamed from: y, reason: collision with root package name */
    public long f63402y;

    /* renamed from: z, reason: collision with root package name */
    public long f63403z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void onInvalidLatency(long j10);

        void onPositionAdvancing(long j10);

        void onPositionFramesMismatch(long j10, long j11, long j12, long j13);

        void onSystemTimeUsMismatch(long j10, long j11, long j12, long j13);

        void onUnderrun(int i10, long j10);
    }

    public j(a aVar) {
        this.f63378a = (a) io.odeeo.internal.q0.a.checkNotNull(aVar);
        if (g0.f65861a >= 18) {
            try {
                this.f63391n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f63379b = new long[10];
    }

    public final void a(long j10, long j11) {
        i iVar = (i) io.odeeo.internal.q0.a.checkNotNull(this.f63383f);
        if (iVar.maybePollTimestamp(j10)) {
            long timestampSystemTimeUs = iVar.getTimestampSystemTimeUs();
            long timestampPositionFrames = iVar.getTimestampPositionFrames();
            if (Math.abs(timestampSystemTimeUs - j10) > 5000000) {
                this.f63378a.onSystemTimeUsMismatch(timestampPositionFrames, timestampSystemTimeUs, j10, j11);
                iVar.rejectTimestamp();
            } else if (Math.abs(a(timestampPositionFrames) - j11) <= 5000000) {
                iVar.acceptTimestamp();
            } else {
                this.f63378a.onPositionFramesMismatch(timestampPositionFrames, timestampSystemTimeUs, j10, j11);
                iVar.rejectTimestamp();
            }
        }
    }

    public final void b(long j10) {
        Method method;
        if (!this.f63394q || (method = this.f63391n) == null || j10 - this.f63395r < 500000) {
            return;
        }
        try {
            long jIntValue = (((Integer) g0.castNonNull((Integer) method.invoke(io.odeeo.internal.q0.a.checkNotNull(this.f63380c), null))).intValue() * 1000) - this.f63386i;
            this.f63392o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f63392o = jMax;
            if (jMax > 5000000) {
                this.f63378a.onInvalidLatency(jMax);
                this.f63392o = 0L;
            }
        } catch (Exception unused) {
            this.f63391n = null;
        }
        this.f63395r = j10;
    }

    public final long c() {
        return a(b());
    }

    public final void d() {
        long jC = c();
        if (jC == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.f63390m >= CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL) {
            long[] jArr = this.f63379b;
            int i10 = this.f63399v;
            jArr[i10] = jC - jNanoTime;
            this.f63399v = (i10 + 1) % 10;
            int i11 = this.f63400w;
            if (i11 < 10) {
                this.f63400w = i11 + 1;
            }
            this.f63390m = jNanoTime;
            this.f63389l = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.f63400w;
                if (i12 >= i13) {
                    break;
                }
                this.f63389l = (this.f63379b[i12] / i13) + this.f63389l;
                i12++;
            }
        }
        if (this.f63385h) {
            return;
        }
        a(jNanoTime, jC);
        b(jNanoTime);
    }

    public final void e() {
        this.f63389l = 0L;
        this.f63400w = 0;
        this.f63399v = 0;
        this.f63390m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f63388k = false;
    }

    public int getAvailableBufferSize(long j10) {
        return this.f63382e - ((int) (j10 - (b() * this.f63381d)));
    }

    public long getCurrentPositionUs(boolean z10) {
        long jC;
        if (((AudioTrack) io.odeeo.internal.q0.a.checkNotNull(this.f63380c)).getPlayState() == 3) {
            d();
        }
        long jNanoTime = System.nanoTime() / 1000;
        i iVar = (i) io.odeeo.internal.q0.a.checkNotNull(this.f63383f);
        boolean zHasAdvancingTimestamp = iVar.hasAdvancingTimestamp();
        if (zHasAdvancingTimestamp) {
            jC = g0.getMediaDurationForPlayoutDuration(jNanoTime - iVar.getTimestampSystemTimeUs(), this.f63387j) + a(iVar.getTimestampPositionFrames());
        } else {
            jC = this.f63400w == 0 ? c() : this.f63389l + jNanoTime;
            if (!z10) {
                jC = Math.max(0L, jC - this.f63392o);
            }
        }
        if (this.D != zHasAdvancingTimestamp) {
            this.F = this.C;
            this.E = this.B;
        }
        long j10 = jNanoTime - this.F;
        if (j10 < 1000000) {
            long mediaDurationForPlayoutDuration = g0.getMediaDurationForPlayoutDuration(j10, this.f63387j) + this.E;
            long j11 = (j10 * 1000) / 1000000;
            jC = (((1000 - j11) * mediaDurationForPlayoutDuration) + (jC * j11)) / 1000;
        }
        if (!this.f63388k) {
            long j12 = this.B;
            if (jC > j12) {
                this.f63388k = true;
                this.f63378a.onPositionAdvancing(System.currentTimeMillis() - g0.usToMs(g0.getPlayoutDurationForMediaDuration(g0.usToMs(jC - j12), this.f63387j)));
            }
        }
        this.C = jNanoTime;
        this.B = jC;
        this.D = zHasAdvancingTimestamp;
        return jC;
    }

    public long getPendingBufferDurationMs(long j10) {
        return g0.usToMs(a(j10 - b()));
    }

    public void handleEndOfStream(long j10) {
        this.f63403z = b();
        this.f63401x = SystemClock.elapsedRealtime() * 1000;
        this.A = j10;
    }

    public boolean hasPendingData(long j10) {
        return j10 > b() || a();
    }

    public boolean isPlaying() {
        return ((AudioTrack) io.odeeo.internal.q0.a.checkNotNull(this.f63380c)).getPlayState() == 3;
    }

    public boolean isStalled(long j10) {
        return this.f63402y != C.TIME_UNSET && j10 > 0 && SystemClock.elapsedRealtime() - this.f63402y >= 200;
    }

    public boolean mayHandleBuffer(long j10) {
        int playState = ((AudioTrack) io.odeeo.internal.q0.a.checkNotNull(this.f63380c)).getPlayState();
        if (this.f63385h) {
            if (playState == 2) {
                this.f63393p = false;
                return false;
            }
            if (playState == 1 && b() == 0) {
                return false;
            }
        }
        boolean z10 = this.f63393p;
        boolean zHasPendingData = hasPendingData(j10);
        this.f63393p = zHasPendingData;
        if (z10 && !zHasPendingData && playState != 1) {
            this.f63378a.onUnderrun(this.f63382e, g0.usToMs(this.f63386i));
        }
        return true;
    }

    public boolean pause() {
        e();
        if (this.f63401x != C.TIME_UNSET) {
            return false;
        }
        ((i) io.odeeo.internal.q0.a.checkNotNull(this.f63383f)).reset();
        return true;
    }

    public void reset() {
        e();
        this.f63380c = null;
        this.f63383f = null;
    }

    public void setAudioTrack(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f63380c = audioTrack;
        this.f63381d = i11;
        this.f63382e = i12;
        this.f63383f = new i(audioTrack);
        this.f63384g = audioTrack.getSampleRate();
        this.f63385h = z10 && a(i10);
        boolean zIsEncodingLinearPcm = g0.isEncodingLinearPcm(i10);
        this.f63394q = zIsEncodingLinearPcm;
        this.f63386i = zIsEncodingLinearPcm ? a(i12 / i11) : -9223372036854775807L;
        this.f63396s = 0L;
        this.f63397t = 0L;
        this.f63398u = 0L;
        this.f63393p = false;
        this.f63401x = C.TIME_UNSET;
        this.f63402y = C.TIME_UNSET;
        this.f63395r = 0L;
        this.f63392o = 0L;
        this.f63387j = 1.0f;
    }

    public void setAudioTrackPlaybackSpeed(float f10) {
        this.f63387j = f10;
        i iVar = this.f63383f;
        if (iVar != null) {
            iVar.reset();
        }
    }

    public void start() {
        ((i) io.odeeo.internal.q0.a.checkNotNull(this.f63383f)).reset();
    }

    public final long b() {
        AudioTrack audioTrack = (AudioTrack) io.odeeo.internal.q0.a.checkNotNull(this.f63380c);
        if (this.f63401x != C.TIME_UNSET) {
            return Math.min(this.A, this.f63403z + ((((SystemClock.elapsedRealtime() * 1000) - this.f63401x) * this.f63384g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
        if (this.f63385h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f63398u = this.f63396s;
            }
            playbackHeadPosition += this.f63398u;
        }
        if (g0.f65861a <= 29) {
            if (playbackHeadPosition == 0 && this.f63396s > 0 && playState == 3) {
                if (this.f63402y == C.TIME_UNSET) {
                    this.f63402y = SystemClock.elapsedRealtime();
                }
                return this.f63396s;
            }
            this.f63402y = C.TIME_UNSET;
        }
        if (this.f63396s > playbackHeadPosition) {
            this.f63397t++;
        }
        this.f63396s = playbackHeadPosition;
        return playbackHeadPosition + (this.f63397t << 32);
    }

    public final long a(long j10) {
        return (j10 * 1000000) / this.f63384g;
    }

    public final boolean a() {
        return this.f63385h && ((AudioTrack) io.odeeo.internal.q0.a.checkNotNull(this.f63380c)).getPlayState() == 2 && b() == 0;
    }

    public static boolean a(int i10) {
        if (g0.f65861a < 23) {
            return i10 == 5 || i10 == 6;
        }
        return false;
    }
}
