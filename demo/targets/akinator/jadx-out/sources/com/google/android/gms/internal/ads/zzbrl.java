package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public abstract class zzbrl extends zzbam implements zzbrm {
    public zzbrl() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbam
    public final boolean zzdi(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        zzbrp zzbrnVar;
        zzbrp zzbrnVar2;
        zzbrp zzbrnVar3;
        zzbrp zzbrnVar4;
        zzbrp zzbrnVar5;
        zzbrp zzbrnVar6;
        zzbrp zzbrnVar7;
        zzbrp zzbrnVar8;
        zzbrp zzbrnVar9 = null;
        switch (i10) {
            case 1:
                IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar = (com.google.android.gms.ads.internal.client.zzr) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string = parcel.readString();
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    zzbrnVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar = iInterfaceQueryLocalInterface instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface : new zzbrn(strongBinder);
                }
                zzban.zzh(parcel);
                zze(iObjectWrapperAsInterface, zzrVar, zzmVar, string, zzbrnVar);
                parcel2.writeNoException();
                return true;
            case 2:
                IObjectWrapper iObjectWrapperZzf = zzf();
                parcel2.writeNoException();
                zzban.zze(parcel2, iObjectWrapperZzf);
                return true;
            case 3:
                IObjectWrapper iObjectWrapperAsInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar2 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string2 = parcel.readString();
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    zzbrnVar2 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar2 = iInterfaceQueryLocalInterface2 instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface2 : new zzbrn(strongBinder2);
                }
                zzban.zzh(parcel);
                zzg(iObjectWrapperAsInterface2, zzmVar2, string2, zzbrnVar2);
                parcel2.writeNoException();
                return true;
            case 4:
                zzh();
                parcel2.writeNoException();
                return true;
            case 5:
                zzi();
                parcel2.writeNoException();
                return true;
            case 6:
                IObjectWrapper iObjectWrapperAsInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar2 = (com.google.android.gms.ads.internal.client.zzr) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar3 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 == null) {
                    zzbrnVar3 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar3 = iInterfaceQueryLocalInterface3 instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface3 : new zzbrn(strongBinder3);
                }
                zzban.zzh(parcel);
                zzj(iObjectWrapperAsInterface3, zzrVar2, zzmVar3, string3, string4, zzbrnVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                IObjectWrapper iObjectWrapperAsInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar4 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 == null) {
                    zzbrnVar4 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar4 = iInterfaceQueryLocalInterface4 instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface4 : new zzbrn(strongBinder4);
                }
                zzban.zzh(parcel);
                zzk(iObjectWrapperAsInterface4, zzmVar4, string5, string6, zzbrnVar4);
                parcel2.writeNoException();
                return true;
            case 8:
                zzl();
                parcel2.writeNoException();
                return true;
            case 9:
                zzm();
                parcel2.writeNoException();
                return true;
            case 10:
                IObjectWrapper iObjectWrapperAsInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar5 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string7 = parcel.readString();
                zzbyg zzbygVarZzb = zzbyf.zzb(parcel.readStrongBinder());
                String string8 = parcel.readString();
                zzban.zzh(parcel);
                zzn(iObjectWrapperAsInterface5, zzmVar5, string7, zzbygVarZzb, string8);
                parcel2.writeNoException();
                return true;
            case 11:
                com.google.android.gms.ads.internal.client.zzm zzmVar6 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string9 = parcel.readString();
                zzban.zzh(parcel);
                zzo(zzmVar6, string9);
                parcel2.writeNoException();
                return true;
            case 12:
                zzp();
                parcel2.writeNoException();
                return true;
            case 13:
                boolean zZzq = zzq();
                parcel2.writeNoException();
                int i12 = zzban.zza;
                parcel2.writeInt(zZzq ? 1 : 0);
                return true;
            case 14:
                IObjectWrapper iObjectWrapperAsInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar7 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 == null) {
                    zzbrnVar5 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar5 = iInterfaceQueryLocalInterface5 instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface5 : new zzbrn(strongBinder5);
                }
                zzbhx zzbhxVar = (zzbhx) zzban.zzb(parcel, zzbhx.CREATOR);
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                zzban.zzh(parcel);
                zzr(iObjectWrapperAsInterface6, zzmVar7, string10, string11, zzbrnVar5, zzbhxVar, arrayListCreateStringArrayList);
                parcel2.writeNoException();
                return true;
            case 15:
                parcel2.writeNoException();
                zzban.zze(parcel2, null);
                return true;
            case 16:
                parcel2.writeNoException();
                zzban.zze(parcel2, null);
                return true;
            case 17:
                Bundle bundleZzs = zzs();
                parcel2.writeNoException();
                zzban.zzd(parcel2, bundleZzs);
                return true;
            case 18:
                Bundle bundleZzt = zzt();
                parcel2.writeNoException();
                zzban.zzd(parcel2, bundleZzt);
                return true;
            case 19:
                Bundle bundleZzu = zzu();
                parcel2.writeNoException();
                zzban.zzd(parcel2, bundleZzu);
                return true;
            case 20:
                com.google.android.gms.ads.internal.client.zzm zzmVar8 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                zzban.zzh(parcel);
                zzv(zzmVar8, string12, string13);
                parcel2.writeNoException();
                return true;
            case 21:
                IObjectWrapper iObjectWrapperAsInterface7 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzw(iObjectWrapperAsInterface7);
                parcel2.writeNoException();
                return true;
            case 22:
                parcel2.writeNoException();
                int i13 = zzban.zza;
                parcel2.writeInt(0);
                return true;
            case 23:
                IObjectWrapper iObjectWrapperAsInterface8 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzbyg zzbygVarZzb2 = zzbyf.zzb(parcel.readStrongBinder());
                ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
                zzban.zzh(parcel);
                zzy(iObjectWrapperAsInterface8, zzbygVarZzb2, arrayListCreateStringArrayList2);
                parcel2.writeNoException();
                return true;
            case 24:
                zzbjc zzbjcVarZzz = zzz();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbjcVarZzz);
                return true;
            case 25:
                boolean zZza = zzban.zza(parcel);
                zzban.zzh(parcel);
                zzA(zZza);
                parcel2.writeNoException();
                return true;
            case 26:
                com.google.android.gms.ads.internal.client.zzed zzedVarZzB = zzB();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzedVarZzB);
                return true;
            case 27:
                zzbry zzbryVarZzC = zzC();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbryVarZzC);
                return true;
            case 28:
                IObjectWrapper iObjectWrapperAsInterface9 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar9 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string14 = parcel.readString();
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 == null) {
                    zzbrnVar6 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar6 = iInterfaceQueryLocalInterface6 instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface6 : new zzbrn(strongBinder6);
                }
                zzban.zzh(parcel);
                zzD(iObjectWrapperAsInterface9, zzmVar9, string14, zzbrnVar6);
                parcel2.writeNoException();
                return true;
            case 29:
            default:
                return false;
            case 30:
                IObjectWrapper iObjectWrapperAsInterface10 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzE(iObjectWrapperAsInterface10);
                parcel2.writeNoException();
                return true;
            case 31:
                IObjectWrapper iObjectWrapperAsInterface11 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzboa zzboaVarZzb = zzbnz.zzb(parcel.readStrongBinder());
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzbog.CREATOR);
                zzban.zzh(parcel);
                zzF(iObjectWrapperAsInterface11, zzboaVarZzb, arrayListCreateTypedArrayList);
                parcel2.writeNoException();
                return true;
            case 32:
                IObjectWrapper iObjectWrapperAsInterface12 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar10 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string15 = parcel.readString();
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 == null) {
                    zzbrnVar7 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar7 = iInterfaceQueryLocalInterface7 instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface7 : new zzbrn(strongBinder7);
                }
                zzban.zzh(parcel);
                zzG(iObjectWrapperAsInterface12, zzmVar10, string15, zzbrnVar7);
                parcel2.writeNoException();
                return true;
            case 33:
                zzbtx zzbtxVarZzH = zzH();
                parcel2.writeNoException();
                zzban.zzd(parcel2, zzbtxVarZzH);
                return true;
            case 34:
                zzbtx zzbtxVarZzI = zzI();
                parcel2.writeNoException();
                zzban.zzd(parcel2, zzbtxVarZzI);
                return true;
            case 35:
                IObjectWrapper iObjectWrapperAsInterface13 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = (com.google.android.gms.ads.internal.client.zzr) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzr.CREATOR);
                com.google.android.gms.ads.internal.client.zzm zzmVar11 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string16 = parcel.readString();
                String string17 = parcel.readString();
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 == null) {
                    zzbrnVar8 = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar8 = iInterfaceQueryLocalInterface8 instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface8 : new zzbrn(strongBinder8);
                }
                zzban.zzh(parcel);
                zzJ(iObjectWrapperAsInterface13, zzrVar3, zzmVar11, string16, string17, zzbrnVar8);
                parcel2.writeNoException();
                return true;
            case 36:
                zzbrs zzbrsVarZzK = zzK();
                parcel2.writeNoException();
                zzban.zze(parcel2, zzbrsVarZzK);
                return true;
            case 37:
                IObjectWrapper iObjectWrapperAsInterface14 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzL(iObjectWrapperAsInterface14);
                parcel2.writeNoException();
                return true;
            case 38:
                IObjectWrapper iObjectWrapperAsInterface15 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                com.google.android.gms.ads.internal.client.zzm zzmVar12 = (com.google.android.gms.ads.internal.client.zzm) zzban.zzb(parcel, com.google.android.gms.ads.internal.client.zzm.CREATOR);
                String string18 = parcel.readString();
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
                    zzbrnVar9 = iInterfaceQueryLocalInterface9 instanceof zzbrp ? (zzbrp) iInterfaceQueryLocalInterface9 : new zzbrn(strongBinder9);
                }
                zzban.zzh(parcel);
                zzM(iObjectWrapperAsInterface15, zzmVar12, string18, zzbrnVar9);
                parcel2.writeNoException();
                return true;
            case 39:
                IObjectWrapper iObjectWrapperAsInterface16 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                zzban.zzh(parcel);
                zzN(iObjectWrapperAsInterface16);
                parcel2.writeNoException();
                return true;
        }
    }
}
