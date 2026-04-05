package io;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    public boolean f62111c;

    /* renamed from: e, reason: collision with root package name */
    public int f62113e;

    /* renamed from: a, reason: collision with root package name */
    public a f62109a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f62110b = new a();

    /* renamed from: d, reason: collision with root package name */
    public long f62112d = C.TIME_UNSET;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f62114a;

        /* renamed from: b, reason: collision with root package name */
        public long f62115b;

        /* renamed from: c, reason: collision with root package name */
        public long f62116c;

        /* renamed from: d, reason: collision with root package name */
        public long f62117d;

        /* renamed from: e, reason: collision with root package name */
        public long f62118e;

        /* renamed from: f, reason: collision with root package name */
        public long f62119f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f62120g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f62121h;

        public long getFrameDurationNs() {
            long j10 = this.f62118e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f62119f / j10;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.f62119f;
        }

        public boolean isLastFrameOutlier() {
            long j10 = this.f62117d;
            if (j10 == 0) {
                return false;
            }
            return this.f62120g[(int) ((j10 - 1) % 15)];
        }

        public boolean isSynced() {
            return this.f62117d > 15 && this.f62121h == 0;
        }

        public void onNextFrame(long j10) {
            long j11 = this.f62117d;
            if (j11 == 0) {
                this.f62114a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f62114a;
                this.f62115b = j12;
                this.f62119f = j12;
                this.f62118e = 1L;
            } else {
                long j13 = j10 - this.f62116c;
                int i10 = (int) (j11 % 15);
                long jAbs = Math.abs(j13 - this.f62115b);
                boolean[] zArr = this.f62120g;
                if (jAbs <= 1000000) {
                    this.f62118e++;
                    this.f62119f += j13;
                    if (zArr[i10]) {
                        zArr[i10] = false;
                        this.f62121h--;
                    }
                } else if (!zArr[i10]) {
                    zArr[i10] = true;
                    this.f62121h++;
                }
            }
            this.f62117d++;
            this.f62116c = j10;
        }

        public void reset() {
            this.f62117d = 0L;
            this.f62118e = 0L;
            this.f62119f = 0L;
            this.f62121h = 0;
            Arrays.fill(this.f62120g, false);
        }
    }

    public long getFrameDurationNs() {
        return isSynced() ? this.f62109a.getFrameDurationNs() : C.TIME_UNSET;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.f62109a.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.f62113e;
    }

    public long getMatchingFrameDurationSumNs() {
        return isSynced() ? this.f62109a.getMatchingFrameDurationSumNs() : C.TIME_UNSET;
    }

    public boolean isSynced() {
        return this.f62109a.isSynced();
    }

    public void onNextFrame(long j10) {
        this.f62109a.onNextFrame(j10);
        if (this.f62109a.isSynced()) {
            this.f62111c = false;
        } else if (this.f62112d != C.TIME_UNSET) {
            if (!this.f62111c || this.f62110b.isLastFrameOutlier()) {
                this.f62110b.reset();
                this.f62110b.onNextFrame(this.f62112d);
            }
            this.f62111c = true;
            this.f62110b.onNextFrame(j10);
        }
        if (this.f62111c && this.f62110b.isSynced()) {
            a aVar = this.f62109a;
            this.f62109a = this.f62110b;
            this.f62110b = aVar;
            this.f62111c = false;
        }
        this.f62112d = j10;
        this.f62113e = this.f62109a.isSynced() ? 0 : this.f62113e + 1;
    }

    public void reset() {
        this.f62109a.reset();
        this.f62110b.reset();
        this.f62111c = false;
        this.f62112d = C.TIME_UNSET;
        this.f62113e = 0;
    }
}
