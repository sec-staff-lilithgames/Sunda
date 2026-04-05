package m0;

import m0.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class q {
    public static final s a(long j10, boolean z10, long j11, g2.x1 x1Var) {
        return new s(new s.a(x1Var.getBidiRunDirection(g2.a2.m3960getStartimpl(j10)), g2.a2.m3960getStartimpl(j10), j11), new s.a(x1Var.getBidiRunDirection(Math.max(g2.a2.m3955getEndimpl(j10) - 1, 0)), g2.a2.m3955getEndimpl(j10), j11), z10);
    }

    /* renamed from: getOffsetForPosition-0AR0LA0, reason: not valid java name */
    public static final int m5557getOffsetForPosition0AR0LA0(g2.x1 textLayoutResult, i1.j bounds, long j10) {
        kotlin.jvm.internal.e0.checkNotNullParameter(textLayoutResult, "textLayoutResult");
        kotlin.jvm.internal.e0.checkNotNullParameter(bounds, "bounds");
        int length = textLayoutResult.getLayoutInput().getText().length();
        if (bounds.m4205containsk4lQ0M(j10)) {
            return qv.v.coerceIn(textLayoutResult.m4043getOffsetForPositionk4lQ0M(j10), 0, length);
        }
        if (s1.f73823b.mo5560compare3MmeM6k$foundation_release(j10, bounds) < 0) {
            return 0;
        }
        return length;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* renamed from: getTextSelectionInfo-yM0VcXU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final tu.v m5558getTextSelectionInfoyM0VcXU(g2.x1 r14, long r15, long r17, i1.h r19, long r20, m0.b0 r22, m0.s r23, boolean r24) {
        /*
            r7 = r23
            java.lang.String r0 = "textLayoutResult"
            kotlin.jvm.internal.e0.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "adjustment"
            r1 = r22
            kotlin.jvm.internal.e0.checkNotNullParameter(r1, r0)
            i1.j r9 = new i1.j
            long r2 = r14.m4044getSizeYbymL2g()
            int r0 = s2.v.m6972getWidthimpl(r2)
            float r0 = (float) r0
            long r2 = r14.m4044getSizeYbymL2g()
            int r2 = s2.v.m6971getHeightimpl(r2)
            float r2 = (float) r2
            r3 = 0
            r9.<init>(r3, r3, r0, r2)
            m0.r1 r8 = m0.s1.f73823b
            r10 = r15
            r12 = r17
            boolean r0 = r8.m5567isSelected2x9bVx0$foundation_release(r9, r10, r12)
            r2 = 0
            if (r0 != 0) goto L3a
            tu.v r0 = new tu.v
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.<init>(r2, r1)
            return r0
        L3a:
            r10 = r15
            int r8 = m5557getOffsetForPosition0AR0LA0(r14, r9, r10)
            r12 = r17
            int r10 = m5557getOffsetForPosition0AR0LA0(r14, r9, r12)
            if (r19 == 0) goto L52
            long r3 = r19.m4195unboximpl()
            int r0 = m5557getOffsetForPosition0AR0LA0(r14, r9, r3)
        L4f:
            r4 = r0
            r0 = r2
            goto L54
        L52:
            r0 = -1
            goto L4f
        L54:
            long r2 = g2.b2.TextRange(r8, r10)
            if (r7 == 0) goto L62
            long r11 = r7.m5565toTextRanged9O1mEE()
            g2.a2 r0 = g2.a2.m3948boximpl(r11)
        L62:
            r5 = r24
            r6 = r0
            r0 = r1
            r1 = r14
            long r2 = r0.mo5494adjustZXO7KMw(r1, r2, r4, r5, r6)
            r0 = r2
            r6 = r4
            boolean r2 = g2.a2.m3959getReversedimpl(r0)
            r5 = r14
            r3 = r20
            m0.s r0 = a(r0, r2, r3, r5)
            boolean r1 = kotlin.jvm.internal.e0.areEqual(r0, r7)
            if (r24 == 0) goto L81
            if (r8 == r6) goto L84
            goto L86
        L81:
            if (r10 == r6) goto L84
            goto L86
        L84:
            if (r1 != 0) goto L88
        L86:
            r1 = 1
            goto L89
        L88:
            r1 = 0
        L89:
            tu.v r2 = new tu.v
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.<init>(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.q.m5558getTextSelectionInfoyM0VcXU(g2.x1, long, long, i1.h, long, m0.b0, m0.s, boolean):tu.v");
    }
}
