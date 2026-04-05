package com.google.android.gms.internal.gtm;

import java.util.Collections;
import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzwc {
    private static final Comparator zza = new zzvv();
    private static final zzwc zzb = new zzwc(new zzwa(Collections.EMPTY_LIST));
    private final zzwa zzc;

    private zzwc(zzwa zzwaVar) {
        this.zzc = zzwaVar;
    }

    public static zzwc zza() {
        return zzb;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzwc) && ((zzwc) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return ~this.zzc.hashCode();
    }

    public final String toString() {
        return this.zzc.toString();
    }
}
