package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.zzbgq;
import com.google.android.gms.internal.ads.zzcby;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzd {
    public static void zza(Context context) {
        int i10 = com.google.android.gms.ads.internal.util.client.zzl.zza;
        if (((Boolean) zzbgq.zza.zze()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                n1 n1VarZzb = new zzc(context).zzb();
                int i11 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                zzcby.zza(n1VarZzb, "AdDebugLogUpdater.updateEnablement");
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e10);
            }
        }
    }
}
