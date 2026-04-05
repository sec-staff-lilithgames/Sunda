package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import b0.e2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.db.m;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadProgress;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.download.utils.Objects;
import com.mbridge.msdk.foundation.download.utils.Utils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.n;
import com.mbridge.msdk.foundation.tools.n0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URL;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class a implements Serializable {
    private int A;
    private File B;
    private int D;
    private int E;
    private int F;
    private boolean G;
    private com.mbridge.msdk.setting.l H;
    private com.mbridge.msdk.videocommon.setting.c I;
    private com.mbridge.msdk.setting.l J;

    /* renamed from: b, reason: collision with root package name */
    private int f45262b;

    /* renamed from: c, reason: collision with root package name */
    private int f45263c;

    /* renamed from: g, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f45267g;

    /* renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.listener.a f45268h;

    /* renamed from: i, reason: collision with root package name */
    private CampaignEx f45269i;

    /* renamed from: j, reason: collision with root package name */
    private String f45270j;

    /* renamed from: k, reason: collision with root package name */
    private Context f45271k;

    /* renamed from: l, reason: collision with root package name */
    private long f45272l;

    /* renamed from: m, reason: collision with root package name */
    private String f45273m;

    /* renamed from: n, reason: collision with root package name */
    private String f45274n;

    /* renamed from: p, reason: collision with root package name */
    private String f45276p;

    /* renamed from: r, reason: collision with root package name */
    private long f45278r;

    /* renamed from: u, reason: collision with root package name */
    private m f45281u;

    /* renamed from: w, reason: collision with root package name */
    private String f45283w;

    /* renamed from: x, reason: collision with root package name */
    private DownloadRequest f45284x;

    /* renamed from: y, reason: collision with root package name */
    private int f45285y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f45286z;

    /* renamed from: a, reason: collision with root package name */
    private boolean f45261a = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f45264d = false;

    /* renamed from: e, reason: collision with root package name */
    private volatile int f45265e = 0;

    /* renamed from: f, reason: collision with root package name */
    private CopyOnWriteArrayList<c> f45266f = new CopyOnWriteArrayList<>();

    /* renamed from: o, reason: collision with root package name */
    private long f45275o = 0;

    /* renamed from: q, reason: collision with root package name */
    private boolean f45277q = false;

    /* renamed from: s, reason: collision with root package name */
    private int f45279s = 100;

    /* renamed from: t, reason: collision with root package name */
    private boolean f45280t = false;

    /* renamed from: v, reason: collision with root package name */
    private boolean f45282v = false;
    private int C = 1;
    private boolean K = false;
    private boolean L = false;
    private boolean M = false;
    private boolean N = false;
    private boolean O = false;
    private boolean P = false;
    private boolean Q = false;
    private OnDownloadStateListener R = new C0357a();
    private OnProgressStateListener S = new b();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements OnProgressStateListener {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnProgressStateListener
        public void onProgress(DownloadMessage downloadMessage, DownloadProgress downloadProgress) {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("cache", a.this.f45284x.get("cache", "2"));
                a aVar = a.this;
                aVar.a(aVar.f45269i, eVar);
                a.this.f45275o = downloadProgress.getCurrent();
                a.this.f45272l = downloadProgress.getTotal();
                a.this.f45285y = downloadProgress.getCurrentDownloadRate();
                if (a.this.f45279s != 100 && downloadProgress.getCurrentDownloadRate() >= a.this.f45279s) {
                    p0.b("CampaignDownLoadTask", "Rate : " + downloadProgress.getCurrentDownloadRate() + " ReadyRate & cdRate = " + a.this.f45279s + " " + a.this.f45263c);
                    if (a.this.f45264d) {
                        return;
                    }
                    a.this.f45264d = true;
                    if (!a.this.f45286z) {
                        a.this.a(1, true, "");
                        a.this.a(downloadProgress.getCurrent(), false, "");
                    }
                    if (a.this.f45284x == null || a.this.C != 2 || a.this.f45286z) {
                        return;
                    }
                    a.this.f45284x.cancel(downloadMessage);
                }
            } catch (Exception e10) {
                p0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }
    }

    public a(Context context, CampaignEx campaignEx, String str, int i10) throws IOException {
        this.f45262b = 1;
        this.G = false;
        if (context == null && campaignEx == null) {
            return;
        }
        com.mbridge.msdk.setting.g gVarB = com.mbridge.msdk.setting.h.b().b(com.mbridge.msdk.foundation.controller.c.m().b());
        if (gVarB != null) {
            this.G = gVarB.D0();
        }
        this.D = com.mbridge.msdk.foundation.same.a.f40724u;
        this.E = com.mbridge.msdk.foundation.same.a.f40725v;
        this.F = com.mbridge.msdk.foundation.same.a.f40723t;
        this.f45278r = System.currentTimeMillis();
        this.f45271k = com.mbridge.msdk.foundation.controller.c.m().d();
        this.f45269i = campaignEx;
        this.f45270j = str;
        this.f45262b = i10;
        if (campaignEx != null) {
            this.f45273m = campaignEx.getVideoUrlEncode();
        }
        this.f45283w = n0.d(this.f45273m);
        this.f45274n = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_VC) + File.separator;
        this.f45276p = this.f45274n + this.f45283w;
        p0.c("CampaignDownLoadTask", this.f45269i.getAppName() + " videoLocalPath:" + this.f45276p + " videoUrl: " + this.f45269i.getVideoUrlEncode() + " " + this.f45279s);
        l();
    }

    private void u() {
        m mVarA = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
        com.mbridge.msdk.foundation.entity.m mVarB = mVarA.b(this.f45273m, "");
        if (mVarB != null) {
            this.f45275o = mVarB.c();
            if (this.f45265e != 2) {
                this.f45265e = mVarB.b();
            }
            if (this.f45265e == 1) {
                this.f45265e = 2;
            }
            this.f45272l = mVarB.d();
            if (mVarB.a() > 0) {
                this.f45278r = mVarB.a();
            }
            if (this.f45265e == 5) {
                if (Objects.exists(new File(this.f45274n + this.f45283w), this.f45274n, this.f45283w)) {
                    this.f45276p = this.f45274n + this.f45283w;
                } else {
                    a();
                }
            } else if (this.f45265e != 0) {
                this.f45276p = this.f45274n + this.f45283w;
            }
        } else {
            mVarA.a(this.f45273m, this.f45278r);
        }
        try {
            long j10 = this.f45272l;
            if (j10 <= 0 || this.f45275o * 100 < j10 * c(this.f45269i)) {
                return;
            }
            if (c(this.f45269i) != 100 && this.f45265e != 5) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f45269i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public boolean o() {
        return this.f45282v;
    }

    public boolean p() {
        return this.L;
    }

    public boolean q() {
        return this.Q;
    }

    public boolean r() {
        return this.N;
    }

    public boolean s() {
        return this.M;
    }

    public void t() {
        if (this.f45266f != null) {
            this.f45266f = null;
        }
    }

    public void v() {
        if (this.Q) {
            return;
        }
        try {
            this.f45286z = true;
            if (this.C == 1) {
                p0.b("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.C);
            } else {
                if (this.f45262b == 3) {
                    p0.b("CampaignDownLoadTask", "Can not call resume(), because dlnet = " + this.f45262b);
                    return;
                }
                p0.b("CampaignDownLoadTask", "resume()");
                this.O = false;
                this.P = false;
                DownloadMessage downloadMessage = new DownloadMessage(new Object(), this.f45273m, this.f45283w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                downloadMessage.setUseCronetDownload(a(this.f45269i));
                DownloadRequest<?> downloadRequestA = a(downloadMessage, this.R, this.S, "2");
                this.f45284x = downloadRequestA;
                downloadRequestA.start();
            }
        } catch (Exception e10) {
            p0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    public void w() {
        p0.b("CampaignDownLoadTask", "start()");
        try {
            if (TextUtils.isEmpty(this.f45273m)) {
                return;
            }
            if (d() != null) {
                p0.b("CampaignDownLoadTask", new URL(d()).getPath());
            }
            if (this.f45279s == 0 && this.C == 2) {
                p0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                return;
            }
            DownloadRequest downloadRequest = this.f45284x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar = this.f45267g;
            if (aVar != null) {
                aVar.a("VideoUrl is not illegal, Please check it.", "");
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f45268h;
            if (aVar2 != null) {
                aVar2.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    public void x() {
        p0.b("CampaignDownLoadTask", "startForLoadRefactor()");
        try {
            if (TextUtils.isEmpty(this.f45273m)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f45267g;
                if (aVar != null) {
                    aVar.a(this.f45273m);
                    return;
                }
                return;
            }
            if (d() != null) {
                p0.b("CampaignDownLoadTask", new URL(d()).getPath());
            }
            if (this.f45262b == 3) {
                p0.b("CampaignDownLoadTask", "startForLoadRefactor: Dlnet is 3, Will callback.");
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f45267g;
                if (aVar2 != null) {
                    aVar2.a(this.f45273m);
                    return;
                }
                return;
            }
            if (this.f45279s == 0 && this.C == 2) {
                p0.b("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f45267g;
                if (aVar3 != null) {
                    aVar3.a(this.f45273m);
                    return;
                }
                return;
            }
            try {
                if (this.f45265e == 5 && Utils.getDownloadRate(this.f45272l, this.f45275o) >= this.f45279s) {
                    if (Objects.exists(new File(this.f45274n + this.f45283w), this.f45274n, this.f45283w)) {
                        this.f45276p = this.f45274n + this.f45283w;
                        com.mbridge.msdk.videocommon.listener.a aVar4 = this.f45267g;
                        if (aVar4 != null) {
                            aVar4.a(this.f45273m);
                            return;
                        }
                        return;
                    }
                }
            } catch (Exception e10) {
                p0.b("CampaignDownLoadTask", "startForLoadRefactor: " + e10.getMessage());
            }
            DownloadRequest downloadRequest = this.f45284x;
            if (downloadRequest != null) {
                downloadRequest.start();
            }
        } catch (Throwable unused) {
            com.mbridge.msdk.videocommon.listener.a aVar5 = this.f45267g;
            if (aVar5 != null) {
                aVar5.a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    private void l() throws IOException {
        File file;
        File file2;
        try {
            if (TextUtils.isEmpty(this.f45273m)) {
                return;
            }
            if (TextUtils.isEmpty(this.f45274n)) {
                file = null;
            } else {
                file = new File(this.f45274n);
                if (!file.exists()) {
                    file.mkdirs();
                }
            }
            if (file != null && file.exists() && ((file2 = this.B) == null || !file2.exists())) {
                File file3 = new File(file + "/.nomedia");
                this.B = file3;
                if (!file3.exists()) {
                    this.B.createNewFile();
                }
            }
            u();
            a(this.f45273m);
        } catch (Exception e10) {
            p0.c("CampaignDownLoadTask", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            u0.a(this.f45270j, this.f45269i, com.mbridge.msdk.foundation.same.a.f40727x);
        } catch (Exception e10) {
            p0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }

    public void c(boolean z10) {
        this.L = z10;
    }

    public String d() {
        return this.f45273m;
    }

    public void e(boolean z10) {
        this.N = z10;
    }

    public void f(boolean z10) {
        this.M = z10;
    }

    public String g() {
        if (this.Q) {
            try {
                File file = new File(this.f45276p);
                return (file.exists() && file.isFile()) ? this.f45276p : this.f45273m;
            } catch (Exception e10) {
                p0.b("CampaignDownLoadTask", e10.getMessage());
                return this.f45273m;
            }
        }
        try {
            File file2 = new File(this.f45276p);
            if (Objects.exists(file2, this.f45274n, this.f45283w) && file2.isFile()) {
                return this.f45276p;
            }
        } catch (Exception e11) {
            p0.b("CampaignDownLoadTask", e11.getMessage());
        }
        return this.f45273m;
    }

    public long h() {
        return this.f45275o;
    }

    public long i() {
        return this.f45278r;
    }

    public int j() {
        return this.f45265e;
    }

    public String k() {
        return this.f45276p;
    }

    public boolean n() {
        return this.K;
    }

    public void c(int i10) {
        this.f45262b = i10;
    }

    public void d(boolean z10) {
        this.f45277q = z10;
    }

    public long e() {
        return this.f45272l;
    }

    public String f() {
        String message = "";
        if (this.f45262b == 3) {
            return "";
        }
        String str = this.f45274n + this.f45283w;
        File file = new File(str);
        try {
            if (Objects.exists(file, this.f45274n, this.f45283w)) {
                if (file.isFile()) {
                    if (!file.canRead()) {
                        message = "file can not read ";
                    } else if (file.length() > 0) {
                        this.f45276p = str;
                    } else {
                        message = "file length is 0 ";
                    }
                } else {
                    message = "file is not file ";
                }
            } else {
                message = "file is not exist ";
            }
        } catch (Throwable th2) {
            p0.b("CampaignDownLoadTask", th2.getMessage());
            message = th2.getMessage();
        }
        if (this.f45265e == 5 && !TextUtils.isEmpty(message)) {
            a();
        }
        return message;
    }

    public void b(int i10) {
        this.f45263c = i10;
    }

    public CampaignEx c() {
        return this.f45269i;
    }

    public void d(int i10) {
        p0.a("CampaignDownLoadTask", "set ready rate: " + i10);
        this.f45279s = i10;
    }

    public void e(CampaignEx campaignEx) {
        this.f45269i = campaignEx;
    }

    private int c(CampaignEx campaignEx) {
        int iD;
        if (campaignEx == null) {
            return 100;
        }
        if (campaignEx.getReady_rate() != -1) {
            iD = campaignEx.getReady_rate();
            p0.a("CampaignDownLoadTask", "ready_rate(campaign): " + iD);
        } else {
            iD = d(campaignEx);
            p0.a("CampaignDownLoadTask", "ready_rate(reward_unit_setting): " + iD);
        }
        try {
            return Math.max(iD, 0);
        } catch (Exception unused) {
            return 100;
        }
    }

    public void b(boolean z10) {
        this.f45282v = z10;
    }

    public void e(int i10) {
        this.C = i10;
    }

    private int d(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 100;
        }
        try {
            if (campaignEx.getAdType() == 298) {
                if (this.H == null) {
                    this.H = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.m().b(), this.f45270j);
                }
                return this.H.C();
            }
            if (campaignEx.getAdType() == 42) {
                if (this.J == null) {
                    this.J = com.mbridge.msdk.setting.h.b().e(com.mbridge.msdk.foundation.controller.c.m().b(), this.f45270j);
                }
                return b((CampaignEx) null);
            }
            if (this.I == null) {
                this.I = com.mbridge.msdk.videocommon.setting.b.b().a(com.mbridge.msdk.foundation.controller.c.m().b(), this.f45270j, false);
            }
            return this.I.w();
        } catch (Throwable th2) {
            p0.b("CampaignDownLoadTask", th2.getMessage(), th2);
            return 100;
        }
    }

    public void b(String str) {
        com.mbridge.msdk.videocommon.listener.a aVar = this.f45267g;
        if (aVar != null) {
            aVar.a(str, this.f45273m);
        }
        com.mbridge.msdk.videocommon.listener.a aVar2 = this.f45268h;
        if (aVar2 != null) {
            aVar2.a(str, this.f45273m);
        }
        com.google.android.gms.internal.play_billing.a.v("Video download stop : ", str, "CampaignDownLoadTask");
        if (this.f45265e == 4 || this.f45265e == 2 || this.f45265e == 5) {
            return;
        }
        this.f45265e = 4;
        CampaignEx campaignEx = this.f45269i;
        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && this.f45269i.getRsIgnoreCheckRule().size() > 0 && this.f45269i.getRsIgnoreCheckRule().contains(0)) {
            p0.c("CampaignDownLoadTask", "Is not check video download status");
        } else {
            a(this.f45275o, this.f45265e);
        }
    }

    public void a(boolean z10) {
        this.K = z10;
    }

    public void a(int i10, int i11) {
        this.f45265e = i10;
        if (this.f45281u == null) {
            this.f45281u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
        }
        this.f45281u.a(this.f45273m, i11, i10);
    }

    public void c(String str) {
        m();
        a(2, str, "");
        this.f45265e = 4;
    }

    public void a(int i10) {
        this.A = i10;
    }

    public void a(String str) {
        int iC;
        if (TextUtils.isEmpty(str)) {
            this.f45268h.a("VideoUrl is NULL, Please check it.", "");
            return;
        }
        if (this.f45265e == 1) {
            p0.a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
            return;
        }
        if (this.f45265e == 5 && Utils.getDownloadRate(this.f45272l, this.f45275o) >= this.f45279s) {
            p0.a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
            com.mbridge.msdk.videocommon.listener.a aVar = this.f45267g;
            if (aVar != null) {
                aVar.a(this.f45273m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar2 = this.f45268h;
            if (aVar2 != null) {
                aVar2.a(this.f45273m);
            }
            try {
                File file = new File(this.f45276p);
                if (Objects.exists(file, this.f45274n, this.f45283w) && file.isFile()) {
                    file.setLastModified(System.currentTimeMillis());
                }
            } catch (Exception e10) {
                p0.b("CampaignDownLoadTask", e10.getMessage());
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", 1);
            a(this.f45269i, eVar);
            return;
        }
        if (this.f45262b == 3) {
            p0.a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
            a(0L, false, "");
            com.mbridge.msdk.foundation.same.report.metrics.e eVar2 = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar2.a("cache", 1);
            a(this.f45269i, eVar2);
            return;
        }
        try {
            iC = c(this.f45269i);
        } catch (Exception unused) {
            iC = 100;
        }
        d(iC);
        if (iC == 0) {
            com.mbridge.msdk.videocommon.listener.a aVar3 = this.f45267g;
            if (aVar3 != null) {
                aVar3.a(this.f45273m);
            }
            com.mbridge.msdk.videocommon.listener.a aVar4 = this.f45268h;
            if (aVar4 != null) {
                aVar4.a(this.f45273m);
            }
        }
        DownloadMessage downloadMessage = new DownloadMessage(this.f45269i, str, this.f45283w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
        downloadMessage.setUseCronetDownload(a(this.f45269i));
        downloadMessage.addExtra("resource_type", 4);
        this.f45284x = a(downloadMessage, this.R, this.S, "1");
    }

    private int b(CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.setting.l lVar = this.J;
            if (lVar != null) {
                return lVar.C();
            }
            return 100;
        } catch (Exception e10) {
            if (!MBridgeConstans.DEBUG) {
                return 100;
            }
            p0.b("CampaignDownLoadTask", e10.getMessage());
            return 100;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.videocommon.download.a$a, reason: collision with other inner class name */
    public class C0357a implements OnDownloadStateListener {
        public C0357a() {
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadComplete(DownloadMessage downloadMessage) {
            String str;
            try {
                p0.b("CampaignDownLoadTask", "onDownloadComplete callback : " + a.this.f45275o + "    " + a.this.f45272l);
                if (a.this.f45281u == null) {
                    a.this.f45281u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                }
                a.this.f45281u.a(a.this.f45273m, a.this.f45275o, 5);
                if (downloadMessage != null) {
                    try {
                        str = (String) downloadMessage.getExtra("responseHeaders");
                    } catch (Throwable th2) {
                        p0.b("CampaignDownLoadTask", th2.getMessage());
                    }
                } else {
                    str = "";
                }
                a aVar = a.this;
                aVar.a(aVar.f45275o, true, str);
                a.this.f45281u.a(a.this.f45273m, a.this.f45275o, 5);
                a aVar2 = a.this;
                aVar2.a(aVar2.f45275o, true, "");
                a.this.a(1, true, "");
            } catch (Exception e10) {
                p0.b("CampaignDownLoadTask", e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (a.this.f45284x == null || a.this.f45284x.getStatus() == DownloadStatus.CANCELLED) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("cache", a.this.f45284x.get("cache", "2"));
            a aVar = a.this;
            aVar.a(aVar.f45269i, eVar);
            String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
            a.this.m();
            a.this.a(3, message, "");
            a.this.b(message);
            a aVar2 = a.this;
            aVar2.a(3, aVar2.f45286z, message);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onDownloadStart(DownloadMessage downloadMessage) {
            a.this.f45265e = 1;
            if (a.this.f45281u == null) {
                a.this.f45281u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
            }
            a.this.f45281u.a(a.this.f45269i, a.this.f45272l, a.this.f45276p, a.this.f45265e);
        }

        @Override // com.mbridge.msdk.foundation.download.OnDownloadStateListener
        public void onCancelDownload(DownloadMessage downloadMessage) {
        }
    }

    public void b(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f45268h = aVar;
    }

    public void b() {
        try {
            a();
            CampaignEx campaignEx = this.f45269i;
            if (campaignEx == null || campaignEx.getPlayable_ads_without_video() != 2) {
                com.mbridge.msdk.videocommon.cache.a aVarA = com.mbridge.msdk.videocommon.cache.a.a();
                if (aVarA != null) {
                    aVarA.a(this.f45269i);
                }
            }
        } catch (Exception unused) {
            p0.b("CampaignDownLoadTask", "del file is failed");
        } finally {
            this.f45265e = 0;
        }
    }

    private DownloadRequest<?> a(DownloadMessage downloadMessage, OnDownloadStateListener onDownloadStateListener, OnProgressStateListener onProgressStateListener, String str) {
        return MBDownloadManager.getInstance().download(downloadMessage).withReadTimeout(this.D).withConnectTimeout(this.F).withWriteTimeout(this.E).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(1).withDirectoryPathInternal(this.f45274n).withDownloadStateListener(onDownloadStateListener).withProgressStateListener(onProgressStateListener).withTimeout(ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS).with("do_us_fi_re", Boolean.toString(this.G)).with("download_scene", "download_video").with(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f45279s)).with("scenes", str).build();
    }

    public void a(long j10, boolean z10, String str) {
        m mVar;
        StringBuilder sb2 = new StringBuilder("setStateToDone 下载完成  ： mProgressSize");
        sb2.append(this.f45275o);
        e2.A(sb2, "  progressSize ", j10, "  ");
        sb2.append(this.f45285y);
        sb2.append("%   FileSize : ");
        sb2.append(this.f45272l);
        sb2.append("  ");
        sb2.append(this.f45269i.getAppName());
        p0.b("CampaignDownLoadTask", sb2.toString());
        if (this.f45279s == 100 && this.f45262b != 3 && j10 != this.f45272l && !z10) {
            File file = new File(this.f45276p);
            long length = Objects.exists(file, this.f45274n, this.f45283w) ? file.length() : 0L;
            StringBuilder sbR = e2.r(j10, "progressSize = ", " fileSize = ");
            sbR.append(this.f45272l);
            sbR.append(" ");
            sbR.append(z10);
            sbR.append(" absFileSize = ");
            sbR.append(length);
            p0.b("CampaignDownLoadTask", sbR.toString());
            b("File size is not match witch download size.");
            return;
        }
        this.f45265e = 5;
        if (j10 == this.f45272l) {
            a(1, "", str);
        }
        long j11 = this.f45272l;
        if (j11 != 0 && (mVar = this.f45281u) != null) {
            mVar.b(this.f45273m, j11);
        }
        this.f45261a = false;
        a(j10, this.f45265e);
    }

    public void a(c cVar) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f45266f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(cVar);
        }
    }

    public void a(com.mbridge.msdk.videocommon.listener.a aVar) {
        this.f45267g = aVar;
    }

    private void a(long j10, int i10) {
        this.f45275o = j10;
        int i11 = this.f45279s;
        if (100 * j10 >= i11 * this.f45272l && !this.f45280t && i10 != 4) {
            if (i11 == 100 && i10 != 5) {
                this.f45265e = 5;
                return;
            }
            this.f45280t = true;
            p0.b("CampaignDownLoadTask", "UpdateListener : state: " + i10 + " progress : " + j10);
            String strF = f();
            if (TextUtils.isEmpty(strF)) {
                com.mbridge.msdk.videocommon.listener.a aVar = this.f45267g;
                if (aVar != null) {
                    aVar.a(this.f45273m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar2 = this.f45268h;
                if (aVar2 != null) {
                    aVar2.a(this.f45273m);
                }
            } else {
                com.mbridge.msdk.videocommon.listener.a aVar3 = this.f45267g;
                if (aVar3 != null) {
                    aVar3.a(a.b.k("file is not effective ", strF), this.f45273m);
                }
                com.mbridge.msdk.videocommon.listener.a aVar4 = this.f45268h;
                if (aVar4 != null) {
                    aVar4.a(a.b.k("file is not effective ", strF), this.f45273m);
                }
            }
        }
        if (!this.f45261a && j10 > 0) {
            this.f45261a = true;
            if (this.f45281u == null) {
                this.f45281u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
            }
            this.f45281u.a(this.f45273m, j10, this.f45265e);
        }
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.f45266f;
        if (copyOnWriteArrayList != null) {
            Iterator<c> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                c next = it.next();
                if (next != null) {
                    next.onProgress(j10, i10);
                }
            }
        }
    }

    private void a() {
        if (this.f45281u == null) {
            this.f45281u = m.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
        }
        try {
            try {
                this.f45281u.a(this.f45273m);
                if (!r0.a().a("r_d_v_b_l", true)) {
                    File file = new File(this.f45276p);
                    if (file.exists() && file.isFile()) {
                        file.delete();
                    }
                }
            } catch (Throwable unused) {
                p0.b("CampaignDownLoadTask", "del DB or file failed");
            }
        } finally {
            this.f45265e = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, String str, String str2) {
        n nVar = new n(this.f45271k, this.f45269i, i10, Long.toString(this.f45278r != 0 ? System.currentTimeMillis() - this.f45278r : 0L), this.f45272l, this.A);
        nVar.b(this.f45269i.getId());
        nVar.v(this.f45269i.getVideoUrlEncode());
        nVar.m(str);
        nVar.n(this.f45269i.getRequestId());
        nVar.k(this.f45269i.getCurrentLocalRid());
        nVar.o(this.f45269i.getRequestIdNotice());
        nVar.u(this.f45270j);
        nVar.q(str2);
        nVar.b(CampaignEx.JSON_KEY_READY_RATE, String.valueOf(this.f45279s));
        nVar.b("url", this.f45269i.getVideoUrlEncode());
        nVar.e(4);
        DownloadRequest downloadRequest = this.f45284x;
        if (downloadRequest != null) {
            nVar.b("scenes", downloadRequest.get("scenes", ""));
            nVar.b("resumed_breakpoint", this.f45284x.get("resumed_breakpoint", ""));
        }
        int i11 = this.A;
        if (i11 == 94 || i11 == 287) {
            return;
        }
        com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d())).a(nVar);
    }

    private int a(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return 0;
        }
        try {
            if (campaignEx.getAabEntity() != null) {
                return campaignEx.getAabEntity().h3c;
            }
            return 0;
        } catch (Throwable th2) {
            p0.b("CampaignDownLoadTask", th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, boolean z10, String str) {
        if (this.P) {
            return;
        }
        try {
            this.P = true;
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            DownloadRequest downloadRequest = this.f45284x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", ""));
                eVar.a("url", this.f45273m);
                eVar.a("resumed_breakpoint", this.f45284x.get("resumed_breakpoint", ""));
                eVar.a("h3c", "");
            }
            eVar.a("resource_type", 4);
            eVar.a("file_size", Long.valueOf(this.f45272l));
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(this.f45279s));
            eVar.a("result", Integer.valueOf(i10));
            eVar.a("reason", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_end", this.f45269i, eVar);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, com.mbridge.msdk.foundation.same.report.metrics.e eVar) {
        if (this.O || campaignEx == null || eVar == null) {
            return;
        }
        this.O = true;
        try {
            eVar.a("resource_type", 4);
            DownloadRequest downloadRequest = this.f45284x;
            if (downloadRequest != null) {
                eVar.a("scenes", downloadRequest.get("scenes", "1"));
                eVar.a("resumed_breakpoint", this.f45284x.get("resumed_breakpoint", "2"));
            } else {
                eVar.a("scenes", "1");
                eVar.a("resumed_breakpoint", "1");
            }
            eVar.a("url", campaignEx.getVideoUrlEncode());
            eVar.a(CampaignEx.JSON_KEY_READY_RATE, Integer.valueOf(c(campaignEx)));
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("m_download_start", campaignEx, eVar);
        } catch (Exception e10) {
            p0.b("CampaignDownLoadTask", e10.getMessage());
        }
    }
}
