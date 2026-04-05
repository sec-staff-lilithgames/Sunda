package com.iab.omid.library.ironsrc.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.ironsrc.internal.d;
import com.iab.omid.library.ironsrc.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.ironsrc.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f30934f;

    /* renamed from: a, reason: collision with root package name */
    private float f30935a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.e f30936b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.ironsrc.devicevolume.b f30937c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.ironsrc.devicevolume.d f30938d;

    /* renamed from: e, reason: collision with root package name */
    private c f30939e;

    public i(com.iab.omid.library.ironsrc.devicevolume.e eVar, com.iab.omid.library.ironsrc.devicevolume.b bVar) {
        this.f30936b = eVar;
        this.f30937c = bVar;
    }

    private c a() {
        if (this.f30939e == null) {
            this.f30939e = c.c();
        }
        return this.f30939e;
    }

    public static i c() {
        if (f30934f == null) {
            f30934f = new i(new com.iab.omid.library.ironsrc.devicevolume.e(), new com.iab.omid.library.ironsrc.devicevolume.b());
        }
        return f30934f;
    }

    public float b() {
        return this.f30935a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f30938d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f30938d.d();
    }

    @Override // com.iab.omid.library.ironsrc.devicevolume.c
    public void a(float f10) {
        this.f30935a = f10;
        Iterator<com.iab.omid.library.ironsrc.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f30938d = this.f30936b.a(new Handler(), context, this.f30937c.a(), this);
    }

    @Override // com.iab.omid.library.ironsrc.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
