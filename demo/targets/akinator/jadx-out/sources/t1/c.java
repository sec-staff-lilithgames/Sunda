package t1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class c extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ Object f86249i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ e f86250j;

    /* renamed from: k, reason: collision with root package name */
    public int f86251k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, zu.d dVar) {
        super(dVar);
        this.f86250j = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f86249i = obj;
        this.f86251k |= Integer.MIN_VALUE;
        return this.f86250j.m7015dispatchPostFlingRZ2iAVY(0L, 0L, this);
    }
}
