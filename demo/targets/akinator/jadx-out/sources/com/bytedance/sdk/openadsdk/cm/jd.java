package com.bytedance.sdk.openadsdk.cm;

import com.bytedance.sdk.openadsdk.cm.wqx.jpo;
import com.ironsource.C3352n2;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {
    public static final String jpo = jpo.InterfaceC0105jpo.jpo;

    /* renamed from: jd, reason: collision with root package name */
    public static final String f19522jd = jpo.InterfaceC0105jpo.f19697jd;
    public static final String wqx = jpo.InterfaceC0105jpo.wqx;

    /* renamed from: cm, reason: collision with root package name */
    public static final String f19521cm = jpo.InterfaceC0105jpo.f19696cm;
    public static final String my = jpo.InterfaceC0105jpo.my;

    /* renamed from: jj, reason: collision with root package name */
    public static final String f19523jj = jpo.InterfaceC0105jpo.f19698jj;

    /* renamed from: qk, reason: collision with root package name */
    public static final Set<String> f19524qk = new HashSet(Arrays.asList("click", C3352n2.f37928v, "insight_log"));

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.cm.jd$jd, reason: collision with other inner class name */
    public static class C0101jd {

        /* renamed from: jd, reason: collision with root package name */
        public static int f19525jd = 2;
        public static int jpo = 1;
        public static int wqx = 100;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo {

        /* renamed from: cm, reason: collision with root package name */
        public static String f19526cm = "saLandingPageLinks";

        /* renamed from: jd, reason: collision with root package name */
        public static String f19527jd = "openAdLandPageLinks";
        public static String jpo = "openDetailPage";
        public static String wqx = "direct";
    }

    public static boolean jpo(String str) {
        return "embeded_ad".equals(str) || "banner_ad".equals(str) || "interaction".equals(str) || "slide_banner_ad".equals(str);
    }
}
