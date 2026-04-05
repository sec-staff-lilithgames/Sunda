package com.ironsource;

import android.text.TextUtils;
import android.util.Pair;
import ao.kwoC.zAQQWzBxnS;
import com.amazon.aps.shared.metrics.model.ApsMetricsTahoeDataModel;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
@Deprecated
/* renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C3161ca {

    /* renamed from: m, reason: collision with root package name */
    public static final String f36141m = "age";

    /* renamed from: n, reason: collision with root package name */
    public static final String f36142n = "gen";

    /* renamed from: o, reason: collision with root package name */
    public static final String f36143o = "lvl";

    /* renamed from: p, reason: collision with root package name */
    public static final String f36144p = "pay";

    /* renamed from: q, reason: collision with root package name */
    public static final String f36145q = "iapt";

    /* renamed from: r, reason: collision with root package name */
    public static final String f36146r = "ucd";

    /* renamed from: s, reason: collision with root package name */
    private static final String f36147s = "segName";

    /* renamed from: a, reason: collision with root package name */
    private String f36148a;

    /* renamed from: g, reason: collision with root package name */
    private String f36154g;

    /* renamed from: b, reason: collision with root package name */
    private int f36149b = 999999;

    /* renamed from: c, reason: collision with root package name */
    private double f36150c = 999999.99d;

    /* renamed from: d, reason: collision with root package name */
    private final String f36151d = ApsMetricsTahoeDataModel.TAHOE_EVENT_CATEGORY_CUSTOM;

    /* renamed from: e, reason: collision with root package name */
    private final int f36152e = 5;

    /* renamed from: f, reason: collision with root package name */
    private int f36153f = -1;

    /* renamed from: h, reason: collision with root package name */
    private int f36155h = -1;

    /* renamed from: i, reason: collision with root package name */
    private AtomicBoolean f36156i = null;

    /* renamed from: j, reason: collision with root package name */
    private double f36157j = -1.0d;

    /* renamed from: k, reason: collision with root package name */
    private long f36158k = 0;

    /* renamed from: l, reason: collision with root package name */
    private ArrayList<Pair<String, String>> f36159l = new ArrayList<>();

    @Deprecated
    public int a() {
        return this.f36153f;
    }

    @Deprecated
    public String b() {
        return this.f36154g;
    }

    public double c() {
        return this.f36157j;
    }

    public AtomicBoolean d() {
        return this.f36156i;
    }

    public int e() {
        return this.f36155h;
    }

    public ArrayList<Pair<String, String>> f() {
        ArrayList<Pair<String, String>> arrayList = new ArrayList<>();
        if (this.f36153f != -1) {
            arrayList.add(new Pair<>("age", a.b.f(this.f36153f, "", new StringBuilder())));
        }
        if (!TextUtils.isEmpty(this.f36154g)) {
            arrayList.add(new Pair<>(f36142n, this.f36154g));
        }
        if (this.f36155h != -1) {
            arrayList.add(new Pair<>("lvl", a.b.f(this.f36155h, "", new StringBuilder())));
        }
        if (this.f36156i != null) {
            arrayList.add(new Pair<>("pay", this.f36156i + ""));
        }
        if (this.f36157j != -1.0d) {
            arrayList.add(new Pair<>("iapt", this.f36157j + ""));
        }
        if (this.f36158k != 0) {
            arrayList.add(new Pair<>("ucd", a.b.g(this.f36158k, "", new StringBuilder())));
        }
        if (!TextUtils.isEmpty(this.f36148a)) {
            arrayList.add(new Pair<>("segName", this.f36148a));
        }
        arrayList.addAll(this.f36159l);
        return arrayList;
    }

    public String g() {
        return this.f36148a;
    }

    public long h() {
        return this.f36158k;
    }

    public JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Iterator<Pair<String, String>> it = f().iterator();
        while (it.hasNext()) {
            Pair<String, String> next = it.next();
            try {
                jSONObject.put((String) next.first, next.second);
            } catch (JSONException e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error("exception " + e10.getMessage());
            }
        }
        return jSONObject;
    }

    private boolean b(String str) {
        if (str == null) {
            return false;
        }
        return str.matches("^[a-zA-Z0-9]*$");
    }

    public void a(int i10) {
        if (i10 > 0 && i10 < this.f36149b) {
            this.f36155h = i10;
            return;
        }
        IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        StringBuilder sbT = p0.o2.t(i10, "setLevel( ", " ) level must be between 1-");
        sbT.append(this.f36149b);
        logger.log(ironSourceTag, sbT.toString(), 2);
    }

    public void a(boolean z10) {
        if (this.f36156i == null) {
            this.f36156i = new AtomicBoolean();
        }
        this.f36156i.set(z10);
    }

    public void a(double d10) {
        if (d10 > 0.0d && d10 < this.f36150c) {
            this.f36157j = Math.floor(d10 * 100.0d) / 100.0d;
            return;
        }
        IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setIAPTotal( " + d10 + " ) iapt must be between 0-" + this.f36150c, 2);
    }

    public void a(long j10) {
        if (j10 > 0) {
            this.f36158k = j10;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, p0.o2.n(j10, "setUserCreationDate( ", " ) is an invalid timestamp"), 2);
        }
    }

    public void a(String str) {
        if (b(str) && a(str, 1, 32)) {
            this.f36148a = str;
        } else {
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, a.b.l(zAQQWzBxnS.wiTEXig, str, " ) segment name must be alphanumeric and 1-32 in length"), 2);
        }
    }

    public void a(String str, String str2) {
        try {
            if (b(str) && b(str2) && a(str, 1, 32) && a(str2, 1, 32)) {
                String str3 = "custom_" + str;
                if (this.f36159l.size() >= 5) {
                    this.f36159l.remove(0);
                }
                this.f36159l.add(new Pair<>(str3, str2));
                return;
            }
            IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.INTERNAL, "setCustom( " + str + " , " + str2 + " ) key and value must be alphanumeric and 1-32 in length", 2);
        } catch (Exception e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    private boolean a(String str, int i10, int i11) {
        return str != null && str.length() >= i10 && str.length() <= i11;
    }
}
