package com.google.android.gms.analytics;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbd;
import com.google.android.gms.internal.gtm.zzbh;
import com.google.android.gms.internal.gtm.zzbu;
import java.util.ListIterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zza extends zzk {
    private final zzbu zzb;
    private boolean zzc;

    public zza(zzbu zzbuVar) {
        super(zzbuVar.zzd(), zzbuVar.zzr());
        this.zzb = zzbuVar;
    }

    public final zzh zza() {
        zzh zzhVar = new zzh(this.zza);
        zzhVar.zzg(this.zzb.zzh().zza());
        zzhVar.zzg(this.zzb.zzk().zza());
        zzn(zzhVar);
        return zzhVar;
    }

    public final zzbu zzb() {
        return this.zzb;
    }

    public final void zzc(String str) {
        Preconditions.checkNotEmpty(str);
        zzh zzhVar = this.zza;
        Uri uriZza = zzb.zza(str);
        ListIterator listIterator = zzhVar.zzf().listIterator();
        while (listIterator.hasNext()) {
            if (uriZza.equals(((zzt) listIterator.next()).zzb())) {
                listIterator.remove();
            }
        }
        this.zza.zzf().add(new zzb(this.zzb, str));
    }

    public final void zzd(boolean z10) {
        this.zzc = z10;
    }

    @Override // com.google.android.gms.analytics.zzk
    public final void zze(zzh zzhVar) {
        zzbd zzbdVar = (zzbd) zzhVar.zzb(zzbd.class);
        if (TextUtils.isEmpty(zzbdVar.zze())) {
            zzbdVar.zzj(this.zzb.zzi().zzb());
        }
        if (this.zzc && TextUtils.isEmpty(zzbdVar.zzd())) {
            zzbh zzbhVarZze = this.zzb.zze();
            zzbdVar.zzi(zzbhVarZze.zza());
            zzbdVar.zzh(zzbhVarZze.zzb());
        }
    }
}
