package hp;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class e implements q {
    @Override // hp.q
    public s create(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        List list = bVar.f60668r;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new jp.a(list);
                case "application/pgs":
                    return new kp.a();
                case "application/x-mp4-vtt":
                    return new qp.a();
                case "text/vtt":
                    return new qp.h();
                case "application/x-quicktime-tx3g":
                    return new op.a(list);
                case "text/x-ssa":
                    return new lp.b(list);
                case "application/vobsub":
                    return new pp.a(list);
                case "application/x-subrip":
                    return new mp.a();
                case "application/ttml+xml":
                    return new np.d();
            }
        }
        throw new IllegalArgumentException(a.b.k("Unsupported MIME type: ", str));
    }

    @Override // hp.q
    public int getCueReplacementBehavior(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                case "application/pgs":
                case "application/x-mp4-vtt":
                    return 2;
                case "text/vtt":
                    return 1;
                case "application/x-quicktime-tx3g":
                    return 2;
                case "text/x-ssa":
                    return 1;
                case "application/vobsub":
                    return 2;
                case "application/x-subrip":
                case "application/ttml+xml":
                    return 1;
            }
        }
        throw new IllegalArgumentException(a.b.k("Unsupported MIME type: ", str));
    }

    @Override // hp.q
    public boolean supportsFormat(io.bidmachine.media3.common.b bVar) {
        String str = bVar.f60665o;
        return Objects.equals(str, MimeTypes.TEXT_SSA) || Objects.equals(str, MimeTypes.TEXT_VTT) || Objects.equals(str, MimeTypes.APPLICATION_MP4VTT) || Objects.equals(str, MimeTypes.APPLICATION_SUBRIP) || Objects.equals(str, MimeTypes.APPLICATION_TX3G) || Objects.equals(str, MimeTypes.APPLICATION_PGS) || Objects.equals(str, MimeTypes.APPLICATION_VOBSUB) || Objects.equals(str, MimeTypes.APPLICATION_DVBSUBS) || Objects.equals(str, MimeTypes.APPLICATION_TTML);
    }
}
