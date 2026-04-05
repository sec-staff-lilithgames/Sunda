package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class w2 extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public p5.a f77773i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f77774j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ j2 f77775k;

    /* renamed from: l, reason: collision with root package name */
    public int f77776l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(j2 j2Var, zu.d dVar) {
        super(dVar);
        this.f77775k = j2Var;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f77774j = obj;
        this.f77776l |= Integer.MIN_VALUE;
        return this.f77775k.syncTriggers$room_runtime_release(this);
    }
}
