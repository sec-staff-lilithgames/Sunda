package k4;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f70289i;

    /* renamed from: j, reason: collision with root package name */
    public p f70290j;

    /* renamed from: k, reason: collision with root package name */
    public CompletableDeferred f70291k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f70292l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p f70293m;

    /* renamed from: n, reason: collision with root package name */
    public int f70294n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(p pVar, zu.d dVar) {
        super(dVar);
        this.f70293m = pVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70292l = obj;
        this.f70294n |= Integer.MIN_VALUE;
        return p.access$handleUpdate(this.f70293m, null, this);
    }
}
