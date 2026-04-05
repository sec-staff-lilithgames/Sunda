package com.mbridge.msdk.click.retry;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class b {

    /* renamed from: k, reason: collision with root package name */
    public static int f39803k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f39804l = 1;

    /* renamed from: a, reason: collision with root package name */
    private final String f39805a;

    /* renamed from: b, reason: collision with root package name */
    private int f39806b;

    /* renamed from: c, reason: collision with root package name */
    private final HashSet<String> f39807c = new HashSet<>();

    /* renamed from: d, reason: collision with root package name */
    private final long f39808d = System.currentTimeMillis();

    /* renamed from: e, reason: collision with root package name */
    private CampaignEx f39809e;

    /* renamed from: f, reason: collision with root package name */
    private String f39810f;

    /* renamed from: g, reason: collision with root package name */
    private int f39811g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39812h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f39813i;

    /* renamed from: j, reason: collision with root package name */
    private int f39814j;

    public b(String str, String str2) {
        this.f39805a = str;
        a(str2);
    }

    public void a(boolean z10) {
        this.f39812h = z10;
    }

    public void b(boolean z10) {
        this.f39813i = z10;
    }

    public long c() {
        return this.f39808d;
    }

    public int d() {
        return this.f39814j;
    }

    public int e() {
        return this.f39806b;
    }

    public String f() {
        return this.f39810f;
    }

    public String g() {
        return this.f39805a;
    }

    public int h() {
        return this.f39811g;
    }

    public boolean i() {
        return this.f39812h;
    }

    public boolean j() {
        return this.f39813i;
    }

    public void a(int i10) {
        this.f39814j = i10;
    }

    public void b(int i10) {
        this.f39811g = i10;
    }

    public CampaignEx a() {
        return this.f39809e;
    }

    public void b(String str) {
        this.f39810f = str;
    }

    public void a(CampaignEx campaignEx) {
        this.f39809e = campaignEx;
    }

    public HashSet<String> b() {
        return this.f39807c;
    }

    public void a(String str) {
        this.f39806b++;
        this.f39807c.add(str);
    }
}
