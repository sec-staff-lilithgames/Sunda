package com.bytedance.sdk.openadsdk.jj;

import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.wqx;
import com.ironsource.C3191e4;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {
    private static volatile jpo jpo;

    /* renamed from: au, reason: collision with root package name */
    private boolean f21205au;

    /* renamed from: cm, reason: collision with root package name */
    private boolean f21206cm;
    private boolean hna;

    /* renamed from: if, reason: not valid java name */
    private int[] f153if;

    /* renamed from: jd, reason: collision with root package name */
    private boolean f21207jd;

    /* renamed from: jj, reason: collision with root package name */
    private int[] f21208jj;

    /* renamed from: ju, reason: collision with root package name */
    private boolean f21209ju;
    private int[] my;
    private boolean oya;
    private int prr;

    /* renamed from: qk, reason: collision with root package name */
    private int[] f21210qk;

    /* renamed from: sq, reason: collision with root package name */
    private boolean f21211sq;
    private boolean wqx;
    private int[] xyk;

    /* renamed from: yd, reason: collision with root package name */
    private boolean f21212yd;
    private int[] zz;

    private jpo() {
        jd();
    }

    public int[] au() {
        return this.zz;
    }

    public int[] hna() {
        return this.f153if;
    }

    /* renamed from: if, reason: not valid java name */
    public int[] m485if() {
        return this.xyk;
    }

    public int[] ju() {
        return this.f21210qk;
    }

    public boolean opi() {
        return this.f21211sq;
    }

    public boolean oya() {
        return this.f21212yd;
    }

    public boolean prr() {
        return this.f21209ju;
    }

    public boolean sq() {
        return this.f21205au;
    }

    public int[] yd() {
        return this.f21208jj;
    }

    public boolean qk() {
        return this.wqx;
    }

    public boolean xyk() {
        return this.f21206cm;
    }

    public int[] zz() {
        return this.my;
    }

    public int cm() {
        return this.prr;
    }

    public boolean jj() {
        return this.f21207jd;
    }

    public boolean my() {
        return this.hna;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] wqx(String[] strArr) throws NumberFormatException {
        int length = strArr.length;
        int[] iArr = new int[length];
        int i10 = 0;
        for (String str : strArr) {
            try {
                int i11 = Integer.parseInt(str);
                iArr[i10] = i11;
                if (i11 > 0) {
                    i10++;
                }
            } catch (NumberFormatException unused) {
            }
        }
        if (i10 == length) {
            return iArr;
        }
        int[] iArr2 = new int[i10];
        System.arraycopy(iArr, 0, iArr2, 0, i10);
        return iArr2;
    }

    public void jd() {
        oya.jd().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.jj.jpo.1
            @Override // java.lang.Runnable
            public void run() {
                jpo.this.oya = com.bytedance.sdk.openadsdk.rq.jpo.jpo("feature_switch", false);
                if (jpo.this.oya) {
                    try {
                        jpo.this.f21211sq = com.bytedance.sdk.openadsdk.rq.jpo.jpo("exclude_banner_native", false);
                        jpo.this.prr = com.bytedance.sdk.openadsdk.rq.jpo.jpo("feature_timer_interval", 10000);
                        jpo.this.hna = com.bytedance.sdk.openadsdk.rq.jpo.jpo("enable_feature_cids", true);
                        String[] strArrSplit = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pag_ad_show_cnt", "1,3,5&session").split(C3191e4.i.f36527c);
                        String[] strArrSplit2 = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pag_ad_click_cnt", "1,3,5&session").split(C3191e4.i.f36527c);
                        String[] strArrSplit3 = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pag_video_play_cnt", "1,3,5&session").split(C3191e4.i.f36527c);
                        String[] strArrSplit4 = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pag_dislike_cnt", "1,3,5session").split(",");
                        jpo jpoVar = jpo.this;
                        jpoVar.f21207jd = jpoVar.jpo(strArrSplit);
                        jpo jpoVar2 = jpo.this;
                        jpoVar2.wqx = jpoVar2.jpo(strArrSplit2);
                        jpo jpoVar3 = jpo.this;
                        jpoVar3.f21206cm = jpoVar3.jpo(strArrSplit3);
                        jpo jpoVar4 = jpo.this;
                        jpoVar4.my = jpoVar4.jd(strArrSplit);
                        jpo jpoVar5 = jpo.this;
                        jpoVar5.f21208jj = jpoVar5.jd(strArrSplit2);
                        jpo jpoVar6 = jpo.this;
                        jpoVar6.f21210qk = jpoVar6.jd(strArrSplit3);
                        jpo jpoVar7 = jpo.this;
                        jpoVar7.f153if = jpoVar7.wqx(strArrSplit4);
                        String[] strArrSplit5 = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pag_landingPage_stay_time", "1,3,5&session").split(C3191e4.i.f36527c);
                        String[] strArrSplit6 = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pag_video_stay_time", "1,3,5&session").split(C3191e4.i.f36527c);
                        jpo jpoVar8 = jpo.this;
                        jpoVar8.f21212yd = jpoVar8.jpo(strArrSplit5);
                        jpo jpoVar9 = jpo.this;
                        jpoVar9.f21209ju = jpoVar9.jpo(strArrSplit6);
                        jpo jpoVar10 = jpo.this;
                        jpoVar10.xyk = jpoVar10.jd(strArrSplit5);
                        jpo jpoVar11 = jpo.this;
                        jpoVar11.zz = jpoVar11.jd(strArrSplit6);
                        jpo.this.f21205au = com.bytedance.sdk.openadsdk.rq.jpo.jpo("pag_video_30p_session", true);
                    } catch (Throwable unused) {
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] jd(String[] strArr) {
        if (strArr.length > 0) {
            return wqx(strArr[0].split(","));
        }
        return new int[0];
    }

    public static jpo jpo() {
        if (jpo == null) {
            synchronized (wqx.class) {
                try {
                    if (jpo == null) {
                        jpo = new jpo();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return jpo;
    }

    public boolean wqx() {
        return this.oya;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jpo(String[] strArr) {
        if (strArr.length == 2) {
            return "session".equals(strArr[1]);
        }
        if (strArr.length == 1) {
            return "session".equals(strArr[0]);
        }
        return false;
    }
}
