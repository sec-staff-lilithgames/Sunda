package e0;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Channel;
import p0.v5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class y1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f53410i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53411j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ u1.k0 f53412k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v5 f53413l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v5 f53414m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m2 f53415n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Channel f53416o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f53417p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(u1.k0 k0Var, v5 v5Var, v5 v5Var2, m2 m2Var, Channel channel, boolean z10, zu.d dVar) {
        super(2, dVar);
        this.f53412k = k0Var;
        this.f53413l = v5Var;
        this.f53414m = v5Var2;
        this.f53415n = m2Var;
        this.f53416o = channel;
        this.f53417p = z10;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        y1 y1Var = new y1(this.f53412k, this.f53413l, this.f53414m, this.f53415n, this.f53416o, this.f53417p, dVar);
        y1Var.f53411j = obj;
        return y1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r11.f53410i
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            java.lang.Object r0 = r11.f53411j
            r1 = r0
            kotlinx.coroutines.CoroutineScope r1 = (kotlinx.coroutines.CoroutineScope) r1
            tu.a0.throwOnFailure(r12)     // Catch: java.util.concurrent.CancellationException -> L14
            goto L4d
        L14:
            r0 = move-exception
            r12 = r0
            goto L47
        L17:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1f:
            tu.a0.throwOnFailure(r12)
            java.lang.Object r12 = r11.f53411j
            r4 = r12
            kotlinx.coroutines.CoroutineScope r4 = (kotlinx.coroutines.CoroutineScope) r4
            u1.k0 r12 = r11.f53412k     // Catch: java.util.concurrent.CancellationException -> L44
            e0.x1 r3 = new e0.x1     // Catch: java.util.concurrent.CancellationException -> L44
            p0.v5 r5 = r11.f53413l     // Catch: java.util.concurrent.CancellationException -> L44
            p0.v5 r6 = r11.f53414m     // Catch: java.util.concurrent.CancellationException -> L44
            e0.m2 r7 = r11.f53415n     // Catch: java.util.concurrent.CancellationException -> L44
            kotlinx.coroutines.channels.Channel r8 = r11.f53416o     // Catch: java.util.concurrent.CancellationException -> L44
            boolean r9 = r11.f53417p     // Catch: java.util.concurrent.CancellationException -> L44
            r10 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L44
            r11.f53411j = r4     // Catch: java.util.concurrent.CancellationException -> L44
            r11.f53410i = r2     // Catch: java.util.concurrent.CancellationException -> L44
            java.lang.Object r12 = r12.awaitPointerEventScope(r3, r11)     // Catch: java.util.concurrent.CancellationException -> L44
            if (r12 != r0) goto L4d
            return r0
        L44:
            r0 = move-exception
            r12 = r0
            r1 = r4
        L47:
            boolean r0 = kotlinx.coroutines.CoroutineScopeKt.isActive(r1)
            if (r0 == 0) goto L50
        L4d:
            tu.x0 r12 = tu.x0.f87415a
            return r12
        L50:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.y1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((y1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
