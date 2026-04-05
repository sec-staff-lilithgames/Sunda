package com.google.android.gms.internal.gtm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.common.internal.Preconditions;
import m3.a;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
final class zzep extends BroadcastReceiver {
    static final String zza = "com.google.android.gms.internal.gtm.zzep";
    private final zzbu zzb;
    private boolean zzc;
    private boolean zzd;

    public zzep(zzbu zzbuVar) {
        Preconditions.checkNotNull(zzbuVar);
        this.zzb = zzbuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zzb.zzm();
        this.zzb.zzf();
        String action = intent.getAction();
        this.zzb.zzm().zzO("NetworkBroadcastReceiver received action", action);
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            boolean zZze = zze();
            if (this.zzd != zZze) {
                this.zzd = zZze;
                zzbp zzbpVarZzf = this.zzb.zzf();
                zzbpVarZzf.zzO("Network connectivity status changed", Boolean.valueOf(zZze));
                zzbpVarZzf.zzq().zzi(new zzbi(zzbpVarZzf, zZze));
                return;
            }
            return;
        }
        if (!"com.google.analytics.RADIO_POWERED".equals(action)) {
            this.zzb.zzm().zzR("NetworkBroadcastReceiver received unknown action", action);
        } else {
            if (intent.hasExtra(zza)) {
                return;
            }
            zzbp zzbpVarZzf2 = this.zzb.zzf();
            zzbpVarZzf2.zzN("Radio powered up");
            zzbpVarZzf2.zzc();
        }
    }

    public final void zza() {
        this.zzb.zzm();
        this.zzb.zzf();
        if (this.zzc) {
            return;
        }
        Context contextZza = this.zzb.zza();
        a.registerReceiver(contextZza, this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 4);
        IntentFilter intentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        intentFilter.addCategory(contextZza.getPackageName());
        a.registerReceiver(contextZza, this, intentFilter, 4);
        this.zzd = zze();
        this.zzb.zzm().zzO("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.zzd));
        this.zzc = true;
    }

    public final void zzb() {
        Context contextZza = this.zzb.zza();
        Intent intent = new Intent("com.google.analytics.RADIO_POWERED");
        intent.addCategory(contextZza.getPackageName());
        intent.putExtra(zza, true);
        contextZza.sendOrderedBroadcast(intent, null);
    }

    public final void zzc() {
        if (this.zzc) {
            this.zzb.zzm().zzN("Unregistering connectivity change receiver");
            this.zzc = false;
            this.zzd = false;
            try {
                this.zzb.zza().unregisterReceiver(this);
            } catch (IllegalArgumentException e10) {
                this.zzb.zzm().zzJ("Failed to unregister the network broadcast receiver", e10);
            }
        }
    }

    public final boolean zzd() {
        if (!this.zzc) {
            this.zzb.zzm().zzQ("Connectivity unknown. Receiver not registered");
        }
        return this.zzd;
    }

    public final boolean zze() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.zzb.zza().getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
        } catch (SecurityException unused) {
        }
        return false;
    }
}
