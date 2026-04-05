package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.res.ColorStateList;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import pg.n;
import vf.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends pg.c {

    /* renamed from: g, reason: collision with root package name */
    public final n f29277g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f29278h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ExtendedFloatingActionButton f29279i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ExtendedFloatingActionButton extendedFloatingActionButton, pg.a aVar, n nVar, boolean z10) {
        super(extendedFloatingActionButton, aVar);
        this.f29279i = extendedFloatingActionButton;
        this.f29277g = nVar;
        this.f29278h = z10;
    }

    @Override // pg.c, com.google.android.material.floatingactionbutton.d
    public AnimatorSet createAnimator() {
        h currentMotionSpec = getCurrentMotionSpec();
        boolean zHasPropertyValues = currentMotionSpec.hasPropertyValues("width");
        n nVar = this.f29277g;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f29279i;
        if (zHasPropertyValues) {
            PropertyValuesHolder[] propertyValues = currentMotionSpec.getPropertyValues("width");
            propertyValues[0].setFloatValues(extendedFloatingActionButton.getWidth(), nVar.getWidth());
            currentMotionSpec.setPropertyValues("width", propertyValues);
        }
        if (currentMotionSpec.hasPropertyValues("height")) {
            PropertyValuesHolder[] propertyValues2 = currentMotionSpec.getPropertyValues("height");
            propertyValues2[0].setFloatValues(extendedFloatingActionButton.getHeight(), nVar.getHeight());
            currentMotionSpec.setPropertyValues("height", propertyValues2);
        }
        if (currentMotionSpec.hasPropertyValues("paddingStart")) {
            PropertyValuesHolder[] propertyValues3 = currentMotionSpec.getPropertyValues("paddingStart");
            propertyValues3[0].setFloatValues(extendedFloatingActionButton.getPaddingStart(), nVar.getPaddingStart());
            currentMotionSpec.setPropertyValues("paddingStart", propertyValues3);
        }
        if (currentMotionSpec.hasPropertyValues("paddingEnd")) {
            PropertyValuesHolder[] propertyValues4 = currentMotionSpec.getPropertyValues("paddingEnd");
            propertyValues4[0].setFloatValues(extendedFloatingActionButton.getPaddingEnd(), nVar.getPaddingEnd());
            currentMotionSpec.setPropertyValues("paddingEnd", propertyValues4);
        }
        if (currentMotionSpec.hasPropertyValues("labelOpacity")) {
            PropertyValuesHolder[] propertyValues5 = currentMotionSpec.getPropertyValues("labelOpacity");
            boolean z10 = this.f29278h;
            propertyValues5[0].setFloatValues(z10 ? 0.0f : 1.0f, z10 ? 1.0f : 0.0f);
            currentMotionSpec.setPropertyValues("labelOpacity", propertyValues5);
        }
        return a(currentMotionSpec);
    }

    @Override // pg.c, com.google.android.material.floatingactionbutton.d
    public int getDefaultMotionSpecResource() {
        return this.f29278h ? R.animator.mtrl_extended_fab_change_size_expand_motion_spec : R.animator.mtrl_extended_fab_change_size_collapse_motion_spec;
    }

    @Override // pg.c, com.google.android.material.floatingactionbutton.d
    public void onAnimationEnd() {
        super.onAnimationEnd();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f29279i;
        extendedFloatingActionButton.V = false;
        extendedFloatingActionButton.setHorizontallyScrolling(false);
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        n nVar = this.f29277g;
        layoutParams.width = nVar.getLayoutParams().width;
        layoutParams.height = nVar.getLayoutParams().height;
    }

    @Override // pg.c, com.google.android.material.floatingactionbutton.d
    public void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        boolean z10 = this.f29278h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f29279i;
        extendedFloatingActionButton.U = z10;
        extendedFloatingActionButton.V = true;
        extendedFloatingActionButton.setHorizontallyScrolling(true);
    }

    @Override // pg.c, com.google.android.material.floatingactionbutton.d
    public void onChange(ExtendedFloatingActionButton.b bVar) {
        if (bVar == null) {
            return;
        }
        boolean z10 = this.f29278h;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f29279i;
        if (z10) {
            bVar.onExtended(extendedFloatingActionButton);
        } else {
            bVar.onShrunken(extendedFloatingActionButton);
        }
    }

    @Override // pg.c, com.google.android.material.floatingactionbutton.d
    public void performNow() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f29279i;
        boolean z10 = this.f29278h;
        extendedFloatingActionButton.U = z10;
        ViewGroup.LayoutParams layoutParams = extendedFloatingActionButton.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        if (!z10) {
            extendedFloatingActionButton.f29248b0 = layoutParams.width;
            extendedFloatingActionButton.f29249c0 = layoutParams.height;
        }
        n nVar = this.f29277g;
        layoutParams.width = nVar.getLayoutParams().width;
        layoutParams.height = nVar.getLayoutParams().height;
        if (z10) {
            extendedFloatingActionButton.k(extendedFloatingActionButton.f29247a0);
        } else if (extendedFloatingActionButton.getText() != null && extendedFloatingActionButton.getText() != "") {
            extendedFloatingActionButton.k(ColorStateList.valueOf(0));
        }
        extendedFloatingActionButton.setPaddingRelative(nVar.getPaddingStart(), extendedFloatingActionButton.getPaddingTop(), nVar.getPaddingEnd(), extendedFloatingActionButton.getPaddingBottom());
        extendedFloatingActionButton.requestLayout();
    }

    @Override // pg.c, com.google.android.material.floatingactionbutton.d
    public boolean shouldCancel() {
        ExtendedFloatingActionButton extendedFloatingActionButton = this.f29279i;
        return this.f29278h == extendedFloatingActionButton.U || extendedFloatingActionButton.getIcon() == null || TextUtils.isEmpty(extendedFloatingActionButton.getText());
    }
}
