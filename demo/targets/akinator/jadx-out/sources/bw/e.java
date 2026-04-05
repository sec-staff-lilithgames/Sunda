package bw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class e extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f11361e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(String str, kv.a aVar) {
        super(str, false, 2, null);
        this.f11361e = aVar;
    }

    @Override // bw.a
    public long runOnce() {
        return ((Number) this.f11361e.invoke()).longValue();
    }
}
