package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f6432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6433c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ArrayList f6436g;

    public p2(int i10, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f6432b = i10;
        this.f6433c = arrayList;
        this.f6434e = arrayList2;
        this.f6435f = arrayList3;
        this.f6436g = arrayList4;
    }

    @Override // java.lang.Runnable
    public void run() {
        for (int i10 = 0; i10 < this.f6432b; i10++) {
            x3.z1.setTransitionName((View) this.f6433c.get(i10), (String) this.f6434e.get(i10));
            x3.z1.setTransitionName((View) this.f6435f.get(i10), (String) this.f6436g.get(i10));
        }
    }
}
