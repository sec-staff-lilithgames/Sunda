package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdxj implements zzguf {
    final /* synthetic */ zzdxt zza;

    public zzdxj(zzdxt zzdxtVar) {
        Objects.requireNonNull(zzdxtVar);
        this.zza = zzdxtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final void zza(Throwable th2) {
        synchronized (this) {
            zzdxt zzdxtVar = this.zza;
            zzdxtVar.zzn(true);
            zzdxtVar.zzm("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzdxtVar.zzo()));
            zzdxtVar.zzp().zzd(new Exception());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzguf
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        final String str = (String) obj;
        synchronized (this) {
            zzdxt zzdxtVar = this.zza;
            zzdxtVar.zzn(true);
            zzdxtVar.zzm("com.google.android.gms.ads.MobileAds", true, "", (int) (com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzdxtVar.zzo()));
            zzdxtVar.zzq().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws JSONException {
                    this.zza.zza.zzl(str);
                }
            });
        }
    }
}
