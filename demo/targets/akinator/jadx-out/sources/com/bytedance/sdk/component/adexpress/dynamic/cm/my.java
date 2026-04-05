package com.bytedance.sdk.component.adexpress.dynamic.cm;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import j1.o2;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class my {
    public static final Map<String, Integer> jpo;

    /* renamed from: cm, reason: collision with root package name */
    private jj f18193cm;

    /* renamed from: jd, reason: collision with root package name */
    private String f18194jd;

    /* renamed from: jj, reason: collision with root package name */
    private String f18195jj;
    private jj my;
    private String wqx;

    public String cm() {
        return this.f18195jj;
    }

    public String jd() {
        return this.f18194jd;
    }

    public int jj() {
        return this.f18193cm.ux();
    }

    public int jpo() {
        if (TextUtils.isEmpty(this.f18194jd)) {
            return 0;
        }
        if (this.f18194jd.equals("logo")) {
            String str = this.f18194jd + this.wqx;
            this.f18194jd = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f18194jd.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = jpo;
        if (map.get(this.f18194jd) != null) {
            return map.get(this.f18194jd).intValue();
        }
        return -1;
    }

    public jj my() {
        return this.f18193cm;
    }

    public jj qk() {
        return this.my;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("DynamicLayoutBrick{type='");
        sb2.append(this.f18194jd);
        sb2.append("', data='");
        sb2.append(this.wqx);
        sb2.append("', value=");
        sb2.append(this.f18193cm);
        sb2.append(", themeValue=");
        sb2.append(this.my);
        sb2.append(", dataExtraInfo='");
        return o2.o(sb2, this.f18195jj, "'}");
    }

    public String wqx() {
        return this.wqx;
    }

    static {
        HashMap map = new HashMap();
        jpo = map;
        map.put("root", 8);
        map.put("footer", 6);
        map.put("empty", 6);
        map.put("title", 0);
        map.put("subtitle", 0);
        map.put("source", 0);
        map.put("score-count", 0);
        map.put("text_star", 0);
        map.put("text", 0);
        map.put("tag-group", 17);
        map.put("app-version", 0);
        map.put("development-name", 0);
        map.put("privacy-detail", 23);
        map.put("image", 1);
        map.put("image-wide", 1);
        map.put("image-square", 1);
        map.put("image-long", 1);
        map.put("image-splash", 1);
        map.put("image-cover", 1);
        map.put("app-icon", 1);
        map.put("icon-download", 1);
        map.put("logoad", 4);
        o2.v(5, map, "logounion", 9, "logo-union");
        map.put("dislike", 3);
        map.put("close", 3);
        map.put("close-fill", 3);
        o2.v(22, map, "webview-close", 12, "feedback-dislike");
        map.put("button", 2);
        map.put("downloadWithIcon", 2);
        map.put("downloadButton", 2);
        map.put("fillButton", 2);
        map.put("laceButton", 2);
        map.put("cardButton", 2);
        map.put("colourMixtureButton", 2);
        map.put("arrowButton", 1);
        map.put("download-progress-button", 2);
        map.put(LJjmO.VligPs, 6);
        map.put("image-group", 6);
        map.put("custom-component-vessel", 6);
        map.put("carousel", 24);
        o2.v(26, map, "carousel-vessel", 25, "leisure-interact");
        map.put("video-hd", 7);
        map.put("video", 7);
        map.put("video-vd", 7);
        map.put("video-sq", 7);
        map.put("muted", 10);
        o2.v(11, map, "star", 19, "skip-countdowns");
        map.put("skip-with-countdowns-skip-btn", 21);
        map.put("skip-with-countdowns-video-countdown", 13);
        o2.v(20, map, "skip-with-countdowns-skip-countdown", 14, "skip-with-time");
        map.put("skip-with-time-countdown", 13);
        map.put("skip-with-time-skip-btn", 15);
        map.put("skip", 27);
        map.put("timedown", 13);
        map.put("icon", 16);
        map.put("scoreCountWithIcon", 6);
        map.put("split-line", 18);
        map.put("creative-playable-bait", 0);
        map.put("score-count-type-2", 0);
        map.put("lottie", 28);
    }

    public void jd(String str) {
        this.wqx = str;
    }

    public void wqx(String str) {
        this.f18195jj = str;
    }

    public void jd(jj jjVar) {
        this.my = jjVar;
    }

    public void jpo(String str) {
        this.f18194jd = str;
    }

    public void jpo(jj jjVar) {
        this.f18193cm = jjVar;
    }
}
