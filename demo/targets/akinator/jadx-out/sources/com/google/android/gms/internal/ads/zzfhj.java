package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfhj {
    private static zzfhj zza;
    private final Context zzb;
    private final com.google.android.gms.ads.internal.client.zzcy zzc;
    private final AtomicReference zzd = new AtomicReference();

    public zzfhj(Context context, com.google.android.gms.ads.internal.client.zzcy zzcyVar) {
        this.zzb = context;
        this.zzc = zzcyVar;
    }

    public static zzfhj zza(Context context) {
        synchronized (zzfhj.class) {
            try {
                zzfhj zzfhjVar = zza;
                if (zzfhjVar != null) {
                    return zzfhjVar;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) zzbgv.zzb.zze()).longValue();
                com.google.android.gms.ads.internal.client.zzcy zzcyVarZzf = null;
                if (jLongValue > 0 && jLongValue <= 253830000) {
                    zzcyVarZzf = zzf(applicationContext);
                }
                zzfhj zzfhjVar2 = new zzfhj(applicationContext, zzcyVarZzf);
                zza = zzfhjVar2;
                return zzfhjVar2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static com.google.android.gms.ads.internal.client.zzcy zzf(Context context) {
        try {
            return com.google.android.gms.ads.internal.client.zzcx.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to retrieve lite SDK info.", e10);
            return null;
        }
    }

    private final com.google.android.gms.ads.internal.client.zzfc zzg() {
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar != null) {
            try {
                return zzcyVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }

    public final VersionInfoParcel zzb(int i10, boolean z10, int i11) {
        com.google.android.gms.ads.internal.client.zzfc zzfcVarZzg;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzI = com.google.android.gms.ads.internal.util.zzs.zzI(this.zzb);
        VersionInfoParcel versionInfoParcel = new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, i11, true, zZzI);
        return (((Boolean) zzbgv.zzc.zze()).booleanValue() && (zzfcVarZzg = zzg()) != null) ? new VersionInfoParcel(ModuleDescriptor.MODULE_VERSION, zzfcVarZzg.zza(), true, zZzI) : versionInfoParcel;
    }

    public final void zzc(zzbrj zzbrjVar) {
        zzbrj adapterCreator;
        if (!((Boolean) zzbgv.zza.zze()).booleanValue()) {
            AtomicReference atomicReference = this.zzd;
            while (!atomicReference.compareAndSet(null, zzbrjVar) && atomicReference.get() == null) {
            }
            return;
        }
        com.google.android.gms.ads.internal.client.zzcy zzcyVar = this.zzc;
        if (zzcyVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzcyVar.getAdapterCreator();
            } catch (RemoteException unused) {
            }
        }
        AtomicReference atomicReference2 = this.zzd;
        if (adapterCreator == null) {
            adapterCreator = zzbrjVar;
        }
        while (!atomicReference2.compareAndSet(null, adapterCreator) && atomicReference2.get() == null) {
        }
    }

    public final zzbrj zzd() {
        return (zzbrj) this.zzd.get();
    }

    public final String zze() {
        com.google.android.gms.ads.internal.client.zzfc zzfcVarZzg = zzg();
        if (zzfcVarZzg != null) {
            return zzfcVarZzg.zzb();
        }
        return null;
    }
}
