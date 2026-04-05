package com.google.android.gms.location;

import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzam extends zzao {
    private final zzan zza;

    public zzam(TaskCompletionSource<Void> taskCompletionSource, zzan zzanVar) {
        super(taskCompletionSource);
        this.zza = zzanVar;
    }

    @Override // com.google.android.gms.location.zzao, com.google.android.gms.internal.location.zzai
    public final void zzc() {
        this.zza.zza();
    }
}
