package k4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class r extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public Object f70488i;

    /* renamed from: j, reason: collision with root package name */
    public Object f70489j;

    /* renamed from: k, reason: collision with root package name */
    public Object f70490k;

    /* renamed from: l, reason: collision with root package name */
    public kotlin.jvm.internal.b1 f70491l;

    /* renamed from: m, reason: collision with root package name */
    public p f70492m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f70493n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ s f70494o;

    /* renamed from: p, reason: collision with root package name */
    public int f70495p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, zu.d dVar) {
        super(dVar);
        this.f70494o = sVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f70493n = obj;
        this.f70495p |= Integer.MIN_VALUE;
        return this.f70494o.updateData(null, this);
    }
}
