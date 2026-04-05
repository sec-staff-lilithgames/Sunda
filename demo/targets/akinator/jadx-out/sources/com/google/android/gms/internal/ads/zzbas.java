package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.pairip.VMRunner;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzbas extends BroadcastReceiver {
    final /* synthetic */ zzbaw zza;

    public zzbas(zzbaw zzbawVar) {
        Objects.requireNonNull(zzbawVar);
        this.zza = zzbawVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        VMRunner.invoke("RTF5Ds9SqqANNttN", new Object[]{this, context, intent});
    }
}
