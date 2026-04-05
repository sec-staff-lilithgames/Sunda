package com.mbridge.msdk.tracker;

import com.amazon.device.ads.DTBAdRequest;
import java.io.Serializable;
import java.util.UUID;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class e implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f43887a;

    /* renamed from: d, reason: collision with root package name */
    private JSONObject f43890d;

    /* renamed from: i, reason: collision with root package name */
    private h f43895i;

    /* renamed from: b, reason: collision with root package name */
    private int f43888b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f43889c = 0;

    /* renamed from: g, reason: collision with root package name */
    private long f43893g = 0;

    /* renamed from: h, reason: collision with root package name */
    private long f43894h = DTBAdRequest.WEEK;

    /* renamed from: j, reason: collision with root package name */
    private boolean f43896j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f43897k = false;

    /* renamed from: f, reason: collision with root package name */
    private long f43892f = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private String f43891e = UUID.randomUUID().toString();

    public e(String str) {
        this.f43887a = str;
    }

    public void a(int i10) {
        this.f43889c = i10;
    }

    public String b() {
        return this.f43887a;
    }

    public int c() {
        return this.f43889c;
    }

    public JSONObject d() {
        JSONObject jSONObject = this.f43890d;
        if (jSONObject != null) {
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        this.f43890d = jSONObject2;
        return jSONObject2;
    }

    public h e() {
        return this.f43895i;
    }

    public long f() {
        return this.f43894h;
    }

    public long g() {
        return this.f43892f;
    }

    public int h() {
        return this.f43888b;
    }

    public String i() {
        return this.f43891e;
    }

    public boolean j() {
        return this.f43897k;
    }

    public boolean k() {
        return this.f43896j;
    }

    public void a(JSONObject jSONObject) {
        this.f43890d = jSONObject;
    }

    public void b(int i10) {
        this.f43888b = i10;
    }

    public void c(long j10) {
        this.f43892f = j10;
    }

    public void a(String str) {
        this.f43891e = str;
    }

    public void b(long j10) {
        this.f43894h = j10;
    }

    public long a() {
        return this.f43893g;
    }

    public void a(long j10) {
        this.f43893g = j10;
    }

    public void a(h hVar) {
        this.f43895i = hVar;
    }

    public void a(boolean z10) {
        this.f43897k = z10;
    }
}
