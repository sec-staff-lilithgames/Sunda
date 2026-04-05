package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class h3 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public u1.c f53089i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53090j;

    /* renamed from: k, reason: collision with root package name */
    public int f53091k;

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53090j = obj;
        this.f53091k |= Integer.MIN_VALUE;
        return p3.access$awaitScrollEvent(null, this);
    }
}
