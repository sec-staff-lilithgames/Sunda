package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zztb extends Exception {
    public final String zza;
    public final boolean zzb;
    public final zzsy zzc;
    public final String zzd;

    public zztb(zzv zzvVar, Throwable th2, boolean z10, int i10) {
        String string = zzvVar.toString();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 25 + string.length());
        sb2.append("Decoder init failed: [");
        sb2.append(i10);
        sb2.append("], ");
        sb2.append(string);
        String string2 = sb2.toString();
        String str = zzvVar.zzo;
        int iAbs = Math.abs(i10);
        this(string2, th2, str, false, null, o2.l(iAbs, "androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_neg_", new StringBuilder(String.valueOf(iAbs).length() + 60)), null);
    }

    public final /* synthetic */ zztb zza(zztb zztbVar) {
        return new zztb(getMessage(), getCause(), this.zza, false, this.zzc, this.zzd, zztbVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zztb(zzv zzvVar, Throwable th2, boolean z10, zzsy zzsyVar) {
        String str = zzsyVar.zza;
        int length = str.length();
        String string = zzvVar.toString();
        this(o2.r(new StringBuilder(length + 23 + string.length()), "Decoder init failed: ", str, ", ", string), th2, zzvVar.zzo, false, zzsyVar, th2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) th2).getDiagnosticInfo() : null, null);
    }

    private zztb(String str, Throwable th2, String str2, boolean z10, zzsy zzsyVar, String str3, zztb zztbVar) {
        super(str, th2);
        this.zza = str2;
        this.zzb = false;
        this.zzc = zzsyVar;
        this.zzd = str3;
    }
}
