package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzagz implements zzao {
    public final List zza;

    public zzagz(List list) {
        this.zza = list;
        boolean z10 = false;
        if (!list.isEmpty()) {
            long j10 = ((zzagy) list.get(0)).zzb;
            int i10 = 1;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (((zzagy) list.get(i10)).zza < j10) {
                    z10 = true;
                    break;
                } else {
                    j10 = ((zzagy) list.get(i10)).zzb;
                    i10++;
                }
            }
        }
        zzgmd.zza(!z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagz.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzagz) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
