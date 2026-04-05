package com.iab.omid.library.applovin.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.applovin.internal.d;
import com.iab.omid.library.applovin.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.applovin.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f30262f;

    /* renamed from: a, reason: collision with root package name */
    private float f30263a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.e f30264b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.applovin.devicevolume.b f30265c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.applovin.devicevolume.d f30266d;

    /* renamed from: e, reason: collision with root package name */
    private c f30267e;

    public i(com.iab.omid.library.applovin.devicevolume.e eVar, com.iab.omid.library.applovin.devicevolume.b bVar) {
        this.f30264b = eVar;
        this.f30265c = bVar;
    }

    private c a() {
        if (this.f30267e == null) {
            this.f30267e = c.c();
        }
        return this.f30267e;
    }

    public static i c() {
        if (f30262f == null) {
            f30262f = new i(new com.iab.omid.library.applovin.devicevolume.e(), new com.iab.omid.library.applovin.devicevolume.b());
        }
        return f30262f;
    }

    public float b() {
        return this.f30263a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f30266d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f30266d.d();
    }

    @Override // com.iab.omid.library.applovin.devicevolume.c
    public void a(float f10) {
        this.f30263a = f10;
        Iterator<com.iab.omid.library.applovin.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f30266d = this.f30264b.a(new Handler(), context, this.f30265c.a(), this);
    }

    @Override // com.iab.omid.library.applovin.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
