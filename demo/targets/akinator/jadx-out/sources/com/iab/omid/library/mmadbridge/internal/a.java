package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import com.iab.omid.library.mmadbridge.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f31044f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.mmadbridge.utils.f f31045a = new com.iab.omid.library.mmadbridge.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f31046b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31047c;

    /* renamed from: d, reason: collision with root package name */
    private d f31048d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31049e;

    private a(d dVar) {
        this.f31048d = dVar;
    }

    public static a a() {
        return f31044f;
    }

    private void c() throws JSONException {
        if (!this.f31047c || this.f31046b == null) {
            return;
        }
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f31046b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f31045a.a();
        Date date = this.f31046b;
        if (date == null || dateA.after(date)) {
            this.f31046b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f31047c) {
            return;
        }
        this.f31048d.a(context);
        this.f31048d.a(this);
        this.f31048d.e();
        this.f31049e = this.f31048d.c();
        this.f31047c = true;
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f31049e && z10) {
            d();
        }
        this.f31049e = z10;
    }
}
