package ag;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f4395a;

    public b(BottomSheetBehavior bottomSheetBehavior) {
        this.f4395a = bottomSheetBehavior;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        BottomSheetBehavior bottomSheetBehavior = this.f4395a;
        bottomSheetBehavior.j(5);
        WeakReference weakReference = bottomSheetBehavior.f28980a0;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        ((View) bottomSheetBehavior.f28980a0.get()).requestLayout();
    }
}
