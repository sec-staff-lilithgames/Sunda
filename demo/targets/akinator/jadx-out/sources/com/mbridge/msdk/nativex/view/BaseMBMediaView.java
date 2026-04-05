package com.mbridge.msdk.nativex.view;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.URLUtil;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import b0.e2;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.mmadbridge.adsession.media.InteractionType;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.adsession.media.PlayerState;
import com.iab.omid.library.mmadbridge.adsession.media.Position;
import com.iab.omid.library.mmadbridge.adsession.media.VastProperties;
import com.ironsource.G5;
import com.ironsource.InterfaceC3129ae;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.download.download.HTMLResourceManager;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.a1;
import com.mbridge.msdk.foundation.tools.d1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.l0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.r0;
import com.mbridge.msdk.foundation.tools.t0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.foundation.tools.z0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.nativex.view.MediaViewPlayerView;
import com.mbridge.msdk.nativex.view.mbfullview.BaseView;
import com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView;
import com.mbridge.msdk.out.BaseTrackingListener;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.out.OnMBMediaViewListener;
import com.mbridge.msdk.out.OnMBMediaViewListenerPlus;
import com.mbridge.msdk.playercommon.VideoPlayerStatusListener;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.video.signal.communication.IRewardCommunication;
import com.mbridge.msdk.videocommon.view.MyImageView;
import com.mbridge.msdk.widget.MBAdChoice;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.mediation.LevelPlayAdError;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class BaseMBMediaView extends LinearLayout implements VideoPlayerStatusListener, IRewardCommunication {
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_1_LANDING_PAGE = 1;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_2_NORMAL_FULLSCREEN = 2;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_3_NORMAL_FULLSCREEN_ENDCARD = 3;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_4_NORMAL_FULLSCREEN_LP = 4;
    public static final int OPEN_FULLSCREEN_ON_VIDEO_TYPE_6_SMALLVIDEO = 6;
    public static final String TAG = "BaseMBMediaView";
    public static final int WHAT_VIEW_FULL_SCREEN = 2;
    public static final int WHAT_VIEW_SMALL_SCREEN = 1;

    /* renamed from: n0, reason: collision with root package name */
    private static int f41967n0 = 2;

    /* renamed from: o0, reason: collision with root package name */
    private static int f41968o0 = 1;
    private WindVaneWebViewForNV A;
    private MyImageView B;
    private ProgressBar C;
    private View D;
    private BaseView E;
    private RelativeLayout F;
    private RelativeLayout G;
    private TextView H;
    private ProgressBar I;
    private RelativeLayout J;
    private int K;
    private Handler L;
    private CampaignEx M;
    private int N;
    private int O;
    private double P;
    private double Q;
    private int R;
    private int S;
    private w T;
    private SensorManager U;
    private Sensor V;
    private com.mbridge.msdk.videocommon.download.a W;

    /* renamed from: a, reason: collision with root package name */
    private boolean f41969a;

    /* renamed from: a0, reason: collision with root package name */
    private s f41970a0;

    /* renamed from: b, reason: collision with root package name */
    private boolean f41971b;

    /* renamed from: b0, reason: collision with root package name */
    private OnMBMediaViewListener f41972b0;

    /* renamed from: c, reason: collision with root package name */
    private boolean f41973c;

    /* renamed from: c0, reason: collision with root package name */
    private OnMBMediaViewListenerPlus f41974c0;

    /* renamed from: d, reason: collision with root package name */
    private boolean f41975d;

    /* renamed from: d0, reason: collision with root package name */
    private int f41976d0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f41977e;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f41978e0;

    /* renamed from: f, reason: collision with root package name */
    private boolean f41979f;

    /* renamed from: f0, reason: collision with root package name */
    private boolean f41980f0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f41981g;

    /* renamed from: g0, reason: collision with root package name */
    private RelativeLayout f41982g0;

    /* renamed from: h, reason: collision with root package name */
    private boolean f41983h;

    /* renamed from: h0, reason: collision with root package name */
    private ImageView f41984h0;

    /* renamed from: i, reason: collision with root package name */
    private volatile boolean f41985i;

    /* renamed from: i0, reason: collision with root package name */
    private int f41986i0;

    /* renamed from: j, reason: collision with root package name */
    private volatile boolean f41987j;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f41988j0;

    /* renamed from: k, reason: collision with root package name */
    private boolean f41989k;

    /* renamed from: k0, reason: collision with root package name */
    private Context f41990k0;

    /* renamed from: l, reason: collision with root package name */
    private boolean f41991l;

    /* renamed from: l0, reason: collision with root package name */
    private boolean f41992l0;

    /* renamed from: m, reason: collision with root package name */
    private ArrayList<String> f41993m;

    /* renamed from: m0, reason: collision with root package name */
    private Runnable f41994m0;

    /* renamed from: n, reason: collision with root package name */
    private ArrayList<String> f41995n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f41996o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f41997p;

    /* renamed from: q, reason: collision with root package name */
    private AdSession f41998q;

    /* renamed from: r, reason: collision with root package name */
    private AdEvents f41999r;

    /* renamed from: s, reason: collision with root package name */
    private MediaEvents f42000s;

    /* renamed from: t, reason: collision with root package name */
    private int f42001t;

    /* renamed from: u, reason: collision with root package name */
    protected boolean f42002u;

    /* renamed from: v, reason: collision with root package name */
    private MediaViewPlayerView f42003v;

    /* renamed from: w, reason: collision with root package name */
    private RelativeLayout f42004w;

    /* renamed from: x, reason: collision with root package name */
    private RelativeLayout f42005x;

    /* renamed from: y, reason: collision with root package name */
    private RelativeLayout f42006y;

    /* renamed from: z, reason: collision with root package name */
    private WindVaneWebViewForNV f42007z;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.l();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.g();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c extends com.mbridge.msdk.widget.a {
        public c() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            try {
                BaseMBMediaView.this.a(view.getContext());
                if (BaseMBMediaView.this.f42000s != null) {
                    try {
                        BaseMBMediaView.this.f42000s.adUserInteraction(InteractionType.CLICK);
                        p0.a("omsdk", "bmnv adUserInteraction click");
                    } catch (Exception e10) {
                        p0.b("omsdk", e10.getMessage());
                    }
                }
            } catch (Exception e11) {
                p0.b(BaseMBMediaView.TAG, e11.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseMBMediaView.this.f41997p = true;
            if (BaseMBMediaView.this.f41983h) {
                TextView unused = BaseMBMediaView.this.H;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e extends com.mbridge.msdk.nativex.listener.b {
        public e() {
        }

        @Override // com.mbridge.msdk.nativex.listener.b
        public void a() {
            BaseMBMediaView.this.exitFullScreen();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class g implements Runnable {
        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.E, BaseMBMediaView.this.f41985i);
                if (BaseMBMediaView.this.f41986i0 == 0) {
                    BaseMBMediaView.this.O();
                } else {
                    BaseMBMediaView.this.P();
                }
                BaseMBMediaView.this.u();
                BaseMBMediaView.this.o();
                BaseMBMediaView.this.x();
                if (BaseMBMediaView.this.A != null) {
                    BaseMBMediaView.this.A.orientation(BaseMBMediaView.this.f41985i);
                }
            } catch (Exception e10) {
                p0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (!BaseMBMediaView.this.f41983h) {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    if (baseMBMediaView.a((View) baseMBMediaView)) {
                        BaseMBMediaView.this.a0();
                    } else {
                        BaseMBMediaView.this.A();
                    }
                }
                BaseMBMediaView.this.L.postDelayed(this, 300L);
            } catch (Exception e10) {
                p0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static /* synthetic */ class i {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f42016a;

        static {
            int[] iArr = new int[BaseView.a.values().length];
            f42016a = iArr;
            try {
                iArr[BaseView.a.FULL_MIDDLE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f42016a[BaseView.a.FULL_TOP_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class j extends Handler {
        public j() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Object obj;
            if (message != null) {
                try {
                    int i10 = message.what;
                    if (i10 == 1) {
                        BaseMBMediaView.this.S();
                        return;
                    }
                    if (i10 == 3 && (obj = message.obj) != null && (obj instanceof View)) {
                        if (BaseMBMediaView.this.a((View) obj)) {
                            BaseMBMediaView.this.E();
                        }
                    }
                } catch (Exception e10) {
                    p0.b(BaseMBMediaView.TAG, e10.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class k extends com.mbridge.msdk.widget.a {
        public k() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            try {
                if (!BaseMBMediaView.this.f41983h) {
                    BaseMBMediaView.this.L();
                }
                BaseMBMediaView.this.f42003v.showSoundIndicator(true);
                BaseMBMediaView.this.f42003v.showProgressView(true);
                if (BaseMBMediaView.this.f41975d && !BaseMBMediaView.this.f41983h && (BaseMBMediaView.this.D == null || BaseMBMediaView.this.D.getParent() == null)) {
                    if (!BaseMBMediaView.this.f42003v.halfLoadingViewisVisible() && BaseMBMediaView.this.f42003v.isPlaying()) {
                        BaseMBMediaView.this.a();
                        return;
                    }
                    p0.c(BaseMBMediaView.TAG, "is loading or no playing return;");
                    return;
                }
                if (BaseMBMediaView.this.f41983h) {
                    p0.c(BaseMBMediaView.TAG, "fullScreenShowUI");
                    BaseMBMediaView.this.l();
                    return;
                }
                if (BaseMBMediaView.this.f41990k0 != null) {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    baseMBMediaView.a(baseMBMediaView.f41990k0);
                } else {
                    BaseMBMediaView.this.a(view.getContext());
                }
                if (BaseMBMediaView.this.f42000s != null) {
                    try {
                        BaseMBMediaView.this.f42000s.adUserInteraction(InteractionType.CLICK);
                        p0.a("omsdk", "mnv adUserInteraction click");
                    } catch (Exception e10) {
                        p0.b("omsdk", e10.getMessage());
                    }
                }
            } catch (Throwable th2) {
                p0.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class m extends com.mbridge.msdk.widget.a {
        public m() {
        }

        @Override // com.mbridge.msdk.widget.a
        public void a(View view) {
            if (BaseMBMediaView.this.f41990k0 != null) {
                BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                baseMBMediaView.a(baseMBMediaView.f41990k0);
            } else {
                BaseMBMediaView.this.a(view.getContext());
            }
            p0.c(BaseMBMediaView.TAG, "CLICK WEBVIEW LAYOUT ");
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class o implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f42023a;

        public o(String str) {
            this.f42023a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                BaseMBMediaView.this.I();
                BaseMBMediaView.this.c(this.f42023a);
                u0.a(BaseMBMediaView.this.M.getCampaignUnitId(), BaseMBMediaView.this.M, com.mbridge.msdk.foundation.same.a.f40727x);
            } catch (Exception e10) {
                if (MBridgeConstans.DEBUG) {
                    p0.b(BaseMBMediaView.TAG, e10.getMessage());
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class p extends MediaViewPlayerView.h {
        public p(MediaViewPlayerView mediaViewPlayerView) {
            super(mediaViewPlayerView);
        }

        @Override // com.mbridge.msdk.nativex.view.MediaViewPlayerView.h
        public void a() throws JSONException {
            int nvT2 = BaseMBMediaView.this.M.getNvT2();
            if (!BaseMBMediaView.this.f41983h || (nvT2 != 3 && nvT2 != 4)) {
                super.a();
                return;
            }
            WindVaneWebViewForNV endCardWebview = BaseMBMediaView.this.getEndCardWebview();
            if (endCardWebview == null) {
                super.a();
                return;
            }
            View viewQ = BaseMBMediaView.this.q();
            if (viewQ == null) {
                super.a();
                return;
            }
            if (nvT2 == 3 && BaseMBMediaView.this.f41978e0) {
                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(viewQ, BaseMBMediaView.this.E);
                com.mbridge.msdk.mbnative.report.a.a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.M, BaseMBMediaView.this.M.getCampaignUnitId());
            } else {
                if (nvT2 != 4) {
                    super.a();
                    return;
                }
                com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(viewQ, BaseMBMediaView.this.E);
                String clickURL = BaseMBMediaView.this.M.getClickURL();
                if (!TextUtils.isEmpty(clickURL)) {
                    com.mbridge.msdk.click.a.a(BaseMBMediaView.this.getContext(), BaseMBMediaView.this.M, BaseMBMediaView.this.getUnitId(), BaseMBMediaView.this.getAddNVT2ToNoticeURL(), true, false, com.mbridge.msdk.click.retry.a.f39794o);
                    BaseMBMediaView.this.A.loadUrl(clickURL);
                }
            }
            endCardWebview.webViewShow(BaseMBMediaView.this.M, BaseMBMediaView.this.getUnitId());
            endCardWebview.orientation(BaseMBMediaView.this.f41985i);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class q implements View.OnClickListener {
        public q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            BaseMBMediaView.this.exitFullScreen();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class r implements View.OnKeyListener {
        public r() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            try {
                if (keyEvent.getKeyCode() != 4) {
                    return false;
                }
                BaseMBMediaView.this.g();
                return true;
            } catch (Throwable th2) {
                p0.b(BaseMBMediaView.TAG, th2.getMessage());
                return false;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public enum s {
        BIG_IMAGE,
        VIDEO,
        GIF
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class t implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f42032a;

        public t(BaseMBMediaView baseMBMediaView) {
            this.f42032a = new WeakReference<>(baseMBMediaView);
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseMBMediaView baseMBMediaView = this.f42032a.get();
            if (baseMBMediaView != null) {
                try {
                    if (baseMBMediaView.f41970a0 == null || baseMBMediaView.f41970a0 != s.BIG_IMAGE) {
                        return;
                    }
                    baseMBMediaView.U();
                    baseMBMediaView.f41970a0 = s.VIDEO;
                    baseMBMediaView.changeNoticeURL();
                } catch (Throwable th2) {
                    p0.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
                }
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class v implements com.mbridge.msdk.mbsignalcommon.base.a {
        private v() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.base.a
        public boolean a(String str) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (t0.a.b(str)) {
                        t0.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, (NativeListener.NativeTrackingListener) null);
                        return true;
                    }
                    if (URLUtil.isNetworkUrl(str)) {
                        return false;
                    }
                    t0.a(com.mbridge.msdk.foundation.controller.c.m().d(), str, (BaseTrackingListener) null);
                    return true;
                }
            } catch (Exception e10) {
                p0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
            return false;
        }

        public /* synthetic */ v(j jVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class w implements SensorEventListener {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.E, BaseMBMediaView.this.f41985i);
                    BaseMBMediaView.this.O();
                    BaseMBMediaView.this.u();
                    BaseMBMediaView.this.o();
                    BaseMBMediaView.this.x();
                    if (BaseMBMediaView.this.A != null) {
                        BaseMBMediaView.this.A.orientation(BaseMBMediaView.this.f41985i);
                    }
                } catch (Exception e10) {
                    p0.b(BaseMBMediaView.TAG, e10.getMessage());
                }
            }
        }

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    com.mbridge.msdk.nativex.view.mbfullview.a.a(BaseMBMediaView.this.getContext()).a(BaseMBMediaView.this.E, BaseMBMediaView.this.f41985i);
                    BaseMBMediaView.this.P();
                    BaseMBMediaView.this.u();
                    BaseMBMediaView.this.o();
                    BaseMBMediaView.this.x();
                    if (BaseMBMediaView.this.A != null) {
                        BaseMBMediaView.this.A.orientation(BaseMBMediaView.this.f41985i);
                    }
                } catch (Exception e10) {
                    p0.b(BaseMBMediaView.TAG, e10.getMessage());
                }
            }
        }

        private w() {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(SensorEvent sensorEvent) {
            int iRound;
            if (BaseMBMediaView.this.f41988j0) {
                return;
            }
            try {
                float[] fArr = sensorEvent.values;
                float f10 = -fArr[0];
                float f11 = -fArr[1];
                float f12 = -fArr[2];
                if (e2.a(f11, f11, f10 * f10, 4.0f) >= f12 * f12) {
                    iRound = 90 - Math.round(((float) Math.atan2(-f11, f10)) * 57.29578f);
                    while (iRound >= 360) {
                        iRound -= 360;
                    }
                    while (iRound < 0) {
                        iRound += 360;
                    }
                } else {
                    iRound = -1;
                }
                float allScreenWidth = BaseMBMediaView.this.getAllScreenWidth();
                int iH = u0.h(BaseMBMediaView.this.getContext());
                if ((iRound > 45 && iRound < 135) || (iRound > 225 && iRound < 315)) {
                    if (allScreenWidth < iH || BaseMBMediaView.this.f41987j) {
                        return;
                    }
                    BaseMBMediaView.this.f41985i = true;
                    BaseMBMediaView.this.f41987j = true;
                    BaseMBMediaView.this.L.postDelayed(new a(), 200L);
                    return;
                }
                if (((iRound <= 135 || iRound >= 225) && ((iRound <= 315 || iRound >= 360) && ((iRound < 0 || iRound > 45) && iRound != -1))) || allScreenWidth > iH || !BaseMBMediaView.this.f41987j) {
                    return;
                }
                BaseMBMediaView.this.f41985i = false;
                BaseMBMediaView.this.f41987j = false;
                BaseMBMediaView.this.L.postDelayed(new b(), 200L);
            } catch (Throwable th2) {
                p0.b(BaseMBMediaView.TAG, th2.getMessage(), th2);
            }
        }

        public /* synthetic */ w(BaseMBMediaView baseMBMediaView, j jVar) {
            this();
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(Sensor sensor, int i10) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class x implements com.mbridge.msdk.videocommon.listener.a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f42037a;

        public x(BaseMBMediaView baseMBMediaView) {
            this.f42037a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str, String str2) {
        }

        @Override // com.mbridge.msdk.videocommon.listener.a
        public void a(String str) {
            BaseMBMediaView baseMBMediaView = this.f42037a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.L.post(new t(baseMBMediaView));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class y extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f42038a;

        public y(BaseMBMediaView baseMBMediaView) {
            this.f42038a = new WeakReference<>(baseMBMediaView);
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            try {
                BaseMBMediaView baseMBMediaView = this.f42038a.get();
                if (baseMBMediaView == null || baseMBMediaView.f41970a0 == null || baseMBMediaView.f41970a0 != s.BIG_IMAGE) {
                    return;
                }
                baseMBMediaView.R();
                baseMBMediaView.f41970a0 = s.GIF;
                baseMBMediaView.changeNoticeURL();
            } catch (Exception e10) {
                p0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            p0.b(BaseMBMediaView.TAG, "WebView called onRenderProcessGone");
            if (webView != null) {
                try {
                    ViewGroup viewGroup = (ViewGroup) webView.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(webView);
                    }
                    if (webView instanceof WindVaneWebView) {
                        ((WindVaneWebView) webView).release();
                    } else {
                        webView.destroy();
                    }
                } catch (Throwable th2) {
                    p0.b(BaseMBMediaView.TAG, th2.getMessage());
                }
            }
            return true;
        }
    }

    public BaseMBMediaView(Context context) {
        super(context);
        this.f41969a = true;
        this.f41971b = true;
        this.f41973c = true;
        this.f41975d = true;
        this.f41977e = true;
        this.f41979f = false;
        this.f41981g = true;
        this.f41983h = false;
        this.f41985i = false;
        this.f41987j = false;
        this.f41989k = true;
        this.f41991l = true;
        this.f41993m = new ArrayList<>();
        this.f41995n = new ArrayList<>();
        this.f41996o = false;
        this.f41997p = false;
        this.f41998q = null;
        this.f41999r = null;
        this.f42000s = null;
        this.f42001t = 0;
        this.f42002u = false;
        this.W = null;
        this.f41970a0 = null;
        this.f41978e0 = false;
        this.f41980f0 = false;
        this.f41988j0 = false;
        this.f41992l0 = false;
        this.f41994m0 = new h();
        b(context);
    }

    private void T() {
        try {
            if (this.f42003v == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("adtp", 42);
            if (TextUtils.isEmpty(this.M.getBidToken())) {
                eVar.a(CampaignEx.JSON_KEY_HB, 0);
            } else {
                eVar.a(CampaignEx.JSON_KEY_HB, 1);
            }
            a1.a(this.f42003v, this.M.getLocalRequestId(), this.M.getLocalAllowTrackClick());
            this.f42003v.setOnClickListener(new k());
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        v();
        Z();
    }

    private void V() {
        try {
            u0.a((ImageView) this.B);
            this.B.setVisibility(0);
            this.f42004w.setVisibility(8);
            this.f42006y.setVisibility(8);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W() {
        try {
            ProgressBar progressBar = this.I;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void X() {
        try {
            this.f42004w.setVisibility(8);
            this.B.setVisibility(8);
            this.f42006y.setVisibility(0);
            this.f42007z.setVisibility(0);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        try {
            ProgressBar progressBar = this.C;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void Z() {
        try {
            this.f42004w.setVisibility(0);
            this.B.setVisibility(8);
            this.f42006y.setVisibility(8);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a0() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f42003v;
            if (mediaViewPlayerView == null || !mediaViewPlayerView.hasPrepare() || this.f42003v.isPlaying() || this.f42003v.isComplete() || !this.f42003v.hasPrepare()) {
                return;
            }
            this.f42003v.startOrPlayVideo();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void b0() {
        w wVar;
        try {
            SensorManager sensorManager = this.U;
            if (sensorManager == null || (wVar = this.T) == null) {
                return;
            }
            sensorManager.unregisterListener(wVar);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void c0() {
        com.mbridge.msdk.videocommon.download.a aVar = this.W;
        if (aVar != null) {
            aVar.b((com.mbridge.msdk.videocommon.listener.a) null);
        }
    }

    private float getAllScreenHeight() {
        try {
            float fH = u0.h(getContext());
            return !this.f41985i ? fH + u0.c(getContext()) : fH;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getAllScreenWidth() {
        try {
            float fI = u0.i(getContext());
            return this.f41985i ? fI + u0.c(getContext()) : fI;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return 0.0f;
        }
    }

    private int getCDRate() {
        if (getUnitSetting() != null) {
            return getUnitSetting().i();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindVaneWebViewForNV getEndCardWebview() {
        try {
            WindVaneWebViewForNV windVaneWebViewForNV = this.A;
            if (windVaneWebViewForNV != null && this.f41980f0) {
                return windVaneWebViewForNV;
            }
            if (this.f41980f0) {
                return null;
            }
            b(true);
            return null;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            return null;
        }
    }

    private String getPlayUrl() {
        try {
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
        if (this.M == null) {
            return null;
        }
        com.mbridge.msdk.videocommon.download.a aVar = this.W;
        if (aVar != null && aVar.j() == 5) {
            String strK = this.W.k();
            if (new File(strK).exists()) {
                if (!this.W.q()) {
                    if (this.W.e() == u0.a(new File(strK))) {
                    }
                }
                return strK;
            }
        }
        String videoUrlEncode = this.M.getVideoUrlEncode();
        if (z0.b(videoUrlEncode)) {
            return videoUrlEncode;
        }
        return null;
    }

    private int getReadyRate() {
        if (getUnitSetting() != null) {
            return getUnitSetting().C();
        }
        return 100;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getUnitId() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || !z0.b(campaignEx.getCampaignUnitId())) {
                return null;
            }
            return this.M.getCampaignUnitId();
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            return null;
        }
    }

    private com.mbridge.msdk.setting.l getUnitSetting() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx != null && !z0.a(campaignEx.getCampaignUnitId())) {
                String campaignUnitId = this.M.getCampaignUnitId();
                String strB = com.mbridge.msdk.foundation.controller.c.m().b();
                if (!z0.a(campaignUnitId) && !z0.a(strB)) {
                    com.mbridge.msdk.setting.l lVarE = com.mbridge.msdk.setting.h.b().e(strB, campaignUnitId);
                    return lVarE != null ? lVarE : com.mbridge.msdk.setting.l.i(campaignUnitId);
                }
                return com.mbridge.msdk.setting.l.i(campaignUnitId);
            }
            return null;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            return null;
        }
    }

    private void setIsFrontDesk(boolean z10) {
        MediaViewPlayerView mediaViewPlayerView = this.f42003v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.setIsFrontDesk(z10);
        }
    }

    private void setPlayViewParamsDefault(View view) {
        if (view == null) {
            return;
        }
        try {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams.width = -1;
            if (this.f41985i) {
                layoutParams.height = -1;
            } else {
                layoutParams.height = (((int) getAllScreenWidth()) * 9) / 16;
                layoutParams.addRule(13);
            }
            view.setLayoutParams(layoutParams);
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void cai(Object obj, String str) throws JSONException {
        p0.a(TAG, "cai:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            try {
                String strOptString = new JSONObject(str).optString(HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME);
                if (TextUtils.isEmpty(strOptString)) {
                    com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "packageName is empty");
                }
                int i10 = u0.c(com.mbridge.msdk.foundation.controller.c.m().d(), strOptString) ? 1 : 2;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("code", com.mbridge.msdk.mbsignalcommon.communication.d.f41879b);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("result", i10);
                    jSONObject.put("data", jSONObject2);
                    com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
                } catch (Exception e10) {
                    com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, e10.getMessage());
                    p0.a(TAG, e10.getMessage());
                }
            } catch (Throwable th2) {
                com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + th2.getLocalizedMessage());
                p0.b(TAG, "cai", th2);
            }
        } catch (JSONException e11) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "exception: " + e11.getLocalizedMessage());
            p0.b(TAG, "cai", e11);
        }
    }

    public boolean canShowVideo() {
        return a(false) == s.VIDEO;
    }

    public void changeNoticeURL() {
        CampaignEx campaignEx = this.M;
        if (campaignEx != null) {
            String noticeUrl = campaignEx.getNoticeUrl();
            if (TextUtils.isEmpty(noticeUrl)) {
                return;
            }
            if (noticeUrl.contains("is_video")) {
                s sVar = this.f41970a0;
                if (sVar == s.VIDEO) {
                    if (noticeUrl.contains("is_video=2")) {
                        noticeUrl = noticeUrl.replace("is_video=2", "is_video=1");
                    }
                } else if (sVar == s.BIG_IMAGE && noticeUrl.contains("is_video=1")) {
                    noticeUrl = noticeUrl.replace("is_video=1", "is_video=2");
                }
            } else {
                s sVar2 = this.f41970a0;
                String str = sVar2 == s.VIDEO ? "1" : sVar2 == s.BIG_IMAGE ? "2" : "";
                StringBuilder sb2 = new StringBuilder(noticeUrl);
                if (noticeUrl.contains("?")) {
                    sb2.append("&is_video=");
                    sb2.append(str);
                } else {
                    sb2.append("?is_video=");
                    sb2.append(str);
                }
                noticeUrl = sb2.toString();
            }
            this.M.setNoticeUrl(noticeUrl);
        }
    }

    public void destory() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f42003v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.release();
            }
            c0();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    public void exitFullScreen() {
        try {
            g();
            if (this.f41971b) {
                this.f42003v.onClickPlayButton();
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public String getAddNVT2ToNoticeURL() {
        CampaignEx campaignEx = this.M;
        if (campaignEx == null) {
            return null;
        }
        String noticeUrl = campaignEx.getNoticeUrl();
        if (TextUtils.isEmpty(noticeUrl) || noticeUrl.contains(CampaignEx.JSON_KEY_NV_T2)) {
            return noticeUrl;
        }
        return noticeUrl + "&nv_t2=" + this.M.getNvT2();
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void getEndScreenInfo(Object obj, String str) {
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.M);
            String strA = a(arrayList, getUnitId(), "MAL_16.9.91,3.0.1");
            String strEncodeToString = !TextUtils.isEmpty(strA) ? Base64.encodeToString(strA.getBytes(), 2) : "";
            p0.b(TAG, "getEndScreenInfo-mCampaign.name:" + this.M.getAppName());
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, strEncodeToString);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.mbridge.msdk.nativex.view.mbfullview.BaseView getFullScreenViewByStyle(android.content.Context r3, com.mbridge.msdk.nativex.view.mbfullview.BaseView.a r4) {
        /*
            r2 = this;
            int[] r0 = com.mbridge.msdk.nativex.view.BaseMBMediaView.i.f42016a
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L17
            r1 = 2
            if (r0 == r1) goto L10
            r3 = 0
            goto L1d
        L10:
            com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView r0 = new com.mbridge.msdk.nativex.view.mbfullview.MBridgeTopFullView
            r0.<init>(r3)
        L15:
            r3 = r0
            goto L1d
        L17:
            com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView r0 = new com.mbridge.msdk.nativex.view.mbfullview.MBridgeFullView
            r0.<init>(r3)
            goto L15
        L1d:
            if (r3 == 0) goto L22
            r3.setStytle(r4)
        L22:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.nativex.view.BaseMBMediaView.getFullScreenViewByStyle(android.content.Context, com.mbridge.msdk.nativex.view.mbfullview.BaseView$a):com.mbridge.msdk.nativex.view.mbfullview.BaseView");
    }

    public float getMediaContentAspectRatio() {
        float f10 = 0.0f;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx != null) {
                String videoResolution = !TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) ? this.M.getVideoResolution() : this.M.getImageSize();
                if (!TextUtils.isEmpty(videoResolution)) {
                    if (videoResolution.split("x").length == 2) {
                        f10 = Integer.parseInt(r3[0]) / Integer.parseInt(r3[1]);
                    }
                }
                p0.b(TAG, "resource ratio is : " + f10);
            }
            return f10;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return f10;
        }
    }

    public BaseView.a handleViewStyleResult(Context context) {
        int nvT2 = this.M.getNvT2();
        if (nvT2 == 1) {
            a(context);
            return null;
        }
        if (nvT2 == 2 || nvT2 == 3 || nvT2 == 4) {
            return BaseView.a.FULL_MIDDLE_VIEW;
        }
        if (nvT2 != 6) {
            return null;
        }
        return BaseView.a.FULL_TOP_VIEW;
    }

    public void hideEndCardWebViewCloseBtn() {
        ImageView imageView = this.f41984h0;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        this.f41984h0.setVisibility(8);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void install(Object obj, String str) {
        WindVaneWebView windVaneWebView;
        try {
            Context context = this.f41990k0;
            if (context != null) {
                a(context);
            } else {
                if (!(obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) || (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b) == null) {
                    return;
                }
                a(windVaneWebView.getContext());
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public boolean ismCurIsFullScreen() {
        return this.f41983h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            if (this.f41973c) {
                B();
            }
            this.f41981g = isHardwareAccelerated();
            this.f41986i0 = getOrientation();
            N();
            this.L.postDelayed(this.f41994m0, 300L);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingEnd() {
        p0.c("omsdk", "base media end");
        MediaEvents mediaEvents = this.f42000s;
        if (mediaEvents != null) {
            mediaEvents.bufferFinish();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingStart(String str) {
        p0.c("omsdk", "base media start");
        MediaEvents mediaEvents = this.f42000s;
        if (mediaEvents != null) {
            mediaEvents.bufferStart();
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f41988j0) {
            int i10 = this.f41986i0;
            int i11 = configuration.orientation;
            if (i10 == i11) {
                return;
            }
            this.f41986i0 = i11;
            this.f41985i = i11 == 0;
            this.f41987j = this.f41986i0 == 0;
            this.L.postDelayed(new g(), 200L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            if (this.f41998q != null) {
                MediaViewPlayerView mediaViewPlayerView = this.f42003v;
                if (mediaViewPlayerView != null) {
                    mediaViewPlayerView.unregisterView();
                }
                this.f41998q.finish();
                this.f41998q = null;
            }
            if (this.f42000s != null) {
                this.f42000s = null;
            }
            if (this.f41999r != null) {
                this.f41999r = null;
            }
            this.L.removeCallbacks(this.f41994m0);
            C();
            b0();
            c0();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        try {
            this.N = getHeight();
            int width = getWidth();
            this.O = width;
            if (width == 0) {
                this.O = getMeasuredWidth();
            }
            if (this.N == 0) {
                this.N = getMeasuredHeight();
            }
            if (this.O == 0 && this.N == 0) {
                this.O = (int) getAllScreenWidth();
            }
            s sVar = this.f41970a0;
            if (sVar != s.VIDEO || this.f41983h) {
                if (sVar == s.BIG_IMAGE && !this.f41983h) {
                    o();
                    return;
                } else {
                    if (sVar != s.GIF || this.f41983h) {
                        return;
                    }
                    x();
                    return;
                }
            }
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (this.N == 0 || ((layoutParams != null && layoutParams.height == -2) || (layoutParams != null && layoutParams.height == -1))) {
                this.N = (int) ((this.O * this.Q) / this.P);
            }
            u();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayCompleted() {
        MediaEvents mediaEvents = this.f42000s;
        if (mediaEvents != null) {
            mediaEvents.complete();
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayError(String str) {
        try {
            p0.c("error", str);
            o oVar = new o(str);
            if (com.mbridge.msdk.foundation.controller.d.a().e()) {
                com.mbridge.msdk.foundation.same.threadpool.a.b().execute(oVar);
            } else {
                oVar.run();
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgress(int i10, int i11) {
        int i12;
        String str;
        b(i10);
        a(i10, i11);
        MediaEvents mediaEvents = this.f42000s;
        if (mediaEvents != null) {
            int i13 = (i10 * 100) / i11;
            int i14 = ((i10 + 1) * 100) / i11;
            if (i13 <= 25 && 25 < i14) {
                mediaEvents.firstQuartile();
            } else if (i13 <= 50 && 50 < i14) {
                mediaEvents.midpoint();
            } else if (i13 <= 75 && 75 < i14) {
                mediaEvents.thirdQuartile();
            }
        }
        if (getReadyRate() == 100 || this.f41992l0) {
            return;
        }
        int cDRate = getCDRate();
        int readyRate = getReadyRate();
        if (readyRate == 0) {
            return;
        }
        if (cDRate > readyRate) {
            cDRate = readyRate / 2;
        }
        if (cDRate < 0 || i10 < (i12 = (i11 * cDRate) / 100)) {
            return;
        }
        if (this.M.getAdType() == 94 || this.M.getAdType() == 287) {
            str = this.M.getRequestId() + this.M.getId() + this.M.getVideoUrlEncode();
        } else {
            str = this.M.getId() + this.M.getVideoUrlEncode() + this.M.getBidToken();
        }
        com.mbridge.msdk.videocommon.download.a aVarA = com.mbridge.msdk.videocommon.download.b.getInstance().a(getUnitId(), str);
        if (aVarA != null) {
            aVarA.v();
            this.f41992l0 = true;
            p0.b(TAG, "CDRate is : " + i12 + " and start download !");
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlaySetDataSourceError(String str) {
        p0.c("errorstr", str);
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayStarted(int i10) throws JSONException {
        MediaEvents mediaEvents = this.f42000s;
        if (mediaEvents != null) {
            try {
                mediaEvents.start(i10, this.f41979f ? 1.0f : 0.0f);
            } catch (IllegalArgumentException e10) {
                p0.a("omsdk", e10.getMessage());
            }
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        try {
            this.f41977e = z10;
            if (this.f41970a0 == s.VIDEO) {
                setIsFrontDesk(z10);
            }
            r();
            requestLayout();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void openURL(Object obj, String str) throws JSONException {
        WindVaneWebView windVaneWebView;
        p0.b(TAG, "openURL:" + str);
        if (TextUtils.isEmpty(str)) {
            com.mbridge.msdk.mbsignalcommon.communication.d.a(obj, "params is null");
            return;
        }
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (contextD == null) {
            try {
                if ((obj instanceof com.mbridge.msdk.mbsignalcommon.windvane.a) && (windVaneWebView = ((com.mbridge.msdk.mbsignalcommon.windvane.a) obj).f41924b) != null) {
                    contextD = windVaneWebView.getContext();
                }
            } catch (Exception e10) {
                p0.b(TAG, e10.getMessage());
            }
        }
        if (contextD == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("url");
            int iOptInt = jSONObject.optInt("type");
            if (iOptInt == 1) {
                com.mbridge.msdk.click.c.c(contextD, strOptString);
            } else if (iOptInt == 2) {
                com.mbridge.msdk.click.c.e(contextD, strOptString);
            }
        } catch (JSONException e11) {
            p0.b(TAG, e11.getMessage());
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    public void setAllowLoopPlay(boolean z10) {
        this.f41971b = z10;
    }

    public void setAllowScreenChange(boolean z10) {
        this.f41973c = z10;
    }

    public void setAllowVideoRefresh(boolean z10) {
        this.f41969a = z10;
    }

    public void setFollowActivityOrientation(boolean z10) {
        this.f41988j0 = z10;
    }

    public void setFullScreenViewBackgroundColor(int i10) {
        this.f42001t = i10;
    }

    public void setIsAllowFullScreen(boolean z10) {
        this.f41975d = z10;
    }

    public void setNativeAd(Campaign campaign) {
        String str;
        if (campaign == null) {
            return;
        }
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || campaignEx != campaign) {
                M();
                p();
                CampaignEx campaignEx2 = (CampaignEx) campaign;
                this.M = campaignEx2;
                if (campaignEx2.getMediaViewHolder() == null) {
                    CampaignEx.b bVar = new CampaignEx.b();
                    bVar.f40508a = this.M.getAdvImpList();
                    this.M.setMediaViewHolder(bVar);
                }
                if (this.M.getAdType() == 94 || this.M.getAdType() == 287) {
                    str = this.M.getRequestId() + this.M.getId() + this.M.getVideoUrlEncode();
                } else {
                    str = this.M.getId() + this.M.getVideoUrlEncode() + this.M.getBidToken();
                }
                this.W = com.mbridge.msdk.videocommon.download.b.getInstance().a(getUnitId(), str);
                if (this.f41996o) {
                    if (this.f41998q != null) {
                        MediaViewPlayerView mediaViewPlayerView = this.f42003v;
                        if (mediaViewPlayerView != null) {
                            mediaViewPlayerView.unregisterView();
                        }
                        this.f41998q.finish();
                        this.f41998q = null;
                    }
                    if (this.f42000s != null) {
                        this.f42000s = null;
                    }
                    if (this.f41999r != null) {
                        this.f41999r = null;
                    }
                }
                CampaignEx campaignEx3 = this.M;
                if (campaignEx3 != null && campaignEx3.isActiveOm()) {
                    this.f41998q = com.mbridge.msdk.omsdk.b.a(getContext(), TextUtils.isEmpty(this.M.getVideoUrlEncode()), this.M.getOmid(), this.M.getRequestId(), this.M.getId(), getUnitId(), "", this.M.getRequestIdNotice());
                }
                if (this.f41996o) {
                    N();
                }
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListener onMBMediaViewListener) {
        this.f41972b0 = onMBMediaViewListener;
    }

    public void setProgressVisibility(boolean z10) {
        this.f41989k = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f42003v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showProgressView(z10);
        }
    }

    public void setSoundIndicatorVisibility(boolean z10) {
        this.f41991l = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f42003v;
        if (mediaViewPlayerView != null) {
            mediaViewPlayerView.showSoundIndicator(z10);
        }
    }

    public void setVideoSoundOnOff(boolean z10) {
        this.f41979f = z10;
        MediaViewPlayerView mediaViewPlayerView = this.f42003v;
        if (mediaViewPlayerView != null) {
            if (z10) {
                mediaViewPlayerView.openSound();
            } else {
                mediaViewPlayerView.closeSound();
            }
        }
    }

    public void showEndCardWebViewCloseBtn() {
        ImageView imageView = this.f41984h0;
        if (imageView == null || imageView.getVisibility() == 0) {
            return;
        }
        this.f41984h0.setVisibility(0);
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void toggleCloseBtn(Object obj, String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                try {
                    new JSONObject(str).optInt("state", 1);
                } catch (Exception e10) {
                    p0.b(TAG, e10.getMessage());
                }
            }
            p0.b(TAG, "SHOW CLOSE BTN ");
            showEndCardWebViewCloseBtn();
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, a(0));
        } catch (Exception e11) {
            p0.b(TAG, e11.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(obj, a(1));
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void triggerCloseBtn(Object obj, String str) {
        try {
            exitFullScreen();
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().b(obj, a(0));
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            com.mbridge.msdk.mbsignalcommon.windvane.f.a().a(obj, a(1));
        }
    }

    public void updateViewManger(boolean z10) {
        com.mbridge.msdk.nativex.view.mbfullview.a aVarA = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
        if (aVarA != null) {
            try {
                aVarA.a(this.E);
                aVarA.a(z10, !this.f42003v.isComplete(), this.E);
                aVarA.a(z10, this.E, this.f41976d0);
            } catch (NullPointerException e10) {
                e10.printStackTrace();
                return;
            }
        }
        BaseView baseView = this.E;
        if (!(baseView instanceof MBridgeTopFullView) || aVarA == null) {
            return;
        }
        aVarA.a(!z10, baseView);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f extends com.mbridge.msdk.mbsignalcommon.listener.b {
        public f() {
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, String str) {
            super.a(webView, str);
            BaseMBMediaView.this.f41978e0 = true;
        }

        @Override // com.mbridge.msdk.mbsignalcommon.listener.b, com.mbridge.msdk.mbsignalcommon.windvane.c
        public void a(WebView webView, int i10, String str, String str2) {
            super.a(webView, i10, str, str2);
            BaseMBMediaView.this.f41978e0 = false;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class u implements com.mbridge.msdk.nativex.listener.a {

        /* renamed from: a, reason: collision with root package name */
        WeakReference<BaseMBMediaView> f42033a;

        public u(BaseMBMediaView baseMBMediaView) {
            this.f42033a = new WeakReference<>(baseMBMediaView);
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void a() {
            BaseMBMediaView baseMBMediaView = this.f42033a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.K();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void b() {
            BaseMBMediaView baseMBMediaView = this.f42033a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.G();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void c() {
            BaseMBMediaView baseMBMediaView = this.f42033a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.H();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void d() {
            BaseMBMediaView baseMBMediaView = this.f42033a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.J();
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void a(String str) {
            BaseMBMediaView baseMBMediaView = this.f42033a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.a(str);
            }
        }

        @Override // com.mbridge.msdk.nativex.listener.a
        public void b(String str) {
            BaseMBMediaView baseMBMediaView = this.f42033a.get();
            if (baseMBMediaView != null) {
                baseMBMediaView.b(str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f42003v;
            if (mediaViewPlayerView != null && mediaViewPlayerView.hasPrepare() && this.f42003v.isPlaying()) {
                z();
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void B() {
        try {
            SensorManager sensorManager = (SensorManager) getContext().getSystemService("sensor");
            this.U = sensorManager;
            this.V = sensorManager.getDefaultSensor(1);
            w wVar = new w(this, null);
            this.T = wVar;
            this.U.registerListener(wVar, this.V, 2);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void C() {
        Handler handler = this.L;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    private void D() {
        if (this.M.isReportClick()) {
            return;
        }
        this.M.setReportClick(true);
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || campaignEx.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().d() == null) {
            return;
        }
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().d(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null) {
            return;
        }
        com.mbridge.msdk.foundation.controller.c.m().a(getContext());
        com.mbridge.msdk.mbnative.report.b.a(this.M, getContext(), getUnitId(), (com.mbridge.msdk.mbnative.listener.a) null);
        CampaignEx.b mediaViewHolder = this.M.getMediaViewHolder();
        if (!mediaViewHolder.f40519l && this.f41970a0 == s.VIDEO && z0.b(this.M.getImpressionURL())) {
            mediaViewHolder.f40519l = true;
            String impressionURL = this.M.getImpressionURL();
            if (!impressionURL.contains("is_video=1")) {
                StringBuilder sb2 = new StringBuilder(impressionURL);
                if (impressionURL.contains("?")) {
                    sb2.append("&is_video=1");
                } else {
                    sb2.append("?is_video=1");
                }
                impressionURL = sb2.toString();
            }
            Context context = getContext();
            CampaignEx campaignEx2 = this.M;
            com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), impressionURL, false, true, com.mbridge.msdk.click.retry.a.f39792m);
        }
    }

    private void F() {
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || this.M.getMediaViewHolder().f40512e || TextUtils.isEmpty(this.M.getCampaignUnitId()) || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().c() == null) {
            return;
        }
        this.M.getMediaViewHolder().f40512e = true;
        f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f40513f || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().m() == null) {
            return;
        }
        mediaViewHolder.f40513f = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().m(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f40514g || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().n() == null) {
            return;
        }
        mediaViewHolder.f40514g = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().n(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I() {
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || campaignEx.getMediaViewHolder() == null || this.M.getMediaViewHolder().f40511d || TextUtils.isEmpty(this.M.getCampaignUnitId()) || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().i() == null) {
            return;
        }
        this.M.getMediaViewHolder().f40511d = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().i(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f40516i || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().p() == null) {
            return;
        }
        mediaViewHolder.f40516i = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().p(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f40517j || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().s() == null) {
            return;
        }
        mediaViewHolder.f40517j = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().s(), false, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        CampaignEx.b mediaViewHolder;
        CampaignEx campaignEx = this.M;
        if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f40518k || this.M.getNativeVideoTracking() == null || this.M.getNativeVideoTracking().t() == null) {
            return;
        }
        mediaViewHolder.f40518k = true;
        Context context = getContext();
        CampaignEx campaignEx2 = this.M;
        com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), this.M.getNativeVideoTracking().t(), false, false);
    }

    private void M() {
        this.f41977e = true;
        this.f41981g = true;
        this.f41983h = false;
        this.f41985i = false;
        this.f41987j = false;
        this.f41997p = false;
    }

    private void N() {
        AdSession adSession;
        try {
            this.f41970a0 = a(true);
            changeNoticeURL();
            s sVar = this.f41970a0;
            if (sVar == s.BIG_IMAGE) {
                CampaignEx campaignEx = this.M;
                if (campaignEx != null && TextUtils.isEmpty(campaignEx.getVideoUrlEncode()) && (adSession = this.f41998q) != null) {
                    try {
                        adSession.registerAdView(this.B);
                        this.f41999r = AdEvents.createAdEvents(this.f41998q);
                        this.f41998q.start();
                        AdEvents adEvents = this.f41999r;
                        if (adEvents != null) {
                            adEvents.impressionOccurred();
                        }
                    } catch (Exception e10) {
                        p0.a("omsdk", e10.getMessage());
                    }
                }
                V();
                i();
            } else if (sVar == s.VIDEO) {
                U();
            } else if (sVar == s.GIF) {
                j();
                R();
            }
            this.f41996o = true;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage(), th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        try {
            if (this.G == null && this.f41984h0 == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 30.0f), u0.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            if (this.f41976d0 == 0 && com.mbridge.msdk.foundation.tools.e.a(getContext())) {
                layoutParams.rightMargin = u0.c(getContext()) + u0.a(getContext(), 8.0f);
            } else {
                layoutParams.rightMargin = u0.a(getContext(), 8.0f);
            }
            layoutParams.topMargin = u0.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.G;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.f41984h0;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(true);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P() {
        try {
            if (this.G == null && this.f41984h0 == null) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 30.0f), u0.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = u0.a(getContext(), 8.0f);
            layoutParams.rightMargin = u0.a(getContext(), 8.0f);
            RelativeLayout relativeLayout = this.G;
            if (relativeLayout != null) {
                relativeLayout.setLayoutParams(layoutParams);
            }
            ImageView imageView = this.f41984h0;
            if (imageView != null) {
                imageView.setLayoutParams(layoutParams);
            }
            updateViewManger(false);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void Q() {
        try {
            this.D.setFocusableInTouchMode(true);
            this.D.requestFocus();
            this.D.setOnKeyListener(new r());
            this.D.setOnClickListener(new a());
            this.G.setOnClickListener(new b());
            CampaignEx campaignEx = this.M;
            if (campaignEx != null) {
                a1.a(this.H, campaignEx.getLocalRequestId(), this.M.getLocalAllowTrackClick());
            }
            this.H.setOnClickListener(new c());
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R() {
        X();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() {
        try {
            if (getVisibility() != 0) {
                return;
            }
            CampaignEx campaignEx = this.M;
            if (com.mbridge.msdk.foundation.tools.g.b(campaignEx, this.f41990k0, this, campaignEx.getImpReportType())) {
                com.mbridge.msdk.setting.l unitSetting = getUnitSetting();
                int i10 = 0;
                int iS = unitSetting != null ? unitSetting.s() : 0;
                CampaignEx campaignEx2 = this.M;
                if (campaignEx2 == null || campaignEx2.getImpReportType() != 1) {
                    i10 = iS;
                }
                Message messageObtainMessage = this.L.obtainMessage();
                messageObtainMessage.what = 3;
                messageObtainMessage.obj = this;
                this.L.sendMessageDelayed(messageObtainMessage, (i10 == 0 ? 0L : i10 * 1000) + 300);
            }
            if (this.f41970a0 == s.VIDEO) {
                MediaViewPlayerView mediaViewPlayerView = this.f42003v;
                if (mediaViewPlayerView == null) {
                    b();
                    return;
                }
                if (this.M != mediaViewPlayerView.getCampaign()) {
                    this.f42003v.release();
                    b();
                    if (getParent() != null) {
                        ((View) getParent()).invalidate();
                    }
                    requestLayout();
                }
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void e() {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f41972b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoAdClicked(this.M);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f41974c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoAdClicked(this.M);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void f() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || campaignEx.getNativeVideoTracking() == null) {
                return;
            }
            String[] strArrC = this.M.getNativeVideoTracking().c();
            int i10 = this.f41985i ? f41967n0 : f41968o0;
            for (String str : strArrC) {
                if (!TextUtils.isEmpty(str)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.M;
                    com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), str + "&orienation=" + i10, false, false);
                }
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        try {
            FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
            FrameLayout frameLayout2 = (FrameLayout) getRootView().findViewById(100);
            RelativeLayout relativeLayout = (RelativeLayout) getRootView().findViewById(101);
            RelativeLayout relativeLayout2 = (RelativeLayout) getRootView().findViewById(103);
            if (relativeLayout2 == null && relativeLayout != null) {
                relativeLayout2 = (RelativeLayout) relativeLayout.findViewById(103);
            }
            RelativeLayout relativeLayout3 = (RelativeLayout) getRootView().findViewById(h0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            if (relativeLayout3 == null && relativeLayout2 != null) {
                relativeLayout3 = (RelativeLayout) relativeLayout2.findViewById(h0.a(getContext(), "mbridge_full_rl_playcontainer", "id"));
            }
            RelativeLayout relativeLayout4 = (RelativeLayout) getRootView().findViewById(h0.a(getContext(), "mbridge_full_player_parent", "id"));
            if (relativeLayout4 == null && relativeLayout3 != null) {
                relativeLayout4 = (RelativeLayout) relativeLayout3.findViewById(h0.a(getContext(), "mbridge_full_player_parent", "id"));
            }
            ProgressBar progressBar = (ProgressBar) getRootView().findViewById(h0.a(getContext(), "mbridge_full_pb_loading", "id"));
            RelativeLayout relativeLayout5 = (RelativeLayout) getRootView().findViewById(h0.a(getContext(), "mbridge_full_rl_install", "id"));
            LinearLayout linearLayout = (LinearLayout) getRootView().findViewById(h0.a(getContext(), "mbridge_full_ll_pro_dur", "id"));
            ViewGroup viewGroup = frameLayout2 != null ? (ViewGroup) frameLayout2.getParent() : null;
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(linearLayout);
            } else if (linearLayout != null && linearLayout.getParent() != null) {
                ((ViewGroup) linearLayout.getParent()).removeView(linearLayout);
            }
            RelativeLayout relativeLayout6 = this.f41982g0;
            if (relativeLayout6 != null) {
                if (relativeLayout2 != null) {
                    relativeLayout2.removeView(relativeLayout6);
                } else if (relativeLayout6.getParent() != null) {
                    ((ViewGroup) this.f41982g0.getParent()).removeView(this.f41982g0);
                }
                this.A.setBackListener(null);
                this.A.setObject(null);
                this.A = null;
                this.f41982g0 = null;
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout5);
            } else if (relativeLayout5 != null && relativeLayout5.getParent() != null) {
                ((ViewGroup) relativeLayout5.getParent()).removeView(relativeLayout5);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(progressBar);
            } else if (progressBar != null && progressBar.getParent() != null) {
                ((ViewGroup) progressBar.getParent()).removeView(progressBar);
            }
            if (relativeLayout4 != null) {
                relativeLayout4.removeView(this.f42003v);
            }
            if (relativeLayout3 != null) {
                relativeLayout3.removeView(relativeLayout4);
            } else if (relativeLayout4 != null && relativeLayout4.getParent() != null) {
                ((ViewGroup) relativeLayout4.getParent()).removeView(relativeLayout4);
            }
            if (relativeLayout2 != null) {
                relativeLayout2.removeView(relativeLayout3);
            } else if (relativeLayout3 == null || relativeLayout3.getParent() == null) {
                BaseView baseView = this.E;
                if (baseView != null) {
                    baseView.removeView(this.F);
                }
            } else {
                ((ViewGroup) relativeLayout3.getParent()).removeView(relativeLayout3);
            }
            if (relativeLayout != null) {
                relativeLayout.removeView(relativeLayout2);
            } else if (relativeLayout2 == null || relativeLayout2.getParent() == null) {
                View view = this.D;
                if (view != null) {
                    ((ViewGroup) view).removeView(this.E);
                    ((ViewGroup) this.D.getParent()).removeView(this.D);
                }
            } else {
                ((ViewGroup) relativeLayout2.getParent()).removeView(relativeLayout2);
            }
            if (frameLayout != null) {
                if (relativeLayout != null) {
                    frameLayout.removeView(relativeLayout);
                } else {
                    frameLayout.removeView(this.D);
                    if (this.D.getParent() != null) {
                        ((ViewGroup) this.D.getParent()).removeView(this.D);
                        this.D.setVisibility(8);
                    }
                }
            }
            setVisibility(0);
            requestLayout();
            if (viewGroup != null) {
                if (this.f42003v.getParent() != null && this.f42003v.getParent() != viewGroup) {
                    ((ViewGroup) this.f42003v.getParent()).removeView(this.f42003v);
                }
                viewGroup.addView(this.f42003v, this.K);
                viewGroup.removeView(frameLayout2);
                viewGroup.invalidate();
            }
            d();
            this.f41983h = false;
            MediaViewPlayerView mediaViewPlayerView = this.f42003v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.setExitFullScreen();
                if (this.f41979f) {
                    this.f42003v.openSound();
                } else {
                    this.f42003v.closeSound();
                }
                this.f42003v.gonePauseView();
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void h() {
        try {
            e();
            if (this.M != null && !z0.a(getUnitId())) {
                D();
                com.mbridge.msdk.click.a aVar = new com.mbridge.msdk.click.a(getContext(), getUnitId());
                aVar.a(new n());
                aVar.a(this.M);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void i() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null) {
                return;
            }
            String imageUrl = campaignEx.getImageUrl();
            if (z0.a(imageUrl) || getContext() == null) {
                return;
            }
            com.mbridge.msdk.foundation.same.image.b.a(com.mbridge.msdk.foundation.controller.c.m().d()).a(imageUrl, new l());
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void j() {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null) {
                return;
            }
            String gifUrl = campaignEx.getGifUrl();
            if (z0.a(gifUrl) || getContext() == null) {
                return;
            }
            this.f42007z.loadDataWithBaseURL(null, "<!DOCTYPE html><html lang=\"en\"><head>  <meta charset=\"UTF-8\">  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">  <title>Document</title>  <style>  *{    margin: 0;    padding: 0;  }  html, body{    width: 100%;    height: 100%;  }  body{    background-image: url('gifUrl');    background-position: center;    background-size: contain;    background-repeat: no-repeat;  }  </style></head><body></body></html>".replace("gifUrl", gifUrl), "text/html", G5.N, null);
            this.f42007z.setInterceptTouch(true);
            CampaignEx campaignEx2 = this.M;
            if (campaignEx2 != null) {
                a1.a(this.f42006y, campaignEx2.getLocalRequestId(), this.M.getLocalAllowTrackClick());
            }
            this.f42006y.setOnClickListener(new m());
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private boolean k() {
        try {
            this.F = this.E.getMBridgeFullPlayContainer();
            this.J = this.E.getMBridgeFullPlayerParent();
            this.G = this.E.getMBridgeFullClose();
            this.H = this.E.getMBridgeFullTvInstall();
            this.I = this.E.getMBridgeFullPb();
            return true;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f42003v;
            if (mediaViewPlayerView == null) {
                return;
            }
            mediaViewPlayerView.onClickPlayerView();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        try {
            ProgressBar progressBar = this.I;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        try {
            ProgressBar progressBar = this.C;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int i10;
        int i11;
        int i12;
        try {
            if (this.f41970a0 != s.BIG_IMAGE || (i10 = this.O) == 0 || (i11 = this.S) == 0 || (i12 = this.R) == 0) {
                return;
            }
            int i13 = (i10 * i11) / i12;
            MyImageView myImageView = this.B;
            if (myImageView == null || i13 == 0) {
                return;
            }
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) myImageView.getLayoutParams();
            layoutParams.width = this.O;
            layoutParams.height = i13;
            this.B.setLayoutParams(layoutParams);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void p() {
        try {
            this.f41985i = u0.i(getContext()) >= u0.h(getContext());
            this.f41987j = this.f41985i;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View q() {
        try {
            this.f41982g0 = new RelativeLayout(getContext());
            this.f41982g0.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            ImageView imageView = new ImageView(getContext());
            this.f41984h0 = imageView;
            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(u0.a(getContext(), 30.0f), u0.a(getContext(), 30.0f));
            layoutParams.addRule(11);
            layoutParams.addRule(10);
            layoutParams.topMargin = u0.a(getContext(), 8.0f);
            layoutParams.rightMargin = u0.a(getContext(), 8.0f);
            this.f41984h0.setLayoutParams(layoutParams);
            this.f41984h0.setBackgroundResource(h0.a(getContext(), "mbridge_nativex_close", "drawable"));
            this.f41984h0.setOnClickListener(new q());
            this.A.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
            this.f41982g0.addView(this.A);
            this.f41982g0.addView(this.f41984h0);
            return this.f41982g0;
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            return null;
        }
    }

    private void r() {
        try {
            if (this.f41983h) {
                MediaViewPlayerView mediaViewPlayerView = this.f42003v;
                if (mediaViewPlayerView == null) {
                    p0.b(TAG, "fullscreen playerview is null return");
                    return;
                }
                if (!this.f41977e) {
                    mediaViewPlayerView.pause();
                    return;
                }
                if (mediaViewPlayerView.isPlaying()) {
                    p0.c(TAG, "fullscreen windowfocuse true isPlaying do nothing return");
                    return;
                }
                MediaViewPlayerView mediaViewPlayerView2 = this.f42003v;
                if (mediaViewPlayerView2 == null || mediaViewPlayerView2.isComplete() || this.f42003v.getIsActiviePause()) {
                    return;
                }
                this.f42003v.onClickPlayButton();
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void s() {
        try {
            p();
            a(this.F, getAllScreenWidth(), getAllScreenHeight());
            com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext()).a(this.E, this.f41985i);
            if (this.f41985i) {
                O();
            } else {
                P();
            }
            this.L.postDelayed(new d(), 3000L);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void t() {
        this.L = new j();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u() {
        try {
            if (this.f41970a0 != s.VIDEO || this.f42004w == null) {
                return;
            }
            int allScreenWidth = (int) getAllScreenWidth();
            int iH = u0.h(getContext());
            if (this.f41983h) {
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.F.getLayoutParams();
                layoutParams.width = allScreenWidth;
                layoutParams.height = iH;
                layoutParams.addRule(13);
                this.F.setLayoutParams(layoutParams);
            } else {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) this.f42004w.getLayoutParams();
                layoutParams2.width = this.O;
                layoutParams2.height = this.N;
                layoutParams2.addRule(13);
                this.f42004w.setLayoutParams(layoutParams2);
            }
            S();
            if (this.f41983h) {
                a(this.f42003v, allScreenWidth, iH);
            } else {
                a(this.f42003v, this.O, this.N);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void v() {
        String[] strArrSplit;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || z0.a(campaignEx.getVideoResolution()) || (strArrSplit = this.M.getVideoResolution().split("x")) == null || strArrSplit.length != 2) {
                return;
            }
            String str = strArrSplit[0];
            String str2 = strArrSplit[1];
            double dM = u0.m(str);
            double dM2 = u0.m(str2);
            if (dM <= 0.0d || dM2 <= 0.0d) {
                return;
            }
            this.P = dM;
            this.Q = dM2;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void w() {
        int iA = h0.a(getContext(), "mbridge_nativex_mbmediaview", TtmlNode.TAG_LAYOUT);
        if (!h0.a(iA)) {
            p0.b(TAG, "can not find mediaview resource");
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(iA, (ViewGroup) null);
        this.f42005x = (RelativeLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_rl_mediaview_root", "id"));
        this.f42004w = (RelativeLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_ll_playerview_container", "id"));
        this.B = (MyImageView) viewInflate.findViewById(h0.a(getContext(), "mbridge_my_big_img", "id"));
        this.C = (ProgressBar) viewInflate.findViewById(h0.a(getContext(), "mbridge_native_pb", "id"));
        this.f42006y = (RelativeLayout) viewInflate.findViewById(h0.a(getContext(), "mbridge_nativex_webview_layout", "id"));
        this.f42007z = (WindVaneWebViewForNV) viewInflate.findViewById(h0.a(getContext(), "mbridge_nativex_webview_layout_webview", "id"));
        this.f42005x.setClickable(true);
        addView(viewInflate, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        RelativeLayout relativeLayout;
        int i10;
        int i11;
        try {
            if (this.f41970a0 == s.GIF) {
                int i12 = this.O;
                if (i12 == 0 || (i10 = this.S) == 0 || (i11 = this.R) == 0) {
                    if (i12 == 0 || (relativeLayout = this.f42006y) == null) {
                        return;
                    }
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) relativeLayout.getLayoutParams();
                    int i13 = this.O;
                    layoutParams.width = i13;
                    layoutParams.height = (i13 * LevelPlayAdError.ERROR_CODE_LOAD_FAILED_ALREADY_CALLED) / InterfaceC3129ae.c.f35991d;
                    layoutParams.addRule(13);
                    this.f42006y.setLayoutParams(layoutParams);
                    return;
                }
                int i14 = (i12 * i10) / i11;
                RelativeLayout relativeLayout2 = this.f42006y;
                if (relativeLayout2 == null || i14 == 0) {
                    return;
                }
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
                layoutParams2.width = this.O;
                layoutParams2.height = i14;
                layoutParams2.addRule(13);
                this.f42006y.setLayoutParams(layoutParams2);
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private boolean y() {
        com.mbridge.msdk.setting.l unitSetting;
        try {
            unitSetting = getUnitSetting();
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
        if (unitSetting == null) {
            return false;
        }
        int iL = unitSetting.L();
        if (iL == 1) {
            return u0.n(getContext());
        }
        if (iL == 2) {
            return false;
        }
        return iL == 3 ? !r0.a().a("s_a_w_n_c", true) || u0.l(getContext()) : u0.n(getContext());
    }

    private void z() {
        try {
            MediaViewPlayerView mediaViewPlayerView = this.f42003v;
            if (mediaViewPlayerView != null) {
                mediaViewPlayerView.pause();
            }
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    public void setOnMediaViewListener(OnMBMediaViewListenerPlus onMBMediaViewListenerPlus) {
        this.f41974c0 = onMBMediaViewListenerPlus;
    }

    private void d() {
        try {
            this.f42003v.showSoundIndicator(this.f41991l);
            this.f42003v.showProgressView(this.f41989k);
            OnMBMediaViewListener onMBMediaViewListener = this.f41972b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onExitFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f41974c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onExitFullscreen();
            }
            MediaEvents mediaEvents = this.f42000s;
            if (mediaEvents != null) {
                mediaEvents.playerStateChange(PlayerState.NORMAL);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void c() {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f41972b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onEnterFullscreen();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f41974c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onEnterFullscreen();
            }
            MediaEvents mediaEvents = this.f42000s;
            if (mediaEvents != null) {
                mediaEvents.playerStateChange(PlayerState.FULLSCREEN);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void b(Context context) {
        try {
            t();
            w();
            this.f41990k0 = context;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f41972b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onFinishRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f41974c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onFinishRedirection(campaign, str);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f41972b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onRedirectionFailed(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f41974c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onRedirectionFailed(campaign, str);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(Campaign campaign, String str) {
        try {
            OnMBMediaViewListener onMBMediaViewListener = this.f41972b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onStartRedirection(campaign, str);
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f41974c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onStartRedirection(campaign, str);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void a(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f41995n.contains(str)) {
                return;
            }
            this.f41995n.add(str);
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f41974c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoComplete();
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    public void b(String str) {
        try {
            if (TextUtils.isEmpty(str) || this.f41993m.contains(str)) {
                return;
            }
            this.f41993m.add(str);
            OnMBMediaViewListener onMBMediaViewListener = this.f41972b0;
            if (onMBMediaViewListener != null) {
                onMBMediaViewListener.onVideoStart();
            }
            OnMBMediaViewListenerPlus onMBMediaViewListenerPlus = this.f41974c0;
            if (onMBMediaViewListenerPlus != null) {
                onMBMediaViewListenerPlus.onVideoStart();
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        String str2;
        com.mbridge.msdk.foundation.entity.n nVar;
        try {
            com.mbridge.msdk.foundation.db.n nVarA = com.mbridge.msdk.foundation.db.n.a(com.mbridge.msdk.foundation.db.g.a(getContext()));
            if (!TextUtils.isEmpty(this.M.getNoticeUrl())) {
                int iS = l0.s(getContext());
                str2 = str;
                nVar = new com.mbridge.msdk.foundation.entity.n("2000021", iS, this.M.getNoticeUrl(), str2, l0.a(getContext(), iS));
            } else {
                str2 = str;
                if (TextUtils.isEmpty(this.M.getClickURL())) {
                    nVar = null;
                } else {
                    int iS2 = l0.s(getContext());
                    com.mbridge.msdk.foundation.entity.n nVar2 = new com.mbridge.msdk.foundation.entity.n("2000021", iS2, this.M.getClickURL(), str2, l0.a(getContext(), iS2));
                    str2 = str2;
                    nVar = nVar2;
                }
            }
            if (nVar != null) {
                nVar.b(this.M.getId());
                nVar.v(this.M.getVideoUrlEncode());
                nVar.m(str2);
                nVar.n(this.M.getRequestId());
                nVar.o(this.M.getRequestIdNotice());
                nVar.u(getUnitId());
                nVarA.a(nVar);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        h();
    }

    private s a(boolean z10) {
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx != null) {
                if (z0.a(campaignEx.getVideoUrlEncode())) {
                    s sVar = z0.b(this.M.getImageUrl()) ? s.BIG_IMAGE : null;
                    if (z0.b(this.M.getGifUrl())) {
                        if (z0.a(this.M.getImageUrl())) {
                            sVar = s.GIF;
                        }
                        this.f42007z.setWebViewClient(new y(this));
                        j();
                    }
                    return sVar;
                }
                if (this.f41981g && this.W != null) {
                    if (z0.b(this.M.getVideoUrlEncode()) && z0.a(this.M.getImageUrl())) {
                        return s.VIDEO;
                    }
                    if (z0.b(this.M.getVideoUrlEncode()) && z0.b(this.M.getImageUrl())) {
                        if (com.mbridge.msdk.videocommon.download.l.a(this.W, getReadyRate())) {
                            return s.VIDEO;
                        }
                        s sVar2 = s.BIG_IMAGE;
                        if (z10 && this.f41969a) {
                            this.W.b(new x(this));
                        }
                        return sVar2;
                    }
                } else {
                    return s.BIG_IMAGE;
                }
            }
            return null;
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return s.BIG_IMAGE;
        }
    }

    private void b() {
        try {
            if (this.M == null) {
                p0.c(TAG, "campaign is null addPlayerView return");
            }
            MediaViewPlayerView mediaViewPlayerView = this.f42003v;
            if (mediaViewPlayerView != null && mediaViewPlayerView.getParent() != null) {
                ((ViewGroup) this.f42003v.getParent()).removeView(this.f42003v);
            }
            Z();
            MediaViewPlayerView mediaViewPlayerView2 = new MediaViewPlayerView(getContext());
            this.f42003v = mediaViewPlayerView2;
            mediaViewPlayerView2.showProgressView(this.f41989k);
            this.f42003v.showSoundIndicator(this.f41991l);
            if (this.f41979f) {
                this.f42003v.openSound();
            } else {
                this.f42003v.closeSound();
            }
            this.f42003v.setAllowLoopPlay(this.f41971b);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f42003v.initPlayerViewData(getPlayUrl(), this.M, y(), this, this.W, getUnitId());
            this.f42003v.setOnMediaViewPlayerViewListener(new u(this));
            this.f42004w.addView(this.f42003v, -1, -1);
            T();
            AdSession adSession = this.f41998q;
            if (adSession != null) {
                MediaViewPlayerView mediaViewPlayerView3 = this.f42003v;
                if (mediaViewPlayerView3 != null) {
                    mediaViewPlayerView3.registerView(adSession);
                }
                this.f41999r = AdEvents.createAdEvents(this.f41998q);
                this.f42000s = MediaEvents.createMediaEvents(this.f41998q);
                this.f41998q.start();
                this.f41999r.loaded(VastProperties.createVastPropertiesForNonSkippableMedia(true, Position.STANDALONE));
                MediaViewPlayerView mediaViewPlayerView4 = this.f42003v;
                if (mediaViewPlayerView4 != null) {
                    mediaViewPlayerView4.setVideoEvents(this.f42000s);
                }
                try {
                    AdEvents adEvents = this.f41999r;
                    if (adEvents != null) {
                        adEvents.impressionOccurred();
                    }
                } catch (Exception e10) {
                    p0.a("omsdk", e10.getMessage());
                }
            }
        } catch (Throwable th3) {
            th = th3;
            p0.b(TAG, th.getMessage());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class n implements NativeListener.NativeTrackingListener {
        public n() {
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onFinishRedirection(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.n();
                BaseMBMediaView.this.m();
                BaseMBMediaView.this.a(campaign, str);
            } catch (Exception e10) {
                p0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public boolean onInterceptDefaultLoadingDialog() {
            return true;
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onRedirectionFailed(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.n();
                BaseMBMediaView.this.m();
                BaseMBMediaView.this.b(campaign, str);
            } catch (Exception e10) {
                p0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.out.BaseTrackingListener
        public void onStartRedirection(Campaign campaign, String str) {
            try {
                BaseMBMediaView.this.Y();
                BaseMBMediaView.this.W();
                BaseMBMediaView.this.c(campaign, str);
            } catch (Exception e10) {
                p0.b(BaseMBMediaView.TAG, e10.getMessage());
            }
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDismissLoading(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadFinish(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadProgress(int i10) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onDownloadStart(Campaign campaign) {
        }

        @Override // com.mbridge.msdk.out.NativeListener.NativeTrackingListener
        public void onShowLoading(Campaign campaign) {
        }
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onBufferingTimeOut(String str) {
    }

    public BaseMBMediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41969a = true;
        this.f41971b = true;
        this.f41973c = true;
        this.f41975d = true;
        this.f41977e = true;
        this.f41979f = false;
        this.f41981g = true;
        this.f41983h = false;
        this.f41985i = false;
        this.f41987j = false;
        this.f41989k = true;
        this.f41991l = true;
        this.f41993m = new ArrayList<>();
        this.f41995n = new ArrayList<>();
        this.f41996o = false;
        this.f41997p = false;
        this.f41998q = null;
        this.f41999r = null;
        this.f42000s = null;
        this.f42001t = 0;
        this.f42002u = false;
        this.W = null;
        this.f41970a0 = null;
        this.f41978e0 = false;
        this.f41980f0 = false;
        this.f41988j0 = false;
        this.f41992l0 = false;
        this.f41994m0 = new h();
        b(context);
    }

    private boolean c(Context context) {
        return (context.getResources().getConfiguration().screenLayout & 15) >= 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(View view) {
        try {
            return !d1.a(view, this.M == null ? 0 : r1.getImpReportType());
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
            return false;
        }
    }

    public void a() {
        WindowInsets rootWindowInsets;
        CampaignEx campaignEx;
        try {
            if (getRootView() != null && (getRootView() instanceof ViewGroup)) {
                BaseView.a aVarHandleViewStyleResult = handleViewStyleResult(getContext());
                if (aVarHandleViewStyleResult == null) {
                    return;
                }
                BaseView fullScreenViewByStyle = getFullScreenViewByStyle(getContext(), aVarHandleViewStyleResult);
                this.E = fullScreenViewByStyle;
                if (fullScreenViewByStyle != null && k()) {
                    com.mbridge.msdk.nativex.view.mbfullview.a aVarA = com.mbridge.msdk.nativex.view.mbfullview.a.a(getContext());
                    BaseView baseView = this.E;
                    aVarA.a(baseView.style, this.M, baseView);
                    this.f41983h = true;
                    this.f41997p = false;
                    MediaViewPlayerView mediaViewPlayerView = this.f42003v;
                    if (mediaViewPlayerView != null) {
                        mediaViewPlayerView.setEnterFullScreen();
                        this.f42003v.setIsActivePause(false);
                    }
                    c();
                    FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.content);
                    RelativeLayout relativeLayout = new RelativeLayout(getContext());
                    this.D = relativeLayout;
                    relativeLayout.setClickable(true);
                    ViewGroup viewGroup = (ViewGroup) this.f42003v.getParent();
                    int childCount = viewGroup.getChildCount();
                    int i10 = 0;
                    while (i10 < childCount && viewGroup.getChildAt(i10) != this.f42003v) {
                        i10++;
                    }
                    this.K = i10;
                    FrameLayout frameLayout2 = new FrameLayout(getContext());
                    frameLayout2.setId(100);
                    viewGroup.addView(frameLayout2, i10, new ViewGroup.LayoutParams(getWidth(), getHeight()));
                    viewGroup.removeView(this.f42003v);
                    ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                    relativeLayout.setId(101);
                    new RelativeLayout.LayoutParams(-1, -1);
                    this.J.addView(this.f42003v, new RelativeLayout.LayoutParams(-1, -1));
                    if (this.J != null && (campaignEx = this.M) != null && campaignEx.getPrivacyButtonTemplateVisibility() != 0) {
                        try {
                            MBAdChoice mBAdChoice = new MBAdChoice(com.mbridge.msdk.foundation.controller.c.m().d());
                            mBAdChoice.setCampaign(this.M);
                            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 12.0f), u0.a(com.mbridge.msdk.foundation.controller.c.m().d(), 12.0f));
                            layoutParams2.addRule(11);
                            layoutParams2.addRule(12);
                            this.J.addView(mBAdChoice, layoutParams2);
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                    if (this.f42002u) {
                        a(frameLayout);
                    }
                    frameLayout.addView(relativeLayout, layoutParams);
                    int i11 = i.f42016a[this.E.style.ordinal()] != 2 ? -16777216 : -1;
                    int i12 = this.f42001t;
                    if (i12 != 0) {
                        relativeLayout.setBackgroundColor(i12);
                    } else {
                        relativeLayout.setBackgroundColor(i11);
                    }
                    this.E.setId(103);
                    RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
                    int[] iArr = new int[2];
                    frameLayout.getLocationInWindow(iArr);
                    int i13 = iArr[1];
                    this.f41976d0 = i13;
                    if (i13 == 0 && (rootWindowInsets = getRootWindowInsets()) != null) {
                        layoutParams3.setMargins(0, rootWindowInsets.getStableInsetTop(), 0, 0);
                    }
                    relativeLayout.addView(this.E, layoutParams3);
                    s();
                    Q();
                    MediaViewPlayerView mediaViewPlayerView2 = this.f42003v;
                    if (mediaViewPlayerView2 != null) {
                        mediaViewPlayerView2.openSound();
                        MediaViewPlayerView mediaViewPlayerView3 = this.f42003v;
                        mediaViewPlayerView3.setMediaViewPlayListener(new p(mediaViewPlayerView3));
                    }
                    b(false);
                    F();
                    return;
                }
                return;
            }
            p0.c(TAG, "rootView is null");
        } catch (Exception e11) {
            p0.b(TAG, e11.getMessage());
        }
    }

    private void b(int i10) {
        CampaignEx.b mediaViewHolder;
        Map<Integer, String> map;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f40509b || (map = mediaViewHolder.f40508a) == null || map.size() <= 0) {
                return;
            }
            Map<Integer, String> map2 = mediaViewHolder.f40508a;
            Iterator<Map.Entry<Integer, String>> it = map2.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<Integer, String> next = it.next();
                Integer key = next.getKey();
                String value = next.getValue();
                if (i10 >= key.intValue() && !TextUtils.isEmpty(value)) {
                    Context context = getContext();
                    CampaignEx campaignEx2 = this.M;
                    com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), value, false, false);
                    it.remove();
                }
            }
            if (map2.size() <= 0) {
                mediaViewHolder.f40509b = true;
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class l implements com.mbridge.msdk.foundation.same.image.c {

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        public class a extends com.mbridge.msdk.widget.a {
            public a() {
            }

            @Override // com.mbridge.msdk.widget.a
            public void a(View view) {
                if (BaseMBMediaView.this.f41990k0 == null) {
                    BaseMBMediaView.this.a(view.getContext());
                } else {
                    BaseMBMediaView baseMBMediaView = BaseMBMediaView.this;
                    baseMBMediaView.a(baseMBMediaView.f41990k0);
                }
            }
        }

        public l() {
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onSuccessLoad(Bitmap bitmap, String str) {
            if (BaseMBMediaView.this.B == null || BaseMBMediaView.this.f41970a0 != s.BIG_IMAGE) {
                return;
            }
            if (bitmap != null) {
                BaseMBMediaView.this.R = bitmap.getWidth();
                BaseMBMediaView.this.S = bitmap.getHeight();
                BaseMBMediaView.this.B.setImageUrl(str);
                BaseMBMediaView.this.B.setImageBitmap(bitmap);
            }
            a1.a(BaseMBMediaView.this.B, BaseMBMediaView.this.M.getLocalRequestId(), BaseMBMediaView.this.M.getLocalAllowTrackClick());
            BaseMBMediaView.this.B.setOnClickListener(new a());
        }

        @Override // com.mbridge.msdk.foundation.same.image.c
        public void onFailedLoad(String str, String str2) {
        }
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void handlerPlayableException(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void notifyCloseBtn(Object obj, String str) {
    }

    @Override // com.mbridge.msdk.playercommon.VideoPlayerStatusListener
    public void onPlayProgressMS(int i10, int i11) {
    }

    @Override // com.mbridge.msdk.video.signal.communication.BaseIRewardCommunication
    public void setOrientation(Object obj, String str) {
    }

    private void b(boolean z10) {
        try {
            int nvT2 = this.M.getNvT2();
            if (this.A == null) {
                WindVaneWebViewForNV windVaneWebViewForNV = new WindVaneWebViewForNV(getContext());
                this.A = windVaneWebViewForNV;
                windVaneWebViewForNV.setObject(this);
                this.A.setBackListener(new e());
                this.A.setWebViewListener(new f());
            }
            if (nvT2 != 3) {
                if (nvT2 == 4) {
                    this.f41980f0 = true;
                    CampaignEx campaignEx = this.M;
                    if (campaignEx != null) {
                        com.mbridge.msdk.foundation.same.webview.a aVar = new com.mbridge.msdk.foundation.same.webview.a(campaignEx);
                        aVar.a(this.M.getAppName());
                        this.A.setDownloadListener(aVar);
                        this.A.setFilter(new v(null));
                        return;
                    }
                    return;
                }
                return;
            }
            String str = this.M.getendcard_url();
            if (TextUtils.isEmpty(str)) {
                return;
            }
            this.M.getMediaViewHolder();
            if (str.contains(".zip") && str.contains(ResourceManager.KEY_MD5FILENAME)) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(str);
                if (z0.b(h5ResAddress)) {
                    this.f41980f0 = true;
                    this.A.loadUrl(h5ResAddress);
                    return;
                }
                return;
            }
            String htmlContentFromUrl = HTMLResourceManager.getInstance().getHtmlContentFromUrl(str);
            if (z0.b(htmlContentFromUrl)) {
                p0.a(TAG, "load html...");
                this.f41980f0 = true;
                this.A.loadDataWithBaseURL(str, htmlContentFromUrl, "text/html", C.UTF8_NAME, null);
            }
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
        }
    }

    private void a(FrameLayout frameLayout) {
        BitmapDrawable bitmapDrawableA;
        if (frameLayout == null || (bitmapDrawableA = com.mbridge.msdk.foundation.controller.c.m().a(getUnitId(), this.M.getAdType())) == null) {
            return;
        }
        ImageView imageView = new ImageView(com.mbridge.msdk.foundation.controller.c.m().d());
        u0.a(imageView, bitmapDrawableA, getResources().getDisplayMetrics());
        this.E.addView(imageView, new RelativeLayout.LayoutParams(-1, -1));
        AdSession adSession = this.f41998q;
        if (adSession != null) {
            adSession.addFriendlyObstruction(imageView, FriendlyObstructionPurpose.OTHER, null);
        }
    }

    private void a(View view, float f10, float f11) {
        if (view == null) {
            return;
        }
        try {
            double d10 = this.P;
            double d11 = 0.0d;
            if (d10 > 0.0d) {
                double d12 = this.Q;
                if (d12 > 0.0d) {
                    double d13 = d10 / d12;
                    if (f10 > 0.0f && f11 > 0.0f) {
                        d11 = f10 / f11;
                    }
                    double dA = u0.a(Double.valueOf(d13));
                    double dA2 = u0.a(Double.valueOf(d11));
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f42004w.getLayoutParams();
                    RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) view.getLayoutParams();
                    boolean z10 = c(getContext()) && this.f41985i;
                    int i10 = -1;
                    if (dA > dA2) {
                        double d14 = (f10 * this.Q) / this.P;
                        layoutParams2.width = -1;
                        if (!z10) {
                            i10 = (int) d14;
                        }
                        layoutParams2.height = i10;
                        layoutParams2.addRule(13);
                        layoutParams.width = this.O;
                        layoutParams.height = (int) d14;
                        layoutParams.addRule(13);
                    } else if (dA < dA2) {
                        double d15 = f11 * d13;
                        layoutParams2.width = z10 ? -1 : (int) d15;
                        layoutParams2.height = -1;
                        layoutParams2.addRule(13);
                        layoutParams.width = (int) d15;
                        layoutParams.height = this.N;
                        layoutParams.addRule(13);
                    } else {
                        layoutParams2.width = -1;
                        layoutParams2.height = -1;
                        layoutParams.width = this.O;
                        layoutParams.height = this.N;
                        layoutParams.addRule(13);
                    }
                    if (!this.f41983h) {
                        this.f42004w.setLayoutParams(layoutParams);
                    }
                    view.setLayoutParams(layoutParams2);
                    return;
                }
            }
            setPlayViewParamsDefault(view);
        } catch (Throwable th2) {
            p0.b(TAG, th2.getMessage());
        }
    }

    private void a(int i10, int i11) {
        CampaignEx.b mediaViewHolder;
        try {
            CampaignEx campaignEx = this.M;
            if (campaignEx == null || (mediaViewHolder = campaignEx.getMediaViewHolder()) == null || mediaViewHolder.f40515h || i11 == 0) {
                return;
            }
            List<Map<Integer, String>> listO = this.M.getNativeVideoTracking().o();
            int i12 = ((i10 + 1) * 100) / i11;
            if (listO != null) {
                int i13 = 0;
                while (i13 < listO.size()) {
                    Map<Integer, String> map = listO.get(i13);
                    if (map != null && map.size() > 0) {
                        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry<Integer, String> next = it.next();
                            int iIntValue = next.getKey().intValue();
                            String value = next.getValue();
                            if (iIntValue <= i12 && !TextUtils.isEmpty(value)) {
                                Context context = getContext();
                                CampaignEx campaignEx2 = this.M;
                                com.mbridge.msdk.click.a.a(context, campaignEx2, campaignEx2.getCampaignUnitId(), new String[]{value}, false, true);
                                it.remove();
                                listO.remove(i13);
                                i13--;
                            }
                        }
                    }
                    i13++;
                }
                if (listO.size() <= 0) {
                    mediaViewHolder.f40515h = true;
                }
            }
        } catch (Throwable unused) {
            p0.b(TAG, "reportPlayPercentageData error");
        }
    }

    private String a(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            return !TextUtils.isEmpty(string) ? Base64.encodeToString(string.getBytes(), 2) : "";
        } catch (Throwable unused) {
            p0.b(TAG, "code to string is error");
            return "";
        }
    }

    private String a(List<CampaignEx> list, String str, String str2) throws JSONException {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            JSONArray camplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", camplistToJson);
            jSONObject.put(MBridgeConstans.PROPERTIES_UNIT_ID, str);
            jSONObject.put("sdk_info", str2);
            return jSONObject.toString();
        } catch (Exception e10) {
            p0.b(TAG, e10.getMessage());
            return null;
        }
    }
}
