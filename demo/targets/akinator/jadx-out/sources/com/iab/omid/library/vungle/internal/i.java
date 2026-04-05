package com.iab.omid.library.vungle.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.vungle.internal.d;
import com.iab.omid.library.vungle.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.vungle.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f31449f;

    /* renamed from: a, reason: collision with root package name */
    private float f31450a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.e f31451b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.vungle.devicevolume.b f31452c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.vungle.devicevolume.d f31453d;

    /* renamed from: e, reason: collision with root package name */
    private c f31454e;

    public i(com.iab.omid.library.vungle.devicevolume.e eVar, com.iab.omid.library.vungle.devicevolume.b bVar) {
        this.f31451b = eVar;
        this.f31452c = bVar;
    }

    private c a() {
        if (this.f31454e == null) {
            this.f31454e = c.c();
        }
        return this.f31454e;
    }

    public static i c() {
        if (f31449f == null) {
            f31449f = new i(new com.iab.omid.library.vungle.devicevolume.e(), new com.iab.omid.library.vungle.devicevolume.b());
        }
        return f31449f;
    }

    public float b() {
        return this.f31450a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f31453d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f31453d.d();
    }

    @Override // com.iab.omid.library.vungle.devicevolume.c
    public void a(float f10) {
        this.f31450a = f10;
        Iterator<com.iab.omid.library.vungle.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f31453d = this.f31451b.a(new Handler(), context, this.f31452c.a(), this);
    }

    @Override // com.iab.omid.library.vungle.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
