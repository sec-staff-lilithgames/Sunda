package ag;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import qg.r0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class d implements r0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f4397b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BottomSheetBehavior f4398c;

    public d(BottomSheetBehavior bottomSheetBehavior, boolean z10) {
        this.f4398c = bottomSheetBehavior;
        this.f4397b = z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x007f  */
    @Override // qg.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x3.e3 onApplyWindowInsets(android.view.View r12, x3.e3 r13, qg.s0 r14) {
        /*
            r11 = this;
            int r0 = x3.t3.systemBars()
            o3.c r0 = r13.getInsets(r0)
            int r1 = x3.t3.mandatorySystemGestures()
            o3.c r1 = r13.getInsets(r1)
            int r2 = r0.f77433b
            int r3 = r0.f77434c
            int r4 = r0.f77432a
            com.google.android.material.bottomsheet.BottomSheetBehavior r5 = r11.f4398c
            r5.f29014z = r2
            boolean r2 = qg.t0.isLayoutRtl(r12)
            int r6 = r12.getPaddingBottom()
            int r7 = r12.getPaddingLeft()
            int r8 = r12.getPaddingRight()
            boolean r9 = r5.f29006r
            if (r9 == 0) goto L39
            int r6 = r13.getSystemWindowInsetBottom()
            r5.f29013y = r6
            int r6 = r14.f83235d
            int r9 = r5.f29013y
            int r6 = r6 + r9
        L39:
            boolean r9 = r5.f29007s
            if (r9 == 0) goto L45
            if (r2 == 0) goto L42
            int r7 = r14.f83234c
            goto L44
        L42:
            int r7 = r14.f83232a
        L44:
            int r7 = r7 + r4
        L45:
            boolean r9 = r5.f29008t
            if (r9 == 0) goto L52
            if (r2 == 0) goto L4e
            int r14 = r14.f83232a
            goto L50
        L4e:
            int r14 = r14.f83234c
        L50:
            int r8 = r14 + r3
        L52:
            android.view.ViewGroup$LayoutParams r14 = r12.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r14 = (android.view.ViewGroup.MarginLayoutParams) r14
            boolean r2 = r5.f29010v
            r9 = 0
            r10 = 1
            if (r2 == 0) goto L66
            int r2 = r14.leftMargin
            if (r2 == r4) goto L66
            r14.leftMargin = r4
            r2 = r10
            goto L67
        L66:
            r2 = r9
        L67:
            boolean r4 = r5.f29011w
            if (r4 == 0) goto L72
            int r4 = r14.rightMargin
            if (r4 == r3) goto L72
            r14.rightMargin = r3
            r2 = r10
        L72:
            boolean r3 = r5.f29012x
            if (r3 == 0) goto L7f
            int r3 = r14.topMargin
            int r0 = r0.f77433b
            if (r3 == r0) goto L7f
            r14.topMargin = r0
            goto L80
        L7f:
            r10 = r2
        L80:
            if (r10 == 0) goto L85
            r12.setLayoutParams(r14)
        L85:
            int r14 = r12.getPaddingTop()
            r12.setPadding(r7, r14, r8, r6)
            boolean r12 = r11.f4397b
            if (r12 == 0) goto L94
            int r14 = r1.f77435d
            r5.f29004p = r14
        L94:
            boolean r14 = r5.f29006r
            if (r14 != 0) goto L9c
            if (r12 == 0) goto L9b
            goto L9c
        L9b:
            return r13
        L9c:
            r5.p(r9)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ag.d.onApplyWindowInsets(android.view.View, x3.e3, qg.s0):x3.e3");
    }
}
