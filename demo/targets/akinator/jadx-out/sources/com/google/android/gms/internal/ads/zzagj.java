package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ChapterTocFrame;
import java.util.Arrays;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagj extends zzagq {
    public final String zza;
    public final boolean zzb;
    public final boolean zzc;
    public final String[] zzd;
    private final zzagq[] zze;

    public zzagj(String str, boolean z10, boolean z11, String[] strArr, zzagq[] zzagqVarArr) {
        super(ChapterTocFrame.ID);
        this.zza = str;
        this.zzb = z10;
        this.zzc = z11;
        this.zzd = strArr;
        this.zze = zzagqVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagj.class == obj.getClass()) {
            zzagj zzagjVar = (zzagj) obj;
            if (this.zzb == zzagjVar.zzb && this.zzc == zzagjVar.zzc && Objects.equals(this.zza, zzagjVar.zza) && Arrays.equals(this.zzd, zzagjVar.zzd) && Arrays.equals(this.zze, zzagjVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (this.zzb ? 1 : 0) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        String str = this.zza;
        return str.hashCode() + (((i10 * 31) + (this.zzc ? 1 : 0)) * 31);
    }
}
