package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.shake.MBShakeView;
import com.mbridge.msdk.splash.view.nativeview.MBNoRecycledCrashImageView;
import com.mbridge.msdk.splash.view.nativeview.MBSplashClickView;
import com.mbridge.msdk.widget.FeedBackButton;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class BaseMBSplashNativeView extends RelativeLayout {
    private int A;
    private int B;
    private int C;
    private float D;
    private float E;
    private boolean F;
    private boolean G;
    protected boolean H;
    protected boolean I;
    protected boolean J;
    protected String K;
    private String L;
    protected MBSplashView M;
    protected CampaignEx N;
    protected MBShakeView O;
    private String P;
    private String Q;
    private String R;
    protected com.mbridge.msdk.shake.b S;

    /* renamed from: a, reason: collision with root package name */
    private MBNoRecycledCrashImageView f43006a;

    /* renamed from: b, reason: collision with root package name */
    private MBNoRecycledCrashImageView f43007b;

    /* renamed from: c, reason: collision with root package name */
    private RelativeLayout f43008c;

    /* renamed from: d, reason: collision with root package name */
    private ImageView f43009d;

    /* renamed from: e, reason: collision with root package name */
    private FeedBackButton f43010e;

    /* renamed from: f, reason: collision with root package name */
    protected TextView f43011f;

    /* renamed from: g, reason: collision with root package name */
    private RelativeLayout f43012g;

    /* renamed from: h, reason: collision with root package name */
    private MBNoRecycledCrashImageView f43013h;

    /* renamed from: i, reason: collision with root package name */
    private TextView f43014i;

    /* renamed from: j, reason: collision with root package name */
    private MBNoRecycledCrashImageView f43015j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f43016k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f43017l;

    /* renamed from: m, reason: collision with root package name */
    protected RelativeLayout f43018m;

    /* renamed from: n, reason: collision with root package name */
    protected TextView f43019n;

    /* renamed from: o, reason: collision with root package name */
    protected TextView f43020o;

    /* renamed from: p, reason: collision with root package name */
    protected TextView f43021p;

    /* renamed from: q, reason: collision with root package name */
    protected TextView f43022q;

    /* renamed from: r, reason: collision with root package name */
    protected MBSplashClickView f43023r;

    /* renamed from: s, reason: collision with root package name */
    protected int f43024s;

    /* renamed from: t, reason: collision with root package name */
    private int f43025t;

    /* renamed from: u, reason: collision with root package name */
    private int f43026u;

    /* renamed from: v, reason: collision with root package name */
    private int f43027v;

    /* renamed from: w, reason: collision with root package name */
    protected int f43028w;

    /* renamed from: x, reason: collision with root package name */
    protected int f43029x;

    /* renamed from: y, reason: collision with root package name */
    protected int f43030y;

    /* renamed from: z, reason: collision with root package name */
    protected int f43031z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.foundation.same.image.c {
        public b() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            BaseMBSplashNativeView.this.f43013h.setVisibility(4);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            Bitmap bitmapA;
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    try {
                        if (BaseMBSplashNativeView.this.f43013h == null || (bitmapA = o0.a(bitmap, 1, u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 40.0f))) == null || bitmapA.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f43013h.setImageBitmap(bitmapA);
                    } catch (Throwable th2) {
                        p0.b("MBSplashNativeView", th2.getMessage());
                        BaseMBSplashNativeView.this.f43013h.setImageBitmap(bitmap);
                    }
                } catch (Throwable th3) {
                    p0.b("MBSplashNativeView", th3.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements View.OnClickListener {
        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView.this.a(0);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            if (baseMBSplashNativeView.H) {
                if (baseMBSplashNativeView.M.getSplashSignalCommunicationImpl() != null && BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a() != null) {
                    BaseMBSplashNativeView.this.M.getSplashSignalCommunicationImpl().a().close();
                }
                BaseMBSplashNativeView.this.f43011f.setVisibility(4);
                BaseMBSplashNativeView.this.f43011f.setEnabled(false);
            }
        }
    }

    public BaseMBSplashNativeView(Context context) {
        super(context);
        this.I = false;
        this.J = false;
    }

    private void i() {
        if (this.f43027v == 1) {
            this.f43023r.setVisibility(8);
        } else if (this.f43029x == 1) {
            this.f43023r.setVisibility(8);
        } else {
            this.f43023r.initView(this.N.getAdCall());
        }
    }

    private void j() {
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.N.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarA = com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.N.getBidToken(), eVar, this.N, this.K);
        if (this.f43026u == 1) {
            a1.a(this, cVarA.o(), this.N.getLocalAllowTrackClick());
            setOnClickListener(new d());
        } else {
            a1.a(this.f43023r, cVarA.o(), this.N.getLocalAllowTrackClick());
            this.f43023r.setOnClickListener(new e());
        }
        this.f43011f.setOnClickListener(new f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCountDownStatus(boolean z10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        this.M.getSplashSignalCommunicationImpl().a().a(z10 ? 2 : 1, this.f43025t);
    }

    public void b() {
    }

    public void e() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f43029x != 1 || this.O == null || this.S == null) {
                return;
            }
            com.mbridge.msdk.shake.a.a().a(this.S);
        } catch (Throwable th2) {
            p0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.D = motionEvent.getRawX();
        this.E = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void release() {
        try {
            if (this.S != null) {
                com.mbridge.msdk.shake.a.a().b(this.S);
                this.S = null;
            }
            com.mbridge.msdk.foundation.feedback.b.b().d(this.K);
            detachAllViewsFromParent();
        } catch (Exception e10) {
            p0.b("MBSplashNativeView", e10.getMessage());
        }
    }

    public void setIsPause(boolean z10) {
        this.I = z10;
    }

    public void setNotchPadding(int i10, int i11, int i12, int i13) {
        try {
            RelativeLayout relativeLayout = this.f43008c;
            if (relativeLayout == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
            int i14 = this.C;
            layoutParams.leftMargin = i10 + i14;
            layoutParams.rightMargin = i11 + i14;
            layoutParams.topMargin = i12 + i14;
            layoutParams.bottomMargin = i14 + i13;
        } catch (Throwable th2) {
            p0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    public void updateCountDown(int i10) {
        String str;
        if (this.f43011f != null) {
            this.f43025t = i10;
            if (this.H) {
                str = this.Q + " " + i10 + this.P;
            } else {
                str = i10 + this.P + " " + this.R;
            }
            this.f43011f.setText(str);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.foundation.feedback.a {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements com.mbridge.msdk.foundation.feedback.a {
        public g() {
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = true;
            baseMBSplashNativeView.setCountDownStatus(false);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void close() {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }

        @Override // com.mbridge.msdk.foundation.feedback.a
        public void a(String str) {
            BaseMBSplashNativeView baseMBSplashNativeView = BaseMBSplashNativeView.this;
            baseMBSplashNativeView.J = false;
            baseMBSplashNativeView.setCountDownStatus(true);
        }
    }

    private void c() {
        try {
            this.F = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh");
        } catch (Throwable th2) {
            p0.b("MBSplashNativeView", th2.getMessage());
        }
        a();
        g();
        h();
        e();
        i();
        j();
        b();
        updateCountDown(this.f43024s);
    }

    private void d() {
        try {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.A == 1 ? h0.a(getContext().getApplicationContext(), "mbridge_splash_portrait", TtmlNode.TAG_LAYOUT) : h0.a(getContext().getApplicationContext(), "mbridge_splash_landscape", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
            addView(viewInflate);
            this.f43006a = (MBNoRecycledCrashImageView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image_bg", "id"));
            this.f43007b = (MBNoRecycledCrashImageView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_iv_image", "id"));
            this.f43008c = (RelativeLayout) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_topcontroller", "id"));
            this.f43009d = (ImageView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_iv_link", "id"));
            this.f43010e = (FeedBackButton) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_feedback", "id"));
            this.f43011f = (TextView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_skip", "id"));
            this.f43012g = (RelativeLayout) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_landscape_foreground", "id"));
            this.f43013h = (MBNoRecycledCrashImageView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_iv_icon", "id"));
            this.f43014i = (TextView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_title", "id"));
            this.f43015j = (MBNoRecycledCrashImageView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_iv_foregroundimage", "id"));
            this.f43016k = (TextView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adrect", "id"));
            this.f43018m = (RelativeLayout) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_layout_appinfo", "id"));
            this.f43019n = (TextView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_appinfo", "id"));
            this.f43020o = (TextView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_privacy", "id"));
            this.f43021p = (TextView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_permission", "id"));
            this.f43022q = (TextView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_app_desc", "id"));
            this.f43023r = (MBSplashClickView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_click", "id"));
            this.f43017l = (TextView) viewInflate.findViewById(h0.a(getContext().getApplicationContext(), "mbridge_splash_tv_adcircle", "id"));
            int iA = h0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip", "string");
            int iA2 = h0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_not", "string");
            int iA3 = h0.a(getContext().getApplicationContext(), "mbridge_splash_count_time_can_skip_s", "string");
            this.Q = getContext().getResources().getString(iA);
            this.R = getContext().getResources().getString(iA2);
            this.P = getContext().getResources().getString(iA3);
            this.C = u0.a(getContext(), 9.0f);
        } catch (Throwable th2) {
            p0.b("MBSplashNativeView", th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (TextUtils.isEmpty(this.N.getIconUrl())) {
            this.f43013h.setVisibility(4);
        } else {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(this.N.getIconUrl(), new b());
        }
    }

    private void g() {
        if (TextUtils.isEmpty(this.N.getImageUrl())) {
            this.f43007b.setVisibility(4);
        } else {
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(this.N.getImageUrl(), new a());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void h() {
        /*
            r7 = this;
            android.widget.ImageView r1 = r7.f43009d
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r7.N
            android.content.Context r3 = r7.getContext()
            com.mbridge.msdk.splash.view.BaseMBSplashNativeView$c r5 = new com.mbridge.msdk.splash.view.BaseMBSplashNativeView$c
            r5.<init>()
            r0 = 3
            r4 = 1
            com.mbridge.msdk.foundation.tools.u0.a(r0, r1, r2, r3, r4, r5)
            android.content.Context r0 = r7.getContext()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r1 = "mbridge_splash_m_circle"
            java.lang.String r2 = "drawable"
            int r0 = com.mbridge.msdk.foundation.tools.h0.a(r0, r1, r2)
            r1 = 0
            android.content.res.Resources r2 = r7.getResources()     // Catch: java.lang.Throwable -> L44
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r0)     // Catch: java.lang.Throwable -> L44
            android.content.Context r0 = r7.getContext()     // Catch: java.lang.Throwable -> L42
            r3 = 1092616192(0x41200000, float:10.0)
            int r0 = com.mbridge.msdk.foundation.tools.u0.a(r0, r3)     // Catch: java.lang.Throwable -> L42
            android.content.Context r4 = r7.getContext()     // Catch: java.lang.Throwable -> L42
            int r3 = com.mbridge.msdk.foundation.tools.u0.a(r4, r3)     // Catch: java.lang.Throwable -> L42
            r4 = 0
            r2.setBounds(r4, r4, r0, r3)     // Catch: java.lang.Throwable -> L42
            goto L4f
        L42:
            r0 = move-exception
            goto L46
        L44:
            r0 = move-exception
            r2 = r1
        L46:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r3 = "MBSplashNativeView"
            com.mbridge.msdk.foundation.tools.p0.b(r3, r0)
        L4f:
            int r0 = r7.A
            r3 = 1
            r4 = 4
            java.lang.String r5 = "AD"
            java.lang.String r6 = "广告"
            if (r0 != r3) goto L78
            boolean r0 = r7.G
            if (r0 == 0) goto L78
            int r0 = r7.B
            if (r0 == 0) goto L68
            if (r2 == 0) goto L68
            android.widget.TextView r0 = r7.f43017l
            r0.setCompoundDrawables(r2, r1, r1, r1)
        L68:
            android.widget.TextView r0 = r7.f43017l
            boolean r1 = r7.F
            if (r1 == 0) goto L6f
            r5 = r6
        L6f:
            r0.setText(r5)
            android.widget.TextView r0 = r7.f43016k
            r0.setVisibility(r4)
            goto L92
        L78:
            int r0 = r7.B
            if (r0 == 0) goto L83
            if (r2 == 0) goto L83
            android.widget.TextView r0 = r7.f43016k
            r0.setCompoundDrawables(r2, r1, r1, r1)
        L83:
            android.widget.TextView r0 = r7.f43016k
            boolean r1 = r7.F
            if (r1 == 0) goto L8a
            r5 = r6
        L8a:
            r0.setText(r5)
            android.widget.TextView r0 = r7.f43017l
            r0.setVisibility(r4)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.splash.view.BaseMBSplashNativeView.h():void");
    }

    public void a(int i10) {
        if (this.M.getSplashSignalCommunicationImpl() == null || this.M.getSplashSignalCommunicationImpl().a() == null) {
            return;
        }
        try {
            this.M.getSplashSignalCommunicationImpl().a().a(com.mbridge.msdk.splash.common.util.a.a(com.mbridge.msdk.splash.common.util.a.a(i10, this.D, this.E), this.N));
        } catch (Throwable th2) {
            p0.b("MBSplashNativeView", th2.getMessage());
            this.M.getSplashSignalCommunicationImpl().a().a(this.N);
        }
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BaseMBSplashNativeView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.I = false;
        this.J = false;
    }

    public BaseMBSplashNativeView(Context context, MBSplashView mBSplashView, com.mbridge.msdk.splash.common.c cVar) {
        super(context);
        this.I = false;
        this.J = false;
        if (cVar != null) {
            this.K = cVar.l();
            this.L = cVar.h();
            this.N = cVar.b();
            this.M = mBSplashView;
            this.f43024s = cVar.d();
            this.f43027v = cVar.c();
            this.f43026u = cVar.f();
            this.f43028w = cVar.a();
            this.f43029x = cVar.i();
            this.f43030y = cVar.j();
            this.f43031z = cVar.k();
            this.A = cVar.g();
            this.H = cVar.m();
            this.B = cVar.e();
            d();
            c();
            return;
        }
        throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
    }

    private void a() {
        CampaignEx campaignEx = this.N;
        if (campaignEx != null) {
            campaignEx.setCampaignUnitId(this.K);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
        }
        if (com.mbridge.msdk.foundation.feedback.b.b().a()) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, new g());
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.f43010e);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, 3);
            com.mbridge.msdk.foundation.feedback.b.b().a(this.K, this.N);
            return;
        }
        FeedBackButton feedBackButton = this.f43010e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(8);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements com.mbridge.msdk.foundation.same.image.c {
        public a() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (bitmap != null) {
                try {
                    if (bitmap.isRecycled()) {
                        return;
                    }
                    if (bitmap.getWidth() < bitmap.getHeight()) {
                        BaseMBSplashNativeView.this.G = true;
                        BaseMBSplashNativeView.this.f43012g.setVisibility(4);
                        BaseMBSplashNativeView.this.f43007b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f43007b.setImageBitmap(bitmap);
                    } else if (BaseMBSplashNativeView.this.A == 1) {
                        BaseMBSplashNativeView.this.f43012g.setVisibility(0);
                        try {
                            Bitmap bitmapA = o0.a(bitmap, 1, u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 10.0f));
                            if (bitmapA != null && !bitmapA.isRecycled()) {
                                BaseMBSplashNativeView.this.f43015j.setScaleType(ImageView.ScaleType.FIT_XY);
                                BaseMBSplashNativeView.this.f43015j.setImageBitmap(bitmapA);
                            }
                        } catch (Throwable th2) {
                            try {
                                p0.b("MBSplashNativeView", th2.getMessage());
                                BaseMBSplashNativeView.this.f43015j.setImageBitmap(bitmap);
                            } catch (Throwable th3) {
                                p0.b("MBSplashNativeView", th3.getMessage());
                            }
                        }
                        BaseMBSplashNativeView.this.f43014i.setText(BaseMBSplashNativeView.this.N.getAppName());
                        BaseMBSplashNativeView.this.f();
                        try {
                            try {
                                Bitmap bitmapA2 = o0.a(bitmap);
                                if (bitmapA2 != null && !bitmapA2.isRecycled()) {
                                    BaseMBSplashNativeView.this.f43007b.setScaleType(ImageView.ScaleType.CENTER_CROP);
                                    BaseMBSplashNativeView.this.f43007b.setImageBitmap(bitmapA2);
                                }
                            } catch (Throwable th4) {
                                p0.b("MBSplashNativeView", th4.getMessage());
                            }
                        } catch (Throwable unused) {
                            BaseMBSplashNativeView.this.f43007b.setImageBitmap(bitmap);
                        }
                    } else {
                        BaseMBSplashNativeView.this.f43012g.setVisibility(4);
                        BaseMBSplashNativeView.this.f43007b.setScaleType(ImageView.ScaleType.FIT_CENTER);
                        BaseMBSplashNativeView.this.f43007b.setImageBitmap(bitmap);
                    }
                    try {
                        Bitmap bitmapA3 = o0.a(bitmap);
                        if (bitmapA3 == null || bitmapA3.isRecycled()) {
                            return;
                        }
                        BaseMBSplashNativeView.this.f43006a.setScaleType(ImageView.ScaleType.CENTER_CROP);
                        BaseMBSplashNativeView.this.f43006a.setImageBitmap(bitmapA3);
                    } catch (Throwable unused2) {
                        BaseMBSplashNativeView.this.f43007b.setImageBitmap(bitmap);
                    }
                } catch (Throwable th5) {
                    p0.b("MBSplashNativeView", th5.getMessage());
                }
            }
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }
}
