package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.ironsource.jc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3288jc implements InterfaceC3493v7 {

    /* renamed from: a, reason: collision with root package name */
    private String f37026a = "jc";

    /* renamed from: b, reason: collision with root package name */
    private int f37027b = 23;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC3510w7 f37028c;

    /* renamed from: d, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f37029d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.ironsource.jc$a */
    public class a extends ConnectivityManager.NetworkCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f37030a;

        public a(Context context) {
            this.f37030a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            if (network != null) {
                C3288jc.this.f37028c.a(C3137b4.a(network, this.f37030a), C3137b4.a(this.f37030a, network));
                return;
            }
            InterfaceC3510w7 interfaceC3510w7 = C3288jc.this.f37028c;
            String strB = C3137b4.b(this.f37030a);
            Context context = this.f37030a;
            interfaceC3510w7.a(strB, C3137b4.a(context, C3137b4.a(context)));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            if (network != null) {
                C3288jc.this.f37028c.b(C3137b4.a(network, this.f37030a), C3137b4.a(this.f37030a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            if (network != null) {
                C3288jc.this.f37028c.b(C3137b4.a(network, this.f37030a), C3137b4.a(this.f37030a, network));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            if (C3137b4.b(this.f37030a).equals("none")) {
                C3288jc.this.f37028c.a();
            }
        }
    }

    public C3288jc(InterfaceC3510w7 interfaceC3510w7) {
        this.f37028c = interfaceC3510w7;
    }

    @Override // com.ironsource.InterfaceC3493v7
    public void b(Context context) {
        if (Build.VERSION.SDK_INT >= this.f37027b) {
            a(context);
            if (C3137b4.b(context).equals("none")) {
                this.f37028c.a();
            }
            if (this.f37029d == null) {
                this.f37029d = new a(context);
            }
            NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null) {
                    connectivityManager.registerNetworkCallback(networkRequestBuild, this.f37029d);
                }
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                Log.e(this.f37026a, "NetworkCallback was not able to register");
            }
        }
    }

    @Override // com.ironsource.InterfaceC3493v7
    public JSONObject c(Context context) {
        return C3137b4.a(context, C3137b4.a(context));
    }

    @Override // com.ironsource.InterfaceC3493v7
    public void a(Context context) {
        ConnectivityManager connectivityManager;
        if (Build.VERSION.SDK_INT < this.f37027b || this.f37029d == null || context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this.f37029d);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            Log.e(this.f37026a, "NetworkCallback for was not registered or already unregistered");
        }
    }

    @Override // com.ironsource.InterfaceC3493v7
    public void a() {
        this.f37029d = null;
    }
}
