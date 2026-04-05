package ub;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public long f88209a;

    /* renamed from: b, reason: collision with root package name */
    public long f88210b;

    /* renamed from: c, reason: collision with root package name */
    public int f88211c;

    /* renamed from: d, reason: collision with root package name */
    public int f88212d;

    /* renamed from: e, reason: collision with root package name */
    public int f88213e;

    /* renamed from: f, reason: collision with root package name */
    public int f88214f;

    public f0 build() {
        return new f0(this.f88211c, this.f88209a, this.f88212d, this.f88213e, this.f88214f, this.f88210b);
    }

    public e0 maxDocumentLength(long j10) {
        if (j10 <= 0) {
            j10 = -1;
        }
        this.f88209a = j10;
        return this;
    }

    public e0 maxNameLength(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set maxNameLen to a negative value");
        }
        this.f88214f = i10;
        return this;
    }

    public e0 maxNestingDepth(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set maxNestingDepth to a negative value");
        }
        this.f88211c = i10;
        return this;
    }

    public e0 maxNumberLength(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set maxNumberLength to a negative value");
        }
        this.f88212d = i10;
        return this;
    }

    public e0 maxStringLength(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Cannot set maxStringLen to a negative value");
        }
        this.f88213e = i10;
        return this;
    }

    public e0 maxTokenCount(long j10) {
        if (j10 <= 0) {
            j10 = -1;
        }
        this.f88210b = j10;
        return this;
    }
}
