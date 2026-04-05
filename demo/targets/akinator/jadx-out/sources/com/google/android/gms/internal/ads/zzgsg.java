package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgsg {
    public static void zza(byte[] bArr, File file) throws IOException {
        zzgsf zzgsfVar = new zzgsf(file, new zzgse[0], null);
        bArr.getClass();
        OutputStream outputStreamZza = zzgsfVar.zza();
        try {
            outputStreamZza.write(bArr);
            outputStreamZza.close();
        } catch (Throwable th2) {
            try {
                outputStreamZza.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public static void zzb(File file) throws IOException {
        file.getClass();
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile == null) {
            return;
        }
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            throw new IOException("Unable to create parent directories of ".concat(file.toString()));
        }
    }
}
