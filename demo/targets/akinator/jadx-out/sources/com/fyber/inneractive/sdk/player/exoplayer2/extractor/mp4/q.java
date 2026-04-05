package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class q {
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.UUID a(byte[] r9) {
        /*
            com.fyber.inneractive.sdk.player.exoplayer2.util.n r0 = new com.fyber.inneractive.sdk.player.exoplayer2.util.n
            r0.<init>(r9)
            int r9 = r0.f26044c
            r1 = 32
            r2 = 0
            if (r9 >= r1) goto Ld
            goto L62
        Ld:
            r9 = 0
            r0.e(r9)
            int r1 = r0.b()
            int r3 = r0.f26044c
            int r4 = r0.f26043b
            int r3 = r3 - r4
            int r3 = r3 + 4
            if (r1 == r3) goto L1f
            goto L62
        L1f:
            int r1 = r0.b()
            int r3 = com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.c.V
            if (r1 == r3) goto L28
            goto L62
        L28:
            int r1 = r0.b()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            if (r1 <= r3) goto L3c
            java.lang.String r9 = "Unsupported pssh version: "
            java.lang.String r0 = "PsshAtomUtil"
            j1.o2.u(r1, r9, r0)
        L3a:
            r9 = r2
            goto L6c
        L3c:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.g()
            long r7 = r0.g()
            r4.<init>(r5, r7)
            if (r1 != r3) goto L57
            int r1 = r0.m()
            int r1 = r1 * 16
            int r3 = r0.f26043b
            int r3 = r3 + r1
            r0.e(r3)
        L57:
            int r1 = r0.m()
            int r3 = r0.f26044c
            int r5 = r0.f26043b
            int r3 = r3 - r5
            if (r1 == r3) goto L63
        L62:
            goto L3a
        L63:
            byte[] r3 = new byte[r1]
            r0.a(r3, r9, r1)
            android.util.Pair r9 = android.util.Pair.create(r4, r3)
        L6c:
            if (r9 != 0) goto L6f
            return r2
        L6f:
            java.lang.Object r9 = r9.first
            java.util.UUID r9 = (java.util.UUID) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.q.a(byte[]):java.util.UUID");
    }
}
