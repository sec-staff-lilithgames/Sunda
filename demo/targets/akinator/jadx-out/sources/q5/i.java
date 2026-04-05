package q5;

import kotlin.jvm.internal.b1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f82425i;

    /* renamed from: j, reason: collision with root package name */
    public Object f82426j;

    /* renamed from: k, reason: collision with root package name */
    public q f82427k;

    /* renamed from: l, reason: collision with root package name */
    public b1 f82428l;

    /* renamed from: m, reason: collision with root package name */
    public zu.m f82429m;

    /* renamed from: n, reason: collision with root package name */
    public b1 f82430n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f82431o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ Object f82432p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ l f82433q;

    /* renamed from: r, reason: collision with root package name */
    public int f82434r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(l lVar, zu.d dVar) {
        super(dVar);
        this.f82433q = lVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f82432p = obj;
        this.f82434r |= Integer.MIN_VALUE;
        return this.f82433q.useConnection(false, null, this);
    }
}
