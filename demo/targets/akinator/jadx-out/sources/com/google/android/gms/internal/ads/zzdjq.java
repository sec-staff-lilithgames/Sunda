package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzbdz;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzdjq implements zzcyo, zzdga {
    private final zzcac zza;
    private final Context zzb;
    private final zzcaf zzc;
    private final View zzd;
    private String zze;
    private final zzbdz.zza.EnumC0159zza zzf;

    public zzdjq(zzcac zzcacVar, Context context, zzcaf zzcafVar, View view, zzbdz.zza.EnumC0159zza enumC0159zza) {
        this.zza = zzcacVar;
        this.zzb = context;
        this.zzc = zzcafVar;
        this.zzd = view;
        this.zzf = enumC0159zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzd(zzbxv zzbxvVar, String str, String str2) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzcaf zzcafVar = this.zzc;
        Context context = this.zzb;
        if (zzcafVar.zza(context)) {
            try {
                zzcafVar.zzo(context, zzcafVar.zzj(context), this.zza.zzb(), zzbxvVar.zzb(), zzbxvVar.zzc());
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Remote Exception to get reward item.", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdx() {
        this.zza.zza(false);
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdy() throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        View view = this.zzd;
        if (view != null && this.zze != null) {
            this.zzc.zzg(view.getContext(), this.zze);
        }
        this.zza.zza(true);
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzh() {
        zzbdz.zza.EnumC0159zza enumC0159zza = this.zzf;
        if (enumC0159zza == zzbdz.zza.EnumC0159zza.APP_OPEN) {
            return;
        }
        String strZzf = this.zzc.zzf(this.zzb);
        this.zze = strZzf;
        this.zze = String.valueOf(strZzf).concat(enumC0159zza == zzbdz.zza.EnumC0159zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzdO() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzcyo
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzdga
    public final void zzg() {
    }
}
