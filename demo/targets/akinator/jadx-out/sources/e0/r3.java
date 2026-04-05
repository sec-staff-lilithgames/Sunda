package e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r3 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public long f53287i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f53288j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ s3 f53289k;

    /* renamed from: l, reason: collision with root package name */
    public int f53290l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(s3 s3Var, zu.d dVar) {
        super(dVar);
        this.f53289k = s3Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f53288j = obj;
        this.f53290l |= Integer.MIN_VALUE;
        return this.f53289k.mo24onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
