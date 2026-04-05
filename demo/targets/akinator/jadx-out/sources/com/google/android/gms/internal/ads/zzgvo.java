package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzgvo {
    private final OutputStream zza;

    private zzgvo(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzgvo zzb(OutputStream outputStream) {
        return new zzgvo(outputStream);
    }

    public final void zza(zzhlg zzhlgVar) throws IOException {
        try {
            zzhlgVar.zzaO(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
