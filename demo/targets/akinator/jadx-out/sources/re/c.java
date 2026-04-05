package re;

import com.google.android.exoplayer2.z0;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import we.h;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c implements d {
    @Override // re.d
    public b createDecoder(z0 z0Var) {
        String str = z0Var.f28802n;
        if (str != null) {
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new se.b();
                case "application/x-icy":
                    return new ve.a();
                case "application/id3":
                    return new h();
                case "application/x-emsg":
                    return new te.b();
                case "application/x-scte35":
                    return new ye.b();
            }
        }
        throw new IllegalArgumentException(a.b.k("Attempted to create decoder for unsupported MIME type: ", str));
    }

    @Override // re.d
    public boolean supportsFormat(z0 z0Var) {
        String str = z0Var.f28802n;
        return MimeTypes.APPLICATION_ID3.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }
}
