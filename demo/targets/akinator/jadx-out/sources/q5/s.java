package q5;

import q5.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class s extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f82484i;

    /* renamed from: j, reason: collision with root package name */
    public r f82485j;

    /* renamed from: k, reason: collision with root package name */
    public n f82486k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f82487l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r.b f82488m;

    /* renamed from: n, reason: collision with root package name */
    public int f82489n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r.b bVar, zu.d dVar) {
        super(dVar);
        this.f82488m = bVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f82487l = obj;
        this.f82489n |= Integer.MIN_VALUE;
        return this.f82488m.rollback(null, this);
    }
}
