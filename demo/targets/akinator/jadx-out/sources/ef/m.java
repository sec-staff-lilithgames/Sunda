package ef;

import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class m implements n {
    @Override // ef.n
    public k createDecoder(z0 z0Var) {
        String str = z0Var.f28802n;
        int i10 = z0Var.F;
        List list = z0Var.f28804p;
        if (str != null) {
            switch (str) {
                case "application/dvbsubs":
                    return new gf.a(list);
                case "application/pgs":
                    return new hf.a();
                case "application/x-mp4-vtt":
                    return new of.a();
                case "text/vtt":
                    return new of.i();
                case "application/x-quicktime-tx3g":
                    return new nf.a(list);
                case "text/x-ssa":
                    return new kf.a(list);
                case "application/x-mp4-cea-608":
                case "application/cea-608":
                    return new ff.a(str, i10, 16000L);
                case "text/x-exoplayer-cues":
                    return new g();
                case "application/cea-708":
                    return new ff.b(i10, list);
                case "application/x-subrip":
                    return new lf.a();
                case "application/ttml+xml":
                    return new mf.d();
            }
        }
        throw new IllegalArgumentException(a.b.k("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // ef.n
    public boolean supportsFormat(z0 z0Var) {
        String str = z0Var.f28802n;
        return MimeTypes.TEXT_VTT.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || "text/x-exoplayer-cues".equals(str);
    }
}
