package com.google.android.gms.measurement.internal;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzos extends zzol {
    private boolean zza;

    public zzos(zzpg zzpgVar) {
        super(zzpgVar);
        this.zzg.zzae();
    }

    public final boolean zzav() {
        return this.zza;
    }

    public final void zzaw() {
        if (!zzav()) {
            throw new IllegalStateException("Not initialized");
        }
    }

    public final void zzax() {
        if (this.zza) {
            throw new IllegalStateException("Can't initialize twice");
        }
        zzbb();
        this.zzg.zzaf();
        this.zza = true;
    }

    public abstract boolean zzbb();
}
