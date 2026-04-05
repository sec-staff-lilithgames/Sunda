package l0;

import g2.x1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public final x1 f72120a;

    /* renamed from: b, reason: collision with root package name */
    public x1.d0 f72121b;

    /* renamed from: c, reason: collision with root package name */
    public x1.d0 f72122c;

    public k1(x1 value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f72120a = value;
    }

    public static /* synthetic */ int getLineEnd$default(k1 k1Var, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        return k1Var.getLineEnd(i10, z10);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m5266getOffsetForPosition3MmeM6k$default(k1 k1Var, long j10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return k1Var.m5267getOffsetForPosition3MmeM6k(j10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(long r6) {
        /*
            r5 = this;
            x1.d0 r0 = r5.f72121b
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            x1.d0 r1 = r5.f72122c
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            i1.j r2 = x1.d0.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            i1.j$a r0 = i1.j.f59349e
            i1.j r2 = r0.getZero()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            i1.j$a r0 = i1.j.f59349e
            i1.j r2 = r0.getZero()
        L24:
            long r6 = l0.l1.m5270access$coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: l0.k1.a(long):long");
    }

    public final long b(long j10) {
        i1.h hVarM4174boximpl;
        x1.d0 d0Var = this.f72121b;
        if (d0Var == null) {
            return j10;
        }
        x1.d0 d0Var2 = this.f72122c;
        if (d0Var2 != null) {
            hVarM4174boximpl = i1.h.m4174boximpl((d0Var.isAttached() && d0Var2.isAttached()) ? d0Var.mo7828localPositionOfR5De75A(d0Var2, j10) : j10);
        } else {
            hVarM4174boximpl = null;
        }
        return hVarM4174boximpl != null ? hVarM4174boximpl.m4195unboximpl() : j10;
    }

    public final x1.d0 getDecorationBoxCoordinates() {
        return this.f72122c;
    }

    public final x1.d0 getInnerTextFieldCoordinates() {
        return this.f72121b;
    }

    public final int getLineEnd(int i10, boolean z10) {
        return this.f72120a.getLineEnd(i10, z10);
    }

    public final int getLineForVerticalPosition(float f10) {
        return this.f72120a.getLineForVerticalPosition(i1.h.m4186getYimpl(b(a(i1.i.Offset(0.0f, f10)))));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m5267getOffsetForPosition3MmeM6k(long j10, boolean z10) {
        if (z10) {
            j10 = a(j10);
        }
        return this.f72120a.m4043getOffsetForPositionk4lQ0M(b(j10));
    }

    public final x1 getValue() {
        return this.f72120a;
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m5268isPositionOnTextk4lQ0M(long j10) {
        long jB = b(a(j10));
        float fM4186getYimpl = i1.h.m4186getYimpl(jB);
        x1 x1Var = this.f72120a;
        int lineForVerticalPosition = x1Var.getLineForVerticalPosition(fM4186getYimpl);
        return i1.h.m4185getXimpl(jB) >= x1Var.getLineLeft(lineForVerticalPosition) && i1.h.m4185getXimpl(jB) <= x1Var.getLineRight(lineForVerticalPosition);
    }

    public final void setDecorationBoxCoordinates(x1.d0 d0Var) {
        this.f72122c = d0Var;
    }

    public final void setInnerTextFieldCoordinates(x1.d0 d0Var) {
        this.f72121b = d0Var;
    }
}
