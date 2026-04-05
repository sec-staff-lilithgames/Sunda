package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzz {
    private String zza;
    private Uri zzb;
    private final zzaa zzc = new zzaa();
    private final List zzd;
    private final zzgpe zze;
    private final zzae zzf;
    private final zzai zzg;

    public zzz() {
        zzgpe.zzi();
        this.zzd = Collections.EMPTY_LIST;
        this.zze = zzgpe.zzi();
        this.zzf = new zzae();
        this.zzg = zzai.zza;
    }

    public final zzz zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzz zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzak zzc() {
        zzag zzagVar;
        Uri uri = this.zzb;
        byte[] bArr = null;
        if (uri != null) {
            zzagVar = new zzag(uri, null, null, null, this.zzd, null, this.zze, null, C.TIME_UNSET, null);
        } else {
            zzagVar = null;
        }
        String str = this.zza;
        if (str == null) {
            str = "";
        }
        return new zzak(str, new zzac(this.zzc, null), zzagVar, new zzaf(this.zzf, bArr), zzan.zza, this.zzg, null);
    }
}
