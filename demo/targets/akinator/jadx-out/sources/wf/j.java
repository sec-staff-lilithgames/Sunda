package wf;

import android.view.View;
import x3.z1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public final View f90568a;

    /* renamed from: b, reason: collision with root package name */
    public int f90569b;

    /* renamed from: c, reason: collision with root package name */
    public int f90570c;

    /* renamed from: d, reason: collision with root package name */
    public int f90571d;

    /* renamed from: e, reason: collision with root package name */
    public int f90572e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90573f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f90574g = true;

    public j(View view) {
        this.f90568a = view;
    }

    public final void a() {
        int i10 = this.f90571d;
        View view = this.f90568a;
        z1.offsetTopAndBottom(view, i10 - (view.getTop() - this.f90569b));
        z1.offsetLeftAndRight(view, this.f90572e - (view.getLeft() - this.f90570c));
    }

    public int getLayoutLeft() {
        return this.f90570c;
    }

    public int getLayoutTop() {
        return this.f90569b;
    }

    public int getLeftAndRightOffset() {
        return this.f90572e;
    }

    public int getTopAndBottomOffset() {
        return this.f90571d;
    }

    public boolean isHorizontalOffsetEnabled() {
        return this.f90574g;
    }

    public boolean isVerticalOffsetEnabled() {
        return this.f90573f;
    }

    public void setHorizontalOffsetEnabled(boolean z10) {
        this.f90574g = z10;
    }

    public boolean setLeftAndRightOffset(int i10) {
        if (!this.f90574g || this.f90572e == i10) {
            return false;
        }
        this.f90572e = i10;
        a();
        return true;
    }

    public boolean setTopAndBottomOffset(int i10) {
        if (!this.f90573f || this.f90571d == i10) {
            return false;
        }
        this.f90571d = i10;
        a();
        return true;
    }

    public void setVerticalOffsetEnabled(boolean z10) {
        this.f90573f = z10;
    }
}
