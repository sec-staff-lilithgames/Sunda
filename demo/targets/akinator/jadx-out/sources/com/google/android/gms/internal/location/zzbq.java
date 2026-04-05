package com.google.android.gms.internal.location;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbq<E> extends zzbo<E> {
    private final zzbs<E> zza;

    public zzbq(zzbs<E> zzbsVar, int i10) {
        super(zzbsVar.size(), i10);
        this.zza = zzbsVar;
    }

    @Override // com.google.android.gms.internal.location.zzbo
    public final E zza(int i10) {
        return this.zza.get(i10);
    }
}
