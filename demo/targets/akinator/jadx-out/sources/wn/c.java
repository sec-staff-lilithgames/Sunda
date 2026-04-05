package wn;

import gn.x0;
import io.bidmachine.media3.common.util.a1;
import io.bidmachine.media3.exoplayer.u1;
import sn.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class c implements e {

    /* renamed from: b, reason: collision with root package name */
    public final b f90748b;

    public c() {
        this.f90748b = new t(14);
    }

    @Override // wn.e
    public int supportsFormat(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        return (str == null || !x0.isImage(str)) ? u1.create(0) : a1.isBitmapFactorySupportedMimeType(bVar.f60665o) ? u1.create(4) : u1.create(1);
    }

    @Override // wn.e
    public d createImageDecoder() {
        return new d(this.f90748b);
    }

    public c(b bVar) {
        this.f90748b = bVar;
    }
}
