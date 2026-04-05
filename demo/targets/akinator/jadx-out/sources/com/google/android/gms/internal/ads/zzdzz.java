package com.google.android.gms.internal.ads;

import java.util.concurrent.ExecutionException;
import sh.n1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzdzz implements zzgtq {
    static final /* synthetic */ zzdzz zza = new zzdzz();

    private /* synthetic */ zzdzz() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtq
    public final /* synthetic */ n1 zza(Object obj) {
        Throwable cause = (ExecutionException) obj;
        if (cause.getCause() != null) {
            cause = cause.getCause();
        }
        return zzgui.zzc(cause);
    }
}
