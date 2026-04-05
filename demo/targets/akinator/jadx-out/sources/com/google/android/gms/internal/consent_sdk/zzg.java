package com.google.android.gms.internal.consent_sdk;

import android.util.Log;
import com.google.android.ump.FormError;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class zzg extends Exception {
    private final int zza;

    public zzg(int i10, String str) {
        super(str);
        this.zza = i10;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage();
    }

    public final FormError zza() {
        if (getCause() == null) {
            Log.w("UserMessagingPlatform", super.getMessage());
        } else {
            Log.w("UserMessagingPlatform", super.getMessage(), getCause());
        }
        return new FormError(this.zza, super.getMessage());
    }

    public zzg(int i10, String str, Throwable th2) {
        super(str, th2);
        this.zza = i10;
    }
}
