package g3;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 implements androidx.constraintlayout.widget.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s0 f57272a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f57273b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f57274c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f57275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ u0 f57276e;

    public t0(u0 u0Var, s0 s0Var, int i10, boolean z10, int i11) {
        this.f57276e = u0Var;
        this.f57272a = s0Var;
        this.f57273b = i10;
        this.f57274c = z10;
        this.f57275d = i11;
    }

    @Override // androidx.constraintlayout.widget.s
    public void onNewValue(int i10, int i11, int i12) {
        u0 u0Var = this.f57276e;
        i0 i0Var = u0Var.f57277a;
        s0 s0Var = this.f57272a;
        int sharedValueCurrent = s0Var.getSharedValueCurrent();
        s0Var.setSharedValueCurrent(i11);
        if (this.f57273b != i10 || sharedValueCurrent == i11) {
            return;
        }
        boolean z10 = this.f57274c;
        int i13 = this.f57275d;
        if (z10) {
            if (i13 == i11) {
                int childCount = i0Var.getChildCount();
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = i0Var.getChildAt(i14);
                    if (s0Var.c(childAt)) {
                        int currentState = i0Var.getCurrentState();
                        s0Var.a(u0Var, u0Var.f57277a, currentState, i0Var.getConstraintSet(currentState), childAt);
                    }
                }
                return;
            }
            return;
        }
        if (i13 != i11) {
            int childCount2 = i0Var.getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = i0Var.getChildAt(i15);
                if (s0Var.c(childAt2)) {
                    int currentState2 = i0Var.getCurrentState();
                    s0Var.a(u0Var, u0Var.f57277a, currentState2, i0Var.getConstraintSet(currentState2), childAt2);
                }
            }
        }
    }
}
