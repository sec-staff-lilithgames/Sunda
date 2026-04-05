package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.e2;
import com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.common.Cif;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.hna;
import com.bytedance.sdk.openadsdk.common.oya;
import com.bytedance.sdk.openadsdk.common.prr;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTVideoLandingPageLink2Activity extends TTVideoLandingPageActivity implements com.bytedance.sdk.openadsdk.yd.cm {
    private com.bytedance.sdk.openadsdk.core.widget.jpo.my aix;
    private boolean cgn;
    private boolean cql;

    /* renamed from: dn, reason: collision with root package name */
    private Cif f19285dn;

    /* renamed from: et, reason: collision with root package name */
    private long f19286et;
    prr fy;
    private TextView hks;
    TTAdDislikeToast huv;
    private View jkt;
    private hna ota;
    private com.bytedance.sdk.openadsdk.common.cm ree;
    private TextView rxq;
    private View sbx;
    private PAGLogoView voc;
    private LinearLayout wad;

    /* renamed from: ii, reason: collision with root package name */
    private boolean f19287ii = false;

    /* renamed from: ya, reason: collision with root package name */
    final AtomicBoolean f19288ya = new AtomicBoolean(false);
    final AtomicBoolean wcn = new AtomicBoolean(false);

    /* JADX INFO: Access modifiers changed from: private */
    public void hna() {
        Cif cif = this.f19285dn;
        if (cif != null) {
            cif.jd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jr() {
        TTAdDislikeToast tTAdDislikeToast;
        if (isFinishing() || (tTAdDislikeToast = this.huv) == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeSendTip());
    }

    private void opi() {
        try {
            if (this.fy == null) {
                prr prrVar = new prr(this.my, this.prr);
                this.fy = prrVar;
                prrVar.setDislikeSource("landing_page");
                this.fy.setCallback(new prr.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.6
                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jd(View view) {
                        TTVideoLandingPageLink2Activity.this.f19288ya.set(false);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jpo(View view) {
                        TTVideoLandingPageLink2Activity.this.f19288ya.set(true);
                    }

                    @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                    public void jpo(FilterWord filterWord) {
                        if (TTVideoLandingPageLink2Activity.this.wcn.get() || filterWord == null || filterWord.hasSecondOptions()) {
                            return;
                        }
                        TTVideoLandingPageLink2Activity.this.wcn.set(true);
                        TTVideoLandingPageLink2Activity.this.jr();
                    }
                });
            }
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
            frameLayout.addView(this.fy);
            if (this.huv == null) {
                TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this.my);
                this.huv = tTAdDislikeToast;
                frameLayout.addView(tTAdDislikeToast);
            }
        } catch (Throwable th2) {
            ApmHelper.reportCustomError("initDislike error", "TTVideoLandingPageLink2Activity", th2);
        }
    }

    private void sq() {
        TTAdDislikeToast tTAdDislikeToast = this.huv;
        if (tTAdDislikeToast == null) {
            return;
        }
        tTAdDislikeToast.show(TTAdDislikeToast.getDislikeTip());
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Cif cif = this.f19285dn;
        if (cif != null) {
            cif.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        dt dtVar;
        com.bytedance.sdk.component.zz.jj jjVar;
        super.onCreate(bundle);
        if (!oya.my() || (dtVar = this.prr) == null || (jjVar = ((TTVideoLandingPageActivity) this).jpo) == null) {
            finish();
            return;
        }
        com.bytedance.sdk.openadsdk.common.cm cmVarJpo = tic.jpo(dtVar, jjVar, this.my, this.f19277uu);
        this.ree = cmVarJpo;
        if (cmVarJpo != null) {
            cmVarJpo.jpo("landingpage_split_screen");
        }
        this.cql = sq.cm().jr();
        if (((TTVideoLandingPageActivity) this).jpo.getWebView() != null) {
            ((TTVideoLandingPageActivity) this).jpo.getWebView().setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.1
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i10, int i11, int i12, int i13) {
                    com.bytedance.sdk.openadsdk.cm.Cif cif = TTVideoLandingPageLink2Activity.this.tic;
                    if (cif != null) {
                        cif.jd(i11);
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.widget.jpo.my myVar = new com.bytedance.sdk.openadsdk.core.widget.jpo.my(this.my, this.zz, this.f19266jj, this.ree, this.tic, true) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.7
            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTVideoLandingPageLink2Activity.this.sbx != null && !TTVideoLandingPageLink2Activity.this.cgn) {
                        TTVideoLandingPageLink2Activity.this.sbx.setVisibility(8);
                    }
                    if (TTVideoLandingPageLink2Activity.this.wad != null) {
                        TTVideoLandingPageLink2Activity.this.wad.setVisibility(0);
                    }
                    TTVideoLandingPageLink2Activity.this.f19287ii = true;
                    TTVideoLandingPageLink2Activity.this.hna();
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(tTVideoLandingPageLink2Activity.prr, tTVideoLandingPageLink2Activity.f19277uu, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f19286et, true);
                } catch (Throwable unused) {
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.my, android.webkit.WebViewClient
            public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                super.onPageStarted(webView, str, bitmap);
                TTVideoLandingPageLink2Activity.this.f19286et = System.currentTimeMillis();
            }
        };
        this.aix = myVar;
        myVar.jpo(this.prr);
        ((TTVideoLandingPageActivity) this).jpo.setWebViewClient(this.aix);
        ((TTVideoLandingPageActivity) this).jpo.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.jpo.cm(this.zz, this.tic, this.ree) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.8
            @Override // com.bytedance.sdk.openadsdk.core.widget.jpo.cm, android.webkit.WebChromeClient
            public void onProgressChanged(WebView webView, int i10) {
                super.onProgressChanged(webView, i10);
                if (TTVideoLandingPageLink2Activity.this.cql && TTVideoLandingPageLink2Activity.this.ota != null && i10 == 100) {
                    TTVideoLandingPageLink2Activity.this.ota.jpo(webView, TTVideoLandingPageLink2Activity.this.f19270pe);
                }
                if (TTVideoLandingPageLink2Activity.this.f19285dn != null) {
                    TTVideoLandingPageLink2Activity.this.f19285dn.jpo(i10);
                }
            }
        });
        TextView textView = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.hna.woc);
        if (textView != null && this.prr.nmd() != null) {
            textView.setText(this.prr.nmd().my());
        }
        dt dtVar2 = this.prr;
        oya.wqx().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.9
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTVideoLandingPageLink2Activity.this.cgn = true;
                    if (TTVideoLandingPageLink2Activity.this.f19285dn != null) {
                        TTVideoLandingPageLink2Activity.this.f19285dn.jd();
                    }
                    TTVideoLandingPageLink2Activity.this.jkt.setVisibility(0);
                    if (TTVideoLandingPageLink2Activity.this.voc != null) {
                        TTVideoLandingPageLink2Activity.this.voc.setVisibility(0);
                    }
                    if (TTVideoLandingPageLink2Activity.this.f19287ii) {
                        return;
                    }
                    TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity = TTVideoLandingPageLink2Activity.this;
                    com.bytedance.sdk.openadsdk.cm.wqx.jpo(tTVideoLandingPageLink2Activity.prr, tTVideoLandingPageLink2Activity.f19277uu, System.currentTimeMillis() - TTVideoLandingPageLink2Activity.this.f19286et, false);
                } catch (Exception unused) {
                }
            }
        }, (dtVar2 == null || dtVar2.nmd() == null) ? 10000L : this.prr.nmd().jpo() * 1000);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        hna();
        if (!this.cgn && this.tic != null && ((TTVideoLandingPageActivity) this).jpo != null && this.f19285dn.getVisibility() == 8) {
            this.tic.jpo(((TTVideoLandingPageActivity) this).jpo);
        }
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prr() {
        com.bytedance.sdk.openadsdk.cm.wqx.jpo(this.prr, "landingpage_split_screen", "click_video", (JSONObject) null);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void jj() {
        if (!qk()) {
            try {
                ImageView imageView = new ImageView(this);
                imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.prr.fri().get(0), imageView, this.prr);
                this.f19268ju.setVisibility(0);
                this.f19268ju.removeAllViews();
                this.f19268ju.addView(imageView);
                imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.5
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        com.bytedance.sdk.openadsdk.cm.wqx.jd(TTVideoLandingPageLink2Activity.this.prr, "landingpage_split_screen");
                    }
                });
                return;
            } catch (Exception unused) {
                return;
            }
        }
        super.jj();
        com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar = this.f19257au;
        if (jjVar != null) {
            if (jjVar.getNativeVideoController() != null) {
                this.f19257au.getNativeVideoController().jpo(false);
                this.f19257au.getNativeVideoController().jj(false);
                this.f19268ju.setClickable(true);
                this.f19268ju.setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.3
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() != 0) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.prr();
                        return false;
                    }
                });
            }
            this.f19257au.getNativeVideoController().jpo(new wqx.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.4
                @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
                public void jpo() {
                }

                @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
                public void jpo(long j10, int i10) {
                }

                @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
                public void jpo(long j10, long j11) {
                    if (TTVideoLandingPageLink2Activity.this.hks != null) {
                        int iMax = (int) Math.max(0L, (j11 - j10) / 1000);
                        TTVideoLandingPageLink2Activity.this.hks.setText(String.valueOf(iMax));
                        if (iMax <= 0) {
                            TTVideoLandingPageLink2Activity.this.hks.setVisibility(8);
                        }
                    }
                }

                @Override // com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
                public void jd(long j10, int i10) {
                }
            });
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void ju() {
        super.ju();
        dt dtVar = this.prr;
        if (dtVar != null) {
            dtVar.yd(true);
        }
        TextView textView = this.rxq;
        if (textView != null) {
            textView.setText(cm());
            this.rxq.setClickable(true);
            this.rxq.setOnClickListener(this.f19264ic);
            this.rxq.setOnTouchListener(this.f19264ic);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public void my() {
        TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity;
        super.my();
        TextView textView = (TextView) findViewById(520093713);
        if (textView != null) {
            textView.setText(com.bytedance.sdk.component.utils.dt.jpo(sq.jpo(), "tt_reward_feedback"));
            textView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.12
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    TTVideoLandingPageLink2Activity.this.oya();
                }
            });
        }
        this.hks = (TextView) findViewById(520093714);
        this.f19285dn = (Cif) findViewById(com.bytedance.sdk.openadsdk.utils.hna.fy);
        this.sbx = findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21527ic);
        this.jkt = findViewById(com.bytedance.sdk.openadsdk.utils.hna.nzb);
        TextView textView2 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21561ya);
        TextView textView3 = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.hna.wcn);
        com.bytedance.sdk.openadsdk.core.widget.sq sqVar = (com.bytedance.sdk.openadsdk.core.widget.sq) findViewById(com.bytedance.sdk.openadsdk.utils.hna.huv);
        this.rxq = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.hna.f21517dn);
        if (this.prr.ou() != null && !TextUtils.isEmpty(this.prr.ou().jpo())) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.prr.ou(), sqVar, this.prr);
        }
        textView2.setText(this.prr.as());
        textView3.setText(this.prr.xp());
        View viewFindViewById = findViewById(com.bytedance.sdk.openadsdk.utils.hna.sbx);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTVideoLandingPageLink2Activity tTVideoLandingPageLink2Activity2 = TTVideoLandingPageLink2Activity.this;
                TTWebsiteActivity.jpo(tTVideoLandingPageLink2Activity2.my, tTVideoLandingPageLink2Activity2.prr, tTVideoLandingPageLink2Activity2.f19277uu);
            }
        });
        if (viewFindViewById instanceof PAGLogoView) {
            ((PAGLogoView) viewFindViewById).initData(this.prr);
        }
        com.bytedance.sdk.component.zz.jj jjVar = ((TTVideoLandingPageActivity) this).jpo;
        if (jjVar != null && jjVar.getWebView() != null) {
            tic.jpo(this.prr, ((TTVideoLandingPageActivity) this).jpo);
        }
        boolean zJr = sq.cm().jr();
        this.cql = zJr;
        if (zJr) {
            ((com.bytedance.sdk.openadsdk.common.oya) findViewById(com.bytedance.sdk.openadsdk.utils.hna.cgn)).setVisibility(0);
            LinearLayout linearLayout = (LinearLayout) findViewById(com.bytedance.sdk.openadsdk.utils.hna.aix);
            this.wad = linearLayout;
            linearLayout.setVisibility(8);
            tTVideoLandingPageLink2Activity = this;
            tTVideoLandingPageLink2Activity.ota = new hna(tTVideoLandingPageLink2Activity, this.wad, ((TTVideoLandingPageActivity) this).jpo, this.prr, "landingpage_split_screen");
            if (((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).jpo.getWebView() != null) {
                ((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).jpo.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.14
                    float jpo = 0.0f;

                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        if (motionEvent.getAction() == 0) {
                            this.jpo = motionEvent.getY();
                        }
                        com.bytedance.sdk.openadsdk.cm.Cif cif = TTVideoLandingPageLink2Activity.this.tic;
                        if (cif != null) {
                            cif.jpo(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.ree != null) {
                            TTVideoLandingPageLink2Activity.this.ree.jpo(motionEvent);
                        }
                        if (motionEvent.getAction() == 2) {
                            float y10 = motionEvent.getY();
                            float f10 = this.jpo;
                            if (y10 - f10 > 8.0f) {
                                if (TTVideoLandingPageLink2Activity.this.ota != null) {
                                    TTVideoLandingPageLink2Activity.this.ota.jpo();
                                }
                                return false;
                            }
                            if (y10 - f10 < -8.0f && TTVideoLandingPageLink2Activity.this.ota != null) {
                                TTVideoLandingPageLink2Activity.this.ota.jd();
                            }
                        }
                        return false;
                    }
                });
            }
        } else {
            tTVideoLandingPageLink2Activity = this;
            if (((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).jpo.getWebView() != null) {
                ((TTVideoLandingPageActivity) tTVideoLandingPageLink2Activity).jpo.getWebView().setOnTouchListener(new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.2
                    @Override // android.view.View.OnTouchListener
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        com.bytedance.sdk.openadsdk.cm.Cif cif = TTVideoLandingPageLink2Activity.this.tic;
                        if (cif != null) {
                            cif.jpo(motionEvent);
                        }
                        if (TTVideoLandingPageLink2Activity.this.ree == null) {
                            return false;
                        }
                        TTVideoLandingPageLink2Activity.this.ree.jpo(motionEvent);
                        return false;
                    }
                });
            }
        }
        Cif cif = tTVideoLandingPageLink2Activity.f19285dn;
        if (cif != null) {
            cif.jpo(tTVideoLandingPageLink2Activity.prr);
        }
    }

    public void oya() {
        if (isFinishing()) {
            return;
        }
        if (this.wcn.get()) {
            sq();
            return;
        }
        if (this.fy == null) {
            opi();
        }
        prr prrVar = this.fy;
        if (prrVar != null) {
            prrVar.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public boolean qk() {
        int i10 = this.f90if;
        return i10 == 5 || i10 == 15 || i10 == 50;
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity
    public View wqx() {
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(this);
        if (Build.VERSION.SDK_INT >= 35) {
            myVar.setFitsSystemWindows(true);
        }
        myVar.setOrientation(1);
        myVar.setBackgroundColor(-1);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.jj.wqx(this);
        myVar.addView(wqxVar, new LinearLayout.LayoutParams(-1, va.jd(this, 220.0f)));
        View wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(this);
        wqxVar2.setId(com.bytedance.sdk.openadsdk.utils.hna.duq);
        wqxVar.addView(wqxVar2, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(this);
        myVar2.setOrientation(0);
        myVar2.setPadding(0, va.jd(this, 20.0f), 0, 0);
        wqxVar.addView(myVar2, new FrameLayout.LayoutParams(-1, -2));
        View view = new View(this);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        layoutParams.weight = 1.0f;
        myVar2.addView(view, layoutParams);
        com.bytedance.sdk.openadsdk.core.widget.prr prrVar = new com.bytedance.sdk.openadsdk.core.widget.prr(this);
        prrVar.setId(520093713);
        prrVar.setGravity(17);
        prrVar.setText(com.bytedance.sdk.component.utils.dt.jpo(this, "tt_reward_feedback"));
        prrVar.setTextColor(-1);
        prrVar.setTextSize(2, 14.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, va.jd(this, 28.0f));
        int iJd = va.jd(this, 16.0f);
        layoutParams2.rightMargin = iJd;
        layoutParams2.leftMargin = iJd;
        myVar2.addView(prrVar, layoutParams2);
        com.bytedance.sdk.openadsdk.core.widget.oya oyaVar = new com.bytedance.sdk.openadsdk.core.widget.oya(this);
        oyaVar.setId(com.bytedance.sdk.openadsdk.utils.hna.f21516dm);
        oyaVar.setPadding(va.jd(this, 7.0f), va.jd(this, 7.0f), va.jd(this, 7.0f), va.jd(this, 7.0f));
        oyaVar.setImageResource(com.bytedance.sdk.component.utils.dt.cm(this, "tt_video_close_drawable"));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(va.jd(this, 28.0f), va.jd(this, 28.0f));
        layoutParams3.rightMargin = va.jd(this, 12.0f);
        myVar2.addView(oyaVar, layoutParams3);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(this);
        qkVar.setVisibility(8);
        qkVar.setId(com.bytedance.sdk.openadsdk.utils.hna.tic);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = va.jd(this, 10.0f);
        myVar.addView(qkVar, layoutParams4);
        com.bytedance.sdk.openadsdk.core.widget.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.widget.jpo(this);
        jpoVar.setId(com.bytedance.sdk.openadsdk.utils.hna.f21555va);
        jpoVar.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        jpoVar.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(va.jd(this, 44.0f), va.jd(this, 44.0f));
        layoutParams5.addRule(9);
        layoutParams5.leftMargin = va.jd(this, 5.0f);
        qkVar.addView(jpoVar, layoutParams5);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(this);
        int i10 = com.bytedance.sdk.openadsdk.utils.hna.vrc;
        xykVar.setId(i10);
        xykVar.setBackground(ju.jpo(this, "tt_circle_solid_mian"));
        xykVar.setGravity(17);
        xykVar.setTextColor(-1);
        xykVar.setTextSize(2, 19.0f);
        xykVar.setTypeface(Typeface.DEFAULT_BOLD);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(va.jd(this, 44.0f), va.jd(this, 44.0f));
        layoutParams6.addRule(9);
        layoutParams6.leftMargin = va.jd(this, 5.0f);
        qkVar.addView(xykVar, layoutParams6);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(this);
        xykVar2.setId(com.bytedance.sdk.openadsdk.utils.hna.roc);
        xykVar2.setMaxLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar2.setEllipsize(truncateAt);
        xykVar2.setTextColor(Color.parseColor("#e5000000"));
        xykVar2.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParamsE = e2.e(-2, -2, 15);
        layoutParamsE.leftMargin = va.jd(this, 5.0f);
        layoutParamsE.rightMargin = va.jd(this, 80.0f);
        layoutParamsE.addRule(1, i10);
        qkVar.addView(xykVar2, layoutParamsE);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(this);
        xykVar3.setId(com.bytedance.sdk.openadsdk.utils.hna.f21543pe);
        xykVar3.setClickable(true);
        xykVar3.setMaxLines(1);
        xykVar3.setEllipsize(truncateAt);
        xykVar3.setFocusable(true);
        xykVar3.setGravity(17);
        xykVar3.setText(com.bytedance.sdk.component.utils.dt.jpo(this, "tt_video_mobile_go_detail"));
        xykVar3.setTextColor(-1);
        xykVar3.setTextSize(2, 14.0f);
        xykVar3.setPadding(va.jd(this, 2.0f), va.jd(this, 2.0f), va.jd(this, 2.0f), va.jd(this, 2.0f));
        xykVar3.setBackground(ju.jpo(this, "tt_ad_cover_btn_begin_bg"));
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(va.jd(this, 90.0f), va.jd(this, 36.0f));
        layoutParams7.addRule(11);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = va.jd(this, 5.0f);
        qkVar.addView(xykVar3, layoutParams7);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar3 = new com.bytedance.sdk.openadsdk.core.jj.wqx(this);
        myVar.addView(wqxVar3, new LinearLayout.LayoutParams(-1, -1));
        View jjVar = new com.bytedance.sdk.component.zz.jj(this);
        jjVar.setId(com.bytedance.sdk.openadsdk.utils.hna.xk);
        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams8.topMargin = va.jd(this, 2.0f);
        wqxVar3.addView(jjVar, layoutParams8);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar2 = new com.bytedance.sdk.openadsdk.core.jj.qk(this);
        qkVar2.setId(com.bytedance.sdk.openadsdk.utils.hna.f21527ic);
        qkVar2.setBackgroundColor(Color.parseColor("#F8F8F8"));
        wqxVar3.addView(qkVar2, new FrameLayout.LayoutParams(-1, -1));
        View cif = new Cif(this);
        cif.setId(com.bytedance.sdk.openadsdk.utils.hna.fy);
        qkVar2.addView(cif, new RelativeLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.my myVar3 = new com.bytedance.sdk.openadsdk.core.jj.my(this);
        myVar3.setId(com.bytedance.sdk.openadsdk.utils.hna.nzb);
        myVar3.setOrientation(1);
        myVar3.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.addRule(13);
        qkVar2.addView(myVar3, layoutParams9);
        com.bytedance.sdk.openadsdk.core.widget.sq sqVar = new com.bytedance.sdk.openadsdk.core.widget.sq(this);
        sqVar.setId(com.bytedance.sdk.openadsdk.utils.hna.huv);
        LinearLayout.LayoutParams layoutParams10 = new LinearLayout.LayoutParams(va.jd(this, 80.0f), va.jd(this, 80.0f));
        layoutParams10.gravity = 17;
        myVar3.addView(sqVar, layoutParams10);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar4 = new com.bytedance.sdk.openadsdk.core.jj.xyk(this);
        xykVar4.setId(com.bytedance.sdk.openadsdk.utils.hna.f21561ya);
        xykVar4.setTextColor(Color.parseColor("#161823"));
        xykVar4.setTextSize(0, va.jd(this, 24.0f));
        LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams11.gravity = 17;
        layoutParams11.topMargin = va.jd(this, 12.0f);
        myVar3.addView(xykVar4, layoutParams11);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar5 = new com.bytedance.sdk.openadsdk.core.jj.xyk(this);
        xykVar5.setId(com.bytedance.sdk.openadsdk.utils.hna.wcn);
        xykVar5.setTextColor(Color.parseColor("#80161823"));
        xykVar5.setTextSize(0, va.jd(this, 16.0f));
        xykVar5.setTextAlignment(4);
        LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams12.gravity = 17;
        int iJd2 = va.jd(this, 60.0f);
        layoutParams12.rightMargin = iJd2;
        layoutParams12.leftMargin = iJd2;
        layoutParams12.topMargin = va.jd(this, 8.0f);
        myVar3.addView(xykVar5, layoutParams12);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar6 = new com.bytedance.sdk.openadsdk.core.jj.xyk(this);
        xykVar6.setId(com.bytedance.sdk.openadsdk.utils.hna.f21517dn);
        xykVar6.setGravity(17);
        xykVar6.setTextColor(-1);
        xykVar6.setText(com.bytedance.sdk.component.utils.dt.jpo(this, "tt_video_mobile_go_detail"));
        xykVar6.setBackground(ju.jpo(this, "tt_reward_video_download_btn_bg"));
        LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(va.jd(this, 255.0f), va.jd(this, 44.0f));
        layoutParams13.gravity = 17;
        layoutParams13.topMargin = va.jd(this, 32.0f);
        myVar3.addView(xykVar6, layoutParams13);
        PAGLogoView pAGLogoView = new PAGLogoView(this);
        this.voc = pAGLogoView;
        pAGLogoView.setId(com.bytedance.sdk.openadsdk.utils.hna.sbx);
        this.voc.setVisibility(8);
        RelativeLayout.LayoutParams layoutParams14 = new RelativeLayout.LayoutParams(-2, va.jd(this, 14.0f));
        layoutParams14.addRule(12);
        layoutParams14.leftMargin = va.jd(this, 18.0f);
        layoutParams14.bottomMargin = va.jd(this, 61.0f);
        qkVar2.addView(this.voc, layoutParams14);
        View oyaVar2 = new com.bytedance.sdk.openadsdk.common.oya(this, new oya.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.10
            @Override // com.bytedance.sdk.openadsdk.common.oya.jpo
            public View jpo(Context context) {
                return new com.bytedance.sdk.openadsdk.common.qk(context);
            }
        });
        oyaVar2.setId(com.bytedance.sdk.openadsdk.utils.hna.jkt);
        FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, va.jd(this, 48.0f));
        layoutParams15.gravity = 81;
        wqxVar3.addView(oyaVar2, layoutParams15);
        View oyaVar3 = new com.bytedance.sdk.openadsdk.common.oya(this, new oya.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity.11
            @Override // com.bytedance.sdk.openadsdk.common.oya.jpo
            public View jpo(Context context) {
                return new com.bytedance.sdk.openadsdk.common.xyk(context);
            }
        });
        oyaVar3.setId(com.bytedance.sdk.openadsdk.utils.hna.cgn);
        FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, va.jd(this, 44.0f));
        layoutParams16.gravity = 80;
        wqxVar3.addView(oyaVar3, layoutParams16);
        return myVar;
    }
}
