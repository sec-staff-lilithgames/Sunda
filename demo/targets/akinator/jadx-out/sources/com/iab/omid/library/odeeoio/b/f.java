package com.iab.omid.library.odeeoio.b;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.odeeoio.b.b;
import com.iab.omid.library.odeeoio.walking.TreeWalker;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class f implements com.iab.omid.library.odeeoio.a.c, b.a {

    /* renamed from: a, reason: collision with root package name */
    private static f f31190a;

    /* renamed from: b, reason: collision with root package name */
    private float f31191b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.odeeoio.a.e f31192c;

    /* renamed from: d, reason: collision with root package name */
    private final com.iab.omid.library.odeeoio.a.b f31193d;

    /* renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.odeeoio.a.d f31194e;

    /* renamed from: f, reason: collision with root package name */
    private a f31195f;

    public f(com.iab.omid.library.odeeoio.a.e eVar, com.iab.omid.library.odeeoio.a.b bVar) {
        this.f31192c = eVar;
        this.f31193d = bVar;
    }

    public static f a() {
        if (f31190a == null) {
            f31190a = new f(new com.iab.omid.library.odeeoio.a.e(), new com.iab.omid.library.odeeoio.a.b());
        }
        return f31190a;
    }

    private a e() {
        if (this.f31195f == null) {
            this.f31195f = a.a();
        }
        return this.f31195f;
    }

    public void b() {
        b.a().a(this);
        b.a().b();
        TreeWalker.getInstance().a();
        this.f31194e.a();
    }

    public void c() {
        TreeWalker.getInstance().b();
        b.a().c();
        this.f31194e.b();
    }

    public float d() {
        return this.f31191b;
    }

    @Override // com.iab.omid.library.odeeoio.a.c
    public void a(float f10) {
        this.f31191b = f10;
        Iterator<com.iab.omid.library.odeeoio.adsession.a> it = e().c().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f31194e = this.f31192c.a(new Handler(), context, this.f31193d.a(), this);
    }

    @Override // com.iab.omid.library.odeeoio.b.b.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().a();
        } else {
            TreeWalker.getInstance().c();
        }
    }
}
