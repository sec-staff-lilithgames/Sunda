package io.bidmachine.media3.exoplayer;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public int f61276a;

    /* renamed from: b, reason: collision with root package name */
    public int f61277b;

    /* renamed from: c, reason: collision with root package name */
    public int f61278c;

    /* renamed from: d, reason: collision with root package name */
    public int f61279d;

    /* renamed from: e, reason: collision with root package name */
    public int f61280e;

    /* renamed from: f, reason: collision with root package name */
    public int f61281f;

    /* renamed from: g, reason: collision with root package name */
    public int f61282g;

    /* renamed from: h, reason: collision with root package name */
    public int f61283h;

    /* renamed from: i, reason: collision with root package name */
    public int f61284i;

    /* renamed from: j, reason: collision with root package name */
    public int f61285j;

    /* renamed from: k, reason: collision with root package name */
    public long f61286k;

    /* renamed from: l, reason: collision with root package name */
    public int f61287l;

    public void addVideoFrameProcessingOffset(long j10) {
        this.f61286k += j10;
        this.f61287l++;
    }

    public synchronized void ensureUpdated() {
    }

    public void merge(j jVar) {
        this.f61276a += jVar.f61276a;
        this.f61277b += jVar.f61277b;
        this.f61278c += jVar.f61278c;
        this.f61279d += jVar.f61279d;
        this.f61280e += jVar.f61280e;
        this.f61281f += jVar.f61281f;
        this.f61282g += jVar.f61282g;
        this.f61283h += jVar.f61283h;
        this.f61284i = Math.max(this.f61284i, jVar.f61284i);
        this.f61285j += jVar.f61285j;
        long j10 = jVar.f61286k;
        int i10 = jVar.f61287l;
        this.f61286k += j10;
        this.f61287l += i10;
    }

    public String toString() {
        return io.bidmachine.media3.common.util.a1.formatInvariant("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", Integer.valueOf(this.f61276a), Integer.valueOf(this.f61277b), Integer.valueOf(this.f61278c), Integer.valueOf(this.f61279d), Integer.valueOf(this.f61280e), Integer.valueOf(this.f61281f), Integer.valueOf(this.f61282g), Integer.valueOf(this.f61283h), Integer.valueOf(this.f61284i), Integer.valueOf(this.f61285j), Long.valueOf(this.f61286k), Integer.valueOf(this.f61287l));
    }
}
