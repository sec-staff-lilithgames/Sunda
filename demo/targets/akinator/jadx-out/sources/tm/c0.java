package tm;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c0 implements s {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b3 A[RETURN] */
    @Override // tm.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean checkParamsForCommand(java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) {
        /*
            r5 = this;
            java.util.List r0 = tm.d0.f87006b
            r6.getClass()
            int r0 = r6.hashCode()
            java.lang.String r1 = "useCustomClose"
            r2 = 0
            r3 = 1
            r4 = -1
            switch(r0) {
                case -1886160473: goto L5e;
                case -1700226527: goto L53;
                case -733616544: goto L48;
                case 3417674: goto L3d;
                case 133423073: goto L32;
                case 459238621: goto L27;
                case 624734601: goto L1c;
                case 1614272768: goto L13;
                default: goto L11;
            }
        L11:
            goto L68
        L13:
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L1a
            goto L68
        L1a:
            r4 = 7
            goto L68
        L1c:
            java.lang.String r0 = "setResizeProperties"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L25
            goto L68
        L25:
            r4 = 6
            goto L68
        L27:
            java.lang.String r0 = "storePicture"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L30
            goto L68
        L30:
            r4 = 5
            goto L68
        L32:
            java.lang.String r0 = "setOrientationProperties"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L3b
            goto L68
        L3b:
            r4 = 4
            goto L68
        L3d:
            java.lang.String r0 = "open"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L46
            goto L68
        L46:
            r4 = 3
            goto L68
        L48:
            java.lang.String r0 = "createCalendarEvent"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L51
            goto L68
        L51:
            r4 = 2
            goto L68
        L53:
            java.lang.String r0 = "openPrivacySheet"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L5c
            goto L68
        L5c:
            r4 = r3
            goto L68
        L5e:
            java.lang.String r0 = "playVideo"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L67
            goto L68
        L67:
            r4 = r2
        L68:
            switch(r4) {
                case 0: goto Lc2;
                case 1: goto Lbb;
                case 2: goto Lb4;
                case 3: goto Lc2;
                case 4: goto La2;
                case 5: goto Lc2;
                case 6: goto L71;
                case 7: goto L6c;
                default: goto L6b;
            }
        L6b:
            goto Lb2
        L6c:
            boolean r6 = r7.containsKey(r1)
            return r6
        L71:
            java.lang.String r6 = "width"
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto Lb3
            java.lang.String r6 = "height"
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto Lb3
            java.lang.String r6 = "offsetX"
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto Lb3
            java.lang.String r6 = "offsetY"
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto Lb3
            java.lang.String r6 = "customClosePosition"
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto Lb3
            java.lang.String r6 = "allowOffscreen"
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto Lb3
            goto Lb2
        La2:
            java.lang.String r6 = "allowOrientationChange"
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto Lb3
            java.lang.String r6 = "forceOrientation"
            boolean r6 = r7.containsKey(r6)
            if (r6 == 0) goto Lb3
        Lb2:
            return r3
        Lb3:
            return r2
        Lb4:
            java.lang.String r6 = "eventJSON"
            boolean r6 = r7.containsKey(r6)
            return r6
        Lbb:
            java.lang.String r6 = "data"
            boolean r6 = r7.containsKey(r6)
            return r6
        Lc2:
            java.lang.String r6 = "url"
            boolean r6 = r7.containsKey(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.c0.checkParamsForCommand(java.lang.String, java.util.Map):boolean");
    }

    @Override // tm.s
    public boolean isValidCommand(String str) {
        return d0.f87006b.contains(str);
    }

    @Override // tm.s
    public String removePrefix(String str) {
        return str.substring(8);
    }
}
