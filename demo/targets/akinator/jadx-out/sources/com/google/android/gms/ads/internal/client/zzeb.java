package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzbal;
import com.google.android.gms.internal.ads.zzban;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzeb extends zzbal implements zzed {
    public zzeb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoController");
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zze() throws RemoteException {
        zzdf(1, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzf() throws RemoteException {
        zzdf(2, zza());
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzg(boolean z10) throws RemoteException {
        Parcel parcelZza = zza();
        int i10 = zzban.zza;
        parcelZza.writeInt(z10 ? 1 : 0);
        zzdf(3, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzh() throws RemoteException {
        Parcel parcelZzde = zzde(4, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final int zzi() throws RemoteException {
        Parcel parcelZzde = zzde(5, zza());
        int i10 = parcelZzde.readInt();
        parcelZzde.recycle();
        return i10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzj() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzk() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzl(zzeg zzegVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzban.zze(parcelZza, zzegVar);
        zzdf(8, parcelZza);
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final float zzm() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzn() throws RemoteException {
        Parcel parcelZzde = zzde(10, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final zzeg zzo() throws RemoteException {
        zzeg zzeeVar;
        Parcel parcelZzde = zzde(11, zza());
        IBinder strongBinder = parcelZzde.readStrongBinder();
        if (strongBinder == null) {
            zzeeVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
            zzeeVar = iInterfaceQueryLocalInterface instanceof zzeg ? (zzeg) iInterfaceQueryLocalInterface : new zzee(strongBinder);
        }
        parcelZzde.recycle();
        return zzeeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final boolean zzp() throws RemoteException {
        Parcel parcelZzde = zzde(12, zza());
        boolean zZza = zzban.zza(parcelZzde);
        parcelZzde.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzed
    public final void zzq() throws RemoteException {
        zzdf(13, zza());
    }
}
