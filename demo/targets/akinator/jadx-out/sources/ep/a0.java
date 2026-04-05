package ep;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a0 {
    /* JADX WARN: Removed duplicated region for block: B:27:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static gn.u0 parseSmta(io.bidmachine.media3.common.util.m0 r9, int r10) {
        /*
            r0 = 12
            r9.skipBytes(r0)
        L5:
            int r1 = r9.getPosition()
            r2 = 0
            if (r1 >= r10) goto L92
            int r1 = r9.getPosition()
            int r3 = r9.readInt()
            int r4 = r9.readInt()
            r5 = 1935766900(0x73617574, float:1.7862687E31)
            if (r4 != r5) goto L8c
            r1 = 16
            if (r3 >= r1) goto L22
            return r2
        L22:
            r1 = 4
            r9.skipBytes(r1)
            r1 = 0
            r3 = -1
            r4 = r1
            r5 = r4
        L2a:
            r6 = 2
            r7 = 1
            if (r4 >= r6) goto L40
            int r6 = r9.readUnsignedByte()
            int r8 = r9.readUnsignedByte()
            if (r6 != 0) goto L3a
            r3 = r8
            goto L3d
        L3a:
            if (r6 != r7) goto L3d
            r5 = r8
        L3d:
            int r4 = r4 + 1
            goto L2a
        L40:
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            if (r3 != r0) goto L48
            r9 = 240(0xf0, float:3.36E-43)
            goto L79
        L48:
            r6 = 13
            if (r3 != r6) goto L4f
            r9 = 120(0x78, float:1.68E-43)
            goto L79
        L4f:
            r6 = 21
            if (r3 == r6) goto L55
        L53:
            r9 = r4
            goto L79
        L55:
            int r3 = r9.bytesLeft()
            r6 = 8
            if (r3 < r6) goto L53
            int r3 = r9.getPosition()
            int r3 = r3 + r6
            if (r3 <= r10) goto L65
            goto L53
        L65:
            int r10 = r9.readInt()
            int r3 = r9.readInt()
            if (r10 < r0) goto L53
            r10 = 1936877170(0x73726672, float:1.9204921E31)
            if (r3 == r10) goto L75
            goto L53
        L75:
            int r9 = r9.readUnsignedFixedPoint1616()
        L79:
            if (r9 != r4) goto L7c
            return r2
        L7c:
            gn.u0 r10 = new gn.u0
            zo.c r0 = new zo.c
            float r9 = (float) r9
            r0.<init>(r9, r5)
            gn.t0[] r9 = new gn.t0[r7]
            r9[r1] = r0
            r10.<init>(r9)
            return r10
        L8c:
            int r1 = r1 + r3
            r9.setPosition(r1)
            goto L5
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ep.a0.parseSmta(io.bidmachine.media3.common.util.m0, int):gn.u0");
    }
}
