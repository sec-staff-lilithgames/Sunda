package com.mbridge.msdk.foundation.same.report;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.p0;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f40895a = "DomainReport";

    public static boolean a(com.mbridge.msdk.setting.g gVar, String str) {
        if (gVar != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    int iK = gVar.K();
                    JSONArray jSONArrayI = gVar.I();
                    JSONArray jSONArrayH = gVar.H();
                    if (jSONArrayH != null) {
                        for (int i10 = 0; i10 < jSONArrayH.length(); i10++) {
                            if (str.contains(jSONArrayH.getString(i10))) {
                                return false;
                            }
                        }
                    }
                    if (iK == 2) {
                        if (jSONArrayI != null) {
                            for (int i11 = 0; i11 < jSONArrayI.length(); i11++) {
                                if (str.contains(jSONArrayI.getString(i11))) {
                                    return true;
                                }
                            }
                        }
                        return false;
                    }
                }
            } catch (Exception e10) {
                p0.b(f40895a, e10.getMessage());
            }
        }
        return true;
    }
}
