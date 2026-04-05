package com.google.android.material.transformation;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import gh.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: c, reason: collision with root package name */
    public AnimatorSet f29585c;

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    public void a(View view, View view2, boolean z10, boolean z11) {
        AnimatorSet animatorSet = this.f29585c;
        boolean z12 = animatorSet != null;
        if (z12) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetB = b(view, view2, z10, z12);
        this.f29585c = animatorSetB;
        animatorSetB.addListener(new b(this));
        this.f29585c.start();
        if (z11) {
            return;
        }
        this.f29585c.end();
    }

    public abstract AnimatorSet b(View view, View view2, boolean z10, boolean z11);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
