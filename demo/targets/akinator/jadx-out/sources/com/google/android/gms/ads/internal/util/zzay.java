package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.zzapq;
import com.google.android.gms.internal.ads.zzapu;
import com.google.android.gms.internal.ads.zzapx;
import com.google.android.gms.internal.ads.zzaqd;
import com.google.android.gms.internal.ads.zzaqi;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzaqq;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbnv;
import com.google.android.gms.internal.ads.zzftx;
import java.io.File;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzay extends zzaqj {
    private final Context zzb;

    private zzay(Context context, zzaqi zzaqiVar) {
        super(zzaqiVar);
        this.zzb = context;
    }

    public static zzapx zzb(Context context) {
        zzapx zzapxVar = new zzapx(new zzaqq(new File(zzftx.zza().zza(context.getCacheDir(), "admob_volley")), 20971520), new zzay(context, new zzaqv(null, null)), 4);
        zzapxVar.zza();
        return zzapxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqj, com.google.android.gms.internal.ads.zzapn
    public final zzapq zza(zzapu zzapuVar) throws zzaqd {
        if (zzapuVar.zza() == 0) {
            if (Pattern.matches((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzeZ), zzapuVar.zzh())) {
                Context context = this.zzb;
                com.google.android.gms.ads.internal.client.zzbb.zza();
                if (com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 13400000)) {
                    zzapq zzapqVarZza = new zzbnv(context).zza(zzapuVar);
                    if (zzapqVarZza != null) {
                        zze.zza("Got gmscore asset response: ".concat(String.valueOf(zzapuVar.zzh())));
                        return zzapqVarZza;
                    }
                    zze.zza("Failed to get gmscore asset response: ".concat(String.valueOf(zzapuVar.zzh())));
                }
            }
        }
        return super.zza(zzapuVar);
    }
}
