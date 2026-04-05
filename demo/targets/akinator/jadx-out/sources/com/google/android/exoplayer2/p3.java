package com.google.android.exoplayer2;

import android.content.Context;
import android.net.wifi.WifiManager;
import com.ironsource.C3119a4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class p3 {

    /* renamed from: a, reason: collision with root package name */
    public final WifiManager f27904a;

    /* renamed from: b, reason: collision with root package name */
    public WifiManager.WifiLock f27905b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f27906c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f27907d;

    public p3(Context context) {
        this.f27904a = (WifiManager) context.getApplicationContext().getSystemService(C3119a4.f35922b);
    }

    public void setEnabled(boolean z10) {
        if (z10 && this.f27905b == null) {
            WifiManager wifiManager = this.f27904a;
            if (wifiManager == null) {
                com.google.android.exoplayer2.util.f0.w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f27905b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f27906c = z10;
        WifiManager.WifiLock wifiLock = this.f27905b;
        if (wifiLock == null) {
            return;
        }
        if (z10 && this.f27907d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }

    public void setStayAwake(boolean z10) {
        this.f27907d = z10;
        WifiManager.WifiLock wifiLock = this.f27905b;
        if (wifiLock == null) {
            return;
        }
        if (this.f27906c && z10) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
