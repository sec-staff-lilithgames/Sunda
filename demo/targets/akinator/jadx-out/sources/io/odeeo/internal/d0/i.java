package io.odeeo.internal.d0;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import io.odeeo.internal.b.t;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface i {

    /* renamed from: a, reason: collision with root package name */
    public static final i f63590a = new a();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements i {
        @Override // io.odeeo.internal.d0.i
        public g createDecoder(t tVar) {
            String str = tVar.f62971l;
            if (str != null) {
                switch (str) {
                    case "application/dvbsubs":
                        return new io.odeeo.internal.f0.a(tVar.f62973n);
                    case "application/pgs":
                        return new io.odeeo.internal.g0.a();
                    case "application/x-mp4-vtt":
                        return new io.odeeo.internal.m0.a();
                    case "text/vtt":
                        return new io.odeeo.internal.m0.g();
                    case "application/x-quicktime-tx3g":
                        return new io.odeeo.internal.l0.a(tVar.f62973n);
                    case "text/x-ssa":
                        return new io.odeeo.internal.i0.a(tVar.f62973n);
                    case "application/x-mp4-cea-608":
                    case "application/cea-608":
                        return new io.odeeo.internal.e0.a(str, tVar.D, 16000L);
                    case "text/x-exoplayer-cues":
                        return new d();
                    case "application/cea-708":
                        return new io.odeeo.internal.e0.b(tVar.D, tVar.f62973n);
                    case "application/x-subrip":
                        return new io.odeeo.internal.j0.a();
                    case "application/ttml+xml":
                        return new io.odeeo.internal.k0.c();
                }
            }
            throw new IllegalArgumentException(a.b.k("Attempted to create decoder for unsupported MIME type: ", str));
        }

        @Override // io.odeeo.internal.d0.i
        public boolean supportsFormat(t tVar) {
            String str = tVar.f62971l;
            return MimeTypes.TEXT_VTT.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || "text/x-exoplayer-cues".equals(str);
        }
    }

    g createDecoder(t tVar);

    boolean supportsFormat(t tVar);
}
