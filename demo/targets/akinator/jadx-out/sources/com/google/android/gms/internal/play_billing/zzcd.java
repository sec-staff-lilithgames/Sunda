package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzcd extends zzce {
    private static final zzcd zzb = new zzcd();

    private zzcd() {
        super("");
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }

    @Override // com.google.android.gms.internal.play_billing.zzce, java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzce zzceVar) {
        return zzceVar == this ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final void zzc(StringBuilder sb2) {
        sb2.append("(-∞");
    }

    @Override // com.google.android.gms.internal.play_billing.zzce
    public final void zzd(StringBuilder sb2) {
        throw new AssertionError();
    }
}
