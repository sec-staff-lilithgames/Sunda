package m4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public f f74014i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f74015j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f f74016k;

    /* renamed from: l, reason: collision with root package name */
    public int f74017l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, zu.d dVar) {
        super(dVar);
        this.f74016k = fVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f74015j = obj;
        this.f74017l |= Integer.MIN_VALUE;
        return this.f74016k.shouldMigrate(null, this);
    }
}
