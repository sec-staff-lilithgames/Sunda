package a2;

import android.view.View;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d4 implements t1.a {

    /* renamed from: b, reason: collision with root package name */
    public final View f3517b;

    /* renamed from: c, reason: collision with root package name */
    public final x3.l0 f3518c;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f3519e;

    public d4(View view) {
        kotlin.jvm.internal.e0.checkNotNullParameter(view, "view");
        this.f3517b = view;
        x3.l0 l0Var = new x3.l0(view);
        l0Var.setNestedScrollingEnabled(true);
        this.f3518c = l0Var;
        this.f3519e = new int[2];
        x3.z1.setNestedScrollingEnabled(view, true);
    }

    @Override // t1.a
    /* renamed from: onPostFling-RZ2iAVY, reason: not valid java name */
    public Object mo24onPostFlingRZ2iAVY(long j10, long j11, zu.d<? super s2.e0> dVar) {
        float fAccess$toViewVelocity = e4.access$toViewVelocity(s2.e0.m6799getXimpl(j11));
        float fAccess$toViewVelocity2 = e4.access$toViewVelocity(s2.e0.m6800getYimpl(j11));
        x3.l0 l0Var = this.f3518c;
        if (!l0Var.dispatchNestedFling(fAccess$toViewVelocity, fAccess$toViewVelocity2, true)) {
            j11 = s2.e0.f85330b.m6777getZero9UxMQ8M();
        }
        if (l0Var.hasNestedScrollingParent(0)) {
            l0Var.stopNestedScroll(0);
        }
        if (l0Var.hasNestedScrollingParent(1)) {
            l0Var.stopNestedScroll(1);
        }
        return s2.e0.m6790boximpl(j11);
    }

    @Override // t1.a
    /* renamed from: onPostScroll-DzOQY0M, reason: not valid java name */
    public long mo25onPostScrollDzOQY0M(long j10, long j11, int i10) {
        if (!this.f3518c.startNestedScroll(e4.m28access$getScrollAxesk4lQ0M(j11), e4.m30access$toViewTypeGyEprt8(i10))) {
            return i1.h.f59344b.m4173getZeroF1C5BW0();
        }
        uu.f0.fill$default(this.f3519e, 0, 0, 0, 6, (Object) null);
        this.f3518c.dispatchNestedScroll(e4.composeToViewOffset(i1.h.m4185getXimpl(j10)), e4.composeToViewOffset(i1.h.m4186getYimpl(j10)), e4.composeToViewOffset(i1.h.m4185getXimpl(j11)), e4.composeToViewOffset(i1.h.m4186getYimpl(j11)), null, e4.m30access$toViewTypeGyEprt8(i10), this.f3519e);
        int[] iArr = this.f3519e;
        return i1.i.Offset(i1.h.m4185getXimpl(j11) >= 0.0f ? qv.v.coerceAtMost(iArr[0] * (-1.0f), i1.h.m4185getXimpl(j11)) : qv.v.coerceAtLeast(iArr[0] * (-1.0f), i1.h.m4185getXimpl(j11)), i1.h.m4186getYimpl(j11) >= 0.0f ? qv.v.coerceAtMost(iArr[1] * (-1.0f), i1.h.m4186getYimpl(j11)) : qv.v.coerceAtLeast(iArr[1] * (-1.0f), i1.h.m4186getYimpl(j11)));
    }

    @Override // t1.a
    /* renamed from: onPreFling-QWom1Mo, reason: not valid java name */
    public Object mo26onPreFlingQWom1Mo(long j10, zu.d<? super s2.e0> dVar) {
        float fAccess$toViewVelocity = e4.access$toViewVelocity(s2.e0.m6799getXimpl(j10));
        float fAccess$toViewVelocity2 = e4.access$toViewVelocity(s2.e0.m6800getYimpl(j10));
        x3.l0 l0Var = this.f3518c;
        if (!l0Var.dispatchNestedPreFling(fAccess$toViewVelocity, fAccess$toViewVelocity2)) {
            j10 = s2.e0.f85330b.m6777getZero9UxMQ8M();
        }
        if (l0Var.hasNestedScrollingParent(0)) {
            l0Var.stopNestedScroll(0);
        }
        if (l0Var.hasNestedScrollingParent(1)) {
            l0Var.stopNestedScroll(1);
        }
        return s2.e0.m6790boximpl(j10);
    }

    /* JADX WARN: Failed to inline method: a2.e4.access$toOffset-Uv8p0NA(int[], long):long */
    /* JADX WARN: Unknown register number '(r12v0 long)' in method call: a2.e4.access$toOffset-Uv8p0NA(int[], long):long */
    @Override // t1.a
    /* renamed from: onPreScroll-OzD1aCk, reason: not valid java name */
    public long mo27onPreScrollOzD1aCk(long j10, int i10) {
        if (!this.f3518c.startNestedScroll(e4.m28access$getScrollAxesk4lQ0M(j10), e4.m30access$toViewTypeGyEprt8(i10))) {
            return i1.h.f59344b.m4173getZeroF1C5BW0();
        }
        uu.f0.fill$default(this.f3519e, 0, 0, 0, 6, (Object) null);
        this.f3518c.dispatchNestedPreScroll(e4.composeToViewOffset(i1.h.m4185getXimpl(j10)), e4.composeToViewOffset(i1.h.m4186getYimpl(j10)), this.f3519e, null, e4.m30access$toViewTypeGyEprt8(i10));
        return e4.m29access$toOffsetUv8p0NA(this.f3519e, j10);
    }
}
