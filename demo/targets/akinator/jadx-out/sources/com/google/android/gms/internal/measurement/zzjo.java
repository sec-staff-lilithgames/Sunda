package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzjo extends ContentObserver {
    final /* synthetic */ zzjr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjo(zzjr zzjrVar, Handler handler) {
        super(null);
        Objects.requireNonNull(zzjrVar);
        this.zza = zzjrVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.zza.zzc();
    }
}
