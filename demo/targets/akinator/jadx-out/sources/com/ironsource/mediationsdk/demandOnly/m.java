package com.ironsource.mediationsdk.demandOnly;

import android.text.TextUtils;
import com.ironsource.C3125aa;
import com.ironsource.C3134b1;
import com.ironsource.C3422r4;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    protected AbstractAdapter f37470a;

    /* renamed from: b, reason: collision with root package name */
    protected C3134b1 f37471b;

    /* renamed from: c, reason: collision with root package name */
    protected JSONObject f37472c;

    /* renamed from: d, reason: collision with root package name */
    private a f37473d;

    /* renamed from: e, reason: collision with root package name */
    private Timer f37474e;

    /* renamed from: f, reason: collision with root package name */
    long f37475f;

    /* renamed from: g, reason: collision with root package name */
    protected String f37476g;

    /* renamed from: h, reason: collision with root package name */
    protected JSONObject f37477h;

    /* renamed from: i, reason: collision with root package name */
    protected List<String> f37478i;

    /* renamed from: j, reason: collision with root package name */
    protected String f37479j;

    /* renamed from: k, reason: collision with root package name */
    private final Object f37480k = new Object();

    /* renamed from: l, reason: collision with root package name */
    private final Object f37481l = new Object();

    /* renamed from: m, reason: collision with root package name */
    protected final IronSource.a f37482m;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public m(C3134b1 c3134b1, AbstractAdapter abstractAdapter) throws JSONException {
        this.f37471b = c3134b1;
        this.f37482m = c3134b1.b();
        this.f37470a = abstractAdapter;
        JSONObject jSONObjectC = c3134b1.c();
        this.f37472c = jSONObjectC;
        try {
            jSONObjectC.put(IronSourceLoadParameters.Constants.DEMAND_ONLY, true);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
        }
        this.f37473d = a.NOT_LOADED;
        this.f37474e = null;
        this.f37476g = "";
        this.f37477h = null;
        this.f37478i = new ArrayList();
    }

    public boolean a(a aVar, a aVar2) {
        synchronized (this.f37480k) {
            try {
                if (this.f37473d != aVar) {
                    return false;
                }
                b(aVar2);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b(a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f37471b.f() + ": current state=" + this.f37473d + ", new state=" + aVar);
        synchronized (this.f37480k) {
            this.f37473d = aVar;
        }
    }

    public C3134b1 f() {
        return this.f37471b;
    }

    public String g() {
        return this.f37476g;
    }

    public String h() {
        return this.f37471b.f();
    }

    public int i() {
        return this.f37471b.d();
    }

    public Map<String, Object> j() {
        HashMap map = new HashMap();
        try {
            AbstractAdapter abstractAdapter = this.f37470a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, abstractAdapter != null ? abstractAdapter.getVersion() : "");
            AbstractAdapter abstractAdapter2 = this.f37470a;
            map.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, abstractAdapter2 != null ? abstractAdapter2.getCoreSDKVersion() : "");
            map.put("spId", this.f37471b.i());
            map.put(IronSourceConstants.EVENTS_PROVIDER, this.f37471b.a());
            map.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            map.put("instanceType", Integer.valueOf(this.f37471b.d()));
            if (!TextUtils.isEmpty(this.f37476g)) {
                map.put("auctionId", this.f37476g);
            }
            JSONObject jSONObject = this.f37477h;
            if (jSONObject != null && jSONObject.length() > 0) {
                map.put("genericParams", this.f37477h);
            }
            if (!TextUtils.isEmpty(this.f37479j)) {
                map.put("dynamicDemandSource", this.f37479j);
            }
            if (o()) {
                map.put("isOneFlow", 1);
            }
            return map;
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronSourceLoggerManager.getLogger().logException(IronSourceLogger.IronSourceTag.NATIVE, "getProviderEventData " + h() + ")", e10);
            return map;
        }
    }

    public String k() {
        a aVar = this.f37473d;
        return aVar == null ? AbstractJsonLexerKt.NULL : aVar.toString();
    }

    public String l() {
        return this.f37471b.i();
    }

    public List<String> m() {
        return this.f37478i;
    }

    public boolean n() {
        return this.f37471b.j();
    }

    public boolean o() {
        return this.f37472c.optBoolean("isOneFlow", false);
    }

    public void p() {
        synchronized (this.f37481l) {
            try {
                Timer timer = this.f37474e;
                if (timer != null) {
                    timer.cancel();
                    this.f37474e = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public a a(a[] aVarArr, a aVar) {
        a aVar2;
        synchronized (this.f37480k) {
            try {
                aVar2 = this.f37473d;
                if (Arrays.asList(aVarArr).contains(this.f37473d)) {
                    b(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar2;
    }

    public void b(String str) {
        this.f37479j = com.ironsource.mediationsdk.d.b().c(str);
    }

    public boolean a(a aVar) {
        boolean z10;
        synchronized (this.f37480k) {
            z10 = this.f37473d == aVar;
        }
        return z10;
    }

    public void a(boolean z10) throws JSONException {
        try {
            this.f37472c.put("isOneFlow", z10);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.verbose("Can't set isOneFlow = " + z10 + ". Error: " + e10.getMessage());
        }
    }

    public void a(TimerTask timerTask) {
        synchronized (this.f37481l) {
            p();
            Timer timer = new Timer();
            this.f37474e = timer;
            timer.schedule(timerTask, this.f37475f);
        }
    }

    public void a(String str) {
        this.f37476g = str;
    }

    public void a(JSONObject jSONObject) {
        this.f37477h = jSONObject;
    }

    public void a(List<String> list, String str, int i10, String str2, String str3) {
        Iterator it = ((List) C3125aa.a((ArrayList) list, new ArrayList())).iterator();
        while (it.hasNext()) {
            String str4 = str;
            int i11 = i10;
            com.ironsource.mediationsdk.d.b().a(str3, str4, com.ironsource.mediationsdk.d.b().a((String) it.next(), str4, i11, str2, "", "", "", ""));
            str = str4;
            i10 = i11;
        }
    }
}
