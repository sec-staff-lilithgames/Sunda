package sf;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    public boolean f85624c;

    /* renamed from: e, reason: collision with root package name */
    public int f85626e;

    /* renamed from: a, reason: collision with root package name */
    public a f85622a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f85623b = new a();

    /* renamed from: d, reason: collision with root package name */
    public long f85625d = C.TIME_UNSET;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f85627a;

        /* renamed from: b, reason: collision with root package name */
        public long f85628b;

        /* renamed from: c, reason: collision with root package name */
        public long f85629c;

        /* renamed from: d, reason: collision with root package name */
        public long f85630d;

        /* renamed from: e, reason: collision with root package name */
        public long f85631e;

        /* renamed from: f, reason: collision with root package name */
        public long f85632f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f85633g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f85634h;

        public long getFrameDurationNs() {
            long j10 = this.f85631e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f85632f / j10;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.f85632f;
        }

        public boolean isLastFrameOutlier() {
            long j10 = this.f85630d;
            if (j10 == 0) {
                return false;
            }
            return this.f85633g[(int) ((j10 - 1) % 15)];
        }

        public boolean isSynced() {
            return this.f85630d > 15 && this.f85634h == 0;
        }

        public void onNextFrame(long j10) {
            long j11 = this.f85630d;
            if (j11 == 0) {
                this.f85627a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f85627a;
                this.f85628b = j12;
                this.f85632f = j12;
                this.f85631e = 1L;
            } else {
                long j13 = j10 - this.f85629c;
                int i10 = (int) (j11 % 15);
                long jAbs = Math.abs(j13 - this.f85628b);
                boolean[] zArr = this.f85633g;
                if (jAbs <= 1000000) {
                    this.f85631e++;
                    this.f85632f += j13;
                    if (zArr[i10]) {
                        zArr[i10] = false;
                        this.f85634h--;
                    }
                } else if (!zArr[i10]) {
                    zArr[i10] = true;
                    this.f85634h++;
                }
            }
            this.f85630d++;
            this.f85629c = j10;
        }

        public void reset() {
            this.f85630d = 0L;
            this.f85631e = 0L;
            this.f85632f = 0L;
            this.f85634h = 0;
            Arrays.fill(this.f85633g, false);
        }
    }

    public long getFrameDurationNs() {
        return isSynced() ? this.f85622a.getFrameDurationNs() : C.TIME_UNSET;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.f85622a.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.f85626e;
    }

    public long getMatchingFrameDurationSumNs() {
        return isSynced() ? this.f85622a.getMatchingFrameDurationSumNs() : C.TIME_UNSET;
    }

    public boolean isSynced() {
        return this.f85622a.isSynced();
    }

    public void onNextFrame(long j10) {
        this.f85622a.onNextFrame(j10);
        if (this.f85622a.isSynced()) {
            this.f85624c = false;
        } else if (this.f85625d != C.TIME_UNSET) {
            if (!this.f85624c || this.f85623b.isLastFrameOutlier()) {
                this.f85623b.reset();
                this.f85623b.onNextFrame(this.f85625d);
            }
            this.f85624c = true;
            this.f85623b.onNextFrame(j10);
        }
        if (this.f85624c && this.f85623b.isSynced()) {
            a aVar = this.f85622a;
            this.f85622a = this.f85623b;
            this.f85623b = aVar;
            this.f85624c = false;
        }
        this.f85625d = j10;
        this.f85626e = this.f85622a.isSynced() ? 0 : this.f85626e + 1;
    }

    public void reset() {
        this.f85622a.reset();
        this.f85623b.reset();
        this.f85624c = false;
        this.f85625d = C.TIME_UNSET;
        this.f85626e = 0;
    }
}
