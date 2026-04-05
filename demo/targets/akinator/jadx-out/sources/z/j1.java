package z;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j1 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Object[] f96837i;

    /* renamed from: j, reason: collision with root package name */
    public long[] f96838j;

    /* renamed from: k, reason: collision with root package name */
    public int f96839k;

    /* renamed from: l, reason: collision with root package name */
    public int f96840l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f96841m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ k1 f96842n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(k1 k1Var, zu.d dVar) {
        super(2, dVar);
        this.f96842n = k1Var;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        j1 j1Var = new j1(this.f96842n, dVar);
        j1Var.f96841m = obj;
        return j1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        int i10;
        Object[] objArr;
        long[] jArr;
        rv.v vVar;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i11 = this.f96840l;
        if (i11 == 0) {
            tu.a0.throwOnFailure(obj);
            rv.v vVar2 = (rv.v) this.f96841m;
            i1 i1Var = this.f96842n.f96854b;
            Object[] objArr2 = i1Var.f96828b;
            long[] jArr2 = i1Var.f96829c;
            i10 = i1Var.f96831e;
            objArr = objArr2;
            jArr = jArr2;
            vVar = vVar2;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f96839k;
            jArr = this.f96838j;
            objArr = this.f96837i;
            vVar = (rv.v) this.f96841m;
            tu.a0.throwOnFailure(obj);
        }
        while (i10 != Integer.MAX_VALUE) {
            int i12 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj2 = objArr[i10];
            this.f96841m = vVar;
            this.f96837i = objArr;
            this.f96838j = jArr;
            this.f96839k = i12;
            this.f96840l = 1;
            if (vVar.yield(obj2, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            i10 = i12;
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(rv.v vVar, zu.d<? super tu.x0> dVar) {
        return ((j1) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
