package com.google.android.gms.common.internal;

import a.b;
import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzb extends com.google.android.gms.internal.common.zzh {
    final /* synthetic */ BaseGmsClient zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzb(BaseGmsClient baseGmsClient, Looper looper) {
        super(looper);
        this.zza = baseGmsClient;
    }

    private static final void zza(Message message) {
        zzc zzcVar = (zzc) message.obj;
        zzcVar.zzc();
        zzcVar.zzg();
    }

    private static final boolean zzb(Message message) {
        int i10 = message.what;
        return i10 == 2 || i10 == 1 || i10 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zza.zzd.get() != message.arg1) {
            if (zzb(message)) {
                zza(message);
                return;
            }
            return;
        }
        int i10 = message.what;
        if ((i10 == 1 || i10 == 7 || ((i10 == 4 && !this.zza.enableLocalFallback()) || message.what == 5)) && !this.zza.isConnecting()) {
            zza(message);
            return;
        }
        int i11 = message.what;
        if (i11 == 4) {
            this.zza.zzC = new ConnectionResult(message.arg2);
            if (BaseGmsClient.zzo(this.zza)) {
                BaseGmsClient baseGmsClient = this.zza;
                if (!baseGmsClient.zzD) {
                    baseGmsClient.zzp(3, null);
                    return;
                }
            }
            BaseGmsClient baseGmsClient2 = this.zza;
            ConnectionResult connectionResult = baseGmsClient2.zzC != null ? baseGmsClient2.zzC : new ConnectionResult(8);
            this.zza.zzc.onReportServiceBinding(connectionResult);
            this.zza.onConnectionFailed(connectionResult);
            return;
        }
        if (i11 == 5) {
            BaseGmsClient baseGmsClient3 = this.zza;
            ConnectionResult connectionResult2 = baseGmsClient3.zzC != null ? baseGmsClient3.zzC : new ConnectionResult(8);
            this.zza.zzc.onReportServiceBinding(connectionResult2);
            this.zza.onConnectionFailed(connectionResult2);
            return;
        }
        if (i11 == 3) {
            Object obj = message.obj;
            ConnectionResult connectionResult3 = new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.zza.zzc.onReportServiceBinding(connectionResult3);
            this.zza.onConnectionFailed(connectionResult3);
            return;
        }
        if (i11 == 6) {
            this.zza.zzp(5, null);
            BaseGmsClient baseGmsClient4 = this.zza;
            if (baseGmsClient4.zzw != null) {
                baseGmsClient4.zzw.onConnectionSuspended(message.arg2);
            }
            this.zza.onConnectionSuspended(message.arg2);
            BaseGmsClient.zzn(this.zza, 5, 1, null);
            return;
        }
        if (i11 == 2 && !this.zza.isConnected()) {
            zza(message);
        } else if (zzb(message)) {
            ((zzc) message.obj).zze();
        } else {
            Log.wtf("GmsClient", b.e(message.what, "Don't know how to handle message: "), new Exception());
        }
    }
}
