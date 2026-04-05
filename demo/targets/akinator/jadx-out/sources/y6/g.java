package y6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f94110i;

    /* renamed from: j, reason: collision with root package name */
    public int f94111j;

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f94110i = obj;
        this.f94111j |= Integer.MIN_VALUE;
        return i.access$awaitConstraintsNotMet(null, null, this);
    }
}
