package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public kotlin.jvm.internal.y0 f53097i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53098j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ k f53099k;

    /* renamed from: l, reason: collision with root package name */
    public int f53100l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar, zu.d dVar) {
        super(dVar);
        this.f53099k = kVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53098j = obj;
        this.f53100l |= Integer.MIN_VALUE;
        return this.f53099k.performFling(null, 0.0f, this);
    }
}
