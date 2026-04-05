package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.b6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class o5 extends g5 {

    /* renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f14979g;

    /* renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f14980h;

    /* renamed from: i, reason: collision with root package name */
    private final b6.b f14981i;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements AppLovinPostbackListener {
        public a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            o5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (o5.this.f14980h != null) {
                o5.this.f14980h.onPostbackSuccess(o5.this.f14979g.f());
            }
        }
    }

    public o5(com.applovin.impl.sdk.network.e eVar, b6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f14979g = eVar;
        this.f14980h = appLovinPostbackListener;
        this.f14981i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f14979g, b());
        bVar.a(this.f14981i);
        b().r0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f14979g.f())) {
            if (this.f14979g.u()) {
                b().y0().a(this.f14979g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.d(this.f14004b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f14980h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f14979g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends j6 {

        /* renamed from: m, reason: collision with root package name */
        final String f14983m;

        public b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f14983m = o5.this.f14979g.f();
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f14003a.c(v4.f15968l0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.f14003a);
                                r0.b(jSONObject, this.f14003a);
                                r0.a(jSONObject, this.f14003a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (o5.this.f14980h != null) {
                o5.this.f14980h.onPostbackSuccess(this.f14983m);
            }
            if (o5.this.f14979g.t()) {
                this.f14003a.u().a(o5.this.f14979g.s(), this.f14983m, i10, obj, null, true);
            }
        }

        @Override // com.applovin.impl.j6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                com.applovin.impl.sdk.o oVar = this.f14005c;
                String str3 = this.f14004b;
                StringBuilder sbT = p0.o2.t(i10, "Failed to dispatch postback. Error code: ", " URL: ");
                sbT.append(this.f14983m);
                oVar.b(str3, sbT.toString());
            }
            if (o5.this.f14980h != null) {
                o5.this.f14980h.onPostbackFailure(this.f14983m, i10);
            }
            if (o5.this.f14979g.t()) {
                this.f14003a.u().a(o5.this.f14979g.s(), this.f14983m, i10, obj, str2, false);
            }
        }
    }
}
