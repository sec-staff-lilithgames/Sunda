package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgtn extends zzgtl {
    private zzgtn() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final void zza(zzgto zzgtoVar, Set set, Set set2) {
        synchronized (zzgtoVar) {
            try {
                if (zzgtoVar.seenExceptionsField == null) {
                    zzgtoVar.seenExceptionsField = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgtl
    public final int zzb(zzgto zzgtoVar) {
        int i10;
        synchronized (zzgtoVar) {
            i10 = zzgtoVar.remainingField - 1;
            zzgtoVar.remainingField = i10;
        }
        return i10;
    }

    public /* synthetic */ zzgtn(byte[] bArr) {
        super(null);
    }
}
