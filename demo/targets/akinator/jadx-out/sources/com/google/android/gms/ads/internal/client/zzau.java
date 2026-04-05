package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbwf;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzau extends zzba {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzaz zzb;

    public zzau(zzaz zzazVar, Context context) {
        this.zza = context;
        Objects.requireNonNull(zzazVar);
        this.zzb = zzazVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zza() {
        zzaz.zzm(this.zza, "mobile_ads_settings");
        return new zzfm();
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzb() throws RemoteException {
        Context context = this.zza;
        zzbeu.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbeu.zzlI)).booleanValue()) {
            return this.zzb.zzp().zza(this.zza);
        }
        try {
            IBinder iBinderZze = ((zzdc) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraMobileAdsSettingManagerCreatorImpl", zzat.zza)).zze(ObjectWrapper.wrap(context), ModuleDescriptor.MODULE_VERSION);
            if (iBinderZze == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return iInterfaceQueryLocalInterface instanceof zzdb ? (zzdb) iInterfaceQueryLocalInterface : new zzcz(iBinderZze);
        } catch (RemoteException e10) {
            e = e10;
            zzaz zzazVar = this.zzb;
            zzazVar.zzu(zzbwf.zza(this.zza));
            zzazVar.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e11) {
            e = e11;
            zzaz zzazVar2 = this.zzb;
            zzazVar2.zzu(zzbwf.zza(this.zza));
            zzazVar2.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        } catch (NullPointerException e12) {
            e = e12;
            zzaz zzazVar22 = this.zzb;
            zzazVar22.zzu(zzbwf.zza(this.zza));
            zzazVar22.zzt().zzh(e, "ClientApiBroker.getMobileAdsSettingsManager");
            return null;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzba
    public final /* bridge */ /* synthetic */ Object zzc(zzcr zzcrVar) throws RemoteException {
        return zzcrVar.zzi(ObjectWrapper.wrap(this.zza), ModuleDescriptor.MODULE_VERSION);
    }
}
