package m2;

import kotlinx.coroutines.channels.ChannelIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class t0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public u0 f73962i;

    /* renamed from: j, reason: collision with root package name */
    public ChannelIterator f73963j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f73964k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ u0 f73965l;

    /* renamed from: m, reason: collision with root package name */
    public int f73966m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(u0 u0Var, zu.d dVar) {
        super(dVar);
        this.f73965l = u0Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f73964k = obj;
        this.f73966m |= Integer.MIN_VALUE;
        return this.f73965l.textInputCommandEventLoop(this);
    }
}
