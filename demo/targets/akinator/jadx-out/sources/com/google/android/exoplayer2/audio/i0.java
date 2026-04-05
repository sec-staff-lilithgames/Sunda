package com.google.android.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final a f27129a;

    /* renamed from: b, reason: collision with root package name */
    public int f27130b;

    /* renamed from: c, reason: collision with root package name */
    public long f27131c;

    /* renamed from: d, reason: collision with root package name */
    public long f27132d;

    /* renamed from: e, reason: collision with root package name */
    public long f27133e;

    /* renamed from: f, reason: collision with root package name */
    public long f27134f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f27135a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f27136b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f27137c;

        /* renamed from: d, reason: collision with root package name */
        public long f27138d;

        /* renamed from: e, reason: collision with root package name */
        public long f27139e;

        public a(AudioTrack audioTrack) {
            this.f27135a = audioTrack;
        }

        public long getTimestampPositionFrames() {
            return this.f27139e;
        }

        public long getTimestampSystemTimeUs() {
            return this.f27136b.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            AudioTrack audioTrack = this.f27135a;
            AudioTimestamp audioTimestamp = this.f27136b;
            boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
            if (timestamp) {
                long j10 = audioTimestamp.framePosition;
                if (this.f27138d > j10) {
                    this.f27137c++;
                }
                this.f27138d = j10;
                this.f27139e = j10 + (this.f27137c << 32);
            }
            return timestamp;
        }
    }

    public i0(AudioTrack audioTrack) {
        if (com.google.android.exoplayer2.util.n1.f28506a >= 19) {
            this.f27129a = new a(audioTrack);
            reset();
        } else {
            this.f27129a = null;
            a(3);
        }
    }

    public final void a(int i10) {
        this.f27130b = i10;
        if (i10 == 0) {
            this.f27133e = 0L;
            this.f27134f = -1L;
            this.f27131c = System.nanoTime() / 1000;
            this.f27132d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f27132d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f27132d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f27132d = 500000L;
        }
    }

    public void acceptTimestamp() {
        if (this.f27130b == 4) {
            reset();
        }
    }

    public long getTimestampPositionFrames() {
        a aVar = this.f27129a;
        if (aVar != null) {
            return aVar.getTimestampPositionFrames();
        }
        return -1L;
    }

    public long getTimestampSystemTimeUs() {
        a aVar = this.f27129a;
        return aVar != null ? aVar.getTimestampSystemTimeUs() : C.TIME_UNSET;
    }

    public boolean hasAdvancingTimestamp() {
        return this.f27130b == 2;
    }

    public boolean hasTimestamp() {
        int i10 = this.f27130b;
        return i10 == 1 || i10 == 2;
    }

    public boolean maybePollTimestamp(long j10) {
        a aVar = this.f27129a;
        if (aVar == null || j10 - this.f27133e < this.f27132d) {
            return false;
        }
        this.f27133e = j10;
        boolean zMaybeUpdateTimestamp = aVar.maybeUpdateTimestamp();
        int i10 = this.f27130b;
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
                if (aVar.getTimestampPositionFrames() > this.f27134f) {
                    a(2);
                    return zMaybeUpdateTimestamp;
                }
            }
        } else {
            if (zMaybeUpdateTimestamp) {
                if (aVar.getTimestampSystemTimeUs() < this.f27131c) {
                    return false;
                }
                this.f27134f = aVar.getTimestampPositionFrames();
                a(1);
                return zMaybeUpdateTimestamp;
            }
            if (j10 - this.f27131c > 500000) {
                a(3);
            }
        }
        return zMaybeUpdateTimestamp;
    }

    public void rejectTimestamp() {
        a(4);
    }

    public void reset() {
        if (this.f27129a != null) {
            a(0);
        }
    }
}
