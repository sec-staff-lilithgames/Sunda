package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import com.iab.omid.library.appodeal.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f30373f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.appodeal.utils.f f30374a = new com.iab.omid.library.appodeal.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f30375b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30376c;

    /* renamed from: d, reason: collision with root package name */
    private d f30377d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30378e;

    private a(d dVar) {
        this.f30377d = dVar;
    }

    public static a a() {
        return f30373f;
    }

    private void c() throws JSONException {
        if (!this.f30376c || this.f30375b == null) {
            return;
        }
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f30375b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f30374a.a();
        Date date = this.f30375b;
        if (date == null || dateA.after(date)) {
            this.f30375b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f30376c) {
            return;
        }
        this.f30377d.a(context);
        this.f30377d.a(this);
        this.f30377d.e();
        this.f30378e = this.f30377d.c();
        this.f30376c = true;
    }

    @Override // com.iab.omid.library.appodeal.internal.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f30378e && z10) {
            d();
        }
        this.f30378e = z10;
    }
}
