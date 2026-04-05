package p0;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u3 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public d2 f80506i;

    /* renamed from: j, reason: collision with root package name */
    public c3 f80507j;

    /* renamed from: k, reason: collision with root package name */
    public List f80508k;

    /* renamed from: l, reason: collision with root package name */
    public List f80509l;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ Object f80510m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ n3 f80511n;

    /* renamed from: o, reason: collision with root package name */
    public int f80512o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(n3 n3Var, zu.d dVar) {
        super(dVar);
        this.f80511n = n3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f80510m = obj;
        this.f80512o |= Integer.MIN_VALUE;
        return n3.access$runFrameLoop(this.f80511n, null, null, this);
    }
}
