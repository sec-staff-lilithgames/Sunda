package io.bidmachine.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;
import com.applovin.impl.k9;
import com.ironsource.C3119a4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final a f61394a;

    /* renamed from: b, reason: collision with root package name */
    public final io.bidmachine.media3.common.util.v f61395b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f61396c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f61397d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Context f61398a;

        /* renamed from: b, reason: collision with root package name */
        public WifiManager.WifiLock f61399b;

        public a(Context context) {
            this.f61398a = context;
        }

        public void updateWifiLock(boolean z10, boolean z11) {
            if (z10 && this.f61399b == null) {
                WifiManager wifiManager = (WifiManager) this.f61398a.getApplicationContext().getSystemService(C3119a4.f35922b);
                if (wifiManager == null) {
                    io.bidmachine.media3.common.util.b0.w("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f61399b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f61399b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public l2(Context context, Looper looper, io.bidmachine.media3.common.util.g gVar) {
        this.f61394a = new a(context.getApplicationContext());
        this.f61395b = ((io.bidmachine.media3.common.util.q0) gVar).createHandler(looper, null);
    }

    public void setEnabled(boolean z10) {
        if (this.f61396c == z10) {
            return;
        }
        this.f61396c = z10;
        this.f61395b.post(new j2(this, z10, this.f61397d, 1));
    }

    public void setStayAwake(boolean z10) {
        if (this.f61397d == z10) {
            return;
        }
        this.f61397d = z10;
        if (this.f61396c) {
            this.f61395b.post(new k9(this, z10, 5));
        }
    }
}
