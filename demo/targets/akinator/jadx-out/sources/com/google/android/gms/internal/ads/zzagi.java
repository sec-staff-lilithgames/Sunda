package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterFrame;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagi extends zzagq {
    public final String zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final long zze;
    private final zzagq[] zzg;

    public zzagi(String str, int i10, int i11, long j10, long j11, zzagq[] zzagqVarArr) {
        super(ChapterFrame.ID);
        this.zza = str;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = j10;
        this.zze = j11;
        this.zzg = zzagqVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagi.class == obj.getClass()) {
            zzagi zzagiVar = (zzagi) obj;
            if (this.zzb == zzagiVar.zzb && this.zzc == zzagiVar.zzc && this.zzd == zzagiVar.zzd && this.zze == zzagiVar.zze && Objects.equals(this.zza, zzagiVar.zza) && Arrays.equals(this.zzg, zzagiVar.zzg)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.zzb + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        long j10 = this.zze;
        return str.hashCode() + (((((((i10 * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + ((int) j10)) * 31);
    }
}
