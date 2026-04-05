package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.util.IAlog;
import java.text.SimpleDateFormat;
import java.util.Locale;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class w {

    /* renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f24323h = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    /* renamed from: a, reason: collision with root package name */
    public InneractiveAdRequest f24324a;

    /* renamed from: b, reason: collision with root package name */
    public t f24325b;

    /* renamed from: c, reason: collision with root package name */
    public u f24326c;

    /* renamed from: d, reason: collision with root package name */
    public JSONArray f24327d;

    /* renamed from: e, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.response.e f24328e;

    /* renamed from: f, reason: collision with root package name */
    public final JSONArray f24329f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f24330g;

    public w(t tVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f24325b = tVar;
        this.f24324a = null;
        this.f24327d = null;
    }

    public final w a(Object... objArr) {
        if (objArr.length > 0) {
            JSONObject jSONObject = new JSONObject();
            for (int i10 = 0; i10 < objArr.length - 1; i10 += 2) {
                String string = objArr[i10].toString();
                Object obj = objArr[i10 + 1];
                try {
                    jSONObject.put(string, obj);
                } catch (Exception unused) {
                    IAlog.f("Got exception adding param to json object: %s, %s", string, obj);
                }
            }
            this.f24329f.put(jSONObject);
        }
        return this;
    }

    public w(t tVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f24325b = tVar;
        this.f24324a = inneractiveAdRequest;
        this.f24327d = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.w.a(java.lang.String):void");
    }

    public w(u uVar) {
        this((com.fyber.inneractive.sdk.response.e) null);
        this.f24326c = uVar;
        this.f24324a = null;
        this.f24327d = null;
    }

    public w(u uVar, InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.response.e eVar) {
        this(eVar);
        this.f24326c = uVar;
        this.f24324a = inneractiveAdRequest;
        this.f24327d = null;
    }

    public w(com.fyber.inneractive.sdk.response.e eVar) {
        this.f24330g = false;
        this.f24328e = eVar;
        this.f24329f = new JSONArray();
    }
}
