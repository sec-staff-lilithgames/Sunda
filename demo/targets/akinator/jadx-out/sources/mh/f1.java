package mh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final String f74614a;

    /* renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.app.i1 f74615b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.appcompat.app.i1 f74616c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f74617d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f74618e;

    public f1(String str) {
        androidx.appcompat.app.i1 i1Var = new androidx.appcompat.app.i1();
        this.f74615b = i1Var;
        this.f74616c = i1Var;
        this.f74617d = false;
        this.f74618e = false;
        this.f74614a = (String) p1.checkNotNull(str);
    }

    public final e1 a() {
        e1 e1Var = new e1();
        this.f74616c.f4756c = e1Var;
        this.f74616c = e1Var;
        return e1Var;
    }

    public f1 add(String str, boolean z10) {
        b(str, String.valueOf(z10));
        return this;
    }

    public f1 addValue(boolean z10) {
        a().f4755b = String.valueOf(z10);
        return this;
    }

    public final void b(String str, String str2) {
        e1 e1VarA = a();
        e1VarA.f4755b = str2;
        e1VarA.f4754a = (String) p1.checkNotNull(str);
    }

    public f1 omitEmptyValues() {
        this.f74618e = true;
        return this;
    }

    public f1 omitNullValues() {
        this.f74617d = true;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r9 = this;
            boolean r0 = r9.f74617d
            boolean r1 = r9.f74618e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r3 = 32
            r2.<init>(r3)
            java.lang.String r3 = r9.f74614a
            r2.append(r3)
            r3 = 123(0x7b, float:1.72E-43)
            r2.append(r3)
            androidx.appcompat.app.i1 r3 = r9.f74615b
            java.lang.Object r3 = r3.f4756c
            androidx.appcompat.app.i1 r3 = (androidx.appcompat.app.i1) r3
            java.lang.String r4 = ""
        L1d:
            if (r3 == 0) goto Laf
            java.lang.Object r5 = r3.f4755b
            boolean r6 = r3 instanceof mh.e1
            r7 = 1
            if (r6 != 0) goto L76
            if (r5 != 0) goto L2b
            if (r0 != 0) goto La9
            goto L76
        L2b:
            if (r1 == 0) goto L76
            boolean r6 = r5 instanceof java.lang.CharSequence
            r8 = 0
            if (r6 == 0) goto L3d
            r6 = r5
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            int r6 = r6.length()
            if (r6 != 0) goto L74
        L3b:
            r8 = r7
            goto L74
        L3d:
            boolean r6 = r5 instanceof java.util.Collection
            if (r6 == 0) goto L49
            r6 = r5
            java.util.Collection r6 = (java.util.Collection) r6
            boolean r8 = r6.isEmpty()
            goto L74
        L49:
            boolean r6 = r5 instanceof java.util.Map
            if (r6 == 0) goto L55
            r6 = r5
            java.util.Map r6 = (java.util.Map) r6
            boolean r8 = r6.isEmpty()
            goto L74
        L55:
            boolean r6 = r5 instanceof mh.k1
            if (r6 == 0) goto L63
            r6 = r5
            mh.k1 r6 = (mh.k1) r6
            boolean r6 = r6.isPresent()
            r8 = r6 ^ 1
            goto L74
        L63:
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r6.isArray()
            if (r6 == 0) goto L74
            int r6 = java.lang.reflect.Array.getLength(r5)
            if (r6 != 0) goto L74
            goto L3b
        L74:
            if (r8 != 0) goto La9
        L76:
            r2.append(r4)
            java.lang.Object r4 = r3.f4754a
            java.lang.String r4 = (java.lang.String) r4
            if (r4 == 0) goto L87
            r2.append(r4)
            r4 = 61
            r2.append(r4)
        L87:
            if (r5 == 0) goto La4
            java.lang.Class r4 = r5.getClass()
            boolean r4 = r4.isArray()
            if (r4 == 0) goto La4
            java.lang.Object[] r4 = new java.lang.Object[]{r5}
            java.lang.String r4 = java.util.Arrays.deepToString(r4)
            int r5 = r4.length()
            int r5 = r5 - r7
            r2.append(r4, r7, r5)
            goto La7
        La4:
            r2.append(r5)
        La7:
            java.lang.String r4 = ", "
        La9:
            java.lang.Object r3 = r3.f4756c
            androidx.appcompat.app.i1 r3 = (androidx.appcompat.app.i1) r3
            goto L1d
        Laf:
            r0 = 125(0x7d, float:1.75E-43)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: mh.f1.toString():java.lang.String");
    }

    public f1 add(String str, char c10) {
        b(str, String.valueOf(c10));
        return this;
    }

    public f1 add(String str, double d10) {
        b(str, String.valueOf(d10));
        return this;
    }

    public f1 add(String str, float f10) {
        b(str, String.valueOf(f10));
        return this;
    }

    public f1 addValue(char c10) {
        a().f4755b = String.valueOf(c10);
        return this;
    }

    public f1 add(String str, int i10) {
        b(str, String.valueOf(i10));
        return this;
    }

    public f1 add(String str, long j10) {
        b(str, String.valueOf(j10));
        return this;
    }

    public f1 add(String str, Object obj) {
        androidx.appcompat.app.i1 i1Var = new androidx.appcompat.app.i1();
        this.f74616c.f4756c = i1Var;
        this.f74616c = i1Var;
        i1Var.f4755b = obj;
        i1Var.f4754a = (String) p1.checkNotNull(str);
        return this;
    }

    public f1 addValue(double d10) {
        a().f4755b = String.valueOf(d10);
        return this;
    }

    public f1 addValue(float f10) {
        a().f4755b = String.valueOf(f10);
        return this;
    }

    public f1 addValue(int i10) {
        a().f4755b = String.valueOf(i10);
        return this;
    }

    public f1 addValue(long j10) {
        a().f4755b = String.valueOf(j10);
        return this;
    }

    public f1 addValue(Object obj) {
        androidx.appcompat.app.i1 i1Var = new androidx.appcompat.app.i1();
        this.f74616c.f4756c = i1Var;
        this.f74616c = i1Var;
        i1Var.f4755b = obj;
        return this;
    }
}
