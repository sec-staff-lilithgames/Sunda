package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzdvi;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzad zzadVar, zzaa zzaaVar, boolean z10, zzdvi zzdviVar, String str, Bundle bundle) {
        if (z10) {
            return zzc(context, intent.getData(), zzadVar, zzaaVar, bundle);
        }
        try {
            String uri = intent.toURI();
            StringBuilder sb2 = new StringBuilder(String.valueOf(uri).length() + 21);
            sb2.append("Launching an intent: ");
            sb2.append(uri);
            com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzof)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzad(context, intent, zzdviVar, str);
            } else {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzZ(context, intent);
            }
            if (zzadVar != null) {
                zzadVar.zzl();
            }
            if (zzaaVar != null) {
                zzaaVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e10) {
            String message = e10.getMessage();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            if (zzaaVar != null) {
                zzaaVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzad zzadVar, zzaa zzaaVar, zzdvi zzdviVar, String str) throws NumberFormatException {
        int i10 = 0;
        if (zzcVar == null) {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("No intent data for launcher overlay.");
            return false;
        }
        zzbeu.zza(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzadVar, zzaaVar, zzcVar.zzj, zzdviVar, str, zzcVar.zzk);
        }
        Intent intent2 = new Intent();
        String str2 = zzcVar.zzb;
        if (TextUtils.isEmpty(str2)) {
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Open GMSG did not contain a URL.");
            return false;
        }
        String str3 = zzcVar.zzc;
        if (TextUtils.isEmpty(str3)) {
            intent2.setData(Uri.parse(str2));
        } else {
            intent2.setDataAndType(Uri.parse(str2), str3);
        }
        intent2.setAction("android.intent.action.VIEW");
        String str4 = zzcVar.zzd;
        if (!TextUtils.isEmpty(str4)) {
            intent2.setPackage(str4);
        }
        String str5 = zzcVar.zze;
        if (!TextUtils.isEmpty(str5)) {
            String[] strArrSplit = str5.split("/", 2);
            if (strArrSplit.length < 2) {
                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse component name from open GMSG: ".concat(str5));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str6 = zzcVar.zzf;
        if (!TextUtils.isEmpty(str6)) {
            try {
                i10 = Integer.parseInt(str6);
            } catch (NumberFormatException unused) {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not parse intent flags.");
            }
            intent2.addFlags(i10);
        }
        if (((Boolean) zzbd.zzc().zzd(zzbeu.zzff)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) zzbd.zzc().zzd(zzbeu.zzfe)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzs(context, intent2);
            }
        }
        return zza(context, intent2, zzadVar, zzaaVar, zzcVar.zzj, zzdviVar, str, zzcVar.zzk);
    }

    private static final boolean zzc(Context context, Uri uri, zzad zzadVar, zzaa zzaaVar, Bundle bundle) {
        int iZzp;
        try {
            iZzp = com.google.android.gms.ads.internal.zzt.zzc().zzp(context, uri, bundle);
            if (zzadVar != null) {
                zzadVar.zzl();
            }
        } catch (ActivityNotFoundException e10) {
            String message = e10.getMessage();
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            iZzp = 6;
        }
        if (zzaaVar != null) {
            zzaaVar.zzb(iZzp);
        }
        return iZzp == 5;
    }
}
