package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.vungle.ads.internal.protos.Sdk;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbx extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbx> CREATOR = new zzby();
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    public zzbx(int i10, int i11, int i12, int i13) {
        Preconditions.checkState(i10 >= 0 && i10 <= 23, "Start hour must be in range [0, 23].");
        Preconditions.checkState(i11 >= 0 && i11 <= 59, "Start minute must be in range [0, 59].");
        Preconditions.checkState(i12 >= 0 && i12 <= 23, "End hour must be in range [0, 23].");
        Preconditions.checkState(i13 >= 0 && i13 <= 59, "End minute must be in range [0, 59].");
        Preconditions.checkState(((i10 + i11) + i12) + i13 > 0, "Parameters can't be all 0.");
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzbx)) {
            return false;
        }
        zzbx zzbxVar = (zzbx) obj;
        return this.zza == zzbxVar.zza && this.zzb == zzbxVar.zzb && this.zzc == zzbxVar.zzc && this.zzd == zzbxVar.zzd;
    }

    public final int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i10 = this.zza;
        int i11 = this.zzb;
        int i12 = this.zzc;
        int i13 = this.zzd;
        StringBuilder sb2 = new StringBuilder(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE);
        sb2.append("UserPreferredSleepWindow [startHour=");
        sb2.append(i10);
        sb2.append(", startMinute=");
        sb2.append(i11);
        a.o(i12, i13, ", endHour=", ", endMinute=", sb2);
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Preconditions.checkNotNull(parcel);
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, this.zza);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.writeInt(parcel, 3, this.zzc);
        SafeParcelWriter.writeInt(parcel, 4, this.zzd);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
