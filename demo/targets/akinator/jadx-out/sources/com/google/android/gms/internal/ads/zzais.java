package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzais implements zzaeh {
    public static final zzais zza = new zzais(true);
    public static final zzais zzb = new zzais(false);
    public final boolean zzc;

    private zzais(boolean z10) {
        this.zzc = z10;
    }

    public final String toString() {
        boolean z10 = !this.zzc;
        StringBuilder sb2 = new StringBuilder(String.valueOf(z10).length() + 33);
        sb2.append("IncorrectFragmentation{expected=");
        sb2.append(z10);
        sb2.append("}");
        return sb2.toString();
    }
}
