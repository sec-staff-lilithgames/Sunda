package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import androidx.constraintlayout.helper.widget.ADoa.QFzuMMDfrzagDN;
import com.google.android.gms.internal.play_billing.zzjx;
import com.google.android.gms.internal.play_billing.zzjz;
import com.google.android.gms.internal.play_billing.zzke;
import com.google.android.gms.internal.play_billing.zzki;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzlu;
import com.inmobi.commons.core.configs.CrashConfig;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class e implements ServiceConnection {

    /* renamed from: b, reason: collision with root package name */
    public final BillingClientStateListener f12727b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f12728c;

    public /* synthetic */ e(a aVar, BillingClientStateListener billingClientStateListener) {
        this.f12728c = aVar;
        this.f12727b = billingClientStateListener;
    }

    public final void a(BillingResult billingResult) {
        synchronized (this.f12728c.f12693a) {
            try {
                if (this.f12728c.f12694b == 3) {
                    return;
                }
                this.f12727b.onBillingSetupFinished(billingResult);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z10;
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing service died.");
        try {
            a aVar = this.f12728c;
            synchronized (aVar.f12693a) {
                z10 = true;
                if (aVar.f12694b != 1) {
                    z10 = false;
                }
            }
            if (z10) {
                u uVar = this.f12728c.f12699g;
                zzjx zzjxVarZzc = zzjz.zzc();
                zzjxVarZzc.zzn(6);
                zzke zzkeVarZzc = zzki.zzc();
                zzkeVarZzc.zzo(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE);
                zzjxVarZzc.zza(zzkeVarZzc);
                uVar.zza((zzjz) zzjxVarZzc.zzf());
            } else {
                this.f12728c.f12699g.zze(zzkl.zzB());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f12728c.f12693a) {
            if (this.f12728c.f12694b != 3 && this.f12728c.f12694b != 0) {
                this.f12728c.j(0);
                this.f12728c.k();
                this.f12727b.onBillingServiceDisconnected();
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z10;
        com.google.android.gms.internal.play_billing.zze.zzl("BillingClient", "Billing service disconnected.");
        try {
            a aVar = this.f12728c;
            synchronized (aVar.f12693a) {
                z10 = true;
                if (aVar.f12694b != 1) {
                    z10 = false;
                }
            }
            if (z10) {
                u uVar = this.f12728c.f12699g;
                zzjx zzjxVarZzc = zzjz.zzc();
                zzjxVarZzc.zzn(6);
                zzke zzkeVarZzc = zzki.zzc();
                zzkeVarZzc.zzo(Sdk.SDKError.Reason.TPAT_ERROR_VALUE);
                zzjxVarZzc.zza(zzkeVarZzc);
                uVar.zza((zzjz) zzjxVarZzc.zzf());
            } else {
                this.f12728c.f12699g.zzg(zzlu.zzB());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zze.zzm("BillingClient", "Unable to log.", th2);
        }
        synchronized (this.f12728c.f12693a) {
            try {
                if (this.f12728c.f12694b == 3) {
                    return;
                }
                this.f12728c.j(0);
                this.f12727b.onBillingServiceDisconnected();
            } finally {
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zze.zzk("BillingClient", QFzuMMDfrzagDN.hBrWNNUWy);
        synchronized (this.f12728c.f12693a) {
            try {
                if (this.f12728c.f12694b == 3) {
                    return;
                }
                this.f12728c.f12700h = com.google.android.gms.internal.play_billing.zzam.zzu(iBinder);
                a aVar = this.f12728c;
                if (a.a(new Callable() { // from class: com.android.billingclient.api.zzay
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:170:0x01f5  */
                    /* JADX WARN: Removed duplicated region for block: B:171:0x01fa  */
                    /* JADX WARN: Removed duplicated region for block: B:182:0x023a  */
                    /* JADX WARN: Removed duplicated region for block: B:206:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                    @Override // java.util.concurrent.Callable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object call() throws java.lang.Throwable {
                        /*
                            Method dump skipped, instructions count: 650
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.zzay.call():java.lang.Object");
                    }
                }, CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL, new Runnable() { // from class: com.android.billingclient.api.zzaz
                    @Override // java.lang.Runnable
                    public final void run() {
                        e eVar = this.zza;
                        a aVar2 = eVar.f12728c;
                        aVar2.j(0);
                        BillingResult billingResult = t.f12773n;
                        aVar2.C(24, 6, billingResult);
                        eVar.a(billingResult);
                    }
                }, aVar.w(), aVar.e()) == null) {
                    a aVar2 = this.f12728c;
                    BillingResult billingResultB = aVar2.b();
                    aVar2.C(25, 6, billingResultB);
                    a(billingResultB);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
