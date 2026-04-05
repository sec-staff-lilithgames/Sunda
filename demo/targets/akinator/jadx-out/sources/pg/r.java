package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class r extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public boolean f81243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f81244b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f81245c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y f81246d;

    public r(y yVar, boolean z10, com.google.android.material.floatingactionbutton.c cVar) {
        this.f81246d = yVar;
        this.f81244b = z10;
        this.f81245c = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        this.f81243a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        y yVar = this.f81246d;
        yVar.f81269r = 0;
        yVar.f81264m = null;
        if (this.f81243a) {
            return;
        }
        FloatingActionButton floatingActionButton = yVar.f81273v;
        boolean z10 = this.f81244b;
        floatingActionButton.internalSetVisibility(z10 ? 8 : 4, z10);
        x xVar = this.f81245c;
        if (xVar != null) {
            ((com.google.android.material.floatingactionbutton.c) xVar).onHidden();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        y yVar = this.f81246d;
        yVar.f81273v.internalSetVisibility(0, this.f81244b);
        yVar.f81269r = 1;
        yVar.f81264m = animator;
        this.f81243a = false;
    }
}
