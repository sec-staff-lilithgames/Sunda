package com.iab.omid.library.applovin.internal;

import android.content.Context;
import com.iab.omid.library.applovin.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f30237f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.applovin.utils.f f30238a = new com.iab.omid.library.applovin.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f30239b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30240c;

    /* renamed from: d, reason: collision with root package name */
    private d f30241d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30242e;

    private a(d dVar) {
        this.f30241d = dVar;
    }

    public static a a() {
        return f30237f;
    }

    private void c() {
        if (!this.f30240c || this.f30239b == null) {
            return;
        }
        Iterator<com.iab.omid.library.applovin.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f30239b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f30238a.a();
        Date date = this.f30239b;
        if (date == null || dateA.after(date)) {
            this.f30239b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f30240c) {
            return;
        }
        this.f30241d.a(context);
        this.f30241d.a(this);
        this.f30241d.e();
        this.f30242e = this.f30241d.c();
        this.f30240c = true;
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (!this.f30242e && z10) {
            d();
        }
        this.f30242e = z10;
    }
}
