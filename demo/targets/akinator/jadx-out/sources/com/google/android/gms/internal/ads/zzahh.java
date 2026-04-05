package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzahh implements Comparable {
    public final long zza;
    public final long zzb;

    public zzahh(long j10, long j11) {
        this.zza = j10;
        this.zzb = j11;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Long.compare(this.zza, ((zzahh) obj).zza);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzahh)) {
            return false;
        }
        zzahh zzahhVar = (zzahh) obj;
        return this.zza == zzahhVar.zza && this.zzb == zzahhVar.zzb;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb));
    }
}
