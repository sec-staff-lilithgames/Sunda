package com.mbridge.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.video.module.listener.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.videocommon.view.RoundImageView;
import com.mbridge.msdk.videocommon.view.StarLevelView;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBridgeBTNativeEC extends MBridgeBTNativeECDiff {
    private TextView A;
    private StarLevelView B;
    private boolean C;
    private boolean D;
    private int E;
    private Runnable F;
    private boolean G;
    private View H;
    private String I;
    private k J;
    private WebView K;

    /* renamed from: p, reason: collision with root package name */
    private ViewGroup f44273p;

    /* renamed from: q, reason: collision with root package name */
    private ViewGroup f44274q;

    /* renamed from: r, reason: collision with root package name */
    private RelativeLayout f44275r;

    /* renamed from: s, reason: collision with root package name */
    private ImageView f44276s;

    /* renamed from: t, reason: collision with root package name */
    private RoundImageView f44277t;

    /* renamed from: u, reason: collision with root package name */
    private ImageView f44278u;

    /* renamed from: v, reason: collision with root package name */
    private ImageView f44279v;

    /* renamed from: w, reason: collision with root package name */
    private ImageView f44280w;

    /* renamed from: x, reason: collision with root package name */
    private ImageView f44281x;

    /* renamed from: y, reason: collision with root package name */
    private TextView f44282y;

    /* renamed from: z, reason: collision with root package name */
    private TextView f44283z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MBridgeBTNativeEC.this.D = true;
            if (MBridgeBTNativeEC.this.H != null) {
                MBridgeBTNativeEC.this.H.setVisibility(0);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (MBridgeBTNativeEC.this.C) {
                MBridgeBTNativeEC.this.a(1, view.getContext());
                MBridgeBTNativeEC.this.a(view.getX(), view.getY());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) throws JSONException {
            if (MBridgeBTNativeEC.this.K != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("id", MBridgeBTNativeEC.this.f44200d);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("unitId", MBridgeBTNativeEC.this.I);
                    jSONObject.put("data", jSONObject2);
                    p0.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
                } catch (JSONException e10) {
                    p0.a(BTBaseView.TAG, e10.getMessage());
                }
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(MBridgeBTNativeEC.this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d extends com.mbridge.msdk.widget.a {
        public d() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) throws JSONException {
            MBridgeBTNativeEC.this.a(0, view.getContext());
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends com.mbridge.msdk.widget.a {
        public e() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) throws JSONException {
            if (!com.mbridge.msdk.util.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends com.mbridge.msdk.widget.a {
        public f() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) throws JSONException {
            if (!com.mbridge.msdk.util.b.a() || MBridgeBTNativeEC.this.checkChinaProgressBarStatus()) {
                MBridgeBTNativeEC.this.a(0, view.getContext());
            }
            MBridgeBTNativeEC.this.a(view.getX(), view.getY());
        }
    }

    public MBridgeBTNativeEC(Context context) {
        super(context);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    public Bitmap blurBitmap(Bitmap bitmap) {
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            RenderScript renderScriptCreate = RenderScript.create(this.f44197a.getApplicationContext());
            ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
            Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmap);
            Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
            scriptIntrinsicBlurCreate.setRadius(10.0f);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            bitmap.recycle();
            renderScriptCreate.destroy();
            return bitmapCreateBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void init(Context context) {
        int iC = c();
        if (h0.a(iC)) {
            this.f44204h = b(iC);
            b();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() throws JSONException {
        super.onAttachedToWindow();
        if (this.F == null) {
            this.F = new a();
        }
        Runnable runnable = this.F;
        if (runnable != null) {
            postDelayed(runnable, this.E * 1000);
        }
        if (!this.f44204h && this.K != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", this.f44200d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("unitId", this.I);
                jSONObject.put("data", jSONObject2);
                p0.a(BTBaseView.TAG, "NativeEC Call H5 onCloseBtnClicked " + jSONObject.toString());
            } catch (JSONException e10) {
                p0.a(BTBaseView.TAG, e10.getMessage());
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onCloseBtnClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        }
        if (this.K != null) {
            JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.put("id", this.f44200d);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("unitId", this.I);
                jSONObject3.put("data", jSONObject4);
                p0.a(BTBaseView.TAG, "NativeEC Call H5 onEndCardShow " + jSONObject3.toString());
            } catch (JSONException e11) {
                p0.a(BTBaseView.TAG, e11.getMessage());
            }
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onNativeECShow", Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.F;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        super.onSelfConfigurationChanged(configuration);
        int i10 = configuration.orientation;
        this.f44203g = i10;
        if (i10 == 2) {
            removeView(this.f44273p);
            b(this.f44274q);
        } else {
            removeView(this.f44274q);
            b(this.f44273p);
        }
    }

    public void preLoadData() {
        Bitmap bitmapBlurBitmap;
        try {
            CampaignEx campaignEx = this.f44198b;
            if (campaignEx == null || !this.f44204h) {
                return;
            }
            if (campaignEx.getCbd() > -2) {
                this.E = this.f44198b.getCbd();
            } else {
                com.mbridge.msdk.videocommon.setting.c cVar = this.f44201e;
                if (cVar != null) {
                    this.E = cVar.i();
                }
            }
            com.mbridge.msdk.foundation.same.image.b.a(this.f44197a.getApplicationContext()).a(this.f44198b.getImageUrl(), new com.mbridge.msdk.video.module.listener.impl.e(this.f44277t, this.f44198b, this.I));
            com.mbridge.msdk.foundation.same.image.b.a(this.f44197a.getApplicationContext()).a(this.f44198b.getIconUrl(), new j(this.f44278u, u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 8.0f)));
            this.f44282y.setText(this.f44198b.getAppName());
            this.f44283z.setText(this.f44198b.getAppDesc());
            this.A.setText(this.f44198b.getNumberRating() + ")");
            this.B.removeAllViews();
            if (com.mbridge.msdk.util.b.a()) {
                setChinaCTAData(this.f44198b);
            }
            double rating = this.f44198b.getRating();
            if (rating <= 0.0d) {
                rating = 5.0d;
            }
            this.B.initScore(rating);
            try {
                Bitmap bitmapA = a(this.f44277t.getDrawable());
                if (bitmapA != null && (bitmapBlurBitmap = blurBitmap(bitmapA)) != null) {
                    this.f44276s.setImageBitmap(bitmapBlurBitmap);
                }
            } catch (Throwable unused) {
                this.f44276s.setVisibility(8);
            }
            if (!TextUtils.isEmpty(this.f44198b.getendcard_url()) && this.f44198b.getendcard_url().contains("alecfc=1")) {
                this.C = true;
            }
            if (!TextUtils.isEmpty(this.f44198b.getendcard_url()) && this.f44198b.getendcard_url().contains("wlgo=1")) {
                this.G = true;
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.f44279v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_en", "drawable", com.mbridge.msdk.foundation.controller.c.m().h())));
            } else {
                this.f44279v.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_reward_flag_cn", "drawable", com.mbridge.msdk.foundation.controller.c.m().h())));
            }
            if (!this.G) {
                this.f44279v.setVisibility(4);
                this.f44281x.setVisibility(4);
            }
            u0.a(2, this.f44280w, this.f44198b, this.f44197a, true, null);
            if (this.D) {
                return;
            }
            this.H.setVisibility(8);
        } catch (Throwable th2) {
            p0.a(BTBaseView.TAG, th2.getMessage());
        }
    }

    public void setCreateWebView(WebView webView) {
        this.K = webView;
    }

    public void setJSCommon(k kVar) {
        this.J = kVar;
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void setUnitId(String str) {
        this.I = str;
    }

    private void b(View view) {
        if (view == null) {
            init(this.f44197a);
            preLoadData();
            return;
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        addView(view);
        a(view);
        b();
    }

    private int c() {
        return findLayout(isLandscape() ? "mbridge_reward_endcard_native_land" : "mbridge_reward_endcard_native_hor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[Catch: all -> 0x000f, TryCatch #2 {all -> 0x000f, blocks: (B:2:0x0000, B:3:0x0005, B:12:0x0018, B:14:0x001c, B:16:0x0022, B:17:0x0027, B:19:0x002b, B:21:0x0032, B:11:0x0015), top: B:27:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(int r3, android.content.Context r4) {
        /*
            r2 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L13
            r0.<init>()     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L13
            java.lang.String r1 = com.mbridge.msdk.foundation.same.a.f40713j     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L11
            org.json.JSONObject r3 = r2.a(r3)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L11
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> Lf org.json.JSONException -> L11
            goto L18
        Lf:
            r3 = move-exception
            goto L37
        L11:
            r3 = move-exception
            goto L15
        L13:
            r3 = move-exception
            r0 = 0
        L15:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> Lf
        L18:
            com.mbridge.msdk.video.signal.impl.k r3 = r2.J     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L40
            boolean r3 = com.mbridge.msdk.util.b.a()     // Catch: java.lang.Throwable -> Lf
            if (r3 == 0) goto L27
            com.mbridge.msdk.video.signal.impl.k r3 = r2.J     // Catch: java.lang.Throwable -> Lf
            r2.doChinaJumpClick(r4, r3)     // Catch: java.lang.Throwable -> Lf
        L27:
            com.mbridge.msdk.video.signal.impl.k r3 = r2.J     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L30
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> Lf
            goto L32
        L30:
            java.lang.String r4 = ""
        L32:
            r0 = 1
            r3.click(r0, r4)     // Catch: java.lang.Throwable -> Lf
            goto L40
        L37:
            java.lang.String r3 = r3.getMessage()
            java.lang.String r4 = "BTBaseView"
            com.mbridge.msdk.foundation.tools.p0.a(r4, r3)
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.video.bt.module.MBridgeBTNativeEC.a(int, android.content.Context):void");
    }

    public MBridgeBTNativeEC(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.C = false;
        this.D = false;
        this.E = 0;
        this.G = false;
    }

    private boolean b(int i10) {
        if (isLandscape()) {
            ViewGroup viewGroup = (ViewGroup) this.f44202f.inflate(i10, (ViewGroup) null);
            this.f44274q = viewGroup;
            addView(viewGroup);
            return a(this.f44274q);
        }
        ViewGroup viewGroup2 = (ViewGroup) this.f44202f.inflate(i10, (ViewGroup) null);
        this.f44273p = viewGroup2;
        addView(viewGroup2);
        return a(this.f44273p);
    }

    private boolean a(View view) {
        try {
            this.f44275r = (RelativeLayout) view.findViewById(findID("mbridge_native_ec_layout"));
            this.f44276s = (ImageView) view.findViewById(findID("mbridge_iv_adbanner_bg"));
            this.f44277t = (RoundImageView) view.findViewById(findID("mbridge_iv_adbanner"));
            this.f44278u = (ImageView) view.findViewById(findID("mbridge_iv_icon"));
            this.f44279v = (ImageView) view.findViewById(findID("mbridge_iv_flag"));
            this.f44280w = (ImageView) view.findViewById(findID("mbridge_iv_link"));
            this.f44282y = (TextView) view.findViewById(findID("mbridge_tv_apptitle"));
            this.f44283z = (TextView) view.findViewById(findID("mbridge_tv_appdesc"));
            this.A = (TextView) view.findViewById(findID("mbridge_tv_number"));
            this.B = (StarLevelView) view.findViewById(findID("mbridge_sv_starlevel"));
            this.H = view.findViewById(findID("mbridge_iv_close"));
            this.ctaView = view.findViewById(findID("mbridge_tv_cta"));
            this.f44281x = (ImageView) view.findViewById(findID("mbridge_iv_logo"));
            return isNotNULL(this.f44276s, this.f44277t, this.f44278u, this.f44282y, this.f44283z, this.A, this.B, this.H, this.ctaView);
        } catch (Throwable th2) {
            p0.b(BTBaseView.TAG, th2.getMessage(), th2);
            return false;
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.BTBaseView
    public void b() {
        if (this.f44204h) {
            this.f44275r.setOnClickListener(new b());
            this.H.setOnClickListener(new c());
            this.ctaView.setOnClickListener(new d());
            this.f44278u.setOnClickListener(new e());
            this.f44277t.setOnClickListener(new f());
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.MBridgeBTNativeECDiff, com.mbridge.msdk.video.bt.module.BTBaseView
    public void onDestory() {
    }

    private Bitmap a(Drawable drawable) {
        try {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        } catch (Throwable th2) {
            p0.a(BTBaseView.TAG, th2.getMessage());
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(float f10, float f11) throws JSONException {
        if (this.K != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", BTBaseView.f44195n);
                jSONObject.put("id", this.f44200d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("x", String.valueOf(f10));
                jSONObject2.put("y", String.valueOf(f11));
                jSONObject.put("data", jSONObject2);
                com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(this.K, "onClicked", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            } catch (Exception unused) {
                com.mbridge.msdk.video.bt.component.d.c().a(this.K, "onClicked", this.f44200d);
            }
        }
    }
}
