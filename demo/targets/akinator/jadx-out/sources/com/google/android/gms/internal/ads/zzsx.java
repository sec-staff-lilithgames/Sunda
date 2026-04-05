package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzsx extends zzhf {
    public final int zza;

    public zzsx(Throwable th2, zzsy zzsyVar) {
        int errorCode;
        super("Decoder failed: ".concat(String.valueOf(zzsyVar == null ? null : zzsyVar.zza)), th2);
        if (th2 instanceof MediaCodec.CodecException) {
            MediaCodec.CodecException codecException = (MediaCodec.CodecException) th2;
            codecException.getDiagnosticInfo();
            errorCode = codecException.getErrorCode();
        } else {
            errorCode = 0;
        }
        this.zza = errorCode;
    }
}
