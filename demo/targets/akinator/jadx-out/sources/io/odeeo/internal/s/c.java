package io.odeeo.internal.s;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;
import tv.Mu.QpyI;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface c {

    /* renamed from: a, reason: collision with root package name */
    public static final c f66248a = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements c {
        @Override // io.odeeo.internal.s.c
        public b createDecoder(t tVar) {
            String str = tVar.f62971l;
            if (str != null) {
                switch (str) {
                    case "application/vnd.dvb.ait":
                        return new io.odeeo.internal.t.b();
                    case "application/x-icy":
                        return new io.odeeo.internal.w.a();
                    case "application/id3":
                        return new io.odeeo.internal.x.g();
                    case "application/x-emsg":
                        return new io.odeeo.internal.u.b();
                    case "application/x-scte35":
                        return new io.odeeo.internal.z.c();
                }
            }
            throw new IllegalArgumentException(a.b.k("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // io.odeeo.internal.s.c
        public boolean supportsFormat(t tVar) {
            String str = tVar.f62971l;
            return QpyI.TDdxBIWdbGM.equals(str) || MimeTypes.APPLICATION_EMSG.equals(str) || MimeTypes.APPLICATION_SCTE35.equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
        }
    }

    b createDecoder(t tVar);

    boolean supportsFormat(t tVar);
}
