package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzfhp;
import com.google.android.gms.internal.ads.zzgmu;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzba extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzba> CREATOR = new zzbb();
    public final String zza;
    public final int zzb;

    public zzba(String str, int i10) {
        this.zza = str == null ? "" : str;
        this.zzb = i10;
    }

    public static zzba zza(Throwable th2) {
        com.google.android.gms.ads.internal.client.zze zzeVarZza = zzfhp.zza(th2);
        return new zzba(zzgmu.zzc(th2.getMessage()) ? zzeVarZza.zzb : th2.getMessage(), zzeVarZza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        String str = this.zza;
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }

    public final zzaz zzb() {
        return new zzaz(this.zza, this.zzb);
    }
}
