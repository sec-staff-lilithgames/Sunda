package androidx.recyclerview.widget;

import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public int f7083a;

    /* renamed from: b, reason: collision with root package name */
    public int f7084b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7085c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7086d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7087e;

    /* renamed from: f, reason: collision with root package name */
    public int[] f7088f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ StaggeredGridLayoutManager f7089g;

    public c3(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.f7089g = staggeredGridLayoutManager;
        a();
    }

    public final void a() {
        this.f7083a = -1;
        this.f7084b = Integer.MIN_VALUE;
        this.f7085c = false;
        this.f7086d = false;
        this.f7087e = false;
        int[] iArr = this.f7088f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
