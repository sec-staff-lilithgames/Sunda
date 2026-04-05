package com.mbridge.msdk.tracker;

import java.io.Serializable;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class i implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    static String f43902i = "CREATE TABLE IF NOT EXISTS %s (id INTEGER PRIMARY KEY,uuid TEXT,name TEXT,type INTEGER,time_stamp INTEGER,duration INTEGER,properties TEXT,priority INTEGER,state INTEGER,invalid_time INTEGER,ignore_max_timeout INTEGER,ignore_max_retry_times INTEGER,report_error_message TEXT,report_count INTEGER)";

    /* renamed from: j, reason: collision with root package name */
    static String f43903j = "DROP TABLE IF EXISTS %s";

    /* renamed from: a, reason: collision with root package name */
    private final e f43904a;

    /* renamed from: b, reason: collision with root package name */
    private int f43905b;

    /* renamed from: c, reason: collision with root package name */
    private int f43906c;

    /* renamed from: d, reason: collision with root package name */
    private final String f43907d;

    /* renamed from: e, reason: collision with root package name */
    private long f43908e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f43909f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f43910g = false;

    /* renamed from: h, reason: collision with root package name */
    private String f43911h;

    public i(e eVar) {
        this.f43904a = eVar;
        this.f43907d = eVar.i();
    }

    public void a(boolean z10) {
        this.f43910g = z10;
    }

    public void b(boolean z10) {
        this.f43909f = z10;
    }

    public int c() {
        return this.f43905b;
    }

    public String d() {
        return this.f43911h;
    }

    public int e() {
        return this.f43906c;
    }

    public String f() {
        return this.f43907d;
    }

    public boolean g() {
        return this.f43910g;
    }

    public boolean h() {
        return this.f43909f;
    }

    public e a() {
        return this.f43904a;
    }

    public void b(int i10) {
        this.f43906c = i10;
    }

    public void a(int i10) {
        this.f43905b = i10;
    }

    public long b() {
        return this.f43908e;
    }

    public void a(long j10) {
        this.f43908e = j10;
    }

    public void a(String str) {
        this.f43911h = str;
    }
}
