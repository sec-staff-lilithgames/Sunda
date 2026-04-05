package bw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class d extends a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kv.a f11360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, boolean z10, kv.a aVar) {
        super(str, z10);
        this.f11360e = aVar;
    }

    @Override // bw.a
    public long runOnce() {
        this.f11360e.invoke();
        return -1L;
    }
}
