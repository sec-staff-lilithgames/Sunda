package p8;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class o0 implements v0 {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f80832b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f80833c;

    /* renamed from: e, reason: collision with root package name */
    public final v0 f80834e;

    /* renamed from: f, reason: collision with root package name */
    public final n0 f80835f;

    /* renamed from: g, reason: collision with root package name */
    public final n8.q f80836g;

    /* renamed from: h, reason: collision with root package name */
    public int f80837h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f80838i;

    public o0(v0 v0Var, boolean z10, boolean z11, n8.q qVar, n0 n0Var) {
        this.f80834e = (v0) j9.q.checkNotNull(v0Var);
        this.f80832b = z10;
        this.f80833c = z11;
        this.f80836g = qVar;
        this.f80835f = (n0) j9.q.checkNotNull(n0Var);
    }

    public final synchronized void a() {
        if (this.f80838i) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f80837h++;
    }

    public final void b() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f80837h;
            if (i10 <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z10 = true;
            int i11 = i10 - 1;
            this.f80837h = i11;
            if (i11 != 0) {
                z10 = false;
            }
        }
        if (z10) {
            this.f80835f.onResourceReleased(this.f80836g, this);
        }
    }

    @Override // p8.v0
    public Object get() {
        return this.f80834e.get();
    }

    @Override // p8.v0
    public Class<Object> getResourceClass() {
        return this.f80834e.getResourceClass();
    }

    @Override // p8.v0
    public int getSize() {
        return this.f80834e.getSize();
    }

    @Override // p8.v0
    public synchronized void recycle() {
        if (this.f80837h > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f80838i) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f80838i = true;
        if (this.f80833c) {
            this.f80834e.recycle();
        }
    }

    public synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f80832b + ", listener=" + this.f80835f + ", key=" + this.f80836g + ", acquired=" + this.f80837h + ", isRecycled=" + this.f80838i + ", resource=" + this.f80834e + AbstractJsonLexerKt.END_OBJ;
    }
}
