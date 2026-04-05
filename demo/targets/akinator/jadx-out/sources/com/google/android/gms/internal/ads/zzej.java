package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Message;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzej implements zzdl {
    private Message zza;

    private zzej() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzdl
    public final void zza() {
        Message message = this.zza;
        message.getClass();
        message.sendToTarget();
        this.zza = null;
        zzek.zzn(this);
    }

    public final zzej zzb(Message message, zzek zzekVar) {
        this.zza = message;
        return this;
    }

    public final boolean zzc(Handler handler) {
        Message message = this.zza;
        message.getClass();
        boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue(message);
        this.zza = null;
        zzek.zzn(this);
        return zSendMessageAtFrontOfQueue;
    }

    public /* synthetic */ zzej(byte[] bArr) {
    }
}
