package wf;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class i extends CoordinatorLayout.a {

    /* renamed from: b, reason: collision with root package name */
    public j f90565b;

    /* renamed from: c, reason: collision with root package name */
    public int f90566c;

    /* renamed from: e, reason: collision with root package name */
    public int f90567e;

    public i() {
        this.f90566c = 0;
        this.f90567e = 0;
    }

    public int a() {
        return getTopAndBottomOffset();
    }

    public void b(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.onLayoutChild(view, i10);
    }

    public int getLeftAndRightOffset() {
        j jVar = this.f90565b;
        if (jVar != null) {
            return jVar.getLeftAndRightOffset();
        }
        return 0;
    }

    public int getTopAndBottomOffset() {
        j jVar = this.f90565b;
        if (jVar != null) {
            return jVar.getTopAndBottomOffset();
        }
        return 0;
    }

    public boolean isHorizontalOffsetEnabled() {
        j jVar = this.f90565b;
        return jVar != null && jVar.isHorizontalOffsetEnabled();
    }

    public boolean isVerticalOffsetEnabled() {
        j jVar = this.f90565b;
        return jVar != null && jVar.isVerticalOffsetEnabled();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onLayoutChild(CoordinatorLayout coordinatorLayout, View view, int i10) {
        b(coordinatorLayout, view, i10);
        if (this.f90565b == null) {
            this.f90565b = new j(view);
        }
        j jVar = this.f90565b;
        View view2 = jVar.f90568a;
        jVar.f90569b = view2.getTop();
        jVar.f90570c = view2.getLeft();
        this.f90565b.a();
        int i11 = this.f90566c;
        if (i11 != 0) {
            this.f90565b.setTopAndBottomOffset(i11);
            this.f90566c = 0;
        }
        int i12 = this.f90567e;
        if (i12 == 0) {
            return true;
        }
        this.f90565b.setLeftAndRightOffset(i12);
        this.f90567e = 0;
        return true;
    }

    public void setHorizontalOffsetEnabled(boolean z10) {
        j jVar = this.f90565b;
        if (jVar != null) {
            jVar.setHorizontalOffsetEnabled(z10);
        }
    }

    public boolean setLeftAndRightOffset(int i10) {
        j jVar = this.f90565b;
        if (jVar != null) {
            return jVar.setLeftAndRightOffset(i10);
        }
        this.f90567e = i10;
        return false;
    }

    public boolean setTopAndBottomOffset(int i10) {
        j jVar = this.f90565b;
        if (jVar != null) {
            return jVar.setTopAndBottomOffset(i10);
        }
        this.f90566c = i10;
        return false;
    }

    public void setVerticalOffsetEnabled(boolean z10) {
        j jVar = this.f90565b;
        if (jVar != null) {
            jVar.setVerticalOffsetEnabled(z10);
        }
    }

    public i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90566c = 0;
        this.f90567e = 0;
    }
}
