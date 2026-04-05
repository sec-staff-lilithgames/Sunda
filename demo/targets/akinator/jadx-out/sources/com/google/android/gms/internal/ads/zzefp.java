package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzefp extends zzegl {
    private final Activity zza;
    private final com.google.android.gms.ads.internal.overlay.zzm zzb;
    private final String zzc;
    private final String zzd;

    public /* synthetic */ zzefp(Activity activity, com.google.android.gms.ads.internal.overlay.zzm zzmVar, String str, String str2, byte[] bArr) {
        this.zza = activity;
        this.zzb = zzmVar;
        this.zzc = str;
        this.zzd = str2;
    }

    public final boolean equals(Object obj) {
        com.google.android.gms.ads.internal.overlay.zzm zzmVar;
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzegl) {
            zzegl zzeglVar = (zzegl) obj;
            if (this.zza.equals(zzeglVar.zza()) && ((zzmVar = this.zzb) != null ? zzmVar.equals(zzeglVar.zzb()) : zzeglVar.zzb() == null) && ((str = this.zzc) != null ? str.equals(zzeglVar.zzc()) : zzeglVar.zzc() == null) && ((str2 = this.zzd) != null ? str2.equals(zzeglVar.zzd()) : zzeglVar.zzd() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        com.google.android.gms.ads.internal.overlay.zzm zzmVar = this.zzb;
        int iHashCode2 = ((iHashCode * 1000003) ^ (zzmVar == null ? 0 : zzmVar.hashCode())) * 1000003;
        String str = this.zzc;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.zzd;
        return iHashCode3 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        int length2 = strValueOf.length();
        String str = this.zzc;
        int length3 = String.valueOf(str).length();
        String str2 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 40 + length2 + 13 + length3 + 6 + String.valueOf(str2).length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "OfflineUtilsParams{activity=", string, ", adOverlay=", strValueOf);
        com.google.android.gms.internal.play_billing.a.B(sb2, ", gwsQueryId=", str, ", uri=", str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final Activity zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final com.google.android.gms.ads.internal.overlay.zzm zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final String zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzegl
    public final String zzd() {
        return this.zzd;
    }
}
