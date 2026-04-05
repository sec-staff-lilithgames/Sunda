package com.mbridge.msdk.foundation.same.directory;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private List<a> f40750a;

    /* renamed from: b, reason: collision with root package name */
    private String f40751b;

    /* renamed from: c, reason: collision with root package name */
    private a f40752c;

    /* renamed from: d, reason: collision with root package name */
    private c f40753d;

    public void a(c cVar, String str) {
        a aVar = new a();
        aVar.a(cVar);
        aVar.a(str);
        a(aVar);
    }

    public String b() {
        return this.f40751b;
    }

    public a c() {
        return this.f40752c;
    }

    public c d() {
        return this.f40753d;
    }

    public void b(a aVar) {
        this.f40752c = aVar;
    }

    public void a(a aVar) {
        if (this.f40750a == null) {
            this.f40750a = new ArrayList();
        }
        aVar.b(this);
        this.f40750a.add(aVar);
    }

    public void a(List<a> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<a> it = list.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    public List<a> a() {
        return this.f40750a;
    }

    public void a(String str) {
        this.f40751b = str;
    }

    public void a(c cVar) {
        this.f40753d = cVar;
    }
}
