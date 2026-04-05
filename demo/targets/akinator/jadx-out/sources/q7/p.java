package q7;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f82549a = new p();

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (c7.i.computeSizeMultiplier(r0.getWidth(), r0.getHeight(), m7.b.isOriginal(r8) ? r0.getWidth() : q7.n.toPx(r8.getWidth(), r9), m7.b.isOriginal(r8) ? r0.getHeight() : q7.n.toPx(r8.getHeight(), r9), r9) == 1.0d) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap convertToBitmap(android.graphics.drawable.Drawable r6, android.graphics.Bitmap.Config r7, m7.j r8, m7.i r9, boolean r10) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L51
            r0 = r6
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            android.graphics.Bitmap$Config r2 = q7.a.toSoftware(r7)
            if (r1 != r2) goto L51
            if (r10 == 0) goto L18
            goto L50
        L18:
            int r10 = r0.getWidth()
            int r1 = r0.getHeight()
            boolean r2 = m7.b.isOriginal(r8)
            if (r2 == 0) goto L2b
            int r2 = r0.getWidth()
            goto L33
        L2b:
            m7.c r2 = r8.getWidth()
            int r2 = q7.n.toPx(r2, r9)
        L33:
            boolean r3 = m7.b.isOriginal(r8)
            if (r3 == 0) goto L3e
            int r3 = r0.getHeight()
            goto L46
        L3e:
            m7.c r3 = r8.getHeight()
            int r3 = q7.n.toPx(r3, r9)
        L46:
            double r1 = c7.i.computeSizeMultiplier(r10, r1, r2, r3, r9)
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r10 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r10 != 0) goto L51
        L50:
            return r0
        L51:
            android.graphics.drawable.Drawable r6 = r6.mutate()
            int r10 = q7.n.getWidth(r6)
            r0 = 512(0x200, float:7.17E-43)
            if (r10 <= 0) goto L5e
            goto L5f
        L5e:
            r10 = r0
        L5f:
            int r1 = q7.n.getHeight(r6)
            if (r1 <= 0) goto L66
            r0 = r1
        L66:
            boolean r1 = m7.b.isOriginal(r8)
            if (r1 == 0) goto L6e
            r1 = r10
            goto L76
        L6e:
            m7.c r1 = r8.getWidth()
            int r1 = q7.n.toPx(r1, r9)
        L76:
            boolean r2 = m7.b.isOriginal(r8)
            if (r2 == 0) goto L7e
            r8 = r0
            goto L86
        L7e:
            m7.c r8 = r8.getHeight()
            int r8 = q7.n.toPx(r8, r9)
        L86:
            double r8 = c7.i.computeSizeMultiplier(r10, r0, r1, r8, r9)
            double r1 = (double) r10
            double r1 = r1 * r8
            int r10 = mv.d.roundToInt(r1)
            double r0 = (double) r0
            double r8 = r8 * r0
            int r8 = mv.d.roundToInt(r8)
            android.graphics.Bitmap$Config r7 = q7.a.toSoftware(r7)
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r10, r8, r7)
            java.lang.String r9 = "createBitmap(width, height, config)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r7, r9)
            android.graphics.Rect r9 = r6.getBounds()
            int r0 = r9.left
            int r1 = r9.top
            int r2 = r9.right
            int r9 = r9.bottom
            r3 = 0
            r6.setBounds(r3, r3, r10, r8)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r7)
            r6.draw(r8)
            r6.setBounds(r0, r1, r2, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: q7.p.convertToBitmap(android.graphics.drawable.Drawable, android.graphics.Bitmap$Config, m7.j, m7.i, boolean):android.graphics.Bitmap");
    }
}
