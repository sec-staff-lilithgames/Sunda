package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzaiy {
    public final zzajf zza;
    public final zzaji zzb;
    public final zzaem zzc;
    public final zzaen zzd;
    public int zze;
    public zzv zzf;

    public zzaiy(zzajf zzajfVar, zzaji zzajiVar, zzaem zzaemVar) {
        this.zza = zzajfVar;
        this.zzb = zzajiVar;
        this.zzc = zzaemVar;
        this.zzd = MimeTypes.AUDIO_TRUEHD.equals(zzajfVar.zzg.zzo) ? new zzaen() : null;
    }
}
