package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagh extends zzagq {
    public final byte[] zza;

    public zzagh(String str, byte[] bArr) {
        super(str);
        this.zza = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagh.class == obj.getClass()) {
            zzagh zzaghVar = (zzagh) obj;
            if (this.zzf.equals(zzaghVar.zzf) && Arrays.equals(this.zza, zzaghVar.zza)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.zzf.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        return Arrays.hashCode(this.zza) + (iHashCode * 31);
    }
}
