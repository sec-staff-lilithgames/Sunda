package com.iab.omid.library.mmadbridge.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.mmadbridge.internal.d;
import com.iab.omid.library.mmadbridge.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.mmadbridge.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f31069f;

    /* renamed from: a, reason: collision with root package name */
    private float f31070a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.e f31071b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.mmadbridge.devicevolume.b f31072c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.mmadbridge.devicevolume.d f31073d;

    /* renamed from: e, reason: collision with root package name */
    private c f31074e;

    public i(com.iab.omid.library.mmadbridge.devicevolume.e eVar, com.iab.omid.library.mmadbridge.devicevolume.b bVar) {
        this.f31071b = eVar;
        this.f31072c = bVar;
    }

    private c a() {
        if (this.f31074e == null) {
            this.f31074e = c.c();
        }
        return this.f31074e;
    }

    public static i c() {
        if (f31069f == null) {
            f31069f = new i(new com.iab.omid.library.mmadbridge.devicevolume.e(), new com.iab.omid.library.mmadbridge.devicevolume.b());
        }
        return f31069f;
    }

    public float b() {
        return this.f31070a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f31073d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f31073d.d();
    }

    @Override // com.iab.omid.library.mmadbridge.devicevolume.c
    public void a(float f10) {
        this.f31070a = f10;
        Iterator<com.iab.omid.library.mmadbridge.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f31073d = this.f31071b.a(new Handler(), context, this.f31072c.a(), this);
    }

    @Override // com.iab.omid.library.mmadbridge.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
