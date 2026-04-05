package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import com.moloco.sdk.BKC.JzVV;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzefn extends zzefq {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    public zzefn(String str, String str2, Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzefq) {
            zzefq zzefqVar = (zzefq) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzefqVar.zza()) : zzefqVar.zza() == null) {
                if (this.zzb.equals(zzefqVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzefqVar.zzc()) : zzefqVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzefq
    public final Drawable zzc() {
        return this.zzc;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return a.b.o(sb2, JzVV.mNvCSncr, strValueOf, "}");
    }
}
