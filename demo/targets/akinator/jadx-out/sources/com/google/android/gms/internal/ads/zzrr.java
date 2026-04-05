package com.google.android.gms.internal.ads;

import com.facebook.ads.AdError;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzrr extends IOException {
    public final int zza;

    public zzrr(Throwable th2, int i10) {
        super(th2);
        this.zza = AdError.MEDIAVIEW_MISSING_ERROR_CODE;
    }
}
