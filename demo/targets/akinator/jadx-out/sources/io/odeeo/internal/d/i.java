package io.odeeo.internal.d;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final a f63367a;

    /* renamed from: b, reason: collision with root package name */
    public int f63368b;

    /* renamed from: c, reason: collision with root package name */
    public long f63369c;

    /* renamed from: d, reason: collision with root package name */
    public long f63370d;

    /* renamed from: e, reason: collision with root package name */
    public long f63371e;

    /* renamed from: f, reason: collision with root package name */
    public long f63372f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f63373a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f63374b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f63375c;

        /* renamed from: d, reason: collision with root package name */
        public long f63376d;

        /* renamed from: e, reason: collision with root package name */
        public long f63377e;

        public a(AudioTrack audioTrack) {
            this.f63373a = audioTrack;
        }

        public long getTimestampPositionFrames() {
            return this.f63377e;
        }

        public long getTimestampSystemTimeUs() {
            return this.f63374b.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            boolean timestamp = this.f63373a.getTimestamp(this.f63374b);
            if (timestamp) {
                long j10 = this.f63374b.framePosition;
                if (this.f63376d > j10) {
                    this.f63375c++;
                }
                this.f63376d = j10;
                this.f63377e = j10 + (this.f63375c << 32);
            }
            return timestamp;
        }
    }

    public i(AudioTrack audioTrack) {
        if (g0.f65861a >= 19) {
            this.f63367a = new a(audioTrack);
            reset();
        } else {
            this.f63367a = null;
            a(3);
        }
    }

    public final void a(int i10) {
        this.f63368b = i10;
        if (i10 == 0) {
            this.f63371e = 0L;
            this.f63372f = -1L;
            this.f63369c = System.nanoTime() / 1000;
            this.f63370d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f63370d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f63370d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f63370d = 500000L;
        }
    }

    public void acceptTimestamp() {
        if (this.f63368b == 4) {
            reset();
        }
    }

    public long getTimestampPositionFrames() {
        a aVar = this.f63367a;
        if (aVar != null) {
            return aVar.getTimestampPositionFrames();
        }
        return -1L;
    }

    public long getTimestampSystemTimeUs() {
        a aVar = this.f63367a;
        return aVar != null ? aVar.getTimestampSystemTimeUs() : C.TIME_UNSET;
    }

    public boolean hasAdvancingTimestamp() {
        return this.f63368b == 2;
    }

    public boolean hasTimestamp() {
        int i10 = this.f63368b;
        return i10 == 1 || i10 == 2;
    }

    public boolean maybePollTimestamp(long j10) {
        a aVar = this.f63367a;
        if (aVar == null || j10 - this.f63371e < this.f63370d) {
            return false;
        }
        this.f63371e = j10;
        boolean zMaybeUpdateTimestamp = aVar.maybeUpdateTimestamp();
        int i10 = this.f63368b;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            throw new IllegalStateException();
                        }
                    } else if (zMaybeUpdateTimestamp) {
                        reset();
                        return zMaybeUpdateTimestamp;
                    }
                } else if (!zMaybeUpdateTimestamp) {
                    reset();
                    return zMaybeUpdateTimestamp;
                }
            } else {
                if (!zMaybeUpdateTimestamp) {
                    reset();
                    return zMaybeUpdateTimestamp;
                }
                if (this.f63367a.getTimestampPositionFrames() > this.f63372f) {
                    a(2);
                    return zMaybeUpdateTimestamp;
                }
            }
        } else {
            if (zMaybeUpdateTimestamp) {
                if (this.f63367a.getTimestampSystemTimeUs() < this.f63369c) {
                    return false;
                }
                this.f63372f = this.f63367a.getTimestampPositionFrames();
                a(1);
                return zMaybeUpdateTimestamp;
            }
            if (j10 - this.f63369c > 500000) {
                a(3);
            }
        }
        return zMaybeUpdateTimestamp;
    }

    public void rejectTimestamp() {
        a(4);
    }

    public void reset() {
        if (this.f63367a != null) {
            a(0);
        }
    }
}
