package u1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f87685i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f87686j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ boolean f87687k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ z f87688l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f87689m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(boolean z10, z zVar, t tVar, zu.d dVar) {
        super(2, dVar);
        this.f87687k = z10;
        this.f87688l = zVar;
        this.f87689m = tVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        w wVar = new w(this.f87687k, this.f87688l, this.f87689m, dVar);
        wVar.f87686j = obj;
        return wVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0034 -> B:16:0x0037). Please report as a decompilation issue!!! */
    @Override // bv.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = av.e.getCOROUTINE_SUSPENDED()
            int r1 = r10.f87685i
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r10.f87686j
            u1.c r1 = (u1.c) r1
            tu.a0.throwOnFailure(r11)
            goto L37
        L13:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1b:
            tu.a0.throwOnFailure(r11)
            java.lang.Object r11 = r10.f87686j
            u1.c r11 = (u1.c) r11
            r1 = r11
        L23:
            boolean r11 = r10.f87687k
            if (r11 == 0) goto L2a
            u1.o r11 = u1.o.f87647c
            goto L2c
        L2a:
            u1.o r11 = u1.o.f87646b
        L2c:
            r10.f87686j = r1
            r10.f87685i = r2
            java.lang.Object r11 = r1.awaitPointerEvent(r11, r10)
            if (r11 != r0) goto L37
            return r0
        L37:
            u1.m r11 = (u1.m) r11
            int r3 = r11.m7345getType7fucELk()
            u1.q r4 = u1.r.f87659b
            int r5 = r4.m7353getRelease7fucELk()
            boolean r3 = u1.r.m7358equalsimpl0(r3, r5)
            r5 = 0
            if (r3 == 0) goto L65
            java.util.List r3 = r11.getChanges()
            java.lang.Object r3 = r3.get(r5)
            u1.c0 r3 = (u1.c0) r3
            long r6 = r1.mo7285getSizeYbymL2g()
            i1.n r8 = i1.o.f59366b
            long r8 = r8.m4239getZeroNHjbRc()
            boolean r3 = u1.n.m7348isOutOfBoundsjwHxaWs(r3, r6, r8)
            if (r3 == 0) goto L65
            r5 = r2
        L65:
            int r11 = r11.m7345getType7fucELk()
            int r3 = r4.m7350getExit7fucELk()
            boolean r11 = u1.r.m7358equalsimpl0(r11, r3)
            if (r11 != 0) goto L23
            if (r5 != 0) goto L23
            u1.t r11 = r10.f87689m
            u1.z r3 = r10.f87688l
            a2.y r3 = (a2.y) r3
            r3.setCurrent(r11)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: u1.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kv.p
    public final Object invoke(c cVar, zu.d<? super tu.x0> dVar) {
        return ((w) create(cVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
