package com.google.android.gms.internal.location;

import a.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.play_billing.a;
import java.util.Collections;
import java.util.List;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzj extends AbstractSafeParcelable {
    final com.google.android.gms.location.zzs zzc;
    final List<ClientIdentity> zzd;
    final String zze;
    static final List<ClientIdentity> zza = Collections.EMPTY_LIST;
    static final com.google.android.gms.location.zzs zzb = new com.google.android.gms.location.zzs();
    public static final Parcelable.Creator<zzj> CREATOR = new zzk();

    public zzj(com.google.android.gms.location.zzs zzsVar, List<ClientIdentity> list, String str) {
        this.zzc = zzsVar;
        this.zzd = list;
        this.zze = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzj)) {
            return false;
        }
        zzj zzjVar = (zzj) obj;
        return Objects.equal(this.zzc, zzjVar.zzc) && Objects.equal(this.zzd, zzjVar.zzd) && Objects.equal(this.zze, zzjVar.zze);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(this.zzd);
        String str = this.zze;
        StringBuilder sb2 = new StringBuilder(o2.c(strValueOf.length(), 77, strValueOf2.length(), String.valueOf(str).length()));
        a.B(sb2, "DeviceOrientationRequestInternal{deviceOrientationRequest=", strValueOf, ", clients=", strValueOf2);
        return b.o(sb2, ", tag='", str, "'}");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iBeginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 1, this.zzc, i10, false);
        SafeParcelWriter.writeTypedList(parcel, 2, this.zzd, false);
        SafeParcelWriter.writeString(parcel, 3, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, iBeginObjectHeader);
    }
}
