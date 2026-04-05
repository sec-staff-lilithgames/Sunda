package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzarv implements zzaru {
    @Override // com.google.android.gms.internal.ads.zzaru
    public final byte zza(zzasg zzasgVar, int i10) {
        return zzasgVar.zzb(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final zzasg zzb(zzasg zzasgVar, int i10, int i11) {
        byte[] bArr;
        int length;
        if (i10 < 0 || i10 > i11 || i11 > (length = (bArr = zzasgVar.zza).length) || i10 > i11 || i11 > length) {
            throw new IndexOutOfBoundsException();
        }
        return new zzasg(zzasg.zzh(bArr, i10, i11 - i10));
    }

    @Override // com.google.android.gms.internal.ads.zzaru
    public final zzaru zzc() {
        return new zzarv();
    }
}
