package com.mbridge.msdk.video.dynview.energize;

import android.view.View;
import com.mbridge.msdk.video.dynview.c;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile b f44397a;

    private b() {
    }

    public static b a() {
        b bVar;
        if (f44397a != null) {
            return f44397a;
        }
        synchronized (b.class) {
            try {
                if (f44397a == null) {
                    f44397a = new b();
                }
                bVar = f44397a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    private void b(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar);
    }

    private void c(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar, map);
    }

    private void b(View view, c cVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().b(view, cVar, map);
    }

    public void a(View view, c cVar, Map<String, Object> map) {
        if (cVar == null) {
            return;
        }
        int iG = cVar.g();
        if (iG == 1) {
            a(view, map);
            return;
        }
        if (iG == 2) {
            c(view, cVar, map);
            return;
        }
        if (iG == 3) {
            b(view, cVar);
        } else if (iG == 4) {
            b(view, cVar, map);
        } else {
            if (iG != 5) {
                return;
            }
            a(view, cVar);
        }
    }

    private void a(View view, c cVar) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, cVar);
    }

    private void a(View view, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.wrapper.b().a(view, map);
    }
}
