package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzbq {
    private final zzbu zza;

    public zzbq(zzbu zzbuVar) {
        Preconditions.checkNotNull(zzbuVar);
        this.zza = zzbuVar;
    }

    public static String zzD(String str, Object obj, Object obj2, Object obj3) {
        String str2;
        String strZza = zza(obj);
        String strZza2 = zza(obj2);
        String strZza3 = zza(obj3);
        StringBuilder sb2 = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str2 = "";
        } else {
            sb2.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strZza)) {
            sb2.append(str2);
            sb2.append(strZza);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strZza2)) {
            str3 = str2;
        } else {
            sb2.append(str2);
            sb2.append(strZza2);
        }
        if (!TextUtils.isEmpty(strZza3)) {
            sb2.append(str3);
            sb2.append(strZza3);
        }
        return sb2.toString();
    }

    public static final boolean zzU() {
        return Log.isLoggable((String) zzeh.zzb.zzb(), 2);
    }

    private static String zza(Object obj) {
        return obj == null ? "" : obj instanceof String ? (String) obj : obj instanceof Boolean ? obj == Boolean.TRUE ? "true" : "false" : obj instanceof Throwable ? ((Throwable) obj).toString() : obj.toString();
    }

    private final void zzb(int i10, String str, Object obj, Object obj2, Object obj3) {
        zzbu zzbuVar = this.zza;
        zzeo zzeoVarZzn = zzbuVar != null ? zzbuVar.zzn() : null;
        if (zzeoVarZzn == null) {
            String str2 = (String) zzeh.zzb.zzb();
            if (Log.isLoggable(str2, i10)) {
                Log.println(i10, str2, zzD(str, obj, obj2, obj3));
                return;
            }
            return;
        }
        String str3 = (String) zzeh.zzb.zzb();
        if (Log.isLoggable(str3, i10)) {
            Log.println(i10, str3, zzD(str, obj, obj2, obj3));
        }
        if (i10 >= 5) {
            zzeoVarZzn.zze(i10, str, obj, obj2, obj3);
        }
    }

    public final zzeu zzA() {
        return this.zza.zzo();
    }

    public final zzfg zzB() {
        return this.zza.zzq();
    }

    public final Clock zzC() {
        return this.zza.zzr();
    }

    public final void zzE(String str) {
        zzb(3, str, null, null, null);
    }

    public final void zzF(String str, Object obj) {
        zzb(3, str, obj, null, null);
    }

    public final void zzG(String str, Object obj, Object obj2) {
        zzb(3, str, obj, obj2, null);
    }

    public final void zzH(String str, Object obj, Object obj2, Object obj3) {
        zzb(3, "POST compressed size, ratio %, url", obj, obj2, obj3);
    }

    public final void zzI(String str) {
        zzb(6, str, null, null, null);
    }

    public final void zzJ(String str, Object obj) {
        zzb(6, str, obj, null, null);
    }

    public final void zzK(String str, Object obj, Object obj2) {
        zzb(6, str, obj, obj2, null);
    }

    public final void zzL(String str) {
        zzb(4, str, null, null, null);
    }

    public final void zzM(String str, Object obj) {
        zzb(4, str, obj, null, null);
    }

    public final void zzN(String str) {
        zzb(2, str, null, null, null);
    }

    public final void zzO(String str, Object obj) {
        zzb(2, str, obj, null, null);
    }

    public final void zzP(String str, Object obj, Object obj2) {
        zzb(2, str, obj, obj2, null);
    }

    public final void zzQ(String str) {
        zzb(5, str, null, null, null);
    }

    public final void zzR(String str, Object obj) {
        zzb(5, str, obj, null, null);
    }

    public final void zzS(String str, Object obj, Object obj2) {
        zzb(5, str, obj, obj2, null);
    }

    public final void zzT(String str, Object obj, Object obj2, Object obj3) {
        zzb(5, "Deleted fewer hits then expected", obj, obj2, obj3);
    }

    public final Context zzo() {
        return this.zza.zza();
    }

    public final GoogleAnalytics zzp() {
        return this.zza.zzc();
    }

    public final com.google.android.gms.analytics.zzr zzq() {
        return this.zza.zzd();
    }

    public final zzbh zzr() {
        return this.zza.zze();
    }

    public final zzbp zzs() {
        return this.zza.zzf();
    }

    public final zzbu zzt() {
        return this.zza;
    }

    public final zzce zzu() {
        return this.zza.zzh();
    }

    public final zzcm zzv() {
        return this.zza.zzi();
    }

    public final zzcs zzw() {
        return this.zza.zzj();
    }

    public final zzcw zzx() {
        return this.zza.zzk();
    }

    public final zzcx zzy() {
        return this.zza.zzl();
    }

    public final zzeo zzz() {
        return this.zza.zzm();
    }
}
