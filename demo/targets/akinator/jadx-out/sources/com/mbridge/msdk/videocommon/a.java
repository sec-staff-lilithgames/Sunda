package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45243a = new ConcurrentHashMap<>();

    /* renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45244b = new ConcurrentHashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45245c = new ConcurrentHashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45246d = new ConcurrentHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45247e = new ConcurrentHashMap<>();

    /* renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45248f = new ConcurrentHashMap<>();

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45249g = new ConcurrentHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45250h = new ConcurrentHashMap<>();

    /* renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45251i = new ConcurrentHashMap<>();

    /* renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0355a> f45252j = new ConcurrentHashMap<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    public static class C0355a {

        /* renamed from: a, reason: collision with root package name */
        private WindVaneWebView f45253a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f45254b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f45253a = windVaneWebView;
        }

        public WindVaneWebView b() {
            return this.f45253a;
        }

        public boolean c() {
            return this.f45254b;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f45253a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f45253a;
            if (windVaneWebView != null) {
                return (String) windVaneWebView.getTag();
            }
            return "";
        }

        public void a(boolean z10) {
            this.f45254b = z10;
        }
    }

    public static void a(String str, C0355a c0355a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f45250h.put(str, c0355a);
                return;
            } else {
                f45249g.put(str, c0355a);
                return;
            }
        }
        if (z11) {
            f45252j.put(str, c0355a);
        } else {
            f45251i.put(str, c0355a);
        }
    }

    public static C0355a b(String str) {
        if (f45249g.containsKey(str)) {
            return f45249g.get(str);
        }
        if (f45250h.containsKey(str)) {
            return f45250h.get(str);
        }
        if (f45251i.containsKey(str)) {
            return f45251i.get(str);
        }
        if (f45252j.containsKey(str)) {
            return f45252j.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0355a> entry : f45249g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f45249g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0355a> entry : f45250h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f45250h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (f45249g.containsKey(str)) {
            f45249g.remove(str);
        }
        if (f45251i.containsKey(str)) {
            f45251i.remove(str);
        }
        if (f45250h.containsKey(str)) {
            f45250h.remove(str);
        }
        if (f45252j.containsKey(str)) {
            f45252j.remove(str);
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f45249g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f45249g.remove(str2);
                }
            }
        } else {
            f45249g.clear();
        }
        f45250h.clear();
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0355a> concurrentHashMap = f45244b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0355a> concurrentHashMap2 = f45247e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0355a> concurrentHashMap3 = f45243a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0355a> concurrentHashMap4 = f45246d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0355a> concurrentHashMap5 = f45245c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0355a> concurrentHashMap6 = f45248f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f45251i.clear();
        f45252j.clear();
    }

    public static C0355a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0355a> concurrentHashMap = f45243a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f45243a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0355a> concurrentHashMap2 = f45246d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f45246d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0355a> concurrentHashMap3 = f45245c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f45245c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0355a> concurrentHashMap4 = f45248f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f45248f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0355a> concurrentHashMap5 = f45244b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f45244b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0355a> concurrentHashMap6 = f45247e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f45247e.get(requestIdNotice);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0355a c0355a) {
        try {
            if (i10 == 94) {
                if (f45247e == null) {
                    f45247e = new ConcurrentHashMap<>();
                }
                f45247e.put(str, c0355a);
            } else if (i10 == 287) {
                if (f45248f == null) {
                    f45248f = new ConcurrentHashMap<>();
                }
                f45248f.put(str, c0355a);
            } else if (i10 != 288) {
                if (f45243a == null) {
                    f45243a = new ConcurrentHashMap<>();
                }
                f45243a.put(str, c0355a);
            } else {
                if (f45246d == null) {
                    f45246d = new ConcurrentHashMap<>();
                }
                f45246d.put(str, c0355a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0355a c0355a) {
        try {
            if (i10 == 94) {
                if (f45244b == null) {
                    f45244b = new ConcurrentHashMap<>();
                }
                f45244b.put(str, c0355a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f45245c == null) {
                    f45245c = new ConcurrentHashMap<>();
                }
                f45245c.put(str, c0355a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
