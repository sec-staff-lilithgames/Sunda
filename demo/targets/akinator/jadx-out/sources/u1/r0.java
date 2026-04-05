package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87667i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f87668j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ kv.l f87669k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(kv.l lVar, zu.d dVar) {
        super(2, dVar);
        this.f87669k = lVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        r0 r0Var = new r0(this.f87669k, dVar);
        r0Var.f87668j = obj;
        return r0Var;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r4.f87667i
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r4.f87668j
            u1.c r1 = (u1.c) r1
            tu.a0.throwOnFailure(r5)
            goto L30
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            tu.a0.throwOnFailure(r5)
            java.lang.Object r5 = r4.f87668j
            u1.c r5 = (u1.c) r5
            r1 = r5
        L23:
            r4.f87668j = r1
            r4.f87667i = r2
            u1.o r5 = u1.o.f87646b
            java.lang.Object r5 = r1.awaitPointerEvent(r5, r4)
            if (r5 != r0) goto L30
            return r0
        L30:
            u1.m r5 = (u1.m) r5
            android.view.MotionEvent r5 = r5.getMotionEvent$ui_release()
            if (r5 == 0) goto L23
            kv.l r3 = r4.f87669k
            r3.invoke(r5)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.r0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(c cVar, zu.d<? super tu.x0> dVar) {
        return ((r0) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
