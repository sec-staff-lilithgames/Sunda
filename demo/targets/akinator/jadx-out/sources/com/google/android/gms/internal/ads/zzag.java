package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import j1.o2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzag {
    public final Uri zza;
    public final String zzb;
    public final zzad zzc;
    public final zzy zzd;
    public final List zze;
    public final String zzf;
    public final zzgpe zzg;
    public final Object zzh;
    public final long zzi;

    static {
        String str = zzep.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(7, 36);
    }

    public /* synthetic */ zzag(Uri uri, String str, zzad zzadVar, zzy zzyVar, List list, String str2, zzgpe zzgpeVar, Object obj, long j10, byte[] bArr) {
        this.zza = uri;
        int i10 = zzas.zza;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = list;
        this.zzf = null;
        this.zzg = zzgpeVar;
        int i11 = zzgpe.zzd;
        zzgpb zzgpbVar = new zzgpb();
        if (zzgpeVar.size() > 0) {
            throw null;
        }
        zzgpbVar.zzi();
        this.zzh = null;
        this.zzi = C.TIME_UNSET;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzag)) {
            return false;
        }
        zzag zzagVar = (zzag) obj;
        return this.zza.equals(zzagVar.zza) && this.zze.equals(zzagVar.zze) && this.zzg.equals(zzagVar.zzg);
    }

    public final int hashCode() {
        return (int) (((this.zzg.hashCode() + o2.c(this.zza.hashCode() * 923521, 961, this.zze)) * 31 * 31) + C.TIME_UNSET);
    }
}
