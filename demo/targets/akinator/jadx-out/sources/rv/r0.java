package rv;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class r0 extends bv.l implements kv.p {

    /* renamed from: i, reason: collision with root package name */
    public Iterator f85078i;

    /* renamed from: j, reason: collision with root package name */
    public Object f85079j;

    /* renamed from: k, reason: collision with root package name */
    public int f85080k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f85081l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ t f85082m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ kv.p f85083n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(t tVar, kv.p pVar, zu.d dVar) {
        super(2, dVar);
        this.f85082m = tVar;
        this.f85083n = pVar;
    }

    @Override // bv.a
    public final zu.d<tu.x0> create(Object obj, zu.d<?> dVar) {
        r0 r0Var = new r0(this.f85082m, this.f85083n, dVar);
        r0Var.f85081l = obj;
        return r0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        Object next;
        Iterator<Object> it;
        v vVar = (v) this.f85081l;
        Object coroutine_suspended = av.e.getCOROUTINE_SUSPENDED();
        int i10 = this.f85080k;
        if (i10 == 0) {
            tu.a0.throwOnFailure(obj);
            Iterator<Object> it2 = this.f85082m.iterator();
            if (it2.hasNext()) {
                next = it2.next();
                this.f85081l = vVar;
                this.f85078i = it2;
                this.f85079j = next;
                this.f85080k = 1;
                if (vVar.yield(next, this) != coroutine_suspended) {
                    it = it2;
                }
                return coroutine_suspended;
            }
            return tu.x0.f87415a;
        }
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        next = this.f85079j;
        it = this.f85078i;
        tu.a0.throwOnFailure(obj);
        while (it.hasNext()) {
            next = this.f85083n.invoke(next, it.next());
            this.f85081l = vVar;
            this.f85078i = it;
            this.f85079j = next;
            this.f85080k = 2;
            if (vVar.yield(next, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return tu.x0.f87415a;
    }

    @Override // kv.p
    public final Object invoke(v vVar, zu.d<? super tu.x0> dVar) {
        return ((r0) create(vVar, dVar)).invokeSuspend(tu.x0.f87415a);
    }
}
