package wf;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar;
import java.util.List;
import x3.e3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class h extends i {

    /* renamed from: f, reason: collision with root package name */
    public final Rect f90561f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f90562g;

    /* renamed from: h, reason: collision with root package name */
    public int f90563h;

    /* renamed from: i, reason: collision with root package name */
    public int f90564i;

    public h() {
        this.f90561f = new Rect();
        this.f90562g = new Rect();
        this.f90563h = 0;
    }

    @Override // wf.i
    public final void b(CoordinatorLayout coordinatorLayout, View view, int i10) {
        AppBarLayout appBarLayoutC = c(coordinatorLayout.getDependencies(view));
        int iClamp = 0;
        if (appBarLayoutC == null) {
            coordinatorLayout.onLayoutChild(view, i10);
            this.f90563h = 0;
            return;
        }
        CoordinatorLayout.b bVar = (CoordinatorLayout.b) view.getLayoutParams();
        int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
        int bottom = appBarLayoutC.getBottom() + ((ViewGroup.MarginLayoutParams) bVar).topMargin;
        int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int bottom2 = ((appBarLayoutC.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        Rect rect = this.f90561f;
        rect.set(paddingLeft, bottom, width, bottom2);
        e3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left = lastWindowInsets.getSystemWindowInsetLeft() + rect.left;
            rect.right -= lastWindowInsets.getSystemWindowInsetRight();
        }
        int i11 = bVar.f5609c;
        if (i11 == 0) {
            i11 = 8388659;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Rect rect2 = this.f90562g;
        Gravity.apply(i11, measuredWidth, measuredHeight, rect, rect2, i10);
        if (this.f90564i != 0) {
            float fD = d(appBarLayoutC);
            int i12 = this.f90564i;
            iClamp = r3.a.clamp((int) (fD * i12), 0, i12);
        }
        view.layout(rect2.left, rect2.top - iClamp, rect2.right, rect2.bottom - iClamp);
        this.f90563h = rect2.top - appBarLayoutC.getBottom();
    }

    public abstract AppBarLayout c(List list);

    public float d(View view) {
        return 1.0f;
    }

    public int e(View view) {
        return view.getMeasuredHeight();
    }

    public final int getOverlayTop() {
        return this.f90564i;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.a
    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        AppBarLayout appBarLayoutC;
        e3 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (appBarLayoutC = c(coordinatorLayout.getDependencies(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (appBarLayoutC.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.getSystemWindowInsetBottom() + lastWindowInsets.getSystemWindowInsetTop();
        }
        int iE = e(appBarLayoutC) + size;
        int measuredHeight = appBarLayoutC.getMeasuredHeight();
        if (this instanceof SearchBar.ScrollingViewBehavior) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iE -= measuredHeight;
        }
        coordinatorLayout.onMeasureChild(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iE, i14 == -1 ? 1073741824 : Integer.MIN_VALUE), i13);
        return true;
    }

    public final void setOverlayTop(int i10) {
        this.f90564i = i10;
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90561f = new Rect();
        this.f90562g = new Rect();
        this.f90563h = 0;
    }
}
