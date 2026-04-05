package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import com.google.android.gms.internal.ads.zzdhh;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbl implements zzdhh {
    private final zzb zza;
    private final int zzb;
    private final String zzc;

    public zzbl(zzb zzbVar, int i10, String str) {
        this.zza = zzbVar;
        this.zzb = i10;
        this.zzc = str;
    }

    public final /* synthetic */ void zza(zzbj zzbjVar) throws JSONException {
        this.zza.zza(this.zzc, zzbjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zzd(final zzbj zzbjVar) {
        if (zzbjVar == null || this.zzb != 2 || TextUtils.isEmpty(this.zzc)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzs.zzh(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws JSONException {
                this.zza.zza(zzbjVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdhh
    public final void zze(String str) {
    }
}
