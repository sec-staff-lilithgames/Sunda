package com.mbridge.msdk.foundation.same.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.C3191e4;
import com.ironsource.G5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.BatchReportDao;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.mbridge.msdk.tracker.p;
import com.mbridge.msdk.tracker.x;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: l, reason: collision with root package name */
    private static final String f40916l = "e";

    /* renamed from: m, reason: collision with root package name */
    private static String f40917m = "roas";

    /* renamed from: n, reason: collision with root package name */
    private static volatile e f40918n;

    /* renamed from: a, reason: collision with root package name */
    private AtomicInteger f40919a;

    /* renamed from: b, reason: collision with root package name */
    private BatchReportDao f40920b;

    /* renamed from: c, reason: collision with root package name */
    private int f40921c = 1;

    /* renamed from: d, reason: collision with root package name */
    private long f40922d = 0;

    /* renamed from: e, reason: collision with root package name */
    private String f40923e = com.mbridge.msdk.foundation.same.net.utils.d.h().O;

    /* renamed from: f, reason: collision with root package name */
    private volatile int f40924f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f40925g = false;

    /* renamed from: h, reason: collision with root package name */
    private Executor f40926h = Executors.newSingleThreadExecutor();

    /* renamed from: i, reason: collision with root package name */
    private Handler f40927i;

    /* renamed from: j, reason: collision with root package name */
    private Stack<Long> f40928j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.tracker.m f40929k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) throws UnsupportedEncodingException {
            int i10 = message.what;
            if (i10 == 1) {
                Bundle data = message.getData();
                if (e.this.f40927i == null || e.this.f40920b == null || data == null) {
                    return;
                }
                e.this.f40927i.removeMessages(2);
                long jCurrentTimeMillis = System.currentTimeMillis();
                ArrayList<BatchReportMessage> batchReportMessages = e.this.f40920b.getBatchReportMessages(jCurrentTimeMillis, 2);
                e.this.b(batchReportMessages, jCurrentTimeMillis);
                e.this.f40919a.set(0);
                String str = e.f40916l;
                StringBuilder sb2 = new StringBuilder("超时上报触发了，需要上报的数据： ");
                sb2.append(batchReportMessages != null ? batchReportMessages.size() : 0);
                p0.a(str, sb2.toString());
                return;
            }
            if (i10 == 2) {
                Bundle data2 = message.getData();
                if (e.this.f40927i == null || e.this.f40920b == null || data2 == null) {
                    return;
                }
                e.this.f40927i.removeMessages(1);
                long j10 = data2.getLong("last_report_time");
                ArrayList<BatchReportMessage> batchReportMessages2 = e.this.f40920b.getBatchReportMessages(j10, 2);
                e.this.b(batchReportMessages2, j10);
                String str2 = e.f40916l;
                StringBuilder sb3 = new StringBuilder("队列上报触发了，需要上报的数据： ");
                sb3.append(batchReportMessages2 != null ? batchReportMessages2.size() : 0);
                p0.a(str2, sb3.toString());
                return;
            }
            if (i10 == 3) {
                Bundle data3 = message.getData();
                if (data3 != null) {
                    e.this.a((ArrayList<BatchReportMessage>) data3.getParcelableArrayList("report_message"), data3.getLong("last_report_time"));
                    return;
                }
                return;
            }
            if (i10 != 4) {
                return;
            }
            Bundle data4 = message.getData();
            if (e.this.f40927i == null || e.this.f40920b == null || data4 == null || !e.this.f40925g) {
                return;
            }
            e.this.f40927i.removeMessages(4);
            ArrayList<BatchReportMessage> batchReportMessages3 = e.this.f40920b.getBatchReportMessages(System.currentTimeMillis(), 2);
            if (batchReportMessages3 != null && batchReportMessages3.size() > 0) {
                for (int i11 = 0; i11 < batchReportMessages3.size(); i11++) {
                    BatchReportMessage batchReportMessage = batchReportMessages3.get(i11);
                    e.this.a(batchReportMessage.getReportMessage(), batchReportMessage.getTimestamp());
                }
            }
            String str3 = e.f40916l;
            StringBuilder sb4 = new StringBuilder("切换上报lib，需要上报的数据： ");
            sb4.append(batchReportMessages3 != null ? batchReportMessages3.size() : 0);
            p0.a(str3, sb4.toString());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b extends com.mbridge.msdk.foundation.same.report.net.b {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f40931b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f40932c;

        public b(long j10, ArrayList arrayList) {
            this.f40931b = j10;
            this.f40932c = arrayList;
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.b
        public void a(String str) {
            Stack stack;
            com.google.android.gms.internal.play_billing.a.D("批量上报失败： ", str, e.f40916l);
            e.this.a(2, str);
            synchronized (e.this.f40928j) {
                try {
                    e.this.f40928j.add(Long.valueOf(this.f40931b));
                    if (e.this.f40920b != null) {
                        e.this.f40920b.updateMessagesReportState(this.f40932c);
                    }
                    if (e.this.f40928j.size() >= 5) {
                        p0.a(e.f40916l, "批量上报失败，上报失败的数据超过阈值");
                        try {
                            try {
                                e.this.f40928j.pop();
                                long jLongValue = ((Long) e.this.f40928j.pop()).longValue();
                                e.this.f40928j.clear();
                                if (e.this.f40920b != null) {
                                    e.this.f40920b.deleteBatchReportMessagesByTimestamp(jLongValue);
                                }
                                stack = e.this.f40928j;
                            } catch (Exception e10) {
                                p0.b(e.f40916l, e10.getMessage());
                                stack = e.this.f40928j;
                            }
                            stack.clear();
                        } catch (Throwable th2) {
                            e.this.f40928j.clear();
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.report.net.b
        public void b(String str) {
            p0.a(e.f40916l, "批量上报成功");
            e.this.a(1, "");
            try {
                if (e.this.f40920b != null) {
                    e.this.f40920b.deleteBatchReportMessagesByTimestamp(this.f40931b);
                }
            } catch (Exception e10) {
                p0.b(e.f40916l, e10.getMessage());
            }
            synchronized (e.this.f40928j) {
                e.this.f40928j.clear();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f40934a;

        public c(String str) {
            this.f40934a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f40920b == null) {
                return;
            }
            p0.a(e.f40916l, "接收到上报数据： " + this.f40934a);
            if (!e.this.f40925g) {
                if (e.this.f40924f != 1) {
                    e.this.c(this.f40934a);
                }
            } else {
                e.this.a(this.f40934a, 0L);
                if (((Integer) x0.a(com.mbridge.msdk.foundation.controller.c.m().d(), "roas_use_event", 0)).intValue() == 0) {
                    x0.b(com.mbridge.msdk.foundation.controller.c.m().d(), "roas_use_event", 1);
                    e.this.f40927i.sendEmptyMessage(4);
                }
            }
        }
    }

    private e() throws JSONException {
        d();
    }

    public static synchronized e c() {
        try {
            if (f40918n == null) {
                f40918n = new e();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40918n;
    }

    private void d() throws JSONException {
        com.mbridge.msdk.setting.a aVarJ;
        com.mbridge.msdk.setting.g gVarF = com.google.android.gms.internal.play_billing.a.f(com.mbridge.msdk.setting.h.b());
        if (gVarF != null && (aVarJ = gVarF.j()) != null) {
            this.f40921c = aVarJ.a();
            this.f40922d = aVarJ.c() * 1000;
            this.f40923e = com.mbridge.msdk.foundation.same.net.utils.d.h().O;
            this.f40924f = aVarJ.b();
            boolean z10 = aVarJ.d() == 1;
            this.f40925g = z10;
            if (z10 && this.f40924f != 1) {
                int iB = r0.a().b("bcp", "type", r0.a().b("t_r_t", 1));
                if (iB != 0 && iB != 1) {
                    iB = 0;
                }
                this.f40929k = com.mbridge.msdk.tracker.m.a(f40917m, com.mbridge.msdk.foundation.controller.c.m().d(), new x.b().a(new d()).a(new n()).a(iB, a(iB)).a(r0.a().b("t_m_e_t", 604800000)).b(r0.a().b("t_m_e_s", 50)).d(r0.a().b("t_m_r_c", 50)).c(r0.a().b("t_m_t", 15000)).e(r0.a().b("t_m_r_t_s", 1)).a());
                JSONObject jSONObjectB = com.mbridge.msdk.foundation.same.report.c.b();
                try {
                    jSONObjectB.put("device_type", l0.E(com.mbridge.msdk.foundation.controller.c.m().d()) ? "pad" : "phone");
                    if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                        jSONObjectB.put(com.mbridge.msdk.foundation.same.net.wrapper.e.f40878j, l0.u());
                    }
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
                this.f40929k.a(jSONObjectB);
                this.f40929k.h();
            }
        }
        p0.a(f40916l, "初始化批量上报： " + this.f40923e + " " + this.f40921c + " " + this.f40922d + " " + this.f40924f);
        this.f40919a = new AtomicInteger(0);
        this.f40928j = new Stack<>();
        this.f40920b = BatchReportDao.getInstance(com.mbridge.msdk.foundation.controller.c.m().d());
        HandlerThread handlerThread = new HandlerThread("mb_revenue_batch_report_thread");
        handlerThread.start();
        this.f40927i = new a(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ArrayList<BatchReportMessage> arrayList, long j10) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Message messageObtain = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("report_message", arrayList);
        bundle.putLong("last_report_time", j10);
        messageObtain.setData(bundle);
        messageObtain.what = 3;
        this.f40927i.sendMessage(messageObtain);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        this.f40920b.addReportMessage(str, 2);
        Handler handler = this.f40927i;
        if (handler != null && !handler.hasMessages(1)) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            this.f40927i.sendMessageDelayed(messageObtain, this.f40922d);
        }
        if (this.f40919a.incrementAndGet() < this.f40921c || this.f40927i == null) {
            return;
        }
        Message messageObtain2 = Message.obtain();
        Bundle bundle = new Bundle();
        bundle.putLong("last_report_time", System.currentTimeMillis());
        messageObtain2.setData(bundle);
        messageObtain2.what = 2;
        this.f40927i.sendMessage(messageObtain2);
        this.f40919a.set(0);
    }

    private p a(int i10) {
        if (i10 == 1) {
            return new p(new m((byte) 2), com.mbridge.msdk.foundation.same.net.utils.d.h().f40854l, com.mbridge.msdk.foundation.same.net.utils.d.h().f40858p);
        }
        return new p(new com.mbridge.msdk.tracker.network.toolbox.h(), com.mbridge.msdk.foundation.same.net.utils.d.h().O, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ArrayList<BatchReportMessage> arrayList, long j10) throws UnsupportedEncodingException {
        if (arrayList != null && arrayList.size() > 0) {
            p0.a(f40916l, "需要上报的数据条数： " + arrayList.size());
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.net.wrapper.e eVarA = j.a(contextD);
            eVarA.a("app_id", com.mbridge.msdk.foundation.controller.c.m().b());
            eVarA.a("m_sdk", "msdk");
            eVarA.a("lqswt", String.valueOf(1));
            eVarA.a("device_type", l0.E(contextD) ? "pad" : "phone");
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_OTHER)) {
                eVarA.a(com.mbridge.msdk.foundation.same.net.wrapper.e.f40878j, l0.u());
            }
            StringBuilder sb2 = new StringBuilder();
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    BatchReportMessage batchReportMessage = arrayList.get(i10);
                    if (batchReportMessage != null) {
                        sb2.append(batchReportMessage.getReportMessage() + "&ts=" + batchReportMessage.getTimestamp());
                        if (i10 >= 0 && i10 < size - 1) {
                            sb2.append("\n");
                        }
                    }
                } catch (Throwable th2) {
                    p0.b(f40916l, th2.getMessage());
                }
            }
            try {
                String strEncode = URLEncoder.encode(sb2.toString(), G5.N);
                eVarA.a("data", strEncode);
                p0.a(f40916l, "需要批量上报的数据： " + strEncode);
                com.mbridge.msdk.foundation.same.report.net.a aVar = new com.mbridge.msdk.foundation.same.report.net.a(com.mbridge.msdk.foundation.controller.c.m().d());
                a(0, "");
                aVar.post(0, this.f40923e, eVarA, new b(j10, arrayList), "roas", ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
                return;
            } catch (Exception e10) {
                p0.b(f40916l, e10.getMessage());
                return;
            }
        }
        p0.a(f40916l, "需要上报的数据条数： 0");
    }

    public void b() {
        Handler handler = this.f40927i;
        if (handler == null || handler.hasMessages(1) || this.f40924f == 1 || this.f40925g) {
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        this.f40927i.sendMessageDelayed(messageObtain, 5000L);
    }

    public synchronized void b(String str) {
        Executor executor;
        try {
            if (this.f40924f == 1) {
                return;
            }
            c cVar = new c(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e() && (executor = this.f40926h) != null) {
                executor.execute(cVar);
            } else {
                cVar.run();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, long j10) {
        if (this.f40929k != null) {
            com.mbridge.msdk.tracker.e eVar = new com.mbridge.msdk.tracker.e("roas");
            eVar.a(true);
            if (j10 != 0) {
                eVar.c(j10);
            }
            eVar.a(1);
            try {
                eVar.a(a(str));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            this.f40929k.d(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str) {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("state", Integer.valueOf(i10));
        if (i10 == 2) {
            eVar.a("reason", str);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVar = new com.mbridge.msdk.foundation.same.report.metrics.c();
        cVar.a("m_ad_rev_s_s", eVar);
        com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_ad_rev_s_s", cVar);
    }

    private JSONObject a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(str)) {
            try {
                for (String str2 : str.split(C3191e4.i.f36527c)) {
                    String[] strArrSplit = str2.split(C3191e4.i.f36525b);
                    if (strArrSplit.length == 2) {
                        jSONObject.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                return jSONObject;
            }
        }
        return jSONObject;
    }
}
