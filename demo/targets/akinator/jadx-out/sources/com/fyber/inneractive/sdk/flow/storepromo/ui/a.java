package com.fyber.inneractive.sdk.flow.storepromo.ui;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class a implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c f23880a;

    public a(c cVar) {
        this.f23880a = cVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        c cVar;
        View view;
        c cVar2 = this.f23880a;
        ViewGroup viewGroup = cVar2.f23883b;
        if (viewGroup != null) {
            viewGroup.removeView(cVar2.f23882a);
            this.f23880a.f23883b.setAnimation(null);
            this.f23880a.f23883b.setVisibility(8);
        }
        com.fyber.inneractive.sdk.flow.storepromo.b bVar = this.f23880a.f23887f;
        if (bVar != null) {
            com.fyber.inneractive.sdk.flow.storepromo.controller.b bVar2 = bVar.f23785d;
            com.fyber.inneractive.sdk.flow.storepromo.observer.b bVar3 = new com.fyber.inneractive.sdk.flow.storepromo.observer.b((bVar2 == null || (cVar = bVar2.f23795d) == null || cVar.f23883b == null || (view = cVar.f23882a) == null || view.getParent() == null || cVar.f23883b.getVisibility() != 0) ? false : true, bVar.f23790i);
            Iterator it = bVar.f23789h.iterator();
            while (it.hasNext()) {
                ((com.fyber.inneractive.sdk.flow.storepromo.observer.a) it.next()).a(bVar3);
            }
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
