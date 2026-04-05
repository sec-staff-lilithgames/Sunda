package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.click.j;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class BaseSplashPopView extends RelativeLayout {
    public static final int TYPE_POP_DEFAULT = 1;
    public static final int TYPE_POP_LARGE = 4;
    public static final int TYPE_POP_MEDIUM = 3;
    public static final int TYPE_POP_SMALL = 2;

    /* renamed from: v, reason: collision with root package name */
    private static final AtomicInteger f43039v = new AtomicInteger(1);

    /* renamed from: a, reason: collision with root package name */
    protected String f43040a;

    /* renamed from: b, reason: collision with root package name */
    protected String f43041b;

    /* renamed from: c, reason: collision with root package name */
    private int f43042c;

    /* renamed from: d, reason: collision with root package name */
    private CampaignEx f43043d;

    /* renamed from: e, reason: collision with root package name */
    protected com.mbridge.msdk.splash.middle.d f43044e;

    /* renamed from: f, reason: collision with root package name */
    private ImageView f43045f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f43046g;

    /* renamed from: h, reason: collision with root package name */
    private ImageView f43047h;

    /* renamed from: i, reason: collision with root package name */
    private ImageView f43048i;

    /* renamed from: j, reason: collision with root package name */
    private TextView f43049j;

    /* renamed from: k, reason: collision with root package name */
    private TextView f43050k;

    /* renamed from: l, reason: collision with root package name */
    private TextView f43051l;

    /* renamed from: m, reason: collision with root package name */
    private int f43052m;

    /* renamed from: n, reason: collision with root package name */
    protected Handler f43053n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f43054o;

    /* renamed from: p, reason: collision with root package name */
    protected com.mbridge.msdk.click.a f43055p;

    /* renamed from: q, reason: collision with root package name */
    private j f43056q;

    /* renamed from: r, reason: collision with root package name */
    private Runnable f43057r;

    /* renamed from: s, reason: collision with root package name */
    private Runnable f43058s;

    /* renamed from: t, reason: collision with root package name */
    View.OnClickListener f43059t;

    /* renamed from: u, reason: collision with root package name */
    View.OnClickListener f43060u;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements j {
        public a() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            t0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            if (campaign == null) {
                return;
            }
            t0.a(campaign, BaseSplashPopView.this);
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            int iA;
            int iA2;
            if (BaseSplashPopView.this.f43042c == 1) {
                int iMin = Math.min(BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight());
                int iA3 = (u0.a(BaseSplashPopView.this.getContext(), 60.0f) - Math.min(Math.max(iMin / 4, 70), iMin)) / 2;
                iA = u0.a(BaseSplashPopView.this.getContext(), 23.0f) + iA3;
                iA2 = u0.a(BaseSplashPopView.this.getContext(), 10.0f) + iA3;
            } else {
                iA = 0;
                iA2 = 0;
            }
            t0.a(campaign, BaseSplashPopView.this, iA, iA2);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements com.mbridge.msdk.foundation.same.image.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f43062a;

        public b(boolean z10) {
            this.f43062a = z10;
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            p0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                Bitmap bitmapB = this.f43062a ? o0.b(bitmap) : o0.a(bitmap, 1, 16);
                ImageView imageView = BaseSplashPopView.this.f43045f;
                if (bitmapB != null) {
                    bitmap = bitmapB;
                }
                imageView.setImageBitmap(bitmap);
            } catch (Throwable th2) {
                p0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.foundation.same.image.c {
        public c() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            p0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f43047h.setImageBitmap(z.a(bitmap, 10));
            } catch (Throwable th2) {
                p0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements com.mbridge.msdk.foundation.same.image.c {
        public d() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
            p0.b("MBSplashPopView", str);
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            try {
                if (bitmap.isRecycled()) {
                    return;
                }
                BaseSplashPopView.this.f43046g.setImageBitmap(o0.a(bitmap, 1, 16));
            } catch (Throwable th2) {
                p0.b("MBSplashPopView", th2.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseSplashPopView.this.f43051l != null) {
                if (BaseSplashPopView.this.f43052m != 0) {
                    BaseSplashPopView.g(BaseSplashPopView.this);
                    BaseSplashPopView.this.f43051l.setText(String.valueOf(BaseSplashPopView.this.f43052m));
                    BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
                    baseSplashPopView.f43053n.postDelayed(baseSplashPopView.f43057r, 1000L);
                    return;
                }
                BaseSplashPopView.this.f43052m = -1;
                BaseSplashPopView.this.g();
                BaseSplashPopView baseSplashPopView2 = BaseSplashPopView.this;
                baseSplashPopView2.f43053n.removeCallbacks(baseSplashPopView2.f43057r);
                BaseSplashPopView baseSplashPopView3 = BaseSplashPopView.this;
                com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView3.f43044e;
                if (dVar != null) {
                    dVar.a(new MBridgeIds(baseSplashPopView3.f43040a, baseSplashPopView3.f43041b), 5);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public void run() throws JSONException {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            com.mbridge.msdk.splash.middle.d dVar = baseSplashPopView.f43044e;
            if (dVar != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f43040a, baseSplashPopView.f43041b), BaseSplashPopView.this.getWidth(), BaseSplashPopView.this.getHeight(), BaseSplashPopView.this.f43042c);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements View.OnClickListener {
        public g() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            BaseSplashPopView baseSplashPopView = BaseSplashPopView.this;
            if (baseSplashPopView.f43044e != null) {
                baseSplashPopView.b(baseSplashPopView.f43043d);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements View.OnClickListener {
        public h() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseSplashPopView baseSplashPopView;
            com.mbridge.msdk.splash.middle.d dVar;
            if (BaseSplashPopView.this.f43052m <= 0 && (dVar = (baseSplashPopView = BaseSplashPopView.this).f43044e) != null) {
                dVar.a(new MBridgeIds(baseSplashPopView.f43040a, baseSplashPopView.f43041b), 4);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class i {

        /* renamed from: a, reason: collision with root package name */
        private String f43070a;

        /* renamed from: b, reason: collision with root package name */
        private String f43071b;

        /* renamed from: c, reason: collision with root package name */
        private int f43072c;

        /* renamed from: d, reason: collision with root package name */
        private CampaignEx f43073d;

        public i(String str, String str2, int i10, CampaignEx campaignEx) {
            this.f43070a = str;
            this.f43071b = str2;
            this.f43072c = i10;
            this.f43073d = campaignEx;
        }

        public CampaignEx a() {
            return this.f43073d;
        }

        public String b() {
            return this.f43070a;
        }

        public String c() {
            return this.f43071b;
        }

        public int d() {
            return this.f43072c;
        }
    }

    public BaseSplashPopView(Context context, i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        super(context);
        this.f43042c = 1;
        this.f43052m = -1;
        this.f43053n = new Handler();
        this.f43054o = false;
        this.f43056q = new a();
        this.f43057r = new e();
        this.f43058s = new f();
        this.f43059t = new g();
        this.f43060u = new h();
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f43041b = iVar.c();
        this.f43040a = iVar.b();
        this.f43042c = iVar.d();
        this.f43043d = iVar.a();
        this.f43044e = dVar;
        a();
    }

    public static /* synthetic */ int g(BaseSplashPopView baseSplashPopView) {
        int i10 = baseSplashPopView.f43052m;
        baseSplashPopView.f43052m = i10 - 1;
        return i10;
    }

    public static int generateViewId() {
        AtomicInteger atomicInteger;
        int i10;
        int i11;
        do {
            atomicInteger = f43039v;
            i10 = atomicInteger.get();
            i11 = i10 + 1;
            if (i11 > 16777215) {
                i11 = 1;
            }
        } while (!atomicInteger.compareAndSet(i10, i11));
        return i10;
    }

    private void setBackgroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(str, new c());
    }

    private void setForegroundImage(String str) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(str, new d());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f43044e != null) {
            postDelayed(this.f43058s, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        release();
    }

    public void pauseCountDown() {
        this.f43054o = true;
        if (this.f43051l != null) {
            this.f43053n.removeCallbacks(this.f43057r);
        }
    }

    public void reStartCountDown() {
        if (this.f43054o) {
            this.f43054o = false;
            int i10 = this.f43052m;
            if (i10 == -1 || i10 == 0) {
                g();
                return;
            }
            TextView textView = this.f43051l;
            if (textView != null) {
                textView.setText(String.valueOf(i10));
                this.f43053n.postDelayed(this.f43057r, 1000L);
            }
        }
    }

    public void release() {
        try {
            this.f43053n.removeCallbacks(this.f43058s);
            this.f43053n.removeCallbacks(this.f43057r);
            this.f43057r = null;
            detachAllViewsFromParent();
            this.f43043d = null;
            this.f43044e = null;
        } catch (Exception e10) {
            p0.b("MBSplashPopView", e10.getMessage());
        }
    }

    public void setPopViewType(i iVar, com.mbridge.msdk.splash.middle.d dVar) {
        if (iVar == null) {
            throw new IllegalArgumentException("Parameters is NULL, can't gen view.");
        }
        this.f43041b = iVar.c();
        this.f43040a = iVar.b();
        this.f43042c = iVar.d();
        this.f43043d = iVar.a();
        this.f43044e = dVar;
        a();
    }

    public void startCountDown() {
        this.f43053n.removeCallbacks(this.f43057r);
        CampaignEx campaignEx = this.f43043d;
        if (campaignEx == null || this.f43042c != 1) {
            return;
        }
        int flbSkipTime = campaignEx.getFlbSkipTime();
        if (flbSkipTime <= 0) {
            g();
            return;
        }
        this.f43052m = flbSkipTime;
        TextView textView = this.f43051l;
        if (textView != null) {
            textView.setText(String.valueOf(flbSkipTime));
            this.f43053n.postDelayed(this.f43057r, 1000L);
        }
    }

    private void b() {
        String language;
        this.f43048i = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 32.0f), u0.a(getContext(), 13.0f));
        layoutParams.addRule(11);
        layoutParams.addRule(8, this.f43045f.getId());
        this.f43048i.setLayoutParams(layoutParams);
        try {
            language = getResources().getConfiguration().locale.getLanguage();
        } catch (Throwable th2) {
            p0.b("MBSplashPopView", th2.getMessage());
            language = "ZH";
        }
        this.f43048i.setBackgroundResource((language.toUpperCase().equals("CN") || language.toUpperCase().equals("ZH")) ? getResources().getIdentifier("mbridge_splash_pop_ad", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()) : getResources().getIdentifier("mbridge_splash_pop_ad_en", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
        addView(this.f43048i);
    }

    private void c() {
        View imageView = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 80.0f), u0.a(getContext(), 80.0f));
        layoutParams.addRule(9);
        layoutParams.topMargin = u0.a(getContext(), 16.0f);
        imageView.setId(generateViewId());
        imageView.setLayoutParams(layoutParams);
        imageView.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_default", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
        this.f43045f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(u0.a(getContext(), 60.0f), u0.a(getContext(), 60.0f));
        layoutParams2.addRule(6, imageView.getId());
        layoutParams2.topMargin = u0.a(getContext(), 7.0f);
        layoutParams2.leftMargin = u0.a(getContext(), 10.0f);
        this.f43045f.setId(generateViewId());
        this.f43045f.setLayoutParams(layoutParams2);
        this.f43045f.setScaleType(ImageView.ScaleType.FIT_CENTER);
        CampaignEx campaignEx = this.f43043d;
        if (campaignEx != null && !TextUtils.isEmpty(campaignEx.getIconUrl())) {
            a(this.f43043d.getIconUrl(), true);
        }
        this.f43051l = new TextView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, imageView.getId());
        layoutParams3.addRule(8, imageView.getId());
        layoutParams3.leftMargin = u0.a(getContext(), 62.0f);
        layoutParams3.bottomMargin = u0.a(getContext(), 70.0f);
        this.f43051l.setId(generateViewId());
        this.f43051l.setTextSize(10.0f);
        this.f43051l.setTextColor(-1);
        this.f43051l.setGravity(17);
        this.f43051l.setMinWidth(u0.a(getContext(), 16.0f));
        this.f43051l.setMaxHeight(u0.a(getContext(), 16.0f));
        this.f43051l.setLayoutParams(layoutParams3);
        this.f43051l.setBackgroundResource(getResources().getIdentifier("mbridge_cm_circle_50black", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
        addView(imageView);
        addView(this.f43051l);
        addView(this.f43045f);
        CampaignEx campaignEx2 = this.f43043d;
        if (campaignEx2 != null && campaignEx2.getFlbSkipTime() <= 0) {
            g();
        }
        CampaignEx campaignEx3 = this.f43043d;
        if (campaignEx3 != null) {
            a1.a(this, campaignEx3.getLocalRequestId(), this.f43043d.getLocalAllowTrackClick());
        }
        setOnClickListener(this.f43059t);
        this.f43051l.setOnClickListener(this.f43060u);
    }

    private void d() {
        this.f43047h = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, u0.a(getContext(), 131.0f));
        layoutParams.addRule(10);
        layoutParams.addRule(14);
        this.f43047h.setScaleType(ImageView.ScaleType.FIT_XY);
        this.f43047h.setId(generateViewId());
        this.f43047h.setLayoutParams(layoutParams);
        setBackgroundImage(this.f43043d.getImageUrl());
        this.f43046g = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, u0.a(getContext(), 131.0f));
        layoutParams2.addRule(10);
        layoutParams2.addRule(14);
        this.f43046g.setScaleType(ImageView.ScaleType.FIT_CENTER);
        this.f43046g.setId(generateViewId());
        this.f43046g.setLayoutParams(layoutParams2);
        setForegroundImage(this.f43043d.getImageUrl());
        this.f43045f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(u0.a(getContext(), 50.0f), u0.a(getContext(), 50.0f));
        layoutParams3.addRule(9);
        layoutParams3.addRule(3, this.f43047h.getId());
        layoutParams3.topMargin = 20;
        this.f43045f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f43045f.setId(generateViewId());
        this.f43045f.setLayoutParams(layoutParams3);
        a(this.f43043d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams4.addRule(1, this.f43045f.getId());
        layoutParams4.addRule(6, this.f43045f.getId());
        layoutParams4.addRule(8, this.f43045f.getId());
        layoutParams4.leftMargin = u0.a(getContext(), 8.0f);
        layoutParams4.rightMargin = u0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams4);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f43049j = textView;
        textView.setId(generateViewId());
        this.f43049j.setGravity(16);
        this.f43049j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f43049j.setTextSize(12.0f);
        this.f43049j.setTextColor(-16777216);
        TextView textView2 = this.f43049j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f43049j.setMarqueeRepeatLimit(-1);
        this.f43049j.setSelected(true);
        this.f43049j.setSingleLine(true);
        this.f43049j.setText(this.f43043d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f43050k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams5.addRule(5, this.f43049j.getId());
        layoutParams5.addRule(3, this.f43049j.getId());
        layoutParams5.topMargin = u0.a(getContext(), 4.0f);
        layoutParams5.rightMargin = u0.a(getContext(), 36.0f);
        this.f43050k.setGravity(16);
        this.f43050k.setLayoutParams(layoutParams5);
        this.f43050k.setTextSize(8.0f);
        this.f43050k.setTextColor(-10066330);
        this.f43050k.setEllipsize(truncateAt);
        this.f43050k.setMarqueeRepeatLimit(-1);
        this.f43050k.setSelected(true);
        this.f43050k.setSingleLine(true);
        this.f43050k.setText(this.f43043d.getAppDesc());
        relativeLayout.addView(this.f43049j);
        relativeLayout.addView(this.f43050k);
        addView(this.f43047h);
        addView(this.f43046g);
        addView(this.f43045f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f43043d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        a1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f43043d.getBidToken(), eVar, this.f43043d, this.f43041b).o(), this.f43043d.getLocalAllowTrackClick());
        setOnClickListener(this.f43059t);
    }

    private void e() {
        int iA = u0.a(getContext(), 4.0f);
        this.f43045f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 50.0f), u0.a(getContext(), 50.0f));
        layoutParams.addRule(9);
        this.f43045f.setId(generateViewId());
        this.f43045f.setLayoutParams(layoutParams);
        this.f43045f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        this.f43045f.setPadding(iA, iA, iA, iA);
        a(this.f43043d.getIconUrl(), false);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(1, this.f43045f.getId());
        layoutParams2.addRule(6, this.f43045f.getId());
        layoutParams2.addRule(8, this.f43045f.getId());
        layoutParams2.leftMargin = u0.a(getContext(), 8.0f);
        layoutParams2.rightMargin = u0.a(getContext(), 8.0f);
        relativeLayout.setLayoutParams(layoutParams2);
        relativeLayout.setGravity(16);
        TextView textView = new TextView(getContext());
        this.f43049j = textView;
        textView.setId(generateViewId());
        this.f43049j.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f43049j.setGravity(16);
        this.f43049j.setTextSize(12.0f);
        this.f43049j.setSelected(true);
        TextView textView2 = this.f43049j;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.MARQUEE;
        textView2.setEllipsize(truncateAt);
        this.f43049j.setMarqueeRepeatLimit(-1);
        this.f43049j.setSingleLine(true);
        this.f43049j.setTextColor(-16777216);
        this.f43049j.setText(this.f43043d.getAppName());
        TextView textView3 = new TextView(getContext());
        this.f43050k = textView3;
        textView3.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(5, this.f43049j.getId());
        layoutParams3.addRule(3, this.f43049j.getId());
        layoutParams3.topMargin = u0.a(getContext(), 4.0f);
        layoutParams3.rightMargin = u0.a(getContext(), 36.0f);
        this.f43050k.setGravity(16);
        this.f43050k.setLayoutParams(layoutParams3);
        this.f43050k.setTextSize(8.0f);
        this.f43050k.setTextColor(-10066330);
        this.f43050k.setEllipsize(truncateAt);
        this.f43050k.setMarqueeRepeatLimit(-1);
        this.f43050k.setSelected(true);
        this.f43050k.setSingleLine(true);
        this.f43050k.setText(this.f43043d.getAppDesc());
        relativeLayout.addView(this.f43049j);
        relativeLayout.addView(this.f43050k);
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
        addView(this.f43045f);
        addView(relativeLayout);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f43043d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        a1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f43043d.getBidToken(), eVar, this.f43043d, this.f43041b).o(), this.f43043d.getLocalAllowTrackClick());
        setOnClickListener(this.f43059t);
    }

    private void f() {
        int iA = u0.a(getContext(), 4.0f);
        this.f43045f = new ImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 28.0f), u0.a(getContext(), 28.0f));
        layoutParams.addRule(9);
        this.f43045f.setId(generateViewId());
        this.f43045f.setLayoutParams(layoutParams);
        this.f43045f.setPadding(iA, iA, iA, iA);
        this.f43045f.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        a(this.f43043d.getIconUrl(), false);
        TextView textView = new TextView(getContext());
        this.f43049j = textView;
        textView.setId(generateViewId());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(1, this.f43045f.getId());
        layoutParams2.addRule(6, this.f43045f.getId());
        layoutParams2.addRule(8, this.f43045f.getId());
        layoutParams2.leftMargin = u0.a(getContext(), 4.0f);
        layoutParams2.rightMargin = u0.a(getContext(), 40.0f);
        this.f43049j.setLayoutParams(layoutParams2);
        this.f43049j.setGravity(16);
        this.f43049j.setTextSize(10.0f);
        this.f43049j.setSelected(true);
        this.f43049j.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f43049j.setMarqueeRepeatLimit(-1);
        this.f43049j.setSingleLine(true);
        this.f43049j.setTextColor(-16777216);
        this.f43049j.setText(this.f43043d.getAppName());
        setBackgroundResource(getResources().getIdentifier("mbridge_shape_corners_bg", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
        addView(this.f43045f);
        addView(this.f43049j);
        b();
        com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
        eVar.a("adtp", 297);
        if (TextUtils.isEmpty(this.f43043d.getBidToken())) {
            eVar.a(CampaignEx.JSON_KEY_HB, 0);
        } else {
            eVar.a(CampaignEx.JSON_KEY_HB, 1);
        }
        a1.a(this, com.mbridge.msdk.foundation.same.report.metrics.d.b().a(true, this.f43043d.getBidToken(), eVar, this.f43043d, this.f43041b).o(), this.f43043d.getLocalAllowTrackClick());
        setOnClickListener(this.f43059t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        TextView textView = this.f43051l;
        if (textView != null) {
            ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = u0.a(getContext(), 16.0f);
            layoutParams.height = u0.a(getContext(), 16.0f);
            this.f43051l.setLayoutParams(layoutParams);
            this.f43051l.setText("");
            this.f43051l.setSelected(true);
            this.f43051l.setBackgroundResource(getResources().getIdentifier("mbridge_splash_popview_close", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
        }
    }

    private void a() {
        if (this.f43043d == null) {
            return;
        }
        setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
        int i10 = this.f43042c;
        if (i10 == 1) {
            c();
            return;
        }
        if (i10 == 2) {
            f();
        } else if (i10 == 3) {
            e();
        } else {
            if (i10 != 4) {
                return;
            }
            d();
        }
    }

    private void a(String str, boolean z10) {
        com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(str, new b(z10));
    }

    public void a(CampaignEx campaignEx) {
        if (this.f43055p == null) {
            com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(com.mbridge.msdk.foundation.controller.c.m().d(), this.f43041b);
            this.f43055p = aVar;
            aVar.a(this.f43056q);
        }
        campaignEx.setCampaignUnitId(this.f43041b);
        this.f43055p.a(campaignEx);
        if (!campaignEx.isReportClick()) {
            campaignEx.setReportClick(true);
            com.mbridge.msdk.splash.report.a.a(com.mbridge.msdk.foundation.controller.c.m().d(), campaignEx);
        }
        com.mbridge.msdk.splash.middle.d dVar = this.f43044e;
        if (dVar != null) {
            dVar.a(new MBridgeIds(this.f43040a, this.f43041b));
            this.f43044e.a(new MBridgeIds(this.f43040a, this.f43041b), 6);
        }
    }

    public void b(CampaignEx campaignEx) throws JSONException {
        com.mbridge.msdk.splash.report.a.a(campaignEx, this.f43041b);
    }

    public BaseSplashPopView(Context context) {
        super(context);
        this.f43042c = 1;
        this.f43052m = -1;
        this.f43053n = new Handler();
        this.f43054o = false;
        this.f43056q = new a();
        this.f43057r = new e();
        this.f43058s = new f();
        this.f43059t = new g();
        this.f43060u = new h();
        this.f43042c = 1;
        p0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43042c = 1;
        this.f43052m = -1;
        this.f43053n = new Handler();
        this.f43054o = false;
        this.f43056q = new a();
        this.f43057r = new e();
        this.f43058s = new f();
        this.f43059t = new g();
        this.f43060u = new h();
        this.f43042c = 1;
        p0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f43042c = 1;
        this.f43052m = -1;
        this.f43053n = new Handler();
        this.f43054o = false;
        this.f43056q = new a();
        this.f43057r = new e();
        this.f43058s = new f();
        this.f43059t = new g();
        this.f43060u = new h();
        this.f43042c = 1;
        p0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }

    public BaseSplashPopView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f43042c = 1;
        this.f43052m = -1;
        this.f43053n = new Handler();
        this.f43054o = false;
        this.f43056q = new a();
        this.f43057r = new e();
        this.f43058s = new f();
        this.f43059t = new g();
        this.f43060u = new h();
        this.f43042c = 1;
        p0.c("MBSplashPopView", "Please call setPopViewType() to init.");
    }
}
