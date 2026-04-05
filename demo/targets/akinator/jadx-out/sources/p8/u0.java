package p8;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class u0 implements v0, k9.f {

    /* renamed from: g, reason: collision with root package name */
    public static final w3.f f80888g = k9.h.threadSafe(20, new t0());

    /* renamed from: b, reason: collision with root package name */
    public final k9.k f80889b = k9.k.newInstance();

    /* renamed from: c, reason: collision with root package name */
    public v0 f80890c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f80891e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f80892f;

    public final synchronized void a() {
        this.f80889b.throwIfRecycled();
        if (!this.f80891e) {
            throw new IllegalStateException("Already unlocked");
        }
        this.f80891e = false;
        if (this.f80892f) {
            recycle();
        }
    }

    @Override // p8.v0
    public Object get() {
        return this.f80890c.get();
    }

    @Override // p8.v0
    public Class<Object> getResourceClass() {
        return this.f80890c.getResourceClass();
    }

    @Override // p8.v0
    public int getSize() {
        return this.f80890c.getSize();
    }

    @Override // k9.f
    public k9.k getVerifier() {
        return this.f80889b;
    }

    @Override // p8.v0
    public synchronized void recycle() {
        this.f80889b.throwIfRecycled();
        this.f80892f = true;
        if (!this.f80891e) {
            this.f80890c.recycle();
            this.f80890c = null;
            f80888g.release(this);
        }
    }
}
