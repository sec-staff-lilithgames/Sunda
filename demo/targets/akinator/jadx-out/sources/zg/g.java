package zg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SideSheetBehavior f97964a;

    public g(SideSheetBehavior sideSheetBehavior) {
        this.f97964a = sideSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        SideSheetBehavior sideSheetBehavior = this.f97964a;
        sideSheetBehavior.a(5);
        WeakReference weakReference = sideSheetBehavior.f29380s;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) sideSheetBehavior.f29380s.get()).requestLayout();
    }
}
