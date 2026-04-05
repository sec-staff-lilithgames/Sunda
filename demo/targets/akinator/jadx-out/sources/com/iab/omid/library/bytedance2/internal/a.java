package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import com.iab.omid.library.bytedance2.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f30508f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.bytedance2.utils.f f30509a = new com.iab.omid.library.bytedance2.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f30510b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f30511c;

    /* renamed from: d, reason: collision with root package name */
    private d f30512d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30513e;

    private a(d dVar) {
        this.f30512d = dVar;
    }

    public static a a() {
        return f30508f;
    }

    private void c() throws JSONException {
        if (!this.f30511c || this.f30510b == null) {
            return;
        }
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f30510b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f30509a.a();
        Date date = this.f30510b;
        if (date == null || dateA.after(date)) {
            this.f30510b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f30511c) {
            return;
        }
        this.f30512d.a(context);
        this.f30512d.a(this);
        this.f30512d.e();
        this.f30513e = this.f30512d.c();
        this.f30511c = true;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f30513e && z10) {
            d();
        }
        this.f30513e = z10;
    }
}
