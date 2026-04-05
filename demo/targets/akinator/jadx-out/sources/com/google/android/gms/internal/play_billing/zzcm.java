package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcm extends zzco {
    private final transient zzco zza;

    public zzcm(zzco zzcoVar) {
        this.zza = zzcoVar;
    }

    private final int zzp(int i10) {
        return (this.zza.size() - 1) - i10;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, com.google.android.gms.internal.play_billing.zzcj, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzbe.zza(i10, this.zza.size(), "index");
        return this.zza.get(zzp(i10));
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.zza.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return zzp(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.zza.indexOf(obj);
        if (iIndexOf >= 0) {
            return zzp(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcj
    public final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.android.gms.internal.play_billing.zzco
    public final zzco zzh() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.play_billing.zzco, java.util.List
    /* renamed from: zzi */
    public final zzco subList(int i10, int i11) {
        zzbe.zze(i10, i11, this.zza.size());
        zzco zzcoVar = this.zza;
        return zzcoVar.subList(zzcoVar.size() - i11, this.zza.size() - i10).zzh();
    }
}
