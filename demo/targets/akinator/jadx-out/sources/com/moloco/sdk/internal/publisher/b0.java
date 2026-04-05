package com.moloco.sdk.internal.publisher;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.a f46231a;

    /* renamed from: b, reason: collision with root package name */
    public final c0 f46232b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public b0 f46233i;

        /* renamed from: j, reason: collision with root package name */
        public String f46234j;

        /* renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f46235k;

        /* renamed from: m, reason: collision with root package name */
        public int f46237m;

        public b(zu.d<? super b> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46235k = obj;
            this.f46237m |= Integer.MIN_VALUE;
            return b0.this.a(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class c extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public String f46238i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46239j;

        /* renamed from: l, reason: collision with root package name */
        public int f46241l;

        public c(zu.d<? super c> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46239j = obj;
            this.f46241l |= Integer.MIN_VALUE;
            return b0.this.b(null, null, this);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends bv.d {

        /* renamed from: i, reason: collision with root package name */
        public String f46242i;

        /* renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f46243j;

        /* renamed from: l, reason: collision with root package name */
        public int f46245l;

        public d(zu.d<? super d> dVar) {
            super(dVar);
        }

        @Override // bv.a
        public final Object invokeSuspend(Object obj) {
            this.f46243j = obj;
            this.f46245l |= Integer.MIN_VALUE;
            return b0.this.a(null, this);
        }
    }

    static {
        new a(null);
    }

    public b0(com.moloco.sdk.internal.ortb.a bidResponseParser, c0 bidProcessor) {
        kotlin.jvm.internal.e0.checkNotNullParameter(bidResponseParser, "bidResponseParser");
        kotlin.jvm.internal.e0.checkNotNullParameter(bidProcessor, "bidProcessor");
        this.f46231a = bidResponseParser;
        this.f46232b = bidProcessor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, java.lang.String r9, zu.d<? super com.moloco.sdk.internal.w> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.moloco.sdk.internal.publisher.b0.c
            if (r0 == 0) goto L13
            r0 = r10
            com.moloco.sdk.internal.publisher.b0$c r0 = (com.moloco.sdk.internal.publisher.b0.c) r0
            int r1 = r0.f46241l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46241l = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.b0$c r0 = new com.moloco.sdk.internal.publisher.b0$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f46239j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46241l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r9 = r0.f46238i
            tu.a0.throwOnFailure(r10)
            goto L43
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            tu.a0.throwOnFailure(r10)
            r0.f46238i = r9
            r0.f46241l = r3
            com.moloco.sdk.internal.ortb.a r10 = r7.f46231a
            java.lang.Object r10 = r10.a(r8, r0)
            if (r10 != r1) goto L43
            return r1
        L43:
            com.moloco.sdk.internal.w r10 = (com.moloco.sdk.internal.w) r10
            boolean r8 = r10 instanceof com.moloco.sdk.internal.w.a
            if (r8 == 0) goto L6d
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            com.moloco.sdk.internal.w$a r10 = (com.moloco.sdk.internal.w.a) r10
            java.lang.Object r8 = r10.a()
            r3 = r8
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r5 = 8
            r6 = 0
            java.lang.String r1 = "BidLoader"
            java.lang.String r2 = "parseBidResponse failed to parse BID json string."
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.error$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r8 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR
            com.moloco.sdk.internal.p r10 = com.moloco.sdk.internal.p.f46222e
            com.moloco.sdk.internal.s r8 = com.moloco.sdk.internal.t.a(r9, r8, r10)
            com.moloco.sdk.internal.w$a r9 = new com.moloco.sdk.internal.w$a
            r9.<init>(r8)
            return r9
        L6d:
            boolean r8 = r10 instanceof com.moloco.sdk.internal.w.b
            if (r8 == 0) goto L92
            com.moloco.sdk.internal.w$b r8 = new com.moloco.sdk.internal.w$b
            com.moloco.sdk.internal.w$b r10 = (com.moloco.sdk.internal.w.b) r10
            java.lang.Object r9 = r10.a()
            com.moloco.sdk.internal.ortb.model.e r9 = (com.moloco.sdk.internal.ortb.model.e) r9
            java.util.List r9 = r9.b()
            r10 = 0
            java.lang.Object r9 = r9.get(r10)
            com.moloco.sdk.internal.ortb.model.s r9 = (com.moloco.sdk.internal.ortb.model.s) r9
            java.util.List r9 = r9.b()
            java.lang.Object r9 = r9.get(r10)
            r8.<init>(r9)
            return r8
        L92:
            tu.t r8 = new tu.t
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.b0.b(java.lang.String, java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, java.lang.String r13, zu.d<? super com.moloco.sdk.internal.w> r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.internal.publisher.b0.b
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.internal.publisher.b0$b r0 = (com.moloco.sdk.internal.publisher.b0.b) r0
            int r1 = r0.f46237m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46237m = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.b0$b r0 = new com.moloco.sdk.internal.publisher.b0$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f46235k
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46237m
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tu.a0.throwOnFailure(r14)
            return r14
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            java.lang.String r12 = r0.f46234j
            com.moloco.sdk.internal.publisher.b0 r13 = r0.f46233i
            tu.a0.throwOnFailure(r14)
            goto L5d
        L3c:
            tu.a0.throwOnFailure(r14)
            com.moloco.sdk.internal.MolocoLogger r5 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            java.lang.String r14 = "parse() called with bidResponseJson: "
            java.lang.String r7 = a.b.k(r14, r13)
            r9 = 4
            r10 = 0
            java.lang.String r6 = "BidLoader"
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.debug$default(r5, r6, r7, r8, r9, r10)
            r0.f46233i = r11
            r0.f46234j = r12
            r0.f46237m = r4
            java.lang.Object r14 = r11.a(r13, r0)
            if (r14 != r1) goto L5c
            goto L8a
        L5c:
            r13 = r11
        L5d:
            java.lang.String r14 = (java.lang.String) r14
            if (r14 != 0) goto L6f
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r13 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_BID_PARSE_ERROR
            com.moloco.sdk.internal.p r14 = com.moloco.sdk.internal.p.f46221c
            com.moloco.sdk.internal.s r12 = com.moloco.sdk.internal.t.a(r12, r13, r14)
            com.moloco.sdk.internal.w$a r13 = new com.moloco.sdk.internal.w$a
            r13.<init>(r12)
            return r13
        L6f:
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r9 = 12
            r10 = 0
            java.lang.String r5 = "BidLoader"
            java.lang.String r6 = "Processed the bidResponse, proceeding with parsing it."
            r7 = 0
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            r2 = 0
            r0.f46233i = r2
            r0.f46234j = r2
            r0.f46237m = r3
            java.lang.Object r12 = r13.b(r14, r12, r0)
            if (r12 != r1) goto L8b
        L8a:
            return r1
        L8b:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.b0.a(java.lang.String, java.lang.String, zu.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, zu.d<? super java.lang.String> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.moloco.sdk.internal.publisher.b0.d
            if (r0 == 0) goto L13
            r0 = r9
            com.moloco.sdk.internal.publisher.b0$d r0 = (com.moloco.sdk.internal.publisher.b0.d) r0
            int r1 = r0.f46245l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f46245l = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.b0$d r0 = new com.moloco.sdk.internal.publisher.b0$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f46243j
            java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
            int r2 = r0.f46245l
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.String r8 = r0.f46242i
            tu.a0.throwOnFailure(r9)
            goto L43
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            tu.a0.throwOnFailure(r9)
            r0.f46242i = r8
            r0.f46245l = r3
            com.moloco.sdk.internal.publisher.c0 r9 = r7.f46232b
            java.lang.Object r9 = r9.a(r8, r0)
            if (r9 != r1) goto L43
            return r1
        L43:
            java.lang.String r9 = (java.lang.String) r9
            if (r9 == 0) goto L56
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r5 = 12
            r6 = 0
            java.lang.String r1 = "BidLoader"
            java.lang.String r2 = "Found no pre-preprocessor for the current mediation. Returning the original bid response."
            r3 = 0
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.warn$default(r0, r1, r2, r3, r4, r5, r6)
            return r9
        L56:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.b0.a(java.lang.String, zu.d):java.lang.Object");
    }
}
