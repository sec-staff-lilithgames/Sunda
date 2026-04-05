package com.mbridge.msdk.tracker;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class n implements f {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap<String, a> f43936a = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f43937a;

        public a(boolean z10) {
            this.f43937a = z10;
        }

        public boolean a() {
            return this.f43937a;
        }
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(e eVar) throws Exception {
        a aVar;
        if (eVar != null && !TextUtils.isEmpty(eVar.b())) {
            try {
                String strB = eVar.b();
                if (this.f43936a.containsKey(strB)) {
                    aVar = this.f43936a.get(strB);
                } else {
                    a aVar2 = new a(com.mbridge.msdk.foundation.same.report.c.a(strB));
                    this.f43936a.put(strB, aVar2);
                    aVar = aVar2;
                }
                if (aVar != null) {
                    if (aVar.a()) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("TrackManager", "apply", e10);
                }
            }
        }
        return false;
    }
}
