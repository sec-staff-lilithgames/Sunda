package iu;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class q implements st.c {

    /* renamed from: b, reason: collision with root package name */
    public final Comparator f68420b;

    public q(Comparator<Object> comparator) {
        this.f68420b = comparator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0037, code lost:
    
        r3 = null;
     */
    @Override // st.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<java.lang.Object> apply(java.util.List<java.lang.Object> r6, java.util.List<java.lang.Object> r7) throws java.lang.Exception {
        /*
            r5 = this;
            int r0 = r6.size()
            int r1 = r7.size()
            int r1 = r1 + r0
            if (r1 != 0) goto L11
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            return r6
        L11:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            boolean r1 = r6.hasNext()
            r2 = 0
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r6.next()
            goto L2b
        L2a:
            r1 = r2
        L2b:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r7.next()
            goto L37
        L36:
            r3 = r2
        L37:
            if (r1 == 0) goto L61
            if (r3 == 0) goto L61
            java.util.Comparator r4 = r5.f68420b
            int r4 = r4.compare(r1, r3)
            if (r4 >= 0) goto L53
            r0.add(r1)
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L51
            java.lang.Object r1 = r6.next()
            goto L37
        L51:
            r1 = r2
            goto L37
        L53:
            r0.add(r3)
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r7.next()
            goto L37
        L61:
            if (r1 == 0) goto L74
            r0.add(r1)
        L66:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L85
            java.lang.Object r7 = r6.next()
            r0.add(r7)
            goto L66
        L74:
            r0.add(r3)
        L77:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L85
            java.lang.Object r6 = r7.next()
            r0.add(r6)
            goto L77
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: iu.q.apply(java.util.List, java.util.List):java.util.List");
    }
}
