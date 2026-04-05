package com.iab.omid.library.bytedance2.internal;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class b extends d {

    /* renamed from: d, reason: collision with root package name */
    private static b f30514d = new b();

    private b() {
    }

    public static b g() {
        return f30514d;
    }

    @Override // com.iab.omid.library.bytedance2.internal.d
    public void b(boolean z10) {
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().b().iterator();
        while (it.hasNext()) {
            it.next().getAdSessionStatePublisher().a(z10);
        }
    }

    @Override // com.iab.omid.library.bytedance2.internal.d
    public boolean d() {
        Iterator<com.iab.omid.library.bytedance2.adsession.a> it = c.c().a().iterator();
        while (it.hasNext()) {
            View viewC = it.next().c();
            if (viewC != null && viewC.hasWindowFocus()) {
                return true;
            }
        }
        return false;
    }
}
