package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzfto {
    final zzftr zza;
    final boolean zzb;

    private zzfto(zzftr zzftrVar) {
        this.zza = zzftrVar;
        this.zzb = zzftrVar != null;
    }

    public static zzfto zzb(Context context, String str, String str2) throws zzfsr {
        zzftr zzftpVar;
        try {
            try {
                try {
                    IBinder iBinderInstantiate = DynamiteModule.load(context, DynamiteModule.PREFER_REMOTE, ModuleDescriptor.MODULE_ID).instantiate("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderInstantiate == null) {
                        zzftpVar = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderInstantiate.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        zzftpVar = iInterfaceQueryLocalInterface instanceof zzftr ? (zzftr) iInterfaceQueryLocalInterface : new zzftp(iBinderInstantiate);
                    }
                    zzftpVar.zzj(ObjectWrapper.wrap(context), str, null);
                    Log.i("GASS", "GassClearcutLogger Initialized.");
                    return new zzfto(zzftpVar);
                } catch (RemoteException | zzfsr | NullPointerException | SecurityException unused) {
                    Log.d("GASS", "Cannot dynamite load clearcut");
                    return new zzfto(new zzfts());
                }
            } catch (Exception e10) {
                throw new zzfsr(e10);
            }
        } catch (Exception e11) {
            throw new zzfsr(e11);
        }
    }

    public static zzfto zzc() {
        zzfts zzftsVar = new zzfts();
        Log.d("GASS", "Clearcut logging disabled");
        return new zzfto(zzftsVar);
    }

    public final zzftn zza(byte[] bArr) {
        return new zzftn(this, bArr, null);
    }
}
