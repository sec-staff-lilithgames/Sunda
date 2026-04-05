package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.manager.e;
import com.mbridge.msdk.splash.manager.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class c {
    private static String D = "SplashProvider";
    private CampaignEx A;
    private MBSplashPopView B;

    /* renamed from: a, reason: collision with root package name */
    private String f42921a;

    /* renamed from: b, reason: collision with root package name */
    private String f42922b;

    /* renamed from: c, reason: collision with root package name */
    private MBridgeIds f42923c;

    /* renamed from: e, reason: collision with root package name */
    private long f42925e;

    /* renamed from: f, reason: collision with root package name */
    private e f42926f;

    /* renamed from: g, reason: collision with root package name */
    private f f42927g;

    /* renamed from: h, reason: collision with root package name */
    private b f42928h;

    /* renamed from: i, reason: collision with root package name */
    private MBSplashShowListener f42929i;

    /* renamed from: j, reason: collision with root package name */
    private d f42930j;

    /* renamed from: k, reason: collision with root package name */
    private MBSplashView f42931k;

    /* renamed from: l, reason: collision with root package name */
    private ViewGroup f42932l;

    /* renamed from: m, reason: collision with root package name */
    private View f42933m;

    /* renamed from: n, reason: collision with root package name */
    private l f42934n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f42935o;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f42936p;

    /* renamed from: q, reason: collision with root package name */
    private j f42937q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f42938r;

    /* renamed from: y, reason: collision with root package name */
    private Activity f42945y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f42946z;

    /* renamed from: d, reason: collision with root package name */
    private int f42924d = 5;

    /* renamed from: s, reason: collision with root package name */
    private int f42939s = 1;

    /* renamed from: t, reason: collision with root package name */
    private int f42940t = l0.n(com.mbridge.msdk.foundation.controller.c.m().d());

    /* renamed from: u, reason: collision with root package name */
    private int f42941u = l0.m(com.mbridge.msdk.foundation.controller.c.m().d());

    /* renamed from: v, reason: collision with root package name */
    private Object f42942v = new Object();

    /* renamed from: w, reason: collision with root package name */
    private Object f42943w = new Object();

    /* renamed from: x, reason: collision with root package name */
    public boolean f42944x = false;
    private boolean C = false;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ CampaignEx f42947a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f42948b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f42949c;

        public a(CampaignEx campaignEx, int i10, boolean z10) {
            this.f42947a = campaignEx;
            this.f42948b = i10;
            this.f42949c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f42947a, this.f42948b - 1, this.f42949c);
        }
    }

    public c(Activity activity, String str, String str2) {
        this.f42922b = TextUtils.isEmpty(str) ? "" : str;
        this.f42921a = str2;
        this.f42923c = new MBridgeIds(str, str2);
        this.f42945y = activity;
        b(activity);
    }

    public void b(boolean z10) {
        this.f42935o = z10;
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        } else if (this.f42928h != null) {
            this.f42928h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
        }
    }

    public int d() {
        return this.f42924d;
    }

    public long e() {
        return this.f42925e;
    }

    public boolean f() {
        return this.f42938r;
    }

    public boolean g() {
        return this.f42935o;
    }

    public void h() {
        f fVar = this.f42927g;
        if (fVar != null) {
            fVar.f();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.f42927g;
        if (fVar != null) {
            fVar.g();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public void j() {
        this.C = true;
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.C = false;
        MBSplashShowListener mBSplashShowListener = this.f42929i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f42922b, this.f42921a));
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f42936p = viewGroup;
    }

    public void b(String str) {
        a(str, 1);
    }

    public void d(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            d(str, viewGroupA);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f42929i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f42923c, "activity is except,please check it");
        }
    }

    public void a(int i10) {
        this.f42939s = i10;
    }

    public void b(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f42928h != null) {
                this.f42928h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        b(str, viewGroupA);
    }

    public void a(long j10) {
        this.f42925e = j10;
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f42928h == null) {
            this.f42928h = new b(this, this.f42923c);
        }
        this.f42928h.a(mBSplashLoadListener);
    }

    public void c(boolean z10) {
        this.f42938r = z10;
    }

    public void d(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.f42929i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f42923c, "token is null or empty");
                return;
            }
            return;
        }
        c(str, viewGroup);
    }

    public String c() {
        if (!this.f42944x) {
            e eVar = this.f42926f;
            if (eVar != null) {
                return eVar.d();
            }
            return "";
        }
        f fVar = this.f42927g;
        if (fVar != null) {
            return fVar.d();
        }
        return "";
    }

    public void a(MBSplashShowListener mBSplashShowListener) {
        this.f42929i = mBSplashShowListener;
    }

    public void b(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.f42928h != null) {
                this.f42928h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
                return;
            }
            return;
        }
        a(str, viewGroup);
    }

    public void a(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f42928h != null) {
                this.f42928h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        a(str, viewGroupA);
    }

    public void d(boolean z10) {
        this.f42946z = z10;
    }

    public void b(int i10) {
        this.f42924d = i10;
    }

    public void c(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            MBSplashShowListener mBSplashShowListener = this.f42929i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f42923c, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, viewGroupA);
    }

    public void a(String str, ViewGroup viewGroup) {
        this.f42932l = viewGroup;
        MBSplashView mBSplashView = this.f42931k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public void b(int i10, int i11) {
        a(i11, i10);
    }

    public String b() {
        if (!this.f42944x) {
            e eVar = this.f42926f;
            if (eVar != null) {
                return eVar.c();
            }
            return "";
        }
        f fVar = this.f42927g;
        if (fVar != null) {
            return fVar.c();
        }
        return "";
    }

    public void c(String str, ViewGroup viewGroup) {
        this.f42932l = viewGroup;
        MBSplashView mBSplashView = this.f42931k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f42931k, this.f42922b, this.f42921a, str, this.f42938r, this.f42924d, true, false);
        if (campaignExA != null) {
            if (this.f42934n == null) {
                this.f42934n = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b(), this.f42921a);
            }
            d dVar = new d(this, this.f42929i, campaignExA);
            this.f42930j = dVar;
            if (this.f42940t != 0 && this.f42941u != 0) {
                int i10 = this.f42924d;
                if (i10 >= 2 && i10 <= 10) {
                    b(campaignExA, this.f42934n.E(), false);
                    return;
                }
                dVar.a(this.f42923c, "countDownTime must in 2 - 10 ,but now is " + this.f42924d);
                return;
            }
            dVar.a(this.f42923c, "width or height is 0  or width or height is too small");
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f42929i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f42923c, "campaignEx is vali");
        }
    }

    public boolean a(String str) {
        return com.mbridge.msdk.splash.manager.d.a(this.f42931k, this.f42922b, this.f42921a, str, this.f42938r, this.f42924d, false, true) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, boolean z10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f42931k, campaignEx)) {
            if (i10 > 0) {
                this.f42927g.f42822y.postDelayed(new a(campaignEx, i10, z10), 1L);
                return;
            }
            d dVar = this.f42930j;
            if (dVar != null) {
                dVar.a(this.f42923c, "campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        ViewGroup.LayoutParams layoutParams = this.f42932l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f42932l.setLayoutParams(layoutParams);
        this.f42932l.removeAllViews();
        this.f42927g.c(this.f42924d);
        this.f42927g.a(this.f42936p);
        this.f42927g.a(this.f42930j);
        p0.b(D, "start show process");
        ViewGroup viewGroup = this.f42932l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            e1.a(this.f42931k);
            this.f42932l.addView(this.f42931k);
        }
        this.f42927g.a(this.f42938r);
        this.f42927g.a(campaignEx, this.f42931k);
    }

    public void b(CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx != null && z10) {
            if (this.f42934n == null) {
                this.f42934n = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b(), this.f42921a);
            }
            this.f42930j = new d(this, this.f42929i, campaignEx);
        }
        ViewGroup viewGroup = this.f42932l;
        if (viewGroup == null) {
            d dVar = this.f42930j;
            if (dVar != null) {
                dVar.a(this.f42923c, "container is null");
                return;
            }
            return;
        }
        if (this.f42927g == null) {
            this.f42927g = new f(viewGroup.getContext(), this.f42922b, this.f42921a);
        }
        this.A = campaignEx;
        a(campaignEx, i10, z10);
    }

    private void b(Activity activity) {
        if (this.f42927g == null) {
            if (activity != null) {
                this.f42927g = new f(activity, this.f42922b, this.f42921a);
            } else {
                this.f42927g = new f(com.mbridge.msdk.foundation.controller.c.m().d(), this.f42922b, this.f42921a);
            }
        }
        if (this.f42931k == null) {
            if (activity != null) {
                this.f42931k = new MBSplashView(activity);
            } else {
                this.f42931k = new MBSplashView(com.mbridge.msdk.foundation.controller.c.m().d());
            }
        }
        if (this.f42937q == null) {
            this.f42937q = new j();
        }
        this.f42937q.a(com.mbridge.msdk.foundation.controller.c.m().d(), com.mbridge.msdk.foundation.controller.c.m().b(), com.mbridge.msdk.foundation.controller.c.m().c(), this.f42921a);
    }

    private void a(String str, int i10) {
        boolean zB;
        synchronized (this.f42942v) {
            try {
                if (this.f42935o) {
                    if (this.f42928h != null) {
                        this.f42928h.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                        this.f42935o = true;
                    }
                    return;
                }
                this.f42935o = true;
                int i11 = this.f42924d;
                if (i11 >= 2 && i11 <= 10) {
                    if (this.f42940t != 0 && this.f42941u != 0) {
                        try {
                            zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.m().d());
                        } catch (Exception unused) {
                            zB = false;
                        }
                        if (!zB) {
                            if (this.f42928h != null) {
                                this.f42928h.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                                return;
                            }
                            return;
                        }
                        this.f42931k.clearResState();
                        this.f42934n = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b(), this.f42921a);
                        if (this.f42926f == null) {
                            this.f42926f = new e(this.f42922b, this.f42921a, this.f42925e * 1000);
                        }
                        b bVar = this.f42928h;
                        if (bVar != null) {
                            bVar.a(str);
                            this.f42926f.a(this.f42928h);
                        }
                        this.f42931k.resetLoadState();
                        this.f42926f.a(this.f42924d);
                        this.f42926f.a(this.f42931k);
                        this.f42926f.a(this.f42934n);
                        this.f42926f.a(this.f42940t, this.f42941u);
                        this.f42926f.a(this.f42938r);
                        this.f42926f.b(this.f42939s);
                        this.f42926f.a(str, i10);
                        return;
                    }
                    if (this.f42928h != null) {
                        this.f42928h.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                        return;
                    }
                    return;
                }
                if (this.f42928h != null) {
                    com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880037);
                    bVar2.c("countDownTime must in 2 - 10");
                    this.f42928h.a(bVar2, i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f42933m = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f42931k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.m().d(), new BaseSplashPopView.i(this.f42922b, this.f42921a, zoomOutTypeEnum.getIndex(), this.A), this.f42930j);
        this.B = mBSplashPopView;
        return mBSplashPopView;
    }

    private void a(int i10, int i11) {
        int iN = l0.n(com.mbridge.msdk.foundation.controller.c.m().d());
        int iM = l0.m(com.mbridge.msdk.foundation.controller.c.m().d());
        int i12 = this.f42939s;
        if (i12 == 1) {
            if (iM >= i11 * 4) {
                this.f42941u = iM - i11;
                this.f42940t = iN;
                return;
            } else {
                this.f42941u = 0;
                this.f42940t = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (iN >= i10 * 4) {
                this.f42940t = iN - i10;
                this.f42941u = iM;
            } else {
                this.f42941u = 0;
                this.f42940t = 0;
            }
        }
    }

    public void a(boolean z10) {
        MBSplashView mBSplashView = this.f42931k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z10);
        }
    }

    private ViewGroup a(Activity activity) {
        Throwable th2;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            p0.d(D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
        } catch (Throwable th3) {
            th2 = th3;
            viewGroup = null;
        }
        try {
            try {
                return (ViewGroup) viewGroup.getChildAt(0);
            } catch (Exception e10) {
                e10.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th4) {
            th2 = th4;
            th2.printStackTrace();
            return viewGroup;
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        try {
            MBSplashView mBSplashView = this.f42931k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i10, i11, i12, i13);
            }
        } catch (Throwable th2) {
            p0.b(D, th2.getMessage());
        }
    }

    public void a() {
        this.A = null;
        if (this.f42929i != null) {
            this.f42929i = null;
        }
        if (this.f42928h != null) {
            this.f42928h = null;
        }
        if (this.f42930j != null) {
            this.f42930j = null;
        }
        e eVar = this.f42926f;
        if (eVar != null) {
            eVar.e();
        }
        f fVar = this.f42927g;
        if (fVar != null) {
            fVar.h();
        }
        if (this.f42945y != null) {
            this.f42945y = null;
        }
    }
}
