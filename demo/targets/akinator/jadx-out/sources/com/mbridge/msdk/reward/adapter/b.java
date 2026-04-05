package com.mbridge.msdk.reward.adapter;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.ironsource.C3191e4;
import com.ironsource.C3227g4;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResDownloadCheckManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.y;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.video.bt.module.MBridgeBTLayout;
import com.mbridge.msdk.video.bt.module.MBridgeBTRootLayout;
import com.mbridge.msdk.videocommon.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public final class b {

    /* renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, f> f42181g;

    /* renamed from: a, reason: collision with root package name */
    private final m f42182a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f42183b;

    /* renamed from: c, reason: collision with root package name */
    private final String f42184c;

    /* renamed from: d, reason: collision with root package name */
    private final String f42185d;

    /* renamed from: e, reason: collision with root package name */
    private final String f42186e;

    /* renamed from: f, reason: collision with root package name */
    private volatile List<WindVaneWebView> f42187f;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f42188a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f42189b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42190c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f42191d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42192e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f42193f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f42194g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ n f42195h;

        public a(CopyOnWriteArrayList copyOnWriteArrayList, Context context, String str, int i10, String str2, String str3, String str4, n nVar) {
            this.f42188a = copyOnWriteArrayList;
            this.f42189b = context;
            this.f42190c = str;
            this.f42191d = i10;
            this.f42192e = str2;
            this.f42193f = str3;
            this.f42194g = str4;
            this.f42195h = nVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:117:0x02c9  */
        /* JADX WARN: Removed duplicated region for block: B:186:0x029a A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:208:0x0263 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0192  */
        /* JADX WARN: Removed duplicated region for block: B:70:0x01e8  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0241  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.security.NoSuchAlgorithmException {
            /*
                Method dump skipped, instructions count: 971
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.a.run():void");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42200a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f42201b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f42202c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42203d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ n f42204e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f42205f;

        public c(String str, String str2, String str3, CampaignEx campaignEx, n nVar, Context context) {
            this.f42200a = str;
            this.f42201b = str2;
            this.f42202c = str3;
            this.f42203d = campaignEx;
            this.f42204e = nVar;
            this.f42205f = context;
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x0185  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0169 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onFailed(java.lang.String r22, java.lang.String r23) {
            /*
                Method dump skipped, instructions count: 410
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.reward.adapter.b.c.onFailed(java.lang.String, java.lang.String):void");
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            try {
                p0.a("RewardCampaignsResourceManager", "zip btl template download success");
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
                Message messageObtain = Message.obtain();
                messageObtain.what = 105;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42200a);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42201b);
                bundle.putString("request_id", this.f42202c);
                bundle.putString(C3191e4.h.W, this.f42200a + "_" + this.f42202c + "_" + this.f42203d.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                b.this.f42182a.sendMessage(messageObtain);
                n nVar = this.f42204e;
                if (nVar != null) {
                    nVar.a(this.f42201b, this.f42200a, this.f42202c, str);
                }
                if (z10) {
                    return;
                }
                b.this.a(this.f42205f, 1, this.f42203d, str, "", this.f42200a, str2);
            } catch (Exception e10) {
                ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 205;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42200a);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f42201b);
                bundle2.putString("request_id", this.f42202c);
                bundle2.putString(C3191e4.h.W, this.f42200a + "_" + this.f42202c + "_" + this.f42203d.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                b.this.f42182a.sendMessage(messageObtain2);
                if (this.f42204e != null) {
                    try {
                        this.f42204e.a(str, this.f42202c, b.b(880005, new MBridgeIds(this.f42201b, this.f42200a, this.f42202c), "", e10, null));
                    } catch (Exception e11) {
                        p0.b("RewardCampaignsResourceManager", e11.getMessage());
                    }
                }
                b.this.a(this.f42205f, 3, this.f42203d, str, e10.getLocalizedMessage(), this.f42200a, str2);
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42207a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f42208b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f42209c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f42210d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42211e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f42212f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f42213g;

        public d(CampaignEx campaignEx, Context context, int i10, String str, String str2, String str3, String str4) {
            this.f42207a = campaignEx;
            this.f42208b = context;
            this.f42209c = i10;
            this.f42210d = str;
            this.f42211e = str2;
            this.f42212f = str3;
            this.f42213g = str4;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f42207a == null || this.f42208b == null) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                nVar.j("m_download_end");
                Context context = this.f42208b;
                if (context != null) {
                    nVar.c(l0.s(context.getApplicationContext()));
                }
                nVar.d(this.f42209c);
                CampaignEx campaignEx = this.f42207a;
                if (campaignEx != null) {
                    nVar.b(campaignEx.getId());
                    nVar.n(this.f42207a.getRequestId());
                    nVar.k(this.f42207a.getCurrentLocalRid());
                    nVar.o(this.f42207a.getRequestIdNotice());
                }
                nVar.b("url", this.f42210d);
                nVar.t(this.f42210d);
                nVar.m(this.f42211e);
                nVar.u(this.f42212f);
                if (!TextUtils.isEmpty(this.f42213g)) {
                    nVar.q(this.f42213g);
                }
                nVar.e(1);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f42207a);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f42215a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ WindVaneWebView f42216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42217c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ CopyOnWriteArrayList f42218d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f42219e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.videocommon.setting.c f42220f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f42221g;

        public e(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList copyOnWriteArrayList, String str, com.mbridge.msdk.videocommon.setting.c cVar, String str2) {
            this.f42215a = z10;
            this.f42216b = windVaneWebView;
            this.f42217c = campaignEx;
            this.f42218d = copyOnWriteArrayList;
            this.f42219e = str;
            this.f42220f = cVar;
            this.f42221g = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.a(this.f42215a, this.f42216b, this.f42217c.getRewardTemplateMode().e(), 0, this.f42217c, (CopyOnWriteArrayList<CampaignEx>) this.f42218d, H5DownLoadManager.getInstance().getH5ResAddress(this.f42217c.getRewardTemplateMode().e()), this.f42219e, this.f42220f, this.f42221g, b.this.f42183b);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        boolean f42223a;

        /* renamed from: b, reason: collision with root package name */
        boolean f42224b;

        /* renamed from: c, reason: collision with root package name */
        int f42225c;

        /* renamed from: d, reason: collision with root package name */
        int f42226d;

        /* renamed from: e, reason: collision with root package name */
        String f42227e;

        /* renamed from: f, reason: collision with root package name */
        String f42228f;

        /* renamed from: g, reason: collision with root package name */
        int f42229g;

        /* renamed from: h, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f42230h;

        /* renamed from: i, reason: collision with root package name */
        CopyOnWriteArrayList<CampaignEx> f42231i;

        public f(boolean z10, boolean z11, int i10, int i11, String str, String str2, int i12, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f42223a = z10;
            this.f42224b = z11;
            this.f42225c = i10;
            this.f42226d = i11;
            this.f42227e = str;
            this.f42228f = str2;
            this.f42229g = i12;
            this.f42230h = copyOnWriteArrayList;
            this.f42231i = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface h {
        void a(String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList);

        void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.foundation.error.b bVar);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class i implements H5DownLoadManager.IH5SourceDownloadListener {

        /* renamed from: b, reason: collision with root package name */
        private int f42253b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42254c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42255d;

        /* renamed from: e, reason: collision with root package name */
        private final String f42256e;

        /* renamed from: f, reason: collision with root package name */
        private CampaignEx f42257f;

        /* renamed from: g, reason: collision with root package name */
        private n f42258g;

        /* renamed from: h, reason: collision with root package name */
        private Handler f42259h;

        /* renamed from: i, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f42260i;

        /* renamed from: a, reason: collision with root package name */
        private boolean f42252a = false;

        /* renamed from: j, reason: collision with root package name */
        private final long f42261j = System.currentTimeMillis();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f42262a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f42263b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42264c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f42265d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f42266e;

            public a(int i10, long j10, String str, String str2, String str3) {
                this.f42262a = i10;
                this.f42263b = j10;
                this.f42264c = str;
                this.f42265d = str2;
                this.f42266e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (i.this.f42257f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f42262a, this.f42263b + "", this.f42264c, i.this.f42257f.getId(), i.this.f42255d, this.f42265d, "2");
                    nVar.n(i.this.f42257f.getRequestId());
                    nVar.k(i.this.f42257f.getCurrentLocalRid());
                    nVar.o(i.this.f42257f.getRequestIdNotice());
                    nVar.b(i.this.f42257f.getId());
                    nVar.a(i.this.f42257f.getAdSpaceT());
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f42264c);
                    if (i.this.f42257f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (i.this.f42257f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    if (!TextUtils.isEmpty(this.f42266e)) {
                        nVar.q(this.f42266e);
                    }
                    b.b(nVar, i.this.f42257f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, i.this.f42255d, i.this.f42257f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public i(int i10, String str, String str2, String str3, CampaignEx campaignEx, n nVar, Handler handler, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f42253b = i10;
            this.f42254c = str;
            this.f42255d = str2;
            this.f42256e = str3;
            this.f42257f = campaignEx;
            this.f42258g = nVar;
            this.f42259h = handler;
            this.f42260i = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, false);
            int i10 = this.f42253b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 201;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42255d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42254c);
                bundle.putString("request_id", this.f42256e);
                bundle.putString(C3191e4.h.W, this.f42255d + "_" + this.f42256e + "_" + this.f42257f.getSecondRequestIndex());
                bundle.putString("url", str);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain.setData(bundle);
                this.f42259h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42255d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f42254c);
                bundle2.putString("request_id", this.f42256e);
                bundle2.putString(C3191e4.h.W, this.f42255d + "_" + this.f42256e + "_" + this.f42257f.getSecondRequestIndex());
                bundle2.putString("url", str);
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain2.setData(bundle2);
                this.f42259h.sendMessage(messageObtain2);
                if (this.f42252a) {
                    a(3, System.currentTimeMillis() - this.f42261j, str, "url download failed", "");
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 205;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42255d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f42254c);
                bundle3.putString("request_id", this.f42256e);
                bundle3.putString(C3191e4.h.W, this.f42255d + "_" + this.f42256e + "_" + this.f42257f.getSecondRequestIndex());
                bundle3.putString(PglCryptUtils.KEY_MESSAGE, str2);
                messageObtain3.setData(bundle3);
                this.f42259h.sendMessage(messageObtain3);
                if (this.f42258g != null) {
                    try {
                        this.f42258g.a(str, this.f42256e, b.b(880006, new MBridgeIds(this.f42254c, this.f42255d, this.f42256e), str2, null, null));
                    } catch (Exception e10) {
                        p0.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            int i10 = this.f42253b;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42255d);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42254c);
                bundle.putString("request_id", this.f42256e);
                bundle.putString(C3191e4.h.W, this.f42255d + "_" + this.f42256e + "_" + this.f42257f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f42259h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42255d);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f42254c);
                bundle2.putString("request_id", this.f42256e);
                bundle2.putString(C3191e4.h.W, this.f42255d + "_" + this.f42256e + "_" + this.f42257f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f42259h.sendMessage(messageObtain2);
                if (this.f42252a) {
                    a(1, System.currentTimeMillis() - this.f42261j, str, "", str2);
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 105;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42255d);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f42254c);
                bundle3.putString("request_id", this.f42256e);
                bundle3.putString(C3191e4.h.W, this.f42255d + "_" + this.f42256e + "_" + this.f42257f.getSecondRequestIndex());
                messageObtain3.setData(bundle3);
                this.f42259h.sendMessage(messageObtain3);
                n nVar = this.f42258g;
                if (nVar != null) {
                    nVar.a(this.f42254c, this.f42255d, this.f42256e, str);
                }
            }
        }

        public void a(boolean z10) {
            this.f42252a = z10;
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, j10, str, str2, str3));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class j implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        private Handler f42268a;

        /* renamed from: b, reason: collision with root package name */
        private int f42269b;

        /* renamed from: c, reason: collision with root package name */
        private String f42270c;

        /* renamed from: d, reason: collision with root package name */
        private String f42271d;

        /* renamed from: e, reason: collision with root package name */
        private String f42272e;

        /* renamed from: f, reason: collision with root package name */
        private CampaignEx f42273f;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f42274a;

            public a(String str) {
                this.f42274a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (j.this.f42273f != null) {
                    try {
                        com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(com.mbridge.msdk.foundation.controller.c.m().d()));
                        p0.a("RewardCampaignsResourceManager", "campaign is null");
                        com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                        nVar.j("2000044");
                        nVar.c(l0.s(com.mbridge.msdk.foundation.controller.c.m().d()));
                        nVar.b(j.this.f42273f.getId());
                        nVar.i(j.this.f42273f.getImageUrl());
                        nVar.n(j.this.f42273f.getRequestId());
                        nVar.k(j.this.f42273f.getCurrentLocalRid());
                        nVar.o(j.this.f42273f.getRequestIdNotice());
                        nVar.u(j.this.f42270c);
                        nVar.m(this.f42274a);
                        nVar.b("scenes", "1");
                        nVarA.a(nVar);
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                        }
                    }
                }
            }
        }

        public j(Handler handler, int i10, String str, String str2, String str3, CampaignEx campaignEx) {
            this.f42268a = handler;
            this.f42269b = i10;
            this.f42271d = str;
            this.f42270c = str2;
            this.f42272e = str3;
            this.f42273f = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f42269b == 0 ? 202 : 204;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42270c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42271d);
            bundle.putString("request_id", this.f42272e);
            bundle.putString(C3191e4.h.W, this.f42270c + "_" + this.f42272e + "_" + this.f42273f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f42268a.sendMessage(messageObtain);
            a aVar = new a(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(aVar);
            } else {
                aVar.run();
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            ResDownloadCheckManager.getInstance().setImageDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = this.f42269b == 0 ? 102 : 104;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42270c);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42271d);
            bundle.putString("request_id", this.f42272e);
            bundle.putString(C3191e4.h.W, this.f42270c + "_" + this.f42272e + "_" + this.f42273f.getSecondRequestIndex());
            messageObtain.setData(bundle);
            this.f42268a.sendMessage(messageObtain);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class l implements H5DownLoadManager.ZipDownloadListener {

        /* renamed from: b, reason: collision with root package name */
        private Context f42282b;

        /* renamed from: c, reason: collision with root package name */
        private String f42283c;

        /* renamed from: d, reason: collision with root package name */
        private String f42284d;

        /* renamed from: e, reason: collision with root package name */
        private String f42285e;

        /* renamed from: f, reason: collision with root package name */
        private CampaignEx f42286f;

        /* renamed from: g, reason: collision with root package name */
        private int f42287g;

        /* renamed from: h, reason: collision with root package name */
        private Handler f42288h;

        /* renamed from: i, reason: collision with root package name */
        private n f42289i;

        /* renamed from: j, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f42290j;

        /* renamed from: a, reason: collision with root package name */
        private boolean f42281a = false;

        /* renamed from: k, reason: collision with root package name */
        private long f42291k = System.currentTimeMillis();

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f42292a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f42293b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42294c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f42295d;

            public a(int i10, String str, String str2, String str3) {
                this.f42292a = i10;
                this.f42293b = str;
                this.f42294c = str2;
                this.f42295d = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f42286f == null || l.this.f42282b == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                    nVar.j("m_download_end");
                    if (l.this.f42282b != null) {
                        nVar.c(l0.s(l.this.f42282b.getApplicationContext()));
                    }
                    nVar.d(this.f42292a);
                    if (l.this.f42286f != null) {
                        nVar.b(l.this.f42286f.getId());
                        nVar.n(l.this.f42286f.getRequestId());
                        nVar.k(l.this.f42286f.getCurrentLocalRid());
                        nVar.o(l.this.f42286f.getRequestIdNotice());
                    }
                    nVar.t(this.f42293b);
                    nVar.m(this.f42294c);
                    nVar.u(l.this.f42283c);
                    if (!TextUtils.isEmpty(this.f42295d)) {
                        nVar.q(this.f42295d);
                    }
                    nVar.e(2);
                    nVar.b("scenes", "1");
                    nVar.b("url", this.f42293b);
                    b.b(nVar, l.this.f42286f);
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, l.this.f42286f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$l$b, reason: collision with other inner class name */
        public class RunnableC0304b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f42297a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f42298b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42299c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f42300d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f42301e;

            public RunnableC0304b(int i10, long j10, String str, String str2, String str3) {
                this.f42297a = i10;
                this.f42298b = j10;
                this.f42299c = str;
                this.f42300d = str2;
                this.f42301e = str3;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (l.this.f42286f == null) {
                    return;
                }
                try {
                    com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n("m_download_end", this.f42297a, this.f42298b + "", this.f42299c, l.this.f42286f.getId(), l.this.f42283c, this.f42300d, "1");
                    nVar.n(l.this.f42286f.getRequestId());
                    nVar.k(l.this.f42286f.getCurrentLocalRid());
                    nVar.o(l.this.f42286f.getRequestIdNotice());
                    nVar.b(l.this.f42286f.getId());
                    nVar.a(l.this.f42286f.getAdSpaceT());
                    nVar.q(this.f42301e);
                    nVar.b("scenes", "1");
                    if (l.this.f42286f.getAdType() == 287) {
                        nVar.a("3");
                    } else if (l.this.f42286f.getAdType() == 94) {
                        nVar.a("1");
                    }
                    nVar.b("url", this.f42299c);
                    nVar.e(3);
                    b.b(nVar, l.this.f42286f);
                    com.mbridge.msdk.foundation.same.report.g.a(nVar, l.this.f42283c, l.this.f42286f);
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    }
                }
            }
        }

        public l(Context context, String str, String str2, String str3, CampaignEx campaignEx, int i10, Handler handler, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f42282b = context;
            this.f42284d = str;
            this.f42283c = str2;
            this.f42285e = str3;
            this.f42286f = campaignEx;
            this.f42287g = i10;
            this.f42288h = handler;
            this.f42289i = nVar;
            this.f42290j = copyOnWriteArrayList;
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onFailed(String str, String str2) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str2, false);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f42291k;
            int i10 = this.f42287g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42283c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42284d);
                bundle.putString("request_id", this.f42285e);
                bundle.putString(C3191e4.h.W, this.f42283c + "_" + this.f42285e + "_" + this.f42286f.getSecondRequestIndex());
                bundle.putString("url", str2);
                bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain.setData(bundle);
                this.f42288h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 201;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42283c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f42284d);
                bundle2.putString("request_id", this.f42285e);
                bundle2.putString("url", str2);
                bundle2.putString(C3191e4.h.W, this.f42283c + "_" + this.f42285e + "_" + this.f42286f.getSecondRequestIndex());
                bundle2.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain2.setData(bundle2);
                this.f42288h.sendMessage(messageObtain2);
                if (this.f42281a) {
                    a(3, jCurrentTimeMillis, str2, "zip download failed", "");
                }
            } else if (i10 == 859) {
                Message messageObtain3 = Message.obtain();
                messageObtain3.what = 203;
                Bundle bundle3 = new Bundle();
                bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42283c);
                bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f42284d);
                bundle3.putString("request_id", this.f42285e);
                bundle3.putString("url", str2);
                bundle3.putString(C3191e4.h.W, this.f42283c + "_" + this.f42285e + "_" + this.f42286f.getSecondRequestIndex());
                bundle3.putString(PglCryptUtils.KEY_MESSAGE, str);
                messageObtain3.setData(bundle3);
                this.f42288h.sendMessage(messageObtain3);
                if (this.f42289i != null) {
                    try {
                        this.f42289i.a(str2, this.f42285e, b.b(880006, new MBridgeIds(this.f42284d, this.f42283c, this.f42285e), "", null, null));
                    } catch (Exception e10) {
                        p0.b("RewardCampaignsResourceManager", e10.getMessage());
                    }
                }
                a(3, str2, str, "");
            }
        }

        @Override // com.mbridge.msdk.foundation.download.download.H5DownLoadManager.H5ResDownloadListerInter
        public void onSuccess(String str, String str2, boolean z10) {
            ResDownloadCheckManager.getInstance().setZipDownloadDone(str, true);
            long jCurrentTimeMillis = System.currentTimeMillis() - this.f42291k;
            int i10 = this.f42287g;
            if (i10 == 313) {
                Message messageObtain = Message.obtain();
                messageObtain.what = 101;
                Bundle bundle = new Bundle();
                bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42283c);
                bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42284d);
                bundle.putString("request_id", this.f42285e);
                bundle.putString(C3191e4.h.W, this.f42283c + "_" + this.f42285e + "_" + this.f42286f.getSecondRequestIndex());
                bundle.putString("url", str);
                messageObtain.setData(bundle);
                this.f42288h.sendMessage(messageObtain);
                return;
            }
            if (i10 == 497) {
                Message messageObtain2 = Message.obtain();
                messageObtain2.what = 101;
                Bundle bundle2 = new Bundle();
                bundle2.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42283c);
                bundle2.putString(MBridgeConstans.PLACEMENT_ID, this.f42284d);
                bundle2.putString("request_id", this.f42285e);
                bundle2.putString(C3191e4.h.W, this.f42283c + "_" + this.f42285e + "_" + this.f42286f.getSecondRequestIndex());
                bundle2.putString("url", str);
                messageObtain2.setData(bundle2);
                this.f42288h.sendMessage(messageObtain2);
                if (this.f42281a) {
                    a(1, jCurrentTimeMillis, str, "", str2);
                    return;
                }
                return;
            }
            if (i10 != 859) {
                return;
            }
            Message messageObtain3 = Message.obtain();
            messageObtain3.what = 103;
            Bundle bundle3 = new Bundle();
            bundle3.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42283c);
            bundle3.putString(MBridgeConstans.PLACEMENT_ID, this.f42284d);
            bundle3.putString("request_id", this.f42285e);
            bundle3.putString(C3191e4.h.W, this.f42283c + "_" + this.f42285e + "_" + this.f42286f.getSecondRequestIndex());
            messageObtain3.setData(bundle3);
            this.f42288h.sendMessage(messageObtain3);
            n nVar = this.f42289i;
            if (nVar != null) {
                nVar.a(this.f42284d, this.f42283c, this.f42285e, str);
            }
            if (z10) {
                return;
            }
            a(1, str, "", str2);
        }

        public void a(boolean z10) {
            this.f42281a = z10;
        }

        private void a(int i10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new a(i10, str, str2, str3));
        }

        private void a(int i10, long j10, String str, String str2, String str3) {
            com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new RunnableC0304b(i10, j10, str, str2, str3));
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class m extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private Context f42303a;

        /* renamed from: b, reason: collision with root package name */
        private ConcurrentHashMap<String, h> f42304b;

        /* renamed from: c, reason: collision with root package name */
        private ConcurrentHashMap<String, CopyOnWriteArrayList<CampaignEx>> f42305c;

        public m(Looper looper) {
            super(looper);
            this.f42304b = new ConcurrentHashMap<>();
            this.f42305c = new ConcurrentHashMap<>();
        }

        public void a(String str, h hVar) {
            this.f42304b.put(str, hVar);
        }

        public void a(Context context) {
            this.f42303a = context;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            boolean zA;
            Bundle data = message.getData();
            String string = data.getString(MBridgeConstans.PLACEMENT_ID);
            String string2 = data.getString(MBridgeConstans.PROPERTIES_UNIT_ID);
            String string3 = data.getString("request_id");
            String string4 = data.getString(C3191e4.h.W);
            f fVar = (f) b.f42181g.get(string4);
            h hVar = this.f42304b.get(string4);
            CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList = this.f42305c.get(string4);
            int i10 = message.what;
            switch (i10) {
                case 100:
                case 101:
                case 102:
                case 103:
                case 104:
                case 105:
                case 106:
                    break;
                default:
                    switch (i10) {
                        case 200:
                        case 201:
                        case 203:
                        case 205:
                            if (fVar != null && hVar != null) {
                                String string5 = data.getString(PglCryptUtils.KEY_MESSAGE);
                                if (string5 == null) {
                                    string5 = "";
                                }
                                int iC = b.c(message.what);
                                String str = "resource download failed " + b.d(message.what) + " " + string5;
                                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = fVar.f42230h;
                                try {
                                    CampaignEx campaignEx = (copyOnWriteArrayList2 == null || copyOnWriteArrayList2.size() <= 0) ? null : fVar.f42230h.get(0);
                                    if (!fVar.f42223a || fVar.f42231i == null) {
                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f42227e, fVar.f42224b, fVar.f42226d, fVar.f42223a, fVar.f42225c, copyOnWriteArrayList)) {
                                            hVar.a(string, string2, string3, fVar.f42230h);
                                        } else {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                                int i11 = message.what;
                                                if (i11 != 200) {
                                                    if (i11 != 201) {
                                                        if (i11 != 203) {
                                                            if (i11 == 205 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                                break;
                                                            }
                                                        } else if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                            break;
                                                        }
                                                    } else if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                        break;
                                                    }
                                                } else if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                    break;
                                                }
                                            }
                                            hVar.a(fVar.f42230h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                        }
                                        this.f42304b.remove(string4);
                                        b.f42181g.remove(string4);
                                        this.f42305c.remove(string4);
                                        break;
                                    } else if (fVar.f42225c == 1) {
                                        if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0) {
                                            int i12 = message.what;
                                            if (i12 == 200) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                    break;
                                                }
                                            } else if (i12 == 201) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                    break;
                                                }
                                            } else if (i12 == 203) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                    break;
                                                }
                                            } else if (i12 == 205) {
                                                if (campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                    break;
                                                } else {
                                                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList3 = fVar.f42230h;
                                                    if (copyOnWriteArrayList3 != null && copyOnWriteArrayList3.size() > 0) {
                                                        CampaignEx campaignEx2 = fVar.f42230h.get(0);
                                                        if (campaignEx2.getCMPTEntryUrl().equals(campaignEx2.getendcard_url()) && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                            break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        hVar.a(fVar.f42230h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                        this.f42304b.remove(string4);
                                        b.f42181g.remove(string4);
                                        this.f42305c.remove(string4);
                                        break;
                                    } else {
                                        String string6 = data.getString("url");
                                        int i13 = message.what;
                                        if (i13 == 200) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(0)) {
                                                p0.c("RewardCampaignsResourceManager", "Is TPL but  video download fail but hit ignoreCheckRule");
                                                break;
                                            } else {
                                                for (int i14 = 0; i14 < fVar.f42231i.size(); i14++) {
                                                    if (fVar.f42231i.get(i14).getVideoUrlEncode().equals(string6)) {
                                                        fVar.f42231i.remove(i14);
                                                    }
                                                }
                                                b.f42181g.remove(string4);
                                                b.f42181g.put(string4, fVar);
                                            }
                                        } else if (i13 == 201) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(2)) {
                                                p0.c("RewardCampaignsResourceManager", "Is TPL but download endcard fail but hit ignoreCheckRule");
                                                break;
                                            } else {
                                                for (int i15 = 0; i15 < fVar.f42231i.size(); i15++) {
                                                    CampaignEx campaignEx3 = fVar.f42231i.get(i15);
                                                    if (campaignEx3.getRewardTemplateMode() != null && campaignEx3.getRewardTemplateMode().c().equals(string6)) {
                                                        fVar.f42231i.remove(i15);
                                                    }
                                                    if (!TextUtils.isEmpty(campaignEx3.getendcard_url()) && campaignEx3.getendcard_url().equals(string6)) {
                                                        fVar.f42231i.remove(i15);
                                                    }
                                                }
                                                b.f42181g.remove(string4);
                                                b.f42181g.put(string4, fVar);
                                            }
                                        } else if (i13 == 203) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(1)) {
                                                p0.c("RewardCampaignsResourceManager", gjnZrsdA.QooNHga);
                                                break;
                                            } else {
                                                for (int i16 = 0; i16 < fVar.f42231i.size(); i16++) {
                                                    CampaignEx campaignEx4 = fVar.f42231i.get(i16);
                                                    if (campaignEx4.getRewardTemplateMode() != null && campaignEx4.getRewardTemplateMode().e().equals(string6)) {
                                                        fVar.f42231i.remove(i16);
                                                    }
                                                }
                                                b.f42181g.remove(string4);
                                                b.f42181g.put(string4, fVar);
                                            }
                                        } else if (i13 == 205) {
                                            if (campaignEx != null && campaignEx.getRsIgnoreCheckRule() != null && campaignEx.getRsIgnoreCheckRule().size() > 0 && campaignEx.getRsIgnoreCheckRule().contains(3)) {
                                                p0.c("RewardCampaignsResourceManager", "Is TPL but download BTL Template fail but hit ignoreCheckRule");
                                                break;
                                            } else {
                                                fVar.f42231i.clear();
                                                b.f42181g.remove(string4);
                                                b.f42181g.put(string4, fVar);
                                            }
                                        }
                                        if (com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f42227e, fVar.f42224b, fVar.f42226d, fVar.f42223a, fVar.f42225c, copyOnWriteArrayList)) {
                                            hVar.a(string, string2, string3, fVar.f42230h);
                                            this.f42304b.remove(string4);
                                            b.f42181g.remove(string4);
                                            this.f42305c.remove(string4);
                                            break;
                                        } else if (fVar.f42231i.size() == 0) {
                                            hVar.a(fVar.f42230h, b.b(iC, new MBridgeIds(string, string2, string3), str, null, null));
                                            this.f42304b.remove(string4);
                                            b.f42181g.remove(string4);
                                            this.f42305c.remove(string4);
                                            break;
                                        }
                                    }
                                } catch (Exception e10) {
                                    hVar.a(fVar.f42230h, b.b(iC, new MBridgeIds(string, string2, string3), str, e10, null));
                                    return;
                                }
                            }
                            break;
                    }
                    return;
            }
            if (fVar == null || hVar == null) {
                return;
            }
            try {
                zA = com.mbridge.msdk.videocommon.download.b.getInstance().a(94, fVar.f42227e, fVar.f42224b, fVar.f42226d, fVar.f42223a, fVar.f42225c, copyOnWriteArrayList);
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
                zA = false;
            }
            if (zA) {
                hVar.a(string, string2, string3, fVar.f42230h);
                this.f42304b.remove(string4);
                b.f42181g.remove(string4);
                this.f42305c.remove(string4);
            }
        }

        public void a(String str, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
            this.f42305c.put(str, copyOnWriteArrayList);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface n {
        void a(String str, String str2, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface o {
        void a(String str, String str2, String str3, a.C0355a c0355a, com.mbridge.msdk.foundation.error.b bVar);

        void a(String str, String str2, String str3, String str4, String str5, a.C0355a c0355a);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class r {

        /* renamed from: a, reason: collision with root package name */
        private static final b f42349a = new b(null);
    }

    public /* synthetic */ b(a aVar) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int c(int i10) {
        if (i10 == 200) {
            return 880004;
        }
        if (i10 == 201) {
            return 880007;
        }
        if (i10 != 203) {
            return i10 != 205 ? 880024 : 880005;
        }
        return 880006;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public static synchronized String d(int i10) {
        return i10 != 200 ? i10 != 201 ? i10 != 203 ? i10 != 205 ? "unknown" : "tpl" : C3227g4.D : "zip/html" : "video";
    }

    private b() {
        this.f42184c = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
        this.f42185d = "down_type";
        this.f42186e = "h3c";
        this.f42187f = new ArrayList(6);
        HandlerThread handlerThread = new HandlerThread("mb-reward-load-thread");
        f42181g = new ConcurrentHashMap<>();
        handlerThread.start();
        this.f42182a = new m(handlerThread.getLooper());
    }

    public void c() {
    }

    public static b b() {
        return r.f42349a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(com.mbridge.msdk.foundation.entity.n nVar, CampaignEx campaignEx) {
        try {
            com.mbridge.msdk.videocommon.setting.c cVarC = com.mbridge.msdk.videocommon.setting.b.b().c(com.mbridge.msdk.foundation.controller.c.m().b(), campaignEx.getCampaignUnitId());
            if (cVarC != null) {
                nVar.s(cVarC.x());
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            if (aVarC != null) {
                nVar.r(aVarC.f());
            }
        } catch (Exception e10) {
            p0.b("RewardCampaignsResourceManager", e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.mbridge.msdk.foundation.error.b b(int i10, MBridgeIds mBridgeIds, String str, Throwable th2, CampaignEx campaignEx) {
        com.mbridge.msdk.foundation.error.b bVar = new com.mbridge.msdk.foundation.error.b(i10);
        bVar.a(mBridgeIds);
        bVar.a(th2);
        bVar.c(str);
        bVar.a(campaignEx);
        return bVar;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class k implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private Handler f42276a;

        /* renamed from: b, reason: collision with root package name */
        private final String f42277b;

        /* renamed from: c, reason: collision with root package name */
        private final String f42278c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42279d;

        /* renamed from: e, reason: collision with root package name */
        private final String f42280e;

        public k(Handler handler, String str, String str2, String str3, String str4) {
            this.f42276a = handler;
            this.f42278c = str;
            this.f42277b = str2;
            this.f42279d = str3;
            this.f42280e = str4;
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str, true);
            Message messageObtain = Message.obtain();
            messageObtain.what = 100;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42277b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42278c);
            bundle.putString("request_id", this.f42279d);
            bundle.putString(C3191e4.h.W, this.f42280e);
            bundle.putString("url", str);
            messageObtain.setData(bundle);
            this.f42276a.sendMessage(messageObtain);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
            ResDownloadCheckManager.getInstance().setVideoDownloadDone(str2, false);
            Message messageObtain = Message.obtain();
            messageObtain.what = 200;
            Bundle bundle = new Bundle();
            bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, this.f42277b);
            bundle.putString(MBridgeConstans.PLACEMENT_ID, this.f42278c);
            bundle.putString("request_id", this.f42279d);
            bundle.putString("url", str2);
            bundle.putString(C3191e4.h.W, this.f42280e);
            bundle.putString(PglCryptUtils.KEY_MESSAGE, str);
            messageObtain.setData(bundle);
            this.f42276a.sendMessage(messageObtain);
        }
    }

    public synchronized void a(Context context, boolean z10, int i10, boolean z11, int i11, String str, String str2, String str3, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, h hVar, n nVar) {
        CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList2 = new CopyOnWriteArrayList<>(copyOnWriteArrayList);
        String str4 = str2 + "_" + str3 + "_" + copyOnWriteArrayList2.get(0).getSecondRequestIndex();
        f42181g.put(str4, new f(z10, z11, i10, copyOnWriteArrayList2.size(), str2, str3, i11, copyOnWriteArrayList2));
        this.f42182a.a(str4, hVar);
        this.f42182a.a(context);
        this.f42182a.a(str4, copyOnWriteArrayList2);
        this.f42182a.post(new a(copyOnWriteArrayList2, context, str2, i11, str, str3, str4, nVar));
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.reward.adapter.b$b, reason: collision with other inner class name */
    public class C0303b implements y.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f42197a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42198b;

        public C0303b(int i10, CampaignEx campaignEx) {
            this.f42197a = i10;
            this.f42198b = campaignEx;
        }

        @Override // com.mbridge.msdk.foundation.tools.y.c
        public void a(String str, String str2, String str3, String str4, boolean z10) {
            if (z10) {
                return;
            }
            try {
                com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
                int i10 = this.f42197a;
                if (i10 == 0) {
                    nVar.e(1);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 1) {
                    nVar.e(2);
                    nVar.d(1);
                    nVar.j("m_download_end");
                } else if (i10 == 2) {
                    nVar.e(3);
                    nVar.d(1);
                    nVar.j("m_download_end");
                    nVar.b(this.f42198b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                    nVar.f("1");
                }
                nVar.o(this.f42198b.getRequestIdNotice());
                nVar.b("url", str);
                nVar.b("scenes", "1");
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f42198b);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardCampaignsResourceManager", e10.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.tools.y.c
        public void a(String str, DownloadError downloadError) {
            String message = "";
            if (downloadError != null) {
                try {
                    if (downloadError.getException() != null) {
                        message = downloadError.getException().getMessage();
                    }
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        e10.printStackTrace();
                        return;
                    }
                    return;
                }
            }
            com.mbridge.msdk.foundation.entity.n nVar = new com.mbridge.msdk.foundation.entity.n();
            int i10 = this.f42197a;
            if (i10 == 0) {
                nVar.e(1);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 1) {
                nVar.e(2);
                nVar.d(3);
                nVar.j("m_download_end");
            } else if (i10 == 2) {
                nVar.e(3);
                nVar.d(3);
                nVar.j("m_download_end");
                nVar.b(this.f42198b.isMraid() ? com.mbridge.msdk.foundation.entity.n.N : com.mbridge.msdk.foundation.entity.n.O);
                nVar.f("1");
            }
            b.b(nVar, this.f42198b);
            nVar.o(this.f42198b.getRequestIdNotice());
            nVar.m(message);
            nVar.b("scenes", "1");
            nVar.b("url", str);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a(nVar, this.f42198b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, CampaignEx campaignEx, String str, String str2) {
        y.a(i10, str, str2, new C0303b(i10, campaignEx), campaignEx);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, String str, String str2, String str3, CampaignEx campaignEx, String str4, n nVar, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        if (TextUtils.isEmpty(str4) || campaignEx.isMraid()) {
            return;
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = a(campaignEx, 3);
        if (str4.contains(".zip") && str4.contains(ResourceManager.KEY_MD5FILENAME)) {
            boolean zIsEmpty = TextUtils.isEmpty(H5DownLoadManager.getInstance().getH5ResAddress(str4));
            try {
                l lVar = new l(context, str, str2, str3, campaignEx, 497, this.f42182a, nVar, copyOnWriteArrayList);
                lVar.a(zIsEmpty);
                H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, lVar);
                return;
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                    return;
                }
                return;
            }
        }
        boolean zIsEmpty2 = TextUtils.isEmpty(HTMLResourceManager.getInstance().getHtmlContentFromUrl(str4));
        try {
            i iVar = new i(497, str, str2, str3, campaignEx, nVar, this.f42182a, copyOnWriteArrayList);
            iVar.a(zIsEmpty2);
            H5DownLoadManager.getInstance().downloadH5Res(cVarA, str4, iVar);
        } catch (Exception e11) {
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class q extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        private String f42338a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f42339b;

        /* renamed from: c, reason: collision with root package name */
        private final WindVaneWebView f42340c;

        /* renamed from: d, reason: collision with root package name */
        private final String f42341d;

        /* renamed from: e, reason: collision with root package name */
        private final String f42342e;

        /* renamed from: f, reason: collision with root package name */
        private final a.C0355a f42343f;

        /* renamed from: g, reason: collision with root package name */
        private final CampaignEx f42344g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f42345h;

        /* renamed from: i, reason: collision with root package name */
        private String f42346i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f42347j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f42348k;

        public q(String str, boolean z10, WindVaneWebView windVaneWebView, String str2, String str3, a.C0355a c0355a, CampaignEx campaignEx, boolean z11, String str4) {
            this.f42339b = z10;
            this.f42340c = windVaneWebView;
            this.f42341d = str2;
            this.f42342e = str3;
            this.f42343f = c0355a;
            this.f42344g = campaignEx;
            this.f42338a = str;
            this.f42345h = z11;
            this.f42346i = str4;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) throws JSONException {
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f42344g, eVar);
            } catch (Throwable th2) {
                p0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f42348k) {
                return;
            }
            if (this.f42340c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f42338a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject2.put("error", "");
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f42340c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
            String str = this.f42342e + "_" + this.f42344g.getId() + "_" + this.f42344g.getRequestId() + "_" + this.f42341d;
            if (i10 == 1) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42342e + "_" + this.f42346i + "_" + this.f42341d, true);
                a.C0355a c0355a = this.f42343f;
                if (c0355a != null) {
                    c0355a.a(true);
                }
                if (this.f42339b) {
                    if (this.f42344g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(str, this.f42343f, false, this.f42345h);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str, this.f42343f, false, this.f42345h);
                    }
                } else if (this.f42344g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(str, this.f42343f, false, this.f42345h);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str, this.f42343f, false, this.f42345h);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42342e + "_" + this.f42346i + "_" + this.f42341d, false);
                a.C0355a c0355a2 = this.f42343f;
                if (c0355a2 != null) {
                    c0355a2.a(false);
                }
            }
            this.f42348k = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) throws JSONException {
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42342e + "_" + this.f42346i + "_" + this.f42341d, false);
            a.C0355a c0355a = this.f42343f;
            if (c0355a != null) {
                c0355a.a(false);
            }
            if (this.f42340c != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", this.f42338a);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", 2);
                    jSONObject2.put("error", str);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f42340c, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("WindVaneWebView", e10.getLocalizedMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) throws JSONException {
            if (this.f42347j) {
                return;
            }
            if (!str.contains("wfr=1")) {
                if (this.f42340c != null) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", this.f42338a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) this.f42340c, "componentReact", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            p0.b("WindVaneWebView", e10.getLocalizedMessage());
                        }
                    }
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42342e + "_" + this.f42346i + "_" + this.f42341d, true);
                a.C0355a c0355a = this.f42343f;
                if (c0355a != null) {
                    c0355a.a(true);
                }
                String str2 = this.f42342e + "_" + this.f42344g.getId() + "_" + this.f42344g.getRequestId() + "_" + this.f42341d;
                if (this.f42339b) {
                    if (this.f42344g.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42344g.getRequestIdNotice(), this.f42343f);
                    } else {
                        com.mbridge.msdk.videocommon.a.a(str2, this.f42343f, false, this.f42345h);
                    }
                } else if (this.f42344g.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f42344g.getRequestIdNotice(), this.f42343f);
                } else {
                    com.mbridge.msdk.videocommon.a.a(str2, this.f42343f, false, this.f42345h);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f42347j = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g extends com.mbridge.msdk.mbsignalcommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        private final Handler f42232a;

        /* renamed from: b, reason: collision with root package name */
        private final Runnable f42233b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f42234c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f42235d;

        /* renamed from: e, reason: collision with root package name */
        private int f42236e;

        /* renamed from: f, reason: collision with root package name */
        private String f42237f;

        /* renamed from: g, reason: collision with root package name */
        private String f42238g;

        /* renamed from: h, reason: collision with root package name */
        private String f42239h;

        /* renamed from: i, reason: collision with root package name */
        private String f42240i;

        /* renamed from: j, reason: collision with root package name */
        private a.C0355a f42241j;

        /* renamed from: k, reason: collision with root package name */
        private CampaignEx f42242k;

        /* renamed from: l, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f42243l;

        /* renamed from: m, reason: collision with root package name */
        private com.mbridge.msdk.videocommon.setting.c f42244m;

        /* renamed from: n, reason: collision with root package name */
        private final o f42245n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f42246o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f42247p;

        /* renamed from: q, reason: collision with root package name */
        private boolean f42248q;

        /* renamed from: r, reason: collision with root package name */
        private int f42249r = 0;

        /* renamed from: s, reason: collision with root package name */
        private boolean f42250s;

        /* renamed from: t, reason: collision with root package name */
        private long f42251t;

        public g(boolean z10, Handler handler, Runnable runnable, boolean z11, boolean z12, int i10, String str, String str2, String str3, String str4, a.C0355a c0355a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13, long j10) {
            this.f42232a = handler;
            this.f42233b = runnable;
            this.f42234c = z11;
            this.f42235d = z12;
            this.f42236e = i10;
            this.f42237f = str;
            this.f42239h = str2;
            this.f42238g = str3;
            this.f42240i = str4;
            this.f42241j = c0355a;
            this.f42242k = campaignEx;
            this.f42243l = copyOnWriteArrayList;
            this.f42244m = cVar;
            this.f42245n = oVar;
            this.f42246o = z13;
            this.f42250s = z10;
            this.f42251t = j10;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Runnable runnable;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f42242k, eVar);
            } catch (Throwable th2) {
                p0.b("RVWindVaneWebView", th2.getMessage());
            }
            if (this.f42248q) {
                return;
            }
            String str = this.f42238g + "_" + this.f42237f;
            if (i10 == 1) {
                if (this.f42246o) {
                    com.mbridge.msdk.videocommon.a.d(this.f42238g + "_" + this.f42240i);
                } else {
                    com.mbridge.msdk.videocommon.a.c(this.f42238g + "_" + this.f42240i);
                }
                com.mbridge.msdk.videocommon.a.a(this.f42238g + "_" + this.f42240i + "_" + this.f42237f, this.f42241j, true, this.f42246o);
                Handler handler = this.f42232a;
                if (handler != null && (runnable = this.f42233b) != null) {
                    handler.removeCallbacks(runnable);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42238g + "_" + this.f42240i + "_" + this.f42237f, true);
                a.C0355a c0355a = this.f42241j;
                if (c0355a != null) {
                    c0355a.a(true);
                }
                o oVar = this.f42245n;
                if (oVar != null) {
                    oVar.a(str, this.f42239h, this.f42238g, this.f42240i, this.f42237f, this.f42241j);
                }
            } else {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42238g + "_" + this.f42240i + "_" + this.f42237f, false);
                a.C0355a c0355a2 = this.f42241j;
                if (c0355a2 != null) {
                    c0355a2.a(false);
                }
                if (this.f42245n != null) {
                    this.f42245n.a(str, this.f42240i, this.f42237f, this.f42241j, b.b(880008, new MBridgeIds(this.f42239h, this.f42238g, this.f42240i), a.b.e(i10, "readyState:"), null, this.f42242k));
                }
            }
            this.f42248q = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(WebView webView, String str, String str2, int i10, int i11) {
            boolean z10 = true;
            if (i10 == 1) {
                try {
                    com.mbridge.msdk.reward.controller.a aVar = new com.mbridge.msdk.reward.controller.a();
                    aVar.e(false);
                    if (i11 != 2) {
                        z10 = false;
                    }
                    aVar.d(z10);
                    aVar.c(str, str2);
                    aVar.a(new com.mbridge.msdk.video.bt.module.orglistener.a(null));
                    aVar.a(false, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(0, i11, str2, true, 1));
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("RVWindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a
        public void a(Object obj, String str) {
            if (obj != null) {
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    String strOptString = new JSONObject(str).optString("id");
                    com.mbridge.msdk.video.bt.component.d.c().b(obj, strOptString);
                    String strF = com.mbridge.msdk.video.bt.component.d.c().f(strOptString);
                    CampaignEx campaignExC = com.mbridge.msdk.video.bt.component.d.c().c(strOptString);
                    com.mbridge.msdk.videocommon.setting.c cVarD = com.mbridge.msdk.video.bt.component.d.c().d(strOptString);
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    copyOnWriteArrayList.add(campaignExC);
                    WindVaneWebView windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b;
                    if (windVaneWebView != null) {
                        b.b().a(this.f42250s, windVaneWebView, campaignExC, (CopyOnWriteArrayList<CampaignEx>) copyOnWriteArrayList, cVarD, strF, strOptString, this.f42249r == 0 ? 3 : 6);
                        this.f42249r++;
                    }
                } catch (Throwable th2) {
                    p0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            Runnable runnable;
            super.a(webView, str);
            if (this.f42247p) {
                return;
            }
            String str2 = this.f42238g + "_" + this.f42237f;
            if (!str.contains("wfr=1")) {
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42238g + "_" + this.f42240i + "_" + this.f42237f, true);
                Handler handler = this.f42232a;
                if (handler != null && (runnable = this.f42233b) != null) {
                    handler.removeCallbacks(runnable);
                }
                a.C0355a c0355a = this.f42241j;
                if (c0355a != null) {
                    c0355a.a(true);
                }
                o oVar = this.f42245n;
                if (oVar != null) {
                    oVar.a(str2, this.f42239h, this.f42238g, this.f42240i, this.f42237f, this.f42241j);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f42247p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42238g + "_" + this.f42240i + "_" + this.f42237f, false);
            if (this.f42245n != null) {
                String str3 = this.f42238g + "_" + this.f42237f;
                a.C0355a c0355a = this.f42241j;
                if (c0355a != null) {
                    c0355a.a(false);
                }
                this.f42245n.a(str3, this.f42240i, this.f42237f, this.f42241j, b.b(880008, new MBridgeIds(this.f42239h, this.f42238g, this.f42240i), "onReceivedError： " + i10 + "  " + str, null, this.f42242k));
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.a, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView) {
            if (webView != null) {
                try {
                    com.mbridge.msdk.video.bt.component.d.c().c(this.f42238g, this.f42240i);
                } catch (Throwable th2) {
                    p0.b("RVWindVaneWebView", th2.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class p extends com.mbridge.msdk.mbsignalcommon.listener.b {

        /* renamed from: a, reason: collision with root package name */
        private Handler f42306a;

        /* renamed from: b, reason: collision with root package name */
        private Runnable f42307b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f42308c;

        /* renamed from: d, reason: collision with root package name */
        private final boolean f42309d;

        /* renamed from: e, reason: collision with root package name */
        private String f42310e;

        /* renamed from: f, reason: collision with root package name */
        private final o f42311f;

        /* renamed from: g, reason: collision with root package name */
        private final WindVaneWebView f42312g;

        /* renamed from: h, reason: collision with root package name */
        private final String f42313h;

        /* renamed from: i, reason: collision with root package name */
        private final String f42314i;

        /* renamed from: j, reason: collision with root package name */
        private final String f42315j;

        /* renamed from: k, reason: collision with root package name */
        private final a.C0355a f42316k;

        /* renamed from: l, reason: collision with root package name */
        private final CampaignEx f42317l;

        /* renamed from: m, reason: collision with root package name */
        private CopyOnWriteArrayList<CampaignEx> f42318m;

        /* renamed from: n, reason: collision with root package name */
        private long f42319n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f42320o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f42321p;

        /* renamed from: q, reason: collision with root package name */
        private final Runnable f42322q;

        /* renamed from: r, reason: collision with root package name */
        private final Runnable f42323r;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f42324a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.C0355a f42325b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42326c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f42327d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f42328e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f42329f;

            public a(o oVar, a.C0355a c0355a, String str, String str2, String str3, String str4) {
                this.f42324a = oVar;
                this.f42325b = c0355a;
                this.f42326c = str;
                this.f42327d = str2;
                this.f42328e = str3;
                this.f42329f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                a.C0355a c0355a;
                if (this.f42324a != null && (c0355a = this.f42325b) != null) {
                    c0355a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42326c + "_" + this.f42327d + "_" + this.f42328e, true);
                    o oVar = this.f42324a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f42326c);
                    sb2.append("_");
                    sb2.append(this.f42328e);
                    oVar.a(sb2.toString(), this.f42329f, this.f42326c, this.f42327d, this.f42328e, this.f42325b);
                }
                a.C0355a c0355a2 = this.f42325b;
                if (c0355a2 == null || (windVaneWebViewB = c0355a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.mbridge.msdk.reward.adapter.b$p$b, reason: collision with other inner class name */
        public class RunnableC0305b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ o f42331a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ a.C0355a f42332b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f42333c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ String f42334d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f42335e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f42336f;

            public RunnableC0305b(o oVar, a.C0355a c0355a, String str, String str2, String str3, String str4) {
                this.f42331a = oVar;
                this.f42332b = c0355a;
                this.f42333c = str;
                this.f42334d = str2;
                this.f42335e = str3;
                this.f42336f = str4;
            }

            @Override // java.lang.Runnable
            public void run() {
                WindVaneWebView windVaneWebViewB;
                a.C0355a c0355a;
                if (this.f42331a != null && (c0355a = this.f42332b) != null) {
                    c0355a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42333c + "_" + this.f42334d + "_" + this.f42335e, true);
                    o oVar = this.f42331a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(this.f42333c);
                    sb2.append("_");
                    sb2.append(this.f42335e);
                    oVar.a(sb2.toString(), this.f42336f, this.f42333c, this.f42334d, this.f42335e, this.f42332b);
                }
                a.C0355a c0355a2 = this.f42332b;
                if (c0355a2 == null || (windVaneWebViewB = c0355a2.b()) == null) {
                    return;
                }
                try {
                    windVaneWebViewB.release();
                } catch (Exception e10) {
                    if (MBridgeConstans.DEBUG) {
                        p0.b("WindVaneWebView", e10.getMessage());
                    }
                }
            }
        }

        public p(Handler handler, Runnable runnable, boolean z10, boolean z11, String str, o oVar, WindVaneWebView windVaneWebView, String str2, String str3, String str4, a.C0355a c0355a, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, long j10) {
            this.f42306a = handler;
            this.f42307b = runnable;
            this.f42308c = z10;
            this.f42309d = z11;
            this.f42310e = str;
            this.f42311f = oVar;
            this.f42312g = windVaneWebView;
            this.f42313h = str2;
            this.f42314i = str4;
            this.f42315j = str3;
            this.f42316k = c0355a;
            this.f42317l = campaignEx;
            this.f42318m = copyOnWriteArrayList;
            this.f42319n = j10;
            a aVar = new a(oVar, c0355a, str4, str, str2, str3);
            this.f42323r = aVar;
            this.f42322q = new RunnableC0305b(oVar, c0355a, str4, str, str2, str3);
            if (handler != null) {
                handler.postDelayed(aVar, 5000L);
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10) {
            Handler handler;
            Runnable runnable;
            Runnable runnable2;
            super.a(webView, i10);
            Handler handler2 = this.f42306a;
            if (handler2 != null && (runnable2 = this.f42322q) != null) {
                handler2.removeCallbacks(runnable2);
            }
            Handler handler3 = this.f42306a;
            if (handler3 != null && (runnable = this.f42323r) != null) {
                handler3.removeCallbacks(runnable);
            }
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                eVar.a("result", Integer.valueOf(i10));
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000155", this.f42317l, eVar);
            } catch (Throwable th2) {
                p0.b("WindVaneWebView", th2.getMessage());
            }
            if (this.f42321p) {
                return;
            }
            String str = this.f42314i + "_" + this.f42313h;
            if (i10 == 1) {
                Runnable runnable3 = this.f42307b;
                if (runnable3 != null && (handler = this.f42306a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42314i + "_" + this.f42310e + "_" + this.f42313h, true);
                a.C0355a c0355a = this.f42316k;
                if (c0355a != null) {
                    c0355a.a(true);
                }
                if (this.f42308c) {
                    if (this.f42309d) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42317l.getRequestIdNotice(), this.f42316k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42317l.getRequestIdNotice(), this.f42316k);
                    }
                } else if (this.f42309d) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f42317l.getRequestIdNotice(), this.f42316k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f42317l.getRequestIdNotice(), this.f42316k);
                }
                o oVar = this.f42311f;
                if (oVar != null) {
                    oVar.a(str, this.f42315j, this.f42314i, this.f42310e, this.f42313h, this.f42316k);
                }
            } else if (this.f42311f != null) {
                this.f42311f.a(str, this.f42310e, this.f42313h, this.f42316k, b.b(880009, new MBridgeIds(this.f42315j, this.f42314i, this.f42310e), a.b.e(i10, "readyState:"), null, this.f42317l));
            }
            this.f42321p = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42314i + "_" + this.f42310e + "_" + this.f42313h, false);
            Handler handler = this.f42306a;
            if (handler != null) {
                if (this.f42322q != null) {
                    handler.removeCallbacks(this.f42323r);
                }
                Runnable runnable = this.f42322q;
                if (runnable != null) {
                    this.f42306a.removeCallbacks(runnable);
                }
            }
            try {
                String str3 = this.f42314i + "_" + this.f42313h;
                a.C0355a c0355a = this.f42316k;
                if (c0355a != null) {
                    c0355a.a(false);
                }
                if (this.f42311f != null) {
                    this.f42311f.a(str3, this.f42310e, str2, this.f42316k, b.b(880009, new MBridgeIds(this.f42315j, this.f42314i, this.f42310e), i10 + "#" + str, null, this.f42317l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            super.a(webView, sslErrorHandler, sslError);
            ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42314i + "_" + this.f42310e + "_" + this.f42313h, false);
            Handler handler = this.f42306a;
            if (handler != null) {
                if (this.f42322q != null) {
                    handler.removeCallbacks(this.f42323r);
                }
                Runnable runnable = this.f42322q;
                if (runnable != null) {
                    this.f42306a.removeCallbacks(runnable);
                }
            }
            try {
                String str = this.f42314i + "_" + this.f42313h;
                a.C0355a c0355a = this.f42316k;
                if (c0355a != null) {
                    c0355a.a(false);
                }
                if (this.f42311f != null) {
                    MBridgeIds mBridgeIds = new MBridgeIds(this.f42315j, this.f42314i, this.f42310e);
                    StringBuilder sb2 = new StringBuilder("onReceivedSslError:");
                    sb2.append(sslError == null ? "" : Integer.valueOf(sslError.getPrimaryError()));
                    this.f42311f.a(str, this.f42310e, this.f42313h, this.f42316k, b.b(880009, mBridgeIds, sb2.toString(), null, this.f42317l));
                }
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("WindVaneWebView", e10.getLocalizedMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            Runnable runnable;
            Handler handler;
            Runnable runnable2;
            super.a(webView, str);
            Handler handler2 = this.f42306a;
            if (handler2 != null && (runnable2 = this.f42323r) != null) {
                handler2.removeCallbacks(runnable2);
            }
            if (this.f42320o) {
                return;
            }
            if (!str.contains("wfr=1")) {
                String str2 = this.f42314i + "_" + this.f42313h;
                ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(this.f42314i + "_" + this.f42310e + "_" + this.f42313h, true);
                Runnable runnable3 = this.f42307b;
                if (runnable3 != null && (handler = this.f42306a) != null) {
                    handler.removeCallbacks(runnable3);
                }
                a.C0355a c0355a = this.f42316k;
                if (c0355a != null) {
                    c0355a.a(true);
                }
                if (this.f42308c) {
                    if (this.f42317l.isBidCampaign()) {
                        com.mbridge.msdk.videocommon.a.a(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42317l.getRequestIdNotice(), this.f42316k);
                    } else {
                        com.mbridge.msdk.videocommon.a.b(MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.f42317l.getRequestIdNotice(), this.f42316k);
                    }
                } else if (this.f42317l.isBidCampaign()) {
                    com.mbridge.msdk.videocommon.a.a(94, this.f42317l.getRequestIdNotice(), this.f42316k);
                } else {
                    com.mbridge.msdk.videocommon.a.b(94, this.f42317l.getRequestIdNotice(), this.f42316k);
                }
                o oVar = this.f42311f;
                if (oVar != null) {
                    oVar.a(str2, this.f42315j, this.f42314i, this.f42310e, this.f42313h, this.f42316k);
                }
            } else {
                Handler handler3 = this.f42306a;
                if (handler3 != null && (runnable = this.f42322q) != null) {
                    handler3.postDelayed(runnable, 5000L);
                }
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(webView);
            this.f42320o = true;
        }
    }

    public synchronized void a(Context context, CampaignEx campaignEx, String str, String str2, String str3, n nVar) {
        try {
            this.f42182a.a(context);
            if (campaignEx != null) {
                String cMPTEntryUrl = campaignEx.getCMPTEntryUrl();
                if (campaignEx.isDynamicView()) {
                    if (u0.a(MBridgeConstans.DYNAMIC_VIEW_KEY_DY_VIEW, cMPTEntryUrl)) {
                        a(0, campaignEx, campaignEx.getMof_tplid() + "", cMPTEntryUrl);
                    }
                    ResDownloadCheckManager.getInstance().setZipDownloadDone(cMPTEntryUrl, true);
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 105;
                    Bundle bundle = new Bundle();
                    bundle.putString(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
                    bundle.putString(MBridgeConstans.PLACEMENT_ID, str);
                    bundle.putString("request_id", str3);
                    bundle.putString(C3191e4.h.W, str2 + "_" + str3 + "_" + campaignEx.getSecondRequestIndex());
                    bundle.putString("url", cMPTEntryUrl);
                    messageObtain.setData(bundle);
                    this.f42182a.sendMessage(messageObtain);
                    if (nVar != null) {
                        nVar.a(str, str2, str3, cMPTEntryUrl);
                    }
                    return;
                }
            }
            if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getCMPTEntryUrl())) {
                try {
                    com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid());
                    if (cVarB == null) {
                        cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
                    }
                    com.mbridge.msdk.foundation.same.report.metrics.c cVar = cVarB;
                    cVar.a(campaignEx);
                    cVar.e(1);
                    cVar.f(a(campaignEx));
                    H5DownLoadManager.getInstance().downloadH5Res(cVar, campaignEx.getCMPTEntryUrl(), new c(str2, str, str3, campaignEx, nVar, context));
                } catch (Exception e10) {
                    p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, int i10, CampaignEx campaignEx, String str, String str2, String str3, String str4) {
        com.mbridge.msdk.foundation.same.threadpool.a.e().execute(new d(campaignEx, context, i10, str, str2, str3, str4));
    }

    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, String str4, String str5, String str6, com.mbridge.msdk.videocommon.setting.c cVar, o oVar) {
        String str7;
        String str8;
        a.C0355a c0355a;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str9 = str4;
        synchronized (this) {
            String str10 = str9 + "_" + str;
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
            } catch (Exception e10) {
                e = e10;
                str7 = str5;
                str8 = str10;
            }
            if (u0.i(str)) {
                if (oVar != null) {
                    try {
                        oVar.a(str10, str3, str9, str5, str, null);
                    } catch (Exception e11) {
                        e = e11;
                        str8 = str10;
                    }
                }
                return;
            }
            str8 = str10;
            try {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 2);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                c0355a = new a.C0355a();
            } catch (Exception e12) {
                e = e12;
            }
            try {
                try {
                    WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.m().d());
                    if (campaignEx != null) {
                        windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
                    }
                    windVaneWebView2.setTempTypeForMetrics(2);
                    try {
                        c0355a.a(windVaneWebView2);
                        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                            kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                        } else {
                            kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                        }
                        com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                        kVar2.g(i10);
                        kVar2.setUnitId(str9);
                        kVar2.setRewardUnitSetting(cVar);
                        kVar2.d(z10);
                        str7 = str5;
                        try {
                            windVaneWebView2.setWebViewListener(new p(handler, null, z11, z12, str7, oVar, windVaneWebView, str, str3, str9, c0355a, campaignEx, copyOnWriteArrayList, jCurrentTimeMillis));
                            windVaneWebView2.setObject(kVar2);
                            windVaneWebView2.loadUrl(str2);
                            windVaneWebView2.setRid(str7);
                        } catch (Exception e13) {
                            e = e13;
                            str9 = str9;
                        }
                    } catch (Exception e14) {
                        e = e14;
                    }
                } catch (Exception e15) {
                    e = e15;
                }
            } catch (Exception unused) {
                if (oVar != null) {
                    c0355a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str9);
                    sb2.append("_");
                    sb2.append(str);
                    oVar.a(sb2.toString(), str3, str9, str5, str, c0355a);
                    return;
                }
                return;
            } catch (Throwable unused2) {
                if (oVar != null) {
                    c0355a.a(true);
                    ResDownloadCheckManager.getInstance().setTemplatePreLoadDone(str9 + "_" + str5 + "_" + str, true);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str9);
                    sb3.append("_");
                    sb3.append(str);
                    oVar.a(sb3.toString(), str3, str9, str5, str, c0355a);
                    return;
                }
                return;
            }
            str7 = str5;
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
            }
            if (oVar != null) {
                oVar.a(str8, str7, str, null, b(880009, new MBridgeIds(str3, str9, str7), "", e, campaignEx));
            }
        }
    }

    public synchronized void a(boolean z10, Handler handler, boolean z11, boolean z12, String str, String str2, String str3, String str4, String str5, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str6, String str7, com.mbridge.msdk.videocommon.setting.c cVar, o oVar, boolean z13) {
        String str8;
        com.mbridge.msdk.video.signal.impl.k kVar;
        String str9 = str4;
        synchronized (this) {
            this.f42183b = z13;
            long jCurrentTimeMillis = System.currentTimeMillis();
            String str10 = str9 + "_" + str5;
            this.f42183b = z13;
            if (u0.i(str5)) {
                if (oVar != null) {
                    oVar.a(str10, str3, str9, str, str5, null);
                }
                return;
            }
            try {
                p0.a("RewardCampaignsResourceManager", "开始预加载大模板资源");
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", 1);
                com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
                a.C0355a c0355a = new a.C0355a();
                WindVaneWebView windVaneWebView = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.m().d());
                if (campaignEx != null) {
                    windVaneWebView.setLocalRequestId(campaignEx.getCurrentLocalRid());
                }
                windVaneWebView.setTempTypeForMetrics(1);
                c0355a.a(windVaneWebView);
                String strB = com.mbridge.msdk.video.bt.component.d.c().b();
                String strB2 = com.mbridge.msdk.video.bt.component.d.c().b();
                c0355a.a(strB2);
                if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                    CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str9);
                    if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                        for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                            CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                            for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                                if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                    campaignEx2.setReady(true);
                                    copyOnWriteArrayList.set(i11, campaignEx2);
                                }
                            }
                        }
                    }
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                } else {
                    kVar = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                }
                kVar.g(i10);
                kVar.setUnitId(str7);
                kVar.c(strB2);
                kVar.d(strB);
                kVar.c(true);
                kVar.setRewardUnitSetting(cVar);
                kVar.d(z10);
                com.mbridge.msdk.video.signal.impl.k kVar2 = kVar;
                try {
                    str9 = str4;
                    str8 = str;
                    try {
                        windVaneWebView.setWebViewListener(new g(z10, handler, null, z11, z12, i10, str5, str3, str4, str, c0355a, campaignEx, copyOnWriteArrayList, cVar, oVar, z13, jCurrentTimeMillis));
                        windVaneWebView.setObject(kVar2);
                        windVaneWebView.loadUrl(str6);
                        windVaneWebView.setRid(str8);
                        MBridgeBTRootLayout mBridgeBTRootLayout = new MBridgeBTRootLayout(com.mbridge.msdk.foundation.controller.c.m().d());
                        mBridgeBTRootLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTRootLayout.setInstanceId(strB);
                        mBridgeBTRootLayout.setUnitId(str9);
                        MBridgeBTLayout mBridgeBTLayout = new MBridgeBTLayout(com.mbridge.msdk.foundation.controller.c.m().d());
                        mBridgeBTLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        mBridgeBTLayout.setInstanceId(strB2);
                        mBridgeBTLayout.setUnitId(str9);
                        mBridgeBTLayout.setWebView(windVaneWebView);
                        LinkedHashMap<String, View> linkedHashMapB = com.mbridge.msdk.video.bt.component.d.c().b(str9, str8);
                        linkedHashMapB.put(strB2, mBridgeBTLayout);
                        linkedHashMapB.put(strB, mBridgeBTRootLayout);
                        mBridgeBTRootLayout.addView(mBridgeBTLayout, new FrameLayout.LayoutParams(-1, -1));
                    } catch (Exception e10) {
                        e = e10;
                        if (oVar != null) {
                            oVar.a(str10, str8, str5, null, b(880008, new MBridgeIds(str3, str9, str8), "", e, campaignEx));
                        }
                        if (MBridgeConstans.DEBUG) {
                            p0.b("RewardCampaignsResourceManager", e.getLocalizedMessage());
                        }
                    }
                } catch (Exception e11) {
                    e = e11;
                    str9 = str4;
                    str8 = str;
                }
            } catch (Exception e12) {
                e = e12;
                str8 = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, com.mbridge.msdk.videocommon.setting.c cVar, String str, String str2, int i10) throws JSONException {
        if (windVaneWebView != null) {
            if (campaignEx != null && cVar != null && campaignEx.getRewardTemplateMode() != null && !TextUtils.isEmpty(str)) {
                if (TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e())) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("id", str2);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("result", 1);
                        jSONObject2.put("error", "data is null");
                        jSONObject.put("data", jSONObject2);
                        com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                        return;
                    } catch (Exception e10) {
                        if (MBridgeConstans.DEBUG) {
                            p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
                            return;
                        }
                        return;
                    }
                }
                if (!TextUtils.isEmpty(campaignEx.getRewardTemplateMode().e()) && campaignEx.getRewardTemplateMode().e().contains(CampaignEx.KEY_IS_CMPT_ENTRY)) {
                    p0.a("RewardCampaignsResourceManager", "getTeamplateUrl contains cmpt=1");
                    return;
                } else {
                    new Handler(Looper.getMainLooper()).postDelayed(new e(z10, windVaneWebView, campaignEx, copyOnWriteArrayList, str, cVar, str2), i10 * 1000);
                    return;
                }
            }
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", str2);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("result", 2);
                jSONObject4.put("error", "data is null");
                jSONObject3.put("data", jSONObject4);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a((WebView) windVaneWebView, "onSubPlayTemplateViewLoad", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (Exception e11) {
                if (MBridgeConstans.DEBUG) {
                    p0.b("RewardCampaignsResourceManager", e11.getLocalizedMessage());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10, WindVaneWebView windVaneWebView, String str, int i10, CampaignEx campaignEx, CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList, String str2, String str3, com.mbridge.msdk.videocommon.setting.c cVar, String str4, boolean z11) {
        com.mbridge.msdk.video.signal.impl.k kVar;
        String requestId;
        try {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("type", 2);
            com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000154", campaignEx, eVar);
            a.C0355a c0355a = new a.C0355a();
            WindVaneWebView windVaneWebView2 = new WindVaneWebView(com.mbridge.msdk.foundation.controller.c.m().d());
            if (campaignEx != null) {
                windVaneWebView2.setLocalRequestId(campaignEx.getCurrentLocalRid());
            }
            windVaneWebView2.setTempTypeForMetrics(2);
            c0355a.a(windVaneWebView2);
            String requestId2 = "";
            if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
                CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayListB = com.mbridge.msdk.videocommon.download.b.getInstance().b(str3);
                if (copyOnWriteArrayListB != null && copyOnWriteArrayListB.size() > 0) {
                    for (int i11 = 0; i11 < copyOnWriteArrayList.size(); i11++) {
                        CampaignEx campaignEx2 = copyOnWriteArrayList.get(i11);
                        for (CampaignEx campaignEx3 : copyOnWriteArrayListB) {
                            if (campaignEx3.getId().equals(campaignEx2.getId()) && campaignEx3.getRequestId().equals(campaignEx2.getRequestId())) {
                                campaignEx2.setReady(true);
                                copyOnWriteArrayList.set(i11, campaignEx2);
                            }
                        }
                    }
                }
                com.mbridge.msdk.video.signal.impl.k kVar2 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx, copyOnWriteArrayList);
                requestId = copyOnWriteArrayList.get(0).getRequestId();
                kVar = kVar2;
            } else {
                com.mbridge.msdk.video.signal.impl.k kVar3 = new com.mbridge.msdk.video.signal.impl.k(null, campaignEx);
                if (campaignEx != null) {
                    requestId2 = campaignEx.getRequestId();
                }
                kVar = kVar3;
                requestId = requestId2;
            }
            kVar.g(i10);
            kVar.setUnitId(str3);
            kVar.c(str4);
            kVar.setRewardUnitSetting(cVar);
            kVar.d(z10);
            windVaneWebView2.setWebViewListener(new q(str4, false, windVaneWebView, str, str3, c0355a, campaignEx, z11, requestId));
            windVaneWebView2.setObject(kVar);
            windVaneWebView2.loadUrl(str2);
            windVaneWebView2.setRid(requestId);
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                p0.b("RewardCampaignsResourceManager", e10.getLocalizedMessage());
            }
        }
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
            p0.b("RewardCampaignsResourceManager", th2.getMessage());
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.mbridge.msdk.foundation.same.report.metrics.c a(CampaignEx campaignEx, int i10) {
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = campaignEx != null ? com.mbridge.msdk.foundation.same.report.metrics.d.b().b(campaignEx.getCurrentLocalRid()) : null;
        if (cVarB == null) {
            cVarB = new com.mbridge.msdk.foundation.same.report.metrics.c();
        }
        cVarB.a(campaignEx);
        cVarB.f(a(campaignEx));
        cVarB.e(i10);
        return cVarB;
    }
}
