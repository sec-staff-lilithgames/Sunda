package com.google.android.gms.internal.ads;

import b0.e2;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaha implements zzao {
    public final float zza;
    public final int zzb;

    public zzaha(float f10, int i10) {
        this.zza = f10;
        this.zzb = i10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaha.class == obj.getClass()) {
            zzaha zzahaVar = (zzaha) obj;
            if (this.zza == zzahaVar.zza && this.zzb == zzahaVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return e2.b(this.zza, IronSourceError.ERROR_NON_EXISTENT_INSTANCE, 31) + this.zzb;
    }

    public final String toString() {
        float f10 = this.zza;
        int length = String.valueOf(f10).length();
        int i10 = this.zzb;
        StringBuilder sb2 = new StringBuilder(length + 47 + String.valueOf(i10).length());
        sb2.append("smta: captureFrameRate=");
        sb2.append(f10);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i10);
        return sb2.toString();
    }
}
