package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f45323c;

    /* renamed from: e, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.listener.a> f45325e;

    /* renamed from: h, reason: collision with root package name */
    private Context f45328h;

    /* renamed from: j, reason: collision with root package name */
    private String f45330j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f45331k;

    /* renamed from: m, reason: collision with root package name */
    private int f45333m;

    /* renamed from: p, reason: collision with root package name */
    private k f45336p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f45337q;

    /* renamed from: a, reason: collision with root package name */
    private List<CampaignEx> f45321a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f45322b = true;

    /* renamed from: d, reason: collision with root package name */
    private String f45324d = "";

    /* renamed from: f, reason: collision with root package name */
    private c f45326f = new a();

    /* renamed from: g, reason: collision with root package name */
    private CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> f45327g = new CopyOnWriteArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    private long f45329i = 3600;

    /* renamed from: l, reason: collision with root package name */
    private int f45332l = 1;

    /* renamed from: n, reason: collision with root package name */
    com.mbridge.msdk.setting.l f45334n = null;

    /* renamed from: o, reason: collision with root package name */
    com.mbridge.msdk.setting.l f45335o = null;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements c {
        public a() {
        }

        @Override // com.mbridge.msdk.videocommon.download.c
        public void onProgress(long j10, int i10) {
            if (i10 == 5 || i10 == 4) {
                l.this.f45322b = true;
                l.this.d();
            }
            if (i10 == 2) {
                l.this.f45322b = true;
            }
        }
    }

    public l(Context context, List<CampaignEx> list, String str, int i10) {
        this.f45333m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f45337q = zB;
            if (zB) {
                this.f45330j = str;
                this.f45333m = i10;
                this.f45336p = new k(list, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f45336p = null;
            this.f45337q = false;
        }
        this.f45328h = com.mbridge.msdk.foundation.controller.c.m().d();
        List<CampaignEx> list2 = this.f45321a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        this.f45330j = str;
        this.f45333m = i10;
        a(this.f45321a);
    }

    private boolean a(CampaignEx.c cVar) {
        return true;
    }

    public CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> c() {
        k kVar;
        return (!this.f45337q || (kVar = this.f45336p) == null) ? this.f45327g : kVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00df A[Catch: all -> 0x0022, TryCatch #1 {all -> 0x0022, blocks: (B:11:0x0016, B:13:0x001f, B:16:0x0025, B:17:0x002b, B:19:0x0031, B:22:0x003a, B:23:0x0042, B:25:0x0048, B:28:0x0058, B:31:0x005f, B:33:0x0065, B:34:0x0067, B:37:0x0073, B:38:0x0083, B:40:0x0094, B:42:0x0098, B:43:0x00a0, B:44:0x00a4, B:50:0x00b9, B:52:0x00bd, B:53:0x00d1, B:55:0x00d5, B:57:0x00db, B:59:0x00df, B:61:0x00e3, B:62:0x00f7, B:64:0x00fb, B:76:0x0129, B:78:0x012e, B:80:0x0134, B:84:0x016b, B:85:0x016f, B:87:0x0174, B:91:0x017c, B:94:0x0181, B:96:0x0185, B:97:0x018e, B:99:0x0192, B:103:0x019c, B:104:0x01a0, B:106:0x01c2, B:109:0x01c7, B:111:0x01cb, B:115:0x01d9, B:119:0x01e2, B:121:0x01ed, B:123:0x01f1, B:126:0x01f5, B:129:0x01fb, B:131:0x0206, B:135:0x020e, B:136:0x0213, B:142:0x0220, B:141:0x021d, B:65:0x0100, B:67:0x0104, B:71:0x0119, B:72:0x011f, B:74:0x0123, B:143:0x0225), top: B:150:0x0016, inners: #0, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.d():void");
    }

    public void e() {
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            kVar.k();
            return;
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f45327g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    try {
                        Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = this.f45327g.iterator();
                        while (it.hasNext()) {
                            Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                            if (next != null) {
                                Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it2 = next.entrySet().iterator();
                                while (it2.hasNext()) {
                                    com.mbridge.msdk.videocommon.download.a value = it2.next().getValue();
                                    if (value != null && value.j() == 1) {
                                        value.c("playing and stop download");
                                        value.b();
                                        this.f45327g.remove(next);
                                        return;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("UnitCacheCtroller", th3.getMessage());
                }
            }
        }
    }

    public void f(CampaignEx campaignEx) {
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            kVar.h(campaignEx);
            return;
        }
        List<CampaignEx> list = this.f45321a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        a(this.f45321a);
    }

    public void b(List<CampaignEx> list) {
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            kVar.a(list);
            return;
        }
        List<CampaignEx> list2 = this.f45321a;
        if (list2 != null && list != null) {
            list2.addAll(list);
        }
        a(this.f45321a);
    }

    private int c(CampaignEx campaignEx) {
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.f45335o == null) {
                    this.f45335o = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b(), this.f45330j);
                }
                return this.f45335o.C();
            }
            if (campaignEx.getAdType() == 42) {
                return a((CampaignEx) null);
            }
            if (this.f45331k == null) {
                this.f45331k = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f45330j, false);
            }
            return this.f45331k.w();
        } catch (Throwable th2) {
            p0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return 100;
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            kVar.a(aVar);
        } else {
            this.f45323c = aVar;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f45339a;

        public b(CampaignEx campaignEx) {
            this.f45339a = campaignEx;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            if (l.this.f45323c != null) {
                l.this.f45323c.a(str);
            }
            if (l.this.f45325e == null || l.this.f45325e.size() <= 0 || this.f45339a == null) {
                return;
            }
            com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f45325e.get(this.f45339a.getRequestId() + "_" + this.f45339a.getSecondRequestIndex());
            if (aVar != null) {
                aVar.a(str);
                l.this.f45325e.remove(this.f45339a.getRequestId() + "_" + this.f45339a.getSecondRequestIndex());
            }
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            if (l.this.f45323c != null) {
                l.this.f45323c.a(str, str2);
            }
            CampaignEx campaignEx = this.f45339a;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f45339a.getRsIgnoreCheckRule().size() <= 0 || !this.f45339a.getRsIgnoreCheckRule().contains(0)) {
                if (l.this.f45325e == null || l.this.f45325e.size() <= 0 || this.f45339a == null) {
                    return;
                }
                com.mbridge.msdk.videocommon.listener.a aVar = (com.mbridge.msdk.videocommon.listener.a) l.this.f45325e.get(this.f45339a.getRequestId() + "_" + this.f45339a.getSecondRequestIndex());
                if (aVar != null) {
                    aVar.a(str, str2);
                    l.this.f45325e.remove(this.f45339a.getRequestId() + "_" + this.f45339a.getSecondRequestIndex());
                    return;
                }
                return;
            }
            p0.c("UnitCacheCtroller", "Is not check video download status");
        }
    }

    public void a(String str, com.mbridge.msdk.videocommon.listener.a aVar) {
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            kVar.a(str, aVar);
            return;
        }
        if (this.f45325e == null) {
            this.f45325e = new ConcurrentHashMap<>();
        }
        if (aVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f45325e.put(str, aVar);
    }

    public void b() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            kVar.a();
            return;
        }
        if (r0.a().a("u_n_c_e_d", true) || (copyOnWriteArrayList = this.f45327g) == null) {
            return;
        }
        try {
            synchronized (copyOnWriteArrayList) {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    int i10 = 0;
                    while (i10 < this.f45327g.size()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f45327g.get(i10);
                        Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                            if (value != null) {
                                if (jCurrentTimeMillis - value.i() > this.f45329i * 1000 && value.j() == 1) {
                                    value.c("download timeout");
                                    value.c(this.f45332l);
                                    value.b();
                                    this.f45327g.remove(map);
                                    i10--;
                                }
                                if (value.j() != 1 && value.j() != 5 && value.j() != 0) {
                                    value.b();
                                    this.f45327g.remove(map);
                                    i10--;
                                }
                            }
                        }
                        i10++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th3.printStackTrace();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(5:85|86|116|91|(1:93)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d4, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0202, code lost:
    
        if (com.mbridge.msdk.MBridgeConstans.DEBUG != false) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0204, code lost:
    
        com.mbridge.msdk.foundation.tools.p0.b("UnitCacheCtroller", r4.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x020e, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0213, code lost:
    
        throw r12;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r12) {
        /*
            Method dump skipped, instructions count: 560
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.a(java.util.List):void");
    }

    private void e(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", 1);
                eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(b(campaignEx)));
                if (b(campaignEx) == 100) {
                    eVar.a("resumed_breakpoint", "2");
                } else {
                    eVar.a("resumed_breakpoint", "1");
                }
                eVar.a("resource_type", 4);
                eVar.a("scenes", "1");
                eVar.a("url", campaignEx.getVideoUrlEncode());
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public l(Context context, CampaignEx campaignEx, String str, int i10) {
        this.f45333m = 1;
        try {
            boolean zB = j.a().b(i10);
            this.f45337q = zB;
            if (zB) {
                this.f45330j = str;
                this.f45333m = i10;
                this.f45336p = new k(campaignEx, str, i10);
                return;
            }
        } catch (Exception unused) {
            this.f45336p = null;
            this.f45337q = false;
        }
        this.f45328h = com.mbridge.msdk.foundation.controller.c.m().d();
        List<CampaignEx> list = this.f45321a;
        if (list != null && campaignEx != null) {
            list.add(campaignEx);
        }
        this.f45330j = str;
        this.f45333m = i10;
        a(this.f45321a);
    }

    private int b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return -1;
        }
        if (campaignEx.getReady_rate() != -1) {
            return campaignEx.getReady_rate();
        }
        return c(campaignEx);
    }

    /* JADX WARN: Code restructure failed: missing block: B:127:0x01f8, code lost:
    
        if (r2 != 94) goto L131;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0190 A[Catch: all -> 0x0035, Exception -> 0x00dd, TRY_ENTER, TryCatch #0 {Exception -> 0x00dd, blocks: (B:45:0x00b5, B:46:0x00bf, B:48:0x00c5, B:56:0x00e8, B:59:0x00f0, B:62:0x00f7, B:64:0x0107, B:65:0x010f, B:93:0x016d, B:95:0x017f, B:101:0x0190, B:103:0x0196, B:148:0x023e, B:105:0x01a3, B:109:0x01ad, B:111:0x01b3, B:118:0x01be, B:120:0x01cb, B:122:0x01d5, B:124:0x01e2, B:131:0x0209, B:133:0x020f, B:135:0x0215, B:139:0x0220, B:147:0x0236, B:150:0x0243, B:153:0x024e, B:155:0x0252, B:157:0x025c, B:159:0x0262, B:163:0x026a, B:166:0x0274, B:168:0x027e, B:170:0x0284, B:69:0x011d, B:71:0x0123, B:73:0x012d, B:76:0x013d, B:78:0x0143, B:80:0x0149, B:81:0x014d, B:83:0x0153, B:87:0x015b, B:89:0x0165, B:178:0x02a9), top: B:188:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x016d A[Catch: all -> 0x0035, Exception -> 0x00dd, TRY_ENTER, TryCatch #0 {Exception -> 0x00dd, blocks: (B:45:0x00b5, B:46:0x00bf, B:48:0x00c5, B:56:0x00e8, B:59:0x00f0, B:62:0x00f7, B:64:0x0107, B:65:0x010f, B:93:0x016d, B:95:0x017f, B:101:0x0190, B:103:0x0196, B:148:0x023e, B:105:0x01a3, B:109:0x01ad, B:111:0x01b3, B:118:0x01be, B:120:0x01cb, B:122:0x01d5, B:124:0x01e2, B:131:0x0209, B:133:0x020f, B:135:0x0215, B:139:0x0220, B:147:0x0236, B:150:0x0243, B:153:0x024e, B:155:0x0252, B:157:0x025c, B:159:0x0262, B:163:0x026a, B:166:0x0274, B:168:0x027e, B:170:0x0284, B:69:0x011d, B:71:0x0123, B:73:0x012d, B:76:0x013d, B:78:0x0143, B:80:0x0149, B:81:0x014d, B:83:0x0153, B:87:0x015b, B:89:0x0165, B:178:0x02a9), top: B:188:0x0022 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.videocommon.download.a b(int r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.b(int, boolean):com.mbridge.msdk.videocommon.download.a");
    }

    private boolean d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return false;
        }
        try {
            return campaignEx.getPlayable_ads_without_video() == 2;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private void a() {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f45327g;
        if (copyOnWriteArrayList != null) {
            try {
                synchronized (copyOnWriteArrayList) {
                    int i10 = 0;
                    while (i10 < this.f45327g.size()) {
                        try {
                            Map<String, com.mbridge.msdk.videocommon.download.a> map = this.f45327g.get(i10);
                            Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it = map.entrySet().iterator();
                            while (it.hasNext()) {
                                com.mbridge.msdk.videocommon.download.a value = it.next().getValue();
                                if (value != null && value.c() != null && value.o()) {
                                    value.t();
                                    this.f45327g.remove(map);
                                    i10--;
                                }
                            }
                            i10++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
            } catch (Throwable unused) {
                p0.b("UnitCacheCtroller", "cleanDisplayTask ERROR");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0255 A[PHI: r16
      0x0255: PHI (r16v11 java.lang.String) = (r16v10 java.lang.String), (r16v10 java.lang.String), (r16v12 java.lang.String) binds: [B:134:0x0226, B:139:0x0234, B:147:0x0251] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0187 A[Catch: all -> 0x00c0, Exception -> 0x0130, TryCatch #1 {Exception -> 0x0130, blocks: (B:58:0x0107, B:91:0x0178, B:93:0x0187, B:95:0x018d, B:97:0x019c, B:99:0x01a4, B:101:0x01ab, B:103:0x01b2, B:105:0x01b8, B:111:0x01c0, B:113:0x01cf, B:115:0x01d9, B:117:0x01e7, B:135:0x0228, B:138:0x0232, B:140:0x0236, B:142:0x0240, B:144:0x0246, B:146:0x024c, B:154:0x0263, B:156:0x026d, B:158:0x0273, B:160:0x0279, B:132:0x0215, B:61:0x0115, B:63:0x011b, B:65:0x0125, B:71:0x0135, B:73:0x013b, B:75:0x0141, B:76:0x0147, B:78:0x014d, B:80:0x0153, B:82:0x015a, B:84:0x0164, B:86:0x016a), top: B:183:0x0107 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<com.mbridge.msdk.videocommon.download.a> a(java.lang.String r27, int r28, boolean r29, java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r30, boolean r31, com.mbridge.msdk.foundation.same.report.metrics.e r32) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.l.a(java.lang.String, int, boolean, java.util.List, boolean, com.mbridge.msdk.foundation.same.report.metrics.e):java.util.List");
    }

    private boolean b(String str, CampaignEx campaignEx) {
        if (campaignEx.isMraid() || TextUtils.isEmpty(str)) {
            return true;
        }
        if (campaignEx.getLoadTimeoutState() == 1 && !d(campaignEx)) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
            return z0.b(H5DownLoadManager.getInstance().getH5ResAddress(str)) || z0.b(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str));
        }
        p0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
        return true;
    }

    public void b(String str) {
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList;
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            kVar.c(str);
            return;
        }
        try {
            synchronized (this.f45327g) {
                try {
                    if (!TextUtils.isEmpty(str) && (copyOnWriteArrayList = this.f45327g) != null && copyOnWriteArrayList.size() > 0) {
                        Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = this.f45327g.iterator();
                        while (it.hasNext()) {
                            Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                            if (next != null) {
                                for (Map.Entry<String, com.mbridge.msdk.videocommon.download.a> entry : next.entrySet()) {
                                    if (entry != null && TextUtils.equals(entry.getKey(), str)) {
                                        this.f45327g.remove(next);
                                    }
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("UnitCacheCtroller", e10.getMessage());
            }
        }
    }

    public boolean a(List<CampaignEx> list, String str) {
        if (list == null || list.size() == 0) {
            return false;
        }
        for (int i10 = 0; i10 < list.size(); i10++) {
            CampaignEx campaignEx = list.get(i10);
            if (campaignEx == null || !a(new com.mbridge.msdk.videocommon.download.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx, str, this.f45332l), b(campaignEx), false) || !a(campaignEx.getendcard_url(), campaignEx)) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10) {
        long jH = aVar.h();
        long jE = aVar.e();
        if (TextUtils.isEmpty(aVar.d())) {
            p0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        if (i10 == 0) {
            if (aVar.c() != null && !TextUtils.isEmpty(aVar.c().getVideoUrlEncode())) {
                return true;
            }
        } else if (jE > 0 && jH * 100 >= jE * i10) {
            if (i10 != 100 || aVar.j() == 5) {
                return true;
            }
            aVar.b();
            return false;
        }
        return false;
    }

    public static boolean a(com.mbridge.msdk.videocommon.download.a aVar, int i10, boolean z10) {
        long jH = aVar.h();
        long jE = aVar.e();
        if (TextUtils.isEmpty(aVar.d())) {
            p0.a("UnitCacheCtroller", "checkVideoDownload video done return true");
            return true;
        }
        CampaignEx campaignExC = aVar.c();
        if (campaignExC != null) {
            if (campaignExC.getRsIgnoreCheckRule() != null && campaignExC.getRsIgnoreCheckRule().size() > 0 && campaignExC.getRsIgnoreCheckRule().contains(0)) {
                p0.c("UnitCacheCtroller", "Is not check video download status");
                return true;
            }
            if (campaignExC.getIsTimeoutCheckVideoStatus() == 1 && campaignExC.getVideoCheckType() == 1) {
                return true;
            }
            if (z10 && campaignExC.getVideoCheckType() == 1) {
                if (i10 == 0) {
                    return true;
                }
                if ((jE != 0 || jH != 0) && jH >= (i10 / 100) * jE) {
                    campaignExC.setIsTimeoutCheckVideoStatus(1);
                    return true;
                }
            }
        }
        return a(aVar, i10);
    }

    private boolean a(String str, CampaignEx campaignEx) {
        try {
            if (campaignEx.getRsIgnoreCheckRule() == null || campaignEx.getRsIgnoreCheckRule().size() <= 0 || !campaignEx.getRsIgnoreCheckRule().contains(2)) {
                return (campaignEx.isDynamicView() && !u0.l(str)) || z0.a(str) || b(str, campaignEx);
            }
            p0.c("UnitCacheCtroller", "Is not check endCard download status : " + str);
            return true;
        } catch (Throwable th2) {
            p0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return false;
        }
    }

    private boolean a(int i10, CampaignEx campaignEx, String str) {
        if (campaignEx.isDynamicView()) {
            return true;
        }
        if (campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
            p0.c("UnitCacheCtroller", "Is not check template download status");
            return true;
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getLoadTimeoutState() == 0) {
            p0.a("UnitCacheCtroller", "check template 下载情况：" + H5DownLoadManager.getInstance().getH5ResAddress(str));
            if (H5DownLoadManager.getInstance().getH5ResAddress(str) == null) {
                return false;
            }
        }
        return true;
    }

    public com.mbridge.msdk.videocommon.download.a a(int i10, boolean z10) {
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            return kVar.d();
        }
        try {
            return b(i10, z10);
        } catch (Throwable th2) {
            p0.b("UnitCacheCtroller", th2.getMessage(), th2);
            return null;
        }
    }

    public com.mbridge.msdk.videocommon.download.a a(String str) {
        k kVar;
        if (this.f45337q && (kVar = this.f45336p) != null) {
            return kVar.a(str);
        }
        CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList = this.f45327g;
        if (copyOnWriteArrayList == null) {
            return null;
        }
        synchronized (copyOnWriteArrayList) {
            try {
                try {
                    Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = this.f45327g.iterator();
                    while (it.hasNext()) {
                        Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                        if (next != null && next.containsKey(str)) {
                            return next.get(str);
                        }
                    }
                } catch (Throwable unused) {
                    p0.b("UnitCacheCtroller", "failed to get campaignTast by cid");
                }
                return null;
            } finally {
            }
        }
    }

    private boolean a(CopyOnWriteArrayList<Map<String, com.mbridge.msdk.videocommon.download.a>> copyOnWriteArrayList) {
        try {
            Iterator<Map<String, com.mbridge.msdk.videocommon.download.a>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                Map<String, com.mbridge.msdk.videocommon.download.a> next = it.next();
                if (next != null) {
                    Iterator<Map.Entry<String, com.mbridge.msdk.videocommon.download.a>> it2 = next.entrySet().iterator();
                    while (it2.hasNext()) {
                        if (it2.next().getValue().j() == 1) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th2) {
            if (!MBridgeConstans.DEBUG) {
                return false;
            }
            th2.printStackTrace();
            return false;
        }
    }

    private int a(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.f45334n;
            if (lVar != null) {
                return lVar.C();
            }
            return 100;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            p0.b("UnitCacheCtroller", e10.getMessage());
            return 100;
        }
    }
}
