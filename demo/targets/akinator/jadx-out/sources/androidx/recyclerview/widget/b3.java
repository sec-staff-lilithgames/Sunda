package androidx.recyclerview.widget;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b3 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f7070b;

    public b3(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f7070b = staggeredGridLayoutManager;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f7070b.d();
    }
}
