package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import com.iab.omid.library.inmobi.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f30774f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.inmobi.utils.f f30775a = new com.iab.omid.library.inmobi.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f30776b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30777c;

    /* renamed from: d, reason: collision with root package name */
    private d f30778d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30779e;

    private a(d dVar) {
        this.f30778d = dVar;
    }

    public static a a() {
        return f30774f;
    }

    private void c() throws JSONException {
        if (!this.f30777c || this.f30776b == null) {
            return;
        }
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f30776b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f30775a.a();
        Date date = this.f30776b;
        if (date == null || dateA.after(date)) {
            this.f30776b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f30777c) {
            return;
        }
        this.f30778d.a(context);
        this.f30778d.a(this);
        this.f30778d.e();
        this.f30779e = this.f30778d.c();
        this.f30777c = true;
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f30779e && z10) {
            d();
        }
        this.f30779e = z10;
    }
}
