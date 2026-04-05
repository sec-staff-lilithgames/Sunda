package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.dynview.listener.h;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class b {

    /* renamed from: b, reason: collision with root package name */
    private static volatile b f44354b;

    /* renamed from: a, reason: collision with root package name */
    public Map<String, SoftReference<View>> f44355a = new HashMap();

    private b() {
    }

    public static b a() {
        b bVar;
        if (f44354b != null) {
            return f44354b;
        }
        synchronized (b.class) {
            try {
                if (f44354b == null) {
                    f44354b = new b();
                }
                bVar = f44354b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public void a(Context context, List<CampaignEx> list, h hVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.ui.a(context, list, hVar, map);
    }

    public void a(c cVar, h hVar) {
        new com.mbridge.msdk.video.dynview.ui.a(cVar, hVar, new HashMap());
    }

    public void a(c cVar, h hVar, Map<String, Object> map) {
        new com.mbridge.msdk.video.dynview.ui.a(cVar, hVar, map);
    }
}
