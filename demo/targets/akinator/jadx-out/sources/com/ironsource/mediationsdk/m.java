package com.ironsource.mediationsdk;

import com.ironsource.Bb;
import com.ironsource.C3161ca;
import com.ironsource.C3352n2;
import com.ironsource.InterfaceC3124a9;
import com.ironsource.Y8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    private HashSet<InterfaceC3124a9> f37587a;

    /* renamed from: b, reason: collision with root package name */
    protected com.ironsource.r f37588b;

    /* renamed from: c, reason: collision with root package name */
    protected C3161ca f37589c;

    /* renamed from: d, reason: collision with root package name */
    protected AdInfo f37590d;

    public m(HashSet<InterfaceC3124a9> hashSet, C3161ca c3161ca) {
        new HashSet();
        this.f37587a = hashSet;
        this.f37588b = new com.ironsource.r();
        this.f37589c = c3161ca;
    }

    public void a(InterfaceC3124a9 interfaceC3124a9) {
        synchronized (this) {
            this.f37587a.add(interfaceC3124a9);
        }
    }

    public void b(InterfaceC3124a9 interfaceC3124a9) {
        synchronized (this) {
            this.f37587a.remove(interfaceC3124a9);
        }
    }

    public void c() {
        synchronized (this) {
            this.f37587a.clear();
        }
    }

    public String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void f() {
        this.f37590d = null;
    }

    public void a(C3161ca c3161ca) {
        this.f37589c = c3161ca;
    }

    public void a(Y8 y82, Bb bb2) {
        if (y82 != null) {
            this.f37590d = new AdInfo(y82, bb2);
        }
    }

    public void a(C3352n2 c3352n2, String str) {
        HashSet hashSet;
        if (c3352n2 != null) {
            Y8 y8A = c3352n2.a(str);
            if (y8A != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.f37587a.clone();
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    InterfaceC3124a9 interfaceC3124a9 = (InterfaceC3124a9) it.next();
                    IronLog.CALLBACK.info("onImpressionSuccess " + interfaceC3124a9.getClass().getSimpleName() + ": " + y8A);
                    interfaceC3124a9.a(y8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    public void a(JSONObject jSONObject, IronSource.a aVar) {
        this.f37588b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f37319f, false) : false);
    }

    public void a(IronSource.a aVar) {
        this.f37588b.a(aVar, false);
    }
}
