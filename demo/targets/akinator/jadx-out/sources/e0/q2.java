package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f53261i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ s2 f53262j;

    /* renamed from: k, reason: collision with root package name */
    public int f53263k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(s2 s2Var, zu.d dVar) {
        super(dVar);
        this.f53262j = s2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53261i = obj;
        this.f53263k |= Integer.MIN_VALUE;
        return this.f53262j.awaitRelease(this);
    }
}
