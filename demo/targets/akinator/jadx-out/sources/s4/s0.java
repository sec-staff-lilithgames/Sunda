package s4;

import android.text.TextPaint;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s0 extends e0 {

    /* renamed from: i, reason: collision with root package name */
    public static TextPaint f85461i;

    /* renamed from: h, reason: collision with root package name */
    public TextPaint f85462h;

    public s0(r0 r0Var) {
        super(r0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003e  */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11, java.lang.CharSequence r12, int r13, int r14, float r15, int r16, int r17, int r18, android.graphics.Paint r19) {
        /*
            r10 = this;
            r6 = r16
            r7 = r18
            r8 = r19
            boolean r0 = r12 instanceof android.text.Spanned
            r1 = 0
            if (r0 == 0) goto L46
            android.text.Spanned r12 = (android.text.Spanned) r12
            java.lang.Class<android.text.style.CharacterStyle> r0 = android.text.style.CharacterStyle.class
            java.lang.Object[] r12 = r12.getSpans(r13, r14, r0)
            android.text.style.CharacterStyle[] r12 = (android.text.style.CharacterStyle[]) r12
            int r13 = r12.length
            if (r13 == 0) goto L3e
            int r13 = r12.length
            r0 = 0
            r2 = 1
            if (r13 != r2) goto L22
            r13 = r12[r0]
            if (r13 != r10) goto L22
            goto L3e
        L22:
            android.text.TextPaint r13 = r10.f85462h
            if (r13 != 0) goto L2d
            android.text.TextPaint r13 = new android.text.TextPaint
            r13.<init>()
            r10.f85462h = r13
        L2d:
            r1 = r13
            r1.set(r8)
        L31:
            int r13 = r12.length
            if (r0 >= r13) goto L3c
            r13 = r12[r0]
            r13.updateDrawState(r1)
            int r0 = r0 + 1
            goto L31
        L3c:
            r5 = r1
            goto L4e
        L3e:
            boolean r12 = r8 instanceof android.text.TextPaint
            if (r12 == 0) goto L3c
            r1 = r8
            android.text.TextPaint r1 = (android.text.TextPaint) r1
            goto L3c
        L46:
            boolean r12 = r8 instanceof android.text.TextPaint
            if (r12 == 0) goto L3c
            r1 = r8
            android.text.TextPaint r1 = (android.text.TextPaint) r1
            goto L3c
        L4e:
            if (r5 == 0) goto L7a
            int r12 = r5.bgColor
            if (r12 == 0) goto L7a
            short r12 = r10.f85385e
            float r12 = (float) r12
            float r3 = r15 + r12
            float r2 = (float) r6
            float r4 = (float) r7
            int r12 = r5.getColor()
            android.graphics.Paint$Style r13 = r5.getStyle()
            int r0 = r5.bgColor
            r5.setColor(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r5.setStyle(r0)
            r0 = r11
            r1 = r15
            r0.drawRect(r1, r2, r3, r4, r5)
            r9 = r5
            r9.setStyle(r13)
            r9.setColor(r12)
            goto L7b
        L7a:
            r9 = r5
        L7b:
            s4.s r12 = s4.s.get()
            boolean r12 = r12.isEmojiSpanIndicatorEnabled()
            if (r12 == 0) goto Lb0
            float r2 = (float) r6
            short r12 = r10.f85385e
            float r12 = (float) r12
            float r3 = r15 + r12
            float r4 = (float) r7
            android.text.TextPaint r12 = s4.s0.f85461i
            if (r12 != 0) goto La9
            android.text.TextPaint r12 = new android.text.TextPaint
            r12.<init>()
            s4.s0.f85461i = r12
            s4.s r13 = s4.s.get()
            int r13 = r13.getEmojiSpanIndicatorColor()
            r12.setColor(r13)
            android.text.TextPaint r12 = s4.s0.f85461i
            android.graphics.Paint$Style r13 = android.graphics.Paint.Style.FILL
            r12.setStyle(r13)
        La9:
            android.text.TextPaint r5 = s4.s0.f85461i
            r0 = r11
            r1 = r15
            r0.drawRect(r1, r2, r3, r4, r5)
        Lb0:
            s4.r0 r12 = r10.getTypefaceRasterizer()
            r13 = r17
            float r13 = (float) r13
            if (r9 == 0) goto Lba
            r8 = r9
        Lba:
            r12.draw(r11, r15, r13, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: s4.s0.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }
}
