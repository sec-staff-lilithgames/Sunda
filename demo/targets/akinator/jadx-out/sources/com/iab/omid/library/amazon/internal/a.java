package com.iab.omid.library.amazon.internal;

import android.content.Context;
import com.iab.omid.library.amazon.internal.d;
import java.util.Date;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f30108f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.amazon.utils.f f30109a = new com.iab.omid.library.amazon.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f30110b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30111c;

    /* renamed from: d, reason: collision with root package name */
    private d f30112d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30113e;

    private a(d dVar) {
        this.f30112d = dVar;
    }

    public static a a() {
        return f30108f;
    }

    private void c() {
        if (!this.f30111c || this.f30110b == null) {
            return;
        }
        Iterator<com.iab.omid.library.amazon.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f30110b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f30109a.a();
        Date date = this.f30110b;
        if (date == null || dateA.after(date)) {
            this.f30110b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f30111c) {
            return;
        }
        this.f30112d.a(context);
        this.f30112d.a(this);
        this.f30112d.e();
        this.f30113e = this.f30112d.c();
        this.f30111c = true;
    }

    @Override // com.iab.omid.library.amazon.internal.d.a
    public void a(boolean z10) {
        if (!this.f30113e && z10) {
            d();
        }
        this.f30113e = z10;
    }
}
