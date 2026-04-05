package x3;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public int f91652a;

    /* renamed from: b, reason: collision with root package name */
    public int f91653b;

    public p0(ViewGroup viewGroup) {
    }

    public int getNestedScrollAxes() {
        return this.f91652a | this.f91653b;
    }

    public void onNestedScrollAccepted(View view, View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    public void onStopNestedScroll(View view) {
        onStopNestedScroll(view, 0);
    }

    public void onNestedScrollAccepted(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f91653b = i10;
        } else {
            this.f91652a = i10;
        }
    }

    public void onStopNestedScroll(View view, int i10) {
        if (i10 == 1) {
            this.f91653b = 0;
        } else {
            this.f91652a = 0;
        }
    }
}
