package wf;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final CoordinatorLayout f90551b;

    /* renamed from: c, reason: collision with root package name */
    public final View f90552c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g f90553e;

    public f(g gVar, CoordinatorLayout coordinatorLayout, View view) {
        this.f90553e = gVar;
        this.f90551b = coordinatorLayout;
        this.f90552c = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        g gVar;
        OverScroller overScroller;
        View view = this.f90552c;
        if (view == null || (overScroller = (gVar = this.f90553e).f90555g) == null) {
            return;
        }
        boolean zComputeScrollOffset = overScroller.computeScrollOffset();
        CoordinatorLayout coordinatorLayout = this.f90551b;
        if (!zComputeScrollOffset) {
            gVar.f(coordinatorLayout, view);
        } else {
            gVar.h(coordinatorLayout, view, gVar.f90555g.getCurrY());
            view.postOnAnimation(this);
        }
    }
}
