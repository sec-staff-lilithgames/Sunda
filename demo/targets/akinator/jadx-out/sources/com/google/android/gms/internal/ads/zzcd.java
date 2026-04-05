package com.google.android.gms.internal.ads;

import b0.e2;
import com.ironsource.C3191e4;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzcd {
    public static final zzcd zza = new zzcd(-1, -1, -1);
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;

    public zzcd(int i10, int i11, int i12) {
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = zzep.zzA(i12) ? zzep.zzE(i12) * i11 : -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcd)) {
            return false;
        }
        zzcd zzcdVar = (zzcd) obj;
        return this.zzb == zzcdVar.zzb && this.zzc == zzcdVar.zzc && this.zzd == zzcdVar.zzd;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd));
    }

    public final String toString() {
        int i10 = this.zzb;
        int length = String.valueOf(i10).length();
        int i11 = this.zzc;
        int length2 = String.valueOf(i11).length();
        int i12 = this.zzd;
        StringBuilder sb2 = new StringBuilder(length + 38 + length2 + 11 + String.valueOf(i12).length() + 1);
        com.bytedance.sdk.component.adexpress.dynamic.dynamicview.a.o(i10, i11, "AudioFormat[sampleRate=", ", channelCount=", sb2);
        return e2.n(sb2, ", encoding=", i12, C3191e4.i.f36531e);
    }
}
