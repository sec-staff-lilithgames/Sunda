package com.google.android.gms.internal.ads;

import java.util.Locale;
import w0.i;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhs {
    public int zza;
    public int zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public int zzh;
    public int zzi;
    public int zzj;
    public long zzk;
    public int zzl;

    public final String toString() {
        int i10 = this.zza;
        int i11 = this.zzb;
        int i12 = this.zzc;
        int i13 = this.zzd;
        int i14 = this.zze;
        int i15 = this.zzf;
        int i16 = this.zzg;
        int i17 = this.zzh;
        int i18 = this.zzi;
        int i19 = this.zzj;
        long j10 = this.zzk;
        int i20 = this.zzl;
        String str = zzep.zza;
        Locale locale = Locale.US;
        StringBuilder sbF = i.f(i10, i11, "DecoderCounters {\n decoderInits=", ",\n decoderReleases=", "\n queuedInputBuffers=");
        a.b.x(i12, i13, "\n skippedInputBuffers=", "\n renderedOutputBuffers=", sbF);
        a.b.x(i14, i15, "\n skippedOutputBuffers=", "\n droppedBuffers=", sbF);
        a.b.x(i16, i17, "\n droppedInputBuffers=", "\n maxConsecutiveDroppedBuffers=", sbF);
        a.b.x(i18, i19, "\n droppedToKeyframeEvents=", "\n totalVideoFrameProcessingOffsetUs=", sbF);
        sbF.append(j10);
        sbF.append("\n videoFrameProcessingOffsetCount=");
        sbF.append(i20);
        sbF.append("\n}");
        return sbF.toString();
    }

    public final synchronized void zza() {
    }
}
