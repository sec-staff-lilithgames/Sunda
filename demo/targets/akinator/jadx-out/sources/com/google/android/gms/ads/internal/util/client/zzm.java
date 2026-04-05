package com.google.android.gms.ads.internal.util.client;

import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzm extends zzw {
    private final int zza;
    private final int zzb;
    private final boolean zzc;

    public zzm(int i10, int i11, boolean z10) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = z10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzw) {
            zzw zzwVar = (zzw) obj;
            if (this.zza == zzwVar.zza() && this.zzb == zzwVar.zzb() && this.zzc == zzwVar.zzc()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (true != this.zzc ? 1237 : 1231) ^ ((((this.zza ^ 1000003) * 1000003) ^ this.zzb) * 1000003);
    }

    public final String toString() {
        int i10 = this.zza;
        int length = String.valueOf(i10).length();
        int i11 = this.zzb;
        int length2 = String.valueOf(i11).length();
        boolean z10 = this.zzc;
        StringBuilder sb2 = new StringBuilder(length + 59 + length2 + 26 + String.valueOf(z10).length() + 1);
        a.o(i10, i11, "OfflineAdConfig{impressionPrerequisite=", ", clickPrerequisite=", sb2);
        sb2.append(", notificationFlowEnabled=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final int zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.internal.util.client.zzw
    public final boolean zzc() {
        return this.zzc;
    }
}
