package ik;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class x extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f59726i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ z f59727j;

    /* renamed from: k, reason: collision with root package name */
    public int f59728k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(z zVar, zu.d dVar) {
        super(dVar);
        this.f59727j = zVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f59726i = obj;
        this.f59728k |= Integer.MIN_VALUE;
        return this.f59727j.updateConfigs(null, this);
    }
}
