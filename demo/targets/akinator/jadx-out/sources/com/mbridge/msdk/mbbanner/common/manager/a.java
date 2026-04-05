package com.mbridge.msdk.mbbanner.common.manager;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.same.report.metrics.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: g, reason: collision with root package name */
    private static final String f41437g = "a";

    /* renamed from: h, reason: collision with root package name */
    private static volatile a f41438h;

    /* renamed from: a, reason: collision with root package name */
    private Context f41439a = com.mbridge.msdk.foundation.controller.c.m().d();

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.mbbanner.common.util.a f41440b = new com.mbridge.msdk.mbbanner.common.util.a();

    /* renamed from: c, reason: collision with root package name */
    private Map<String, com.mbridge.msdk.mbbanner.common.data.b> f41441c = new ConcurrentHashMap();

    /* renamed from: d, reason: collision with root package name */
    private Map<String, Boolean> f41442d = new ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    private Map<String, Handler> f41443e = new ConcurrentHashMap();

    /* renamed from: f, reason: collision with root package name */
    private Map<String, Integer> f41444f = new ConcurrentHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.mbbanner.common.manager.a$a, reason: collision with other inner class name */
    public class C0282a implements com.mbridge.msdk.mbbanner.common.listener.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f41445a;

        public C0282a(com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f41445a = aVar;
        }

        @Override // com.mbridge.msdk.mbbanner.common.listener.d
        public void a(String str) {
            synchronized (a.b()) {
                this.f41445a.a("");
                a.this.f41442d.put(str, Boolean.FALSE);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f41447a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MBridgeIds f41448b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.listener.b f41449c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f41450d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.mbbanner.common.data.a f41451e;

        public b(String str, MBridgeIds mBridgeIds, com.mbridge.msdk.mbbanner.common.listener.b bVar, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar) {
            this.f41447a = str;
            this.f41448b = mBridgeIds;
            this.f41449c = bVar;
            this.f41450d = str2;
            this.f41451e = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Boolean bool;
            if (a.this.f41442d == null || !a.this.f41442d.containsKey(this.f41447a) || (bool = (Boolean) a.this.f41442d.get(this.f41447a)) == null || !bool.booleanValue()) {
                if (a.this.f41444f.containsKey(this.f41447a)) {
                    Integer num = (Integer) a.this.f41444f.get(this.f41447a);
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (iIntValue == 2 || iIntValue == 4) {
                        String str = a.f41437g;
                        StringBuilder sbT = o2.t(iIntValue, "doUnitRotation: autoRotationStatus=", " && unitId=");
                        sbT.append(this.f41447a);
                        p0.b(str, sbT.toString());
                        if (a.this.f41440b != null) {
                            com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(880026);
                            bVar.a(this.f41448b);
                            a.this.f41440b.a(this.f41449c, bVar);
                            return;
                        }
                        return;
                    }
                }
                a.this.b(this.f41450d, this.f41447a, this.f41451e, this.f41449c);
            }
        }
    }

    private a() {
    }

    public static a b() {
        if (f41438h == null) {
            synchronized (a.class) {
                try {
                    if (f41438h == null) {
                        f41438h = new a();
                    }
                } finally {
                }
            }
        }
        return f41438h;
    }

    public void c() {
        Map<String, com.mbridge.msdk.mbbanner.common.data.b> map = this.f41441c;
        if (map != null) {
            map.clear();
        }
        Map<String, Boolean> map2 = this.f41442d;
        if (map2 != null) {
            map2.clear();
        }
        Map<String, Handler> map3 = this.f41443e;
        if (map3 != null) {
            for (Map.Entry<String, Handler> entry : map3.entrySet()) {
                if (entry.getValue() != null) {
                    entry.getValue().removeCallbacksAndMessages(null);
                }
            }
            this.f41443e.clear();
        }
        Map<String, Integer> map4 = this.f41444f;
        if (map4 != null) {
            map4.clear();
        }
    }

    private com.mbridge.msdk.mbbanner.common.data.b a(String str) {
        if (this.f41441c.containsKey(str)) {
            return this.f41441c.get(str);
        }
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), str);
        if (lVarE == null) {
            lVarE = l.i(str);
        }
        com.mbridge.msdk.mbbanner.common.data.b bVar = new com.mbridge.msdk.mbbanner.common.data.b(str, "", 0, lVarE.y());
        this.f41441c.put(str, bVar);
        return bVar;
    }

    public void b(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Boolean bool;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        String strB = aVar.b();
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.mbbanner.common.report.a.a(str2, strB);
        cVarA.h(!TextUtils.isEmpty(aVar.a()) ? "1" : "0");
        cVarA.g(aVar.a());
        cVarA.f(aVar.f() ? "1" : "2");
        cVarA.b(aVar.f() ? 1 : 2);
        cVarA.c(aVar.d());
        com.mbridge.msdk.mbbanner.common.report.a.a("2000123", cVarA, (e) null);
        if (this.f41439a == null) {
            com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880025);
            bVar2.a(mBridgeIds);
            bVar2.b(strB);
            this.f41440b.a(bVar, bVar2);
            return;
        }
        if (bVar == null) {
            com.mbridge.msdk.foundation.error.b bVar3 = new com.mbridge.msdk.foundation.error.b(880001);
            bVar3.a(mBridgeIds);
            bVar3.b(strB);
            this.f41440b.a(bVar, bVar3);
            return;
        }
        Map<String, Boolean> map = this.f41442d;
        if (map != null && map.containsKey(str2) && (bool = this.f41442d.get(str2)) != null && bool.booleanValue()) {
            com.mbridge.msdk.foundation.error.b bVar4 = new com.mbridge.msdk.foundation.error.b(880016, "Current unit is loading!");
            bVar4.a(mBridgeIds);
            bVar4.b(strB);
            this.f41440b.a(bVar, bVar4);
            return;
        }
        this.f41442d.put(str2, Boolean.TRUE);
        com.mbridge.msdk.mbbanner.common.data.b bVarA = a(str2);
        bVarA.a(strB);
        new com.mbridge.msdk.mbbanner.common.manager.b(this.f41439a, bVarA, bVar, this.f41440b).a(str, str2, aVar, new C0282a(aVar));
        com.mbridge.msdk.mbbanner.common.report.a.a("2000125", cVarA, (e) null);
    }

    public void a(String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        MBridgeIds mBridgeIds = new MBridgeIds(str, str2);
        if (aVar != null && aVar.d() > 0) {
            if (TextUtils.isEmpty(aVar.b())) {
                aVar.b(com.mbridge.msdk.mbbanner.common.report.a.b(""));
            }
            if (this.f41443e.containsKey(str2)) {
                handler = this.f41443e.get(str2);
            } else {
                handler = new Handler();
                this.f41443e.put(str2, handler);
            }
            Handler handler2 = handler;
            b bVar2 = new b(str2, mBridgeIds, bVar, str, aVar);
            if (handler2 != null) {
                handler2.removeCallbacksAndMessages(null);
                handler2.postDelayed(bVar2, aVar.d());
                return;
            }
            return;
        }
        com.google.android.gms.internal.play_billing.a.v("doUnitRotation: Illegal banner request parameters! && unitId=", str2, f41437g);
    }

    public void a(int i10, String str, String str2, com.mbridge.msdk.mbbanner.common.data.a aVar, com.mbridge.msdk.mbbanner.common.listener.b bVar) {
        Handler handler;
        Handler handler2;
        Handler handler3;
        Integer num;
        int iIntValue = (!this.f41444f.containsKey(str2) || (num = this.f41444f.get(str2)) == null) ? 0 : num.intValue();
        if (i10 == 1) {
            if (this.f41443e.containsKey(str2) && (handler = this.f41443e.get(str2)) != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f41444f.put(str2, Integer.valueOf(i10));
            return;
        }
        if (i10 == 2) {
            if (iIntValue == 1) {
                if (this.f41443e.containsKey(str2) && (handler2 = this.f41443e.get(str2)) != null) {
                    handler2.removeCallbacksAndMessages(null);
                }
                this.f41444f.put(str2, Integer.valueOf(i10));
                return;
            }
            return;
        }
        if (i10 == 3) {
            if (iIntValue == 2 || iIntValue == 4) {
                this.f41444f.put(str2, 1);
                a(str, str2, aVar, bVar);
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        if (iIntValue == 0) {
            this.f41444f.put(str2, 0);
            return;
        }
        if (this.f41443e.containsKey(str2) && (handler3 = this.f41443e.get(str2)) != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.f41444f.put(str2, Integer.valueOf(i10));
    }

    public void b(String str) {
        if (this.f41443e.containsKey(str)) {
            Handler handler = this.f41443e.get(str);
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            this.f41443e.remove(str);
        }
    }
}
