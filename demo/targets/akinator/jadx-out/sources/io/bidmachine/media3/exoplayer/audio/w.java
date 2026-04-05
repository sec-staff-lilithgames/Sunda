package io.bidmachine.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final a f61067a;

    /* renamed from: b, reason: collision with root package name */
    public int f61068b;

    /* renamed from: c, reason: collision with root package name */
    public long f61069c;

    /* renamed from: d, reason: collision with root package name */
    public long f61070d;

    /* renamed from: e, reason: collision with root package name */
    public long f61071e;

    /* renamed from: f, reason: collision with root package name */
    public long f61072f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final AudioTrack f61073a;

        /* renamed from: b, reason: collision with root package name */
        public final AudioTimestamp f61074b = new AudioTimestamp();

        /* renamed from: c, reason: collision with root package name */
        public long f61075c;

        /* renamed from: d, reason: collision with root package name */
        public long f61076d;

        /* renamed from: e, reason: collision with root package name */
        public long f61077e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f61078f;

        /* renamed from: g, reason: collision with root package name */
        public long f61079g;

        public a(AudioTrack audioTrack) {
            this.f61073a = audioTrack;
        }

        public void expectTimestampFramePositionReset() {
            this.f61078f = true;
        }

        public long getTimestampPositionFrames() {
            return this.f61077e;
        }

        public long getTimestampSystemTimeUs() {
            return this.f61074b.nanoTime / 1000;
        }

        public boolean maybeUpdateTimestamp() {
            AudioTrack audioTrack = this.f61073a;
            AudioTimestamp audioTimestamp = this.f61074b;
            boolean timestamp = audioTrack.getTimestamp(audioTimestamp);
            if (timestamp) {
                long j10 = audioTimestamp.framePosition;
                long j11 = this.f61076d;
                if (j11 > j10) {
                    if (this.f61078f) {
                        this.f61079g += j11;
                        this.f61078f = false;
                    } else {
                        this.f61075c++;
                    }
                }
                this.f61076d = j10;
                this.f61077e = j10 + this.f61079g + (this.f61075c << 32);
            }
            return timestamp;
        }
    }

    public w(AudioTrack audioTrack) {
        this.f61067a = new a(audioTrack);
        reset();
    }

    public final void a(int i10) {
        this.f61068b = i10;
        if (i10 == 0) {
            this.f61071e = 0L;
            this.f61072f = -1L;
            this.f61069c = System.nanoTime() / 1000;
            this.f61070d = 10000L;
            return;
        }
        if (i10 == 1) {
            this.f61070d = 10000L;
            return;
        }
        if (i10 == 2 || i10 == 3) {
            this.f61070d = 10000000L;
        } else {
            if (i10 != 4) {
                throw new IllegalStateException();
            }
            this.f61070d = 500000L;
        }
    }

    public void acceptTimestamp() {
        if (this.f61068b == 4) {
            reset();
        }
    }

    public void expectTimestampFramePositionReset() {
        a aVar = this.f61067a;
        if (aVar != null) {
            aVar.expectTimestampFramePositionReset();
        }
    }

    public long getTimestampPositionFrames() {
        a aVar = this.f61067a;
        if (aVar != null) {
            return aVar.getTimestampPositionFrames();
        }
        return -1L;
    }

    public long getTimestampSystemTimeUs() {
        a aVar = this.f61067a;
        return aVar != null ? aVar.getTimestampSystemTimeUs() : C.TIME_UNSET;
    }

    public boolean hasAdvancingTimestamp() {
        return this.f61068b == 2;
    }

    public boolean hasTimestamp() {
        int i10 = this.f61068b;
        return i10 == 1 || i10 == 2;
    }

    public boolean maybePollTimestamp(long j10) {
        a aVar = this.f61067a;
        if (aVar == null || j10 - this.f61071e < this.f61070d) {
            return false;
        }
        this.f61071e = j10;
        boolean zMaybeUpdateTimestamp = aVar.maybeUpdateTimestamp();
        int i10 = this.f61068b;
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
                if (aVar.getTimestampPositionFrames() > this.f61072f) {
                    a(2);
                    return zMaybeUpdateTimestamp;
                }
            }
        } else {
            if (zMaybeUpdateTimestamp) {
                if (aVar.getTimestampSystemTimeUs() < this.f61069c) {
                    return false;
                }
                this.f61072f = aVar.getTimestampPositionFrames();
                a(1);
                return zMaybeUpdateTimestamp;
            }
            if (j10 - this.f61069c > 500000) {
                a(3);
            }
        }
        return zMaybeUpdateTimestamp;
    }

    public void rejectTimestamp() {
        a(4);
    }

    public void reset() {
        if (this.f61067a != null) {
            a(0);
        }
    }
}
