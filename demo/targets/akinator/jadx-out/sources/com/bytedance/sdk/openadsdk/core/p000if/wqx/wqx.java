package com.bytedance.sdk.openadsdk.core.p000if.wqx;

import a.b;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vungle.ads.internal.Constants;
import j1.o2;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class wqx {

    /* renamed from: cm, reason: collision with root package name */
    private static boolean f20446cm = false;
    private static SimpleDateFormat jpo;

    /* renamed from: jd, reason: collision with root package name */
    private final List<String> f20447jd;
    private final Map<jd, String> wqx;

    public wqx(List<String> list, dt dtVar) {
        int iCxb;
        this.f20447jd = list;
        HashMap map = new HashMap();
        this.wqx = map;
        map.put(jd.CACHEBUSTING, wqx());
        map.put(jd.TIMESTAMP, jd());
        map.put(jd.f20438jj, sq.jpo().getPackageName());
        jd jdVar = jd.PLAYERSTATE;
        map.put(jdVar, "");
        if (dtVar != null && ((iCxb = dtVar.cxb()) == 3 || iCxb == 7 || iCxb == 8)) {
            map.put(jdVar, Constants.TEMPLATE_TYPE_FULLSCREEN);
        }
        map.put(jd.SERVERSIDE, "0");
    }

    private String jd() {
        if (jpo == null) {
            jpo = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSX", Locale.getDefault());
        }
        String str = jpo.format(new Date());
        if (!f20446cm) {
            return str;
        }
        int iNq = tic.nq();
        if (iNq >= 0) {
            return iNq < 10 ? o2.g(iNq, str, "+0") : o2.g(iNq, str, "+");
        }
        if (iNq > -10) {
            StringBuilder sbT = b.t(str, "-0");
            sbT.append(-iNq);
            return sbT.toString();
        }
        return str + iNq;
    }

    private String wqx() {
        return String.format(Locale.US, "%08d", Long.valueOf(Math.round(Math.random() * 1.0E8d)));
    }

    public List<String> jpo() {
        ArrayList arrayList = new ArrayList();
        for (String strReplaceAll : this.f20447jd) {
            if (!TextUtils.isEmpty(strReplaceAll)) {
                for (jd jdVar : jd.values()) {
                    String str = this.wqx.get(jdVar);
                    if (str == null) {
                        str = "";
                    }
                    strReplaceAll = jdVar == jd.__MRC_IMPRESSION_ID__ ? strReplaceAll.replaceAll(jdVar.name(), str) : strReplaceAll.replaceAll("\\[" + jdVar.name() + "\\]", str);
                }
                arrayList.add(strReplaceAll);
            }
        }
        return arrayList;
    }

    public wqx jpo(jpo jpoVar) {
        if (jpoVar != null) {
            this.wqx.put(jd.ERRORCODE, jpoVar.jpo());
        }
        return this;
    }

    public wqx jpo(long j10) {
        if (j10 >= 0) {
            String strJd = jd(j10);
            if (!TextUtils.isEmpty(strJd)) {
                this.wqx.put(jd.CONTENTPLAYHEAD, strJd);
            }
        }
        return this;
    }

    public wqx jpo(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.wqx.put(jd.__MRC_IMPRESSION_ID__, str);
        }
        return this;
    }

    public wqx jd(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, C.UTF8_NAME);
            } catch (Throwable unused) {
            }
            this.wqx.put(jd.ASSETURI, str);
        }
        return this;
    }

    private String jd(long j10) {
        Locale locale = Locale.getDefault();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        return String.format(locale, "%02d:%02d:%02d.%03d", Long.valueOf(timeUnit.toHours(j10)), Long.valueOf(timeUnit.toMinutes(j10) % TimeUnit.HOURS.toMinutes(1L)), Long.valueOf(timeUnit.toSeconds(j10) % TimeUnit.MINUTES.toSeconds(1L)), Long.valueOf(j10 % 1000));
    }
}
