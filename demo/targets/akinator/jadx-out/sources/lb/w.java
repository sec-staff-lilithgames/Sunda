package lb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class w extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public String f73014i;

    /* renamed from: j, reason: collision with root package name */
    public qb.j f73015j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f73016k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f73017l;

    /* renamed from: m, reason: collision with root package name */
    public int f73018m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(e eVar, zu.d dVar) {
        super(dVar);
        this.f73017l = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f73016k = obj;
        this.f73018m |= Integer.MIN_VALUE;
        return this.f73017l.getDuelPhotoAsync(null, this);
    }
}
