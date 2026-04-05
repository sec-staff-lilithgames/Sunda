package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class k2 extends p2 {

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ String f74646j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(r2 r2Var, CharSequence charSequence, String str) {
        super(r2Var, charSequence);
        this.f74646j = str;
    }

    @Override // mh.p2
    public int separatorEnd(int i10) {
        return this.f74646j.length() + i10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        r8 = r8 + 1;
     */
    @Override // mh.p2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int separatorStart(int r8) {
        /*
            r7 = this;
            java.lang.String r0 = r7.f74646j
            int r1 = r0.length()
            java.lang.CharSequence r2 = r7.f74669e
            int r3 = r2.length()
            int r3 = r3 - r1
        Ld:
            if (r8 > r3) goto L25
            r4 = 0
        L10:
            if (r4 >= r1) goto L24
            int r5 = r4 + r8
            char r5 = r2.charAt(r5)
            char r6 = r0.charAt(r4)
            if (r5 == r6) goto L21
            int r8 = r8 + 1
            goto Ld
        L21:
            int r4 = r4 + 1
            goto L10
        L24:
            return r8
        L25:
            r8 = -1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.k2.separatorStart(int):int");
    }
}
