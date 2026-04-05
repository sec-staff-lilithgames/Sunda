package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import com.mbridge.msdk.video.dynview.listener.e;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: b, reason: collision with root package name */
    private static volatile a f44395b;

    /* renamed from: a, reason: collision with root package name */
    public com.mbridge.msdk.video.dynview.inter.a f44396a;

    private a() {
    }

    public static a a() {
        a aVar;
        if (f44395b != null) {
            return f44395b;
        }
        synchronized (a.class) {
            try {
                if (f44395b == null) {
                    f44395b = new a();
                }
                aVar = f44395b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    private void b(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().b(cVar, view, map, eVar);
    }

    private void c(c cVar, View view, Map map, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().c(cVar, view, map, eVar);
    }

    public void d() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f44396a;
        if (aVar != null) {
            aVar.c();
        }
    }

    public void b() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f44396a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public void c() {
        com.mbridge.msdk.video.dynview.inter.a aVar = this.f44396a;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(View view, c cVar, Map map, e eVar) {
        int iG = cVar.g();
        if (iG == 1) {
            a(cVar, view, map, eVar);
            return;
        }
        if (iG == 2) {
            b(cVar, view, map, eVar);
            return;
        }
        if (iG == 4) {
            a(cVar, view, eVar);
        } else if (iG != 5) {
            eVar.a(view, new ArrayList());
        } else {
            c(cVar, view, map, eVar);
        }
    }

    private void a(c cVar, View view, Map map, e eVar) {
        com.mbridge.msdk.video.dynview.wrapper.a aVar = new com.mbridge.msdk.video.dynview.wrapper.a();
        aVar.a(cVar, view, map, eVar);
        this.f44396a = aVar.f44546l;
    }

    private void a(c cVar, View view, e eVar) {
        new com.mbridge.msdk.video.dynview.wrapper.a().a(cVar, view, eVar);
    }
}
