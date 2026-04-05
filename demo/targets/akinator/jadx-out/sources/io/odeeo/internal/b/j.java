package io.odeeo.internal.b;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class j implements y {

    /* renamed from: a, reason: collision with root package name */
    public final io.odeeo.internal.p0.n f62745a;

    /* renamed from: b, reason: collision with root package name */
    public final long f62746b;

    /* renamed from: c, reason: collision with root package name */
    public final long f62747c;

    /* renamed from: d, reason: collision with root package name */
    public final long f62748d;

    /* renamed from: e, reason: collision with root package name */
    public final long f62749e;

    /* renamed from: f, reason: collision with root package name */
    public final int f62750f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f62751g;

    /* renamed from: h, reason: collision with root package name */
    public final long f62752h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f62753i;

    /* renamed from: j, reason: collision with root package name */
    public int f62754j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f62755k;

    public j() {
        this(new io.odeeo.internal.p0.n(true, C.DEFAULT_BUFFER_SEGMENT_SIZE), 50000, 50000, 2500, 5000, -1, false, 0, false);
    }

    public int a(p0[] p0VarArr, io.odeeo.internal.n0.d[] dVarArr) {
        int iA = 0;
        for (int i10 = 0; i10 < p0VarArr.length; i10++) {
            if (dVarArr[i10] != null) {
                iA = a(p0VarArr[i10].getTrackType()) + iA;
            }
        }
        return Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, iA);
    }

    @Override // io.odeeo.internal.b.y
    public io.odeeo.internal.p0.b getAllocator() {
        return this.f62745a;
    }

    @Override // io.odeeo.internal.b.y
    public long getBackBufferDurationUs() {
        return this.f62752h;
    }

    @Override // io.odeeo.internal.b.y
    public void onPrepared() {
        a(false);
    }

    @Override // io.odeeo.internal.b.y
    public void onReleased() {
        a(true);
    }

    @Override // io.odeeo.internal.b.y
    public void onStopped() {
        a(true);
    }

    @Override // io.odeeo.internal.b.y
    public void onTracksSelected(p0[] p0VarArr, io.odeeo.internal.a0.l0 l0Var, io.odeeo.internal.n0.d[] dVarArr) {
        int iA = this.f62750f;
        if (iA == -1) {
            iA = a(p0VarArr, dVarArr);
        }
        this.f62754j = iA;
        this.f62745a.setTargetBufferSize(iA);
    }

    @Override // io.odeeo.internal.b.y
    public boolean retainBackBufferFromKeyframe() {
        return this.f62753i;
    }

    @Override // io.odeeo.internal.b.y
    public boolean shouldContinueLoading(long j10, long j11, float f10) {
        boolean z10 = true;
        boolean z11 = this.f62745a.getTotalBytesAllocated() >= this.f62754j;
        long jMin = this.f62746b;
        if (f10 > 1.0f) {
            jMin = Math.min(io.odeeo.internal.q0.g0.getMediaDurationForPlayoutDuration(jMin, f10), this.f62747c);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            if (!this.f62751g && z11) {
                z10 = false;
            }
            this.f62755k = z10;
            if (!z10 && j11 < 500000) {
                io.odeeo.internal.q0.p.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= this.f62747c || z11) {
            this.f62755k = false;
        }
        return this.f62755k;
    }

    @Override // io.odeeo.internal.b.y
    public boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        long playoutDurationForMediaDuration = io.odeeo.internal.q0.g0.getPlayoutDurationForMediaDuration(j10, f10);
        long jMin = z10 ? this.f62749e : this.f62748d;
        if (j11 != C.TIME_UNSET) {
            jMin = Math.min(j11 / 2, jMin);
        }
        if (jMin <= 0 || playoutDurationForMediaDuration >= jMin) {
            return true;
        }
        return !this.f62751g && this.f62745a.getTotalBytesAllocated() >= this.f62754j;
    }

    public j(io.odeeo.internal.p0.n nVar, int i10, int i11, int i12, int i13, int i14, boolean z10, int i15, boolean z11) {
        a(i12, 0, "bufferForPlaybackMs", "0");
        a(i13, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i10, i12, "minBufferMs", "bufferForPlaybackMs");
        a(i10, i13, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i11, i10, "maxBufferMs", "minBufferMs");
        a(i15, 0, "backBufferDurationMs", "0");
        this.f62745a = nVar;
        this.f62746b = io.odeeo.internal.q0.g0.msToUs(i10);
        this.f62747c = io.odeeo.internal.q0.g0.msToUs(i11);
        this.f62748d = io.odeeo.internal.q0.g0.msToUs(i12);
        this.f62749e = io.odeeo.internal.q0.g0.msToUs(i13);
        this.f62750f = i14;
        this.f62754j = i14 == -1 ? C.DEFAULT_VIDEO_BUFFER_SIZE : i14;
        this.f62751g = z10;
        this.f62752h = io.odeeo.internal.q0.g0.msToUs(i15);
        this.f62753i = z11;
    }

    public final void a(boolean z10) {
        int i10 = this.f62750f;
        if (i10 == -1) {
            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.f62754j = i10;
        this.f62755k = false;
        if (z10) {
            this.f62745a.reset();
        }
    }

    public static int a(int i10) {
        switch (i10) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return C.DEFAULT_VIDEO_BUFFER_SIZE;
            case 2:
                return 131072000;
            case 3:
            case 4:
            case 5:
            case 6:
                return 131072;
        }
    }

    public static void a(int i10, int i11, String str, String str2) {
        io.odeeo.internal.q0.a.checkArgument(i10 >= i11, str + " cannot be less than " + str2);
    }
}
