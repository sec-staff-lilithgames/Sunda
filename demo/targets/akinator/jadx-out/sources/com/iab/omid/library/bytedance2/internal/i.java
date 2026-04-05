package com.iab.omid.library.bytedance2.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.bytedance2.internal.d;
import com.iab.omid.library.bytedance2.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements com.iab.omid.library.bytedance2.devicevolume.c, d.a {

    /* renamed from: f, reason: collision with root package name */
    private static i f30533f;

    /* renamed from: a, reason: collision with root package name */
    private float f30534a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.e f30535b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.bytedance2.devicevolume.b f30536c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.bytedance2.devicevolume.d f30537d;

    /* renamed from: e, reason: collision with root package name */
    private c f30538e;

    public i(com.iab.omid.library.bytedance2.devicevolume.e eVar, com.iab.omid.library.bytedance2.devicevolume.b bVar) {
        this.f30535b = eVar;
        this.f30536c = bVar;
    }

    private c a() {
        if (this.f30538e == null) {
            this.f30538e = c.c();
        }
        return this.f30538e;
    }

    public static i c() {
        if (f30533f == null) {
            f30533f = new i(new com.iab.omid.library.bytedance2.devicevolume.e(), new com.iab.omid.library.bytedance2.devicevolume.b());
        }
        return f30533f;
    }

    public float b() {
        return this.f30534a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f30537d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f30537d.d();
    }

    @Override // com.iab.omid.library.bytedance2.devicevolume.c
    public void a(float f10) {
        this.f30534a = f10;
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f30537d = this.f30535b.a(new Handler(), context, this.f30536c.a(), this);
    }

    @Override // com.iab.omid.library.bytedance2.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
