package com.iab.omid.library.appodeal.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.appodeal.internal.d;
import com.iab.omid.library.appodeal.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.appodeal.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f30398f;

    /* renamed from: a, reason: collision with root package name */
    private float f30399a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.e f30400b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.appodeal.devicevolume.b f30401c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.appodeal.devicevolume.d f30402d;

    /* renamed from: e, reason: collision with root package name */
    private c f30403e;

    public i(com.iab.omid.library.appodeal.devicevolume.e eVar, com.iab.omid.library.appodeal.devicevolume.b bVar) {
        this.f30400b = eVar;
        this.f30401c = bVar;
    }

    private c a() {
        if (this.f30403e == null) {
            this.f30403e = c.c();
        }
        return this.f30403e;
    }

    public static i c() {
        if (f30398f == null) {
            f30398f = new i(new com.iab.omid.library.appodeal.devicevolume.e(), new com.iab.omid.library.appodeal.devicevolume.b());
        }
        return f30398f;
    }

    public float b() {
        return this.f30399a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f30402d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f30402d.c();
    }

    @Override // com.iab.omid.library.appodeal.devicevolume.c
    public void a(float f10) {
        this.f30399a = f10;
        Iterator<com.iab.omid.library.appodeal.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f30402d = this.f30400b.a(new Handler(), context, this.f30401c.a(), this);
    }

    @Override // com.iab.omid.library.appodeal.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
