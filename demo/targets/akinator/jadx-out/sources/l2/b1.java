package l2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b1 {
    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m5434synthesizeTypefaceFxwP2eA(int r5, java.lang.Object r6, l2.w r7, l2.c1 r8, int r9) {
        /*
            java.lang.String r0 = "typeface"
            kotlin.jvm.internal.e0.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "font"
            kotlin.jvm.internal.e0.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "requestedWeight"
            kotlin.jvm.internal.e0.checkNotNullParameter(r8, r0)
            boolean r0 = r6 instanceof android.graphics.Typeface
            if (r0 != 0) goto L14
            return r6
        L14:
            boolean r0 = l2.a1.m5429isWeightOnimpl$ui_text_release(r5)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L42
            l2.c1 r0 = r7.getWeight()
            boolean r0 = kotlin.jvm.internal.e0.areEqual(r0, r8)
            if (r0 != 0) goto L42
            l2.c1$a r0 = l2.c1.f72258c
            l2.c1 r3 = l2.h.getAndroidBold(r0)
            int r3 = r8.compareTo(r3)
            if (r3 < 0) goto L42
            l2.c1 r3 = r7.getWeight()
            l2.c1 r0 = l2.h.getAndroidBold(r0)
            int r0 = r3.compareTo(r0)
            if (r0 >= 0) goto L42
            r0 = r2
            goto L43
        L42:
            r0 = r1
        L43:
            boolean r5 = l2.a1.m5428isStyleOnimpl$ui_text_release(r5)
            if (r5 == 0) goto L55
            int r5 = r7.mo5433getStyle_LCdwA()
            boolean r5 = l2.y0.m5485equalsimpl0(r9, r5)
            if (r5 != 0) goto L55
            r5 = r2
            goto L56
        L55:
            r5 = r1
        L56:
            if (r5 != 0) goto L5b
            if (r0 != 0) goto L5b
            return r6
        L5b:
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 >= r4) goto L7b
            if (r5 == 0) goto L70
            l2.x0 r5 = l2.y0.f72394b
            int r5 = r5.m5479getItalic_LCdwA()
            boolean r5 = l2.y0.m5485equalsimpl0(r9, r5)
            if (r5 == 0) goto L70
            r1 = r2
        L70:
            int r5 = l2.h.getAndroidTypefaceStyle(r0, r1)
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = android.graphics.Typeface.create(r6, r5)
            goto Lad
        L7b:
            if (r0 == 0) goto L82
            int r8 = r8.getWeight()
            goto L8a
        L82:
            l2.c1 r8 = r7.getWeight()
            int r8 = r8.getWeight()
        L8a:
            if (r5 == 0) goto L97
            l2.x0 r5 = l2.y0.f72394b
            int r5 = r5.m5479getItalic_LCdwA()
            boolean r5 = l2.y0.m5485equalsimpl0(r9, r5)
            goto La5
        L97:
            int r5 = r7.mo5433getStyle_LCdwA()
            l2.x0 r7 = l2.y0.f72394b
            int r7 = r7.m5479getItalic_LCdwA()
            boolean r5 = l2.y0.m5485equalsimpl0(r5, r7)
        La5:
            l2.t1 r7 = l2.t1.f72372a
            android.graphics.Typeface r6 = (android.graphics.Typeface) r6
            android.graphics.Typeface r5 = r7.create(r6, r8, r5)
        Lad:
            java.lang.String r6 = "if (Build.VERSION.SDK_IN…ht, finalFontStyle)\n    }"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: l2.b1.m5434synthesizeTypefaceFxwP2eA(int, java.lang.Object, l2.w, l2.c1, int):java.lang.Object");
    }
}
