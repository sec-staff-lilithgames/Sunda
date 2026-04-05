package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class zzhxd extends IOException {
    private boolean zza;

    public zzhxd(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    public final void zza() {
        this.zza = true;
    }

    public final boolean zzb() {
        return this.zza;
    }

    public zzhxd(String str) {
        super(str);
    }

    public zzhxd(String str, IOException iOException) {
        super("Unable to parse map entry.", iOException);
    }
}
