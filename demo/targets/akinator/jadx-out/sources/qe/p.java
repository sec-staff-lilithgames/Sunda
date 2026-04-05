package qe;

import android.media.MediaCodec;
import com.google.android.exoplayer2.util.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class p extends ce.g {

    /* renamed from: b, reason: collision with root package name */
    public final String f82849b;

    public p(Throwable th2, r rVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String diagnosticInfo = null;
        sb2.append(rVar == null ? null : rVar.f82850a);
        super(sb2.toString(), th2);
        if (n1.f28506a >= 21 && (th2 instanceof MediaCodec.CodecException)) {
            diagnosticInfo = ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        this.f82849b = diagnosticInfo;
    }
}
