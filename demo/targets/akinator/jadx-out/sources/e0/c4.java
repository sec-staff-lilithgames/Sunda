package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c4 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public long f52995i;

    /* renamed from: j, reason: collision with root package name */
    public int f52996j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f52997k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u1.c0 f52998l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(u1.c0 c0Var, zu.d dVar) {
        super(2, dVar);
        this.f52998l = c0Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        c4 c4Var = new c4(this.f52998l, dVar);
        c4Var.f52997k = obj;
        return c4Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0041 -> B:12:0x0044). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r7.f52996j
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            long r3 = r7.f52995i
            java.lang.Object r1 = r7.f52997k
            u1.c r1 = (u1.c) r1
            tu.a0.throwOnFailure(r8)
            goto L44
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            tu.a0.throwOnFailure(r8)
            java.lang.Object r8 = r7.f52997k
            u1.c r8 = (u1.c) r8
            u1.c0 r1 = r7.f52998l
            long r3 = r1.getUptimeMillis()
            a2.g5 r1 = r8.getViewConfiguration()
            long r5 = r1.getDoubleTapMinTimeMillis()
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L35:
            r7.f52997k = r1
            r7.f52995i = r3
            r7.f52996j = r2
            r8 = 0
            r5 = 0
            java.lang.Object r8 = e0.q4.awaitFirstDown$default(r1, r8, r7, r2, r5)
            if (r8 != r0) goto L44
            return r0
        L44:
            u1.c0 r8 = (u1.c0) r8
            long r5 = r8.getUptimeMillis()
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L35
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.c4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(u1.c cVar, zu.d<? super u1.c0> dVar) {
        return ((c4) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
