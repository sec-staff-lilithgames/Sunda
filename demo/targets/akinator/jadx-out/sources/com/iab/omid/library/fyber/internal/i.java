package com.iab.omid.library.fyber.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.fyber.internal.d;
import com.iab.omid.library.fyber.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.fyber.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f30663f;

    /* renamed from: a, reason: collision with root package name */
    private float f30664a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.e f30665b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.fyber.devicevolume.b f30666c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.fyber.devicevolume.d f30667d;

    /* renamed from: e, reason: collision with root package name */
    private c f30668e;

    public i(com.iab.omid.library.fyber.devicevolume.e eVar, com.iab.omid.library.fyber.devicevolume.b bVar) {
        this.f30665b = eVar;
        this.f30666c = bVar;
    }

    private c a() {
        if (this.f30668e == null) {
            this.f30668e = c.c();
        }
        return this.f30668e;
    }

    public static i c() {
        if (f30663f == null) {
            f30663f = new i(new com.iab.omid.library.fyber.devicevolume.e(), new com.iab.omid.library.fyber.devicevolume.b());
        }
        return f30663f;
    }

    public float b() {
        return this.f30664a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f30667d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f30667d.d();
    }

    @Override // com.iab.omid.library.fyber.devicevolume.c
    public void a(float f10) {
        this.f30664a = f10;
        Iterator<com.iab.omid.library.fyber.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f30667d = this.f30665b.a(new Handler(), context, this.f30666c.a(), this);
    }

    @Override // com.iab.omid.library.fyber.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
