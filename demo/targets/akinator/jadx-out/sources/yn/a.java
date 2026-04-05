package yn;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import yo.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class a implements b {
    @Override // yn.b
    public to.a createDecoder(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new uo.b();
                case "application/x-icy":
                    return new xo.a();
                case "application/id3":
                    return new h();
                case "application/x-emsg":
                    return new vo.b();
                case "application/x-scte35":
                    return new ap.c();
            }
        }
        throw new IllegalArgumentException(a.b.k("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // yn.b
    public boolean supportsFormat(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
