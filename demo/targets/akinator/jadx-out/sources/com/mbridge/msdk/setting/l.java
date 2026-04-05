package com.mbridge.msdk.setting;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class l extends c {
    public static l N() {
        return new l();
    }

    public static l h(String str) {
        l lVar = new l();
        try {
            lVar.e(str);
            lVar.r(1);
            lVar.x(1);
            lVar.z(5);
            lVar.b(1);
            lVar.c(1);
            return lVar;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("UnitSetting", e10.getMessage());
            }
            return lVar;
        }
    }

    public static l i(String str) {
        l lVar = new l();
        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(8);
        arrayList2.add(8);
        lVar.r(1);
        lVar.e(str);
        lVar.a(arrayList);
        lVar.b(arrayList2);
        lVar.x(1);
        lVar.b(-2);
        lVar.c(-2);
        lVar.z(5);
        lVar.d(3600L);
        lVar.k(2);
        lVar.d(1);
        lVar.u(100);
        lVar.g(0);
        lVar.i(1);
        lVar.m(0);
        lVar.v(60);
        lVar.p(10);
        lVar.q(60);
        return lVar;
    }

    public static l j(String str) {
        l lVar = new l();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1);
            lVar.a(arrayList);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(30);
            lVar.b(arrayList2);
            lVar.e(str);
            lVar.r(1);
            lVar.x(1);
            lVar.b(-2);
            lVar.c(-2);
            lVar.z(5);
            lVar.d(3600L);
            lVar.k(2);
            lVar.d(3);
            return lVar;
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("UnitSetting", e10.getMessage());
            }
            return lVar;
        }
    }

    public static l k(String str) {
        l lVarN = N();
        lVarN.d(0);
        return lVarN;
    }

    public static l l(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return c.a(new JSONObject(str));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("UnitSetting", "parseSetting", e10);
            }
            return null;
        }
    }
}
