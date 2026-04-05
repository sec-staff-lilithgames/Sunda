package r5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class e extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public d f83789i;

    /* renamed from: j, reason: collision with root package name */
    public y5.c f83790j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f83791k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ d f83792l;

    /* renamed from: m, reason: collision with root package name */
    public int f83793m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(d dVar, zu.d dVar2) {
        super(dVar2);
        this.f83792l = dVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f83791k = obj;
        this.f83793m |= Integer.MIN_VALUE;
        return this.f83792l.a(null, null, this);
    }
}
