package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgob extends zzgqy implements Serializable {
    final zzglu zza;
    final zzgqy zzb;

    public zzgob(zzglu zzgluVar, zzgqy zzgqyVar) {
        this.zza = zzgluVar;
        this.zzb = zzgqyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqy, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        zzglu zzgluVar = this.zza;
        return this.zzb.compare(zzgluVar.apply(obj), zzgluVar.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzgob) {
            zzgob zzgobVar = (zzgob) obj;
            if (this.zza.equals(zzgobVar.zza) && this.zzb.equals(zzgobVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        String string = this.zzb.toString();
        int length = string.length();
        String string2 = this.zza.toString();
        return o2.r(new StringBuilder(length + 12 + string2.length() + 1), string, ".onResultOf(", string2, ")");
    }
}
