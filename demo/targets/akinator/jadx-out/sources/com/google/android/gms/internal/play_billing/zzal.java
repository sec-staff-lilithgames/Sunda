package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.ironsource.InterfaceC3129ae;
import io.bidmachine.protobuf.EventTypeExtended;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzal extends zzaq implements zzan {
    public zzal(IBinder iBinder) {
        super(iBinder, "com.android.vending.billing.IInAppBillingService");
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final int zza(int i10, String str, String str2) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(3);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        Parcel parcelZzv = zzv(5, parcelZzu);
        int i11 = parcelZzv.readInt();
        parcelZzv.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final int zzc(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzas.zzc(parcelZzu, bundle);
        Parcel parcelZzv = zzv(10, parcelZzu);
        int i11 = parcelZzv.readInt();
        parcelZzv.recycle();
        return i11;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzd(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(9);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzas.zzc(parcelZzu, bundle);
        Parcel parcelZzv = zzv(EventTypeExtended.EVENT_TYPE_EXTENDED_AD_UNIT_LOADED_VALUE, parcelZzu);
        Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zze(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(9);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzas.zzc(parcelZzu, bundle);
        Parcel parcelZzv = zzv(12, parcelZzu);
        Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzf(int i10, String str, String str2, String str3, String str4) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(3);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        parcelZzu.writeString(null);
        Parcel parcelZzv = zzv(3, parcelZzu);
        Bundle bundle = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzg(int i10, String str, String str2, String str3, String str4, Bundle bundle) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        parcelZzu.writeString(null);
        zzas.zzc(parcelZzu, bundle);
        Parcel parcelZzv = zzv(8, parcelZzu);
        Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzh(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(6);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        zzas.zzc(parcelZzu, bundle);
        Parcel parcelZzv = zzv(9, parcelZzu);
        Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzi(int i10, String str, String str2, String str3) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(3);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        Parcel parcelZzv = zzv(4, parcelZzu);
        Bundle bundle = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzj(int i10, String str, String str2, String str3, Bundle bundle) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        parcelZzu.writeString(str3);
        zzas.zzc(parcelZzu, bundle);
        Parcel parcelZzv = zzv(11, parcelZzu);
        Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzk(int i10, String str, String str2, Bundle bundle) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(3);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzas.zzc(parcelZzu, bundle);
        Parcel parcelZzv = zzv(2, parcelZzu);
        Bundle bundle2 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final Bundle zzl(int i10, String str, String str2, Bundle bundle, Bundle bundle2) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        zzas.zzc(parcelZzu, bundle);
        zzas.zzc(parcelZzu, bundle2);
        Parcel parcelZzv = zzv(EventTypeExtended.EVENT_TYPE_EXTENDED_WATERFALL_STARTED_VALUE, parcelZzu);
        Bundle bundle3 = (Bundle) zzas.zza(parcelZzv, Bundle.CREATOR);
        parcelZzv.recycle();
        return bundle3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzan
    public final void zzm(int i10, String str, Bundle bundle, zzy zzyVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(21);
        parcelZzu.writeString(str);
        zzas.zzc(parcelZzu, bundle);
        parcelZzu.writeStrongBinder(zzyVar);
        zzx(1501, parcelZzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzan
    public final void zzn(int i10, String str, Bundle bundle, zzaa zzaaVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(22);
        parcelZzu.writeString(str);
        zzas.zzc(parcelZzu, bundle);
        parcelZzu.writeStrongBinder(zzaaVar);
        zzx(1801, parcelZzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzan
    public final void zzo(int i10, String str, Bundle bundle, zzac zzacVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(21);
        parcelZzu.writeString(str);
        zzas.zzc(parcelZzu, bundle);
        parcelZzu.writeStrongBinder(zzacVar);
        zzx(1601, parcelZzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzan
    public final void zzp(int i10, String str, Bundle bundle, zzae zzaeVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(18);
        parcelZzu.writeString(str);
        zzas.zzc(parcelZzu, bundle);
        parcelZzu.writeStrongBinder(zzaeVar);
        zzw(InterfaceC3129ae.c.f35992e, parcelZzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzan
    public final void zzq(int i10, String str, Bundle bundle, zzag zzagVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(22);
        parcelZzu.writeString(str);
        zzas.zzc(parcelZzu, bundle);
        parcelZzu.writeStrongBinder(zzagVar);
        zzx(1901, parcelZzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzan
    public final void zzr(int i10, String str, Bundle bundle, zzai zzaiVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(21);
        parcelZzu.writeString(str);
        zzas.zzc(parcelZzu, bundle);
        parcelZzu.writeStrongBinder(zzaiVar);
        zzx(1401, parcelZzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzan
    public final void zzs(int i10, String str, Bundle bundle, zzak zzakVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(22);
        parcelZzu.writeString(str);
        zzas.zzc(parcelZzu, bundle);
        parcelZzu.writeStrongBinder(zzakVar);
        zzx(1701, parcelZzu);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzan
    public final void zzt(int i10, String str, Bundle bundle, zzap zzapVar) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(12);
        parcelZzu.writeString(str);
        zzas.zzc(parcelZzu, bundle);
        parcelZzu.writeStrongBinder(zzapVar);
        zzw(InterfaceC3129ae.a.f35977b, parcelZzu);
    }

    @Override // com.google.android.gms.internal.play_billing.zzan
    public final int zzy(int i10, String str, String str2) throws RemoteException {
        Parcel parcelZzu = zzu();
        parcelZzu.writeInt(i10);
        parcelZzu.writeString(str);
        parcelZzu.writeString(str2);
        Parcel parcelZzv = zzv(1, parcelZzu);
        int i11 = parcelZzv.readInt();
        parcelZzv.recycle();
        return i11;
    }
}
