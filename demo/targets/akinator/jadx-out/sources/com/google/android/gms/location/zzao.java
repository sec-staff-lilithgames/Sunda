package com.google.android.gms.location;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
class zzao extends com.google.android.gms.internal.location.zzah {
    private final TaskCompletionSource<Void> zza;

    public zzao(TaskCompletionSource<Void> taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.location.zzai
    public final void zzb(com.google.android.gms.internal.location.zzaa zzaaVar) {
        TaskUtil.setResultOrApiException(zzaaVar.getStatus(), this.zza);
    }

    public void zzc() {
    }
}
