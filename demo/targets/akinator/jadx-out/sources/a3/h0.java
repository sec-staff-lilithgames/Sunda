package a3;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface h0 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static int getId(java.lang.String r2) {
        /*
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1812823328: goto L4f;
                case -1127236479: goto L44;
                case -1017587252: goto L39;
                case -827014263: goto L2e;
                case -200259324: goto L23;
                case 428090547: goto L18;
                case 428090548: goto Ld;
                default: goto Lb;
            }
        Lb:
            r2 = r1
            goto L59
        Ld:
            java.lang.String r0 = "percentY"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L16
            goto Lb
        L16:
            r2 = 6
            goto L59
        L18:
            java.lang.String r0 = "percentX"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L21
            goto Lb
        L21:
            r2 = 5
            goto L59
        L23:
            java.lang.String r0 = "sizePercent"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2c
            goto Lb
        L2c:
            r2 = 4
            goto L59
        L2e:
            java.lang.String r0 = "drawPath"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L37
            goto Lb
        L37:
            r2 = 3
            goto L59
        L39:
            java.lang.String r0 = "percentHeight"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L42
            goto Lb
        L42:
            r2 = 2
            goto L59
        L44:
            java.lang.String r0 = "percentWidth"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4d
            goto Lb
        L4d:
            r2 = 1
            goto L59
        L4f:
            java.lang.String r0 = "transitionEasing"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L58
            goto Lb
        L58:
            r2 = 0
        L59:
            switch(r2) {
                case 0: goto L6f;
                case 1: goto L6c;
                case 2: goto L69;
                case 3: goto L66;
                case 4: goto L63;
                case 5: goto L60;
                case 6: goto L5d;
                default: goto L5c;
            }
        L5c:
            return r1
        L5d:
            r2 = 507(0x1fb, float:7.1E-43)
            return r2
        L60:
            r2 = 506(0x1fa, float:7.09E-43)
            return r2
        L63:
            r2 = 505(0x1f9, float:7.08E-43)
            return r2
        L66:
            r2 = 502(0x1f6, float:7.03E-43)
            return r2
        L69:
            r2 = 504(0x1f8, float:7.06E-43)
            return r2
        L6c:
            r2 = 503(0x1f7, float:7.05E-43)
            return r2
        L6f:
            r2 = 501(0x1f5, float:7.02E-43)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: a3.h0.getId(java.lang.String):int");
    }

    static int getType(int i10) {
        if (i10 == 100) {
            return 2;
        }
        if (i10 == 101) {
            return 8;
        }
        switch (i10) {
            case 501:
            case 502:
                return 8;
            case 503:
            case 504:
            case 505:
            case 506:
            case 507:
                return 4;
            case 508:
                return 2;
            default:
                return -1;
        }
    }
}
