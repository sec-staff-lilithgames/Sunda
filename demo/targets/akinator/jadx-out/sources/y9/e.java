package y9;

import y9.f;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class e extends bv.d {

    /* renamed from: i, reason: collision with root package name */
    public f.a f94168i;

    /* renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f94169j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ f.a f94170k;

    /* renamed from: l, reason: collision with root package name */
    public int f94171l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f.a aVar, zu.d dVar) {
        super(dVar);
        this.f94170k = aVar;
    }

    @Override // bv.a
    public final Object invokeSuspend(Object obj) {
        this.f94169j = obj;
        this.f94171l |= Integer.MIN_VALUE;
        return this.f94170k.execute(this);
    }
}
