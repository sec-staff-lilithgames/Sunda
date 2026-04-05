package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzn implements Parcelable.Creator {
    public static void zza(GetServiceRequest getServiceRequest, Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getServiceRequest.zzc);
        SafeParcelWriter.writeInt(parcel, 2, getServiceRequest.zzd);
        SafeParcelWriter.writeInt(parcel, 3, getServiceRequest.zze);
        SafeParcelWriter.writeString(parcel, 4, getServiceRequest.zzf, false);
        SafeParcelWriter.writeIBinder(parcel, 5, getServiceRequest.zzg, false);
        SafeParcelWriter.writeTypedArray(parcel, 6, getServiceRequest.zzh, i10, false);
        SafeParcelWriter.writeBundle(parcel, 7, getServiceRequest.zzi, false);
        SafeParcelWriter.writeParcelable(parcel, 8, getServiceRequest.zzj, i10, false);
        SafeParcelWriter.writeTypedArray(parcel, 10, getServiceRequest.zzk, i10, false);
        SafeParcelWriter.writeTypedArray(parcel, 11, getServiceRequest.zzl, i10, false);
        SafeParcelWriter.writeBoolean(parcel, 12, getServiceRequest.zzm);
        SafeParcelWriter.writeInt(parcel, 13, getServiceRequest.zzn);
        SafeParcelWriter.writeBoolean(parcel, 14, getServiceRequest.zzo);
        SafeParcelWriter.writeString(parcel, 15, getServiceRequest.getAttributionTag(), false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        Scope[] scopeArr = GetServiceRequest.zza;
        Bundle bundle = new Bundle();
        Feature[] featureArr = GetServiceRequest.zzb;
        Feature[] featureArr2 = featureArr;
        String strCreateString = null;
        IBinder iBinder = null;
        Account account = null;
        String strCreateString2 = null;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z10 = false;
        int i13 = 0;
        boolean z11 = false;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 3:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    iBinder = SafeParcelReader.readIBinder(parcel, header);
                    break;
                case 6:
                    scopeArr = (Scope[]) SafeParcelReader.createTypedArray(parcel, header, Scope.CREATOR);
                    break;
                case 7:
                    bundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 8:
                    account = (Account) SafeParcelReader.createParcelable(parcel, header, Account.CREATOR);
                    break;
                case 9:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 10:
                    featureArr = (Feature[]) SafeParcelReader.createTypedArray(parcel, header, Feature.CREATOR);
                    break;
                case 11:
                    featureArr2 = (Feature[]) SafeParcelReader.createTypedArray(parcel, header, Feature.CREATOR);
                    break;
                case 12:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 13:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 14:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 15:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new GetServiceRequest(i10, i11, i12, strCreateString, iBinder, scopeArr, bundle, account, featureArr, featureArr2, z10, i13, z11, strCreateString2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new GetServiceRequest[i10];
    }
}
