package pg;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class s extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f81247a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f81248b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ y f81249c;

    public s(y yVar, boolean z10, com.google.android.material.floatingactionbutton.c cVar) {
        this.f81249c = yVar;
        this.f81247a = z10;
        this.f81248b = cVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        y yVar = this.f81249c;
        yVar.f81269r = 0;
        yVar.f81264m = null;
        x xVar = this.f81248b;
        if (xVar != null) {
            ((com.google.android.material.floatingactionbutton.c) xVar).onShown();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        y yVar = this.f81249c;
        yVar.f81273v.internalSetVisibility(0, this.f81247a);
        yVar.f81269r = 2;
        yVar.f81264m = animator;
    }
}
