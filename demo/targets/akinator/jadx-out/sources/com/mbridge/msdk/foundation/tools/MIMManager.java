package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class MIMManager {

    /* renamed from: i, reason: collision with root package name */
    private static volatile String f41029i;

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f41030a;

    /* renamed from: b, reason: collision with root package name */
    private int f41031b;

    /* renamed from: c, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f41032c;

    /* renamed from: d, reason: collision with root package name */
    private Context f41033d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Boolean f41034e;

    /* renamed from: f, reason: collision with root package name */
    private CampaignEx f41035f;

    /* renamed from: g, reason: collision with root package name */
    private volatile g f41036g;

    /* renamed from: h, reason: collision with root package name */
    private volatile MiOverseaMiniCardBroadcasterReceiver f41037h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class MiOverseaMiniCardBroadcasterReceiver extends BroadcastReceiver {
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (j0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN=").equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                int intExtra = intent.getIntExtra(IronSourceConstants.EVENTS_ERROR_CODE, 0);
                int intExtra2 = intExtra < 0 ? intent.getIntExtra("reason", 0) : -1;
                p0.b("MIMManager", stringExtra + " " + intExtra + " " + intExtra2);
                if (intExtra == 1 || intExtra == 2 || intExtra == 3 || intExtra == 4 || intExtra == 7) {
                    try {
                        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
                        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                        eVar.a(C3191e4.h.W, URLEncoder.encode("m_mini_card", G5.N));
                        CampaignEx campaignExA = MIMManager.b().a(stringExtra);
                        if (campaignExA != null) {
                            eVar.a("rid", campaignExA.getRequestId());
                            eVar.a("rid_n", campaignExA.getRequestIdNotice());
                            eVar.a(MBridgeConstans.PROPERTIES_UNIT_ID, campaignExA.getCampaignUnitId());
                            eVar.a("u_stid", com.mbridge.msdk.foundation.controller.a.f40369r.get(campaignExA.getCampaignUnitId()));
                            cVar.a(campaignExA);
                        }
                        eVar.a(NotificationCompat.CATEGORY_EVENT, String.valueOf(intExtra));
                        eVar.a("pkg_name", stringExtra);
                        if (intExtra2 != -1) {
                            eVar.a("reasonCode", String.valueOf(intExtra2));
                        }
                        cVar.a("m_mini_card", eVar);
                        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_mini_card", cVar);
                    } catch (Exception e10) {
                        p0.b("MIMManager", e10.getMessage());
                    }
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41038a;

        public a(Context context) {
            this.f41038a = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MIMManager.this.f41030a.compareAndSet(false, true)) {
                try {
                    MIMManager mIMManager = MIMManager.this;
                    mIMManager.f41034e = mIMManager.a();
                } catch (Exception e10) {
                    p0.a("MIMManager", e10.getMessage());
                }
                if (MIMManager.this.f41034e == null || !MIMManager.this.f41034e.booleanValue() || this.f41038a == null) {
                    return;
                }
                try {
                    MIMManager.this.f41036g = new g(null);
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(j0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN="));
                    intentFilter.addAction(j0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN="));
                    intentFilter.addAction(j0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"));
                    this.f41038a.registerReceiver(MIMManager.this.f41036g, intentFilter);
                } catch (Exception e11) {
                    p0.a("MIMManager", e11.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41040a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41041b;

        public b(Context context, CampaignEx campaignEx) {
            this.f41040a = context;
            this.f41041b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.e(this.f41040a, this.f41041b);
            } catch (Exception e10) {
                p0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41043a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41044b;

        public c(Context context, CampaignEx campaignEx) {
            this.f41043a = context;
            this.f41044b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MIMManager.this.d(this.f41043a, this.f41044b);
            } catch (Exception e10) {
                p0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41046a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41047b;

        public d(Context context, CampaignEx campaignEx) {
            this.f41046a = context;
            this.f41047b = campaignEx;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    MIMManager.this.f(this.f41046a, this.f41047b);
                } catch (Exception e10) {
                    p0.b("MIMManager", e10.getMessage());
                    if (MIMManager.this.f41032c != null && MIMManager.this.f41032c.contains(this.f41047b)) {
                    }
                }
                if (MIMManager.this.f41032c != null && MIMManager.this.f41032c.contains(this.f41047b)) {
                    MIMManager.this.f41032c.remove(this.f41047b);
                }
            } catch (Throwable th2) {
                if (MIMManager.this.f41032c != null && MIMManager.this.f41032c.contains(this.f41047b)) {
                    MIMManager.this.f41032c.remove(this.f41047b);
                }
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41049a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f41050b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f41051c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f41052d;

        public e(Context context, String str, CampaignEx campaignEx, int i10) {
            this.f41049a = context;
            this.f41050b = str;
            this.f41051c = campaignEx;
            this.f41052d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (this.f41049a == null || TextUtils.isEmpty(this.f41050b) || this.f41051c == null) {
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3191e4.h.W, "2000100");
                jSONObject.put("network_type", l0.s(this.f41049a));
                jSONObject.put("rid", this.f41051c.getRequestId());
                jSONObject.put("rid_n", this.f41051c.getRequestIdNotice());
                if (!TextUtils.isEmpty(this.f41051c.getCampaignUnitId())) {
                    jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, this.f41051c.getCampaignUnitId());
                    String str = com.mbridge.msdk.foundation.controller.a.f40369r.get(this.f41051c.getCampaignUnitId());
                    if (str == null) {
                        str = "";
                    }
                    jSONObject.put("u_stid", str);
                }
                jSONObject.put(BidResponsedEx.KEY_CID, this.f41051c.getId());
                jSONObject.put("status", this.f41050b);
                jSONObject.put("code", this.f41052d);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(jSONObject);
            } catch (Throwable th2) {
                p0.b("MIMManager", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        private static final MIMManager f41054a = new MIMManager(null);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g extends BroadcastReceiver {
        private g() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            CampaignEx campaignExA;
            String action = intent.getAction();
            if (TextUtils.isEmpty(action) || action.equals(j0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KyVj5GxVN=")) || action.equals(j0.a("DFKwWgtuDkKwLZPwD+z8H+N/xj26Vjcdx5KanjKnxVN=")) || !action.equals(j0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjQZxVfV+T2SZVe6V2xS5c5n"))) {
                return;
            }
            try {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    return;
                }
                int i10 = extras.getInt("statusCode", -1);
                String string = extras.getString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "");
                if (i10 != -1 && !TextUtils.isEmpty(string) && (campaignExA = MIMManager.b().a(string)) != null) {
                    MIMManager.b().a(context, campaignExA, i10);
                    MIMManager.b().a(context, "dm_page_status", i10, MIMManager.b().c());
                }
            } catch (Exception e10) {
                p0.b("MIMManager", e10.getMessage());
            }
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    public /* synthetic */ MIMManager(a aVar) {
        this();
    }

    public void f() {
        this.f41031b++;
    }

    public void g() {
        int i10 = this.f41031b - 1;
        this.f41031b = i10;
        if (i10 <= 0) {
            a(this.f41033d);
        }
    }

    public void h() {
        try {
            if (this.f41037h == null) {
                this.f41037h = new MiOverseaMiniCardBroadcasterReceiver();
            }
            IntentFilter intentFilter = new IntentFilter(j0.a("DFKwWgtuDkKwLZPwD+z8H+N/xjK+n3eyNVx6ZVPn5jcincKZx5f5ncN="));
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            if (contextD != null) {
                contextD.registerReceiver(this.f41037h, intentFilter);
            }
        } catch (Exception e10) {
            p0.a("MIMManager", e10.getMessage());
        }
    }

    public void i() {
        try {
            if (this.f41037h != null) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                if (contextD != null) {
                    contextD.unregisterReceiver(this.f41037h);
                }
                this.f41035f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f41032c;
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f41032c = null;
                this.f41037h = null;
            }
        } catch (Exception e10) {
            p0.a("MIMManager", e10.getMessage());
        }
    }

    private MIMManager() {
        this.f41031b = 0;
        this.f41032c = new CopyOnWriteArrayList<>();
        this.f41030a = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context, CampaignEx campaignEx) {
        String[] strArrW;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrW = nativeVideoTracking.w()) == null) {
                    return;
                }
                int length = strArrW.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrW[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                p0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public String d() {
        try {
            if (f41029i == null) {
                return "";
            }
            return C3191e4.i.f36529d + f41029i + C3191e4.i.f36531e;
        } catch (Exception unused) {
            return "";
        }
    }

    public Boolean e() {
        return this.f41034e;
    }

    public static MIMManager b() {
        return f.f41054a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(Context context, CampaignEx campaignEx) {
        String[] strArrU;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrU = nativeVideoTracking.u()) == null) {
                    return;
                }
                int length = strArrU.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrU[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                p0.b("MIMManager", e10.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(Context context, CampaignEx campaignEx) {
        String[] strArrV;
        if (campaignEx != null) {
            try {
                com.mbridge.msdk.foundation.entity.j nativeVideoTracking = campaignEx.getNativeVideoTracking();
                if (nativeVideoTracking == null || (strArrV = nativeVideoTracking.v()) == null) {
                    return;
                }
                int length = strArrV.length;
                int i10 = 0;
                while (i10 < length) {
                    Context context2 = context;
                    CampaignEx campaignEx2 = campaignEx;
                    com.mbridge.msdk.click.a.a(context2, campaignEx2, campaignEx.getCampaignUnitId(), strArrV[i10], false, false);
                    i10++;
                    context = context2;
                    campaignEx = campaignEx2;
                }
            } catch (Exception e10) {
                p0.b("MIMManager", e10.getMessage());
            }
        }
    }

    public CampaignEx c() {
        return this.f41035f;
    }

    private Runnable c(Context context, CampaignEx campaignEx) {
        return new d(context, campaignEx);
    }

    public void b(Context context) {
        this.f41033d = context;
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new a(context));
    }

    public void a(CampaignEx campaignEx) {
        try {
            if (this.f41034e != null && campaignEx != null && this.f41034e.booleanValue()) {
                this.f41035f = campaignEx;
                this.f41032c.add(campaignEx);
            }
            if (com.mbridge.msdk.util.b.b() && campaignEx != null && campaignEx.getDeepLinkURL().startsWith("mimarket")) {
                if (this.f41037h == null) {
                    h();
                }
                this.f41035f = campaignEx;
                this.f41032c.add(campaignEx);
            }
        } catch (Exception e10) {
            p0.b("MIMManager", e10.getMessage());
        }
    }

    public void b(CampaignEx campaignEx) {
        try {
            if (this.f41034e == null || campaignEx == null || !this.f41034e.booleanValue()) {
                return;
            }
            this.f41035f = null;
            try {
                this.f41032c.remove(campaignEx);
            } catch (Exception e10) {
                p0.a("MIMManager", e10.getMessage());
            }
        } catch (Exception e11) {
            p0.b("MIMManager", e11.getMessage());
        }
    }

    private Runnable b(Context context, CampaignEx campaignEx) {
        return new b(context, campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CampaignEx a(String str) {
        try {
            CampaignEx campaignEx = this.f41035f;
            if (campaignEx != null && TextUtils.equals(campaignEx.getPackageName(), str)) {
                return this.f41035f;
            }
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f41032c;
            if (copyOnWriteArrayList == null || copyOnWriteArrayList.size() <= 0) {
                return null;
            }
            Iterator<CampaignEx> it = this.f41032c.iterator();
            while (it.hasNext()) {
                CampaignEx next = it.next();
                if (next != null && TextUtils.equals(next.getPackageName(), str)) {
                    return next;
                }
            }
            return null;
        } catch (Exception e10) {
            p0.b("MIMManager", e10.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Boolean a() {
        Cursor cursorQuery;
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        Boolean boolValueOf = null;
        if (contextD != null) {
            try {
                if (contextD.getContentResolver() != null) {
                    try {
                        cursorQuery = contextD.getContentResolver().query(Uri.parse(j0.a("DFK/J75/JaEXWFfXYZP9LkcXYk3/YkcBLF5TWgSBYbHuH75BW3xuhr5UJj2tLkeNhrKFLkxQhl==")), null, null, null, null);
                    } catch (Exception unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                String string = cursorQuery.getString(cursorQuery.getColumnIndex("support"));
                                if (!TextUtils.isEmpty(string) && !string.equalsIgnoreCase(AbstractJsonLexerKt.NULL) && (string.equalsIgnoreCase("false") || string.equalsIgnoreCase("true"))) {
                                    boolValueOf = Boolean.valueOf(Boolean.parseBoolean(string));
                                }
                            } catch (Exception e10) {
                                p0.a("MIMManager", e10.getMessage());
                            }
                            try {
                                f41029i = cursorQuery.getString(cursorQuery.getColumnIndex("detailStyle"));
                            } catch (Exception e11) {
                                p0.a("MIMManager", e11.getMessage());
                            }
                        }
                        try {
                            cursorQuery.close();
                        } catch (Exception e12) {
                            p0.a("MIMManager", e12.getMessage());
                        }
                    }
                }
            } catch (Exception e13) {
                p0.b("MIMManager", e13.getMessage());
            }
        }
        return boolValueOf;
    }

    public void a(Context context) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList;
        if (context != null) {
            try {
                try {
                    if (this.f41036g != null) {
                        context.unregisterReceiver(this.f41036g);
                    }
                    if (this.f41037h != null) {
                        context.unregisterReceiver(this.f41037h);
                    }
                    this.f41035f = null;
                    copyOnWriteArrayList = this.f41032c;
                } catch (Exception e10) {
                    p0.a("MIMManager", e10.getMessage());
                    this.f41035f = null;
                    copyOnWriteArrayList = this.f41032c;
                    if (copyOnWriteArrayList != null) {
                    }
                }
                if (copyOnWriteArrayList != null) {
                    copyOnWriteArrayList.clear();
                }
                this.f41032c = null;
                this.f41036g = null;
                this.f41033d = null;
            } catch (Throwable th2) {
                this.f41035f = null;
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = this.f41032c;
                if (copyOnWriteArrayList2 != null) {
                    copyOnWriteArrayList2.clear();
                }
                this.f41032c = null;
                this.f41036g = null;
                this.f41033d = null;
                throw th2;
            }
        }
        try {
            i();
        } catch (Throwable th3) {
            p0.b("MIMManager", th3.getMessage());
        }
    }

    public void a(Context context, CampaignEx campaignEx, int i10) {
        Runnable runnableB;
        if (i10 == 3001) {
            runnableB = b(context, campaignEx);
        } else if (i10 != 3002) {
            runnableB = i10 != 3008 ? null : c(context, campaignEx);
        } else {
            runnableB = a(context, campaignEx);
        }
        if (runnableB != null) {
            com.mbridge.msdk.foundation.same.threadpool.a.b().execute(runnableB);
        }
    }

    private Runnable a(Context context, CampaignEx campaignEx) {
        return new c(context, campaignEx);
    }

    public void a(Context context, String str, int i10, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.same.threadpool.a.b().execute(new e(context, str, campaignEx, i10));
    }
}
