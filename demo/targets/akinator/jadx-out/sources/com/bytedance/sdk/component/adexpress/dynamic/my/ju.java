package com.bytedance.sdk.component.adexpress.dynamic.my;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.dynamic.my.jd;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class ju {

    /* renamed from: jd, reason: collision with root package name */
    private static String f18296jd;
    private static final Set<String> jpo = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    public static double jd(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString(TtmlNode.ATTR_TTS_FONT_SIZE));
        } catch (Throwable unused) {
            return 0.0d;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0438 A[Catch: Exception -> 0x0449, TryCatch #2 {Exception -> 0x0449, blocks: (B:220:0x042e, B:222:0x0438, B:227:0x0442), top: B:277:0x042e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.bytedance.sdk.component.adexpress.dynamic.my.jd.wqx jpo(java.lang.String r22, java.lang.String r23, java.lang.String r24, boolean r25, boolean r26, int r27, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk r28, double r29, int r31, double r32, java.lang.String r34, com.bytedance.sdk.component.adexpress.jd.au r35) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 1269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.adexpress.dynamic.my.ju.jpo(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, int, com.bytedance.sdk.component.adexpress.dynamic.cm.xyk, double, int, double, java.lang.String, com.bytedance.sdk.component.adexpress.jd.au):com.bytedance.sdk.component.adexpress.dynamic.my.jd$wqx");
    }

    public static int[] jd(String str, float f10, boolean z10) {
        try {
            TextView textView = new TextView(com.bytedance.sdk.component.adexpress.cm.jpo());
            textView.setTextSize(f10);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z10) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    public static boolean jd() {
        return !TextUtils.isEmpty(f18296jd);
    }

    public static String jpo(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    private static jd.wqx jpo(jd.wqx wqxVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            wqxVar.jpo = 0.0f;
            wqxVar.f18290jd = 0.0f;
            return wqxVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = jpo(str);
        }
        if (TextUtils.isEmpty(str3)) {
            wqxVar.jpo = 0.0f;
            wqxVar.f18290jd = 0.0f;
            return wqxVar;
        }
        return jpo(str3, str2);
    }

    public static jd.wqx jpo(String str, String str2) {
        return jpo(str, str2, false);
    }

    public static jd.wqx jpo(String str, String str2, boolean z10) {
        jd.wqx wqxVar = new jd.wqx();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrJpo = jpo(str, (float) jd(str2), z10);
            wqxVar.jpo = iArrJpo[0];
            wqxVar.f18290jd = iArrJpo[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == 0.0d) {
                wqxVar.f18290jd = 0.0f;
            }
        } catch (Exception unused) {
        }
        return wqxVar;
    }

    public static int[] jpo(String str, float f10, boolean z10) {
        int[] iArrJd = jd(str, f10, z10);
        return new int[]{com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), iArrJd[0]), com.bytedance.sdk.component.adexpress.cm.qk.jd(com.bytedance.sdk.component.adexpress.cm.jpo(), iArrJd[1])};
    }

    public static String jpo() {
        return f18296jd;
    }
}
