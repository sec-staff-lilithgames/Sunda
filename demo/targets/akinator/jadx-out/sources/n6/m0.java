package n6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f75765i;

    /* renamed from: j, reason: collision with root package name */
    public int f75766j;

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f75765i = obj;
        this.f75766j |= Integer.MIN_VALUE;
        return n0.await(null, this);
    }
}
