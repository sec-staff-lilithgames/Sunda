package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new zzs();
    public final long zzA;
    public final String zzB;
    public final String zzC;
    public final long zzD;
    public final int zzE;
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final long zze;
    public final long zzf;
    public final String zzg;
    public final boolean zzh;
    public final boolean zzi;
    public final long zzj;
    public final String zzk;
    public final long zzl;
    public final int zzm;
    public final boolean zzn;
    public final boolean zzo;
    public final Boolean zzp;
    public final long zzq;
    public final List zzr;
    public final String zzs;
    public final String zzt;
    public final String zzu;
    public final boolean zzv;
    public final long zzw;
    public final int zzx;
    public final String zzy;
    public final int zzz;

    public zzr(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        Preconditions.checkNotEmpty(str);
        this.zza = str;
        this.zzb = true == TextUtils.isEmpty(str2) ? null : str2;
        this.zzc = str3;
        this.zzj = j10;
        this.zzd = str4;
        this.zze = j11;
        this.zzf = j12;
        this.zzg = str5;
        this.zzh = z10;
        this.zzi = z11;
        this.zzk = str6;
        this.zzl = j13;
        this.zzm = i10;
        this.zzn = z12;
        this.zzo = z13;
        this.zzp = bool;
        this.zzq = j14;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z14;
        this.zzw = j15;
        this.zzx = i11;
        this.zzy = str10;
        this.zzz = i12;
        this.zzA = j16;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j17;
        this.zzE = i13;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, str, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 4, this.zzc, false);
        SafeParcelWriter.writeString(parcel, 5, this.zzd, false);
        SafeParcelWriter.writeLong(parcel, 6, this.zze);
        SafeParcelWriter.writeLong(parcel, 7, this.zzf);
        SafeParcelWriter.writeString(parcel, 8, this.zzg, false);
        SafeParcelWriter.writeBoolean(parcel, 9, this.zzh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zzi);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeString(parcel, 12, this.zzk, false);
        SafeParcelWriter.writeLong(parcel, 14, this.zzl);
        SafeParcelWriter.writeInt(parcel, 15, this.zzm);
        SafeParcelWriter.writeBoolean(parcel, 16, this.zzn);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.writeBooleanObject(parcel, 21, this.zzp, false);
        SafeParcelWriter.writeLong(parcel, 22, this.zzq);
        SafeParcelWriter.writeStringList(parcel, 23, this.zzr, false);
        SafeParcelWriter.writeString(parcel, 25, this.zzs, false);
        SafeParcelWriter.writeString(parcel, 26, this.zzt, false);
        SafeParcelWriter.writeString(parcel, 27, this.zzu, false);
        SafeParcelWriter.writeBoolean(parcel, 28, this.zzv);
        SafeParcelWriter.writeLong(parcel, 29, this.zzw);
        SafeParcelWriter.writeInt(parcel, 30, this.zzx);
        SafeParcelWriter.writeString(parcel, 31, this.zzy, false);
        SafeParcelWriter.writeInt(parcel, 32, this.zzz);
        SafeParcelWriter.writeLong(parcel, 34, this.zzA);
        SafeParcelWriter.writeString(parcel, 35, this.zzB, false);
        SafeParcelWriter.writeString(parcel, 36, this.zzC, false);
        SafeParcelWriter.writeLong(parcel, 37, this.zzD);
        SafeParcelWriter.writeInt(parcel, 38, this.zzE);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzr(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, Boolean bool, long j14, List list, String str7, String str8, String str9, boolean z14, long j15, int i11, String str10, int i12, long j16, String str11, String str12, long j17, int i13) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzj = j12;
        this.zzd = str4;
        this.zze = j10;
        this.zzf = j11;
        this.zzg = str5;
        this.zzh = z10;
        this.zzi = z11;
        this.zzk = str6;
        this.zzl = j13;
        this.zzm = i10;
        this.zzn = z12;
        this.zzo = z13;
        this.zzp = bool;
        this.zzq = j14;
        this.zzr = list;
        this.zzs = str7;
        this.zzt = str8;
        this.zzu = str9;
        this.zzv = z14;
        this.zzw = j15;
        this.zzx = i11;
        this.zzy = str10;
        this.zzz = i12;
        this.zzA = j16;
        this.zzB = str11;
        this.zzC = str12;
        this.zzD = j17;
        this.zzE = i13;
    }
}
