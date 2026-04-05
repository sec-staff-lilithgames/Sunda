package cw;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class x extends bw.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f51243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(w wVar, String str) {
        super(str, false, 2, null);
        this.f51243e = wVar;
    }

    @Override // bw.a
    public long runOnce() {
        return this.f51243e.closeConnections(System.nanoTime());
    }
}
