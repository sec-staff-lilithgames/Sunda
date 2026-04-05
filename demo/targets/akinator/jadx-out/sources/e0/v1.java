package e0;

import kotlinx.coroutines.channels.Channel;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 extends bv.n implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f53340i;

    /* renamed from: j, reason: collision with root package name */
    public int f53341j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f53342k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.b1 f53343l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Channel f53344m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(kotlin.jvm.internal.b1 b1Var, Channel channel, zu.d dVar) {
        super(2, dVar);
        this.f53343l = b1Var;
        this.f53344m = channel;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        v1 v1Var = new v1(this.f53343l, this.f53344m, dVar);
        v1Var.f53342k = obj;
        return v1Var;
    }

    @Override // kv.p
    public final Object invoke(n2 n2Var, zu.d<? super tu.x0> dVar) {
        return ((v1) create(n2Var, dVar)).invokeSuspend(tu.x0.f87415a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0052 -> B:22:0x0055). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.f53341j
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            kotlin.jvm.internal.b1 r1 = r7.f53340i
            java.lang.Object r3 = r7.f53342k
            e0.n2 r3 = (e0.n2) r3
            tu.a0.throwOnFailure(r8)
            goto L55
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            tu.a0.throwOnFailure(r8)
            java.lang.Object r8 = r7.f53342k
            e0.n2 r8 = (e0.n2) r8
            r3 = r8
        L25:
            kotlin.jvm.internal.b1 r1 = r7.f53343l
            java.lang.Object r8 = r1.f71816b
            boolean r4 = r8 instanceof e0.m.c
            if (r4 != 0) goto L58
            boolean r4 = r8 instanceof e0.l
            if (r4 != 0) goto L58
            boolean r4 = r8 instanceof e0.m.a
            if (r4 == 0) goto L38
            e0.m$a r8 = (e0.m.a) r8
            goto L39
        L38:
            r8 = 0
        L39:
            if (r8 == 0) goto L46
            float r4 = r8.getDelta()
            long r5 = r8.m3766getPointerPositionF1C5BW0()
            r3.mo3765dragByUv8p0NA(r4, r5)
        L46:
            r7.f53342k = r3
            r7.f53340i = r1
            r7.f53341j = r2
            kotlinx.coroutines.channels.Channel r8 = r7.f53344m
            java.lang.Object r8 = r8.receive(r7)
            if (r8 != r0) goto L55
            return r0
        L55:
            r1.f71816b = r8
            goto L25
        L58:
            tu.x0 r8 = tu.x0.f87415a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.v1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
