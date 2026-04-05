package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbrj;
import com.google.android.gms.internal.ads.zzbwf;
import com.google.android.gms.internal.ads.zzbwh;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzk extends RemoteCreator {
    private zzbwh zza;

    public zzk() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    @Override // com.google.android.gms.dynamic.RemoteCreator
    public final /* synthetic */ Object getRemoteCreator(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return iInterfaceQueryLocalInterface instanceof zzby ? (zzby) iInterfaceQueryLocalInterface : new zzby(iBinder);
    }

    public final zzbx zza(Context context, zzr zzrVar, String str, zzbrj zzbrjVar, int i10) {
        zzbeu.zza(context);
        if (!((Boolean) zzbd.zzc().zzd(zzbeu.zzlI)).booleanValue()) {
            try {
                IBinder iBinderZze = ((zzby) getRemoteCreatorInstance(context)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbrjVar, ModuleDescriptor.MODULE_VERSION, i10);
                if (iBinderZze == null) {
                    return null;
                }
                IInterface iInterfaceQueryLocalInterface = iBinderZze.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return iInterfaceQueryLocalInterface instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface : new zzbv(iBinderZze);
            } catch (RemoteException e10) {
                e = e10;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            } catch (RemoteCreator.RemoteCreatorException e11) {
                e = e11;
                com.google.android.gms.ads.internal.util.client.zzo.zze("Could not create remote AdManager.", e);
                return null;
            }
        }
        try {
            IBinder iBinderZze2 = ((zzby) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", zzj.zza)).zze(ObjectWrapper.wrap(context), zzrVar, str, zzbrjVar, ModuleDescriptor.MODULE_VERSION, i10);
            if (iBinderZze2 == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface2 = iBinderZze2.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            return iInterfaceQueryLocalInterface2 instanceof zzbx ? (zzbx) iInterfaceQueryLocalInterface2 : new zzbv(iBinderZze2);
        } catch (RemoteException e12) {
            e = e12;
            Throwable th2 = e;
            zzbwh zzbwhVarZza = zzbwf.zza(context);
            this.zza = zzbwhVarZza;
            zzbwhVarZza.zzh(th2, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th2);
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e13) {
            e = e13;
            Throwable th22 = e;
            zzbwh zzbwhVarZza2 = zzbwf.zza(context);
            this.zza = zzbwhVarZza2;
            zzbwhVarZza2.zzh(th22, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th22);
            return null;
        } catch (NullPointerException e14) {
            e = e14;
            Throwable th222 = e;
            zzbwh zzbwhVarZza22 = zzbwf.zza(context);
            this.zza = zzbwhVarZza22;
            zzbwhVarZza22.zzh(th222, "AdManagerCreator.newAdManagerByDynamiteLoader");
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", th222);
            return null;
        }
    }
}
