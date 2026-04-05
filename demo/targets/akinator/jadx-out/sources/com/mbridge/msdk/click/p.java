package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import com.mbridge.msdk.foundation.tools.t0;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class p extends f implements a.InterfaceC0275a {

    /* renamed from: b, reason: collision with root package name */
    private g f39762b;

    /* renamed from: c, reason: collision with root package name */
    private JumpLoaderResult f39763c;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39765e;

    /* renamed from: f, reason: collision with root package name */
    private Context f39766f;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.task.b f39767g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f39768h;

    /* renamed from: d, reason: collision with root package name */
    private boolean f39764d = true;

    /* renamed from: i, reason: collision with root package name */
    private Handler f39769i = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements k {
        public a() {
        }

        @Override // com.mbridge.msdk.click.k
        public void a(JumpLoaderResult jumpLoaderResult) {
            p.this.f39763c = jumpLoaderResult;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (p.this.f39762b != null) {
                if (p.this.f39763c.isSuccess()) {
                    p.this.f39762b.a(p.this.f39763c);
                } else {
                    p.this.f39762b.a(p.this.f39763c, p.this.f39763c.getMsg());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.foundation.same.task.a {

        /* renamed from: b, reason: collision with root package name */
        private final Context f39773b;

        /* renamed from: c, reason: collision with root package name */
        private String f39774c;

        /* renamed from: d, reason: collision with root package name */
        private String f39775d;

        /* renamed from: e, reason: collision with root package name */
        private String f39776e;

        /* renamed from: f, reason: collision with root package name */
        private CampaignEx f39777f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f39778g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f39779h;

        /* renamed from: i, reason: collision with root package name */
        private int f39780i;

        /* renamed from: a, reason: collision with root package name */
        private final Semaphore f39772a = new Semaphore(0);

        /* renamed from: j, reason: collision with root package name */
        private o.f f39781j = new a();

        public c(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z10, boolean z11, int i10) {
            this.f39773b = context;
            this.f39774c = str;
            this.f39775d = str2;
            this.f39776e = str3;
            this.f39777f = campaignEx;
            this.f39778g = z10;
            this.f39779h = z11;
            this.f39780i = i10;
        }

        private boolean a(int i10) {
            return i10 == 200;
        }

        private boolean b(int i10) {
            return i10 == 301 || i10 == 302 || i10 == 307;
        }

        private boolean c(String str) {
            return str.startsWith("/");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean d(String str) {
            return q.a(str, this.f39777f, p.this.f39763c);
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void runTask() {
            if (p.this.f39762b != null) {
                p.this.f39762b.b(null);
            }
            p.this.f39763c = new JumpLoaderResult();
            p.this.f39763c.setUrl(this.f39774c);
            p.this.f39763c = a(this.f39774c, this.f39778g, this.f39779h, this.f39777f, this.f39780i);
            if (!TextUtils.isEmpty(p.this.f39763c.getExceptionMsg())) {
                p.this.f39763c.setSuccess(true);
            }
            if (p.this.f39764d && p.this.f39763c.isSuccess()) {
                if (p.this.f39768h != null) {
                    p.this.f39763c.setStatusCode(p.this.f39768h.f39690f);
                }
                q.a(this.f39777f, p.this.f39763c, p.this.f39768h, this.f39775d, this.f39776e, this.f39773b, this.f39781j, this.f39772a);
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements o.f {
            public a() {
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean a(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean b(String str) {
                return false;
            }

            @Override // com.mbridge.msdk.click.o.f
            public boolean c(String str) {
                boolean zD = c.this.d(str);
                if (zD) {
                    a();
                }
                return zD;
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(String str, boolean z10, String str2) {
                c.this.d(str);
                p.this.f39763c.setContent(str2);
                a();
            }

            @Override // com.mbridge.msdk.click.o.f
            public void a(int i10, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    p.this.f39763c.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    p.this.f39763c.setContent(str3);
                }
                c.this.d(str);
                a();
            }

            private void a() {
                synchronized (p.this) {
                    p.this.f39763c.setSuccess(true);
                    c.this.a();
                }
            }
        }

        private boolean b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f39772a.release();
        }

        /* JADX WARN: Code restructure failed: missing block: B:50:0x011f, code lost:
        
            r2.setjumpDone(true);
            r2.setUrl(r6);
         */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x01c3 A[EDGE_INSN: B:82:0x01c3->B:75:0x01c3 BREAK  A[LOOP:0: B:23:0x0054->B:68:0x0171], SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private com.mbridge.msdk.click.entity.JumpLoaderResult a(java.lang.String r14, boolean r15, boolean r16, com.mbridge.msdk.foundation.entity.CampaignEx r17, int r18) {
            /*
                Method dump skipped, instructions count: 452
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.p.c.a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.entity.JumpLoaderResult");
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void cancelTask() {
        }

        @Override // com.mbridge.msdk.foundation.same.task.a
        public void pauseTask(boolean z10) {
        }

        private boolean a(String str) {
            return t0.a.b(str);
        }
    }

    public p(Context context) {
        this.f39766f = context;
        this.f39767g = new com.mbridge.msdk.foundation.same.task.b(context, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void a(String str, g gVar, boolean z10, String str2, String str3, CampaignEx campaignEx, boolean z11, boolean z12, int i10) {
        c cVar;
        this.f39762b = gVar;
        this.f39765e = z10;
        com.mbridge.msdk.click.entity.b bVar = new com.mbridge.msdk.click.entity.b();
        bVar.a(this.f39766f);
        bVar.c(str);
        bVar.b(z10);
        bVar.a(str2);
        bVar.b(str3);
        bVar.a(campaignEx);
        bVar.a(z11);
        bVar.c(z12);
        bVar.a(i10);
        if (str.startsWith("tcp")) {
            l lVar = new l(bVar);
            lVar.a(this.f39762b);
            lVar.a(new a());
            cVar = lVar;
        } else {
            cVar = new c(this.f39766f, str, str2, str3, campaignEx, z11, z12, i10);
        }
        this.f39767g.b(cVar, this);
    }

    @Override // com.mbridge.msdk.foundation.same.task.a.InterfaceC0275a
    public void a(a.b bVar) {
        if (bVar == a.b.FINISH && this.f39764d) {
            this.f39769i.post(new b());
        }
    }
}
