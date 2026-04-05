package zf;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import androidx.appcompat.widget.ActionMenuView;
import com.google.android.material.bottomappbar.BottomAppBar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class h extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f97941a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionMenuView f97942b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f97943c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f97944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar f97945e;

    public h(BottomAppBar bottomAppBar, ActionMenuView actionMenuView, int i10, boolean z10) {
        this.f97945e = bottomAppBar;
        this.f97942b = actionMenuView;
        this.f97943c = i10;
        this.f97944d = z10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f97941a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        if (this.f97941a) {
            return;
        }
        BottomAppBar bottomAppBar = this.f97945e;
        int i10 = bottomAppBar.f28964o0;
        boolean z10 = i10 != 0;
        bottomAppBar.replaceMenu(i10);
        bottomAppBar.G(this.f97942b, this.f97943c, this.f97944d, z10);
    }
}
