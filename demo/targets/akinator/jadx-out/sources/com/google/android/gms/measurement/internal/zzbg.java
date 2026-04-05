package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.internal.play_billing.a;
import io.bidmachine.nativead.view.ev.QGjYBESwAiCc;
import j1.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzbg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbg> CREATOR = new zzbh();
    public final String zza;
    public final zzbe zzb;
    public final String zzc;
    public final long zzd;

    public zzbg(zzbg zzbgVar, long j10) {
        Preconditions.checkNotNull(zzbgVar);
        this.zza = zzbgVar.zza;
        this.zzb = zzbgVar.zzb;
        this.zzc = zzbgVar.zzc;
        this.zzd = j10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        zzbh.zza(this, parcel, i10);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzb);
        String str = this.zzc;
        int length = String.valueOf(str).length();
        String str2 = this.zza;
        StringBuilder sb2 = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        a.B(sb2, "origin=", str, QGjYBESwAiCc.SrrDltiMiP, str2);
        return o2.o(sb2, ",params=", strValueOf);
    }

    public zzbg(String str, zzbe zzbeVar, String str2, long j10) {
        this.zza = str;
        this.zzb = zzbeVar;
        this.zzc = str2;
        this.zzd = j10;
    }
}
