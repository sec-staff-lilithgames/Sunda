package com.google.android.material.appbar;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import y3.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends x3.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout f28886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ CoordinatorLayout f28887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AppBarLayout.BaseBehavior f28888f;

    public b(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.f28888f = baseBehavior;
        this.f28886d = appBarLayout;
        this.f28887e = coordinatorLayout;
    }

    @Override // x3.b
    public void onInitializeAccessibilityNodeInfo(View view, y3.c cVar) {
        super.onInitializeAccessibilityNodeInfo(view, cVar);
        cVar.setClassName(ScrollView.class.getName());
        AppBarLayout appBarLayout = this.f28886d;
        if (appBarLayout.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.f28887e;
        AppBarLayout.BaseBehavior baseBehavior = this.f28888f;
        View viewI = AppBarLayout.BaseBehavior.i(baseBehavior, coordinatorLayout);
        if (viewI == null) {
            return;
        }
        baseBehavior.getClass();
        int childCount = appBarLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (((AppBarLayout.c) appBarLayout.getChildAt(i10).getLayoutParams()).f28875a != 0) {
                if (baseBehavior.a() != (-appBarLayout.getTotalScrollRange())) {
                    cVar.addAction(c.a.f94042j);
                    cVar.setScrollable(true);
                }
                if (baseBehavior.a() != 0) {
                    if (!viewI.canScrollVertically(-1)) {
                        cVar.addAction(c.a.f94043k);
                        cVar.setScrollable(true);
                        return;
                    } else {
                        if ((-appBarLayout.getDownNestedPreScrollRange()) != 0) {
                            cVar.addAction(c.a.f94043k);
                            cVar.setScrollable(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // x3.b
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        AppBarLayout appBarLayout = this.f28886d;
        if (i10 == 4096) {
            appBarLayout.setExpanded(false);
            return true;
        }
        if (i10 != 8192) {
            return super.performAccessibilityAction(view, i10, bundle);
        }
        AppBarLayout.BaseBehavior baseBehavior = this.f28888f;
        if (baseBehavior.a() != 0) {
            View viewI = AppBarLayout.BaseBehavior.i(baseBehavior, this.f28887e);
            if (!viewI.canScrollVertically(-1)) {
                appBarLayout.setExpanded(true);
                return true;
            }
            int i11 = -appBarLayout.getDownNestedPreScrollRange();
            if (i11 != 0) {
                this.f28888f.onNestedPreScroll(this.f28887e, (CoordinatorLayout) this.f28886d, viewI, 0, i11, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
