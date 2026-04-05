package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzq implements Handler.Callback {
    final /* synthetic */ zzs zza;

    public /* synthetic */ zzq(zzs zzsVar, zzr zzrVar) {
        this.zza = zzsVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.zza.zzb) {
                try {
                    zzo zzoVar = (zzo) message.obj;
                    zzp zzpVar = (zzp) this.zza.zzb.get(zzoVar);
                    if (zzpVar != null && zzpVar.zzi()) {
                        if (zzpVar.zzj()) {
                            zzpVar.zzg("GmsClientSupervisor");
                        }
                        this.zza.zzb.remove(zzoVar);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.zza.zzb) {
            try {
                zzo zzoVar2 = (zzo) message.obj;
                zzp zzpVar2 = (zzp) this.zza.zzb.get(zzoVar2);
                if (zzpVar2 != null && zzpVar2.zza() == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(zzoVar2)), new Exception());
                    ComponentName componentNameZzb = zzpVar2.zzb();
                    if (componentNameZzb == null) {
                        componentNameZzb = zzoVar2.zza();
                    }
                    if (componentNameZzb == null) {
                        String strZzc = zzoVar2.zzc();
                        Preconditions.checkNotNull(strZzc);
                        componentNameZzb = new ComponentName(strZzc, "unknown");
                    }
                    zzpVar2.onServiceDisconnected(componentNameZzb);
                }
            } finally {
            }
        }
        return true;
    }
}
