package com.moloco.sdk.acm.db;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public abstract class d {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public Object f45524i;

        /* renamed from: j, reason: collision with root package name */
        public List f45525j;

        /* renamed from: k, reason: collision with root package name */
        public List f45526k;

        /* renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f45527l;

        /* renamed from: m, reason: collision with root package name */
        public int f45528m;

        public a(zu.d<? super a> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45527l = obj;
            this.f45528m |= Integer.MIN_VALUE;
            return d.a(null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public e f45529i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f45530j;

        /* renamed from: k, reason: collision with root package name */
        public int f45531k;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f45530j = obj;
            this.f45531k |= Integer.MIN_VALUE;
            return d.b(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a8 -> B:32:0x00aa). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object a(com.moloco.sdk.acm.db.e r9, zu.d<? super java.util.List<com.moloco.sdk.acm.db.b>> r10) {
        /*
            boolean r0 = r10 instanceof com.moloco.sdk.acm.db.d.a
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.acm.db.d$a r0 = (com.moloco.sdk.acm.db.d.a) r0
            int r1 = r0.f45528m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45528m = r1
            goto L18
        L13:
            com.moloco.sdk.acm.db.d$a r0 = new com.moloco.sdk.acm.db.d$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f45527l
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45528m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L48
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r9 = r0.f45524i
            java.util.List r9 = (java.util.List) r9
            tu.a0.throwOnFailure(r10)
            return r9
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            java.util.List r9 = r0.f45526k
            java.util.List r9 = (java.util.List) r9
            java.util.List r2 = r0.f45525j
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r5 = r0.f45524i
            com.moloco.sdk.acm.db.e r5 = (com.moloco.sdk.acm.db.e) r5
            tu.a0.throwOnFailure(r10)
            goto Laa
        L48:
            tu.a0.throwOnFailure(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r2 = r10
        L51:
            java.util.List r10 = r9.b()
            boolean r5 = r10.isEmpty()
            if (r5 == 0) goto L6c
            r0.f45524i = r2
            r10 = 0
            r0.f45525j = r10
            r0.f45526k = r10
            r0.f45528m = r3
            java.lang.Object r9 = r9.d(r0)
            if (r9 != r1) goto L6b
            goto La7
        L6b:
            return r2
        L6c:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = uu.q0.collectionSizeOrDefault(r10, r6)
            r5.<init>(r6)
            java.util.Iterator r6 = r10.iterator()
        L7b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L93
            java.lang.Object r7 = r6.next()
            com.moloco.sdk.acm.db.b r7 = (com.moloco.sdk.acm.db.b) r7
            long r7 = r7.i()
            java.lang.Long r7 = bv.b.boxLong(r7)
            r5.add(r7)
            goto L7b
        L93:
            r0.f45524i = r9
            r6 = r2
            java.util.List r6 = (java.util.List) r6
            r0.f45525j = r6
            r6 = r10
            java.util.List r6 = (java.util.List) r6
            r0.f45526k = r6
            r0.f45528m = r4
            java.lang.Object r5 = r9.a(r5, r0)
            if (r5 != r1) goto La8
        La7:
            return r1
        La8:
            r5 = r9
            r9 = r10
        Laa:
            r2.addAll(r9)
            r9 = r5
            goto L51
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.db.d.a(com.moloco.sdk.acm.db.e, zu.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r5.d(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object b(com.moloco.sdk.acm.db.e r5, zu.d<? super tu.x0> r6) {
        /*
            boolean r0 = r6 instanceof com.moloco.sdk.acm.db.d.b
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.acm.db.d$b r0 = (com.moloco.sdk.acm.db.d.b) r0
            int r1 = r0.f45531k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f45531k = r1
            goto L18
        L13:
            com.moloco.sdk.acm.db.d$b r0 = new com.moloco.sdk.acm.db.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f45530j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f45531k
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r6)
            goto L54
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            com.moloco.sdk.acm.db.e r5 = r0.f45529i
            tu.a0.throwOnFailure(r6)
            goto L48
        L3a:
            tu.a0.throwOnFailure(r6)
            r0.f45529i = r5
            r0.f45531k = r4
            java.lang.Object r6 = r5.b(r0)
            if (r6 != r1) goto L48
            goto L53
        L48:
            r6 = 0
            r0.f45529i = r6
            r0.f45531k = r3
            java.lang.Object r5 = r5.d(r0)
            if (r5 != r1) goto L54
        L53:
            return r1
        L54:
            tu.x0 r5 = tu.x0.f87415a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.db.d.b(com.moloco.sdk.acm.db.e, zu.d):java.lang.Object");
    }
}
