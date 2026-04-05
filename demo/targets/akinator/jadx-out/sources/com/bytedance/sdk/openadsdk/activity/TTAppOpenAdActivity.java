package com.bytedance.sdk.openadsdk.activity;

import android.R;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import android.view.DisplayCutout;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.TTAdDislikeToast;
import com.bytedance.sdk.openadsdk.common.prr;
import com.bytedance.sdk.openadsdk.core.au.cm.jpo;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.oya;
import com.bytedance.sdk.openadsdk.core.pdm;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.hmu.jd.my;
import com.bytedance.sdk.openadsdk.utils.dm;
import com.bytedance.sdk.openadsdk.utils.duq;
import com.bytedance.sdk.openadsdk.utils.va;
import com.ironsource.C3191e4;
import com.ironsource.Mf;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class TTAppOpenAdActivity extends TTBaseActivity implements hx.jpo, jpo.InterfaceC0111jpo {
    private static com.bytedance.sdk.openadsdk.jpo.cm.jd zz;

    /* renamed from: au, reason: collision with root package name */
    private TTAdDislikeToast f19149au;

    /* renamed from: dt, reason: collision with root package name */
    private IListenerManager f19151dt;
    private com.bytedance.sdk.openadsdk.jpo.cm.jd hmu;
    private com.bytedance.sdk.openadsdk.cm.qk hna;

    /* renamed from: hx, reason: collision with root package name */
    private int f19153hx;

    /* renamed from: if, reason: not valid java name */
    private prr f84if;

    /* renamed from: jr, reason: collision with root package name */
    private boolean f19156jr;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.jj.jd f19157ju;
    private int nmd;
    private float opi;
    private FrameLayout pdm;

    /* renamed from: rq, reason: collision with root package name */
    private String f19160rq;

    /* renamed from: rv, reason: collision with root package name */
    private boolean f19161rv;

    /* renamed from: se, reason: collision with root package name */
    private int f19162se;

    /* renamed from: sq, reason: collision with root package name */
    private float f19163sq;
    private AdSlot sz;

    /* renamed from: tu, reason: collision with root package name */
    private dt f19164tu;

    /* renamed from: uu, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.component.wqx f19165uu;
    protected final AtomicBoolean jpo = new AtomicBoolean(false);

    /* renamed from: jd, reason: collision with root package name */
    protected final hx f19154jd = new hx(Looper.getMainLooper(), this);
    final AtomicBoolean wqx = new AtomicBoolean(false);

    /* renamed from: cm, reason: collision with root package name */
    final AtomicBoolean f19150cm = new AtomicBoolean(false);

    /* renamed from: yd, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.xyk.jpo f19166yd = new com.bytedance.sdk.openadsdk.component.xyk.jpo();
    protected boolean my = false;
    private final AtomicBoolean oya = new AtomicBoolean(false);
    private dm prr = dm.wqx();

    /* renamed from: nq, reason: collision with root package name */
    private final AtomicBoolean f19158nq = new AtomicBoolean(false);

    /* renamed from: jj, reason: collision with root package name */
    long f19155jj = 0;
    private volatile boolean kln = false;

    /* renamed from: qk, reason: collision with root package name */
    int f19159qk = -1;

    /* renamed from: ef, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.component.jpo f19152ef = new com.bytedance.sdk.openadsdk.component.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.1
        @Override // com.bytedance.sdk.openadsdk.component.jpo
        public void cm() {
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo, com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
        public void jd(long j10, int i10) {
            com.bytedance.sdk.openadsdk.component.xyk.wqx wqxVarQk;
            StringBuilder sb2 = new StringBuilder("onError() called with: totalPlayTime = [");
            sb2.append(j10);
            sb2.append("], percent = [");
            sb2.append(i10);
            sb2.append(C3191e4.i.f36531e);
            if (TTAppOpenAdActivity.this.f19165uu != null && (wqxVarQk = TTAppOpenAdActivity.this.f19165uu.qk()) != null) {
                TTAppOpenAdActivity.this.nq();
                wqxVarQk.jpo(true);
            }
            TTAppOpenAdActivity.this.dt();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo, com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
        public void jpo() {
            TTAppOpenAdActivity.this.nq();
            TTAppOpenAdActivity.this.dt();
            TTAppOpenAdActivity.this.finish();
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo
        public void my() {
            TTAppOpenAdActivity.this.tu();
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo
        public void wqx() {
            TTAppOpenAdActivity.this.xyk();
            TTAppOpenAdActivity.this.prr.my();
            TTAppOpenAdActivity.this.nmd();
            if (TTAppOpenAdActivity.this.f19156jr) {
                TTAppOpenAdActivity.this.oya();
            }
            if (TTAppOpenAdActivity.this.f19165uu.qk() == null || TTAppOpenAdActivity.this.f19165uu.qk().jd() == null) {
                return;
            }
            TTAppOpenAdActivity.this.f19165uu.qk().jd().jpo(TTAppOpenAdActivity.this);
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo, com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx.jpo
        public void jpo(long j10, long j11) {
            TTAppOpenAdActivity.this.f19166yd.jd(j10);
            TTAppOpenAdActivity tTAppOpenAdActivity = TTAppOpenAdActivity.this;
            if (!tTAppOpenAdActivity.my && tTAppOpenAdActivity.f19165uu != null && TTAppOpenAdActivity.this.f19165uu.qk() != null && TTAppOpenAdActivity.this.f19165uu.qk().my()) {
                TTAppOpenAdActivity.this.f19165uu.qk().xyk();
            }
            TTAppOpenAdActivity.this.prr();
            if (TTAppOpenAdActivity.this.f19165uu instanceof com.bytedance.sdk.openadsdk.component.jd) {
                ((com.bytedance.sdk.openadsdk.component.jd) TTAppOpenAdActivity.this.f19165uu).jpo(j10, j11);
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo, com.bytedance.sdk.openadsdk.component.jj.jpo
        public void jd(View view) {
            TTAppOpenAdActivity.this.wqx();
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo, com.bytedance.sdk.openadsdk.component.jj.jpo
        public void jd() {
            TTAppOpenAdActivity.this.kln = true;
            if (com.bytedance.sdk.openadsdk.rq.jpo.jpo("splash_auto_close_switch", 0) == 0) {
                TTAppOpenAdActivity.this.zz();
                TTAppOpenAdActivity.this.finish();
            }
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo, com.bytedance.sdk.openadsdk.component.jj.jpo
        public void jpo(View view) throws JSONException {
            TTAppOpenAdActivity.this.hmu();
        }

        @Override // com.bytedance.sdk.openadsdk.component.jpo, com.bytedance.sdk.openadsdk.component.jj.jpo
        public void jpo(int i10, boolean z10) {
            if (TTAppOpenAdActivity.this.f19165uu != null) {
                TTAppOpenAdActivity.this.f19165uu.jpo(i10, z10);
            }
        }
    };
    private final Runnable nzb = new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.5
        @Override // java.lang.Runnable
        public void run() throws JSONException {
            com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
            com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
            if (TTAppOpenAdActivity.this.oya.get()) {
                return;
            }
            if (TTAppOpenAdActivity.this.f19164tu != null && (cmVarKc = TTAppOpenAdActivity.this.f19164tu.kc()) != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                cmVarJpo.jpo(0L);
            }
            TTAppOpenAdActivity.this.hna = new com.bytedance.sdk.openadsdk.cm.qk();
            TTAppOpenAdActivity.this.hna.jpo(System.currentTimeMillis(), 1.0f);
            TTAppOpenAdActivity.this.prr.my();
            if (TTAppOpenAdActivity.this.f19157ju != null) {
                TTAppOpenAdActivity.this.f19157ju.jd();
            }
            if (TTAppOpenAdActivity.this.f19165uu != null) {
                TTAppOpenAdActivity.this.f19165uu.my();
            }
            TTAppOpenAdActivity.this.rq();
            View viewFindViewById = TTAppOpenAdActivity.this.findViewById(R.id.content);
            JSONObject jSONObject = new JSONObject();
            if (viewFindViewById != null) {
                try {
                    jSONObject.put("width", viewFindViewById.getWidth());
                    jSONObject.put("height", viewFindViewById.getHeight());
                    jSONObject.put("alpha", viewFindViewById.getAlpha());
                } catch (JSONException e10) {
                    Log.e("TTAppOpenAdActivity", "run: ", e10);
                    TTAppOpenAdActivity.this.finish();
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("root_view", jSONObject.toString());
            jSONObject2.put("ad_root", TTAppOpenAdActivity.this.f19162se);
            jSONObject2.put("openad_creative_type", TTAppOpenAdActivity.this.f19156jr ? "video_normal_ad" : "image_normal_ad");
            if (com.bytedance.sdk.openadsdk.component.zz.xyk.wqx() == null) {
                jSONObject2.put("appicon_acquirefail", "1");
            }
            if (TTAppOpenAdActivity.this.f19161rv || TTAppOpenAdActivity.this.f19164tu.jfy()) {
                jSONObject2.put("dynamic_show_type", TTAppOpenAdActivity.this.jr());
                TTAppOpenAdActivity.this.jpo(jSONObject2);
            }
            jSONObject2.put("is_icon_only", TTAppOpenAdActivity.this.f19164tu.se() ? 1 : 0);
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(TTAppOpenAdActivity.this.f19164tu, "open_ad", jSONObject2, (JSONObject) null);
            com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(TTAppOpenAdActivity.this.findViewById(R.id.content), TTAppOpenAdActivity.this.f19164tu, new my.jpo(TTAppOpenAdActivity.this.jr()));
            com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(TTAppOpenAdActivity.this.f19164tu);
            TTAppOpenAdActivity.this.oya.set(true);
        }
    };

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public boolean jpo() {
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        va.jpo((Activity) this);
        getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i10) {
                if (i10 == 0) {
                    try {
                        if (TTAppOpenAdActivity.this.isFinishing()) {
                            return;
                        }
                        TTAppOpenAdActivity.this.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.7.1
                            @Override // java.lang.Runnable
                            public void run() {
                                va.jpo((Activity) TTAppOpenAdActivity.this);
                            }
                        }, 2500L);
                    } catch (Exception e10) {
                        nmd.wqx("TTAppOpenAdActivity", e10.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.app.Activity
    public void onBackPressed() throws JSONException {
        opi();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        sq.jd(getApplicationContext());
        if (!jd(bundle)) {
            finish();
            return;
        }
        if (!oya.my()) {
            finish();
            return;
        }
        if (bundle != null) {
            com.bytedance.sdk.openadsdk.cm.wqx.jd(this.f19164tu, "open_ad", (JSONObject) null, (JSONObject) null);
        }
        this.f19156jr = dt.my(this.f19164tu);
        new StringBuilder("onCreate: isVideo is ").append(this.f19156jr);
        if (this.f19156jr) {
            this.f19166yd.jpo((float) this.f19164tu.ww().jj());
        } else {
            this.f19166yd.jpo(sq.cm().tu(String.valueOf(this.nmd)));
        }
        com.bytedance.sdk.openadsdk.component.jj.jd jdVar = new com.bytedance.sdk.openadsdk.component.jj.jd(this.f19166yd);
        this.f19157ju = jdVar;
        jdVar.jpo(this.f19152ef);
        yd();
        FrameLayout frameLayout = new FrameLayout(this);
        this.pdm = frameLayout;
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        try {
            setContentView(this.pdm);
            this.pdm.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.2
                /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public void run() {
                    /*
                        r10 = this;
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.dt r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.oya(r0)     // Catch: java.lang.Throwable -> L23
                        int r0 = r0.tl()     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.dt r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.oya(r1)     // Catch: java.lang.Throwable -> L23
                        if (r2 == 0) goto L26
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.dt r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.oya(r2)     // Catch: java.lang.Throwable -> L23
                        int r2 = r2.cql()     // Catch: java.lang.Throwable -> L23
                        r3 = 2
                        if (r2 != r3) goto L26
                        r2 = 1
                        if (r0 == r2) goto L26
                        goto L27
                    L23:
                        r0 = move-exception
                        goto Lc8
                    L26:
                        r2 = 0
                    L27:
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.jd(r1, r2)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        boolean r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.prr(r0)     // Catch: java.lang.Throwable -> L23
                        if (r0 == 0) goto L65
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.jd r1 = new com.bytedance.sdk.openadsdk.component.jd     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.dt r3 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.oya(r2)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        android.widget.FrameLayout r4 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.hna(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.jpo r5 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.sq(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        int r6 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.opi(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        boolean r7 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.ju(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.xyk.jpo r8 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.cm(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.jj.jd r9 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.jr(r0)     // Catch: java.lang.Throwable -> L23
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.jpo(r2, r1)     // Catch: java.lang.Throwable -> L23
                        goto La6
                    L65:
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.wqx r1 = new com.bytedance.sdk.openadsdk.component.wqx     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.core.model.dt r3 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.oya(r2)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        android.widget.FrameLayout r4 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.hna(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.jpo r5 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.sq(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        int r6 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.opi(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        boolean r7 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.ju(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.xyk.jpo r8 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.cm(r0)     // Catch: java.lang.Throwable -> L23
                        r1.<init>(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.jpo(r2, r1)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.wqx r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.jpo(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        float r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.nmd(r1)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        float r2 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.rq(r2)     // Catch: java.lang.Throwable -> L23
                        r0.jpo(r1, r2)     // Catch: java.lang.Throwable -> L23
                    La6:
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.wqx r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.jpo(r0)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        android.widget.FrameLayout r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.hna(r1)     // Catch: java.lang.Throwable -> L23
                        r0.jpo(r1)     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.wqx r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.jpo(r0)     // Catch: java.lang.Throwable -> L23
                        r0.jpo()     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this     // Catch: java.lang.Throwable -> L23
                        com.bytedance.sdk.openadsdk.component.wqx r0 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.jpo(r0)     // Catch: java.lang.Throwable -> L23
                        r0.jd()     // Catch: java.lang.Throwable -> L23
                        return
                    Lc8:
                        com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity r1 = com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.this
                        r1.finish()
                        java.lang.String r1 = "TTAppOpenAdActivity"
                        java.lang.String r0 = r0.getMessage()
                        com.bytedance.sdk.component.utils.nmd.wqx(r1, r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.AnonymousClass2.run():void");
                }
            });
            try {
                final View decorView = getWindow().getDecorView();
                if (Build.VERSION.SDK_INT >= 35) {
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.3
                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                            List<Rect> boundingRects;
                            try {
                                DisplayCutout displayCutout = windowInsets.getDisplayCutout();
                                if (displayCutout != null && (boundingRects = displayCutout.getBoundingRects()) != null && !boundingRects.isEmpty()) {
                                    decorView.setPadding(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                                }
                            } catch (Throwable unused) {
                            }
                            return windowInsets;
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            com.bytedance.sdk.openadsdk.prr.wqx.jd();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() throws JSONException {
        super.onDestroy();
        if (this.f19164tu != null) {
            com.bytedance.sdk.openadsdk.jj.jd.jpo().jpo("videoForceBreak", this.f19164tu);
        }
        this.f19154jd.removeCallbacksAndMessages(null);
        com.bytedance.sdk.openadsdk.component.jj.jd jdVar = this.f19157ju;
        if (jdVar != null) {
            jdVar.my();
        }
        com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.f19164tu);
        com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jd(this.f19164tu);
        if (this.f19156jr) {
            com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(this.f19164tu, this.f19166yd.wqx(), this.f19166yd.jd(), true);
        } else {
            com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(this.f19164tu, -1L, this.f19166yd.jd(), false);
        }
        if (this.prr.jj() && this.oya.get()) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(String.valueOf(this.prr.cm()), this.f19164tu, "open_ad", this.hna);
            this.prr = dm.wqx();
        }
        com.bytedance.sdk.openadsdk.component.wqx wqxVar = this.f19165uu;
        if (wqxVar != null) {
            wqxVar.wqx();
        }
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("recycleRes");
        }
        zz();
        zz = null;
        this.hmu = null;
        prr prrVar = this.f84if;
        if (prrVar != null) {
            prrVar.setCallback(null);
        }
        dt dtVar = this.f19164tu;
        if (dtVar == null || dt.qk(dtVar) || this.f19164tu.rf()) {
            return;
        }
        com.bytedance.sdk.openadsdk.component.jj.jpo(sq.jpo()).jpo(this.sz);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        super.onPause();
        this.my = false;
        my();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        com.bytedance.sdk.openadsdk.component.wqx wqxVar;
        super.onResume();
        this.my = true;
        if (this.jpo.getAndSet(true)) {
            if (!this.f19158nq.get()) {
                cm();
                return;
            }
            dt();
            if (this.f19156jr && (wqxVar = this.f19165uu) != null && wqxVar.qk() != null) {
                nq();
                this.f19165uu.qk().jpo(3);
            }
            finish();
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            int iJpo = this.f19164tu != null ? pdm.jpo().jpo(this.f19164tu) : -1;
            this.f19159qk = iJpo;
            bundle.putInt("meta_index", iJpo);
            bundle.putString(TTAdConstant.MULTI_PROCESS_META_MD5, this.f19160rq);
            bundle.putInt("ad_source", this.f19162se);
            bundle.putLong("start_show_time", this.f19155jj);
        } catch (Throwable th2) {
            nmd.wqx("TTAppOpenAdActivity", th2.getMessage());
        }
        zz = this.hmu;
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.f19159qk >= 0) {
            pdm.jpo().wqx(this.f19159qk);
            this.f19159qk = -1;
        }
        com.bytedance.sdk.openadsdk.utils.cm.jpo(this, this.f19164tu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (!this.f19161rv) {
                this.prr.my();
            }
            dt dtVar = this.f19164tu;
            if (dtVar != null && dtVar.mc() && !this.f19164tu.dt()) {
                this.f19164tu.jj(true);
                dt dtVar2 = this.f19164tu;
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(dtVar2, "open_ad", dtVar2.sj());
            }
        } else if (this.oya.get()) {
            if (this.prr.jj()) {
                com.bytedance.sdk.openadsdk.cm.wqx.jpo(String.valueOf(this.prr.cm()), this.f19164tu, "open_ad", this.hna);
            }
            this.prr = dm.wqx();
        }
        com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(this.f19164tu, z10 ? 4 : 8);
        com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(this.f19164tu, z10);
    }

    private void au() {
        if (this.f84if == null) {
            prr prrVar = new prr(this, this.f19164tu);
            this.f84if = prrVar;
            prrVar.setDislikeSource("video_player");
            this.f84if.setCallback(new prr.jpo() { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.4
                @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                public void jd(View view) {
                    TTAppOpenAdActivity.this.wqx.set(false);
                    TTAppOpenAdActivity.this.cm();
                    com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(TTAppOpenAdActivity.this.f19164tu, 4);
                }

                @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                public void jpo(View view) {
                    TTAppOpenAdActivity.this.wqx.set(true);
                    TTAppOpenAdActivity.this.my();
                    com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(TTAppOpenAdActivity.this.f19164tu, 8);
                }

                @Override // com.bytedance.sdk.openadsdk.common.prr.jpo
                public void jpo(FilterWord filterWord) {
                    if (TTAppOpenAdActivity.this.f19150cm.get() || filterWord == null || filterWord.hasSecondOptions()) {
                        return;
                    }
                    TTAppOpenAdActivity.this.f19150cm.set(true);
                    TTAppOpenAdActivity.this.sq();
                }
            });
        }
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.content);
        frameLayout.addView(this.f84if);
        if (this.f19149au == null) {
            TTAdDislikeToast tTAdDislikeToast = new TTAdDislikeToast(this);
            this.f19149au = tTAdDislikeToast;
            frameLayout.addView(tTAdDislikeToast);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dt() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdSkip");
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.cm.jd jdVar = this.hmu;
        if (jdVar != null) {
            jdVar.jd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hmu() throws JSONException {
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        com.bytedance.sdk.openadsdk.component.wqx wqxVar;
        com.bytedance.sdk.openadsdk.core.hx.wqx(this.nmd);
        dt();
        if (this.f19156jr && (wqxVar = this.f19165uu) != null && wqxVar.qk() != null) {
            nq();
            this.f19165uu.qk().jpo(4);
        }
        com.bytedance.sdk.openadsdk.component.cm.jpo.jpo(this.f19164tu, (int) this.f19166yd.wqx(), this.f19157ju.jpo(), this.f19166yd.jd());
        dt dtVar = this.f19164tu;
        if (dtVar != null && (cmVarKc = dtVar.kc()) != null && (cmVarJpo = cmVarKc.jpo()) != null) {
            com.bytedance.sdk.openadsdk.component.wqx wqxVar2 = this.f19165uu;
            long jAu = (wqxVar2 == null || wqxVar2.qk() == null) ? 0L : this.f19165uu.qk().au();
            cmVarJpo.jj(jAu);
            cmVarJpo.my(jAu);
        }
        finish();
    }

    private void hna() {
        this.f19149au.show(TTAdDislikeToast.getDislikeTip());
    }

    /* renamed from: if, reason: not valid java name */
    private void m424if() {
        if (this.f19153hx != 2) {
            setRequestedOrientation(1);
        } else if (qk()) {
            setRequestedOrientation(8);
        } else {
            setRequestedOrientation(0);
        }
        if (this.f19153hx == 2 || !va.wqx((Activity) this)) {
            getWindow().addFlags(1024);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int jr() {
        if (this.f19164tu.jfy()) {
            return 5;
        }
        if (this.f19161rv) {
            return this.f19165uu.cm();
        }
        return -1;
    }

    private void ju() {
        int iMin;
        int iMax;
        new StringBuilder("changeScreenOrientation: mOrientation=").append(this.f19153hx);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 != 26) {
            if (i10 == 27) {
                try {
                    m424if();
                } catch (Throwable th2) {
                    nmd.wqx("TTAppOpenAdActivity", th2.getMessage());
                    return;
                }
            } else {
                m424if();
            }
        }
        Pair<Integer, Integer> pairJu = va.ju(getApplicationContext());
        if (this.f19153hx == 2) {
            iMin = Math.max(((Integer) pairJu.first).intValue(), ((Integer) pairJu.second).intValue());
            iMax = Math.min(((Integer) pairJu.first).intValue(), ((Integer) pairJu.second).intValue());
        } else {
            iMin = Math.min(((Integer) pairJu.first).intValue(), ((Integer) pairJu.second).intValue());
            iMax = Math.max(((Integer) pairJu.first).intValue(), ((Integer) pairJu.second).intValue());
        }
        this.f19163sq = iMax;
        this.opi = iMin;
        float fJpo = va.jpo();
        if (va.wqx((Activity) this)) {
            int i11 = this.f19153hx;
            if (i11 == 1) {
                this.f19163sq -= fJpo;
            } else if (i11 == 2) {
                this.opi -= fJpo;
            }
        }
        com.bytedance.sdk.openadsdk.component.wqx wqxVar = this.f19165uu;
        if (wqxVar != null) {
            wqxVar.jpo(this.opi, this.f19163sq);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nmd() {
        if (this.oya.get()) {
            return;
        }
        try {
            getWindow().getDecorView().post(this.nzb);
        } catch (Throwable unused) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nq() {
        dt dtVar;
        try {
            if (this.f19157ju == null || (dtVar = this.f19164tu) == null || dtVar.fmg() == null) {
                return;
            }
            int iJd = this.f19164tu.fmg().jd();
            if (iJd == 1 || iJd == 2) {
                this.f19157ju.jpo(iJd, this.f19164tu.fmg().jpo(), false);
                com.bytedance.sdk.openadsdk.component.wqx wqxVar = this.f19165uu;
                if (wqxVar == null || wqxVar.qk() == null) {
                    return;
                }
                this.f19165uu.qk().jd().jpo(this.f19166yd.jpo());
                this.f19165uu.qk().jd().jpo(1.0f);
            }
        } catch (Throwable th2) {
            nmd.wqx("TTAppOpenAdActivity", th2.getMessage());
        }
    }

    private void opi() throws JSONException {
        if (sq.cm().nmd(String.valueOf(this.nmd)) == 1) {
            if (this.f19166yd.wqx() >= sq.cm().rq(String.valueOf(this.nmd)) * 1000) {
                hmu();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oya() {
        if (!this.f19156jr || this.f19164tu.se() || this.kln) {
            return;
        }
        this.f19154jd.sendEmptyMessageDelayed(100, 5000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prr() {
        if (!this.f19156jr || this.f19164tu.se()) {
            return;
        }
        this.f19154jd.removeMessages(100);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void rq() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdShow");
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.cm.jd jdVar = this.hmu;
        if (jdVar != null) {
            jdVar.jpo();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sq() {
        this.f19149au.show(TTAdDislikeToast.getDislikeSendTip());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void tu() {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo(Mf.f34998f);
        } else {
            com.bytedance.sdk.openadsdk.jpo.cm.jd jdVar = this.hmu;
            if (jdVar != null) {
                jdVar.onAdClicked();
            }
        }
        if (au.jrx().dt(String.valueOf(this.nmd))) {
            this.f19158nq.set(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xyk() {
        Log.d("TTAppOpenAdActivity", "startCountDownTimer() called");
        dt dtVar = this.f19164tu;
        int iRq = (dtVar == null || dtVar.jd() < 0) ? sq.cm().rq(String.valueOf(this.nmd)) : this.f19164tu.jd();
        this.f19157ju.jpo(this.f19166yd.jd());
        this.f19157ju.jd(iRq);
    }

    private void yd() {
        if (26 != Build.VERSION.SDK_INT) {
            this.f19153hx = this.f19164tu.ll();
        } else if (getResources().getConfiguration().orientation == 1) {
            this.f19153hx = 1;
        } else {
            this.f19153hx = 2;
        }
        ju();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zz() {
        nmd.jpo("TTAppOpenAdActivity", "invoke callback onAdDismiss, ".concat(String.valueOf(this)));
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            jpo("onAdTimeOver");
            return;
        }
        com.bytedance.sdk.openadsdk.jpo.cm.jd jdVar = this.hmu;
        if (jdVar != null) {
            jdVar.wqx();
        }
    }

    public void cm() {
        if (this.wqx.get()) {
            return;
        }
        if (this.f19156jr) {
            com.bytedance.sdk.openadsdk.component.wqx wqxVar = this.f19165uu;
            if (wqxVar != null && wqxVar.qk() != null && this.f19165uu.qk().jj()) {
                this.f19165uu.qk().ju();
            }
            oya();
        }
        com.bytedance.sdk.openadsdk.component.jj.jd jdVar = this.f19157ju;
        if (jdVar != null) {
            jdVar.wqx();
        }
    }

    public IListenerManager jj() {
        if (this.f19151dt == null) {
            this.f19151dt = IListenerManager.Stub.asInterface(com.bytedance.sdk.openadsdk.multipro.aidl.jpo.jpo().jpo(7));
        }
        return this.f19151dt;
    }

    public void my() {
        if (this.f19156jr) {
            com.bytedance.sdk.openadsdk.component.wqx wqxVar = this.f19165uu;
            if (wqxVar != null && wqxVar.qk() != null && this.f19165uu.qk().my()) {
                this.f19165uu.qk().xyk();
            }
            prr();
        }
        com.bytedance.sdk.openadsdk.component.jj.jd jdVar = this.f19157ju;
        if (jdVar != null) {
            jdVar.cm();
        }
    }

    public boolean qk() {
        try {
            return getIntent().getIntExtra("orientation_angle", 0) == 3;
        } catch (Exception e10) {
            nmd.wqx("TTAppOpenAdActivity", e10.getMessage());
            return false;
        }
    }

    public void wqx() {
        if (isFinishing()) {
            return;
        }
        if (this.f19150cm.get()) {
            hna();
            return;
        }
        if (this.f84if == null) {
            try {
                au();
            } catch (Throwable th2) {
                ApmHelper.reportCustomError("initDislike error", "TTAppOpenAdActivity", th2);
            }
        }
        prr prrVar = this.f84if;
        if (prrVar != null) {
            prrVar.jpo();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public void jd() throws JSONException {
        opi();
    }

    private boolean jd(Bundle bundle) {
        if (com.bytedance.sdk.openadsdk.multipro.jd.wqx()) {
            Intent intent = getIntent();
            if (intent != null) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.f19164tu = com.bytedance.sdk.openadsdk.core.jd.jpo(new JSONObject(stringExtra));
                    } catch (Exception e10) {
                        nmd.wqx("TTAppOpenAdActivity", "open_ad", "initData MultiGlobalInfo throws ", e10);
                    }
                }
                this.f19160rq = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_META_MD5);
            }
        } else {
            this.f19164tu = pdm.jpo().jpo(pdm.jpo(getIntent()));
            this.hmu = pdm.jpo().cm();
            pdm.jpo().my();
        }
        jpo(getIntent());
        jpo(bundle);
        dt dtVar = this.f19164tu;
        if (dtVar == null) {
            finish();
            return false;
        }
        this.sz = dtVar.gmx();
        this.f19164tu.jpo(this.f19155jj);
        this.nmd = this.f19164tu.jl();
        com.bytedance.sdk.openadsdk.utils.jd.jpo(this.f19164tu);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public JSONObject jpo(JSONObject jSONObject) {
        if (jr() == 0) {
            return this.f19165uu.jpo(jSONObject);
        }
        return null;
    }

    private void jpo(final String str) {
        duq.wqx(new com.bytedance.sdk.component.xyk.xyk("AppOpenAd_executeMultiProcessCallback") { // from class: com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity.6
            @Override // java.lang.Runnable
            public void run() {
                try {
                    TTAppOpenAdActivity.this.jj().executeAppOpenAdCallback(TTAppOpenAdActivity.this.f19160rq, str);
                } catch (Throwable th2) {
                    nmd.wqx("TTAppOpenAdActivity", "open_ad", "executeAppOpenAdCallback execute throw Exception : ", th2);
                }
            }
        }, 5);
    }

    public void jpo(Intent intent) {
        if (intent != null) {
            this.f19162se = intent.getIntExtra("ad_source", 0);
            this.f19155jj = intent.getLongExtra("start_show_time", 0L);
        }
    }

    public void jpo(Bundle bundle) {
        if (bundle != null) {
            if (this.hmu == null) {
                this.hmu = zz;
                zz = null;
            }
            try {
                int i10 = bundle.getInt("meta_index", -1);
                this.f19160rq = bundle.getString(TTAdConstant.MULTI_PROCESS_META_MD5);
                this.f19162se = bundle.getInt("ad_source", 0);
                this.f19155jj = bundle.getLong("start_show_time", 0L);
                this.f19164tu = pdm.jpo().jpo(i10);
            } catch (Throwable th2) {
                nmd.wqx("TTAppOpenAdActivity", th2.getMessage());
            }
        }
    }

    @Override // com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        com.bytedance.sdk.openadsdk.core.model.cm cmVarKc;
        com.bytedance.sdk.openadsdk.core.p000if.cm cmVarJpo;
        com.bytedance.sdk.openadsdk.component.wqx wqxVar;
        if (message.what == 100) {
            if (this.f19156jr && (wqxVar = this.f19165uu) != null && wqxVar.qk() != null) {
                nq();
                this.f19165uu.qk().jpo(1);
            }
            dt dtVar = this.f19164tu;
            if (dtVar != null && (cmVarKc = dtVar.kc()) != null && (cmVarJpo = cmVarKc.jpo()) != null) {
                cmVarJpo.jpo(com.bytedance.sdk.openadsdk.core.p000if.jpo.jpo.GENERAL_LINEAR_AD_ERROR);
            }
            dt();
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.cm.jpo.InterfaceC0111jpo
    public void jpo(int i10) {
        if (i10 == 2 || i10 == 3 || i10 == 4) {
            nq();
        }
    }
}
