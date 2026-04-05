package u1;

import kotlinx.coroutines.CoroutineScope;
import u1.g1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87550i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ long f87551j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ g1.a f87552k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(long j10, g1.a aVar, zu.d dVar) {
        super(2, dVar);
        this.f87551j = j10;
        this.f87552k = aVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        return new e1(this.f87551j, this.f87552k, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(1, r10) == r0) goto L15;
     */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r10.f87550i
            r2 = 1
            long r4 = r10.f87551j
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L22
            if (r1 == r7) goto L1e
            if (r1 != r6) goto L16
            tu.a0.throwOnFailure(r11)
            goto L39
        L16:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1e:
            tu.a0.throwOnFailure(r11)
            goto L30
        L22:
            tu.a0.throwOnFailure(r11)
            long r8 = r4 - r2
            r10.f87550i = r7
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r8, r10)
            if (r11 != r0) goto L30
            goto L38
        L30:
            r10.f87550i = r6
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r2, r10)
            if (r11 != r0) goto L39
        L38:
            return r0
        L39:
            u1.g1$a r11 = r10.f87552k
            kotlinx.coroutines.CancellableContinuation r11 = u1.g1.a.access$getPointerAwaiter$p(r11)
            if (r11 == 0) goto L53
            int r0 = tu.z.f87419c
            u1.p r0 = new u1.p
            r0.<init>(r4)
            java.lang.Object r0 = tu.a0.createFailure(r0)
            java.lang.Object r0 = tu.z.m7131constructorimpl(r0)
            r11.resumeWith(r0)
        L53:
            tu.x0 r11 = tu.x0.f87415a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.e1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(CoroutineScope coroutineScope, zu.d<? super tu.x0> dVar) {
        return ((e1) create(coroutineScope, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
