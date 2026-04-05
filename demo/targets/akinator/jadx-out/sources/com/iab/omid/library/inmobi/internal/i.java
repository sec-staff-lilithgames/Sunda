package com.iab.omid.library.inmobi.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.inmobi.internal.d;
import com.iab.omid.library.inmobi.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.inmobi.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f30799f;

    /* renamed from: a, reason: collision with root package name */
    private float f30800a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.e f30801b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.inmobi.devicevolume.b f30802c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.inmobi.devicevolume.d f30803d;

    /* renamed from: e, reason: collision with root package name */
    private c f30804e;

    public i(com.iab.omid.library.inmobi.devicevolume.e eVar, com.iab.omid.library.inmobi.devicevolume.b bVar) {
        this.f30801b = eVar;
        this.f30802c = bVar;
    }

    private c a() {
        if (this.f30804e == null) {
            this.f30804e = c.c();
        }
        return this.f30804e;
    }

    public static i c() {
        if (f30799f == null) {
            f30799f = new i(new com.iab.omid.library.inmobi.devicevolume.e(), new com.iab.omid.library.inmobi.devicevolume.b());
        }
        return f30799f;
    }

    public float b() {
        return this.f30800a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f30803d.b();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f30803d.c();
    }

    @Override // com.iab.omid.library.inmobi.devicevolume.c
    public void a(float f10) {
        this.f30800a = f10;
        Iterator<com.iab.omid.library.inmobi.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().d().a(f10);
        }
    }

    public void a(Context context) {
        this.f30803d = this.f30801b.a(new Handler(), context, this.f30802c.a(), this);
    }

    @Override // com.iab.omid.library.inmobi.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
