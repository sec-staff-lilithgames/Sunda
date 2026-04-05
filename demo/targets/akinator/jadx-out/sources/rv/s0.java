package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class s0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f85087i;

    /* renamed from: j, reason: collision with root package name */
    public Object f85088j;

    /* renamed from: k, reason: collision with root package name */
    public int f85089k;

    /* renamed from: l, reason: collision with root package name */
    public int f85090l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f85091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ t f85092n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ kv.q f85093o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t tVar, kv.q qVar, zu.d dVar) {
        super(2, dVar);
        this.f85092n = tVar;
        this.f85093o = qVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        s0 s0Var = new s0(this.f85092n, this.f85093o, dVar);
        s0Var.f85091m = obj;
        return s0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Iterator<Object> it;
        Object next;
        v vVar = (v) this.f85091m;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f85090l;
        int i11 = 1;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            it = this.f85092n.iterator();
            if (it.hasNext()) {
                next = it.next();
                this.f85091m = vVar;
                this.f85087i = it;
                this.f85088j = next;
                this.f85090l = 1;
                if (vVar.yield(next, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            return tu.x0.f87415a;
        }
        if (i10 == 1) {
            next = this.f85088j;
            it = this.f85087i;
            tu.a0.throwOnFailure(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i12 = this.f85089k;
            Object obj2 = this.f85088j;
            it = this.f85087i;
            tu.a0.throwOnFailure(obj);
            i11 = i12;
            next = obj2;
        }
        while (it.hasNext()) {
            int i13 = i11 + 1;
            if (i11 < 0) {
                uu.p0.throwIndexOverflow();
            }
            Object objInvoke = this.f85093o.invoke(bv.b.boxInt(i11), next, it.next());
            this.f85091m = vVar;
            this.f85087i = it;
            this.f85088j = objInvoke;
            this.f85089k = i13;
            this.f85090l = 2;
            if (vVar.yield(objInvoke, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            next = objInvoke;
            i11 = i13;
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(v vVar, zu.d<? super tu.x0> dVar) {
        return ((s0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
