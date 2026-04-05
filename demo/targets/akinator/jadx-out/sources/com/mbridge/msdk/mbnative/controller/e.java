package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.n;
import com.mbridge.msdk.foundation.same.report.o;
import com.mbridge.msdk.foundation.tools.p0;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f41781a = "com.mbridge.msdk.mbnative.controller.e";

    public static void a(Context context, String str) {
        if (context != null) {
            try {
                n nVarA = n.a(g.a(context));
                if (TextUtils.isEmpty(str) || nVarA == null || nVarA.a() <= 0) {
                    return;
                }
                List<com.mbridge.msdk.foundation.entity.n> listA = nVarA.a("m_download_end");
                List<com.mbridge.msdk.foundation.entity.n> listA2 = nVarA.a("2000021");
                List<com.mbridge.msdk.foundation.entity.n> listA3 = nVarA.a("m_download_end");
                o.e(listA2);
                o.a(listA);
                o.b(listA3);
            } catch (Exception e10) {
                p0.b(f41781a, e10.getMessage());
            }
        }
    }
}
