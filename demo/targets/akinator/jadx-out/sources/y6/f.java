package y6;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class f implements Flow {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Flow f94105b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements FlowCollector {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FlowCollector f94106b;

        /* renamed from: y6.f$a$a, reason: collision with other inner class name */
        public static final class C0812a extends bv.d {

            /* renamed from: i, reason: collision with root package name */
            public /* synthetic */ Object f94107i;

            /* renamed from: j, reason: collision with root package name */
            public int f94108j;

            public C0812a(zu.d dVar) {
                super(dVar);
            }

            @Override // bv.a
            public final Object invokeSuspend(Object obj) {
                this.f94107i = obj;
                this.f94108j |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(FlowCollector flowCollector) {
            this.f94106b = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(java.lang.Object r5, zu.d r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof y6.f.a.C0812a
                if (r0 == 0) goto L13
                r0 = r6
                y6.f$a$a r0 = (y6.f.a.C0812a) r0
                int r1 = r0.f94108j
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f94108j = r1
                goto L18
            L13:
                y6.f$a$a r0 = new y6.f$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f94107i
                java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                int r2 = r0.f94108j
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                tu.a0.throwOnFailure(r6)
                goto L43
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                tu.a0.throwOnFailure(r6)
                boolean r6 = r5 instanceof r6.c.a
                if (r6 == 0) goto L43
                r0.f94108j = r3
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f94106b
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L43
                return r1
            L43:
                tu.x0 r5 = tu.x0.f87415a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: y6.f.a.emit(java.lang.Object, zu.d):java.lang.Object");
        }
    }

    public f(Flow flow) {
        this.f94105b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, zu.d dVar) {
        Object objCollect = this.f94105b.collect(new a(flowCollector), dVar);
        return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
    }
}
