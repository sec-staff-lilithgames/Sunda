package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.digidust.elokence.akinator.freemium.R;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import qg.t0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BottomAppBar.Behavior f28979b;

    public a(BottomAppBar.Behavior behavior) {
        this.f28979b = behavior;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        BottomAppBar.Behavior behavior = this.f28979b;
        Rect rect = behavior.f28973o;
        BottomAppBar bottomAppBar = (BottomAppBar) behavior.f28974p.get();
        if (bottomAppBar != null) {
            int i18 = bottomAppBar.f28956g0;
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                int height = view.getHeight();
                if (view instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                    floatingActionButton.getMeasuredContentRect(rect);
                    int iHeight = rect.height();
                    bottomAppBar.F(iHeight);
                    bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().getTopLeftCornerSize().getCornerSize(new RectF(rect)));
                    height = iHeight;
                }
                CoordinatorLayout.b bVar = (CoordinatorLayout.b) view.getLayoutParams();
                if (behavior.f28975q == 0) {
                    if (bottomAppBar.f28955f0 == 1) {
                        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(R.dimen.mtrl_bottomappbar_fab_bottom_margin) - ((view.getMeasuredHeight() - height) / 2));
                    }
                    ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bottomAppBar.getRightInset();
                    if (t0.isLayoutRtl(view)) {
                        ((ViewGroup.MarginLayoutParams) bVar).leftMargin += i18;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).rightMargin += i18;
                    }
                }
                int i19 = BottomAppBar.f28949x0;
                bottomAppBar.E();
                return;
            }
        }
        view.removeOnLayoutChangeListener(this);
    }
}
