package cw;

import cw.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class y extends bw.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f51244e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w.a f51245f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(w wVar, w.a aVar, String str) {
        super(str, false, 2, null);
        this.f51244e = wVar;
        this.f51245f = aVar;
    }

    @Override // bw.a
    public long runOnce() {
        return w.access$openConnections(this.f51244e, this.f51245f);
    }
}
