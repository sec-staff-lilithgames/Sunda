package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class u {

    /* renamed from: g, reason: collision with root package name */
    private static volatile u f44114g;

    /* renamed from: a, reason: collision with root package name */
    private m f44115a;

    /* renamed from: b, reason: collision with root package name */
    private x f44116b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f44117c = false;

    /* renamed from: d, reason: collision with root package name */
    private int f44118d = 30000;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f44119e = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    Handler f44120f = new a(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            try {
                u.this.b();
                u.this.f44120f.removeMessages(1);
                u.this.d();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        try {
            this.f44120f.sendEmptyMessageDelayed(1, this.f44118d);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x005b A[Catch: Exception -> 0x0059, TRY_LEAVE, TryCatch #0 {Exception -> 0x0059, blocks: (B:5:0x0009, B:7:0x000e, B:9:0x001c, B:12:0x002f, B:15:0x003b, B:20:0x005b, B:25:0x00a7, B:22:0x0073), top: B:29:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            r14 = this;
            com.mbridge.msdk.tracker.m[] r0 = com.mbridge.msdk.tracker.m.b()
            int r1 = r0.length
            if (r1 != 0) goto L9
            goto Lb1
        L9:
            int r1 = r0.length     // Catch: java.lang.Exception -> L59
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto Lb1
            r4 = r0[r3]     // Catch: java.lang.Exception -> L59
            java.lang.String r5 = r4.f()     // Catch: java.lang.Exception -> L59
            java.lang.String r6 = "monitor"
            boolean r6 = r6.equals(r5)     // Catch: java.lang.Exception -> L59
            if (r6 != 0) goto Laa
            java.lang.String r6 = r4.d()     // Catch: java.lang.Exception -> L59
            long[] r4 = r4.e()     // Catch: java.lang.Exception -> L59
            r7 = 1
            r8 = r4[r7]     // Catch: java.lang.Exception -> L59
            r10 = 0
            int r10 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r10 != 0) goto L2f
            goto Laa
        L2f:
            r10 = r4[r2]     // Catch: java.lang.Exception -> L59
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.f44119e     // Catch: java.lang.Exception -> L59
            boolean r4 = r4.containsKey(r5)     // Catch: java.lang.Exception -> L59
            java.lang.String r12 = ""
            if (r4 == 0) goto L5b
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.f44119e     // Catch: java.lang.Exception -> L59
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L59
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L59
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
            r13.<init>()     // Catch: java.lang.Exception -> L59
            r13.append(r10)     // Catch: java.lang.Exception -> L59
            r13.append(r12)     // Catch: java.lang.Exception -> L59
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Exception -> L59
            boolean r4 = r13.equals(r4)     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto L5b
            goto Laa
        L59:
            r0 = move-exception
            goto Lae
        L5b:
            java.util.HashMap<java.lang.String, java.lang.String> r4 = r14.f44119e     // Catch: java.lang.Exception -> L59
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L59
            r13.<init>()     // Catch: java.lang.Exception -> L59
            r13.append(r10)     // Catch: java.lang.Exception -> L59
            r13.append(r12)     // Catch: java.lang.Exception -> L59
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Exception -> L59
            r4.put(r5, r12)     // Catch: java.lang.Exception -> L59
            com.mbridge.msdk.tracker.m r4 = r14.f44115a     // Catch: java.lang.Exception -> L59
            if (r4 == 0) goto Laa
            com.mbridge.msdk.tracker.e r4 = new com.mbridge.msdk.tracker.e     // Catch: java.lang.Exception -> La6
            java.lang.String r12 = "event_lib_monitor"
            r4.<init>(r12)     // Catch: java.lang.Exception -> La6
            r4.a(r7)     // Catch: java.lang.Exception -> La6
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> La6
            r7.<init>()     // Catch: java.lang.Exception -> La6
            java.lang.String r12 = "key"
            java.lang.String r13 = "m_report_rate"
            r7.put(r12, r13)     // Catch: java.lang.Exception -> La6
            java.lang.String r12 = "task_name"
            r7.put(r12, r5)     // Catch: java.lang.Exception -> La6
            java.lang.String r5 = "task_count"
            r7.put(r5, r8)     // Catch: java.lang.Exception -> La6
            java.lang.String r5 = "task_session_id"
            r7.put(r5, r6)     // Catch: java.lang.Exception -> La6
            java.lang.String r5 = "task_ts"
            r7.put(r5, r10)     // Catch: java.lang.Exception -> La6
            r4.a(r7)     // Catch: java.lang.Exception -> La6
            com.mbridge.msdk.tracker.m r5 = r14.f44115a     // Catch: java.lang.Exception -> La6
            r5.d(r4)     // Catch: java.lang.Exception -> La6
            goto Laa
        La6:
            r4 = move-exception
            r4.printStackTrace()     // Catch: java.lang.Exception -> L59
        Laa:
            int r3 = r3 + 1
            goto Lc
        Lae:
            r0.printStackTrace()
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.tracker.u.b():void");
    }

    public synchronized void c() {
        if (this.f44117c) {
            return;
        }
        this.f44117c = true;
        d();
    }

    public void a(Context context, x xVar, int i10, JSONObject jSONObject) {
        this.f44116b = xVar;
        this.f44118d = i10;
        m mVarA = m.a("monitor", context, xVar);
        this.f44115a = mVarA;
        if (mVarA != null) {
            mVarA.a(jSONObject);
            this.f44115a.h();
        }
        c();
    }

    public static u a() {
        if (f44114g == null) {
            synchronized (u.class) {
                try {
                    if (f44114g == null) {
                        f44114g = new u();
                    }
                } finally {
                }
            }
        }
        return f44114g;
    }
}
