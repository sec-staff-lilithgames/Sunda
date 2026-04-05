package vn;

import go.b0;
import io.bidmachine.media3.common.StreamKey;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements k {

    /* renamed from: a, reason: collision with root package name */
    public final k f89365a;

    /* renamed from: b, reason: collision with root package name */
    public final List f89366b;

    public e(k kVar, List<StreamKey> list) {
        this.f89365a = kVar;
        this.f89366b = list;
    }

    @Override // vn.k
    public b0 createPlaylistParser() {
        return new zn.q(this.f89365a.createPlaylistParser(), this.f89366b);
    }

    @Override // vn.k
    public b0 createPlaylistParser(h hVar, f fVar) {
        return new zn.q(this.f89365a.createPlaylistParser(hVar, fVar), this.f89366b);
    }
}
