package eo;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import hp.j;
import hp.s;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements f {

    /* renamed from: b, reason: collision with root package name */
    public final hp.e f54796b = new hp.e();

    @Override // eo.f
    public j createDecoder(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        int i10 = bVar.J;
        if (str != null) {
            switch (str) {
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new ip.a(str, i10, 16000L);
                case "application/cea-708":
                    return new ip.b(i10, bVar.f60668r);
            }
        }
        hp.e eVar = this.f54796b;
        if (!eVar.supportsFormat(bVar)) {
            throw new IllegalArgumentException(a.b.k("Attempted to create decoder for unsupported MIME type: ", str));
        }
        s sVarCreate = eVar.create(bVar);
        return new b(sVarCreate.getClass().getSimpleName().concat("Decoder"), sVarCreate);
    }

    @Override // eo.f
    public boolean supportsFormat(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        return this.f54796b.supportsFormat(bVar) || Objects.equals(str, MimeTypes.APPLICATION_CEA608) || Objects.equals(str, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(str, MimeTypes.APPLICATION_CEA708);
    }
}
