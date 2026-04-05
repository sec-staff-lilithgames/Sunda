package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class b extends FragmentManager.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f7363a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f7364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f7365c;

    public b(m mVar, Fragment fragment, FrameLayout frameLayout) {
        this.f7365c = mVar;
        this.f7363a = fragment;
        this.f7364b = frameLayout;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (fragment == this.f7363a) {
            fragmentManager.unregisterFragmentLifecycleCallbacks(this);
            this.f7365c.addViewToContainer(view, this.f7364b);
        }
    }
}
