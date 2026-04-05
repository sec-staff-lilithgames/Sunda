package com.ironsource.sdk.service.Connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import com.ironsource.C3137b4;
import com.ironsource.C3422r4;
import com.ironsource.InterfaceC3493v7;
import com.ironsource.InterfaceC3510w7;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class BroadcastReceiverStrategy implements InterfaceC3493v7 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3510w7 f38838a;

    /* renamed from: b, reason: collision with root package name */
    private BroadcastReceiver f38839b = new BroadcastReceiver() { // from class: com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String strB = C3137b4.b(context);
            if (strB.equals("none")) {
                BroadcastReceiverStrategy.this.f38838a.a();
            } else {
                BroadcastReceiverStrategy.this.f38838a.a(strB, new JSONObject());
            }
        }
    };

    public BroadcastReceiverStrategy(InterfaceC3510w7 interfaceC3510w7) {
        this.f38838a = interfaceC3510w7;
    }

    @Override // com.ironsource.InterfaceC3493v7
    public void b(Context context) {
        try {
            context.registerReceiver(this.f38839b, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // com.ironsource.InterfaceC3493v7
    public JSONObject c(Context context) {
        return new JSONObject();
    }

    @Override // com.ironsource.InterfaceC3493v7
    public void a(Context context) {
        try {
            context.unregisterReceiver(this.f38839b);
        } catch (IllegalArgumentException e10) {
            C3422r4.d().a(e10);
        } catch (Exception e11) {
            C3422r4.d().a(e11);
            Log.e("ContentValues", "unregisterConnectionReceiver - " + e11);
        }
    }

    @Override // com.ironsource.InterfaceC3493v7
    public void a() {
        this.f38839b = null;
    }
}
