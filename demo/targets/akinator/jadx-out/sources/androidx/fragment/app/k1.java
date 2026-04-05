package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6395a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6396b;

    public k1(FragmentManager fragmentManager, String str) {
        this.f6396b = fragmentManager;
        this.f6395a = str;
    }

    @Override // androidx.fragment.app.p1
    public boolean generateOps(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        FragmentManager fragmentManager = this.f6396b;
        String str = this.f6395a;
        if (fragmentManager.O(arrayList, arrayList2, str)) {
            return fragmentManager.L(arrayList, arrayList2, str, -1, 1);
        }
        return false;
    }
}
