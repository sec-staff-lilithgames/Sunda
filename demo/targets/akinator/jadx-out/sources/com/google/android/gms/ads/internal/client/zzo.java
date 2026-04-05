package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzo implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z10 = false;
        int i12 = 0;
        boolean z11 = false;
        boolean z12 = false;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        Bundle bundleCreateBundle = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString = null;
        zzfx zzfxVar = null;
        Location location = null;
        String strCreateString2 = null;
        Bundle bundleCreateBundle2 = null;
        Bundle bundleCreateBundle3 = null;
        ArrayList<String> arrayListCreateStringList2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        zzc zzcVar = null;
        String strCreateString5 = null;
        ArrayList<String> arrayListCreateStringList3 = null;
        String strCreateString6 = null;
        while (parcel.dataPosition() < iValidateObjectHeader) {
            int header = SafeParcelReader.readHeader(parcel);
            switch (SafeParcelReader.getFieldId(header)) {
                case 1:
                    i10 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 2:
                    j10 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 3:
                    bundleCreateBundle = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 4:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 5:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 6:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 7:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 8:
                    z11 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 9:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 10:
                    zzfxVar = (zzfx) SafeParcelReader.createParcelable(parcel, header, zzfx.CREATOR);
                    break;
                case 11:
                    location = (Location) SafeParcelReader.createParcelable(parcel, header, Location.CREATOR);
                    break;
                case 12:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    bundleCreateBundle2 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 14:
                    bundleCreateBundle3 = SafeParcelReader.createBundle(parcel, header);
                    break;
                case 15:
                    arrayListCreateStringList2 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 16:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 17:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 18:
                    z12 = SafeParcelReader.readBoolean(parcel, header);
                    break;
                case 19:
                    zzcVar = (zzc) SafeParcelReader.createParcelable(parcel, header, zzc.CREATOR);
                    break;
                case 20:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 21:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 22:
                    arrayListCreateStringList3 = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 23:
                    i14 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 24:
                    strCreateString6 = SafeParcelReader.createString(parcel, header);
                    break;
                case 25:
                    i15 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 26:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 27:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new zzm(i10, j10, bundleCreateBundle, i11, arrayListCreateStringList, z10, i12, z11, strCreateString, zzfxVar, location, strCreateString2, bundleCreateBundle2, bundleCreateBundle3, arrayListCreateStringList2, strCreateString3, strCreateString4, z12, zzcVar, i13, strCreateString5, arrayListCreateStringList3, i14, strCreateString6, i15, j11, j12);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzm[i10];
    }
}
