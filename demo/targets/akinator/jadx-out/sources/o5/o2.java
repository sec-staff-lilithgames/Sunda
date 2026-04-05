package o5;

import java.util.Set;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o2 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f77680i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77681j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f77682k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int[] f77683l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f77684m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ String[] f77685n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(j2 j2Var, int[] iArr, boolean z10, String[] strArr, zu.d dVar) {
        super(2, dVar);
        this.f77682k = j2Var;
        this.f77683l = iArr;
        this.f77684m = z10;
        this.f77685n = strArr;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        o2 o2Var = new o2(this.f77682k, this.f77683l, this.f77684m, this.f77685n, dVar);
        o2Var.f77681j = obj;
        return o2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
    
        if (r1.collect(r8, r14) != r0) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068 A[PHI: r1
      0x0068: PHI (r1v5 kotlinx.coroutines.flow.FlowCollector) = 
      (r1v3 kotlinx.coroutines.flow.FlowCollector)
      (r1v4 kotlinx.coroutines.flow.FlowCollector)
      (r1v11 kotlinx.coroutines.flow.FlowCollector)
     binds: [B:16:0x0044, B:21:0x0065, B:13:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r14.f77680i
            r2 = 0
            int[] r3 = r14.f77683l
            r4 = 3
            r5 = 2
            r6 = 1
            o5.j2 r7 = r14.f77682k
            if (r1 == 0) goto L35
            if (r1 == r6) goto L2c
            if (r1 == r5) goto L24
            if (r1 == r4) goto L1e
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L1e:
            tu.a0.throwOnFailure(r15)     // Catch: java.lang.Throwable -> L22
            goto L88
        L22:
            r0 = move-exception
            goto L8e
        L24:
            java.lang.Object r1 = r14.f77681j
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            tu.a0.throwOnFailure(r15)
            goto L68
        L2c:
            java.lang.Object r1 = r14.f77681j
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            tu.a0.throwOnFailure(r15)
            r6 = r15
            goto L56
        L35:
            tu.a0.throwOnFailure(r15)
            java.lang.Object r1 = r14.f77681j
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            o5.n0 r8 = o5.j2.access$getObservedTableStates$p(r7)
            boolean r8 = r8.onObserverAdded$room_runtime_release(r3)
            if (r8 == 0) goto L68
            o5.y0 r8 = o5.j2.access$getDatabase$p(r7)
            r14.f77681j = r1
            r14.f77680i = r6
            r6 = 0
            java.lang.Object r6 = u5.c.getCoroutineContext(r8, r6, r14)
            if (r6 != r0) goto L56
            goto L87
        L56:
            zu.m r6 = (zu.m) r6
            o5.l2 r8 = new o5.l2
            r8.<init>(r7, r2)
            r14.f77681j = r1
            r14.f77680i = r5
            java.lang.Object r5 = kotlinx.coroutines.BuildersKt.withContext(r6, r8, r14)
            if (r5 != r0) goto L68
            goto L87
        L68:
            r11 = r1
            kotlin.jvm.internal.b1 r9 = new kotlin.jvm.internal.b1     // Catch: java.lang.Throwable -> L22
            r9.<init>()     // Catch: java.lang.Throwable -> L22
            o5.p0 r1 = o5.j2.access$getObservedTableVersions$p(r7)     // Catch: java.lang.Throwable -> L22
            o5.n2 r8 = new o5.n2     // Catch: java.lang.Throwable -> L22
            boolean r10 = r14.f77684m     // Catch: java.lang.Throwable -> L22
            java.lang.String[] r12 = r14.f77685n     // Catch: java.lang.Throwable -> L22
            int[] r13 = r14.f77683l     // Catch: java.lang.Throwable -> L22
            r8.<init>(r9, r10, r11, r12, r13)     // Catch: java.lang.Throwable -> L22
            r14.f77681j = r2     // Catch: java.lang.Throwable -> L22
            r14.f77680i = r4     // Catch: java.lang.Throwable -> L22
            java.lang.Object r1 = r1.collect(r8, r14)     // Catch: java.lang.Throwable -> L22
            if (r1 != r0) goto L88
        L87:
            return r0
        L88:
            tu.k r0 = new tu.k     // Catch: java.lang.Throwable -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L22
            throw r0     // Catch: java.lang.Throwable -> L22
        L8e:
            o5.n0 r1 = o5.j2.access$getObservedTableStates$p(r7)
            r1.onObserverRemoved$room_runtime_release(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: o5.o2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(FlowCollector<? super Set<String>> flowCollector, zu.d<? super tu.x0> dVar) {
        return ((o2) create(flowCollector, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
