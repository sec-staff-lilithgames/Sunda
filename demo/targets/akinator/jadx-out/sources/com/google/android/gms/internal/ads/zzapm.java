package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzapm {
    private final String zza;
    private final String zzb;

    public zzapm(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzapm.class == obj.getClass()) {
            zzapm zzapmVar = (zzapm) obj;
            if (TextUtils.equals(this.zza, zzapmVar.zza) && TextUtils.equals(this.zzb, zzapmVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.zzb.hashCode() + (this.zza.hashCode() * 31);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(str2).length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "Header[name=", str, ",value=", str2);
        sb2.append(C3191e4.i.f36531e);
        return sb2.toString();
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zzb;
    }
}
