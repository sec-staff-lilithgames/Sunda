package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzaoc {
    public final int zza;
    public final String zzb;
    public final int zzc;
    public final List zzd;
    public final byte[] zze;

    public zzaoc(int i10, String str, int i11, List list, byte[] bArr) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = i11;
        this.zzd = list == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list);
        this.zze = bArr;
    }

    public final int zza() {
        int i10 = this.zzc;
        if (i10 != 2) {
            return i10 != 3 ? 0 : 512;
        }
        return 2048;
    }
}
