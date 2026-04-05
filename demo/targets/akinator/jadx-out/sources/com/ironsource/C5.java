package com.ironsource;

import com.ironsource.InterfaceC3456t4;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class C5 {

    /* renamed from: e, reason: collision with root package name */
    static final String f33914e = "euid";

    /* renamed from: f, reason: collision with root package name */
    static final String f33915f = "esat";

    /* renamed from: g, reason: collision with root package name */
    static final String f33916g = "esfr";

    /* renamed from: h, reason: collision with root package name */
    static final int f33917h = 1;

    /* renamed from: a, reason: collision with root package name */
    private int f33918a;

    /* renamed from: b, reason: collision with root package name */
    private long f33919b;

    /* renamed from: c, reason: collision with root package name */
    private int f33920c;

    /* renamed from: d, reason: collision with root package name */
    private final JSONObject f33921d;

    public C5(D5 d52, JSONObject jSONObject) {
        this(d52.b(), jSONObject);
    }

    public String a() {
        return this.f33921d.toString();
    }

    public JSONObject b() {
        return this.f33921d;
    }

    public int c() {
        return this.f33918a;
    }

    public long d() {
        return this.f33919b;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5 c52 = (C5) obj;
        return this.f33918a == c52.f33918a && this.f33919b == c52.f33919b && this.f33920c == c52.f33920c && C3479ua.a(this.f33921d, c52.f33921d);
    }

    public int hashCode() {
        return ((this.f33921d.toString().hashCode() + p0.o2.d(Integer.hashCode(this.f33918a) * 31, 31, this.f33919b)) * 31) + this.f33920c;
    }

    public String toString() {
        return ("{\"eventId\":" + c() + ",\"timestamp\":" + d() + "," + a().substring(1) + "}").replace(",", "\n");
    }

    public C5(int i10, JSONObject jSONObject) {
        this(i10, new InterfaceC3456t4.a().a(), jSONObject);
    }

    public void a(int i10) {
        this.f33918a = i10;
    }

    public C5(int i10, long j10, String str) throws JSONException {
        this(i10, j10, new JSONObject(str));
    }

    public void a(String str, Object obj) throws JSONException {
        if (str == null || obj == null) {
            return;
        }
        try {
            this.f33921d.put(str, obj);
        } catch (JSONException e10) {
            C3422r4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C5(D5 d52, long j10, JSONObject jSONObject) {
        this(d52.b(), j10, jSONObject);
    }

    public C5(int i10, long j10, JSONObject jSONObject) throws JSONException {
        this.f33920c = 1;
        this.f33918a = i10;
        this.f33919b = j10;
        jSONObject = jSONObject == null ? new JSONObject() : jSONObject;
        this.f33921d = jSONObject;
        if (!jSONObject.has(f33914e)) {
            a(f33914e, UUID.randomUUID().toString());
        }
        if (!jSONObject.has(f33915f)) {
            a(f33915f, Integer.valueOf(this.f33920c));
        } else {
            this.f33920c = jSONObject.optInt(f33915f, 1);
        }
    }

    public void a(String str) throws JSONException {
        a(f33916g, str);
        int i10 = this.f33920c + 1;
        this.f33920c = i10;
        a(f33915f, Integer.valueOf(i10));
    }
}
