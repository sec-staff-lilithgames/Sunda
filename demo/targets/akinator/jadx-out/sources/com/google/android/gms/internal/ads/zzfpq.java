package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Date;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfpq implements zzfpt {
    private static final zzfpq zza = new zzfpq(new zzfpu());
    private Date zzb;
    private boolean zzc;
    private final zzfpu zzd;
    private boolean zze;

    private zzfpq(zzfpu zzfpuVar) {
        this.zzd = zzfpuVar;
    }

    public static zzfpq zza() {
        return zza;
    }

    public final Date zzb() {
        Date date = this.zzb;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public final void zzc(Context context) {
        if (this.zzc) {
            return;
        }
        zzfpu zzfpuVar = this.zzd;
        zzfpuVar.zzd(context);
        zzfpuVar.zzg(this);
        zzfpuVar.zze();
        this.zze = zzfpuVar.zza;
        this.zzc = true;
    }

    @Override // com.google.android.gms.internal.ads.zzfpt
    public final void zzd(boolean z10) {
        if (!this.zze && z10) {
            Date date = new Date();
            Date date2 = this.zzb;
            if (date2 == null || date.after(date2)) {
                this.zzb = date;
                if (this.zzc) {
                    Iterator it = zzfps.zza().zzf().iterator();
                    while (it.hasNext()) {
                        ((zzfoy) it.next()).zzg().zzn(zzb());
                    }
                }
            }
        }
        this.zze = z10;
    }
}
