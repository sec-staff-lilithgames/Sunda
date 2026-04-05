package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6445b;

    public r1(FragmentManager fragmentManager, String str) {
        this.f6445b = fragmentManager;
        this.f6444a = str;
    }

    @Override // androidx.fragment.app.p1
    public boolean generateOps(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        return this.f6445b.O(arrayList, arrayList2, this.f6444a);
    }
}
