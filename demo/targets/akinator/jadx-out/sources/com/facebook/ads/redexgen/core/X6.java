package com.facebook.ads.redexgen.core;

import java.io.Writer;

/* loaded from: assets/audience_network.dex */
public class X6 extends Writer {
    public static String[] A03 = {"sr30eG8QqeA9PTnBv5Bt4hnZqAQxDLuJ", "ps2O52LB4Fk5tPEI", "b0E7ZBCk8ZgliqiBFiLr9fpcu", "ecf9I9JqHAeutuSgOmpZliCU4Q5JYn9j", "xrLrW173V2mkM", "oulCgqQ5su5pKYGJ0eYJOoBckMcEv73q", "45k95lrmWFpsS3hCtOsWilPKXmnWWUvV", "gCGLfpIuPcjj9nzv"};
    public int A00;
    public char[] A01 = new char[1024];
    public final X5 A02;

    public X6(X5 x52) {
        this.A02 = x52;
    }

    private void A00() {
        this.A02.AGO(new String(this.A01, 0, this.A00));
        this.A00 = 0;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        flush();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        if (this.A00 > 0) {
            A00();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    @Override // java.io.Writer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void write(char[] r6, int r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            r3 = r7
        L1:
            int r4 = r7 + r8
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.X6.A03
            r0 = 2
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L46
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.X6.A03
            java.lang.String r1 = "vRRDkAC7ww5dnR4MiguJ90FB5"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "BIleT5EfDSeSU"
            r0 = 4
            r2[r0] = r1
            if (r3 >= r4) goto L45
            char r1 = r6[r3]
            r0 = 10
            if (r1 == r0) goto L30
            int r1 = r5.A00
            char[] r0 = r5.A01
            int r0 = r0.length
            if (r1 != r0) goto L36
        L30:
            r5.A00()
        L33:
            int r3 = r3 + 1
            goto L1
        L36:
            char[] r2 = r5.A01
            int r1 = r5.A00
            char r0 = r6[r3]
            r2[r1] = r0
            int r0 = r5.A00
            int r0 = r0 + 1
            r5.A00 = r0
            goto L33
        L45:
            return
        L46:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.X6.write(char[], int, int):void");
    }
}
