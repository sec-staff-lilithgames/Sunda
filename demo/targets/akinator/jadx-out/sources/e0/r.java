package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public u1.c0 f53271i;

    /* renamed from: j, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f53272j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f53273k;

    /* renamed from: l, reason: collision with root package name */
    public int f53274l;

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53273k = obj;
        this.f53274l |= Integer.MIN_VALUE;
        return d1.access$awaitLongPressOrCancellation(null, null, this);
    }
}
