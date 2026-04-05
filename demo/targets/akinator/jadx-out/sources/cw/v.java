package cw;

import ow.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class v extends d.AbstractC0758d {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f51228f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(i iVar, pw.k kVar, pw.j jVar) {
        super(true, kVar, jVar);
        this.f51228f = iVar;
    }

    @Override // ow.d.AbstractC0758d
    public void cancel() {
        this.f51228f.cancel();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f51228f.bodyComplete(-1L, true, true, null);
    }
}
