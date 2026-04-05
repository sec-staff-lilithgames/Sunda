package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.C3134b1;
import com.ironsource.C3422r4;
import com.ironsource.C3518wf;
import com.ironsource.O8;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j1.o2;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class A implements O8.b {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f37238a;

    /* renamed from: b, reason: collision with root package name */
    protected C3134b1 f37239b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f37240c;

    /* renamed from: d, reason: collision with root package name */
    protected JSONObject f37241d;

    /* renamed from: e, reason: collision with root package name */
    protected String f37242e;

    /* renamed from: f, reason: collision with root package name */
    protected int f37243f;

    /* renamed from: g, reason: collision with root package name */
    protected Long f37244g = null;

    public A(C3134b1 c3134b1, AbstractAdapter abstractAdapter) {
        this.f37239b = c3134b1;
        this.f37238a = abstractAdapter;
        this.f37241d = c3134b1.c();
    }

    public void a(boolean z10) {
        this.f37240c = z10;
    }

    @Override // com.ironsource.O8.b
    public int b() {
        return this.f37239b.e();
    }

    @Override // com.ironsource.O8.b
    public String c() {
        return this.f37239b.f();
    }

    public abstract IronSource.a d();

    public Long e() {
        return this.f37244g;
    }

    public String f() {
        return o2.g(hashCode(), i(), " ");
    }

    public int g() {
        return this.f37239b.d();
    }

    public boolean h() {
        return this.f37240c;
    }

    public String i() {
        return this.f37239b.h().isMultipleInstances() ? this.f37239b.h().getProviderTypeForReflection() : this.f37239b.h().getProviderName();
    }

    public String j() {
        return this.f37239b.g();
    }

    public abstract String k();

    public int l() {
        return 1;
    }

    public Map<String, Object> m() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f37238a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f37238a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f37239b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f37239b.a());
            map.put("instanceType", Integer.valueOf(p() ? 2 : 1));
            map.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(l()));
            if (!TextUtils.isEmpty(this.f37242e)) {
                map.put("dynamicDemandSource", this.f37242e);
            }
            return map;
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + c() + ")", th2);
            return map;
        }
    }

    public int n() {
        return this.f37243f;
    }

    public boolean o() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        try {
            if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !this.f37238a.isUsingActivityBeforeImpression(C3518wf.a(d()))) {
                return false;
            }
            ironLog.verbose(c() + " - is using activity before impression and activity is null");
            return true;
        } catch (Throwable th2) {
            C3422r4.d().a(th2);
            b("Exception while calling adapter.isUsingActivityBeforeImpression() - " + th2.getLocalizedMessage());
            return true;
        }
    }

    public boolean p() {
        return this.f37239b.j();
    }

    public void q() {
        this.f37238a = null;
    }

    public boolean r() {
        if (o()) {
            return false;
        }
        return p() || s();
    }

    public boolean s() {
        return this.f37239b.k();
    }

    public void a(String str) {
        a(str, 0);
    }

    public void b(String str) {
        a(str, 3);
    }

    public void c(String str) {
        this.f37242e = d.b().c(str);
    }

    private void a(String str, int i10) {
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, k() + " " + c() + " : " + str, i10);
    }
}
