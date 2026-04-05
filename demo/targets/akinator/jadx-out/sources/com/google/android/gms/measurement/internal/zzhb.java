package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzhb extends BroadcastReceiver {
    private final zzpg zza;
    private boolean zzb;
    private boolean zzc;

    public zzhb(zzpg zzpgVar) {
        Preconditions.checkNotNull(zzpgVar);
        this.zza = zzpgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) throws IllegalStateException {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        String action = intent.getAction();
        zzpgVar.zzaV().zzk().zzb("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            zzpgVar.zzaV().zze().zzb("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zZzb = zzpgVar.zzi().zzb();
        if (this.zzc != zZzb) {
            this.zzc = zZzb;
            zzpgVar.zzaW().zzj(new zzha(this, zZzb));
        }
    }

    public final void zza() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaW().zzg();
        if (this.zzb) {
            return;
        }
        zzpgVar.zzaY().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.zzc = zzpgVar.zzi().zzb();
        zzpgVar.zzaV().zzk().zzb("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzc));
        this.zzb = true;
    }

    public final void zzb() {
        zzpg zzpgVar = this.zza;
        zzpgVar.zzu();
        zzpgVar.zzaW().zzg();
        zzpgVar.zzaW().zzg();
        if (this.zzb) {
            zzpgVar.zzaV().zzk().zza("Unregistering connectivity change receiver");
            this.zzb = false;
            this.zzc = false;
            try {
                zzpgVar.zzaY().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.zza.zzaV().zzb().zzb("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final /* synthetic */ zzpg zzc() {
        return this.zza;
    }
}
