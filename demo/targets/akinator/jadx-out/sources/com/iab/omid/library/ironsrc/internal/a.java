package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import com.iab.omid.library.ironsrc.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f30909f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.ironsrc.utils.f f30910a = new com.iab.omid.library.ironsrc.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f30911b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30912c;

    /* renamed from: d, reason: collision with root package name */
    private d f30913d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30914e;

    private a(d dVar) {
        this.f30913d = dVar;
    }

    public static a a() {
        return f30909f;
    }

    private void c() {
        if (!this.f30912c || this.f30911b == null) {
            return;
        }
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f30911b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f30910a.a();
        Date date = this.f30911b;
        if (date == null || dateA.after(date)) {
            this.f30911b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f30912c) {
            return;
        }
        this.f30913d.a(context);
        this.f30913d.a(this);
        this.f30913d.e();
        this.f30914e = this.f30913d.c();
        this.f30912c = true;
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (!this.f30914e && z10) {
            d();
        }
        this.f30914e = z10;
    }
}
