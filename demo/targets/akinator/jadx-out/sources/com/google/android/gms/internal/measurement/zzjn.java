package com.google.android.gms.internal.measurement;

import android.content.Context;
import com.google.android.gms.internal.play_billing.a;
import mh.v2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzjn extends zzkh {
    private final Context zza;
    private final v2 zzb;

    public zzjn(Context context, v2 v2Var) {
        this.zza = context;
        this.zzb = v2Var;
    }

    public final boolean equals(Object obj) {
        v2 v2Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzkh) {
            zzkh zzkhVar = (zzkh) obj;
            if (this.zza.equals(zzkhVar.zza()) && ((v2Var = this.zzb) != null ? v2Var.equals(zzkhVar.zzb()) : zzkhVar.zzb() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zza.hashCode() ^ 1000003;
        v2 v2Var = this.zzb;
        return (iHashCode * 1000003) ^ (v2Var == null ? 0 : v2Var.hashCode());
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 45 + strValueOf.length() + 1);
        a.B(sb2, "FlagsContext{context=", string, ", hermeticFileOverrides=", strValueOf);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final Context zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzkh
    public final v2 zzb() {
        return this.zzb;
    }
}
