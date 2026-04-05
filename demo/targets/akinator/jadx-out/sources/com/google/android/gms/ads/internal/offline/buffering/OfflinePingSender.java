package com.google.android.gms.ads.internal.offline.buffering;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.google.android.gms.ads.internal.client.zzbb;
import com.google.android.gms.internal.ads.zzbrf;
import com.google.android.gms.internal.ads.zzbvb;
import com.pairip.VMRunner;
import n6.a0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class OfflinePingSender extends Worker {
    private final zzbvb zza;

    public OfflinePingSender(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.zza = zzbb.zzb().zzk(context, new zzbrf());
    }

    @Override // androidx.work.Worker
    public final a0 doWork() {
        return (a0) VMRunner.invoke("YINkHG6v6kZkaKCk", new Object[]{this});
    }
}
