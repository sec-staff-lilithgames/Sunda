package com.google.android.gms.ads.internal.client;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbir;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbwf;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzay extends zzba {
    final /* synthetic */ View zza;
    final /* synthetic */ HashMap zzb;
    final /* synthetic */ HashMap zzc;
    final /* synthetic */ zzaz zzd;

    public zzay(zzaz zzazVar, View view, HashMap map, HashMap map2) {
        this.zza = view;
        this.zzb = map;
        this.zzc = map2;
        Objects.requireNonNull(zzazVar);
        this.zzd = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza.getContext(), "native_ad_view_holder_delegate");
        return new zzfo();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        View view = this.zza;
        zzbeu.zza(view.getContext());
        if (!((Boolean) zzbd.zzc().zzd(zzbeu.zzlI)).booleanValue()) {
            zzaz zzazVar = this.zzd;
            return zzazVar.zzs().zza(this.zza, this.zzb, this.zzc);
        }
        try {
            return zzbir.zze(((zzbiv) com.google.android.gms.ads.internal.util.client.zzs.zza(view.getContext(), "com.google.android.gms.ads.ChimeraNativeAdViewHolderDelegateCreatorImpl", zzax.zza)).zze(ObjectWrapper.wrap(view), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(this.zzc)));
        } catch (RemoteException | com.google.android.gms.ads.internal.util.client.zzr | NullPointerException e10) {
            zzaz zzazVar2 = this.zzd;
            zzazVar2.zzu(zzbwf.zza(this.zza.getContext()));
            zzazVar2.zzt().zzh(e10, "ClientApiBroker.createNativeAdViewHolderDelegate");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        HashMap map = this.zzc;
        return zzcrVar.zzk(ObjectWrapper.wrap(this.zza), ObjectWrapper.wrap(this.zzb), ObjectWrapper.wrap(map));
    }
}
