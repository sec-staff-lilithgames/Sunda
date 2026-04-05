package com.fyber.inneractive.sdk.metrics;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import java.util.HashMap;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class c extends a {

    /* renamed from: g, reason: collision with root package name */
    public static final String f24038g = String.valueOf(24);

    /* renamed from: h, reason: collision with root package name */
    public static final String f24039h = String.valueOf(3);

    /* renamed from: i, reason: collision with root package name */
    public static final String f24040i = String.valueOf(24);

    /* renamed from: j, reason: collision with root package name */
    public static final String f24041j = String.valueOf(3);

    /* renamed from: b, reason: collision with root package name */
    public final String f24042b;

    /* renamed from: c, reason: collision with root package name */
    public final UnitDisplayType f24043c;

    /* renamed from: d, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f24044d;

    /* renamed from: e, reason: collision with root package name */
    public final InneractiveAdRequest f24045e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONArray f24046f;

    public c(com.fyber.inneractive.sdk.response.e eVar, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f24044d = eVar;
        this.f24045e = inneractiveAdRequest;
        this.f24042b = str;
        this.f24043c = unitDisplayType;
        this.f24046f = jSONArray;
    }

    public final void a() {
        d dVar = d.f24047d;
        g gVarA = dVar.a(this.f24042b);
        HashMap mapJ = gVarA.j();
        if (!gVarA.a()) {
            IAlog.a("MetricCreativeReporter: Metric data not valid, data: %s", dVar.a(this.f24042b).toString());
            return;
        }
        dVar.f24048a.remove(this.f24042b);
        r.f26803a.execute(new b(this, gVarA, mapJ));
    }
}
