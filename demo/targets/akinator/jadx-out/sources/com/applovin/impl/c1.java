package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class c1 extends p2 {

    /* renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f13694e;

    /* renamed from: f, reason: collision with root package name */
    private List f13695f;

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f13696g;

    /* renamed from: h, reason: collision with root package name */
    private List f13697h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum a {
        RECENT_ADS,
        COUNT
    }

    public c1(Context context) {
        super(context);
        this.f13696g = new AtomicBoolean();
        this.f13697h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityV0;
        this.f13694e = kVar;
        this.f13695f = list;
        if (!(this.f15022a instanceof Activity) && (activityV0 = kVar.v0()) != null) {
            this.f15022a = activityV0;
        }
        if (list != null && this.f13696g.compareAndSet(false, true)) {
            this.f13697h = a(this.f13695f);
        }
        AppLovinSdkUtils.runOnUiThread(new m9(this, 4));
    }

    @Override // com.applovin.impl.p2
    public int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.p2
    public List c(int i10) {
        return this.f13697h;
    }

    public List d() {
        return this.f13695f;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f13694e;
    }

    public boolean f() {
        return this.f13697h.size() == 0;
    }

    public void g() {
        this.f13696g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f13696g.get() + "}";
    }

    @Override // com.applovin.impl.p2
    public int d(int i10) {
        return this.f13697h.size();
    }

    @Override // com.applovin.impl.p2
    public o2 e(int i10) {
        return new t4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new o1((p1) it.next(), this.f15022a));
        }
        return arrayList;
    }
}
