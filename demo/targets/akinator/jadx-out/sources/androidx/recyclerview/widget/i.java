package androidx.recyclerview.widget;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f7140b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f7141c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f7142e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Runnable f7143f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l f7144g;

    public i(l lVar, List list, List list2, int i10, Runnable runnable) {
        this.f7144g = lVar;
        this.f7140b = list;
        this.f7141c = list2;
        this.f7142e = i10;
        this.f7143f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7144g.f7175c.execute(new h(this, n0.calculateDiff(new g(this))));
    }
}
