package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.ads.zzbeu;
import com.google.android.gms.internal.ads.zzbgp;
import com.google.android.gms.internal.ads.zzbhd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzba {
    private static final zzcr zza;

    static {
        zzcr zzcpVar = null;
        try {
            Object objNewInstance = zzaz.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                zzcpVar = iInterfaceQueryLocalInterface instanceof zzcr ? (zzcr) iInterfaceQueryLocalInterface : new zzcp(iBinder);
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to instantiate ClientApi class.");
        }
        zza = zzcpVar;
    }

    private final Object zze() {
        zzcr zzcrVar = zza;
        if (zzcrVar == null) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return zzc(zzcrVar);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke local loader using ClientApi class.", e10);
            return null;
        }
    }

    private final Object zzf() {
        try {
            return zzb();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot invoke remote loader.", e10);
            return null;
        }
    }

    public abstract Object zza();

    public abstract Object zzb() throws RemoteException;

    public abstract Object zzc(zzcr zzcrVar) throws RemoteException;

    public final Object zzd(Context context, boolean z10) {
        boolean z11;
        Object objZze;
        if (!z10) {
            zzbb.zza();
            if (!com.google.android.gms.ads.internal.util.client.zzf.zzx(context, 12451000)) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Google Play Services is not available.");
                z10 = true;
            }
        }
        boolean z12 = false;
        boolean z13 = !(DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID));
        zzbeu.zza(context);
        if (((Boolean) zzbgp.zza.zze()).booleanValue()) {
            z11 = false;
        } else if (((Boolean) zzbgp.zzb.zze()).booleanValue()) {
            z11 = true;
            z12 = true;
        } else {
            z12 = z10 | z13;
            z11 = false;
        }
        if (z12) {
            objZze = zze();
            if (objZze == null && !z11) {
                objZze = zzf();
            }
        } else {
            Object objZzf = zzf();
            if (objZzf == null) {
                if (zzbb.zze().nextInt(((Long) zzbhd.zza.zze()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzbb.zza().zzh(context, zzbb.zzd().afmaVersion, "gmob-apps", bundle, true);
                }
            }
            objZze = objZzf == null ? zze() : objZzf;
        }
        return objZze == null ? zza() : objZze;
    }
}
