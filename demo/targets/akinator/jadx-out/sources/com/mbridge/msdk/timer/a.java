package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.db.e;
import com.mbridge.msdk.foundation.db.g;
import com.mbridge.msdk.foundation.db.l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.i;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import java.util.LinkedList;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private long f43866a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f43867b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<i> f43868c;

    /* renamed from: d, reason: collision with root package name */
    private LinkedList<i> f43869d;

    /* renamed from: e, reason: collision with root package name */
    private int f43870e;

    /* renamed from: f, reason: collision with root package name */
    private int f43871f;

    /* renamed from: g, reason: collision with root package name */
    private e f43872g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.a f43873h;

    /* renamed from: i, reason: collision with root package name */
    private l f43874i;

    /* renamed from: j, reason: collision with root package name */
    private g f43875j;

    /* renamed from: k, reason: collision with root package name */
    private Handler f43876k;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.timer.a$a, reason: collision with other inner class name */
    public class HandlerC0336a extends Handler {
        public HandlerC0336a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (a.this) {
                try {
                    int i10 = message.what;
                    if (i10 != 1) {
                        if (i10 == 2) {
                            a.this.c();
                        }
                    } else {
                        if (a.this.f43867b) {
                            return;
                        }
                        a aVar = a.this;
                        aVar.a(aVar.f43866a);
                        sendMessageDelayed(obtainMessage(1), a.this.f43866a);
                    }
                } finally {
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.reward.adapter.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.reward.adapter.c f43878a;

        public b(com.mbridge.msdk.reward.adapter.c cVar) {
            this.f43878a = cVar;
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(List<CampaignEx> list, com.mbridge.msdk.foundation.error.b bVar, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f43876k.sendMessage(a.this.f43876k.obtainMessage(2));
            this.f43878a.a((com.mbridge.msdk.reward.adapter.a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.a
        public void a(String str, com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
            a.this.f43876k.sendMessage(a.this.f43876k.obtainMessage(2));
            this.f43878a.a((com.mbridge.msdk.reward.adapter.a) null);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c {

        /* renamed from: a, reason: collision with root package name */
        static a f43880a = new a(null);
    }

    public /* synthetic */ a(HandlerC0336a handlerC0336a) {
        this();
    }

    private a() {
        this.f43867b = false;
        this.f43868c = new LinkedList<>();
        this.f43869d = new LinkedList<>();
        this.f43870e = 0;
        this.f43871f = 0;
        this.f43876k = new HandlerC0336a();
    }

    private void b() {
        if (this.f43875j == null) {
            this.f43875j = g.a(com.mbridge.msdk.foundation.controller.c.m().d());
        }
        if (this.f43874i == null) {
            this.f43874i = l.a(this.f43875j);
        }
        List<i> listA = this.f43874i.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listA != null) {
            this.f43869d.addAll(listA);
            for (i iVar : listA) {
                a(iVar.a(), iVar.b());
            }
        }
        List<i> listA2 = this.f43874i.a(94);
        if (listA2 != null) {
            this.f43868c.addAll(listA2);
            for (i iVar2 : listA2) {
                b(iVar2.a(), iVar2.b());
            }
        }
        if (this.f43872g == null) {
            this.f43872g = e.a(this.f43875j);
        }
        if (this.f43873h == null) {
            this.f43873h = com.mbridge.msdk.videocommon.setting.b.b().c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        try {
            LinkedList<i> linkedList = this.f43868c;
            if (linkedList != null && linkedList.size() > 0 && this.f43870e < this.f43868c.size()) {
                i iVar = this.f43868c.get(this.f43870e);
                this.f43870e++;
                if (a(iVar)) {
                    a(iVar.a(), iVar.b(), false);
                    return;
                }
                return;
            }
            LinkedList<i> linkedList2 = this.f43869d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f43871f >= this.f43869d.size()) {
                return;
            }
            i iVar2 = this.f43869d.get(this.f43871f);
            this.f43871f++;
            if (a(iVar2)) {
                c(iVar2.a(), iVar2.b());
            }
        } catch (Throwable th2) {
            p0.b("LoopTimer", th2.getMessage(), th2);
        }
    }

    public static a a() {
        return c.f43880a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j10) {
        LinkedList<i> linkedList = this.f43868c;
        if (linkedList == null || linkedList.size() <= 0 || this.f43870e == 0 || this.f43868c.size() <= this.f43870e) {
            LinkedList<i> linkedList2 = this.f43869d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f43871f == 0 || this.f43869d.size() == this.f43871f) {
                this.f43871f = 0;
                this.f43870e = 0;
                Handler handler = this.f43876k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    private boolean a(i iVar) {
        boolean z10 = false;
        if (iVar != null && !TextUtils.isEmpty(iVar.b())) {
            String strB = iVar.b();
            try {
                if (this.f43872g == null) {
                    return true;
                }
                com.mbridge.msdk.videocommon.setting.a aVar = this.f43873h;
                int iA = this.f43872g.a(strB, aVar != null ? aVar.e() : 0L);
                if (iA == -1) {
                    a(strB);
                } else if (iA == 1) {
                    return true;
                }
                try {
                    Handler handler = this.f43876k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    p0.b("LoopTimer", th.getMessage(), th);
                    return z10;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = true;
            }
        }
        return z10;
    }

    private void c(String str, String str2) {
        a(str, str2, true);
    }

    private void a(String str, String str2, boolean z10) {
        try {
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            if (contextD == null) {
                return;
            }
            com.mbridge.msdk.reward.adapter.c cVar = new com.mbridge.msdk.reward.adapter.c(contextD, str, str2);
            cVar.d(z10);
            cVar.a(new b(cVar));
            com.mbridge.msdk.foundation.same.report.metrics.c cVar2 = new com.mbridge.msdk.foundation.same.report.metrics.c();
            cVar2.i(SameMD5.getMD5(u0.d()));
            cVar2.n(str2);
            if (z10) {
                cVar2.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                cVar2.a(94);
            }
            cVar2.h("0");
            cVar2.f("1");
            cVar.a(1, 8000, false, cVar2);
        } catch (Exception e10) {
            p0.b("LoopTimer", e10.getMessage(), e10);
        }
    }

    public void b(long j10) {
        b();
        this.f43866a = j10;
        this.f43867b = false;
        Handler handler = this.f43876k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f43866a);
    }

    public void b(String str, String str2) {
        if (this.f43868c.contains(str2)) {
            return;
        }
        this.f43868c.add(new i(str, str2, 94));
        l lVar = this.f43874i;
        if (lVar != null) {
            lVar.a(str, str2, 94);
        }
    }

    private void b(String str) {
        l lVar = this.f43874i;
        if (lVar != null) {
            lVar.a(str);
        }
    }

    public void a(String str, String str2) {
        if (this.f43869d.contains(str2)) {
            return;
        }
        this.f43869d.add(new i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        l lVar = this.f43874i;
        if (lVar != null) {
            lVar.a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<i> linkedList = this.f43868c;
        if (linkedList != null && linkedList.contains(str)) {
            this.f43868c.remove(str);
        } else {
            LinkedList<i> linkedList2 = this.f43869d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f43869d.remove(str);
            }
        }
        b(str);
    }
}
