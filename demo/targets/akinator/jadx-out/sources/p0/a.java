package p0;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    public final Object f80136a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f80137b = u5.m5841constructorimpl$default(null, 1, null);

    /* renamed from: c, reason: collision with root package name */
    public Object f80138c;

    public a(Object obj) {
        this.f80136a = obj;
        this.f80138c = obj;
    }

    public abstract void a();

    @Override // p0.d
    public /* bridge */ /* synthetic */ void apply(kv.p pVar, Object obj) {
        super.apply(pVar, obj);
    }

    @Override // p0.d
    public final void clear() {
        u5.m5839clearimpl(this.f80137b);
        this.f80138c = this.f80136a;
        a();
    }

    @Override // p0.d
    public void down(Object obj) {
        u5.m5851pushimpl(this.f80137b, getCurrent());
        this.f80138c = obj;
    }

    @Override // p0.d
    public Object getCurrent() {
        return this.f80138c;
    }

    public final Object getRoot() {
        return this.f80136a;
    }

    @Override // p0.d
    public abstract /* synthetic */ void insertBottomUp(int i10, Object obj);

    @Override // p0.d
    public abstract /* synthetic */ void insertTopDown(int i10, Object obj);

    @Override // p0.d
    public abstract /* synthetic */ void move(int i10, int i11, int i12);

    @Override // p0.d
    public /* bridge */ /* synthetic */ void onBeginChanges() {
        super.onBeginChanges();
    }

    @Override // p0.d
    public /* bridge */ /* synthetic */ void onEndChanges() {
        super.onEndChanges();
    }

    @Override // p0.d
    public abstract /* synthetic */ void remove(int i10, int i11);

    @Override // p0.d
    public /* bridge */ /* synthetic */ void reuse() {
        super.reuse();
    }

    @Override // p0.d
    public void up() {
        this.f80138c = u5.m5850popimpl(this.f80137b);
    }
}
