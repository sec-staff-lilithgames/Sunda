package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Objects;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzdxe extends zzbyu {
    final /* synthetic */ zzdxg zza;

    public zzdxe(zzdxg zzdxgVar) {
        Objects.requireNonNull(zzdxgVar);
        this.zza = zzdxgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zze() throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzk(zzdxgVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzf(int i10) throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzl(zzdxgVar.zzd(), i10);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException, RemoteException {
        zzdxg zzdxgVar = this.zza;
        zzdxgVar.zze().zzl(zzdxgVar.zzd(), zzeVar.zza);
    }
}
