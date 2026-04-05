package io.odeeo.internal.k1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import io.odeeo.internal.v1.k;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class b implements io.odeeo.internal.k1.a {

    /* renamed from: a, reason: collision with root package name */
    public final Context f64502a;

    /* renamed from: b, reason: collision with root package name */
    public BroadcastReceiver f64503b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends BroadcastReceiver {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kv.a f64505b;

        public a(kv.a aVar) {
            this.f64505b = aVar;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context contextInner, Intent intent) {
            e0.checkNotNullParameter(contextInner, "contextInner");
            if (k.f67283a.isNetworkConnected(b.this.f64502a)) {
                io.odeeo.internal.b2.a.d("NetworkReceiver: Network available. Retrying to load ad.", new Object[0]);
                b.this.unregisterNetworkCallback();
                this.f64505b.invoke();
            }
        }
    }

    public b(Context context) {
        e0.checkNotNullParameter(context, "context");
        this.f64502a = context;
    }

    public final BroadcastReceiver getNetworkReceiver$odeeoSdk_release() {
        return this.f64503b;
    }

    @Override // io.odeeo.internal.k1.a
    public void registerNetworkCallback(kv.a availabilityCallback) {
        e0.checkNotNullParameter(availabilityCallback, "availabilityCallback");
        if (this.f64503b == null) {
            this.f64503b = new a(availabilityCallback);
            this.f64502a.registerReceiver(this.f64503b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
    }

    public final void setNetworkReceiver$odeeoSdk_release(BroadcastReceiver broadcastReceiver) {
        this.f64503b = broadcastReceiver;
    }

    @Override // io.odeeo.internal.k1.a
    public void unregisterNetworkCallback() {
        try {
            BroadcastReceiver broadcastReceiver = this.f64503b;
            if (broadcastReceiver == null) {
                return;
            }
            this.f64502a.unregisterReceiver(broadcastReceiver);
            setNetworkReceiver$odeeoSdk_release(null);
        } catch (Exception e10) {
            io.odeeo.internal.b2.a.e(e0.stringPlus("Failed to unregister network receiver: ", e10.getMessage()), new Object[0]);
        }
    }
}
