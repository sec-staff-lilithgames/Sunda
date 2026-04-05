package com.bytedance.sdk.openadsdk.cm;

import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebBackForwardList;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class zz {

    /* renamed from: jj, reason: collision with root package name */
    private int f19703jj;
    private final dt jpo;
    private final boolean my;

    /* renamed from: qk, reason: collision with root package name */
    private int f19704qk;
    private final WebView xyk;

    /* renamed from: yd, reason: collision with root package name */
    private long f19705yd;
    private String zz = "landingpage";

    /* renamed from: jd, reason: collision with root package name */
    private final Map<Integer, Long> f19702jd = new HashMap();
    private final List<Integer> wqx = new ArrayList();

    /* renamed from: cm, reason: collision with root package name */
    private final Map<Integer, String> f19701cm = new HashMap();

    public zz(dt dtVar, WebView webView, boolean z10) {
        this.jpo = dtVar;
        this.xyk = webView;
        this.my = z10;
    }

    public void jd(String str) {
        String str2 = this.f19701cm.get(Integer.valueOf(this.f19703jj));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        String str3 = str2;
        int i10 = this.f19703jj;
        if (i10 > 0) {
            wqx.jpo(this.jpo, this.zz, i10, str3, str, 1);
        }
    }

    public void jpo(String str, int i10) {
        if (this.my) {
            i10++;
        }
        if (jpo(true)) {
            wqx.jpo(this.jpo, this.zz, this.f19703jj, str, i10);
            this.f19701cm.put(Integer.valueOf(this.f19703jj), str);
            this.f19705yd = SystemClock.elapsedRealtime();
        }
    }

    public void wqx(String str) {
        this.zz = str;
    }

    private void jd(boolean z10) {
        try {
            WebBackForwardList webBackForwardListCopyBackForwardList = this.xyk.copyBackForwardList();
            if (webBackForwardListCopyBackForwardList != null) {
                if (z10) {
                    int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
                    this.f19703jj = currentIndex + 1;
                    if (this.my) {
                        this.f19703jj = currentIndex + 2;
                        return;
                    }
                    return;
                }
                int currentIndex2 = webBackForwardListCopyBackForwardList.getCurrentIndex();
                this.f19704qk = currentIndex2 + 1;
                if (this.my) {
                    this.f19704qk = currentIndex2 + 2;
                }
            }
        } catch (Throwable th2) {
            nmd.wqx("ArbitrageLandingLog", th2.toString());
        }
    }

    public void jpo(String str) {
        if (jpo(false)) {
            wqx.jpo(this.jpo, this.zz, this.f19703jj, str, SystemClock.elapsedRealtime() - this.f19705yd);
        }
    }

    public void jpo(WebView webView, String str) {
        dt dtVar = this.jpo;
        if (dtVar == null || !com.bytedance.sdk.component.zz.jd.jpo(dtVar.rq().wqx(), str)) {
            return;
        }
        String str2 = this.f19701cm.get(Integer.valueOf(this.f19703jj));
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        wqx.jpo(this.jpo, this.zz, this.f19703jj, str2, str, 2);
    }

    private boolean jpo(boolean z10) {
        int i10 = z10 ? this.f19703jj : this.f19704qk;
        jd(z10);
        int i11 = z10 ? this.f19703jj : this.f19704qk;
        return i11 > 0 && i11 != i10;
    }
}
