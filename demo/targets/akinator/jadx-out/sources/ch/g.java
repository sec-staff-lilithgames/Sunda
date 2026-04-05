package ch;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class g extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f12312e = 0;

    /* renamed from: b, reason: collision with root package name */
    public ValueAnimator f12313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TabLayout f12314c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(TabLayout tabLayout, Context context) {
        super(context);
        this.f12314c = tabLayout;
        setWillNotDraw(false);
    }

    public final void a(int i10) {
        TabLayout tabLayout = this.f12314c;
        if (tabLayout.f29396a0 == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i10);
            com.google.android.material.tabs.a aVar = tabLayout.L;
            Drawable drawable = tabLayout.f29412q;
            aVar.getClass();
            RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, childAt);
            drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
            tabLayout.f29397b = i10;
        }
    }

    public final void b(int i10) {
        TabLayout tabLayout = this.f12314c;
        Rect bounds = tabLayout.f29412q.getBounds();
        tabLayout.f29412q.setBounds(bounds.left, 0, bounds.right, i10);
        requestLayout();
    }

    public final void c(View view, View view2, float f10) {
        TabLayout tabLayout = this.f12314c;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f29412q;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f29412q.getBounds().bottom);
        } else {
            tabLayout.L.b(tabLayout, view, view2, f10, tabLayout.f29412q);
        }
        postInvalidateOnAnimation();
    }

    public final void d(int i10, int i11, boolean z10) {
        TabLayout tabLayout = this.f12314c;
        if (tabLayout.f29397b == i10) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i10);
        if (childAt2 == null) {
            a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f29397b = i10;
        f fVar = new f(this, childAt, childAt2);
        if (!z10) {
            this.f12313b.removeAllUpdateListeners();
            this.f12313b.addUpdateListener(fVar);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f12313b = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.M);
        valueAnimator.setDuration(i11);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(fVar);
        valueAnimator.start();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f12314c;
        int iHeight = tabLayout.f29412q.getBounds().height();
        if (iHeight < 0) {
            iHeight = tabLayout.f29412q.getIntrinsicHeight();
        }
        int i10 = tabLayout.E;
        if (i10 == 0) {
            height = getHeight() - iHeight;
            iHeight = getHeight();
        } else if (i10 != 1) {
            height = 0;
            if (i10 != 2) {
                iHeight = i10 != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - iHeight) / 2;
            iHeight = (getHeight() + iHeight) / 2;
        }
        if (tabLayout.f29412q.getBounds().width() > 0) {
            Rect bounds = tabLayout.f29412q.getBounds();
            tabLayout.f29412q.setBounds(bounds.left, height, bounds.right, iHeight);
            tabLayout.f29412q.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        ValueAnimator valueAnimator = this.f12313b;
        TabLayout tabLayout = this.f12314c;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            d(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.f29397b == -1) {
            tabLayout.f29397b = tabLayout.getSelectedTabPosition();
        }
        a(tabLayout.f29397b);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f12314c;
        boolean z10 = true;
        if (tabLayout.C == 1 || tabLayout.F == 2) {
            int childCount = getChildCount();
            int iMax = 0;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0) {
                    iMax = Math.max(iMax, childAt.getMeasuredWidth());
                }
            }
            if (iMax <= 0) {
                return;
            }
            if (iMax * childCount <= getMeasuredWidth() - (((int) t0.dpToPx(getContext(), 16)) * 2)) {
                boolean z11 = false;
                for (int i13 = 0; i13 < childCount; i13++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i13).getLayoutParams();
                    if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                        layoutParams.width = iMax;
                        layoutParams.weight = 0.0f;
                        z11 = true;
                    }
                }
                z10 = z11;
            } else {
                tabLayout.C = 0;
                tabLayout.l(false);
            }
            if (z10) {
                super.onMeasure(i10, i11);
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
    }
}
