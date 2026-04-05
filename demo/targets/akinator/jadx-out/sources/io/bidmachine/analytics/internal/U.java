package io.bidmachine.analytics.internal;

import java.util.Map;
import org.json.JSONObject;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class U {
    public static final T a(Q q10) {
        byte[] bytes;
        JSONObject jSONObjectA;
        String string;
        byte[] bytes2 = q10.a().isEmpty() ? new byte[0] : s0.a(q10.a()).toString().getBytes(sv.g.f86134b);
        String strC = q10.c();
        String strD = q10.d();
        String strE = q10.e();
        long jF = q10.f();
        q0 q0VarB = q10.b();
        if (q0VarB == null || (jSONObjectA = r0.a(q0VarB)) == null || (string = jSONObjectA.toString()) == null || (bytes = string.getBytes(sv.g.f86134b)) == null) {
            bytes = new byte[0];
        }
        return new T(strC, strD, strE, jF, bytes2, bytes);
    }

    public static final Q a(T t10) {
        Map mapA;
        if (t10.a().length == 0) {
            mapA = p1.emptyMap();
        } else {
            mapA = s0.a(new JSONObject(new String(t10.a(), sv.g.f86134b)));
        }
        return new Q(t10.c(), t10.d(), t10.e(), t10.f(), mapA, t10.b().length == 0 ? null : r0.a(new JSONObject(new String(t10.b(), sv.g.f86134b))));
    }
}
