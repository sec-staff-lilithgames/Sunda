package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbkq implements zzblx {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z]([a-zA-Z0-9]|:|-|_)*$");
    private static final Pattern zzb = Pattern.compile("^[0-9]*(,[0-9]*)*$");

    @Override // com.google.android.gms.internal.ads.zzblx
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws NumberFormatException {
        zzcgy zzcgyVar = (zzcgy) obj;
        String str = (String) map.get("action");
        if ("tick".equals(str)) {
            String str2 = (String) map.get("label");
            String str3 = (String) map.get("start_label");
            String str4 = (String) map.get("timestamp");
            if (TextUtils.isEmpty(str2)) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No label given for CSI tick.");
                return;
            }
            zzbel zzbelVar = zzbeu.zzcr;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() && !zza.matcher(str2).matches()) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                return;
            }
            if (TextUtils.isEmpty(str4)) {
                int i12 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No timestamp given for CSI tick.");
                return;
            }
            try {
                long j10 = (Long.parseLong(str4) - com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis()) + com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                if (true == TextUtils.isEmpty(str3)) {
                    str3 = "native:view_load";
                }
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbelVar)).booleanValue() || zza.matcher(str3).matches()) {
                    zzcgyVar.zzq().zzb(str2, str3, j10);
                    return;
                } else {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid start label given for CSI tick. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
                    return;
                }
            } catch (NumberFormatException e10) {
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Malformed timestamp for CSI tick.", e10);
                return;
            }
        }
        if ("experiment".equals(str)) {
            String str5 = (String) map.get("value");
            if (TextUtils.isEmpty(str5)) {
                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No value given for CSI experiment.");
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcr)).booleanValue() || zzb.matcher(str5).matches()) {
                zzcgyVar.zzq().zzc().zzd("e", str5);
                return;
            } else {
                int i16 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid value given for CSI experiment. Should be a comma separated list of numbers.");
                return;
            }
        }
        if ("extra".equals(str)) {
            String str6 = (String) map.get("name");
            String str7 = (String) map.get("value");
            if (TextUtils.isEmpty(str7)) {
                int i17 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No value given for CSI extra.");
                return;
            }
            if (TextUtils.isEmpty(str6)) {
                int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("No name given for CSI extra.");
                return;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbeu.zzcr)).booleanValue() || zza.matcher(str6).matches()) {
                zzcgyVar.zzq().zzc().zzd(str6, str7);
            } else {
                int i19 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Invalid name given for CSI extra. Should start with a letter and only alphanumerics, :, -, _ are allowed.");
            }
        }
    }
}
