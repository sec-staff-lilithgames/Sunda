package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import gh.a;
import java.util.List;
import og.b;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.a {

    /* renamed from: b, reason: collision with root package name */
    public int f29584b;

    public ExpandableBehavior() {
        this.f29584b = 0;
    }

    public static <T extends ExpandableBehavior> T from(View view, Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.b)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.a behavior = ((CoordinatorLayout.b) layoutParams).getBehavior();
        if (behavior instanceof ExpandableBehavior) {
            return cls.cast(behavior);
        }
        throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
    }

    public abstract void a(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        b bVar = (b) view2;
        if (bVar.isExpanded()) {
            int i10 = this.f29584b;
            if (i10 != 0 && i10 != 2) {
                return false;
            }
        } else if (this.f29584b != 1) {
            return false;
        }
        this.f29584b = bVar.isExpanded() ? 1 : 2;
        a((View) bVar, view, bVar.isExpanded(), true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        b bVar;
        int i11;
        if (!view.isLaidOut()) {
            List<View> dependencies = coordinatorLayout.getDependencies(view);
            int size = dependencies.size();
            int i12 = 0;
            while (true) {
                if (i12 >= size) {
                    bVar = null;
                    break;
                }
                View view2 = dependencies.get(i12);
                if (layoutDependsOn(coordinatorLayout, view, view2)) {
                    bVar = (b) view2;
                    break;
                }
                i12++;
            }
            if (bVar != null) {
                if (!bVar.isExpanded() ? this.f29584b == 1 : !((i11 = this.f29584b) != 0 && i11 != 2)) {
                    int i13 = bVar.isExpanded() ? 1 : 2;
                    this.f29584b = i13;
                    view.getViewTreeObserver().addOnPreDrawListener(new a(this, view, i13, bVar));
                }
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29584b = 0;
    }
}
