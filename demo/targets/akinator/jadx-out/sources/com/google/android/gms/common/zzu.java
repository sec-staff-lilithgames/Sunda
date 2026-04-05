package com.google.android.gms.common;

import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzu extends zzw {
    private final Callable zze;

    public /* synthetic */ zzu(Callable callable, zzv zzvVar) {
        super();
        this.zze = callable;
    }

    @Override // com.google.android.gms.common.zzw
    public final String zza() {
        try {
            return (String) this.zze.call();
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }
}
