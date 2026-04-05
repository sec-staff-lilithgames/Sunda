package com.google.android.gms.internal.gtm;

import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zztx extends zztp {
    static final zztx zza;
    private static final Object[] zzd;
    final transient Object[] zzb;
    final transient Object[] zzc;
    private final transient int zze;
    private final transient int zzf;
    private final transient int zzg;

    static {
        Object[] objArr = new Object[0];
        zzd = objArr;
        zza = new zztx(objArr, 0, objArr, 0, 0);
    }

    public zztx(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.zzb = objArr;
        this.zze = i10;
        this.zzc = objArr2;
        this.zzf = i11;
        this.zzg = i12;
    }

    @Override // com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.zzc;
            if (objArr.length != 0) {
                int iZza = zzth.zza(obj.hashCode());
                while (true) {
                    int i10 = iZza & this.zzf;
                    Object obj2 = objArr[i10];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    iZza = i10 + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.gtm.zztp, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.gtm.zztp, com.google.android.gms.internal.gtm.zzti, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzg().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzg);
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final int zzb() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.gtm.zztp, com.google.android.gms.internal.gtm.zzti
    /* renamed from: zzd */
    public final zzua iterator() {
        return zzg().listIterator(0);
    }

    @Override // com.google.android.gms.internal.gtm.zzti
    public final Object[] zze() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.gtm.zztp
    public final zztl zzh() {
        return zztl.zzg(this.zzb, this.zzg);
    }

    @Override // com.google.android.gms.internal.gtm.zztp
    public final boolean zzk() {
        return true;
    }
}
