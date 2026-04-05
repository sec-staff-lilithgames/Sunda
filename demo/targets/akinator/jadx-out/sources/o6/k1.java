package o6;

import androidx.work.WorkerParameters;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class k1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public WorkerParameters f77935i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77936j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h1 f77937k;

    /* renamed from: l, reason: collision with root package name */
    public int f77938l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(h1 h1Var, zu.d dVar) {
        super(dVar);
        this.f77937k = h1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77936j = obj;
        this.f77938l |= Integer.MIN_VALUE;
        return h1.access$runWorker(this.f77937k, this);
    }
}
