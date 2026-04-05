package com.google.android.gms.internal.ads;

import b0.e2;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzrd implements zzqk {
    final /* synthetic */ zzrh zza;

    public /* synthetic */ zzrd(zzrh zzrhVar, byte[] bArr) {
        Objects.requireNonNull(zzrhVar);
        this.zza = zzrhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zza(long j10) {
        zzrh zzrhVar = this.zza;
        if (zzrhVar.zzI() != null) {
            ((zzrk) zzrhVar.zzI()).zza.zzaw().zzd(j10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zzb(long j10, long j11, long j12, long j13) {
        zzrh zzrhVar = this.zza;
        long jZzF = zzrhVar.zzF();
        long jZzG = zzrhVar.zzG();
        int length = String.valueOf(j10).length();
        int length2 = String.valueOf(j11).length();
        int length3 = String.valueOf(j12).length();
        int length4 = String.valueOf(j13).length();
        StringBuilder sb2 = new StringBuilder(length + 54 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(jZzF).length() + 2 + String.valueOf(jZzG).length());
        e2.A(sb2, "Spurious audio timestamp (frame position mismatch): ", j10, ", ");
        sb2.append(j11);
        e2.A(sb2, ", ", j12, ", ");
        sb2.append(j13);
        e2.A(sb2, ", ", jZzF, ", ");
        sb2.append(jZzG);
        zzdt.zzc("DefaultAudioSink", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zzc(long j10, long j11, long j12, long j13) {
        zzrh zzrhVar = this.zza;
        long jZzF = zzrhVar.zzF();
        long jZzG = zzrhVar.zzG();
        int length = String.valueOf(j10).length();
        int length2 = String.valueOf(j11).length();
        int length3 = String.valueOf(j12).length();
        int length4 = String.valueOf(j13).length();
        StringBuilder sb2 = new StringBuilder(length + 52 + length2 + 2 + length3 + 2 + length4 + 2 + String.valueOf(jZzF).length() + 2 + String.valueOf(jZzG).length());
        e2.A(sb2, "Spurious audio timestamp (system clock mismatch): ", j10, ", ");
        sb2.append(j11);
        e2.A(sb2, ", ", j12, ", ");
        sb2.append(j13);
        e2.A(sb2, ", ", jZzF, ", ");
        sb2.append(jZzG);
        zzdt.zzc("DefaultAudioSink", sb2.toString());
    }

    @Override // com.google.android.gms.internal.ads.zzqk
    public final void zzd(long j10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 41);
        sb2.append("Ignoring impossibly large audio latency: ");
        sb2.append(j10);
        zzdt.zzc("DefaultAudioSink", sb2.toString());
    }
}
