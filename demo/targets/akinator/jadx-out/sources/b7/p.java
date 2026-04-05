package b7;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p implements m7.k {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f8876b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f8877b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: b7.p$a$a, reason: collision with other inner class name */
        public static final class C0014a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f8878b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: b7.p$a$a$a, reason: collision with other inner class name */
            public static final class C0015a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f8879i;

                /* renamed from: j, reason: collision with root package name */
                public int f8880j;

                public C0015a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f8879i = obj;
                    this.f8880j |= Integer.MIN_VALUE;
                    return C0014a.this.emit(null, this);
                }
            }

            public C0014a(FlowCollector flowCollector) {
                this.f8878b = flowCollector;
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
                    boolean r0 = r6 instanceof b7.p.a.C0014a.C0015a
                    if (r0 == 0) goto L13
                    r0 = r6
                    b7.p$a$a$a r0 = (b7.p.a.C0014a.C0015a) r0
                    int r1 = r0.f8880j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f8880j = r1
                    goto L18
                L13:
                    b7.p$a$a$a r0 = new b7.p$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f8879i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f8880j
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L4b
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    i1.o r5 = (i1.o) r5
                    long r5 = r5.m4257unboximpl()
                    m7.j r5 = b7.r.m141access$toSizeOrNulluvyYCjk(r5)
                    if (r5 == 0) goto L4b
                    r0.f8880j = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f8878b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: b7.p.a.C0014a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f8877b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f8877b.collect(new C0014a(flowCollector), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    public p(i iVar) {
        this.f8876b = iVar;
    }

    @Override // m7.k
    public final Object size(zu.d<? super m7.j> dVar) {
        return FlowKt.first(new a(this.f8876b.f8848i), dVar);
    }
}
