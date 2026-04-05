package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zza implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iValidateObjectHeader = SafeParcelReader.validateObjectHeader(parcel);
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        boolean z10 = false;
        String strCreateString = null;
        ArrayList<String> arrayListCreateStringList = null;
        String strCreateString2 = null;
        String strCreateString3 = null;
        String strCreateString4 = null;
        String strCreateString5 = null;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        float f10 = 0.0f;
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
                case 7:
                case 9:
                default:
                    SafeParcelReader.skipUnknownField(parcel, header);
                    break;
                case 4:
                    strCreateString = SafeParcelReader.createString(parcel, header);
                    break;
                case 5:
                    i12 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 6:
                    arrayListCreateStringList = SafeParcelReader.createStringList(parcel, header);
                    break;
                case 8:
                    j11 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 10:
                    strCreateString3 = SafeParcelReader.createString(parcel, header);
                    break;
                case 11:
                    i11 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 12:
                    strCreateString2 = SafeParcelReader.createString(parcel, header);
                    break;
                case 13:
                    strCreateString4 = SafeParcelReader.createString(parcel, header);
                    break;
                case 14:
                    i13 = SafeParcelReader.readInt(parcel, header);
                    break;
                case 15:
                    f10 = SafeParcelReader.readFloat(parcel, header);
                    break;
                case 16:
                    j12 = SafeParcelReader.readLong(parcel, header);
                    break;
                case 17:
                    strCreateString5 = SafeParcelReader.createString(parcel, header);
                    break;
                case 18:
                    z10 = SafeParcelReader.readBoolean(parcel, header);
                    break;
            }
        }
        SafeParcelReader.ensureAtEnd(parcel, iValidateObjectHeader);
        return new WakeLockEvent(i10, j10, i11, strCreateString, i12, arrayListCreateStringList, strCreateString2, j11, i13, strCreateString3, strCreateString4, f10, j12, strCreateString5, z10);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new WakeLockEvent[i10];
    }
}
