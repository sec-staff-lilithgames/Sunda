package com.mbridge.msdk.click;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.click.entity.JumpLoaderResult;
import com.mbridge.msdk.click.o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.task.a;
import j1.o2;
import java.util.concurrent.Semaphore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public class l extends com.mbridge.msdk.foundation.same.task.a {

    /* renamed from: b, reason: collision with root package name */
    private final Context f39714b;

    /* renamed from: c, reason: collision with root package name */
    private final String f39715c;

    /* renamed from: d, reason: collision with root package name */
    private final String f39716d;

    /* renamed from: e, reason: collision with root package name */
    private final String f39717e;

    /* renamed from: f, reason: collision with root package name */
    private final CampaignEx f39718f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f39719g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f39720h;

    /* renamed from: i, reason: collision with root package name */
    private final int f39721i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f39722j;

    /* renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f39723k;

    /* renamed from: l, reason: collision with root package name */
    private JumpLoaderResult f39724l;

    /* renamed from: m, reason: collision with root package name */
    private g f39725m;

    /* renamed from: n, reason: collision with root package name */
    private k f39726n;

    /* renamed from: a, reason: collision with root package name */
    private final Semaphore f39713a = new Semaphore(0);

    /* renamed from: o, reason: collision with root package name */
    private final o.f f39727o = new a();

    public l(com.mbridge.msdk.click.entity.b bVar) {
        this.f39714b = bVar.c();
        this.f39715c = bVar.e();
        this.f39716d = bVar.b();
        this.f39717e = bVar.d();
        this.f39718f = bVar.a();
        this.f39719g = bVar.g();
        this.f39720h = bVar.i();
        this.f39721i = bVar.f();
        this.f39722j = bVar.h();
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void runTask() {
        JumpLoaderResult jumpLoaderResult;
        g gVar = this.f39725m;
        if (gVar != null) {
            gVar.b(null);
        }
        JumpLoaderResult jumpLoaderResult2 = new JumpLoaderResult();
        this.f39724l = jumpLoaderResult2;
        jumpLoaderResult2.setUrl(this.f39715c);
        JumpLoaderResult jumpLoaderResultC = c(this.f39715c);
        this.f39724l = jumpLoaderResultC;
        if (jumpLoaderResultC != null && !TextUtils.isEmpty(jumpLoaderResultC.getExceptionMsg())) {
            this.f39724l.setSuccess(true);
        }
        if (this.mState != a.b.RUNNING) {
            k kVar = this.f39726n;
            if (kVar != null) {
                kVar.a(this.f39724l);
                return;
            }
            return;
        }
        JumpLoaderResult jumpLoaderResult3 = this.f39724l;
        if (jumpLoaderResult3 != null && !jumpLoaderResult3.isSuccess()) {
            k kVar2 = this.f39726n;
            if (kVar2 != null) {
                kVar2.a(this.f39724l);
                return;
            }
            return;
        }
        com.mbridge.msdk.click.entity.a aVar = this.f39723k;
        if (aVar != null && (jumpLoaderResult = this.f39724l) != null) {
            jumpLoaderResult.setStatusCode(aVar.f39690f);
        }
        m.a(this.f39718f, this.f39724l, this.f39723k, this.f39716d, this.f39717e, this.f39714b, this.f39727o, this.f39726n, this.f39713a);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements o.f {
        public a() {
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean a(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean b(String str) {
            return false;
        }

        @Override // com.mbridge.msdk.click.o.f
        public boolean c(String str) {
            boolean zB = l.this.b(str);
            if (zB) {
                a();
            }
            return zB;
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(String str, boolean z10, String str2) {
            l.this.b(str);
            l.this.f39724l.setContent(str2);
            a();
        }

        private void a() {
            synchronized (this) {
                try {
                    l.this.f39724l.setSuccess(true);
                    if (l.this.f39726n != null) {
                        l.this.f39726n.a(l.this.f39724l);
                    }
                    l.this.a();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.click.o.f
        public void a(int i10, String str, String str2, String str3) {
            if (!TextUtils.isEmpty(str2)) {
                l.this.f39724l.setExceptionMsg(str2);
            }
            if (!TextUtils.isEmpty(str3)) {
                l.this.f39724l.setContent(str3);
            }
            l.this.b(str);
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(String str) {
        return m.a(str, this.f39718f, this.f39724l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x013d, code lost:
    
        r1.setjumpDone(true);
        r1.setUrl(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0151 A[LOOP:0: B:15:0x003e->B:65:0x0151, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0159 A[EDGE_INSN: B:71:0x0159->B:66:0x0159 BREAK  A[LOOP:0: B:15:0x003e->B:65:0x0151], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.mbridge.msdk.click.entity.JumpLoaderResult c(java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.l.c(java.lang.String):com.mbridge.msdk.click.entity.JumpLoaderResult");
    }

    public void a(g gVar) {
        this.f39725m = gVar;
    }

    public void a(k kVar) {
        this.f39726n = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f39713a.release();
    }

    private String a(String str) {
        if (this.f39722j) {
            String strA = com.mbridge.msdk.setting.b.a(this.f39714b, str);
            if (!TextUtils.isEmpty(strA)) {
                str = o2.l(str, strA);
            }
        }
        return com.mbridge.msdk.util.b.a() ? m.a(this.f39718f, str) : str;
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void cancelTask() {
    }

    @Override // com.mbridge.msdk.foundation.same.task.a
    public void pauseTask(boolean z10) {
    }
}
