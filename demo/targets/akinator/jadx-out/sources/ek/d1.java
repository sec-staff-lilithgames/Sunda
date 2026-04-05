package ek;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class d1 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public b1 f54495i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f54496j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ b1 f54497k;

    /* renamed from: l, reason: collision with root package name */
    public int f54498l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(b1 b1Var, zu.d dVar) {
        super(dVar);
        this.f54497k = b1Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f54496j = obj;
        this.f54498l |= Integer.MIN_VALUE;
        return b1.access$shouldLogSession(this.f54497k, this);
    }
}
