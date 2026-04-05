package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.f;
import com.mbridge.msdk.foundation.tools.b1;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static String f39784e = "mtg_retry_report=1";

    /* renamed from: f, reason: collision with root package name */
    public static int f39785f = 10000;

    /* renamed from: g, reason: collision with root package name */
    public static int f39786g = 3;

    /* renamed from: h, reason: collision with root package name */
    public static int f39787h = 50;

    /* renamed from: i, reason: collision with root package name */
    public static int f39788i = 600000;

    /* renamed from: j, reason: collision with root package name */
    private static int f39789j = 0;

    /* renamed from: k, reason: collision with root package name */
    private static int f39790k = 0;

    /* renamed from: l, reason: collision with root package name */
    public static int f39791l = 0;

    /* renamed from: m, reason: collision with root package name */
    public static int f39792m = 1;

    /* renamed from: n, reason: collision with root package name */
    public static int f39793n = 2;

    /* renamed from: o, reason: collision with root package name */
    public static int f39794o = 3;

    /* renamed from: p, reason: collision with root package name */
    public static int f39795p = 4;

    /* renamed from: q, reason: collision with root package name */
    public static int f39796q = 5;

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, com.mbridge.msdk.click.retry.b> f39797a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.click.retry.c f39798b;

    /* renamed from: c, reason: collision with root package name */
    private BroadcastReceiver f39799c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f39800d;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.click.retry.a$a, reason: collision with other inner class name */
    public class C0257a extends BroadcastReceiver {
        public C0257a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                a.this.f39800d.sendEmptyMessage(2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static a f39802a = new a(null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                a.b().c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    a.b().a((String) obj, com.mbridge.msdk.click.retry.b.f39803k);
                }
            }
        }
    }

    public /* synthetic */ a(C0257a c0257a) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        com.mbridge.msdk.click.retry.c cVar = this.f39798b;
        if (cVar != null) {
            Iterator<String> it = cVar.a().iterator();
            while (it.hasNext()) {
                a(it.next(), com.mbridge.msdk.click.retry.b.f39804l);
            }
        }
    }

    private a() {
        this.f39797a = new ConcurrentHashMap<>();
        this.f39798b = new com.mbridge.msdk.click.retry.c(f39787h);
        this.f39800d = new c(Looper.getMainLooper());
        g gVarB = h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
        f39786g = gVarB.d0();
        f39785f = gVarB.f0() * 1000;
        f39788i = gVarB.g0() * 1000;
        f39789j = gVarB.c0();
        f39790k = gVarB.e0();
        a();
    }

    public static a b() {
        return b.f39802a;
    }

    private boolean b(int i10) {
        return i10 == f39792m || i10 == f39793n;
    }

    public void a(String str, String str2, CampaignEx campaignEx, String str3, boolean z10, boolean z11, int i10) {
        if (!c(i10) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f39784e, "").replace(C3191e4.i.f36527c + f39784e, "");
        if (this.f39797a == null) {
            this.f39797a = new ConcurrentHashMap<>();
        }
        com.mbridge.msdk.click.retry.b bVarRemove = this.f39797a.remove(strReplace);
        if (bVarRemove == null) {
            bVarRemove = new com.mbridge.msdk.click.retry.b(str, str2);
            bVarRemove.b(i10);
            bVarRemove.a(z10);
            bVarRemove.b(z11);
            bVarRemove.a(campaignEx);
            bVarRemove.b(str3);
        } else if (bVarRemove.d() != com.mbridge.msdk.click.retry.b.f39804l) {
            bVarRemove.a(str2);
        }
        if ((!a(i10) || f39789j == 0) && ((!b(i10) || f39790k == 0) && i10 != f39796q)) {
            a(bVarRemove);
            return;
        }
        if (System.currentTimeMillis() < bVarRemove.c() + f39788i) {
            a(strReplace, bVarRemove);
            if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f39803k) {
                if (bVarRemove.e() <= f39786g) {
                    a(strReplace);
                    return;
                } else {
                    a(bVarRemove);
                    return;
                }
            }
            return;
        }
        if (bVarRemove.d() == com.mbridge.msdk.click.retry.b.f39803k) {
            a(bVarRemove);
        }
    }

    private boolean c(int i10) {
        return a(i10) || b(i10) || i10 == f39796q;
    }

    private void a(com.mbridge.msdk.click.retry.b bVar) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExA = bVar.a();
            if (campaignExA != null) {
                String requestId = campaignExA.getRequestId();
                requestIdNotice = campaignExA.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            a(com.mbridge.msdk.foundation.controller.c.m().d(), bVar.b().toString(), bVar.g(), str, requestIdNotice, bVar.h());
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private static void a(Context context, String str, String str2, String str3, String str4, int i10) throws JSONException {
        f.a().a(context, str, str2, str3, str4, i10);
    }

    private void a(String str, com.mbridge.msdk.click.retry.b bVar) {
        if (this.f39798b == null) {
            this.f39798b = new com.mbridge.msdk.click.retry.c(f39787h);
        }
        this.f39798b.a(str, bVar);
    }

    private void a(String str) {
        Message messageObtainMessage = this.f39800d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f39800d.sendMessageDelayed(messageObtainMessage, f39785f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, int i10) {
        String string;
        com.mbridge.msdk.click.retry.c cVar = this.f39798b;
        if (cVar != null) {
            com.mbridge.msdk.click.retry.b bVarA = cVar.a(str);
            this.f39798b.b(str);
            if (bVarA == null) {
                com.mbridge.msdk.click.retry.b bVar = this.f39797a.get(str);
                if (bVar == null || System.currentTimeMillis() > bVar.c() + f39788i || bVar.e() >= f39786g || i10 == com.mbridge.msdk.click.retry.b.f39804l) {
                    return;
                }
                a(str);
                return;
            }
            if (System.currentTimeMillis() <= bVarA.c() + f39788i) {
                bVarA.a(i10);
                this.f39797a.put(str, bVarA);
                if (b1.c(str) == 0) {
                    StringBuilder sbT = a.b.t(str, "?");
                    sbT.append(f39784e);
                    string = sbT.toString();
                } else {
                    StringBuilder sbT2 = a.b.t(str, C3191e4.i.f36527c);
                    sbT2.append(f39784e);
                    string = sbT2.toString();
                }
                com.mbridge.msdk.click.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), bVarA.a(), bVarA.f(), string, bVarA.i(), bVarA.j(), bVarA.h());
                return;
            }
            if (i10 != com.mbridge.msdk.click.retry.b.f39804l) {
                a(bVarA);
            }
        }
    }

    private void a() {
        try {
            if (this.f39799c == null) {
                this.f39799c = new C0257a();
                Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                if (contextD != null) {
                    contextD.registerReceiver(this.f39799c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private boolean a(int i10) {
        return i10 == f39795p || i10 == f39794o;
    }
}
