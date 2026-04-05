package e0;

import kotlinx.coroutines.CoroutineScope;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public h1 f53028i;

    /* renamed from: j, reason: collision with root package name */
    public CoroutineScope f53029j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f53030k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ h1 f53031l;

    /* renamed from: m, reason: collision with root package name */
    public int f53032m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(h1 h1Var, zu.d dVar) {
        super(dVar);
        this.f53031l = h1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53030k = obj;
        this.f53032m |= Integer.MIN_VALUE;
        return this.f53031l.processDragCancel(null, this);
    }
}
