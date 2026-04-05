package io.odeeo.internal.r0;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: c, reason: collision with root package name */
    public boolean f66151c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f66152d;

    /* renamed from: f, reason: collision with root package name */
    public int f66154f;

    /* renamed from: a, reason: collision with root package name */
    public a f66149a = new a();

    /* renamed from: b, reason: collision with root package name */
    public a f66150b = new a();

    /* renamed from: e, reason: collision with root package name */
    public long f66153e = C.TIME_UNSET;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f66155a;

        /* renamed from: b, reason: collision with root package name */
        public long f66156b;

        /* renamed from: c, reason: collision with root package name */
        public long f66157c;

        /* renamed from: d, reason: collision with root package name */
        public long f66158d;

        /* renamed from: e, reason: collision with root package name */
        public long f66159e;

        /* renamed from: f, reason: collision with root package name */
        public long f66160f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean[] f66161g = new boolean[15];

        /* renamed from: h, reason: collision with root package name */
        public int f66162h;

        public static int a(long j10) {
            return (int) (j10 % 15);
        }

        public long getFrameDurationNs() {
            long j10 = this.f66159e;
            if (j10 == 0) {
                return 0L;
            }
            return this.f66160f / j10;
        }

        public long getMatchingFrameDurationSumNs() {
            return this.f66160f;
        }

        public boolean isLastFrameOutlier() {
            long j10 = this.f66158d;
            if (j10 == 0) {
                return false;
            }
            return this.f66161g[a(j10 - 1)];
        }

        public boolean isSynced() {
            return this.f66158d > 15 && this.f66162h == 0;
        }

        public void onNextFrame(long j10) {
            long j11 = this.f66158d;
            if (j11 == 0) {
                this.f66155a = j10;
            } else if (j11 == 1) {
                long j12 = j10 - this.f66155a;
                this.f66156b = j12;
                this.f66160f = j12;
                this.f66159e = 1L;
            } else {
                long j13 = j10 - this.f66157c;
                int iA = a(j11);
                if (Math.abs(j13 - this.f66156b) <= 1000000) {
                    this.f66159e++;
                    this.f66160f += j13;
                    boolean[] zArr = this.f66161g;
                    if (zArr[iA]) {
                        zArr[iA] = false;
                        this.f66162h--;
                    }
                } else {
                    boolean[] zArr2 = this.f66161g;
                    if (!zArr2[iA]) {
                        zArr2[iA] = true;
                        this.f66162h++;
                    }
                }
            }
            this.f66158d++;
            this.f66157c = j10;
        }

        public void reset() {
            this.f66158d = 0L;
            this.f66159e = 0L;
            this.f66160f = 0L;
            this.f66162h = 0;
            Arrays.fill(this.f66161g, false);
        }
    }

    public long getFrameDurationNs() {
        return isSynced() ? this.f66149a.getFrameDurationNs() : C.TIME_UNSET;
    }

    public float getFrameRate() {
        if (isSynced()) {
            return (float) (1.0E9d / this.f66149a.getFrameDurationNs());
        }
        return -1.0f;
    }

    public int getFramesWithoutSyncCount() {
        return this.f66154f;
    }

    public long getMatchingFrameDurationSumNs() {
        return isSynced() ? this.f66149a.getMatchingFrameDurationSumNs() : C.TIME_UNSET;
    }

    public boolean isSynced() {
        return this.f66149a.isSynced();
    }

    public void onNextFrame(long j10) {
        this.f66149a.onNextFrame(j10);
        if (this.f66149a.isSynced() && !this.f66152d) {
            this.f66151c = false;
        } else if (this.f66153e != C.TIME_UNSET) {
            if (!this.f66151c || this.f66150b.isLastFrameOutlier()) {
                this.f66150b.reset();
                this.f66150b.onNextFrame(this.f66153e);
            }
            this.f66151c = true;
            this.f66150b.onNextFrame(j10);
        }
        if (this.f66151c && this.f66150b.isSynced()) {
            a aVar = this.f66149a;
            this.f66149a = this.f66150b;
            this.f66150b = aVar;
            this.f66151c = false;
            this.f66152d = false;
        }
        this.f66153e = j10;
        this.f66154f = this.f66149a.isSynced() ? 0 : this.f66154f + 1;
    }

    public void reset() {
        this.f66149a.reset();
        this.f66150b.reset();
        this.f66151c = false;
        this.f66153e = C.TIME_UNSET;
        this.f66154f = 0;
    }
}
