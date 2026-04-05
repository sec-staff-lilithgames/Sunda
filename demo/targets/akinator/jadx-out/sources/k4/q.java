package k4;

import k4.p;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public p.b f70463i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f70464j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ p.b f70465k;

    /* renamed from: l, reason: collision with root package name */
    public int f70466l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p.b bVar, bv.d dVar) {
        super(dVar);
        this.f70465k = bVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70464j = obj;
        this.f70466l |= Integer.MIN_VALUE;
        return this.f70465k.a(this);
    }
}
