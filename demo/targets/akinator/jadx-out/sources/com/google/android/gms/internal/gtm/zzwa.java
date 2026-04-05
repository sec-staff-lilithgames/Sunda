package com.google.android.gms.internal.gtm;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzwa extends AbstractMap {
    private static final Comparator zza = new zzvx();
    private final Object[] zzb;
    private final int[] zzc;
    private final Set zzd = new zzvz(this, -1);
    private Integer zze = null;
    private String zzf = null;

    public zzwa(List list) {
        Iterator it = list.iterator();
        if (it.hasNext()) {
            zzvw.zza((zzvw) it.next());
            throw null;
        }
        int size = list.size();
        Object[] objArrCopyOf = new Object[size];
        Iterator it2 = list.iterator();
        if (it2.hasNext()) {
            zzvw.zza((zzvw) it2.next());
            throw null;
        }
        int[] iArr = {0};
        if (size > 16 && size * 9 > 0) {
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, 0);
        }
        this.zzb = objArrCopyOf;
        this.zzc = iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return this.zzd;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        if (this.zze == null) {
            this.zze = Integer.valueOf(super.hashCode());
        }
        return this.zze.intValue();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        if (this.zzf == null) {
            this.zzf = super.toString();
        }
        return this.zzf;
    }
}
