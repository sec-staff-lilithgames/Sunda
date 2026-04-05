package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgjm extends zzgju {
    private final String zza;
    private final String zzb;

    public /* synthetic */ zzgjm(String str, String str2, byte[] bArr) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgju) {
            zzgju zzgjuVar = (zzgju) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzgjuVar.zza()) : zzgjuVar.zza() == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzgjuVar.zzb()) : zzgjuVar.zzb() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        return ((iHashCode ^ 1000003) * 1000003) ^ (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 50 + String.valueOf(str2).length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "OverlayDisplayDismissRequest{sessionToken=", str, ", appId=", str2);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgju
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgju
    public final String zzb() {
        return this.zzb;
    }
}
