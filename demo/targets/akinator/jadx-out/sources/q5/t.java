package q5;

import o5.g2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public r f82490i;

    /* renamed from: j, reason: collision with root package name */
    public g2 f82491j;

    /* renamed from: k, reason: collision with root package name */
    public n f82492k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f82493l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r f82494m;

    /* renamed from: n, reason: collision with root package name */
    public int f82495n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r rVar, zu.d dVar) {
        super(dVar);
        this.f82494m = rVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f82493l = obj;
        this.f82495n |= Integer.MIN_VALUE;
        return this.f82494m.a(null, this);
    }
}
