package com.bytedance.sdk.openadsdk.core.yd;

import android.text.TextUtils;
import android.view.MotionEvent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    private static com.bytedance.sdk.openadsdk.core.yd.jpo jpo;

    /* renamed from: jd, reason: collision with root package name */
    private String f21022jd;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {
        private static final jd jpo = new jd();
    }

    public String cm() {
        String strCm;
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        return (jpoVar == null || (strCm = jpoVar.cm()) == null) ? "" : strCm;
    }

    public void jd(String str) {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar;
        if (TextUtils.isEmpty(str) || (jpoVar = jpo) == null) {
            return;
        }
        jpoVar.jd(str);
    }

    public long jj() {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        if (jpoVar != null) {
            return jpoVar.jj();
        }
        return 0L;
    }

    public void jpo(String str) {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar;
        if (TextUtils.isEmpty(str) || (jpoVar = jpo) == null) {
            return;
        }
        jpoVar.jpo(str);
    }

    public String my() {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        return jpoVar != null ? jpoVar.my() : "";
    }

    public int qk() {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        if (jpoVar != null) {
            return jpoVar.qk();
        }
        return 1;
    }

    public boolean wqx() {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        if (jpoVar == null) {
            return false;
        }
        return jpoVar.jd();
    }

    private jd() {
        this.f21022jd = null;
        jpo = new com.bytedance.sdk.openadsdk.core.yd.jpo();
    }

    public static jd jd() {
        return jpo.jpo;
    }

    public void jpo(Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        if (jpoVar != null) {
            jpoVar.jpo(map);
        }
    }

    public void jpo() {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        if (jpoVar != null) {
            jpoVar.wqx();
        }
    }

    public void jpo(String str, Map<String, Object> map) {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        if (jpoVar != null) {
            jpoVar.jpo(str, map);
        }
    }

    public Map<String, String> jpo(String str, byte[] bArr) {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        if (jpoVar != null) {
            return jpoVar.jpo(str, bArr);
        }
        return new HashMap();
    }

    public void jpo(MotionEvent motionEvent) {
        com.bytedance.sdk.openadsdk.core.yd.jpo jpoVar = jpo;
        if (jpoVar != null) {
            jpoVar.jpo(motionEvent);
        }
    }
}
