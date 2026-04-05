package zg;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class b extends p {

    /* renamed from: i, reason: collision with root package name */
    public final SideSheetBehavior f97958i;

    public b(SideSheetBehavior sideSheetBehavior) {
        this.f97958i = sideSheetBehavior;
    }

    @Override // kc.p
    public final boolean A(float f10) {
        return f10 < 0.0f;
    }

    @Override // kc.p
    public final boolean C(View view) {
        return view.getLeft() > (q() + this.f97958i.f29377p) / 2;
    }

    @Override // kc.p
    public final boolean D(float f10, float f11) {
        return Math.abs(f10) > Math.abs(f11) && Math.abs(f10) > ((float) 500);
    }

    @Override // kc.p
    public final boolean Q(View view, float f10) {
        float right = view.getRight();
        SideSheetBehavior sideSheetBehavior = this.f97958i;
        float fAbs = Math.abs((sideSheetBehavior.getHideFriction() * f10) + right);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // kc.p
    public final void V(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.rightMargin = i10;
    }

    @Override // kc.p
    public final void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        int i12 = this.f97958i.f29377p;
        if (i10 <= i12) {
            marginLayoutParams.rightMargin = i12 - i10;
        }
    }

    @Override // kc.p
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // kc.p
    public final float d(int i10) {
        float f10 = this.f97958i.f29377p;
        return (f10 - i10) / (f10 - q());
    }

    @Override // kc.p
    public int getParentInnerEdge(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getRight();
    }

    @Override // kc.p
    public final int p(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.rightMargin;
    }

    @Override // kc.p
    public final int q() {
        SideSheetBehavior sideSheetBehavior = this.f97958i;
        return Math.max(0, (sideSheetBehavior.f29377p - sideSheetBehavior.f29376o) - sideSheetBehavior.f29379r);
    }

    @Override // kc.p
    public final int s() {
        return this.f97958i.f29377p;
    }

    @Override // kc.p
    public final int u() {
        return this.f97958i.f29377p;
    }

    @Override // kc.p
    public final int v() {
        return q();
    }

    @Override // kc.p
    public final int w(View view) {
        return view.getLeft() - this.f97958i.f29379r;
    }

    @Override // kc.p
    public final int y() {
        return 0;
    }
}
