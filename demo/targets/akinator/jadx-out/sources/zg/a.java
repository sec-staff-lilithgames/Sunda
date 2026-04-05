package zg;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import kc.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a extends p {

    /* renamed from: i, reason: collision with root package name */
    public final SideSheetBehavior f97957i;

    public a(SideSheetBehavior sideSheetBehavior) {
        this.f97957i = sideSheetBehavior;
    }

    @Override // kc.p
    public final boolean A(float f10) {
        return f10 > 0.0f;
    }

    @Override // kc.p
    public final boolean C(View view) {
        return view.getRight() < (q() - s()) / 2;
    }

    @Override // kc.p
    public final boolean D(float f10, float f11) {
        return Math.abs(f10) > Math.abs(f11) && Math.abs(f10) > ((float) 500);
    }

    @Override // kc.p
    public final boolean Q(View view, float f10) {
        float left = view.getLeft();
        SideSheetBehavior sideSheetBehavior = this.f97957i;
        float fAbs = Math.abs((sideSheetBehavior.getHideFriction() * f10) + left);
        sideSheetBehavior.getClass();
        return fAbs > 0.5f;
    }

    @Override // kc.p
    public final void V(ViewGroup.MarginLayoutParams marginLayoutParams, int i10) {
        marginLayoutParams.leftMargin = i10;
    }

    @Override // kc.p
    public final void W(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f97957i.f29377p) {
            marginLayoutParams.leftMargin = i11;
        }
    }

    @Override // kc.p
    public final int c(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // kc.p
    public final float d(int i10) {
        float fS = s();
        return (i10 - fS) / (q() - fS);
    }

    @Override // kc.p
    public int getParentInnerEdge(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // kc.p
    public final int p(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // kc.p
    public final int q() {
        SideSheetBehavior sideSheetBehavior = this.f97957i;
        return Math.max(0, sideSheetBehavior.f29378q + sideSheetBehavior.f29379r);
    }

    @Override // kc.p
    public final int s() {
        SideSheetBehavior sideSheetBehavior = this.f97957i;
        return (-sideSheetBehavior.f29376o) - sideSheetBehavior.f29379r;
    }

    @Override // kc.p
    public final int u() {
        return this.f97957i.f29379r;
    }

    @Override // kc.p
    public final int v() {
        return -this.f97957i.f29376o;
    }

    @Override // kc.p
    public final int w(View view) {
        return view.getRight() + this.f97957i.f29379r;
    }

    @Override // kc.p
    public final int y() {
        return 1;
    }
}
