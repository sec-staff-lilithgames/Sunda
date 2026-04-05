package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzsh extends Handler {
    final /* synthetic */ zzsj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzsh(zzsj zzsjVar, Looper looper) {
        super(looper);
        Objects.requireNonNull(zzsjVar);
        this.zza = zzsjVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        this.zza.zzh(message);
    }
}
