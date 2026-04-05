package com.ironsource;

import android.content.Context;
import com.ironsource.C3191e4;
import com.ironsource.sdk.service.Connectivity.BroadcastReceiverStrategy;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class Y3 implements InterfaceC3510w7 {

    /* renamed from: a, reason: collision with root package name */
    private InterfaceC3493v7 f35746a;

    public Y3(JSONObject jSONObject, Context context) {
        InterfaceC3493v7 interfaceC3493v7A = a(jSONObject, context);
        this.f35746a = interfaceC3493v7A;
        Logger.i("Y3", "created ConnectivityAdapter with strategy ".concat(interfaceC3493v7A.getClass().getSimpleName()));
    }

    @Override // com.ironsource.InterfaceC3510w7
    public void a() {
    }

    @Override // com.ironsource.InterfaceC3510w7
    public void b(String str, JSONObject jSONObject) {
    }

    public void c(Context context) {
        this.f35746a.a(context);
    }

    @Override // com.ironsource.InterfaceC3510w7
    public void a(String str, JSONObject jSONObject) {
    }

    public void b(Context context) {
        this.f35746a.b(context);
    }

    public JSONObject a(Context context) {
        return this.f35746a.c(context);
    }

    public void b() {
        this.f35746a.a();
    }

    private InterfaceC3493v7 a(JSONObject jSONObject, Context context) {
        if (jSONObject.optInt(C3191e4.i.f36536g0) == 1) {
            return new BroadcastReceiverStrategy(this);
        }
        if (!C1.c(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return new BroadcastReceiverStrategy(this);
        }
        return new C3288jc(this);
    }
}
