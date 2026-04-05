package com.google.android.gms.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final /* synthetic */ class zzw implements RemoteCall {
    static final RemoteCall zza = new zzw();

    private zzw() {
    }

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) throws RemoteException {
        ((com.google.android.gms.internal.location.zzaz) obj).zzK(new zzao((TaskCompletionSource) obj2));
    }
}
