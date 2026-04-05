package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.OnCompletionListener;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: h, reason: collision with root package name */
    private static boolean f40394h = true;

    /* renamed from: i, reason: collision with root package name */
    private static boolean f40395i = true;

    /* renamed from: b, reason: collision with root package name */
    protected AuthorityInfoBean f40397b;

    /* renamed from: g, reason: collision with root package name */
    private e f40402g;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f40396a = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    private int f40398c = 3;

    /* renamed from: d, reason: collision with root package name */
    private int f40399d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f40400e = 0;

    /* renamed from: f, reason: collision with root package name */
    private String f40401f = "";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f40403a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ OnCompletionListener f40404b;

        public a(Context context, OnCompletionListener onCompletionListener) {
            this.f40403a = context;
            this.f40404b = onCompletionListener;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f40403a);
            this.f40404b.onCompletion();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.b$b, reason: collision with other inner class name */
    public class C0264b implements e.a {
        public C0264b() {
        }

        @Override // com.mbridge.msdk.foundation.controller.e.a
        public void a() {
            b.this.k();
        }
    }

    public b() {
        h();
    }

    public static void b(boolean z10) {
        f40395i = z10;
    }

    public static boolean i() {
        return f40394h;
    }

    public static boolean j() {
        return f40395i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        boolean zC = this.f40402g.c();
        b(this.f40402g.b());
        d(zC ? 1 : 2);
        this.f40397b.authDeviceIdStatus(zC ? 1 : 0);
    }

    public abstract int a(g gVar, String str);

    public int c() {
        return this.f40399d;
    }

    public int d() {
        return this.f40400e;
    }

    public int e() {
        return this.f40398c;
    }

    public String f() {
        return this.f40401f;
    }

    public String g() throws JSONException {
        JSONArray jSONArray = new JSONArray();
        g gVarC = h.b().c();
        for (int i10 = 0; i10 < this.f40396a.size(); i10++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f40396a.get(i10)));
                jSONObject.put("client_status", a(this.f40396a.get(i10)));
                jSONObject.put("server_status", a(gVarC, this.f40396a.get(i10)));
                jSONArray.put(jSONObject);
            } catch (JSONException e10) {
                e10.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public void h() {
        AuthorityInfoBean authorityInfoBean = new AuthorityInfoBean();
        this.f40397b = authorityInfoBean;
        try {
            authorityInfoBean.authGenDataStatus(1);
            this.f40397b.authDeviceIdStatus(1);
            this.f40397b.authSerialIdStatus(1);
            this.f40397b.authOtherDataStatus(1);
            this.f40396a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f40396a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f40396a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f40396a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e10) {
            p0.b("SDKAuthorityController", e10.getMessage());
        }
    }

    private void d(int i10) {
        this.f40398c = i10 != 1 ? 2 : 1;
    }

    public boolean b() {
        int i10 = this.f40398c;
        return i10 == 1 || i10 == 3;
    }

    public void c(int i10) {
        this.f40400e = i10;
    }

    public static void a(boolean z10) {
        f40394h = z10;
    }

    public void b(int i10) {
        this.f40399d = i10;
    }

    private void b(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f40401f = str;
    }

    public AuthorityInfoBean a() {
        AuthorityInfoBean authorityInfoBean = this.f40397b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public void a(int i10) {
        this.f40398c = i10 != 1 ? 2 : 1;
        if (this.f40397b != null) {
            d(i10);
        }
    }

    public void a(Context context, OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context, onCompletionListener));
        } else {
            a(context);
        }
    }

    public int a(String str) {
        AuthorityInfoBean authorityInfoBean;
        try {
            if (TextUtils.isEmpty(str) || (authorityInfoBean = this.f40397b) == null) {
                return 0;
            }
            return authorityInfoBean.getStatusByKey(str);
        } catch (Exception e10) {
            p0.b("SDKAuthorityController", e10.getMessage());
            return 0;
        }
    }

    public void a(String str, int i10) {
        if (TextUtils.isEmpty(str) || this.f40397b == null) {
            return;
        }
        str.getClass();
        switch (str) {
            case "authority_serial_id":
                this.f40397b.authSerialIdStatus(i10);
                break;
            case "authority_all_info":
                this.f40397b.a(i10);
                break;
            case "authority_device_id":
                this.f40397b.authDeviceIdStatus(i10);
                break;
            case "authority_general_data":
                this.f40397b.authGenDataStatus(i10);
                break;
            case "authority_other":
                this.f40397b.authOtherDataStatus(i10);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f40402g == null) {
                e eVar = new e(context);
                this.f40402g = eVar;
                eVar.a(new C0264b());
            }
            k();
        } catch (Throwable th2) {
            p0.b("SDKAuthorityController", th2.getMessage());
        }
    }
}
