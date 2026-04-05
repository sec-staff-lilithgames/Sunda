package com.bytedance.sdk.openadsdk.hmu.jd;

import android.view.View;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.utils.tic;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my {
    private static final Map<Integer, jd> jpo = new ConcurrentHashMap();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: jd, reason: collision with root package name */
        public int f21162jd = -1;
        public int jpo;

        public jpo(int i10) {
            this.jpo = i10;
        }
    }

    public static void jd(Integer num) {
        jpo.remove(num);
    }

    public static void jpo(View view, dt dtVar, jpo jpoVar) {
        if (view == null || dtVar == null || dtVar.svi()) {
            return;
        }
        boolean zWqx = wqx(dtVar);
        if (rv.jd(dtVar) && jpoVar != null) {
            jpoVar.jpo = -1;
        }
        jpo(jpo(view, dtVar, zWqx, jpoVar));
    }

    private static boolean wqx(dt dtVar) {
        if (dtVar == null) {
            return false;
        }
        String strJpo = tic.jpo(dtVar);
        return ((!"open_ad".equals(strJpo) && !"fullscreen_interstitial_ad".equals(strJpo) && !"rewarded_video".equals(strJpo)) || rv.jd(dtVar) || dtVar.jkt() == 5 || dtVar.jkt() == 33 || !dt.my(dtVar) || dtVar.ww() == null) ? false : true;
    }

    public static Integer jd(dt dtVar) {
        return Integer.valueOf((dtVar.hbg() + dtVar.fc()).hashCode());
    }

    private static jd jpo(View view, dt dtVar, boolean z10, jpo jpoVar) {
        if (view == null || dtVar == null || dtVar.fc() == null) {
            return null;
        }
        Integer numJd = jd(dtVar);
        Map<Integer, jd> map = jpo;
        if (map.containsKey(numJd)) {
            jd jdVar = map.get(numJd);
            if (jdVar != null) {
                jdVar.jpo(view);
            }
            return jdVar;
        }
        jd jdVarJpo = jd.jpo(z10, numJd, view, dtVar, jpoVar);
        map.put(numJd, jdVarJpo);
        return jdVarJpo;
    }

    private static void jpo(jd jdVar) {
        if (jdVar == null) {
            return;
        }
        jdVar.jpo();
    }

    public static void jpo(dt dtVar, int i10) {
        if (dtVar == null || dtVar.fc() == null) {
            return;
        }
        jpo(jpo.get(jd(dtVar)), i10);
    }

    public static void jpo(jd jdVar, int i10) {
        if (jdVar == null) {
            return;
        }
        jdVar.jpo(i10);
    }

    public static void jpo(dt dtVar) {
        if (dtVar == null || dtVar.fc() == null) {
            return;
        }
        Integer numJd = jd(dtVar);
        Map<Integer, jd> map = jpo;
        jd jdVar = map.get(numJd);
        if (jdVar != null) {
            jdVar.yd();
        }
        jd(numJd);
        if (map.size() <= 0) {
            qk.jpo();
        }
    }

    public static jd jpo(Integer num) {
        return jpo.get(num);
    }
}
