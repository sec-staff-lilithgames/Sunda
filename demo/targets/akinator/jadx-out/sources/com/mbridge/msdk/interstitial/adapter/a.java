package com.mbridge.msdk.interstitial.adapter;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.inmobi.commons.core.configs.CrashConfig;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.foundation.same.c;
import com.mbridge.msdk.foundation.same.net.wrapper.e;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.interstitial.controller.a;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.l;
import java.io.File;
import java.io.FileOutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private Context f41279a;

    /* renamed from: b, reason: collision with root package name */
    private String f41280b;

    /* renamed from: c, reason: collision with root package name */
    private String f41281c;

    /* renamed from: d, reason: collision with root package name */
    private int f41282d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41283e;

    /* renamed from: f, reason: collision with root package name */
    private int f41284f;

    /* renamed from: g, reason: collision with root package name */
    private String f41285g;

    /* renamed from: h, reason: collision with root package name */
    private a.b f41286h;

    /* renamed from: i, reason: collision with root package name */
    private l f41287i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f41288j;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.interstitial.adapter.a$a, reason: collision with other inner class name */
    public class HandlerC0280a extends Handler {
        public HandlerC0280a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            Object obj2;
            try {
                int i10 = message.what;
                if (i10 == 3) {
                    if (a.this.f41286h == null || (obj = message.obj) == null || !(obj instanceof String)) {
                        return;
                    }
                    a.this.f41286h.b(a.this.f41283e, (String) obj);
                    return;
                }
                if (i10 == 4 && a.this.f41286h != null && (obj2 = message.obj) != null && (obj2 instanceof String)) {
                    a.this.f41286h.a(a.this.f41283e, (String) obj2);
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends com.mbridge.msdk.interstitial.request.b {
        public b() {
        }

        @Override // com.mbridge.msdk.interstitial.request.b
        public void a(CampaignUnit campaignUnit) {
            try {
                a.this.a(campaignUnit);
            } catch (Exception e10) {
                e10.printStackTrace();
                a.this.b("can't show because unknow error");
                a.this.m();
            }
        }

        @Override // com.mbridge.msdk.interstitial.request.b
        public void b(int i10, String str) {
            p0.b("IntersAdapter", str);
            a.this.b(str);
            a.this.m();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41291a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f41292b;

        public c(CampaignEx campaignEx, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
            this.f41291a = campaignEx;
            this.f41292b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.c.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(str, cVar, this.f41291a, this.f41292b, (com.mbridge.msdk.foundation.same.report.metrics.callback.a) null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f41294a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f41295b;

        public d(List list, List list2) {
            this.f41294a = list;
            this.f41295b = list2;
        }

        @Override // java.lang.Runnable
        public void run() {
            List list = this.f41294a;
            if (list == null || list.size() <= 0) {
                a.this.b("no ads available");
            } else {
                a aVar = a.this;
                aVar.a(aVar.f41280b, (List<CampaignEx>) a.this.a((List<CampaignEx>) this.f41294a));
                CampaignEx campaignEx = (CampaignEx) this.f41294a.get(0);
                a.this.c(campaignEx != null ? campaignEx.getRequestId() : "");
            }
            j.a(g.a(a.this.f41279a)).a();
            List list2 = this.f41295b;
            if (list2 == null || list2.size() <= 0) {
                return;
            }
            a.this.c((List<CampaignEx>) this.f41295b);
        }
    }

    public a(Context context, String str, String str2, String str3, boolean z10) {
        this.f41279a = context;
        this.f41280b = str;
        this.f41281c = str2;
        this.f41285g = str3;
        this.f41283e = z10;
        l lVarE = h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), str);
        this.f41287i = lVarE;
        if (lVarE == null) {
            this.f41287i = l.h(this.f41280b);
        }
        i();
    }

    private int g() {
        try {
            Map<String, Integer> map = com.mbridge.msdk.interstitial.controller.a.f41302q;
            int iIntValue = (TextUtils.isEmpty(this.f41280b) || map == null || !map.containsKey(this.f41280b)) ? 1 : map.get(this.f41280b).intValue();
            if (iIntValue <= 0) {
                return 1;
            }
            return iIntValue;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 1;
        }
    }

    private String h() {
        try {
            return !TextUtils.isEmpty(com.mbridge.msdk.interstitial.controller.a.f41300o) ? com.mbridge.msdk.interstitial.controller.a.f41300o : "";
        } catch (Exception e10) {
            e10.printStackTrace();
            return "";
        }
    }

    private void i() {
        this.f41288j = new HandlerC0280a(Looper.getMainLooper());
    }

    private e l() throws NoSuchAlgorithmException {
        String strB = com.mbridge.msdk.foundation.controller.c.m().b();
        String md5 = SameMD5.getMD5(com.mbridge.msdk.foundation.controller.c.m().b() + com.mbridge.msdk.foundation.controller.c.m().c());
        int i10 = this.f41283e ? 3 : 2;
        this.f41284f = 1;
        if (this.f41287i.e() > 0) {
            this.f41284f = this.f41287i.e();
        }
        int iF = this.f41287i.f() > 0 ? this.f41287i.f() : 1;
        String strA = com.mbridge.msdk.foundation.same.buffer.b.a(this.f41280b, "interstitial");
        this.f41282d = b();
        String strH = h();
        if (TextUtils.isEmpty(this.f41285g)) {
            this.f41285g = "0";
        }
        e eVar = new e();
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "app_id", strB);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PROPERTIES_UNIT_ID, this.f41280b);
        if (!TextUtils.isEmpty(this.f41281c)) {
            com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, MBridgeConstans.PLACEMENT_ID, this.f41281c);
        }
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "sign", md5);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "category", this.f41285g);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "req_type", i10 + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_num", iF + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "tnum", this.f41284f + "");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "only_impression", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ping_mode", "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.f40875g, strA);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.f40876h, c());
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, CampaignEx.JSON_KEY_AD_SOURCE_ID, "1");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, e.f40877i, strH);
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "ad_type", "279");
        com.mbridge.msdk.foundation.same.net.utils.b.a(eVar, "offset", this.f41282d + "");
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            if (TextUtils.isEmpty(this.f41280b)) {
                return;
            }
            com.mbridge.msdk.interstitial.controller.a.a(this.f41280b, 0);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void n() {
        try {
            this.f41282d += this.f41284f;
            if (this.f41282d > g()) {
                this.f41282d = 0;
            }
            if (TextUtils.isEmpty(this.f41280b)) {
                return;
            }
            com.mbridge.msdk.interstitial.controller.a.a(this.f41280b, this.f41282d);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public boolean f() {
        return this.f41283e;
    }

    public void j() {
        if (this.f41279a == null) {
            b("context is null");
            return;
        }
        if (TextUtils.isEmpty(this.f41280b)) {
            b("unitid is null");
            return;
        }
        l lVar = this.f41287i;
        if (lVar == null) {
            b("unitSetting is null please call load");
            return;
        }
        if (lVar.f() <= 0) {
            b("controller don't request ad");
            return;
        }
        a();
        List<CampaignEx> listE = e();
        if (listE == null || listE.size() <= 0) {
            k();
        } else {
            CampaignEx campaignEx = listE.get(0);
            c(campaignEx != null ? campaignEx.getRequestId() : "");
        }
    }

    public void k() {
        try {
            if (this.f41279a == null) {
                b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f41280b)) {
                b("unitid is null");
                return;
            }
            if (this.f41287i == null) {
                b("unitSetting is null please call load");
                return;
            }
            e eVarL = l();
            if (eVarL == null) {
                b("request parameter is null");
                return;
            }
            String strD = u0.d(this.f41280b);
            if (!TextUtils.isEmpty(strD)) {
                eVarL.a("j", strD);
            }
            com.mbridge.msdk.interstitial.request.a aVar = new com.mbridge.msdk.interstitial.request.a(this.f41279a);
            b bVar = new b();
            bVar.setUnitId(this.f41280b);
            bVar.setPlacementId(this.f41281c);
            bVar.setAdType(279);
            aVar.choiceV3OrV5BySetting(1, eVarL, bVar, "", CrashConfig.DEFAULT_INCOMPLETE_LOG_THRESHOLD_INTERVAL);
        } catch (Exception e10) {
            e10.printStackTrace();
            b("can't show because unknow error");
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.f41288j != null) {
            Message messageObtain = Message.obtain();
            messageObtain.obj = str;
            messageObtain.what = 3;
            this.f41288j.sendMessage(messageObtain);
        }
    }

    private List<CampaignEx> e() {
        try {
            if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
                return com.mbridge.msdk.interstitial.cache.a.a().a(this.f41280b, 1);
            }
            return null;
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public CampaignEx d() {
        try {
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (TextUtils.isEmpty(this.f41280b)) {
            return null;
        }
        a();
        List<CampaignEx> listE = e();
        if (listE != null && listE.size() > 0) {
            for (int i10 = 0; i10 < listE.size(); i10++) {
                CampaignEx campaignEx = listE.get(i10);
                if (campaignEx != null && (!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || !TextUtils.isEmpty(campaignEx.getMraid()))) {
                    return campaignEx;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        try {
            if (this.f41288j != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f41288j.sendMessage(messageObtain);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, List<CampaignEx> list) {
        if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
            com.mbridge.msdk.interstitial.cache.a.a().a(str, list);
        }
    }

    private String c() {
        String strA;
        strA = "";
        try {
            JSONArray jSONArrayB = u0.b(this.f41279a, this.f41280b);
            strA = jSONArrayB.length() > 0 ? u0.a(jSONArrayB) : "";
            p0.c("IntersAdapter", "get excludes:" + strA);
            return strA;
        } catch (Exception e10) {
            e10.printStackTrace();
            return strA;
        }
    }

    private void a() {
        try {
            if (com.mbridge.msdk.interstitial.cache.a.a() != null) {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                com.mbridge.msdk.interstitial.cache.a.a().a(gVarD.Z() * 1000, this.f41280b);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private List<CampaignEx> b(List<CampaignEx> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            try {
                if (list.size() > 0) {
                    int iE = this.f41287i.e();
                    for (int i10 = 0; i10 < list.size() && i10 < this.f41284f && arrayList.size() < iE; i10++) {
                        CampaignEx campaignEx = list.get(i10);
                        int i11 = 1;
                        if ((campaignEx == null || campaignEx.getOfferType() != 1 || !TextUtils.isEmpty(campaignEx.getVideoUrlEncode())) && campaignEx != null && ((!TextUtils.isEmpty(campaignEx.getHtmlUrl()) || campaignEx.isMraid()) && campaignEx.getOfferType() != 99)) {
                            if (u0.c(campaignEx)) {
                                if (!u0.c(this.f41279a, campaignEx.getPackageName())) {
                                    i11 = 2;
                                }
                                campaignEx.setRtinsType(i11);
                            }
                            if (com.mbridge.msdk.foundation.same.c.b(this.f41279a, campaignEx)) {
                                arrayList.add(campaignEx);
                            } else {
                                u0.a(this.f41280b, campaignEx, com.mbridge.msdk.foundation.same.a.f40727x);
                            }
                            a(campaignEx, null, this.f41279a, null);
                        }
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(List<CampaignEx> list) {
        if (this.f41279a == null || list == null || list.size() == 0) {
            return;
        }
        j jVarA = j.a(g.a(this.f41279a));
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx != null && jVarA != null && !jVarA.a(campaignEx.getId())) {
                com.mbridge.msdk.foundation.entity.g gVar = new com.mbridge.msdk.foundation.entity.g();
                gVar.a(campaignEx.getId());
                gVar.b(campaignEx.getFca());
                gVar.c(campaignEx.getFcb());
                gVar.a(0);
                gVar.d(0);
                gVar.a(System.currentTimeMillis());
                jVarA.b(gVar);
            }
        }
    }

    public void a(a.b bVar) {
        this.f41286h = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignUnit campaignUnit) {
        if (campaignUnit != null && campaignUnit.getAds() != null && campaignUnit.getAds().size() > 0) {
            ArrayList<CampaignEx> ads = campaignUnit.getAds();
            List<CampaignEx> listB = b(ads);
            a(campaignUnit.getSessionId());
            n();
            a(ads, listB);
            return;
        }
        b("no server ads available");
    }

    private void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.c cVar, Context context, com.mbridge.msdk.foundation.same.report.metrics.callback.a aVar) {
        try {
            com.mbridge.msdk.foundation.same.c.a(campaignEx, this.f41279a, cVar, new c(campaignEx, context, aVar));
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    private void a(List<CampaignEx> list, List<CampaignEx> list2) {
        new Thread(new d(list2, list)).start();
    }

    private int b() {
        int i10 = 0;
        try {
            int iA = !TextUtils.isEmpty(this.f41280b) ? com.mbridge.msdk.interstitial.controller.a.a(this.f41280b) : 0;
            if (iA <= g()) {
                i10 = iA;
            }
            p0.c("IntersAdapter", "getCurrentOffset:" + i10);
            return i10;
        } catch (Exception e10) {
            e10.printStackTrace();
            return i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<CampaignEx> a(List<CampaignEx> list) throws Throwable {
        FileOutputStream fileOutputStream;
        File file;
        File file2;
        ArrayList arrayList = new ArrayList(list.size());
        for (CampaignEx campaignEx : list) {
            if (campaignEx.isMraid() && !TextUtils.isEmpty(campaignEx.getMraid())) {
                com.mbridge.msdk.foundation.same.report.g.a("m_download_start", campaignEx, "", this.f41280b, CampaignEx.CLICKMODE_ON);
                FileOutputStream fileOutputStream2 = null;
                try {
                    try {
                        String strB = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_HTML);
                        String md5 = SameMD5.getMD5(b1.b(campaignEx.getMraid()));
                        if (TextUtils.isEmpty(md5)) {
                            md5 = String.valueOf(System.currentTimeMillis());
                        }
                        file2 = new File(strB, md5.concat(".html"));
                        fileOutputStream = new FileOutputStream(file2);
                    } catch (Exception e10) {
                        e = e10;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
                try {
                    StringBuilder sb2 = new StringBuilder();
                    String strB2 = com.mbridge.msdk.setting.util.a.a().b();
                    if (!TextUtils.isEmpty(strB2)) {
                        sb2.append("<script>");
                        sb2.append(strB2);
                        sb2.append("</script>");
                    }
                    sb2.append(campaignEx.getMraid());
                    fileOutputStream.write(sb2.toString().getBytes());
                    fileOutputStream.flush();
                    campaignEx.setMraid(file2.getAbsolutePath());
                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, "", this.f41280b, CampaignEx.CLICKMODE_ON);
                    try {
                        fileOutputStream.close();
                    } catch (Exception e11) {
                        e11.printStackTrace();
                    }
                } catch (Exception e12) {
                    e = e12;
                    fileOutputStream2 = fileOutputStream;
                    e.printStackTrace();
                    campaignEx.setMraid("");
                    com.mbridge.msdk.foundation.same.report.g.a("m_download_end", campaignEx, e.getMessage(), this.f41280b, CampaignEx.CLICKMODE_ON);
                    if (fileOutputStream2 != null) {
                        fileOutputStream2.close();
                    }
                    file = new File(campaignEx.getMraid());
                    if (file.exists()) {
                    }
                    b("mraid resource write fail");
                } catch (Throwable th3) {
                    th = th3;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (Exception e13) {
                            e13.printStackTrace();
                        }
                    }
                    throw th;
                }
                file = new File(campaignEx.getMraid());
                if (file.exists() || !file.isFile() || !file.canRead()) {
                    b("mraid resource write fail");
                }
            }
            arrayList.add(campaignEx);
        }
        return arrayList;
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        p0.c("IntersAdapter", "onload sessionId:" + str);
        com.mbridge.msdk.interstitial.controller.a.f41300o = str;
    }
}
