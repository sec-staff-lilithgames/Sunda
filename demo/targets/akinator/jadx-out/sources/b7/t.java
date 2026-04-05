package b7;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import tu.x0;
import x1.a1;
import x1.o0;
import x1.q1;
import x1.w0;
import x1.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t implements m7.k, o0 {

    /* renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f8884b = StateFlowKt.MutableStateFlow(s2.c.m6744boximpl(f0.getZeroConstraints()));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f8885b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: b7.t$a$a, reason: collision with other inner class name */
        public static final class C0016a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f8886b;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: b7.t$a$a$a, reason: collision with other inner class name */
            public static final class C0017a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f8887i;

                /* renamed from: j, reason: collision with root package name */
                public int f8888j;

                public C0017a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f8887i = obj;
                    this.f8888j |= Integer.MIN_VALUE;
                    return C0016a.this.emit(null, this);
                }
            }

            public C0016a(FlowCollector flowCollector) {
                this.f8886b = flowCollector;
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
                    boolean r0 = r6 instanceof b7.t.a.C0016a.C0017a
                    if (r0 == 0) goto L13
                    r0 = r6
                    b7.t$a$a$a r0 = (b7.t.a.C0016a.C0017a) r0
                    int r1 = r0.f8888j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f8888j = r1
                    goto L18
                L13:
                    b7.t$a$a$a r0 = new b7.t$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f8887i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f8888j
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
                    s2.c r5 = (s2.c) r5
                    long r5 = r5.m6761unboximpl()
                    m7.j r5 = b7.c.m131access$toSizeOrNullBRTryo0(r5)
                    if (r5 == 0) goto L4b
                    r0.f8888j = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f8886b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4b
                    return r1
                L4b:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: b7.t.a.C0016a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f8885b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f8885b.collect(new C0016a(flowCollector), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean all(kv.l lVar) {
        return super.all(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ boolean any(kv.l lVar) {
        return super.any(lVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldIn(Object obj, kv.p pVar) {
        return super.foldIn(obj, pVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ Object foldOut(Object obj, kv.p pVar) {
        return super.foldOut(obj, pVar);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int maxIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        return super.maxIntrinsicHeight(zVar, yVar, i10);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int maxIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        return super.maxIntrinsicWidth(zVar, yVar, i10);
    }

    @Override // x1.o0
    /* renamed from: measure-3p2s80s */
    public y0 mo74measure3p2s80s(a1 a1Var, w0 w0Var, long j10) {
        this.f8884b.setValue(s2.c.m6744boximpl(j10));
        q1 q1VarMo7826measureBRTryo0 = w0Var.mo7826measureBRTryo0(j10);
        return a1.layout$default(a1Var, q1VarMo7826measureBRTryo0.getWidth(), q1VarMo7826measureBRTryo0.getHeight(), null, new s(q1VarMo7826measureBRTryo0), 4, null);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int minIntrinsicHeight(x1.z zVar, x1.y yVar, int i10) {
        return super.minIntrinsicHeight(zVar, yVar, i10);
    }

    @Override // x1.o0
    public /* bridge */ /* synthetic */ int minIntrinsicWidth(x1.z zVar, x1.y yVar, int i10) {
        return super.minIntrinsicWidth(zVar, yVar, i10);
    }

    /* renamed from: setConstraints-BRTryo0, reason: not valid java name */
    public final void m144setConstraintsBRTryo0(long j10) {
        this.f8884b.setValue(s2.c.m6744boximpl(j10));
    }

    @Override // m7.k
    public Object size(zu.d<? super m7.j> dVar) {
        return FlowKt.first(new a(this.f8884b), dVar);
    }

    @Override // x1.o0, e1.u, e1.v
    public /* bridge */ /* synthetic */ e1.v then(e1.v vVar) {
        return super.then(vVar);
    }
}
