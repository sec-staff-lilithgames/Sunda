package pg;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.view.View;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class c implements com.google.android.material.floatingactionbutton.d {

    /* renamed from: a, reason: collision with root package name */
    public final Context f81201a;

    /* renamed from: b, reason: collision with root package name */
    public final ExtendedFloatingActionButton f81202b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f81203c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final a f81204d;

    /* renamed from: e, reason: collision with root package name */
    public vf.h f81205e;

    /* renamed from: f, reason: collision with root package name */
    public vf.h f81206f;

    public c(ExtendedFloatingActionButton extendedFloatingActionButton, a aVar) {
        this.f81202b = extendedFloatingActionButton;
        this.f81201a = extendedFloatingActionButton.getContext();
        this.f81204d = aVar;
    }

    public final AnimatorSet a(vf.h hVar) {
        ArrayList arrayList = new ArrayList();
        boolean zHasPropertyValues = hVar.hasPropertyValues("opacity");
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f81202b;
        if (zHasPropertyValues) {
            arrayList.add(hVar.getAnimator("opacity", extendedFloatingActionButton, View.ALPHA));
        }
        if (hVar.hasPropertyValues("scale")) {
            arrayList.add(hVar.getAnimator("scale", extendedFloatingActionButton, View.SCALE_Y));
            arrayList.add(hVar.getAnimator("scale", extendedFloatingActionButton, View.SCALE_X));
        }
        if (hVar.hasPropertyValues("width")) {
            arrayList.add(hVar.getAnimator("width", extendedFloatingActionButton, ExtendedFloatingActionButton.f29243d0));
        }
        if (hVar.hasPropertyValues("height")) {
            arrayList.add(hVar.getAnimator("height", extendedFloatingActionButton, ExtendedFloatingActionButton.f29244e0));
        }
        if (hVar.hasPropertyValues("paddingStart")) {
            arrayList.add(hVar.getAnimator("paddingStart", extendedFloatingActionButton, ExtendedFloatingActionButton.f29245f0));
        }
        if (hVar.hasPropertyValues("paddingEnd")) {
            arrayList.add(hVar.getAnimator("paddingEnd", extendedFloatingActionButton, ExtendedFloatingActionButton.f29246g0));
        }
        if (hVar.hasPropertyValues("labelOpacity")) {
            arrayList.add(hVar.getAnimator("labelOpacity", extendedFloatingActionButton, new b(this)));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        vf.b.playTogether(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void addAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f81203c.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public AnimatorSet createAnimator() {
        return a(getCurrentMotionSpec());
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final vf.h getCurrentMotionSpec() {
        vf.h hVar = this.f81206f;
        if (hVar != null) {
            return hVar;
        }
        if (this.f81205e == null) {
            this.f81205e = vf.h.createFromResource(this.f81201a, getDefaultMotionSpecResource());
        }
        return (vf.h) w3.i.checkNotNull(this.f81205e);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public abstract /* synthetic */ int getDefaultMotionSpecResource();

    @Override // com.google.android.material.floatingactionbutton.d
    public final List<Animator.AnimatorListener> getListeners() {
        return this.f81203c;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public vf.h getMotionSpec() {
        return this.f81206f;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public void onAnimationCancel() {
        this.f81204d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public void onAnimationEnd() {
        this.f81204d.clear();
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public void onAnimationStart(Animator animator) {
        this.f81204d.onNextAnimationStart(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public abstract /* synthetic */ void onChange(ExtendedFloatingActionButton.b bVar);

    @Override // com.google.android.material.floatingactionbutton.d
    public abstract /* synthetic */ void performNow();

    @Override // com.google.android.material.floatingactionbutton.d
    public final void removeAnimationListener(Animator.AnimatorListener animatorListener) {
        this.f81203c.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public final void setMotionSpec(vf.h hVar) {
        this.f81206f = hVar;
    }

    @Override // com.google.android.material.floatingactionbutton.d
    public abstract /* synthetic */ boolean shouldCancel();
}
