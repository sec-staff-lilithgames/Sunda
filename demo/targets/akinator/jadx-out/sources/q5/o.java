package q5;

import java.util.Arrays;
import kotlin.jvm.internal.e0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import o5.y0;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements Flow {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Flow f82450b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0 f82451c;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f82452e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ kv.l f82453f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: q5.o$a$a, reason: collision with other inner class name */
        public static final class C0768a implements FlowCollector {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ FlowCollector f82454b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ y0 f82455c;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f82456e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ kv.l f82457f;

            /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
            /* renamed from: q5.o$a$a$a, reason: collision with other inner class name */
            public static final class C0769a extends bv.d {

                /* renamed from: i, reason: collision with root package name */
                public /* synthetic */ Object f82458i;

                /* renamed from: j, reason: collision with root package name */
                public int f82459j;

                /* renamed from: k, reason: collision with root package name */
                public FlowCollector f82460k;

                public C0769a(zu.d dVar) {
                    super(dVar);
                }

                @Override // bv.a
                public final Object invokeSuspend(Object obj) {
                    this.f82458i = obj;
                    this.f82459j |= Integer.MIN_VALUE;
                    return C0768a.this.emit(null, this);
                }
            }

            public C0768a(FlowCollector flowCollector, y0 y0Var, boolean z10, kv.l lVar) {
                this.f82454b = flowCollector;
                this.f82455c = y0Var;
                this.f82456e = z10;
                this.f82457f = lVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
            
                if (r7.emit(r8, r0) == r1) goto L21;
             */
            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r7, zu.d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof q5.o.a.C0768a.C0769a
                    if (r0 == 0) goto L13
                    r0 = r8
                    q5.o$a$a$a r0 = (q5.o.a.C0768a.C0769a) r0
                    int r1 = r0.f82459j
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f82459j = r1
                    goto L18
                L13:
                    q5.o$a$a$a r0 = new q5.o$a$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f82458i
                    java.lang.Object r1 = av.e.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f82459j
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3a
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    tu.a0.throwOnFailure(r8)
                    goto L5e
                L2c:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L34:
                    kotlinx.coroutines.flow.FlowCollector r7 = r0.f82460k
                    tu.a0.throwOnFailure(r8)
                    goto L52
                L3a:
                    tu.a0.throwOnFailure(r8)
                    java.util.Set r7 = (java.util.Set) r7
                    kotlinx.coroutines.flow.FlowCollector r7 = r6.f82454b
                    r0.f82460k = r7
                    r0.f82459j = r4
                    o5.y0 r8 = r6.f82455c
                    boolean r2 = r6.f82456e
                    kv.l r5 = r6.f82457f
                    java.lang.Object r8 = u5.c.performSuspending(r8, r4, r2, r5, r0)
                    if (r8 != r1) goto L52
                    goto L5d
                L52:
                    r2 = 0
                    r0.f82460k = r2
                    r0.f82459j = r3
                    java.lang.Object r7 = r7.emit(r8, r0)
                    if (r7 != r1) goto L5e
                L5d:
                    return r1
                L5e:
                    tu.x0 r7 = tu.x0.f87415a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: q5.o.a.C0768a.emit(java.lang.Object, zu.d):java.lang.Object");
            }
        }

        public a(Flow flow, y0 y0Var, boolean z10, kv.l lVar) {
            this.f82450b = flow;
            this.f82451c = y0Var;
            this.f82452e = z10;
            this.f82453f = lVar;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, zu.d dVar) {
            Object objCollect = this.f82450b.collect(new C0768a(flowCollector, this.f82451c, this.f82452e, this.f82453f), dVar);
            return objCollect == av.e.getCOROUTINE_SUSPENDED() ? objCollect : x0.f87415a;
        }
    }

    public static final <R> Flow<R> createFlow(y0 db2, boolean z10, String[] tableNames, kv.l block) {
        e0.checkNotNullParameter(db2, "db");
        e0.checkNotNullParameter(tableNames, "tableNames");
        e0.checkNotNullParameter(block, "block");
        return new a(FlowKt.conflate(db2.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(tableNames, tableNames.length), true)), db2, z10, block);
    }
}
