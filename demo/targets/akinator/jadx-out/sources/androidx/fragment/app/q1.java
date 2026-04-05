package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q1 implements p1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6438a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6439b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6440c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ FragmentManager f6441d;

    public q1(FragmentManager fragmentManager, String str, int i10, int i11) {
        this.f6441d = fragmentManager;
        this.f6438a = str;
        this.f6439b = i10;
        this.f6440c = i11;
    }

    @Override // androidx.fragment.app.p1
    public boolean generateOps(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        Fragment fragment = this.f6441d.f6244y;
        if (fragment != null && this.f6439b < 0 && this.f6438a == null && fragment.getChildFragmentManager().popBackStackImmediate()) {
            return false;
        }
        return this.f6441d.L(arrayList, arrayList2, this.f6438a, this.f6439b, this.f6440c);
    }
}
