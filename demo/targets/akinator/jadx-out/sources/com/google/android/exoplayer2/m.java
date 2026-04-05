package com.google.android.exoplayer2;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class m implements e1 {

    /* renamed from: b, reason: collision with root package name */
    public final qf.u f27664b;

    /* renamed from: c, reason: collision with root package name */
    public final long f27665c;

    /* renamed from: d, reason: collision with root package name */
    public final long f27666d;

    /* renamed from: e, reason: collision with root package name */
    public final long f27667e;

    /* renamed from: f, reason: collision with root package name */
    public final long f27668f;

    /* renamed from: g, reason: collision with root package name */
    public final int f27669g;

    /* renamed from: h, reason: collision with root package name */
    public final long f27670h;

    /* renamed from: i, reason: collision with root package name */
    public int f27671i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f27672j;

    public m() {
        qf.u uVar = new qf.u(true, C.DEFAULT_BUFFER_SEGMENT_SIZE);
        a(2500, 0, "bufferForPlaybackMs", "0");
        a(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        a(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(50000, 50000, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f27664b = uVar;
        long j10 = 50000;
        this.f27665c = com.google.android.exoplayer2.util.n1.msToUs(j10);
        this.f27666d = com.google.android.exoplayer2.util.n1.msToUs(j10);
        this.f27667e = com.google.android.exoplayer2.util.n1.msToUs(2500);
        this.f27668f = com.google.android.exoplayer2.util.n1.msToUs(5000);
        this.f27669g = -1;
        this.f27671i = C.DEFAULT_VIDEO_BUFFER_SIZE;
        this.f27670h = com.google.android.exoplayer2.util.n1.msToUs(0);
    }

    public static void a(int i10, int i11, String str, String str2) {
        com.google.android.exoplayer2.util.a.checkArgument(i10 >= i11, str + " cannot be less than " + str2);
    }

    public final void b(boolean z10) {
        int i10 = this.f27669g;
        if (i10 == -1) {
            i10 = C.DEFAULT_VIDEO_BUFFER_SIZE;
        }
        this.f27671i = i10;
        this.f27672j = false;
        if (z10) {
            this.f27664b.reset();
        }
    }

    @Override // com.google.android.exoplayer2.e1
    public qf.c getAllocator() {
        return this.f27664b;
    }

    @Override // com.google.android.exoplayer2.e1
    public long getBackBufferDurationUs() {
        return this.f27670h;
    }

    @Override // com.google.android.exoplayer2.e1
    public void onPrepared() {
        b(false);
    }

    @Override // com.google.android.exoplayer2.e1
    public void onReleased() {
        b(true);
    }

    @Override // com.google.android.exoplayer2.e1
    public void onStopped() {
        b(true);
    }

    @Override // com.google.android.exoplayer2.e1
    @Deprecated
    public /* bridge */ /* synthetic */ void onTracksSelected(z2[] z2VarArr, bf.n1 n1Var, pf.k[] kVarArr) {
        super.onTracksSelected(z2VarArr, n1Var, kVarArr);
    }

    @Override // com.google.android.exoplayer2.e1
    public boolean retainBackBufferFromKeyframe() {
        return false;
    }

    @Override // com.google.android.exoplayer2.e1
    public boolean shouldContinueLoading(long j10, long j11, float f10) {
        boolean z10 = this.f27664b.getTotalBytesAllocated() >= this.f27671i;
        long j12 = this.f27666d;
        long jMin = this.f27665c;
        if (f10 > 1.0f) {
            jMin = Math.min(com.google.android.exoplayer2.util.n1.getMediaDurationForPlayoutDuration(jMin, f10), j12);
        }
        if (j11 < Math.max(jMin, 500000L)) {
            this.f27672j = !z10;
            if (z10 && j11 < 500000) {
                com.google.android.exoplayer2.util.f0.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j11 >= j12 || z10) {
            this.f27672j = false;
        }
        return this.f27672j;
    }

    @Override // com.google.android.exoplayer2.e1
    @Deprecated
    public /* bridge */ /* synthetic */ boolean shouldStartPlayback(long j10, float f10, boolean z10, long j11) {
        return super.shouldStartPlayback(j10, f10, z10, j11);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.exoplayer2.e1
    public void onTracksSelected(m3 m3Var, bf.b0 b0Var, z2[] z2VarArr, bf.n1 n1Var, pf.k[] kVarArr) {
        int iMax = this.f27669g;
        if (iMax == -1) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int length = z2VarArr.length;
                int i12 = C.DEFAULT_VIDEO_BUFFER_SIZE;
                if (i10 < length) {
                    if (kVarArr[i10] != null) {
                        switch (z2VarArr[i10].getTrackType()) {
                            case -2:
                                i12 = 0;
                                i11 += i12;
                                break;
                            case -1:
                            default:
                                throw new IllegalArgumentException();
                            case 0:
                                i12 = 144310272;
                                i11 += i12;
                                break;
                            case 1:
                                i11 += i12;
                                break;
                            case 2:
                                i12 = 131072000;
                                i11 += i12;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                i12 = 131072;
                                i11 += i12;
                                break;
                        }
                    }
                    i10++;
                } else {
                    iMax = Math.max(C.DEFAULT_VIDEO_BUFFER_SIZE, i11);
                }
            }
        }
        this.f27671i = iMax;
        this.f27664b.setTargetBufferSize(iMax);
    }

    @Override // com.google.android.exoplayer2.e1
    public boolean shouldStartPlayback(m3 m3Var, bf.b0 b0Var, long j10, float f10, boolean z10, long j11) {
        long playoutDurationForMediaDuration = com.google.android.exoplayer2.util.n1.getPlayoutDurationForMediaDuration(j10, f10);
        long jMin = z10 ? this.f27668f : this.f27667e;
        if (j11 != C.TIME_UNSET) {
            jMin = Math.min(j11 / 2, jMin);
        }
        return jMin <= 0 || playoutDurationForMediaDuration >= jMin || this.f27664b.getTotalBytesAllocated() >= this.f27671i;
    }
}
