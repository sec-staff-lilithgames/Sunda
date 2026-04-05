package f6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f55373a;

    public f(i iVar) {
        this.f55373a = iVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        i iVar = this.f55373a;
        ArrayList arrayList = new ArrayList(iVar.f55382g);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).onAnimationEnd(iVar);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        i iVar = this.f55373a;
        ArrayList arrayList = new ArrayList(iVar.f55382g);
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((c) arrayList.get(i10)).onAnimationStart(iVar);
        }
    }
}
