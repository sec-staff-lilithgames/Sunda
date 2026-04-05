package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import java.lang.reflect.Method;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e0 {
    public static void mia(Context context, String str) throws JSONException {
        String str2 = null;
        try {
            Object objInvoke = context.getClass().getMethod(j0.a("HF5TNFK/J75/JczQhFKsJr5B"), null).invoke(context, null);
            if (objInvoke != null) {
                Method method = objInvoke.getClass().getMethod(j0.a("HF5T5dQMHN=="), Uri.class);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(j0.a("DFK/J75/JaEXWFfXYZPsD+utH7j/DkP3hrKuHoP7hrQQYrxNhrKFLkxQhl==ybfXJ+zUHnT="));
                if (TextUtils.isEmpty(str)) {
                    str = j0.a("n+xg");
                }
                sb2.append(str);
                str2 = (String) method.invoke(objInvoke, Uri.parse(sb2.toString()));
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                p0.b("MiaUtil", th2.getMessage());
            }
        }
        com.mbridge.msdk.foundation.same.report.j.b(str2);
    }
}
