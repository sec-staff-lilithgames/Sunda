package com.google.android.gms.ads.internal.client;

import android.app.Activity;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbvh;
import com.google.android.gms.internal.ads.zzbvl;
import com.google.android.gms.internal.ads.zzbwf;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzac extends zzba {
    final /* synthetic */ Activity zza;
    final /* synthetic */ zzaz zzb;

    public zzac(zzaz zzazVar, Activity activity) {
        this.zza = activity;
        Objects.requireNonNull(zzazVar);
        this.zzb = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Activity activity = this.zza;
        zzbeu.zza(activity);
        if (!((Boolean) zzbd.zzc().zzd(zzbeu.zzlI)).booleanValue()) {
            zzaz zzazVar = this.zzb;
            return zzazVar.zzr().zza(this.zza);
        }
        try {
            return zzbvh.zzI(((zzbvl) com.google.android.gms.ads.internal.util.client.zzs.zza(activity, "com.google.android.gms.ads.ChimeraAdOverlayCreatorImpl", zzab.zza)).zze(ObjectWrapper.wrap(activity)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
            zzaz zzazVar2 = this.zzb;
            zzazVar2.zzu(zzbwf.zza(this.zza.getApplicationContext()));
            zzazVar2.zzt().zzh(e10, "ClientApiBroker.createAdOverlay");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        return zzcrVar.zzg(ObjectWrapper.wrap(this.zza));
    }
}
