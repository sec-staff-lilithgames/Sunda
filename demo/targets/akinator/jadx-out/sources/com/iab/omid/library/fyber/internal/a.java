package com.iab.omid.library.fyber.internal;

import android.content.Context;
import com.iab.omid.library.fyber.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f30638f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.fyber.utils.f f30639a = new com.iab.omid.library.fyber.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f30640b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30641c;

    /* renamed from: d, reason: collision with root package name */
    private d f30642d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30643e;

    private a(d dVar) {
        this.f30642d = dVar;
    }

    public static a a() {
        return f30638f;
    }

    private void c() throws JSONException {
        if (!this.f30641c || this.f30640b == null) {
            return;
        }
        Iterator<com.iab.omid.library.fyber.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f30640b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f30639a.a();
        Date date = this.f30640b;
        if (date == null || dateA.after(date)) {
            this.f30640b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f30641c) {
            return;
        }
        this.f30642d.a(context);
        this.f30642d.a(this);
        this.f30642d.e();
        this.f30643e = this.f30642d.c();
        this.f30641c = true;
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f30643e && z10) {
            d();
        }
        this.f30643e = z10;
    }
}
