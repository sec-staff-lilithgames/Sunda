package lb;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class j extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public e f72893i;

    /* renamed from: j, reason: collision with root package name */
    public long f72894j;

    /* renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f72895k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f72896l;

    /* renamed from: m, reason: collision with root package name */
    public int f72897m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(e eVar, zu.d dVar) {
        super(dVar);
        this.f72896l = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72895k = obj;
        this.f72897m |= Integer.MIN_VALUE;
        return this.f72896l.answerQuestionWithTagWithOptionalParamatersAsync(0, null, this);
    }
}
