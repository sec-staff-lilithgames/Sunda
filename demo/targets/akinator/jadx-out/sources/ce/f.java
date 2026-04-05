package ce;

import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public int f12224a;

    /* renamed from: b, reason: collision with root package name */
    public int f12225b;

    /* renamed from: c, reason: collision with root package name */
    public int f12226c;

    /* renamed from: d, reason: collision with root package name */
    public int f12227d;

    /* renamed from: e, reason: collision with root package name */
    public int f12228e;

    /* renamed from: f, reason: collision with root package name */
    public int f12229f;

    /* renamed from: g, reason: collision with root package name */
    public int f12230g;

    /* renamed from: h, reason: collision with root package name */
    public int f12231h;

    /* renamed from: i, reason: collision with root package name */
    public int f12232i;

    /* renamed from: j, reason: collision with root package name */
    public int f12233j;

    /* renamed from: k, reason: collision with root package name */
    public long f12234k;

    /* renamed from: l, reason: collision with root package name */
    public int f12235l;

    public void addVideoFrameProcessingOffset(long j10) {
        this.f12234k += j10;
        this.f12235l++;
    }

    public synchronized void ensureUpdated() {
    }

    public void merge(f fVar) {
        this.f12224a += fVar.f12224a;
        this.f12225b += fVar.f12225b;
        this.f12226c += fVar.f12226c;
        this.f12227d += fVar.f12227d;
        this.f12228e += fVar.f12228e;
        this.f12229f += fVar.f12229f;
        this.f12230g += fVar.f12230g;
        this.f12231h += fVar.f12231h;
        this.f12232i = Math.max(this.f12232i, fVar.f12232i);
        this.f12233j += fVar.f12233j;
        long j10 = fVar.f12234k;
        int i10 = fVar.f12235l;
        this.f12234k += j10;
        this.f12235l += i10;
    }

    public String toString() {
        return n1.formatInvariant("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f12224a), Integer.valueOf(this.f12225b), Integer.valueOf(this.f12226c), Integer.valueOf(this.f12227d), Integer.valueOf(this.f12228e), Integer.valueOf(this.f12229f), Integer.valueOf(this.f12230g), Integer.valueOf(this.f12231h), Integer.valueOf(this.f12232i), Integer.valueOf(this.f12233j), Long.valueOf(this.f12234k), Integer.valueOf(this.f12235l));
    }
}
