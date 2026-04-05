package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class u1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public String f54644i;

    /* renamed from: j, reason: collision with root package name */
    public p1 f54645j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f54646k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ v1 f54647l;

    /* renamed from: m, reason: collision with root package name */
    public int f54648m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(v1 v1Var, zu.d dVar) {
        super(dVar);
        this.f54647l = v1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f54646k = obj;
        this.f54648m |= Integer.MIN_VALUE;
        return v1.access$notifySubscribers(this.f54647l, null, null, this);
    }
}
