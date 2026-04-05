package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdxf extends zzbyq {
    final /* synthetic */ zzdxg zza;

    public zzdxf(zzdxg zzdxgVar) {
        Objects.requireNonNull(zzdxgVar);
        this.zza = zzdxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zze() throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzm(zzdxgVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzf() throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzo(zzdxgVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzg(zzbyl zzbylVar) throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzp(zzdxgVar.zzd(), zzbylVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzh(int i10) throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzn(zzdxgVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzi(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzn(zzdxgVar.zzd(), zzeVar.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzj() throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzq(zzdxgVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbyr
    public final void zzk() throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzr(zzdxgVar.zzd());
    }
}
