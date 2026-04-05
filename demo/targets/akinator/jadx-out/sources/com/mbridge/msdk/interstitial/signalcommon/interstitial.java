package com.mbridge.msdk.interstitial.signalcommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.c;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class interstitial extends AbsFeedBackForH5 {

    /* renamed from: h, reason: collision with root package name */
    private static final String f41326h = "com.mbridge.msdk.interstitial.signalcommon.interstitial";

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f41327i = 0;

    /* renamed from: g, reason: collision with root package name */
    private Object f41328g;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f41329a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41330b;

        public a(List list, String str) {
            this.f41329a = list;
            this.f41330b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.mbridge.msdk.interstitial.cache.a aVarA = com.mbridge.msdk.interstitial.cache.a.a();
            if (aVarA != null) {
                aVarA.a(this.f41329a, this.f41330b);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f41332a;

        public b(List list) {
            this.f41332a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i10 = 0; i10 < this.f41332a.size(); i10++) {
                CampaignEx campaignEx = (CampaignEx) this.f41332a.get(i10);
                if (campaignEx != null) {
                    j.a(g.a(((com.mbridge.msdk.mbsignalcommon.windvane.g) interstitial.this).f41947a)).b(campaignEx.getId());
                }
            }
        }
    }

    private void b() {
        try {
            Context context = this.f41947a;
            if (context != null && a(context) == 1) {
                try {
                    MBInterstitialActivity mBInterstitialActivity = (MBInterstitialActivity) this.f41947a;
                    if (mBInterstitialActivity != null) {
                        mBInterstitialActivity.hideLoading();
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    private void c() {
        try {
            f.a().b(this.f41328g, "");
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        MBInterstitialActivity mBInterstitialActivity;
        try {
            Context context = this.f41947a;
            if (context == null || a(context) != 1 || (mBInterstitialActivity = (MBInterstitialActivity) this.f41947a) == null) {
                return;
            }
            mBInterstitialActivity.showWebView();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public List<String> getExcludeIdList(String str) {
        Exception e10;
        ArrayList arrayList;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String strOptString = new JSONObject(str).optString(e.f40876h);
            if (!TextUtils.isEmpty(strOptString)) {
                JSONArray jSONArray = new JSONArray(strOptString);
                if (jSONArray.length() > 0) {
                    arrayList = new ArrayList();
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            if (!TextUtils.isEmpty(jSONArray.optString(i10))) {
                                arrayList.add(jSONArray.optString(i10));
                            }
                        } catch (Exception e11) {
                            e10 = e11;
                            e10.printStackTrace();
                            return arrayList;
                        }
                    }
                    return arrayList;
                }
            }
            return null;
        } catch (Exception e12) {
            e10 = e12;
            arrayList = null;
        }
    }

    public void getInfo(Object obj, String str) {
        try {
            this.f41328g = obj;
            Context context = this.f41947a;
            if (context == null) {
                c();
                return;
            }
            int iA = a(context);
            if (TextUtils.isEmpty(a())) {
                c();
            } else if (iA == 1) {
                a(obj, str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
            c();
        }
    }

    public void install(Object obj, String str) {
        try {
            Context context = this.f41947a;
            if (context != null && (context instanceof MBInterstitialActivity)) {
                ((MBInterstitialActivity) context).clickTracking();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void openURL(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                c.c(this.f41947a, strOptString);
            } else if (iOptInt == 2) {
                c.e(this.f41947a, strOptString);
            }
        } catch (JSONException e10) {
            p0.b(f41326h, e10.getMessage());
        } catch (Throwable th2) {
            p0.b(f41326h, th2.getMessage());
        }
    }

    private void a(Object obj, String str) {
        try {
            b();
            d();
            Context context = this.f41947a;
            if (context == null) {
                c();
                return;
            }
            if (a(context) != 1) {
                c();
                return;
            }
            Context context2 = this.f41947a;
            if (context2 instanceof MBInterstitialActivity) {
                ((MBInterstitialActivity) context2).mIsMBPage = true;
            }
            String strA = a();
            if (TextUtils.isEmpty(strA)) {
                c();
                return;
            }
            List<CampaignEx> listA = a(strA);
            if (listA == null) {
                c();
                return;
            }
            String strA2 = a(listA);
            if (TextUtils.isEmpty(strA2)) {
                c();
                return;
            }
            f.a().b(obj, strA2);
            a(strA, listA);
            b(strA, listA);
            a(listA, strA);
        } catch (Exception e10) {
            e10.printStackTrace();
            c();
        }
    }

    private void b(String str, List<CampaignEx> list) {
        try {
            if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
                new Thread(new b(list)).start();
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private List<CampaignEx> a(String str) {
        try {
            if (TextUtils.isEmpty(str) || com.mbridge.msdk.interstitial.cache.a.a() == null) {
                return null;
            }
            return com.mbridge.msdk.interstitial.cache.a.a().a(str, 1);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private void a(List<CampaignEx> list, String str) {
        try {
            new Thread(new a(list, str)).start();
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private String a(List<CampaignEx> list) throws JSONException {
        if (list == null) {
            return "";
        }
        try {
            if (list.size() <= 0) {
                return "";
            }
            JSONArray camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", camplistToJson);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private int a(Context context) {
        return (context == null || !(context instanceof MBInterstitialActivity)) ? -1 : 1;
    }

    private String a() {
        Context context;
        String str = null;
        try {
            context = this.f41947a;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (context == null) {
            return null;
        }
        if (a(context) == 1) {
            try {
                Context context2 = this.f41947a;
                if (context2 != null && (context2 instanceof MBInterstitialActivity)) {
                    str = ((MBInterstitialActivity) context2).mUnitid;
                    return str;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return str;
    }

    private void a(String str, List<CampaignEx> list) {
        try {
            if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
                for (int i10 = 0; i10 < list.size(); i10++) {
                    CampaignEx campaignEx = list.get(i10);
                    if (campaignEx != null) {
                        com.mbridge.msdk.foundation.same.buffer.b.a(str, campaignEx, "interstitial");
                    }
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
