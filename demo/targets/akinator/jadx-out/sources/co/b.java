package co;

import java.util.NoSuchElementException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class b implements r {

    /* renamed from: b, reason: collision with root package name */
    public final long f12392b;

    /* renamed from: c, reason: collision with root package name */
    public final long f12393c;

    /* renamed from: d, reason: collision with root package name */
    public long f12394d;

    public b(long j10, long j11) {
        this.f12392b = j10;
        this.f12393c = j11;
        reset();
    }

    public final void a() {
        long j10 = this.f12394d;
        if (j10 < this.f12392b || j10 > this.f12393c) {
            throw new NoSuchElementException();
        }
    }

    @Override // co.r
    public abstract /* synthetic */ long getChunkEndTimeUs();

    @Override // co.r
    public abstract /* synthetic */ long getChunkStartTimeUs();

    @Override // co.r
    public abstract /* synthetic */ ln.m getDataSpec();

    @Override // co.r
    public boolean isEnded() {
        return this.f12394d > this.f12393c;
    }

    @Override // co.r
    public boolean next() {
        this.f12394d++;
        return !isEnded();
    }

    @Override // co.r
    public void reset() {
        this.f12394d = this.f12392b - 1;
    }
}
