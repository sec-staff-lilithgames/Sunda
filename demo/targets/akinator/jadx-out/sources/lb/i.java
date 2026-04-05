package lb;

import lb.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class i extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public e f72882i;

    /* renamed from: j, reason: collision with root package name */
    public e.i f72883j;

    /* renamed from: k, reason: collision with root package name */
    public long f72884k;

    /* renamed from: l, reason: collision with root package name */
    public /* synthetic */ Object f72885l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ e f72886m;

    /* renamed from: n, reason: collision with root package name */
    public int f72887n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(e eVar, zu.d dVar) {
        super(dVar);
        this.f72886m = eVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f72885l = obj;
        this.f72887n |= Integer.MIN_VALUE;
        return this.f72886m.answerQuestionWithTagAsync(0, null, this);
    }
}
