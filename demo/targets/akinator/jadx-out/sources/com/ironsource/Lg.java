package com.ironsource;

import android.content.Context;
import com.ironsource.C3191e4;
import com.ironsource.C3460t8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.controller.FeaturesManager;
import com.ironsource.sdk.utils.Logger;
import com.unity3d.ads.core.domain.offerwall.Xn.KGUkpTlXZlJLy;
import h2.rl.UeklptUrP;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class Lg {

    /* renamed from: a, reason: collision with root package name */
    private final String f34810a;

    /* renamed from: b, reason: collision with root package name */
    private Context f34811b;

    /* renamed from: c, reason: collision with root package name */
    private C3245h4 f34812c;

    /* renamed from: d, reason: collision with root package name */
    private Z4 f34813d;

    /* renamed from: e, reason: collision with root package name */
    private int f34814e;

    /* renamed from: f, reason: collision with root package name */
    private C3281j5 f34815f;

    /* renamed from: g, reason: collision with root package name */
    private int f34816g;

    /* renamed from: h, reason: collision with root package name */
    private int f34817h;

    /* renamed from: i, reason: collision with root package name */
    private final String f34818i = "Lg";

    /* renamed from: j, reason: collision with root package name */
    private a f34819j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        NOT_RECOVERED,
        RECOVERED,
        IN_RECOVERING,
        NOT_ALLOWED
    }

    public Lg(Context context, C3245h4 c3245h4, Z4 z42, int i10, C3281j5 c3281j5, String str) {
        a aVarH = h();
        this.f34819j = aVarH;
        if (aVarH != a.NOT_ALLOWED) {
            this.f34811b = context;
            this.f34812c = c3245h4;
            this.f34813d = z42;
            this.f34814e = i10;
            this.f34815f = c3281j5;
            this.f34816g = 0;
        }
        this.f34810a = str;
    }

    private void j() {
        if (this.f34816g != this.f34817h) {
            this.f34819j = a.NOT_RECOVERED;
            return;
        }
        Logger.i(this.f34818i, "handleRecoveringEndedFailed | Reached max trials");
        this.f34819j = a.NOT_ALLOWED;
        a();
    }

    private void k() {
        a();
        this.f34819j = a.RECOVERED;
    }

    public boolean a(C3460t8.c cVar, C3460t8.b bVar) {
        Logger.i(this.f34818i, "shouldRecoverWebController: ");
        a aVar = this.f34819j;
        if (aVar == a.NOT_ALLOWED) {
            Logger.i(this.f34818i, "shouldRecoverWebController: false | recover is not allowed");
            return false;
        }
        if (cVar != C3460t8.c.Native) {
            Logger.i(this.f34818i, "shouldRecoverWebController: false | current controller type is: " + cVar);
            return false;
        }
        if (bVar == C3460t8.b.Loading || bVar == C3460t8.b.None) {
            Logger.i(this.f34818i, "shouldRecoverWebController: false | a Controller is currently loading");
            return false;
        }
        if (aVar == a.RECOVERED) {
            Logger.i(this.f34818i, "shouldRecoverWebController: false | already recovered");
            return false;
        }
        if (aVar == a.IN_RECOVERING) {
            Logger.i(this.f34818i, "shouldRecoverWebController: false | currently in recovering");
            return false;
        }
        if (this.f34811b == null || this.f34812c == null || this.f34813d == null) {
            Logger.i(this.f34818i, "shouldRecoverWebController: false | missing mandatory param");
            return false;
        }
        Logger.i(this.f34818i, "shouldRecoverWebController: true | allow recovering ");
        return true;
    }

    public Context b() {
        return this.f34811b;
    }

    public String c() {
        return this.f34810a;
    }

    public C3245h4 d() {
        return this.f34812c;
    }

    public int e() {
        return this.f34814e;
    }

    public Z4 f() {
        return this.f34813d;
    }

    public C3281j5 g() {
        return this.f34815f;
    }

    public boolean l() {
        return this.f34819j == a.IN_RECOVERING;
    }

    public boolean m() {
        return this.f34819j == a.RECOVERED;
    }

    public void n() {
        a aVar = this.f34819j;
        a aVar2 = a.IN_RECOVERING;
        if (aVar != aVar2) {
            this.f34816g++;
            Logger.i(this.f34818i, "recoveringStarted - trial number " + this.f34816g);
            this.f34819j = aVar2;
        }
    }

    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(UeklptUrP.RfRdViv, m());
            jSONObject.put(C3191e4.h.B0, this.f34816g);
            jSONObject.put(C3191e4.h.C0, this.f34817h);
            return jSONObject;
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }

    private a h() {
        this.f34817h = FeaturesManager.getInstance().getInitRecoverTrials();
        Logger.i(this.f34818i, KGUkpTlXZlJLy.GcarHVrZyE + this.f34817h);
        if (this.f34817h <= 0) {
            Logger.i(this.f34818i, "recovery is not allowed by config");
            return a.NOT_ALLOWED;
        }
        return a.NOT_RECOVERED;
    }

    public void a() {
        this.f34811b = null;
        this.f34812c = null;
        this.f34813d = null;
        this.f34815f = null;
    }

    public void a(boolean z10) {
        if (this.f34819j != a.IN_RECOVERING) {
            return;
        }
        if (z10) {
            k();
        } else {
            j();
        }
    }
}
