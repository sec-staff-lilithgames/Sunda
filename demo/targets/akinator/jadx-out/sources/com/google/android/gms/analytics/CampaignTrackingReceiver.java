package com.google.android.gms.analytics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzbu;
import com.google.android.gms.internal.gtm.zzcs;
import com.google.android.gms.internal.gtm.zzeo;
import com.google.android.gms.internal.gtm.zzff;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class CampaignTrackingReceiver extends BroadcastReceiver {
    static Boolean zza;

    public static boolean zzb(Context context) throws PackageManager.NameNotFoundException {
        Preconditions.checkNotNull(context);
        Boolean bool = zza;
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean zZzi = zzff.zzi(context, "com.google.android.gms.analytics.CampaignTrackingReceiver", true);
        zza = Boolean.valueOf(zZzi);
        return zZzi;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        zzbu zzbuVarZzg = zzbu.zzg(context);
        zzeo zzeoVarZzm = zzbuVarZzg.zzm();
        if (intent == null) {
            zzeoVarZzm.zzQ("CampaignTrackingReceiver received null intent");
            return;
        }
        String stringExtra = intent.getStringExtra("referrer");
        String action = intent.getAction();
        zzeoVarZzm.zzO("CampaignTrackingReceiver received", action);
        if (!"com.android.vending.INSTALL_REFERRER".equals(action) || TextUtils.isEmpty(stringExtra)) {
            zzeoVarZzm.zzQ("CampaignTrackingReceiver received unexpected intent without referrer extra");
            return;
        }
        zza(context, stringExtra);
        zzbuVarZzg.zzj();
        zzbuVarZzg.zzj();
        int iZzf = zzcs.zzf();
        if (stringExtra.length() > iZzf) {
            zzeoVarZzm.zzS("Campaign data exceed the maximum supported size and will be clipped. size, limit", Integer.valueOf(stringExtra.length()), Integer.valueOf(iZzf));
            stringExtra = stringExtra.substring(0, iZzf);
        }
        zzbuVarZzg.zzf().zzf(stringExtra, new zzc(this, goAsync()));
    }

    public void zza(Context context, String str) {
    }
}
