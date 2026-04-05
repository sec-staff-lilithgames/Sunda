package xn;

import android.media.MediaCodec;
import io.bidmachine.media3.common.util.a1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class r extends nn.f {

    /* renamed from: b, reason: collision with root package name */
    public final int f92110b;

    public r(Throwable th2, s sVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(sVar == null ? null : sVar.f92111a);
        super(sb2.toString(), th2);
        boolean z10 = th2 instanceof MediaCodec.CodecException;
        this.f92110b = a1.f60679a >= 23 ? z10 ? ((MediaCodec.CodecException) th2).getErrorCode() : 0 : a1.getErrorCodeFromPlatformDiagnosticsInfo(z10 ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null);
    }
}
