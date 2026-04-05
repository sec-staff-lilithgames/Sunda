package com.google.android.gms.cloudmessaging;

import a.b;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb = new TaskCompletionSource();
    final int zzc;
    final Bundle zzd;

    public zzs(int i10, int i11, Bundle bundle) {
        this.zza = i10;
        this.zzc = i11;
        this.zzd = bundle;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Request { what=");
        sb2.append(this.zzc);
        sb2.append(" id=");
        sb2.append(this.zza);
        sb2.append(" oneWay=");
        return b.q(sb2, zzb(), "}");
    }

    public abstract void zza(Bundle bundle);

    public abstract boolean zzb();

    public final void zzc(zzt zztVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Failing " + toString() + " with " + zztVar.toString());
        }
        this.zzb.setException(zztVar);
    }

    public final void zzd(Object obj) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            Log.d("MessengerIpcClient", "Finishing " + toString() + " with " + String.valueOf(obj));
        }
        this.zzb.setResult(obj);
    }
}
