package com.bytedance.sdk.openadsdk.jpo.jd;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGImageItem;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAd;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoAdListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGVideoMediaView;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.opi;
import com.bytedance.sdk.openadsdk.core.settings.au;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.wqx.wqx;
import com.bytedance.sdk.openadsdk.core.zz.jr;
import com.bytedance.sdk.openadsdk.core.zz.nmd;
import com.bytedance.sdk.openadsdk.core.zz.zz;
import com.bytedance.sdk.openadsdk.utils.va;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: au, reason: collision with root package name */
    private boolean f21218au = false;

    /* renamed from: cm, reason: collision with root package name */
    private boolean f21219cm;

    /* renamed from: if, reason: not valid java name */
    private com.bytedance.sdk.openadsdk.core.wqx.jd f155if;

    /* renamed from: jd, reason: collision with root package name */
    private final Context f21220jd;

    /* renamed from: jj, reason: collision with root package name */
    private jd f21221jj;
    protected final dt jpo;

    /* renamed from: ju, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.wqx.jpo f21222ju;
    private WeakReference<com.bytedance.sdk.openadsdk.core.au.jd.jj> my;
    private WeakReference<com.bytedance.sdk.openadsdk.core.p000if.jj> oya;

    /* renamed from: qk, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx f21223qk;
    private final String wqx;
    private PAGMediaView xyk;

    /* renamed from: yd, reason: collision with root package name */
    private PAGMediaView f21224yd;
    private nmd zz;

    public jpo(Context context, dt dtVar, String str) {
        this.f21220jd = context;
        this.jpo = dtVar;
        this.wqx = str;
    }

    private PAGMediaView oya() {
        if (!dt.my(this.jpo)) {
            com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx wqxVar = this.f21223qk;
            if (wqxVar == null) {
                return null;
            }
            nmd nmdVarCm = wqxVar.cm();
            nmdVarCm.setTag(520093762, Boolean.TRUE);
            if (!this.f21218au) {
                this.f21223qk.my();
            }
            this.f21218au = true;
            return jpo(nmdVarCm);
        }
        com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx wqxVar2 = this.f21223qk;
        if (wqxVar2 == null || !(wqxVar2 instanceof com.bytedance.sdk.openadsdk.jpo.jd.jpo.jd)) {
            return null;
        }
        jr jrVar = (jr) wqxVar2.cm();
        jrVar.setTag(520093762, Boolean.TRUE);
        if (!this.f21218au) {
            this.f21223qk.my();
        }
        this.f21218au = true;
        return jpo(jrVar);
    }

    public void au() {
        com.bytedance.sdk.openadsdk.core.p000if.jj jjVar;
        WeakReference<com.bytedance.sdk.openadsdk.core.p000if.jj> weakReference = this.oya;
        if (weakReference == null || (jjVar = weakReference.get()) == null) {
            return;
        }
        jjVar.jpo(13);
    }

    public String cm() {
        dt dtVar = this.jpo;
        if (dtVar != null) {
            return jpo(dtVar);
        }
        return null;
    }

    /* renamed from: if, reason: not valid java name */
    public void m486if() {
        Context context = this.f21220jd;
        if (context != null) {
            TTWebsiteActivity.jpo(context, this.jpo, this.wqx);
        }
    }

    public nmd jd() {
        return this.zz;
    }

    public String jj() {
        dt dtVar = this.jpo;
        if (dtVar != null) {
            return dtVar.clt();
        }
        return null;
    }

    public void jpo(jd jdVar) {
        this.f21221jj = jdVar;
    }

    public View ju() {
        dt dtVar;
        if (sq.jpo() == null || (dtVar = this.jpo) == null || !dtVar.ig() || !this.jpo.jr()) {
            return null;
        }
        ImageView imageView = new ImageView(sq.jpo());
        com.bytedance.sdk.openadsdk.opi.jd.jd().jpo((int) va.jpo(sq.jpo(), 14.0f, true), imageView, this.jpo);
        return imageView;
    }

    public String my() {
        dt dtVar = this.jpo;
        if (dtVar != null) {
            return jd(dtVar);
        }
        return null;
    }

    public PAGMediaView qk() {
        PAGMediaView pAGMediaViewZz;
        com.bytedance.sdk.openadsdk.utils.jd.jpo(this.jpo);
        if (this.jpo.cql() == 2) {
            pAGMediaViewZz = oya();
            jpo(pAGMediaViewZz);
        } else {
            pAGMediaViewZz = zz();
        }
        if (pAGMediaViewZz != null) {
            pAGMediaViewZz.setMrcTrackerKey(com.bytedance.sdk.openadsdk.hmu.jd.my.jd(this.jpo));
        } else {
            pAGMediaViewZz = new PAGMediaView(this.f21220jd) { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jpo.1
                @Override // android.view.ViewGroup, android.view.View
                public void onAttachedToWindow() {
                    super.onAttachedToWindow();
                    com.bytedance.sdk.openadsdk.utils.cm.jpo(this, jpo.this.jpo);
                }
            };
        }
        if (pAGMediaViewZz instanceof PAGVideoMediaView) {
            ((PAGVideoMediaView) pAGMediaViewZz).setMaterialMeta(this.jpo);
        }
        this.f21224yd = pAGMediaViewZz;
        return pAGMediaViewZz;
    }

    public PAGImageItem wqx() {
        dt dtVar = this.jpo;
        if (dtVar == null || dtVar.ou() == null) {
            return null;
        }
        return new PAGImageItem(this.jpo.ou().wqx(), this.jpo.ou().jd(), this.jpo.ou().jpo(), (float) this.jpo.ou().cm());
    }

    public PAGMediaView xyk() {
        return this.f21224yd;
    }

    public View yd() {
        if (sq.jpo() == null) {
            return null;
        }
        PAGLogoView pAGLogoView = new PAGLogoView(sq.jpo()) { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jpo.4
            int jpo = 0;

            /* renamed from: jd, reason: collision with root package name */
            int f21227jd = 0;

            @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
            public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
                super.onLayout(z10, i10, i11, i12, i13);
                try {
                    Object parent = getParent();
                    if (parent == null || this.jpo == 0 || this.f21227jd == 0) {
                        return;
                    }
                    int width = ((View) parent).getWidth();
                    int height = ((View) parent).getHeight();
                    int i14 = this.jpo;
                    if (width < i14 || height < this.f21227jd) {
                        float fMin = Math.min(height / this.f21227jd, width / i14);
                        int i15 = (width - this.jpo) / 2;
                        if (fMin != 1.0f) {
                            setScaleX(fMin);
                            setScaleY(fMin);
                            setTranslationX(i15);
                        }
                    }
                } catch (Throwable th2) {
                    th2.getMessage();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.core.widget.PAGLogoView, android.widget.LinearLayout, android.view.View
            public void onMeasure(int i10, int i11) {
                if (this.jpo == 0) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(LockFreeTaskQueueCore.MAX_CAPACITY_MASK, Integer.MIN_VALUE), i11);
                    this.jpo = getMeasuredWidth();
                    this.f21227jd = this.containerHeight;
                }
                setMeasuredDimension(this.jpo, this.f21227jd);
            }
        };
        pAGLogoView.initData(this.jpo);
        pAGLogoView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jpo.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                jpo.this.m486if();
            }
        });
        return pAGLogoView;
    }

    public PAGMediaView zz() {
        if (!dt.my(this.jpo)) {
            List<opi> listFri = this.jpo.fri();
            if (listFri == null || listFri.isEmpty()) {
                ApmHelper.reportCustomError("images empty", "getMediaView return null", new RuntimeException());
                return null;
            }
            ImageView imageView = new ImageView(this.f21220jd);
            imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            opi opiVar = listFri.get(0);
            if (opiVar != null) {
                com.bytedance.sdk.openadsdk.zz.cm.jpo(opiVar).wqx(1).jpo(com.bytedance.sdk.openadsdk.zz.wqx.jpo(this.jpo, opiVar.jpo(), imageView));
            }
            PAGMediaView pAGMediaViewJpo = jpo(imageView);
            if (this.f21222ju == null || !au.jrx().wqx(String.valueOf(this.jpo.jl()))) {
                pAGMediaViewJpo.setOnClickListener(null);
                pAGMediaViewJpo.setOnTouchListener(null);
            } else {
                pAGMediaViewJpo.setOnClickListener(this.f21222ju);
                pAGMediaViewJpo.setOnTouchListener(this.f21222ju);
            }
            pAGMediaViewJpo.setTag(520093762, Boolean.TRUE);
            PAGMediaView pAGMediaView = this.xyk;
            if (pAGMediaView != null) {
                pAGMediaView.setOnClickListener(null);
                this.xyk.setOnTouchListener(null);
            }
            this.xyk = pAGMediaViewJpo;
            return pAGMediaViewJpo;
        }
        jd jdVar = this.f21221jj;
        if (jdVar == null) {
            ApmHelper.reportCustomError("mPAGFeedVideoAdImpl null", "getMediaView return null", new RuntimeException());
            return null;
        }
        View viewMy = jdVar.my();
        if (viewMy == null) {
            ApmHelper.reportCustomError("adVideoView null", "getMediaView return null", new RuntimeException());
            return null;
        }
        if (viewMy.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewMy.getParent()).removeView(viewMy);
        }
        PAGMediaView pAGMediaView2 = this.xyk;
        if (pAGMediaView2 != null) {
            pAGMediaView2.setOnClickListener(null);
            this.xyk.setOnTouchListener(null);
        }
        PAGVideoMediaView pAGVideoMediaView = new PAGVideoMediaView(this.f21220jd, viewMy, this);
        pAGVideoMediaView.setTag(520093762, Boolean.TRUE);
        if (this.f21222ju == null || !au.jrx().wqx(String.valueOf(this.jpo.jl()))) {
            com.bytedance.sdk.openadsdk.core.wqx.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.wqx.wqx() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jpo.2
                @Override // com.bytedance.sdk.openadsdk.core.wqx.wqx
                public void jpo(View view, float f10, float f11, float f12, float f13, SparseArray<wqx.jpo> sparseArray, boolean z10) {
                    try {
                        ((PAGVideoMediaView) view).handleInterruptVideo();
                    } catch (Exception unused) {
                    }
                }
            };
            pAGVideoMediaView.setOnClickListener(wqxVar);
            pAGVideoMediaView.setOnTouchListener(wqxVar);
        } else {
            pAGVideoMediaView.setOnClickListener(this.f21222ju);
            pAGVideoMediaView.setOnTouchListener(this.f21222ju);
        }
        this.xyk = pAGVideoMediaView;
        pAGVideoMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return pAGVideoMediaView;
    }

    private String jd(dt dtVar) {
        return !TextUtils.isEmpty(dtVar.ozw()) ? dtVar.ozw() : !TextUtils.isEmpty(dtVar.xp()) ? dtVar.xp() : "";
    }

    public void jpo(com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx wqxVar) {
        this.f21223qk = wqxVar;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.au.jd.jj jjVar) {
        this.my = new WeakReference<>(jjVar);
    }

    public void jpo(boolean z10) {
        this.f21219cm = z10;
    }

    public PAGMediaView jpo() {
        return this.xyk;
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar) {
        this.f21222ju = jpoVar;
    }

    private wqx jd(final PAGVideoAdListener pAGVideoAdListener) {
        return new wqx() { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jpo.6
            @Override // com.bytedance.sdk.openadsdk.jpo.jd.wqx
            public void jd(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPaused();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jpo.jd.wqx
            public void jpo(int i10, int i11) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoError();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jpo.jd.wqx
            public void wqx(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdComplete();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.jpo.jd.wqx
            public void jpo(PAGNativeAd pAGNativeAd) {
                PAGVideoAdListener pAGVideoAdListener2 = pAGVideoAdListener;
                if (pAGVideoAdListener2 != null) {
                    pAGVideoAdListener2.onVideoAdPlay();
                }
            }
        };
    }

    private String jpo(dt dtVar) {
        if (dtVar.xur() != null && !TextUtils.isEmpty(dtVar.xur().jd())) {
            return dtVar.xur().jd();
        }
        if (!TextUtils.isEmpty(dtVar.as())) {
            return dtVar.as();
        }
        if (!TextUtils.isEmpty(dtVar.ozw())) {
            return dtVar.ozw();
        }
        return "";
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.wqx.jd jdVar) {
        this.f155if = jdVar;
    }

    private void jpo(PAGMediaView pAGMediaView) {
        if (pAGMediaView == null) {
            return;
        }
        try {
            pAGMediaView.setBackgroundColor(-16777216);
        } catch (Exception unused) {
        }
    }

    private PAGMediaView jpo(final View view) {
        int i10;
        if (view == null) {
            return null;
        }
        if (view.getParent() instanceof ViewGroup) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        nmd nmdVar = this.zz;
        if (nmdVar != null) {
            nmdVar.setClickListener(null);
            this.zz.setClickCreativeListener(null);
        }
        com.bytedance.sdk.openadsdk.core.wqx.jd jdVar = this.f155if;
        if (jdVar != null && (jdVar instanceof zz) && (view instanceof nmd)) {
            ((nmd) view).setClickListener((zz) jdVar);
        }
        com.bytedance.sdk.openadsdk.core.wqx.jpo jpoVar = this.f21222ju;
        if (jpoVar != null && (jpoVar instanceof com.bytedance.sdk.openadsdk.core.zz.xyk) && (view instanceof nmd)) {
            ((nmd) view).setClickCreativeListener((com.bytedance.sdk.openadsdk.core.zz.xyk) jpoVar);
        }
        PAGMediaView pAGMediaView = new PAGMediaView(this.f21220jd) { // from class: com.bytedance.sdk.openadsdk.jpo.jd.jpo.3
            private void jpo(boolean z10) {
                Integer num = this.jpo;
                if (num != null) {
                    com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(com.bytedance.sdk.openadsdk.hmu.jd.my.jpo(num), z10 ? 4 : 8);
                }
                dt dtVar = jpo.this.jpo;
                if (dtVar != null) {
                    com.bytedance.sdk.openadsdk.hmu.jpo.wqx.jpo(dtVar, z10);
                }
            }

            @Override // android.view.ViewGroup, android.view.View
            public void onAttachedToWindow() {
                super.onAttachedToWindow();
                com.bytedance.sdk.openadsdk.utils.cm.jpo(this, jpo.this.jpo);
            }

            @Override // android.view.View
            public void onWindowFocusChanged(boolean z10) {
                super.onWindowFocusChanged(z10);
                if (view instanceof nmd) {
                    return;
                }
                jpo(z10);
            }

            @Override // com.bytedance.sdk.openadsdk.api.nativeAd.PAGMediaView
            public void setVideoAdListener(PAGVideoAdListener pAGVideoAdListener) {
                super.setVideoAdListener(pAGVideoAdListener);
                jpo.this.jpo(pAGVideoAdListener);
            }
        };
        int i11 = -1;
        pAGMediaView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i11 = layoutParams.width;
            i10 = layoutParams.height;
        } else {
            i10 = -1;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i11, i10);
        layoutParams2.gravity = 17;
        pAGMediaView.addView(view, layoutParams2);
        if (view instanceof nmd) {
            this.zz = (nmd) view;
        }
        return pAGMediaView;
    }

    public void jpo(PAGVideoAdListener pAGVideoAdListener) {
        com.bytedance.sdk.openadsdk.jpo.jd.jpo.wqx wqxVar;
        if (this.jpo.cql() == 2 && dt.my(this.jpo) && (wqxVar = this.f21223qk) != null && (wqxVar instanceof com.bytedance.sdk.openadsdk.jpo.jd.jpo.jd)) {
            jr jrVar = (jr) wqxVar.cm();
            if (jrVar != null) {
                jrVar.setVideoAdListener(jd(pAGVideoAdListener));
                return;
            }
            return;
        }
        jd jdVar = this.f21221jj;
        if (jdVar != null) {
            jdVar.jpo(jd(pAGVideoAdListener));
        }
    }

    public void jpo(com.bytedance.sdk.openadsdk.core.p000if.jj jjVar) {
        this.oya = new WeakReference<>(jjVar);
    }
}
