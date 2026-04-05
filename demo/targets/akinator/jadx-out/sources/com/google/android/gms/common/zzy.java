package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.common.zzak;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzy {
    private String zza = null;
    private long zzb = -1;
    private zzak zzc = zzak.zzl();
    private zzak zzd = zzak.zzl();

    public final zzy zza(long j10) {
        this.zzb = j10;
        return this;
    }

    public final zzy zzb(List list) {
        Preconditions.checkNotNull(list);
        this.zzd = zzak.zzk(list);
        return this;
    }

    public final zzy zzc(List list) {
        Preconditions.checkNotNull(list);
        this.zzc = zzak.zzk(list);
        return this;
    }

    public final zzy zzd(String str) {
        this.zza = str;
        return this;
    }

    public final zzaa zze() {
        if (this.zza == null) {
            throw new IllegalStateException("packageName must be defined");
        }
        if (this.zzb < 0) {
            throw new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
        }
        if (this.zzc.isEmpty() && this.zzd.isEmpty()) {
            throw new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
        }
        return new zzaa(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
