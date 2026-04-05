package com.google.android.gms.common.stats;

import a.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* loaded from: classes6.dex */
public final class WakeLockEvent extends StatsEvent {
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new zza();
    final int zza;
    private final long zzb;
    private final int zzc;
    private final String zzd;
    private final String zze;
    private final String zzf;
    private final int zzg;
    private final List zzh;
    private final String zzi;
    private final long zzj;
    private final int zzk;
    private final String zzl;
    private final float zzm;
    private final long zzn;
    private final boolean zzo;

    public WakeLockEvent(int i10, long j10, int i11, String str, int i12, List list, String str2, long j11, int i13, String str3, String str4, float f10, long j12, String str5, boolean z10) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = i11;
        this.zzd = str;
        this.zze = str3;
        this.zzf = str5;
        this.zzg = i12;
        this.zzh = list;
        this.zzi = str2;
        this.zzj = j11;
        this.zzk = i13;
        this.zzl = str4;
        this.zzm = f10;
        this.zzn = j12;
        this.zzo = z10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeLong(parcel, 2, this.zzb);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        SafeParcelWriter.writeInt(parcel, 5, this.zzg);
        SafeParcelWriter.writeStringList(parcel, 6, this.zzh, false);
        SafeParcelWriter.writeLong(parcel, 8, this.zzj);
        SafeParcelWriter.writeString(parcel, 10, this.zze, false);
        SafeParcelWriter.writeInt(parcel, 11, this.zzc);
        SafeParcelWriter.writeString(parcel, 12, this.zzi, false);
        SafeParcelWriter.writeString(parcel, 13, this.zzl, false);
        SafeParcelWriter.writeInt(parcel, 14, this.zzk);
        SafeParcelWriter.writeFloat(parcel, 15, this.zzm);
        SafeParcelWriter.writeLong(parcel, 16, this.zzn);
        SafeParcelWriter.writeString(parcel, 17, this.zzf, false);
        SafeParcelWriter.writeBoolean(parcel, 18, this.zzo);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final String zzc() {
        List list = this.zzh;
        String strJoin = list == null ? "" : TextUtils.join(",", list);
        int i10 = this.zzk;
        String str = this.zze;
        String str2 = this.zzl;
        float f10 = this.zzm;
        String str3 = this.zzf;
        int i11 = this.zzg;
        String str4 = this.zzd;
        boolean z10 = this.zzo;
        StringBuilder sbR = b.r(i11, "\t", str4, "\t", "\t");
        sbR.append(strJoin);
        sbR.append("\t");
        sbR.append(i10);
        sbR.append("\t");
        if (str == null) {
            str = "";
        }
        sbR.append(str);
        sbR.append("\t");
        if (str2 == null) {
            str2 = "";
        }
        sbR.append(str2);
        sbR.append("\t");
        sbR.append(f10);
        sbR.append("\t");
        sbR.append(str3 != null ? str3 : "");
        sbR.append("\t");
        sbR.append(z10);
        return sbR.toString();
    }
}
