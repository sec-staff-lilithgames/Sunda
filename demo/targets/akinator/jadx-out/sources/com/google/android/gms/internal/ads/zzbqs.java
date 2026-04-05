package com.google.android.gms.internal.ads;

import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbqs implements zzbmn {
    final /* synthetic */ zzbqt zza;
    private final zzbpv zzb;
    private final zzcca zzc;

    public zzbqs(zzbqt zzbqtVar, zzbpv zzbpvVar, zzcca zzccaVar) {
        Objects.requireNonNull(zzbqtVar);
        this.zza = zzbqtVar;
        this.zzb = zzbpvVar;
        this.zzc = zzccaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zza(JSONObject jSONObject) {
        try {
            try {
                this.zzc.zzc(this.zza.zzd().zza(jSONObject));
            } catch (IllegalStateException unused) {
            } catch (JSONException e10) {
                this.zzc.zzd(e10);
            }
        } finally {
            this.zzb.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbmn
    public final void zzb(String str) {
        try {
            if (str == null) {
                this.zzc.zzd(new zzbqe());
            } else {
                this.zzc.zzd(new zzbqe(str));
            }
        } catch (IllegalStateException unused) {
        } catch (Throwable th2) {
            this.zzb.zza();
            throw th2;
        }
        this.zzb.zza();
    }
}
