package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzgsf extends zzgsa {
    private final File zza;
    private final zzgpo zzb;

    public /* synthetic */ zzgsf(File file, zzgse[] zzgseVarArr, byte[] bArr) {
        file.getClass();
        this.zza = file;
        this.zzb = zzgpo.zzp(zzgseVarArr);
    }

    public final String toString() {
        String string = this.zza.toString();
        int length = string.length();
        String strValueOf = String.valueOf(this.zzb);
        StringBuilder sb2 = new StringBuilder(length + 19 + strValueOf.length() + 1);
        com.google.android.gms.internal.play_billing.a.B(sb2, "Files.asByteSink(", string, ", ", strValueOf);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgsa
    public final /* bridge */ /* synthetic */ OutputStream zza() throws IOException {
        return new FileOutputStream(this.zza, this.zzb.contains(zzgse.APPEND));
    }
}
