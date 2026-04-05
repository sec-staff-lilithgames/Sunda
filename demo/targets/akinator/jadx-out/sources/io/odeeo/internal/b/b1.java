package io.odeeo.internal.b;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.ironsource.C3119a4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final WifiManager f62632a;

    /* renamed from: b, reason: collision with root package name */
    public WifiManager.WifiLock f62633b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f62634c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f62635d;

    public b1(Context context) {
        this.f62632a = (WifiManager) context.getApplicationContext().getSystemService(C3119a4.f35922b);
    }

    public final void a() {
        WifiManager.WifiLock wifiLock = this.f62633b;
        if (wifiLock == null) {
            return;
        }
        if (this.f62634c && this.f62635d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void setEnabled(boolean z10) {
        if (z10 && this.f62633b == null) {
            WifiManager wifiManager = this.f62632a;
            if (wifiManager == null) {
                io.odeeo.internal.q0.p.w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f62633b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f62634c = z10;
        a();
    }

    public void setStayAwake(boolean z10) {
        this.f62635d = z10;
        a();
    }
}
