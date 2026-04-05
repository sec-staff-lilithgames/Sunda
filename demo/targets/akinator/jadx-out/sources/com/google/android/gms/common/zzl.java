package com.google.android.gms.common;

import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzl extends zzj {
    private static final WeakReference zza = new WeakReference(null);
    private WeakReference zzb;

    public zzl(byte[] bArr) {
        super(bArr);
        this.zzb = zza;
    }

    public abstract byte[] zzb();

    @Override // com.google.android.gms.common.zzj
    public final byte[] zzf() {
        byte[] bArrZzb;
        synchronized (this) {
            try {
                bArrZzb = (byte[]) this.zzb.get();
                if (bArrZzb == null) {
                    bArrZzb = zzb();
                    this.zzb = new WeakReference(bArrZzb);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bArrZzb;
    }
}
