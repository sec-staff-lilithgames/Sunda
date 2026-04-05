package com.mbridge.msdk.click;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.ironsource.G5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.LoadingActivity;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.scheme.applet.AppletSchemeCallBack;
import com.mbridge.msdk.scheme.applet.AppletsModel;
import cv.BLca.YsiBvdpw;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: n, reason: collision with root package name */
    public static boolean f39640n;

    /* renamed from: o, reason: collision with root package name */
    public static Map<String, Long> f39641o = new HashMap();

    /* renamed from: p, reason: collision with root package name */
    public static Set<String> f39642p = new HashSet();

    /* renamed from: a, reason: collision with root package name */
    private String f39643a;

    /* renamed from: b, reason: collision with root package name */
    private long f39644b;

    /* renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.db.g f39645c;

    /* renamed from: d, reason: collision with root package name */
    private Context f39646d;

    /* renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.e f39647e;

    /* renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.foundation.same.report.h f39649g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f39650h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean f39651i;

    /* renamed from: l, reason: collision with root package name */
    private boolean f39654l;

    /* renamed from: m, reason: collision with root package name */
    private j f39655m;

    /* renamed from: f, reason: collision with root package name */
    private NativeListener.NativeTrackingListener f39648f = null;

    /* renamed from: j, reason: collision with root package name */
    private boolean f39652j = false;

    /* renamed from: k, reason: collision with root package name */
    private boolean f39653k = true;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements g {
        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f39660a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f39661b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39662c;

        public c(boolean z10, boolean z11, CampaignEx campaignEx) {
            this.f39660a = z10;
            this.f39661b = z11;
            this.f39662c = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39660a && !a.f39640n && !a.this.f39654l && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER && !this.f39661b) {
                a.this.d(this.f39662c);
            }
            if (this.f39660a || a.this.f39648f == null || a.f39640n || a.this.f39654l || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f39648f.onShowLoading(this.f39662c);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f39670a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Campaign f39671b;

        public e(boolean z10, Campaign campaign) {
            this.f39670a = z10;
            this.f39671b = campaign;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39670a && !a.f39640n && MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                a.this.a();
            }
            if (a.this.f39648f == null || a.f39640n || !MBridgeConstans.NATIVE_SHOW_LOADINGPAGER) {
                return;
            }
            a.this.f39648f.onDismissLoading(this.f39671b);
        }
    }

    public a(Context context, String str) {
        this.f39645c = null;
        this.f39646d = null;
        com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(str);
        this.f39650h = gVarD;
        if (gVarD == null) {
            this.f39650h = com.mbridge.msdk.setting.h.b().a();
        }
        this.f39651i = this.f39650h.J0();
        Context applicationContext = context.getApplicationContext();
        this.f39646d = applicationContext;
        this.f39643a = str;
        if (this.f39645c == null) {
            this.f39645c = com.mbridge.msdk.foundation.db.g.a(applicationContext);
        }
        this.f39649g = new com.mbridge.msdk.foundation.same.report.h(this.f39646d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String b(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "" : "2000138" : "2000139" : "2000137" : "2000136";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(CampaignEx campaignEx) {
        try {
            Intent intent = new Intent(this.f39646d, (Class<?>) LoadingActivity.class);
            intent.setFlags(268435456);
            intent.putExtra(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
            this.f39646d.startActivity(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    public void c() {
        try {
            this.f39648f = null;
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void c(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String currentLocalRid = campaignEx.getCurrentLocalRid();
            if (campaignEx.getLocalAllowTrackClick() == 0) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
                    if (cVarB != null) {
                        cVarB.a(cVarB.o() + "m_check_local_c");
                    }
                } catch (Exception unused) {
                    p0.b("CommonClickControl", "sendClickStateToAnl error");
                }
            }
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB2 = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(currentLocalRid);
            cVarB2.a(campaignEx);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_check_local_c", cVarB2);
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11) {
        if (context == null) {
            return;
        }
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, null, str2, z10, z11, com.mbridge.msdk.click.retry.a.f39791l);
    }

    public boolean b(CampaignEx campaignEx) {
        Long l9;
        if (campaignEx == null) {
            return true;
        }
        try {
            if (2 != campaignEx.getLinkType() && 3 != campaignEx.getLinkType()) {
                return true;
            }
            String id2 = campaignEx.getId();
            Map<String, Long> map = f39641o;
            if (map == null) {
                return true;
            }
            if (map.containsKey(id2) && (l9 = f39641o.get(id2)) != null) {
                if (l9.longValue() > System.currentTimeMillis() || f39642p.contains(campaignEx.getId())) {
                    return false;
                }
            }
            f39641o.put(campaignEx.getId(), Long.valueOf(System.currentTimeMillis() + (campaignEx.getClickTimeOutInterval() * 1000)));
            return true;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return true;
            }
            e10.printStackTrace();
            return true;
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String str2, boolean z10, boolean z11, int i10) {
        if (context == null) {
            return;
        }
        int i11 = TextUtils.isEmpty(str2) ? -1 : str2.startsWith("tcp") ? 1 : 0;
        a(i10, campaignEx, i11);
        new com.mbridge.msdk.click.e(context.getApplicationContext()).a(str, campaignEx, new C0256a(i11, str2, i10, campaignEx), str2, z10, z11, i10);
    }

    private static void a(int i10, CampaignEx campaignEx, int i11) {
        if (campaignEx != null) {
            try {
                String strB = b(i10);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("net_ty", Integer.valueOf(i11));
                eVar.a("result", 3);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, campaignEx, eVar);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private int b() {
        try {
            com.mbridge.msdk.setting.g gVar = this.f39650h;
            if (gVar != null) {
                return gVar.V();
            }
            return 1;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 1;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.click.a$a, reason: collision with other inner class name */
    public class C0256a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f39656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f39657b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f39658c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39659d;

        public C0256a(int i10, String str, int i11, CampaignEx campaignEx) {
            this.f39656a = i10;
            this.f39657b = str;
            this.f39658c = i11;
            this.f39659d = campaignEx;
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                eVar.a("net_ty", String.valueOf(this.f39656a));
                if (obj != null && (obj instanceof JumpLoaderResult)) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String str = jumpLoaderResult.getStatusCode() + "";
                    eVar.a("status_code", str);
                    if (str.startsWith("2")) {
                        eVar.a("result", 1);
                    } else {
                        String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                        if (TextUtils.isEmpty(exceptionMsg)) {
                            exceptionMsg = "UNKNOWN EXCEPTION and Status Code is : ".concat(str);
                        }
                        eVar.a("failingURL", b1.d(this.f39657b));
                        eVar.a("reason", exceptionMsg);
                    }
                }
                String strB = a.b(this.f39658c);
                if (this.f39659d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f39659d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("CommonClickControl", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        @Override // com.mbridge.msdk.click.g
        public void a(Object obj, String str) {
            try {
                String strB = a.b(this.f39658c);
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("result", 2);
                if (obj instanceof JumpLoaderResult) {
                    JumpLoaderResult jumpLoaderResult = (JumpLoaderResult) obj;
                    String exceptionMsg = jumpLoaderResult.getExceptionMsg();
                    if (!TextUtils.isEmpty(exceptionMsg)) {
                        str = exceptionMsg;
                    }
                    eVar.a("reason", str);
                    eVar.a("status_code", Integer.valueOf(jumpLoaderResult.getStatusCode()));
                }
                eVar.a("code", "");
                eVar.a("failingURL", b1.d(this.f39657b));
                eVar.a(YsiBvdpw.pbvIJqvJnIGJbPq, String.valueOf(this.f39656a));
                if (this.f39659d != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(strB, this.f39659d, eVar);
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("CommonClickControl", e10.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f39664a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f39665b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Boolean f39666c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ List f39667d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f39668e;

        public d(CampaignEx campaignEx, boolean z10, Boolean bool, List list, boolean z11) {
            this.f39664a = campaignEx;
            this.f39665b = z10;
            this.f39666c = bool;
            this.f39667d = list;
            this.f39668e = z11;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:20:0x0063, B:22:0x0071, B:25:0x0082, B:27:0x0086, B:29:0x0090, B:31:0x0098), top: B:41:0x0063 }] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0086 A[Catch: all -> 0x007f, TryCatch #2 {all -> 0x007f, blocks: (B:20:0x0063, B:22:0x0071, B:25:0x0082, B:27:0x0086, B:29:0x0090, B:31:0x0098), top: B:41:0x0063 }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0097  */
        /* JADX WARN: Type inference failed for: r0v17 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6, types: [int] */
        @Override // com.mbridge.msdk.click.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.Object r11) {
            /*
                r10 = this;
                java.util.Set<java.lang.String> r0 = com.mbridge.msdk.click.a.f39642p
                if (r0 == 0) goto Ld
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r10.f39664a
                java.lang.String r1 = r1.getId()
                r0.remove(r1)
            Ld:
                java.lang.String r1 = "CommonClickControl"
                r2 = 0
                if (r11 == 0) goto L63
                boolean r0 = r11 instanceof com.mbridge.msdk.click.entity.JumpLoaderResult     // Catch: java.lang.Throwable -> L5a
                if (r0 == 0) goto L63
                r5 = r11
                com.mbridge.msdk.click.entity.JumpLoaderResult r5 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r5     // Catch: java.lang.Throwable -> L5a
                com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f39664a     // Catch: java.lang.Throwable -> L4b
                r11.setJumpResult(r5)     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.a r3 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.entity.CampaignEx r4 = r10.f39664a     // Catch: java.lang.Throwable -> L4b
                boolean r6 = r10.f39665b     // Catch: java.lang.Throwable -> L4b
                boolean r7 = com.mbridge.msdk.click.a.d(r3)     // Catch: java.lang.Throwable -> L4b
                java.lang.Boolean r8 = r10.f39666c     // Catch: java.lang.Throwable -> L4b
                java.util.List r9 = r10.f39667d     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.a.a(r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L4b
                boolean r11 = r5.isjumpDone()     // Catch: java.lang.Throwable -> L4b
                if (r11 == 0) goto L4f
                com.mbridge.msdk.click.a r11 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.db.g r11 = com.mbridge.msdk.click.a.e(r11)     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.db.d r11 = com.mbridge.msdk.foundation.db.d.a(r11)     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f39664a     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.a r2 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L4b
                java.lang.String r2 = com.mbridge.msdk.click.a.f(r2)     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.b.a(r11, r0, r2)     // Catch: java.lang.Throwable -> L4b
                goto L4f
            L4b:
                r0 = move-exception
                r11 = r0
                r2 = r5
                goto L5c
            L4f:
                com.mbridge.msdk.click.a r11 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L4b
                boolean r0 = r10.f39668e     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f39664a     // Catch: java.lang.Throwable -> L4b
                com.mbridge.msdk.click.a.a(r11, r0, r2)     // Catch: java.lang.Throwable -> L4b
                r2 = r5
                goto L63
            L5a:
                r0 = move-exception
                r11 = r0
            L5c:
                java.lang.String r11 = r11.getMessage()
                com.mbridge.msdk.foundation.tools.p0.b(r1, r11)
            L63:
                com.mbridge.msdk.foundation.same.report.metrics.e r11 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Throwable -> L7f
                r11.<init>()     // Catch: java.lang.Throwable -> L7f
                java.lang.String r0 = "result"
                java.lang.String r3 = "1"
                r11.a(r0, r3)     // Catch: java.lang.Throwable -> L7f
                if (r2 == 0) goto L82
                java.lang.String r0 = "status_code"
                int r2 = r2.getStatusCode()     // Catch: java.lang.Throwable -> L7f
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L7f
                r11.a(r0, r2)     // Catch: java.lang.Throwable -> L7f
                goto L82
            L7f:
                r0 = move-exception
                r11 = r0
                goto Lad
            L82:
                com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f39664a     // Catch: java.lang.Throwable -> L7f
                if (r0 == 0) goto L97
                java.lang.String r0 = r0.getClickURL()     // Catch: java.lang.Throwable -> L7f
                boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L7f
                if (r2 != 0) goto L97
                java.lang.String r2 = "tcp"
                boolean r0 = r0.startsWith(r2)     // Catch: java.lang.Throwable -> L7f
                goto L98
            L97:
                r0 = -1
            L98:
                java.lang.String r2 = "net_ty"
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L7f
                r11.a(r2, r0)     // Catch: java.lang.Throwable -> L7f
                com.mbridge.msdk.foundation.same.report.metrics.d r0 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Throwable -> L7f
                java.lang.String r2 = "2000138"
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r10.f39664a     // Catch: java.lang.Throwable -> L7f
                r0.a(r2, r3, r11)     // Catch: java.lang.Throwable -> L7f
                goto Lb8
            Lad:
                boolean r0 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r0 == 0) goto Lb8
                java.lang.String r11 = r11.getMessage()
                com.mbridge.msdk.foundation.tools.p0.b(r1, r11)
            Lb8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.d.a(java.lang.Object):void");
        }

        @Override // com.mbridge.msdk.click.g
        public void b(Object obj) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:22:0x004e, B:24:0x0052, B:26:0x005c, B:30:0x0066, B:32:0x007d, B:33:0x008a), top: B:39:0x004e }] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x007d A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:22:0x004e, B:24:0x0052, B:26:0x005c, B:30:0x0066, B:32:0x007d, B:33:0x008a), top: B:39:0x004e }] */
        /* JADX WARN: Type inference failed for: r6v10, types: [int] */
        /* JADX WARN: Type inference failed for: r6v21 */
        /* JADX WARN: Type inference failed for: r6v9 */
        @Override // com.mbridge.msdk.click.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(java.lang.Object r6, java.lang.String r7) {
            /*
                r5 = this;
                java.util.Set<java.lang.String> r0 = com.mbridge.msdk.click.a.f39642p
                if (r0 == 0) goto Ld
                com.mbridge.msdk.foundation.entity.CampaignEx r1 = r5.f39664a
                java.lang.String r1 = r1.getId()
                r0.remove(r1)
            Ld:
                java.lang.String r0 = "CommonClickControl"
                r1 = 0
                if (r6 == 0) goto L2a
                boolean r2 = r6 instanceof com.mbridge.msdk.click.entity.JumpLoaderResult     // Catch: java.lang.Throwable -> L28
                if (r2 == 0) goto L2a
                r2 = r6
                com.mbridge.msdk.click.entity.JumpLoaderResult r2 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r2     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.click.a r1 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L25
                com.mbridge.msdk.click.entity.JumpLoaderResult r6 = (com.mbridge.msdk.click.entity.JumpLoaderResult) r6     // Catch: java.lang.Throwable -> L25
                com.mbridge.msdk.foundation.entity.CampaignEx r3 = r5.f39664a     // Catch: java.lang.Throwable -> L25
                r4 = 1
                com.mbridge.msdk.click.a.a(r1, r6, r3, r4)     // Catch: java.lang.Throwable -> L25
                r1 = r2
                goto L2a
            L25:
                r6 = move-exception
                r1 = r2
                goto L47
            L28:
                r6 = move-exception
                goto L47
            L2a:
                com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = com.mbridge.msdk.click.a.c(r6)     // Catch: java.lang.Throwable -> L28
                if (r6 == 0) goto L3d
                com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.out.NativeListener$NativeTrackingListener r6 = com.mbridge.msdk.click.a.c(r6)     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r5.f39664a     // Catch: java.lang.Throwable -> L28
                r6.onRedirectionFailed(r2, r7)     // Catch: java.lang.Throwable -> L28
            L3d:
                com.mbridge.msdk.click.a r6 = com.mbridge.msdk.click.a.this     // Catch: java.lang.Throwable -> L28
                boolean r7 = r5.f39668e     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r5.f39664a     // Catch: java.lang.Throwable -> L28
                com.mbridge.msdk.click.a.a(r6, r7, r2)     // Catch: java.lang.Throwable -> L28
                goto L4e
            L47:
                java.lang.String r6 = r6.getMessage()
                com.mbridge.msdk.foundation.tools.p0.b(r0, r6)
            L4e:
                com.mbridge.msdk.foundation.entity.CampaignEx r6 = r5.f39664a     // Catch: java.lang.Throwable -> L63
                if (r6 == 0) goto L65
                java.lang.String r6 = r6.getClickURL()     // Catch: java.lang.Throwable -> L63
                boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L63
                if (r7 != 0) goto L65
                java.lang.String r7 = "tcp"
                boolean r6 = r6.startsWith(r7)     // Catch: java.lang.Throwable -> L63
                goto L66
            L63:
                r6 = move-exception
                goto L96
            L65:
                r6 = -1
            L66:
                com.mbridge.msdk.foundation.same.report.metrics.e r7 = new com.mbridge.msdk.foundation.same.report.metrics.e     // Catch: java.lang.Throwable -> L63
                r7.<init>()     // Catch: java.lang.Throwable -> L63
                java.lang.String r2 = "result"
                java.lang.String r3 = "2"
                r7.a(r2, r3)     // Catch: java.lang.Throwable -> L63
                java.lang.String r2 = "net_ty"
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L63
                r7.a(r2, r6)     // Catch: java.lang.Throwable -> L63
                if (r1 == 0) goto L8a
                java.lang.String r6 = "status_code"
                int r1 = r1.getStatusCode()     // Catch: java.lang.Throwable -> L63
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L63
                r7.a(r6, r1)     // Catch: java.lang.Throwable -> L63
            L8a:
                com.mbridge.msdk.foundation.same.report.metrics.d r6 = com.mbridge.msdk.foundation.same.report.metrics.d.b()     // Catch: java.lang.Throwable -> L63
                java.lang.String r1 = "2000138"
                com.mbridge.msdk.foundation.entity.CampaignEx r2 = r5.f39664a     // Catch: java.lang.Throwable -> L63
                r6.a(r1, r2, r7)     // Catch: java.lang.Throwable -> L63
                goto La1
            L96:
                boolean r7 = com.mbridge.msdk.MBridgeConstans.DEBUG
                if (r7 == 0) goto La1
                java.lang.String r6 = r6.getMessage()
                com.mbridge.msdk.foundation.tools.p0.b(r0, r6)
            La1:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.d.a(java.lang.Object, java.lang.String):void");
        }
    }

    public static void a(Context context, CampaignEx campaignEx, String str, String[] strArr, boolean z10, boolean z11) {
        if (context == null || campaignEx == null || TextUtils.isEmpty(str) || strArr == null) {
            return;
        }
        com.mbridge.msdk.click.e eVar = new com.mbridge.msdk.click.e(context.getApplicationContext());
        for (String str2 : strArr) {
            eVar.a(str, campaignEx, new b(), str2, z10, z11, com.mbridge.msdk.click.retry.a.f39791l);
        }
    }

    public void a(String str) {
        this.f39643a = str;
    }

    public void a(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.f39648f = nativeTrackingListener;
    }

    public void a(j jVar) {
        this.f39655m = jVar;
    }

    public void a(boolean z10) {
        this.f39653k = z10;
    }

    public void a(CampaignEx campaignEx, NativeListener.NativeAdListener nativeAdListener) {
        if (nativeAdListener != null && campaignEx != null) {
            nativeAdListener.onAdClick(campaignEx);
        }
        a(campaignEx);
    }

    /* JADX WARN: Removed duplicated region for block: B:216:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:230:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r19) {
        /*
            Method dump skipped, instructions count: 945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx):void");
    }

    private AppletSchemeCallBack a(NativeListener.NativeTrackingListener nativeTrackingListener, CampaignEx campaignEx, AppletsModel appletsModel, a aVar) {
        return new h(nativeTrackingListener, campaignEx, appletsModel, aVar);
    }

    private void a(Context context, CampaignEx campaignEx, List<String> list) {
        if (context == null) {
            com.mbridge.msdk.foundation.same.report.j.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx, 2, "context is null", this.f39643a);
            return;
        }
        boolean z10 = l0.D() == 1;
        boolean z11 = l0.D(context) == 1;
        if (z10 && z11) {
            String ghId = campaignEx.getGhId();
            String ghPath = campaignEx.getGhPath();
            String bindId = campaignEx.getBindId();
            String strI = com.mbridge.msdk.foundation.controller.c.m().i();
            if (!TextUtils.isEmpty(ghId)) {
                try {
                    if (!TextUtils.isEmpty(strI)) {
                        bindId = strI;
                    }
                    Object objD = l0.d(bindId);
                    Class<?> cls = Class.forName("com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req");
                    Object objNewInstance = cls.newInstance();
                    cls.getField("userName").set(objNewInstance, ghId);
                    cls.getField("path").set(objNewInstance, ghPath);
                    cls.getField("miniprogramType").set(objNewInstance, cls.getField("MINIPTOGRAM_TYPE_RELEASE").get(null));
                    Class.forName("com.tencent.mm.opensdk.openapi.IWXAPI").getMethod("sendReq", Class.forName("com.tencent.mm.opensdk.modelbase.BaseReq")).invoke(objD, objNewInstance);
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 1, "", this.f39643a);
                    return;
                } catch (Throwable th2) {
                    com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, th2.getMessage(), this.f39643a);
                    a(campaignEx, list);
                    return;
                }
            }
            a(campaignEx, list);
            com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "ghid is empty", this.f39643a);
            return;
        }
        com.mbridge.msdk.foundation.same.report.j.a(context, campaignEx, 2, "integrated:" + z10 + "-hasWx:" + z11, this.f39643a);
        a(campaignEx, list);
    }

    private void a(CampaignEx campaignEx, List<String> list) {
        if (b() == 2) {
            t0.a(this.f39646d, campaignEx.getClickURL(), campaignEx, this.f39648f, list);
        } else {
            t0.a(this.f39646d, campaignEx.getClickURL(), this.f39648f, campaignEx, list);
        }
    }

    private void a(CampaignEx campaignEx, boolean z10, Boolean bool, List<String> list) {
        boolean z11;
        boolean z12;
        try {
            this.f39644b = System.currentTimeMillis();
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f39648f;
            if (nativeTrackingListener == null || z10) {
                z11 = true;
            } else {
                nativeTrackingListener.onStartRedirection(campaignEx, campaignEx.getClickURL());
                z11 = !this.f39648f.onInterceptDefaultLoadingDialog();
            }
            this.f39654l = false;
            boolean z13 = true;
            if (campaignEx.getJumpResult() != null) {
                if (!z10) {
                    a(campaignEx, campaignEx.getJumpResult(), true, this.f39652j, bool, list);
                }
                this.f39654l = true;
                this.f39652j = false;
                z13 = false;
            }
            if (!com.mbridge.msdk.foundation.db.d.a(this.f39645c).c(campaignEx.getId(), this.f39643a) || campaignEx.getJumpResult() == null) {
                com.mbridge.msdk.foundation.db.d dVarA = com.mbridge.msdk.foundation.db.d.a(this.f39645c);
                dVarA.a();
                JumpLoaderResult jumpLoaderResultB = dVarA.b(campaignEx.getId(), this.f39643a);
                if (jumpLoaderResultB != null && !z10) {
                    campaignEx.setJumpResult(jumpLoaderResultB);
                    if (z13) {
                        a(campaignEx, jumpLoaderResultB, z13, this.f39652j, bool, list);
                        this.f39654l = true;
                        this.f39652j = false;
                        z12 = false;
                    }
                    z12 = z13;
                } else {
                    if (campaignEx.getClick_mode().equals("6") && !campaignEx.getPackageName().isEmpty() && campaignEx.getLinkType() == 2 && !z10) {
                        boolean zA = t0.a.a(this.f39646d, "market://details?id=" + campaignEx.getPackageName(), this.f39648f);
                        if (list != null) {
                            list.add("google_play");
                        }
                        if (zA) {
                            a(campaignEx, 1, 1, list);
                        }
                        NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f39648f;
                        if (nativeTrackingListener2 != null && z13) {
                            nativeTrackingListener2.onDismissLoading(campaignEx);
                            this.f39648f.onFinishRedirection(campaignEx, null);
                        }
                        this.f39654l = true;
                        z13 = false;
                    }
                    if (z10) {
                        this.f39654l = true;
                        this.f39652j = false;
                        z12 = false;
                    }
                    z12 = z13;
                }
                new Handler(Looper.getMainLooper()).post(new c(z11, z10, campaignEx));
                com.mbridge.msdk.click.e eVar = this.f39647e;
                if (eVar != null) {
                    eVar.a();
                }
                Set<String> set = f39642p;
                if (set != null && set.contains(campaignEx.getId())) {
                    NativeListener.NativeTrackingListener nativeTrackingListener3 = this.f39648f;
                    if (nativeTrackingListener3 != null) {
                        nativeTrackingListener3.onDismissLoading(campaignEx);
                        this.f39648f.onFinishRedirection(campaignEx, campaignEx.getClickURL());
                        return;
                    }
                    return;
                }
                Set<String> set2 = f39642p;
                if (set2 != null) {
                    set2.add(campaignEx.getId());
                }
                com.mbridge.msdk.click.e eVar2 = new com.mbridge.msdk.click.e(this.f39646d);
                this.f39647e = eVar2;
                eVar2.a(this.f39643a, campaignEx, new d(campaignEx, z12, bool, list, z11));
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, Campaign campaign) {
        new Handler(Looper.getMainLooper()).post(new e(z10, campaign));
    }

    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx == null || jumpLoaderResult == null) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f39644b;
            com.mbridge.msdk.foundation.entity.e eVar = new com.mbridge.msdk.foundation.entity.e();
            int iS = l0.s(this.f39646d);
            eVar.e(iS);
            eVar.h(l0.a(this.f39646d, iS));
            eVar.i(campaignEx.getRequestId());
            eVar.j(campaignEx.getRequestIdNotice());
            eVar.a(i10);
            eVar.c(jCurrentTimeMillis + "");
            eVar.a(campaignEx.getId());
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), G5.N));
            }
            eVar.b((this.f39644b / 1000) + "");
            eVar.c(Integer.parseInt(campaignEx.getLandingType()));
            eVar.d(campaignEx.getLinkType());
            eVar.k(this.f39643a);
            eVar.f(jumpLoaderResult.getType());
            if (!TextUtils.isEmpty(jumpLoaderResult.getUrl())) {
                eVar.g(URLEncoder.encode(jumpLoaderResult.getUrl(), G5.N));
            }
            if (this.f39651i) {
                eVar.b(jumpLoaderResult.getStatusCode());
                if (!TextUtils.isEmpty(jumpLoaderResult.getHeader())) {
                    eVar.f(URLEncoder.encode(jumpLoaderResult.getHeader(), G5.N));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getContent())) {
                    eVar.d(URLEncoder.encode(jumpLoaderResult.getContent(), C.UTF8_NAME));
                }
                if (!TextUtils.isEmpty(jumpLoaderResult.getExceptionMsg())) {
                    eVar.e(URLEncoder.encode(jumpLoaderResult.getExceptionMsg(), G5.N));
                }
            }
            if (z10) {
                this.f39649g.a("click_jump_error", eVar, this.f39643a);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(eVar);
            ArrayList<JSONObject> arrayListA = com.mbridge.msdk.foundation.entity.e.a(arrayList);
            if (arrayListA == null || arrayListA.isEmpty()) {
                return;
            }
            Iterator<JSONObject> it = arrayListA.iterator();
            while (it.hasNext()) {
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(it.next());
            }
        } catch (Throwable th2) {
            p0.b("CommonClickControl", th2.getMessage());
        }
    }

    public void a(Campaign campaign, String str) {
        try {
            if (!TextUtils.isEmpty(str) && campaign != null) {
                CampaignEx campaignEx = campaign instanceof CampaignEx ? (CampaignEx) campaign : null;
                if (!str.startsWith("market://") && !str.startsWith("https://play.google.com/")) {
                    com.mbridge.msdk.click.b.a(str, this.f39646d, this.f39643a, campaignEx, this.f39648f);
                    return;
                }
                if (t0.a.a(this.f39646d, str, this.f39648f) || campaignEx == null) {
                    return;
                }
                if (!TextUtils.isEmpty(campaignEx.getPackageName())) {
                    t0.a.a(this.f39646d, "market://details?id=" + campaignEx.getPackageName(), this.f39648f);
                    return;
                }
                if (b() == 2) {
                    t0.a(this.f39646d, campaignEx.getClickURL(), campaignEx, this.f39648f, new ArrayList());
                } else {
                    t0.a(this.f39646d, campaignEx.getClickURL(), this.f39648f, campaignEx, new ArrayList());
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(JumpLoaderResult jumpLoaderResult, CampaignEx campaignEx, boolean z10) {
        a(jumpLoaderResult, campaignEx, 1, z10);
    }

    private void a(int i10, String str, CampaignEx campaignEx, NativeListener.NativeTrackingListener nativeTrackingListener, List<String> list) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            if (i10 == 2) {
                t0.a(this.f39646d, str, campaignEx, nativeTrackingListener, list);
            } else {
                t0.a(this.f39646d, str, nativeTrackingListener, campaignEx, list);
            }
        } catch (Throwable th2) {
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonClickControl", th2.getMessage(), th2);
            }
        }
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, int i10, List<String> list) {
        boolean z11 = true;
        boolean z12 = false;
        if (z10) {
            try {
                int i11 = Integer.parseInt(campaignEx.getLandingType());
                if (i11 == 1) {
                    t0.a(this.f39646d, jumpLoaderResult.getUrl(), this.f39648f, campaignEx, list);
                } else if (i11 == 2) {
                    t0.a(this.f39646d, jumpLoaderResult.getUrl(), campaignEx, this.f39648f, list);
                } else if (campaignEx.getPackageName() != null) {
                    if (t0.a.a(this.f39646d, "market://details?id=" + campaignEx.getPackageName(), this.f39648f)) {
                        if (list != null) {
                            try {
                                list.add("google_play");
                            } catch (Throwable th2) {
                                th = th2;
                                if (MBridgeConstans.DEBUG) {
                                    p0.b("CommonClickControl", th.getMessage(), th);
                                }
                                return z11;
                            }
                        }
                        a(campaignEx, 1, 1, list);
                    } else {
                        a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f39648f, list);
                    }
                } else {
                    a(i10, jumpLoaderResult.getUrl(), campaignEx, this.f39648f, list);
                }
                z12 = true;
            } catch (Throwable th3) {
                th = th3;
                z11 = false;
            }
        }
        if (z12) {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f39648f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z12;
            }
        } else {
            a(jumpLoaderResult, campaignEx, true);
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f39648f;
            if (nativeTrackingListener2 != null && z10) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z12;
    }

    private boolean a(CampaignEx campaignEx, JumpLoaderResult jumpLoaderResult, boolean z10, List<String> list) {
        boolean z11 = false;
        if (z10) {
            try {
                if (com.mbridge.msdk.util.b.a()) {
                    com.mbridge.msdk.click.b.a(this.f39646d, this.f39643a, campaignEx, campaignEx.getNoticeUrl(), com.mbridge.msdk.foundation.same.a.M);
                }
                t0.a(this.f39646d, campaignEx.getClickURL(), this.f39648f, campaignEx, list);
                z11 = true;
            } catch (Throwable th2) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("CommonClickControl", th2.getMessage(), th2);
                }
                return false;
            }
        }
        a(jumpLoaderResult, campaignEx, true);
        if (z11) {
            NativeListener.NativeTrackingListener nativeTrackingListener = this.f39648f;
            if (nativeTrackingListener != null) {
                nativeTrackingListener.onFinishRedirection(campaignEx, jumpLoaderResult.getUrl());
                return z11;
            }
        } else {
            if (com.mbridge.msdk.util.b.a()) {
                a(jumpLoaderResult, campaignEx, true);
            }
            NativeListener.NativeTrackingListener nativeTrackingListener2 = this.f39648f;
            if (nativeTrackingListener2 != null) {
                nativeTrackingListener2.onRedirectionFailed(campaignEx, jumpLoaderResult.getUrl());
            }
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0 A[Catch: Exception -> 0x0031, TryCatch #0 {Exception -> 0x0031, blocks: (B:3:0x0002, B:6:0x0008, B:10:0x0012, B:12:0x001c, B:14:0x0022, B:18:0x0035, B:21:0x0043, B:23:0x0049, B:27:0x0059, B:29:0x005d, B:31:0x006f, B:35:0x007a, B:37:0x0084, B:39:0x008e, B:42:0x009e, B:44:0x00ac, B:51:0x00ec, B:54:0x00f2, B:75:0x014e, B:77:0x015c, B:79:0x0164, B:83:0x016c, B:78:0x0161, B:46:0x00bc, B:48:0x00c6, B:50:0x00e0, B:57:0x00fe, B:58:0x010b, B:61:0x0111, B:64:0x011c, B:66:0x0122, B:68:0x0126, B:70:0x012c, B:72:0x0138, B:74:0x0147, B:86:0x0176, B:88:0x017d), top: B:92:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.mbridge.msdk.foundation.entity.CampaignEx r10, com.mbridge.msdk.click.entity.JumpLoaderResult r11, boolean r12, boolean r13, java.lang.Boolean r14, java.util.List<java.lang.String> r15) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.entity.CampaignEx, com.mbridge.msdk.click.entity.JumpLoaderResult, boolean, boolean, java.lang.Boolean, java.util.List):void");
    }

    private boolean a(int i10, String str) {
        try {
            return i10 == 2 ? t0.a.b(str) : !TextUtils.isEmpty(str);
        } catch (Exception e10) {
            e10.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            this.f39646d.sendBroadcast(intent);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonClickControl", "Exception", e10);
            }
        }
    }

    private void a(CampaignEx campaignEx, int i10, int i11, List<String> list) {
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", Integer.valueOf(i10));
            eVar.a("result", Integer.valueOf(i11));
            if (list != null) {
                eVar.a("click_path", list.toString());
            }
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000150", campaignEx, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("CommonClickControl", e10.getMessage());
            }
        }
    }
}
