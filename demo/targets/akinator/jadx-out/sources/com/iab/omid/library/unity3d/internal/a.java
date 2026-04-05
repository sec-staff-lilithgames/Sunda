package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import com.iab.omid.library.unity3d.internal.d;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONException;

/* loaded from: classes7.dex */
public class a implements d.a {

    /* renamed from: f, reason: collision with root package name */
    private static a f31297f = new a(new d());

    /* renamed from: a, reason: collision with root package name */
    protected com.iab.omid.library.unity3d.utils.f f31298a = new com.iab.omid.library.unity3d.utils.f();

    /* renamed from: b, reason: collision with root package name */
    private Date f31299b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f31300c;

    /* renamed from: d, reason: collision with root package name */
    private d f31301d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f31302e;

    private a(d dVar) {
        this.f31301d = dVar;
    }

    public static a a() {
        return f31297f;
    }

    private void c() throws JSONException {
        if (!this.f31300c || this.f31299b == null) {
            return;
        }
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(b());
        }
    }

    public Date b() {
        Date date = this.f31299b;
        if (date != null) {
            return (Date) date.clone();
        }
        return null;
    }

    public void d() throws JSONException {
        Date dateA = this.f31298a.a();
        Date date = this.f31299b;
        if (date == null || dateA.after(date)) {
            this.f31299b = dateA;
            c();
        }
    }

    public void a(Context context) {
        if (this.f31300c) {
            return;
        }
        this.f31301d.a(context);
        this.f31301d.a(this);
        this.f31301d.e();
        this.f31302e = this.f31301d.c();
        this.f31300c = true;
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) throws JSONException {
        if (!this.f31302e && z10) {
            d();
        }
        this.f31302e = z10;
    }
}
