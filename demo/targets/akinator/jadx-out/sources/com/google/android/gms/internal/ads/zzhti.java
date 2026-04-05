package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzhti extends zzhtg {
    private final zzhtx zza = new zzhtx(false);

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof zzhti) && ((zzhti) obj).zza.equals(this.zza);
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zza(String str, zzhtg zzhtgVar) {
        this.zza.put(str, zzhtgVar);
    }

    public final Set zzb() {
        return this.zza.entrySet();
    }

    public final boolean zzc(String str) {
        return this.zza.containsKey(str);
    }

    public final zzhtg zzh(String str) {
        return (zzhtg) this.zza.get(str);
    }
}
