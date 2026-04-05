package com.ironsource;

import android.util.Log;
import com.ironsource.C3219fe;
import com.ironsource.mediationsdk.logger.IronLog;
import h2.rl.UeklptUrP;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class A8 {

    /* renamed from: b, reason: collision with root package name */
    private static A8 f33829b;

    /* renamed from: a, reason: collision with root package name */
    private O5 f33830a;

    private A8() {
    }

    private static A8 a() {
        if (f33829b == null) {
            f33829b = new A8();
        }
        return f33829b;
    }

    public static void a(I5 i52, C3545y8 c3545y8) {
        if (i52 != null) {
            try {
                a().f33830a = new O5(i52, c3545y8);
            } catch (Exception e10) {
                C3422r4.d().a(e10);
                IronLog.INTERNAL.error(e10.toString());
            }
        }
    }

    public static void a(C3219fe.a aVar) {
        a(aVar, new HashMap());
    }

    public static void a(C3219fe.a aVar, Map<String, Object> map) {
        O5 o52 = a().f33830a;
        if (o52 == null) {
            Log.d(G5.f34427a, UeklptUrP.QbSug);
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f36725b));
        }
        o52.a(aVar.f36724a, map);
    }
}
