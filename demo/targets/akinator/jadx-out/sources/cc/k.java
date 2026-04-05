package cc;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f12089a = d.copyHexChars(true);

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f12090b = d.copyHexBytes(true);

    /* renamed from: c, reason: collision with root package name */
    public static final k f12091c = new k();

    public static void a(int i10, char[] cArr) {
        cArr[1] = AbstractJsonLexerKt.UNICODE_ESC;
        char[] cArr2 = f12089a;
        cArr[4] = cArr2[i10 >> 4];
        cArr[5] = cArr2[i10 & 15];
    }

    public static int b(int i10, int i11) {
        if (i11 >= 56320 && i11 <= 57343) {
            return ((i10 << 10) + i11) - 56613888;
        }
        throw new IllegalArgumentException("Broken surrogate pair: first char 0x" + Integer.toHexString(i10) + ", second 0x" + Integer.toHexString(i11) + "; illegal combination");
    }

    public static void c(int i10) {
        throw new IllegalArgumentException(s.c(i10));
    }

    public static int d(int i10) {
        return Math.min(Math.max(24, i10 + 6 + (i10 >> 1)), 32000);
    }

    public static char[] e() {
        return new char[]{AbstractJsonLexerKt.STRING_ESC, 0, '0', '0', 0, 0};
    }

    public static k getInstance() {
        return f12091c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        return java.util.Arrays.copyOfRange(r2, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
    
        return r7.completeAndCoalesce(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] encodeAsUTF8(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.k.encodeAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0039, code lost:
    
        r10 = r8 + 1;
        r8 = r14.charAt(r8);
        r11 = r3[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
    
        if (r11 >= 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0043, code lost:
    
        a(r8, r7);
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r7[1] = (char) r11;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
    
        r11 = r9 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        if (r11 <= r1.length) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
    
        r11 = r1.length - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (r11 <= 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        java.lang.System.arraycopy(r7, 0, r1, r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        if (r6 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        r6 = ic.j0.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        r1 = r6.finishCurrentSegment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0063, code lost:
    
        r8 = r8 - r11;
        java.lang.System.arraycopy(r7, r11, r1, 0, r8);
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        java.lang.System.arraycopy(r7, 0, r1, r9, r8);
        r9 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r7 != null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r7 = e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] quoteAsString(java.lang.String r14) {
        /*
            r13 = this;
            int r0 = r14.length()
            int r1 = r0 >> 3
            r2 = 6
            int r1 = r1 + r2
            r3 = 1000(0x3e8, float:1.401E-42)
            int r1 = java.lang.Math.min(r1, r3)
            int r1 = r1 + r0
            r3 = 16
            int r1 = java.lang.Math.max(r3, r1)
            r3 = 32000(0x7d00, float:4.4842E-41)
            int r1 = java.lang.Math.min(r1, r3)
            char[] r1 = new char[r1]
            int[] r3 = cc.d.get7BitOutputEscapes()
            int r4 = r3.length
            r5 = 0
            r6 = 0
            r8 = r5
            r9 = r8
            r7 = r6
        L27:
            if (r8 >= r0) goto L98
        L29:
            char r10 = r14.charAt(r8)
            if (r10 >= r4) goto L76
            r11 = r3[r10]
            if (r11 == 0) goto L76
            if (r7 != 0) goto L39
            char[] r7 = e()
        L39:
            int r10 = r8 + 1
            char r8 = r14.charAt(r8)
            r11 = r3[r8]
            if (r11 >= 0) goto L48
            a(r8, r7)
            r8 = r2
            goto L4d
        L48:
            char r8 = (char) r11
            r11 = 1
            r7[r11] = r8
            r8 = 2
        L4d:
            int r11 = r9 + r8
            int r12 = r1.length
            if (r11 <= r12) goto L70
            int r11 = r1.length
            int r11 = r11 - r9
            if (r11 <= 0) goto L59
            java.lang.System.arraycopy(r7, r5, r1, r9, r11)
        L59:
            if (r6 != 0) goto L5f
            ic.j0 r6 = ic.j0.fromInitial(r1)
        L5f:
            char[] r1 = r6.finishCurrentSegment()     // Catch: java.io.IOException -> L69
            int r8 = r8 - r11
            java.lang.System.arraycopy(r7, r11, r1, r5, r8)
            r9 = r8
            goto L74
        L69:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        L70:
            java.lang.System.arraycopy(r7, r5, r1, r9, r8)
            r9 = r11
        L74:
            r8 = r10
            goto L27
        L76:
            int r11 = r1.length
            if (r9 < r11) goto L8c
            if (r6 != 0) goto L7f
            ic.j0 r6 = ic.j0.fromInitial(r1)
        L7f:
            char[] r1 = r6.finishCurrentSegment()     // Catch: java.io.IOException -> L85
            r9 = r5
            goto L8c
        L85:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        L8c:
            int r11 = r9 + 1
            r1[r9] = r10
            int r8 = r8 + 1
            if (r8 < r0) goto L96
            r9 = r11
            goto L98
        L96:
            r9 = r11
            goto L29
        L98:
            if (r6 != 0) goto L9f
            char[] r14 = java.util.Arrays.copyOfRange(r1, r5, r9)
            return r14
        L9f:
            r6.setCurrentLength(r9)
            char[] r14 = r6.contentsAsArray()     // Catch: java.io.IOException -> La7
            return r14
        La7:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.k.quoteAsString(java.lang.String):char[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x014e, code lost:
    
        if (r6 != null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0154, code lost:
    
        return java.util.Arrays.copyOfRange(r1, 0, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0159, code lost:
    
        return r6.completeAndCoalesce(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] quoteAsUTF8(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.k.quoteAsUTF8(java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r7 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
    
        r7 = e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        r10 = r8 + 1;
        r8 = r14.charAt(r8);
        r11 = r3[r8];
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004c, code lost:
    
        if (r11 >= 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004e, code lost:
    
        a(r8, r7);
        r8 = 6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
    
        r7[1] = (char) r11;
        r8 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        r11 = r9 + r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        if (r11 <= r1.length) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005d, code lost:
    
        r11 = r1.length - r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005f, code lost:
    
        if (r11 <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
    
        java.lang.System.arraycopy(r7, 0, r1, r9, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r5 != null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
    
        r5 = ic.j0.fromInitial(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        r1 = r5.finishCurrentSegment();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        r8 = r8 - r11;
        java.lang.System.arraycopy(r7, r11, r1, 0, r8);
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0074, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        throw new java.lang.IllegalStateException(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007b, code lost:
    
        java.lang.System.arraycopy(r7, 0, r1, r9, r8);
        r9 = r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public char[] quoteAsString(java.lang.CharSequence r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof java.lang.String
            if (r0 == 0) goto Lb
            java.lang.String r14 = (java.lang.String) r14
            char[] r14 = r13.quoteAsString(r14)
            return r14
        Lb:
            int r0 = r14.length()
            int r1 = r0 >> 3
            r2 = 6
            int r1 = r1 + r2
            r3 = 1000(0x3e8, float:1.401E-42)
            int r1 = java.lang.Math.min(r1, r3)
            int r1 = r1 + r0
            r3 = 16
            int r1 = java.lang.Math.max(r3, r1)
            r3 = 32000(0x7d00, float:4.4842E-41)
            int r1 = java.lang.Math.min(r1, r3)
            char[] r1 = new char[r1]
            int[] r3 = cc.d.get7BitOutputEscapes()
            int r4 = r3.length
            r5 = 0
            r6 = 0
            r7 = r5
            r8 = r6
            r9 = r8
        L32:
            if (r8 >= r0) goto La3
        L34:
            char r10 = r14.charAt(r8)
            if (r10 >= r4) goto L81
            r11 = r3[r10]
            if (r11 == 0) goto L81
            if (r7 != 0) goto L44
            char[] r7 = e()
        L44:
            int r10 = r8 + 1
            char r8 = r14.charAt(r8)
            r11 = r3[r8]
            if (r11 >= 0) goto L53
            a(r8, r7)
            r8 = r2
            goto L58
        L53:
            char r8 = (char) r11
            r11 = 1
            r7[r11] = r8
            r8 = 2
        L58:
            int r11 = r9 + r8
            int r12 = r1.length
            if (r11 <= r12) goto L7b
            int r11 = r1.length
            int r11 = r11 - r9
            if (r11 <= 0) goto L64
            java.lang.System.arraycopy(r7, r6, r1, r9, r11)
        L64:
            if (r5 != 0) goto L6a
            ic.j0 r5 = ic.j0.fromInitial(r1)
        L6a:
            char[] r1 = r5.finishCurrentSegment()     // Catch: java.io.IOException -> L74
            int r8 = r8 - r11
            java.lang.System.arraycopy(r7, r11, r1, r6, r8)
            r9 = r8
            goto L7f
        L74:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        L7b:
            java.lang.System.arraycopy(r7, r6, r1, r9, r8)
            r9 = r11
        L7f:
            r8 = r10
            goto L32
        L81:
            int r11 = r1.length
            if (r9 < r11) goto L97
            if (r5 != 0) goto L8a
            ic.j0 r5 = ic.j0.fromInitial(r1)
        L8a:
            char[] r1 = r5.finishCurrentSegment()     // Catch: java.io.IOException -> L90
            r9 = r6
            goto L97
        L90:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        L97:
            int r11 = r9 + 1
            r1[r9] = r10
            int r8 = r8 + 1
            if (r8 < r0) goto La1
            r9 = r11
            goto La3
        La1:
            r9 = r11
            goto L34
        La3:
            if (r5 != 0) goto Laa
            char[] r14 = java.util.Arrays.copyOfRange(r1, r6, r9)
            return r14
        Laa:
            r5.setCurrentLength(r9)
            char[] r14 = r5.contentsAsArray()     // Catch: java.io.IOException -> Lb2
            return r14
        Lb2:
            r14 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r14)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.k.quoteAsString(java.lang.CharSequence):char[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f8, code lost:
    
        if (r7 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fe, code lost:
    
        return java.util.Arrays.copyOfRange(r2, 0, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0103, code lost:
    
        return r7.completeAndCoalesce(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ec A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] encodeAsUTF8(java.lang.CharSequence r12) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cc.k.encodeAsUTF8(java.lang.CharSequence):byte[]");
    }

    public void quoteAsString(CharSequence charSequence, StringBuilder sb2) {
        int i10;
        int[] iArr = d.get7BitOutputEscapes();
        int length = iArr.length;
        int length2 = charSequence.length();
        char[] cArrE = null;
        int i11 = 0;
        while (i11 < length2) {
            do {
                char cCharAt = charSequence.charAt(i11);
                if (cCharAt < length && iArr[cCharAt] != 0) {
                    if (cArrE == null) {
                        cArrE = e();
                    }
                    int i12 = i11 + 1;
                    char cCharAt2 = charSequence.charAt(i11);
                    int i13 = iArr[cCharAt2];
                    if (i13 < 0) {
                        a(cCharAt2, cArrE);
                        i10 = 6;
                    } else {
                        cArrE[1] = (char) i13;
                        i10 = 2;
                    }
                    sb2.append(cArrE, 0, i10);
                    i11 = i12;
                } else {
                    sb2.append(cCharAt);
                    i11++;
                }
            } while (i11 < length2);
            return;
        }
    }
}
