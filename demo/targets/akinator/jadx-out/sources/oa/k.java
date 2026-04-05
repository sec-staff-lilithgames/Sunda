package oa;

import kotlinx.coroutines.CoroutineScope;
import tu.x0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class k extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public ka.f f78762i;

    /* renamed from: j, reason: collision with root package name */
    public int f78763j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f78764k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ ka.a f78765l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f78766m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ l f78767n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ka.a aVar, boolean z10, l lVar, zu.d dVar) {
        super(2, dVar);
        this.f78765l = aVar;
        this.f78766m = z10;
        this.f78767n = lVar;
    }

    @Override // bv.a
    public final zu.d<x0> create(Object obj, zu.d<?> dVar) {
        k kVar = new k(this.f78765l, this.f78766m, this.f78767n, dVar);
        kVar.f78764k = obj;
        return kVar;
    }

    /* JADX WARN: Path cross not found for [B:23:0x0054, B:26:0x0063], limit reached: 36 */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: all -> 0x0020, TryCatch #0 {all -> 0x0020, blocks: (B:8:0x001c, B:26:0x0063, B:28:0x0069, B:31:0x007a, B:15:0x0031), top: B:38:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[DONT_GENERATE] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x008b -> B:26:0x0063). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r11.f78763j
            tu.x0 r2 = tu.x0.f87415a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            oa.l r7 = r11.f78767n
            if (r1 == 0) goto L3f
            if (r1 == r5) goto L35
            if (r1 == r4) goto L2b
            if (r1 != r3) goto L23
            ka.f r1 = r11.f78762i
            java.lang.Object r8 = r11.f78764k
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L20
            goto L63
        L20:
            r12 = move-exception
            goto L92
        L23:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2b:
            ka.f r1 = r11.f78762i
            java.lang.Object r8 = r11.f78764k
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            tu.a0.throwOnFailure(r12)     // Catch: java.lang.Throwable -> L20
            goto L7a
        L35:
            ka.f r1 = r11.f78762i
            java.lang.Object r8 = r11.f78764k
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            tu.a0.throwOnFailure(r12)
            goto L63
        L3f:
            tu.a0.throwOnFailure(r12)
            java.lang.Object r12 = r11.f78764k
            r8 = r12
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            ka.a r12 = r11.f78765l
            ka.f r1 = oa.o.findWaitingAnimation(r12)
            if (r1 != 0) goto L50
            return r2
        L50:
            boolean r12 = r11.f78766m
            if (r12 != 0) goto L63
            r11.f78764k = r8
            r11.f78762i = r1
            r11.f78763j = r5
            r9 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r9, r11)
            if (r12 != r0) goto L63
            goto L8d
        L63:
            boolean r12 = kotlinx.coroutines.CoroutineScopeKt.isActive(r8)     // Catch: java.lang.Throwable -> L20
            if (r12 == 0) goto L8e
            oa.l.access$setAnimationPlaying$p(r7, r5)     // Catch: java.lang.Throwable -> L20
            r11.f78764k = r8     // Catch: java.lang.Throwable -> L20
            r11.f78762i = r1     // Catch: java.lang.Throwable -> L20
            r11.f78763j = r4     // Catch: java.lang.Throwable -> L20
            r12 = 0
            java.lang.Object r12 = r7.playLottieOnce(r1, r6, r12, r11)     // Catch: java.lang.Throwable -> L20
            if (r12 != r0) goto L7a
            goto L8d
        L7a:
            oa.l.access$setAnimationPlaying$p(r7, r6)     // Catch: java.lang.Throwable -> L20
            long r9 = oa.l.access$getRebootDelay(r7, r1)     // Catch: java.lang.Throwable -> L20
            r11.f78764k = r8     // Catch: java.lang.Throwable -> L20
            r11.f78762i = r1     // Catch: java.lang.Throwable -> L20
            r11.f78763j = r3     // Catch: java.lang.Throwable -> L20
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.delay(r9, r11)     // Catch: java.lang.Throwable -> L20
            if (r12 != r0) goto L63
        L8d:
            return r0
        L8e:
            oa.l.access$setAnimationPlaying$p(r7, r6)
            return r2
        L92:
            oa.l.access$setAnimationPlaying$p(r7, r6)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: oa.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super x0> dVar) {
        return ((k) create(coroutineScope, dVar)).invokeSuspend(x0.f87415a);
    }
}
