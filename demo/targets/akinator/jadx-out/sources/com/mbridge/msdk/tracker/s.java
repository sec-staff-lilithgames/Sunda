package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
class s {

    /* renamed from: a, reason: collision with root package name */
    private final c f44097a;

    /* renamed from: b, reason: collision with root package name */
    private final int f44098b;

    /* renamed from: c, reason: collision with root package name */
    private final int f44099c;

    /* renamed from: d, reason: collision with root package name */
    private final int f44100d;

    /* renamed from: e, reason: collision with root package name */
    private final k f44101e;

    /* renamed from: i, reason: collision with root package name */
    private Handler f44105i;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicInteger f44102f = new AtomicInteger(0);

    /* renamed from: g, reason: collision with root package name */
    private final AtomicInteger f44103g = new AtomicInteger(0);

    /* renamed from: h, reason: collision with root package name */
    private final Object f44104h = new Object();

    /* renamed from: j, reason: collision with root package name */
    private boolean f44106j = true;

    /* renamed from: k, reason: collision with root package name */
    private long f44107k = 0;

    /* renamed from: l, reason: collision with root package name */
    private volatile boolean f44108l = false;

    /* renamed from: m, reason: collision with root package name */
    private volatile boolean f44109m = false;

    public s(k kVar) {
        this.f44097a = kVar.d();
        this.f44098b = kVar.i();
        this.f44099c = kVar.l();
        this.f44100d = kVar.j();
        this.f44101e = kVar;
    }

    private void l() {
        this.f44097a.c();
    }

    public void k() {
        synchronized (this.f44104h) {
            try {
                if (!this.f44108l) {
                    this.f44108l = true;
                    l();
                }
                if (!this.f44109m) {
                    this.f44109m = true;
                    this.f44103g.addAndGet(this.f44097a.b());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private List<i> c() {
        return this.f44097a.a(this.f44098b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int d() {
        return this.f44102f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<i> listC = c();
        if (y.b((List<?>) listC)) {
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.d("TrackManager", this.f44101e.v() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        a(listC);
        int size = listC.size();
        this.f44103g.addAndGet(-size);
        boolean zA = false;
        if (com.mbridge.msdk.tracker.a.f43882a) {
            Log.d("TrackManager", this.f44101e.v() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f44103g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f44097a.b());
        }
        try {
            zA = this.f44101e.a();
        } catch (IllegalStateException e10) {
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", this.f44101e.v() + " report environment check failed ", e10);
            }
        }
        if (!zA) {
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", this.f44101e.v() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        o oVarM = this.f44101e.m();
        oVarM.a(new a(this.f44105i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f44101e.f().a(this.f44101e.u(), listC, this.f44101e.o());
        } catch (Exception e11) {
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.e("TrackManager", this.f44101e.v() + " report decorate request params failed ", e11);
            }
        }
        oVarM.b(new t(listC), map, y.a(listC));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        this.f44102f.set(0);
    }

    public void b() {
        this.f44105i.removeMessages(1);
        Handler handler = this.f44105i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    public void e() {
        this.f44103g.incrementAndGet();
    }

    public boolean f() {
        return this.f44103g.addAndGet(0) >= this.f44098b;
    }

    public boolean g() {
        return this.f44106j;
    }

    public void j() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f44105i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f44105i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f44099c);
        this.f44106j = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<i> list) {
        if (y.b((List<?>) list)) {
            return;
        }
        this.f44097a.c(list);
    }

    public void a(e eVar) {
        if (this.f44105i.hasMessages(6)) {
            return;
        }
        long jA = y.a(this.f44102f.get(), this.f44107k, this.f44099c);
        if (jA > this.f44099c) {
            Handler handler = this.f44105i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, eVar), (long) (jA * 0.1f));
        } else {
            Handler handler2 = this.f44105i;
            handler2.sendMessage(Message.obtain(handler2, 6, eVar));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final s f44112a;

        public b(Looper looper, s sVar) {
            super(looper);
            this.f44112a = sVar;
        }

        private void a(String str) {
            StringBuilder sb2 = new StringBuilder();
            w0.i.h(sb2, this.f44112a.f44101e.v(), " ", str);
            sb2.append(this.f44112a.f44103g.addAndGet(0));
            sb2.append(" 数据库记录数：");
            sb2.append(this.f44112a.f44097a.b());
            Log.d("TrackManager", sb2.toString());
        }

        private void b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    Log.e("TrackManager", this.f44112a.f44101e.v() + " removeMessages failed ", e10);
                }
            }
            if (this.f44112a.g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), y.a(this.f44112a.f44102f.get(), this.f44112a.f44107k, this.f44112a.f44099c));
            } catch (Exception e11) {
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    Log.e("TrackManager", this.f44112a.f44101e.v() + " sendMessageDelayed failed ", e11);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i10 = message.what;
            if (i10 == 2 || i10 == 3) {
                b();
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    a("触发上报（report result）当前 Event 数量：");
                }
                a();
                return;
            }
            if (i10 == 5) {
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    a("触发删除 当前 Event 数量：");
                }
                this.f44112a.a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            if (i10 != 6) {
                if (i10 != 7) {
                    b();
                    if (com.mbridge.msdk.tracker.a.f43882a) {
                        a("触发上报（timer）当前 Event 数量：");
                    }
                    a();
                    return;
                }
                this.f44112a.k();
                b();
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    a("触发上报（flush）当前 Event 数量：");
                }
                a();
                return;
            }
            Object obj = message.obj;
            e eVar = obj instanceof e ? (e) obj : null;
            if (com.mbridge.msdk.tracker.a.f43882a && !y.b(eVar)) {
                a(a.b.l("收到 Event( ", eVar.b(), " )，当前 Event 数量："));
            }
            if (y.a(eVar) || this.f44112a.f()) {
                b();
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    a("触发上报（notice check）当前 Event 数量：");
                }
                a();
            }
        }

        private synchronized void a() {
            try {
                this.f44112a.h();
            } catch (Exception e10) {
                if (com.mbridge.msdk.tracker.a.f43882a) {
                    Log.e("TrackManager", this.f44112a.f44101e.v() + " report failed ", e10);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a implements r {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f44110a;

        /* renamed from: b, reason: collision with root package name */
        private final s f44111b;

        public a(Handler handler, s sVar) {
            this.f44110a = handler;
            this.f44111b = sVar;
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar) {
            this.f44111b.b(tVar.a());
            this.f44111b.i();
            this.f44111b.f44107k = 0L;
            if (this.f44111b.f()) {
                Handler handler = this.f44110a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.d("TrackManager", this.f44111b.f44101e.v() + " report success " + tVar.a().size() + " 剩余事件数：" + this.f44111b.f44103g.addAndGet(0) + " 个，数据库记录数：" + this.f44111b.f44097a.b() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.r
        public void a(t tVar, int i10, String str) {
            this.f44111b.a(tVar.a(), str);
            this.f44111b.f44107k = System.currentTimeMillis();
            int iD = this.f44111b.d();
            if (iD <= 10) {
                this.f44110a.removeMessages(3);
                Handler handler = this.f44110a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), iD * 1000);
            }
            if (com.mbridge.msdk.tracker.a.f43882a) {
                Log.d("TrackManager", this.f44111b.f44101e.v() + " report failed " + tVar.a().size() + " 剩余事件数：" + this.f44111b.f44103g.addAndGet(0) + " 个，数据库记录数：" + this.f44111b.f44097a.b() + " 个 连续失败次数： " + iD);
            }
        }
    }

    private void a(List<i> list) {
        this.f44097a.b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (com.mbridge.msdk.tracker.a.f43882a) {
            return;
        }
        int iA = this.f44097a.a();
        if (com.mbridge.msdk.tracker.a.f43882a) {
            Log.d("TrackManager", this.f44101e.v() + " 删除无效数据的数量 = " + iA + " 当前剩余事件数 = " + this.f44103g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f44097a.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<i> list, String str) {
        if (y.b((List<?>) list)) {
            return;
        }
        int i10 = 0;
        for (i iVar : list) {
            if (!y.b(iVar)) {
                boolean z10 = !iVar.g() && iVar.c() >= this.f44100d;
                boolean z11 = !iVar.h() && iVar.b() < System.currentTimeMillis();
                if (!z10 && !z11) {
                    iVar.a(iVar.c() + 1);
                    iVar.b(3);
                    iVar.a(str);
                    i10++;
                } else {
                    iVar.b(-1);
                }
            }
        }
        this.f44097a.a(list);
        this.f44103g.addAndGet(i10);
    }
}
