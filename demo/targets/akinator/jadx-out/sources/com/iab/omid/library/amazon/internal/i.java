package com.iab.omid.library.amazon.internal;

import android.content.Context;
import android.os.Handler;
import com.iab.omid.library.amazon.internal.d;
import com.iab.omid.library.amazon.walking.TreeWalker;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class i implements d.a, com.iab.omid.library.amazon.devicevolume.c {

    /* renamed from: f, reason: collision with root package name */
    private static i f30133f;

    /* renamed from: a, reason: collision with root package name */
    private float f30134a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final com.iab.omid.library.amazon.devicevolume.e f30135b;

    /* renamed from: c, reason: collision with root package name */
    private final com.iab.omid.library.amazon.devicevolume.b f30136c;

    /* renamed from: d, reason: collision with root package name */
    private com.iab.omid.library.amazon.devicevolume.d f30137d;

    /* renamed from: e, reason: collision with root package name */
    private c f30138e;

    public i(com.iab.omid.library.amazon.devicevolume.e eVar, com.iab.omid.library.amazon.devicevolume.b bVar) {
        this.f30135b = eVar;
        this.f30136c = bVar;
    }

    private c a() {
        if (this.f30138e == null) {
            this.f30138e = c.c();
        }
        return this.f30138e;
    }

    public static i c() {
        if (f30133f == null) {
            f30133f = new i(new com.iab.omid.library.amazon.devicevolume.e(), new com.iab.omid.library.amazon.devicevolume.b());
        }
        return f30133f;
    }

    public float b() {
        return this.f30134a;
    }

    public void d() {
        b.g().a(this);
        b.g().e();
        TreeWalker.getInstance().h();
        this.f30137d.c();
    }

    public void e() {
        TreeWalker.getInstance().j();
        b.g().f();
        this.f30137d.d();
    }

    @Override // com.iab.omid.library.amazon.devicevolume.c
    public void a(float f10) {
        this.f30134a = f10;
        Iterator<com.iab.omid.library.amazon.adsession.a> it = a().a().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(f10);
        }
    }

    public void a(Context context) {
        this.f30137d = this.f30135b.a(new Handler(), context, this.f30136c.a(), this);
    }

    @Override // com.iab.omid.library.amazon.internal.d.a
    public void a(boolean z10) {
        if (z10) {
            TreeWalker.getInstance().h();
        } else {
            TreeWalker.getInstance().g();
        }
    }
}
