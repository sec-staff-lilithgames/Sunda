package io.odeeo.internal.r;

import android.media.MediaCodec;
import io.odeeo.internal.q0.g0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class i extends io.odeeo.internal.e.f {

    /* renamed from: a, reason: collision with root package name */
    public final j f66054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f66055b;

    public i(Throwable th2, j jVar) {
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        sb2.append(jVar == null ? null : jVar.f66056a);
        super(sb2.toString(), th2);
        this.f66054a = jVar;
        this.f66055b = g0.f65861a >= 21 ? a(th2) : null;
    }

    public static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
