package v6;

import java.util.List;
import java.util.UUID;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import n6.w0;
import tu.x0;
import v6.b0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d0 {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f89100b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: v6.d0$a$a, reason: collision with other inner class name */
        public static final class C0797a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f89101b;

            /* renamed from: v6.d0$a$a$a, reason: collision with other inner class name */
            public static final class C0798a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f89102i;

                /* renamed from: j, reason: collision with root package name */
                public int f89103j;

                public C0798a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f89102i = obj;
                    this.f89103j |= Integer.MIN_VALUE;
                    return C0797a.this.emit(null, this);
                }
            }

            public C0797a(FlowCollector flowCollector) {
                this.f89101b = flowCollector;
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
                    boolean r0 = r6 instanceof v6.d0.a.C0797a.C0798a
                    if (r0 == 0) goto L13
                    r0 = r6
                    v6.d0$a$a$a r0 = (v6.d0.a.C0797a.C0798a) r0
                    int r1 = r0.f89103j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f89103j = r1
                    goto L18
                L13:
                    v6.d0$a$a$a r0 = new v6.d0$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f89102i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f89103j
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    tu.a0.throwOnFailure(r6)
                    goto L66
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    tu.a0.throwOnFailure(r6)
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Iterable r5 = (java.lang.Iterable) r5
                    java.util.ArrayList r6 = new java.util.ArrayList
                    r2 = 10
                    int r2 = uu.q0.collectionSizeOrDefault(r5, r2)
                    r6.<init>(r2)
                    java.util.Iterator r5 = r5.iterator()
                L47:
                    boolean r2 = r5.hasNext()
                    if (r2 == 0) goto L5b
                    java.lang.Object r2 = r5.next()
                    v6.b0$c r2 = (v6.b0.c) r2
                    n6.w0 r2 = r2.toWorkInfo()
                    r6.add(r2)
                    goto L47
                L5b:
                    r0.f89103j = r3
                    kotlinx.coroutines.flow.FlowCollector r5 = r4.f89101b
                    java.lang.Object r5 = r5.emit(r6, r0)
                    if (r5 != r1) goto L66
                    return r1
                L66:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: v6.d0.a.C0797a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f89100b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f89100b.collect(new C0797a(flowCollector), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f89105b;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public static final class a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f89106b;

            /* renamed from: v6.d0$b$a$a, reason: collision with other inner class name */
            public static final class C0799a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f89107i;

                /* renamed from: j, reason: collision with root package name */
                public int f89108j;

                public C0799a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f89107i = obj;
                    this.f89108j |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector) {
                this.f89106b = flowCollector;
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
                    boolean r0 = r6 instanceof v6.d0.b.a.C0799a
                    if (r0 == 0) goto L13
                    r0 = r6
                    v6.d0$b$a$a r0 = (v6.d0.b.a.C0799a) r0
                    int r1 = r0.f89108j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f89108j = r1
                    goto L18
                L13:
                    v6.d0$b$a$a r0 = new v6.d0$b$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f89107i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f89108j
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
                    java.util.List r5 = (java.util.List) r5
                    java.lang.Object r5 = uu.y0.firstOrNull(r5)
                    v6.b0$c r5 = (v6.b0.c) r5
                    if (r5 == 0) goto L43
                    n6.w0 r5 = r5.toWorkInfo()
                    goto L44
                L43:
                    r5 = 0
                L44:
                    r0.f89108j = r3
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f89106b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4f
                    return r1
                L4f:
                    tu.x0 r5 = tu.x0.f87415a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: v6.d0.b.a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public b(Flow flow) {
            this.f89105b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f89105b.collect(new a(flowCollector), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    public static final Flow<List<w0>> dedup(Flow<? extends List<b0.c>> flow, CoroutineDispatcher dispatcher) {
        kotlin.jvm.internal.e0.checkNotNullParameter(flow, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        return FlowKt.flowOn(FlowKt.distinctUntilChanged(new a(flow)), dispatcher);
    }

    public static final Flow<w0> getWorkStatusPojoFlowDataForIds(c0 c0Var, UUID id2) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(id2, "id");
        return FlowKt.distinctUntilChanged(new b(c0Var.getWorkStatusPojoFlowDataForIds(uu.o0.listOf(String.valueOf(id2)))));
    }

    public static final Flow<List<w0>> getWorkStatusPojoFlowForName(c0 c0Var, CoroutineDispatcher dispatcher, String name) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(name, "name");
        return dedup(c0Var.getWorkStatusPojoFlowForName(name), dispatcher);
    }

    public static final Flow<List<w0>> getWorkStatusPojoFlowForTag(c0 c0Var, CoroutineDispatcher dispatcher, String tag) {
        kotlin.jvm.internal.e0.checkNotNullParameter(c0Var, "<this>");
        kotlin.jvm.internal.e0.checkNotNullParameter(dispatcher, "dispatcher");
        kotlin.jvm.internal.e0.checkNotNullParameter(tag, "tag");
        return dedup(c0Var.getWorkStatusPojoFlowForTag(tag), dispatcher);
    }
}
