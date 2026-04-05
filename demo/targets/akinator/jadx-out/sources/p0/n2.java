package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class n2 implements d {

    /* renamed from: a, reason: collision with root package name */
    public final d f80345a;

    /* renamed from: b, reason: collision with root package name */
    public final int f80346b;

    /* renamed from: c, reason: collision with root package name */
    public int f80347c;

    public n2(d dVar, int i10) {
        this.f80345a = dVar;
        this.f80346b = i10;
    }

    @Override // p0.d
    public void apply(kv.p pVar, Object obj) {
        this.f80345a.apply(pVar, obj);
    }

    @Override // p0.d
    public void clear() {
        d0.composeImmediateRuntimeError("Clear is not valid on OffsetApplier");
    }

    @Override // p0.d
    public void down(Object obj) {
        this.f80347c++;
        this.f80345a.down(obj);
    }

    @Override // p0.d
    public Object getCurrent() {
        return this.f80345a.getCurrent();
    }

    @Override // p0.d
    public void insertBottomUp(int i10, Object obj) {
        this.f80345a.insertBottomUp(i10 + (this.f80347c == 0 ? this.f80346b : 0), obj);
    }

    @Override // p0.d
    public void insertTopDown(int i10, Object obj) {
        this.f80345a.insertTopDown(i10 + (this.f80347c == 0 ? this.f80346b : 0), obj);
    }

    @Override // p0.d
    public void move(int i10, int i11, int i12) {
        int i13 = this.f80347c == 0 ? this.f80346b : 0;
        this.f80345a.move(i10 + i13, i11 + i13, i12);
    }

    @Override // p0.d
    public /* bridge */ /* synthetic */ void onBeginChanges() {
        super.onBeginChanges();
    }

    @Override // p0.d
    public /* bridge */ /* synthetic */ void onEndChanges() {
        super.onEndChanges();
    }

    @Override // p0.d
    public void remove(int i10, int i11) {
        this.f80345a.remove(i10 + (this.f80347c == 0 ? this.f80346b : 0), i11);
    }

    @Override // p0.d
    public void reuse() {
        this.f80345a.reuse();
    }

    @Override // p0.d
    public void up() {
        if (!(this.f80347c > 0)) {
            d0.composeImmediateRuntimeError("OffsetApplier up called with no corresponding down");
        }
        this.f80347c--;
        this.f80345a.up();
    }
}
