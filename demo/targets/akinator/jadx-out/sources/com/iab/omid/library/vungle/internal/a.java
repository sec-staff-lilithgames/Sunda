package com.iab.omid.library.vungle.internal;

import android.content.Context;
import com.iab.omid.library.vungle.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f31424f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.vungle.utils.f f31425a = new com.iab.omid.library.vungle.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f31426b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31427c;

    /* renamed from: d, reason: collision with root package name */
    private d f31428d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31429e;

    private a(d dVar) {
        this.f31428d = dVar;
    }

    public static a a() {
        return f31424f;
    }

    private void c() throws JSONException {
        if (!this.f31427c || this.f31426b == null) {
            return;
        }
        Iterator<com.iab.omid.library.vungle.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(b());
        }
    }

    public Date b() {
        Date date = this.f31426b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() {
        Date dateA = this.f31425a.a();
        Date date = this.f31426b;
        if (date == null || dateA.after(date)) {
            this.f31426b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f31427c) {
            return;
        }
        this.f31428d.a(context);
        this.f31428d.a(this);
        this.f31428d.e();
        this.f31429e = this.f31428d.c();
        this.f31427c = true;
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (!this.f31429e && z10) {
            d();
        }
        this.f31429e = z10;
    }
}
