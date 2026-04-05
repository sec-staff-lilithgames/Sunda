package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzah> CREATOR = new zzai();
    public String zza;
    public String zzb;
    public zzpl zzc;
    public long zzd;
    public boolean zze;
    public String zzf;
    public final zzbg zzg;
    public long zzh;
    public zzbg zzi;
    public final long zzj;
    public final zzbg zzk;

    public zzah(zzah zzahVar) {
        Preconditions.checkNotNull(zzahVar);
        this.zza = zzahVar.zza;
        this.zzb = zzahVar.zzb;
        this.zzc = zzahVar.zzc;
        this.zzd = zzahVar.zzd;
        this.zze = zzahVar.zze;
        this.zzf = zzahVar.zzf;
        this.zzg = zzahVar.zzg;
        this.zzh = zzahVar.zzh;
        this.zzi = zzahVar.zzi;
        this.zzj = zzahVar.zzj;
        this.zzk = zzahVar.zzk;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 2, this.zza, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzb, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzc, i10, false);
        SafeParcelWriter.writeLong(parcel, 5, this.zzd);
        SafeParcelWriter.writeBoolean(parcel, 6, this.zze);
        SafeParcelWriter.writeString(parcel, 7, this.zzf, false);
        SafeParcelWriter.writeParcelable(parcel, 8, this.zzg, i10, false);
        SafeParcelWriter.writeLong(parcel, 9, this.zzh);
        SafeParcelWriter.writeParcelable(parcel, 10, this.zzi, i10, false);
        SafeParcelWriter.writeLong(parcel, 11, this.zzj);
        SafeParcelWriter.writeParcelable(parcel, 12, this.zzk, i10, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public zzah(String str, String str2, zzpl zzplVar, long j10, boolean z10, String str3, zzbg zzbgVar, long j11, zzbg zzbgVar2, long j12, zzbg zzbgVar3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzplVar;
        this.zzd = j10;
        this.zze = z10;
        this.zzf = str3;
        this.zzg = zzbgVar;
        this.zzh = j11;
        this.zzi = zzbgVar2;
        this.zzj = j12;
        this.zzk = zzbgVar3;
    }
}
