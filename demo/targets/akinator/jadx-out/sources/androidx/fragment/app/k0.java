package androidx.fragment.app;

import android.os.Bundle;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 implements v5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6393a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6394b;

    public /* synthetic */ k0(Object obj, int i10) {
        this.f6393a = i10;
        this.f6394b = obj;
    }

    @Override // v5.g
    public final Bundle saveState() {
        int i10 = this.f6393a;
        Object obj = this.f6394b;
        switch (i10) {
            case 0:
                FragmentActivity fragmentActivity = (FragmentActivity) obj;
                String str = FragmentActivity.LIFECYCLE_TAG;
                fragmentActivity.markFragmentsCreated();
                fragmentActivity.mFragmentLifecycleRegistry.handleLifecycleEvent(androidx.lifecycle.i0.ON_STOP);
                return new Bundle();
            default:
                return ((FragmentManager) obj).Q();
        }
    }
}
