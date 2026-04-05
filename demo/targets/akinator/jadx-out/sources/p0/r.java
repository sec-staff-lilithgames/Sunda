package p0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public int f80415i;

    /* renamed from: j, reason: collision with root package name */
    public int f80416j;

    /* renamed from: k, reason: collision with root package name */
    public int f80417k;

    /* renamed from: l, reason: collision with root package name */
    public int f80418l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f80419m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ s f80420n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, zu.d dVar) {
        super(2, dVar);
        this.f80420n = sVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        r rVar = new r(this.f80420n, dVar);
        rVar.f80419m = obj;
        return rVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        rv.v vVar;
        int i11;
        int i12;
        String strJ;
        int i13;
        int i14;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i15 = this.f80418l;
        if (i15 == 0) {
            tu.a0.throwOnFailure(obj);
            i10 = 0;
            vVar = (rv.v) this.f80419m;
            i11 = 0;
            i12 = 0;
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i16 = this.f80417k;
            int i17 = this.f80416j;
            int i18 = this.f80415i;
            vVar = (rv.v) this.f80419m;
            tu.a0.throwOnFailure(obj);
            i11 = i17;
            i12 = i16;
            i10 = i18;
        }
        while (true) {
            s sVar = this.f80420n;
            if (i10 >= Math.min(sVar.f80447f, sVar.f80446e.f96886b)) {
                return tu.x0.f87415a;
            }
            int i19 = i10 + 1;
            int i20 = sVar.f80446e.get(i10);
            switch (i20) {
                case 0:
                    strJ = "up";
                    break;
                case 1:
                    strJ = j1.o2.j(sVar.f80444b.get(i11), "down ");
                    i11++;
                    break;
                case 2:
                    int i21 = sVar.f80446e.get(i19);
                    i19 = i10 + 3;
                    strJ = "remove " + i21 + ' ' + sVar.f80446e.get(i10 + 2);
                    break;
                case 3:
                    i13 = i10 + 4;
                    strJ = "move " + sVar.f80446e.get(i19) + ' ' + sVar.f80446e.get(i10 + 2) + ' ' + sVar.f80446e.get(i10 + 3);
                    i19 = i13;
                    break;
                case 4:
                    strJ = "clear";
                    break;
                case 5:
                    i13 = i10 + 2;
                    int i22 = sVar.f80446e.get(i19);
                    i14 = i11 + 1;
                    strJ = "insertBottomUp " + i22 + ' ' + sVar.f80444b.get(i11);
                    i11 = i14;
                    i19 = i13;
                    break;
                case 6:
                    i13 = i10 + 2;
                    int i23 = sVar.f80446e.get(i19);
                    i14 = i11 + 1;
                    strJ = "insertTopDown " + i23 + ' ' + sVar.f80444b.get(i11);
                    i11 = i14;
                    i19 = i13;
                    break;
                case 7:
                    int i24 = i11 + 1;
                    Object obj2 = sVar.f80444b.get(i11);
                    kotlin.jvm.internal.e0.checkNotNull(obj2, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
                    i11 += 2;
                    strJ = "apply " + ((kv.p) kotlin.jvm.internal.h1.beforeCheckcastToFunctionOfArity(obj2, 2)) + ' ' + sVar.f80444b.get(i24);
                    break;
                case 8:
                    strJ = "reuse " + sVar.f80445c.get(i12);
                    i12++;
                    break;
                default:
                    strJ = a.b.e(i20, "unknown op: ");
                    break;
            }
            String str = i10 + ": " + strJ;
            this.f80419m = vVar;
            this.f80415i = i19;
            this.f80416j = i11;
            this.f80417k = i12;
            this.f80418l = 1;
            if (vVar.yield(str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i10 = i19;
        }
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super tu.x0> dVar) {
        return ((r) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
