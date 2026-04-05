package io.odeeo.internal.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public int f63693a;

    /* renamed from: b, reason: collision with root package name */
    public int f63694b;

    /* renamed from: c, reason: collision with root package name */
    public int f63695c;

    /* renamed from: d, reason: collision with root package name */
    public int f63696d;

    /* renamed from: e, reason: collision with root package name */
    public int f63697e;

    /* renamed from: f, reason: collision with root package name */
    public int f63698f;

    /* renamed from: g, reason: collision with root package name */
    public int f63699g;

    /* renamed from: h, reason: collision with root package name */
    public int f63700h;

    /* renamed from: i, reason: collision with root package name */
    public int f63701i;

    /* renamed from: j, reason: collision with root package name */
    public long f63702j;

    /* renamed from: k, reason: collision with root package name */
    public int f63703k;

    public final void a(long j10, int i10) {
        this.f63702j += j10;
        this.f63703k += i10;
    }

    public void addVideoFrameProcessingOffset(long j10) {
        a(j10, 1);
    }

    public synchronized void ensureUpdated() {
    }

    public void merge(e eVar) {
        this.f63693a += eVar.f63693a;
        this.f63694b += eVar.f63694b;
        this.f63695c += eVar.f63695c;
        this.f63696d += eVar.f63696d;
        this.f63697e += eVar.f63697e;
        this.f63698f += eVar.f63698f;
        this.f63699g += eVar.f63699g;
        this.f63700h = Math.max(this.f63700h, eVar.f63700h);
        this.f63701i += eVar.f63701i;
        a(eVar.f63702j, eVar.f63703k);
    }
}
