package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.localbroadcastmanager.content.b;
import com.digidust.elokence.akinator.freemium.R;
import java.util.HashMap;
import vf.h;
import vf.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: k, reason: collision with root package name */
    public HashMap f29594k;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void a(View view, View view2, boolean z10, boolean z11) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                this.f29594k = new HashMap(childCount);
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                boolean z12 = (childAt.getLayoutParams() instanceof CoordinatorLayout.b) && (((CoordinatorLayout.b) childAt.getLayoutParams()).getBehavior() instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z12) {
                    if (z10) {
                        this.f29594k.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        childAt.setImportantForAccessibility(4);
                    } else {
                        HashMap map = this.f29594k;
                        if (map != null && map.containsKey(childAt)) {
                            childAt.setImportantForAccessibility(((Integer) this.f29594k.get(childAt)).intValue());
                        }
                    }
                }
            }
            if (!z10) {
                this.f29594k = null;
            }
        }
        super.a(view, view2, z10, z11);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final b h(Context context, boolean z10) {
        int i10 = z10 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        b bVar = new b();
        bVar.f6756a = h.createFromResource(context, i10);
        bVar.f6757b = new j(17, 0.0f, 0.0f);
        return bVar;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
