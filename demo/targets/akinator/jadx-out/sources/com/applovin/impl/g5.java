package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.b6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class g5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f14003a;

    /* renamed from: b, reason: collision with root package name */
    protected final String f14004b;

    /* renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f14005c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f14006d;

    /* renamed from: e, reason: collision with root package name */
    private String f14007e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14008f;

    public g5(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public com.applovin.impl.sdk.k b() {
        return this.f14003a;
    }

    public String c() {
        return this.f14004b;
    }

    public boolean d() {
        return this.f14008f;
    }

    public g5(String str, com.applovin.impl.sdk.k kVar, boolean z10) {
        this(str, kVar, z10, null);
    }

    public Context a() {
        return this.f14006d;
    }

    public ScheduledFuture b(Thread thread, long j10) {
        if (j10 <= 0) {
            return null;
        }
        return this.f14003a.r0().b(new p6(this.f14003a, "timeout:" + this.f14004b, new f9(this, thread, j10, 0)), b6.b.TIMEOUT, j10);
    }

    public g5(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public void a(String str) {
        this.f14007e = str;
    }

    public g5(String str, com.applovin.impl.sdk.k kVar, boolean z10, String str2) {
        this.f14004b = str;
        this.f14003a = kVar;
        this.f14005c = kVar.O();
        this.f14006d = com.applovin.impl.sdk.k.o();
        this.f14008f = z10;
        this.f14007e = str2;
    }

    public void a(boolean z10) {
        this.f14008f = z10;
    }

    public void a(Throwable th2) {
        Map map = CollectionUtils.map("source", this.f14004b);
        map.put("top_main_method", th2.toString());
        map.put("details", StringUtils.emptyIfNull(this.f14007e));
        this.f14003a.E().d(c2.J0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f14007e)) {
            mapHashMap.put("details", this.f14007e);
        }
        this.f14003a.E().a(c2.K0, this.f14004b, mapHashMap);
        if (com.applovin.impl.sdk.o.a()) {
            this.f14005c.k(this.f14004b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }
}
