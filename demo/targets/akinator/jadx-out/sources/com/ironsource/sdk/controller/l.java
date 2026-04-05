package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C3460t8;
import com.ironsource.InterfaceC3507w4;
import com.ironsource.InterfaceC3524x4;
import com.ironsource.InterfaceC3541y4;
import com.ironsource.Ob;
import com.ironsource.Y4;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public interface l {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface a {
        void a(f.a aVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b {
        void a(Ob ob2);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(Y4 y42);

    void a(Y4 y42, Map<String, String> map, InterfaceC3507w4 interfaceC3507w4);

    void a(Y4 y42, Map<String, String> map, InterfaceC3524x4 interfaceC3524x4);

    void a(f.c cVar, a aVar);

    void a(String str, InterfaceC3524x4 interfaceC3524x4);

    void a(String str, String str2, Y4 y42, InterfaceC3507w4 interfaceC3507w4);

    void a(String str, String str2, Y4 y42, InterfaceC3524x4 interfaceC3524x4);

    void a(String str, String str2, Y4 y42, InterfaceC3541y4 interfaceC3541y4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC3507w4 interfaceC3507w4);

    void a(JSONObject jSONObject, InterfaceC3524x4 interfaceC3524x4);

    void a(JSONObject jSONObject, InterfaceC3541y4 interfaceC3541y4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(Y4 y42);

    void b(Y4 y42, Map<String, String> map, InterfaceC3524x4 interfaceC3524x4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C3460t8.c h();
}
