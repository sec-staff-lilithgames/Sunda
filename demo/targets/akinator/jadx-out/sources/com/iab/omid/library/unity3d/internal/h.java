package com.iab.omid.library.unity3d.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.unity3d.internal.d;
import com.iab.omid.library.unity3d.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class h implements d.a, com.iab.omid.library.unity3d.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static h f31320f;

    /* renamed from: a, reason: collision with root package name */
    private float f31321a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.e f31322b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.unity3d.devicevolume.b f31323c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.unity3d.devicevolume.d f31324d;

    /* renamed from: e, reason: collision with root package name */
    private c f31325e;

    public h(com.iab.omid.library.unity3d.devicevolume.e eVar, com.iab.omid.library.unity3d.devicevolume.b bVar) {
        this.f31322b = eVar;
        this.f31323c = bVar;
    }

    private c a() {
        if (this.f31325e == null) {
            this.f31325e = c.c();
        }
        return this.f31325e;
    }

    public static h c() {
        if (f31320f == null) {
            f31320f = new h(new com.iab.omid.library.unity3d.devicevolume.e(), new com.iab.omid.library.unity3d.devicevolume.b());
        }
        return f31320f;
    }

    public float b() {
        return this.f31321a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f31324d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f31324d.d();
    }

    @Override // com.iab.omid.library.unity3d.devicevolume.c
    public void a(float f10) {
        this.f31321a = f10;
        Iterator<com.iab.omid.library.unity3d.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f31324d = this.f31322b.a(new Handler(), context, this.f31323c.a(), this);
    }

    @Override // com.iab.omid.library.unity3d.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
