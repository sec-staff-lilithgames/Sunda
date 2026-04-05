package a2;

import kotlinx.coroutines.channels.ChannelIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class j0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public i0 f3658i;

    /* renamed from: j, reason: collision with root package name */
    public z.g f3659j;

    /* renamed from: k, reason: collision with root package name */
    public ChannelIterator f3660k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f3661l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i0 f3662m;

    /* renamed from: n, reason: collision with root package name */
    public int f3663n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(i0 i0Var, zu.d dVar) {
        super(dVar);
        this.f3662m = i0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f3661l = obj;
        this.f3663n |= Integer.MIN_VALUE;
        return this.f3662m.boundsUpdatesEventLoop(this);
    }
}
