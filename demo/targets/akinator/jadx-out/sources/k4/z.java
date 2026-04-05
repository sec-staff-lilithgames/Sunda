package k4;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public g f70567i;

    /* renamed from: j, reason: collision with root package name */
    public int f70568j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f70569k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ p f70570l;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f70571b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: k4.z$a$a, reason: collision with other inner class name */
        public static final class C0711a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f70572b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: k4.z$a$a$a, reason: collision with other inner class name */
            public static final class C0712a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f70573i;

                /* renamed from: j, reason: collision with root package name */
                public int f70574j;

                public C0712a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f70573i = obj;
                    this.f70574j |= Integer.MIN_VALUE;
                    return C0711a.this.emit(null, this);
                }
            }

            public C0711a(FlowCollector flowCollector) {
                this.f70572b = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, zu.d r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof k4.z.a.C0711a.C0712a
                    if (r0 == 0) goto L13
                    r0 = r6
                    k4.z$a$a$a r0 = (k4.z.a.C0711a.C0712a) r0
                    int r1 = r0.f70574j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f70574j = r1
                    goto L18
                L13:
                    k4.z$a$a$a r0 = new k4.z$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f70573i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f70574j
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L4f
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    k4.q2 r5 = (k4.q2) r5
                    boolean r6 = r5 instanceof k4.d2
                    if (r6 != 0) goto L69
                    boolean r6 = r5 instanceof k4.g
                    if (r6 == 0) goto L52
                    k4.g r5 = (k4.g) r5
                    java.lang.Object r5 = r5.getValue()
                    r0.f70574j = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f70572b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4f
                    return r1
                L4f:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                L52:
                    boolean r6 = r5 instanceof k4.j1
                    if (r6 == 0) goto L57
                    goto L59
                L57:
                    boolean r3 = r5 instanceof k4.w2
                L59:
                    if (r3 == 0) goto L63
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
                    r5.<init>(r6)
                    throw r5
                L63:
                    tu.t r5 = new tu.t
                    r5.<init>()
                    throw r5
                L69:
                    k4.d2 r5 = (k4.d2) r5
                    java.lang.Throwable r5 = r5.getReadException()
                    throw r5
                */
                throw new UnsupportedOperationException("Method not decompiled: k4.z.a.C0711a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f70571b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f70571b.collect(new C0711a(flowCollector), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : tu.x0.f87415a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(p pVar, zu.d dVar) {
        super(2, dVar);
        this.f70570l = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        z zVar = new z(this.f70570l, dVar);
        zVar.f70569k = obj;
        return zVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0 A[RETURN] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r9.f70568j
            tu.x0 r2 = tu.x0.f87415a
            r3 = 3
            r4 = 1
            r5 = 2
            k4.p r6 = r9.f70570l
            if (r1 == 0) goto L34
            if (r1 == r4) goto L2b
            if (r1 == r5) goto L21
            if (r1 != r3) goto L19
            tu.a0.throwOnFailure(r10)
            return r2
        L19:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L21:
            k4.g r1 = r9.f70567i
            java.lang.Object r4 = r9.f70569k
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            tu.a0.throwOnFailure(r10)
            goto L71
        L2b:
            java.lang.Object r1 = r9.f70569k
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            tu.a0.throwOnFailure(r10)
            r4 = r1
            goto L49
        L34:
            tu.a0.throwOnFailure(r10)
            java.lang.Object r10 = r9.f70569k
            kotlinx.coroutines.flow.FlowCollector r10 = (kotlinx.coroutines.flow.FlowCollector) r10
            r9.f70569k = r10
            r9.f70568j = r4
            r1 = 0
            java.lang.Object r1 = k4.p.access$readState(r6, r1, r9)
            if (r1 != r0) goto L47
            goto Laf
        L47:
            r4 = r10
            r10 = r1
        L49:
            r1 = r10
            k4.q2 r1 = (k4.q2) r1
            boolean r10 = r1 instanceof k4.g
            if (r10 == 0) goto L64
            r10 = r1
            k4.g r10 = (k4.g) r10
            java.lang.Object r7 = r10.getValue()
            r9.f70569k = r4
            r9.f70567i = r10
            r9.f70568j = r5
            java.lang.Object r10 = r4.emit(r7, r9)
            if (r10 != r0) goto L71
            goto Laf
        L64:
            boolean r10 = r1 instanceof k4.w2
            if (r10 != 0) goto Lb8
            boolean r10 = r1 instanceof k4.d2
            if (r10 != 0) goto Lb1
            boolean r10 = r1 instanceof k4.j1
            if (r10 == 0) goto L71
            goto Lb0
        L71:
            k4.x0 r10 = k4.p.access$getInMemoryCache$p(r6)
            kotlinx.coroutines.flow.Flow r10 = r10.getFlow()
            k4.v r7 = new k4.v
            r8 = 0
            r7.<init>(r6, r8)
            kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.onStart(r10, r7)
            k4.w r7 = new k4.w
            r7.<init>(r5, r8)
            kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.takeWhile(r10, r7)
            k4.x r5 = new k4.x
            r5.<init>(r1, r8)
            kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.dropWhile(r10, r5)
            k4.z$a r1 = new k4.z$a
            r1.<init>(r10)
            k4.y r10 = new k4.y
            r10.<init>(r6, r8)
            kotlinx.coroutines.flow.Flow r10 = kotlinx.coroutines.flow.FlowKt.onCompletion(r1, r10)
            r9.f70569k = r8
            r9.f70567i = r8
            r9.f70568j = r3
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.emitAll(r4, r10, r9)
            if (r10 != r0) goto Lb0
        Laf:
            return r0
        Lb0:
            return r2
        Lb1:
            k4.d2 r1 = (k4.d2) r1
            java.lang.Throwable r10 = r1.getReadException()
            throw r10
        Lb8:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: k4.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(FlowCollector<Object> flowCollector, zu.d<? super tu.x0> dVar) {
        return ((z) create(flowCollector, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
