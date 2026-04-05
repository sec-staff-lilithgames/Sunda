package com.bytedance.sdk.openadsdk.core.au.jd;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.os.Message;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.hx;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.core.widget.jr;
import com.bytedance.sdk.openadsdk.core.widget.nmd;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.va;
import java.lang.ref.WeakReference;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends my {
    private final Rect aix;
    private boolean cgn;
    private int cql;
    private final Rect cz;

    /* renamed from: dm, reason: collision with root package name */
    private ImageView f20135dm;

    /* renamed from: dn, reason: collision with root package name */
    private TextView f20136dn;
    private TextView duq;
    private final int erj;

    /* renamed from: et, reason: collision with root package name */
    private int f20137et;
    private TextView fy;
    private float gmx;
    private boolean hks;
    private View huv;

    /* renamed from: ic, reason: collision with root package name */
    private ImageView f20138ic;

    /* renamed from: ii, reason: collision with root package name */
    private int f20139ii;
    private final hx jkt;

    /* renamed from: kb, reason: collision with root package name */
    private final jr f20140kb;
    private int ota;

    /* renamed from: pe, reason: collision with root package name */
    private ImageView f20141pe;
    private ColorStateList ree;
    private TextView roc;
    private int rxq;
    private final Rect rzi;
    private ImageView sbx;

    /* renamed from: sg, reason: collision with root package name */
    private ColorStateList f20142sg;
    private View tic;

    /* renamed from: tl, reason: collision with root package name */
    private int f20143tl;
    private float umr;
    private final View.OnTouchListener ux;

    /* renamed from: va, reason: collision with root package name */
    private TextView f20144va;

    /* renamed from: vk, reason: collision with root package name */
    private final int f20145vk;
    private float voc;
    private TextView vrc;
    private final Rect wad;
    private TextView wcn;

    /* renamed from: wu, reason: collision with root package name */
    private float f20146wu;
    private View xk;

    /* renamed from: ya, reason: collision with root package name */
    private SeekBar f20147ya;
    private float ykp;

    /* renamed from: yq, reason: collision with root package name */
    private ColorStateList f20148yq;

    /* renamed from: zw, reason: collision with root package name */
    private final Rect f20149zw;

    public cm(Context context, ViewGroup viewGroup, boolean z10, int i10, dt dtVar, com.bykv.vk.openvk.jpo.jpo.jpo.cm.wqx wqxVar, boolean z11) {
        super(context, viewGroup, z10, i10, dtVar, wqxVar, z11);
        this.jkt = new hx(this);
        this.cgn = false;
        this.hks = false;
        this.rxq = 0;
        this.f20137et = 0;
        this.f20139ii = 0;
        this.cql = 0;
        this.ota = 0;
        this.wad = new Rect();
        this.aix = new Rect();
        this.f20143tl = 0;
        this.ux = new View.OnTouchListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.cm.7
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 2) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                } else if (actionMasked == 3) {
                    view.getParent().requestDisallowInterceptTouchEvent(false);
                }
                return false;
            }
        };
        this.cz = new Rect();
        this.rzi = new Rect();
        this.f20149zw = new Rect();
        this.f20185se = sq.jpo().getApplicationContext();
        cm(z11);
        this.wqx = viewGroup;
        this.f20183rq = z10;
        jr jrVar = new jr(this);
        this.f20140kb = jrVar;
        jrVar.jpo(this.f20183rq);
        DisplayMetrics displayMetrics = this.f20185se.getResources().getDisplayMetrics();
        this.erj = displayMetrics.widthPixels;
        this.f20145vk = displayMetrics.heightPixels;
        this.hmu = i10;
        this.sz = wqxVar;
        this.f20181nq = dtVar;
        cm(8);
        jpo(context, this.wqx);
        cm();
        m453if();
    }

    private void nq() {
        DisplayMetrics displayMetrics = this.f20185se.getResources().getDisplayMetrics();
        TextView textView = this.f20136dn;
        if (textView != null) {
            this.f20146wu = textView.getTextSize();
            this.f20136dn.setTextSize(2, 14.0f);
            ColorStateList textColors = this.f20136dn.getTextColors();
            this.f20142sg = textColors;
            if (textColors != null) {
                this.f20136dn.setTextColor(-1);
            }
            this.gmx = this.f20136dn.getAlpha();
            this.f20136dn.setAlpha(0.85f);
            this.f20136dn.setShadowLayer(0.0f, va.jd(this.f20185se, 0.5f), va.jd(this.f20185se, 0.5f), com.bytedance.sdk.component.utils.dt.qk(this.f20185se, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams = this.f20136dn.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                this.cz.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                va.jpo(this.f20136dn, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.cz.top, (int) TypedValue.applyDimension(1, 14.0f, displayMetrics), this.cz.bottom);
            }
        }
        TextView textView2 = this.wcn;
        if (textView2 != null) {
            this.umr = textView2.getTextSize();
            this.wcn.setTextSize(2, 14.0f);
            ColorStateList textColors2 = this.wcn.getTextColors();
            this.f20148yq = textColors2;
            if (textColors2 != null) {
                this.wcn.setTextColor(-1);
            }
            this.ykp = this.wcn.getAlpha();
            this.wcn.setAlpha(0.85f);
            this.wcn.setShadowLayer(0.0f, va.jd(this.f20185se, 0.5f), va.jd(this.f20185se, 0.5f), com.bytedance.sdk.component.utils.dt.qk(this.f20185se, "tt_b2000000"));
            ViewGroup.LayoutParams layoutParams2 = this.wcn.getLayoutParams();
            if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                this.rzi.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                TextView textView3 = this.wcn;
                int iApplyDimension = (int) TypedValue.applyDimension(1, 14.0f, displayMetrics);
                Rect rect = this.rzi;
                va.jpo(textView3, iApplyDimension, rect.top, rect.right, rect.bottom);
            }
        }
        ImageView imageView = this.sbx;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
            if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                this.f20149zw.set(marginLayoutParams3.leftMargin, marginLayoutParams3.topMargin, marginLayoutParams3.rightMargin, marginLayoutParams3.bottomMargin);
                ImageView imageView2 = this.sbx;
                Rect rect2 = this.f20149zw;
                va.jpo(imageView2, rect2.left, rect2.top, (int) TypedValue.applyDimension(1, 16.0f, displayMetrics), this.f20149zw.bottom);
            }
        }
        ImageView imageView3 = this.sbx;
        if (imageView3 != null) {
            imageView3.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this.f20185se, "tt_shrink_fullscreen"));
        }
        TextView textView4 = this.vrc;
        if (textView4 != null) {
            ColorStateList textColors3 = textView4.getTextColors();
            this.ree = textColors3;
            if (textColors3 != null) {
                this.vrc.setTextColor(-1);
            }
            this.voc = this.vrc.getAlpha();
            this.vrc.setAlpha(0.85f);
            ViewGroup.LayoutParams layoutParams4 = this.vrc.getLayoutParams();
            if (layoutParams4 instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams4 = (ViewGroup.MarginLayoutParams) layoutParams4;
                this.aix.set(marginLayoutParams4.leftMargin, marginLayoutParams4.topMargin, marginLayoutParams4.rightMargin, marginLayoutParams4.bottomMargin);
                TextView textView5 = this.vrc;
                int iApplyDimension2 = (int) TypedValue.applyDimension(1, 1.0f, displayMetrics);
                Rect rect3 = this.rzi;
                va.jpo(textView5, iApplyDimension2, rect3.top, rect3.right, rect3.bottom);
            }
        }
        View view = this.tic;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
            this.f20143tl = layoutParams5.height;
            layoutParams5.height = (int) TypedValue.applyDimension(1, 49.0f, displayMetrics);
            this.tic.setLayoutParams(layoutParams5);
            this.tic.setBackgroundResource(com.bytedance.sdk.component.utils.dt.cm(this.f20185se, "tt_shadow_fullscreen_top"));
        }
        jd(false, true);
    }

    private void se() {
        TextView textView = this.f20136dn;
        if (textView != null) {
            textView.setTextSize(0, this.f20146wu);
            ColorStateList colorStateList = this.f20142sg;
            if (colorStateList != null) {
                this.f20136dn.setTextColor(colorStateList);
            }
            this.f20136dn.setAlpha(this.gmx);
            this.f20136dn.setShadowLayer(va.jd(this.f20185se, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.dt.qk(this.f20185se, "tt_72000000"));
            TextView textView2 = this.f20136dn;
            Rect rect = this.cz;
            va.jpo(textView2, rect.left, rect.top, rect.right, rect.bottom);
        }
        TextView textView3 = this.wcn;
        if (textView3 != null) {
            textView3.setTextSize(0, this.umr);
            ColorStateList colorStateList2 = this.f20148yq;
            if (colorStateList2 != null) {
                this.wcn.setTextColor(colorStateList2);
            }
            this.wcn.setAlpha(this.ykp);
            this.wcn.setShadowLayer(va.jd(this.f20185se, 1.0f), 0.0f, 0.0f, com.bytedance.sdk.component.utils.dt.qk(this.f20185se, "tt_72000000"));
            TextView textView4 = this.wcn;
            Rect rect2 = this.rzi;
            va.jpo(textView4, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
        ImageView imageView = this.sbx;
        if (imageView != null) {
            Rect rect3 = this.f20149zw;
            va.jpo(imageView, rect3.left, rect3.top, rect3.right, rect3.bottom);
        }
        ImageView imageView2 = this.sbx;
        if (imageView2 != null) {
            imageView2.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this.f20185se, "tt_enlarge_video"));
        }
        TextView textView5 = this.vrc;
        if (textView5 != null) {
            ColorStateList colorStateList3 = this.ree;
            if (colorStateList3 != null) {
                textView5.setTextColor(colorStateList3);
            }
            this.vrc.setAlpha(this.voc);
            TextView textView6 = this.vrc;
            Rect rect4 = this.rzi;
            va.jpo(textView6, rect4.left, rect4.top, rect4.right, rect4.bottom);
        }
        View view = this.tic;
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = this.f20143tl;
            this.tic.setLayoutParams(layoutParams);
            this.tic.setBackground(ju.jpo(this.f20185se, "tt_video_black_desc_gradient"));
        }
        jd(false, true);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void cm() {
        super.cm();
        this.f20140kb.jpo(this.wqx);
        va.jpo((View) this.f20135dm, (this.f20183rq || (this.hmu & 1) == 1) ? 8 : 0);
        this.f20135dm.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.cm.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (cm.this.hna()) {
                    cm cmVar = cm.this;
                    cmVar.pdm.wqx(cmVar, view);
                }
            }
        });
        va.jpo((View) this.duq, (!this.f20183rq || (this.hmu & 2) == 2) ? 0 : 8);
        this.duq.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.cm.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (cm.this.hna()) {
                    cm cmVar = cm.this;
                    cmVar.pdm.cm(cmVar, view);
                }
            }
        });
        this.f20141pe.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.cm.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (cm.this.hna()) {
                    cm cmVar = cm.this;
                    cmVar.pdm.my(cmVar, view);
                }
            }
        });
        this.f20138ic.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.cm.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                cm.this.jd(false, true);
                cm.this.xyk();
                cm.this.qk();
                cm.this.hna();
            }
        });
        this.sbx.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.cm.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (cm.this.hna()) {
                    cm cmVar = cm.this;
                    cmVar.pdm.jd(cmVar, view);
                }
            }
        });
        this.f20147ya.setThumbOffset(0);
        this.f20147ya.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.bytedance.sdk.openadsdk.core.au.jd.cm.6
            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(SeekBar seekBar, int i10, boolean z10) {
                if (cm.this.hna()) {
                    cm cmVar = cm.this;
                    cmVar.pdm.jpo(cmVar, i10, z10);
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(SeekBar seekBar) {
                if (!cm.this.cgn && cm.this.f20185se != null) {
                    seekBar.setThumb(ju.jpo(sq.jpo(), "tt_seek_thumb_press"));
                }
                if (cm.this.hna()) {
                    seekBar.setThumbOffset(0);
                    cm cmVar = cm.this;
                    cmVar.pdm.jd(cmVar, seekBar.getProgress());
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(SeekBar seekBar) {
                if (!cm.this.cgn && cm.this.f20185se != null) {
                    seekBar.setThumb(ju.jpo(sq.jpo(), "tt_seek_thumb_normal"));
                }
                if (cm.this.hna()) {
                    seekBar.setThumbOffset(0);
                    cm cmVar = cm.this;
                    cmVar.pdm.jpo(cmVar, seekBar.getProgress());
                }
            }
        });
        this.f20147ya.setOnTouchListener(this.ux);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jd(boolean z10) {
        int i10 = yd() ? this.f20145vk : this.f20186sq;
        int iJd = yd() ? this.erj : this.opi;
        if (this.nmd <= 0 || this.f20179jr <= 0 || i10 <= 0) {
            return;
        }
        if (!rq() && !yd() && (this.hmu & 8) != 8) {
            iJd = va.jd(this.f20185se, 228.0f);
        }
        int i11 = this.f20179jr;
        int i12 = this.nmd;
        int i13 = (int) (i12 * ((i10 * 1.0f) / i11));
        if (i13 > iJd) {
            i10 = (int) (i11 * ((iJd * 1.0f) / i12));
        } else {
            iJd = i13;
        }
        if (!z10 && !yd()) {
            i10 = this.f20186sq;
            iJd = this.opi;
        }
        this.f20172cm.jpo(i10, iJd);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jj() {
        this.jkt.removeMessages(1);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my, com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd
    public /* bridge */ /* synthetic */ void jpo(dt dtVar, WeakReference weakReference, boolean z10) {
        jpo(dtVar, (WeakReference<Context>) weakReference, z10);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my, com.bytedance.sdk.openadsdk.core.widget.nmd.jd
    public void ju() {
        jpo(true, false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void my() {
        this.jkt.removeMessages(1);
        this.jkt.sendMessageDelayed(this.jkt.obtainMessage(1), 2000L);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void qk() {
        dt dtVar;
        va.jj(this.f20178jj);
        va.jj(this.f20182qk);
        va.my(this.xk);
        if (this.xyk != null && (dtVar = this.f20181nq) != null && dtVar.ww() != null && this.f20181nq.ww().yd() != null) {
            va.jj(this.xyk);
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20181nq.ww().yd(), this.f20181nq.ww().wqx(), this.f20181nq.ww().jd(), this.xyk, this.f20181nq);
        }
        if (this.my.getVisibility() == 0) {
            va.jpo((View) this.my, 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void wqx(boolean z10) {
        TextView textView = this.f20144va;
        if (textView != null) {
            va.jpo((View) textView, (!this.f20183rq && z10) ? 0 : 8);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void xyk() {
        va.my(this.f20178jj);
        va.my(this.xk);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my, com.bytedance.sdk.openadsdk.core.widget.nmd.jd
    public boolean yd() {
        return this.cgn;
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void zz() {
        this.f20147ya.setProgress(0);
        this.f20147ya.setSecondaryProgress(0);
        this.wcn.setText(com.bytedance.sdk.component.utils.dt.jpo(this.f20185se, "tt_00_00"));
        this.f20136dn.setText(com.bytedance.sdk.component.utils.dt.jpo(this.f20185se, "tt_00_00"));
        cm(8);
        if (hmu()) {
            this.f20172cm.setVisibility(8);
        }
        ImageView imageView = this.xyk;
        if (imageView != null) {
            imageView.setImageDrawable(null);
        }
        cm(8);
        va.jpo(this.huv, 8);
        va.jpo(this.f20189yd, 8);
        va.jpo((View) this.f20180ju, 8);
        va.jpo(this.f114if, 8);
        va.jpo((View) this.f20171au, 8);
        va.jpo((View) this.oya, 8);
        va.jpo((View) this.prr, 8);
        nmd nmdVar = this.f20176hx;
        if (nmdVar != null) {
            nmdVar.jpo(true);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(Context context, View view) {
        super.jpo(context, view);
        this.duq = (TextView) view.findViewById(hna.f21522fc);
        this.f20135dm = (ImageView) view.findViewById(hna.f21542ou);
        this.tic = view.findViewById(hna.iwg);
        this.f20141pe = (ImageView) view.findViewById(hna.fri);
        this.f20144va = (TextView) view.findViewById(hna.kye);
        this.vrc = (TextView) view.findViewById(hna.f21565zq);
        this.roc = (TextView) view.findViewById(hna.f21537mg);
        this.xk = view.findViewById(hna.zrw);
        this.f20138ic = (ImageView) view.findViewById(hna.f21525hk);
        TextView textView = (TextView) view.findViewById(hna.zmh);
        this.fy = textView;
        textView.setText(com.bytedance.sdk.component.utils.dt.jpo(context, "tt_video_retry_des_txt"));
        this.f20147ya = (SeekBar) view.findViewById(hna.f21560xp);
        this.wcn = (TextView) view.findViewById(hna.clt);
        this.f20136dn = (TextView) view.findViewById(hna.ozw);
        this.huv = view.findViewById(hna.ted);
        this.sbx = (ImageView) view.findViewById(hna.f21545ql);
        this.zz = view.findViewById(hna.uhu);
    }

    private void my(boolean z10) {
        if (z10) {
            nq();
        } else {
            se();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jd(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = this.wqx) == null || !(viewGroup2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        this.cgn = false;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.wqx.getLayoutParams();
        marginLayoutParams.width = this.f20139ii;
        marginLayoutParams.height = this.cql;
        marginLayoutParams.leftMargin = this.f20137et;
        marginLayoutParams.topMargin = this.rxq;
        this.wqx.setLayoutParams(marginLayoutParams);
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.addRule(3, this.ota);
            viewGroup.setLayoutParams(layoutParams2);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            Rect rect = this.wad;
            va.jpo(viewGroup, rect.left, rect.top, rect.right, rect.bottom);
        }
        jd(true);
        this.sbx.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this.f20185se, "tt_enlarge_video"));
        this.f20147ya.setThumb(ju.jpo(this.f20185se, "tt_seek_thumb_normal"));
        this.f20147ya.setThumbOffset(0);
        com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo((View) this.wqx, true);
        my(this.cgn);
        va.jpo(this.tic, 8);
        if ((this.hmu & 2) == 2) {
            va.jpo((View) this.duq, 0);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(String str) {
        TextView textView = this.f20144va;
        if (textView != null) {
            textView.setText(str);
        }
        TextView textView2 = this.vrc;
        if (textView2 != null) {
            textView2.setText(str);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(int i10) {
        View view = this.huv;
        if (view == null || view.getVisibility() != 0) {
            this.f20147ya.setProgress(i10);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(long j10, long j11) {
        this.wcn.setText(com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(j11));
        this.f20136dn.setText(com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(j10));
        this.f20147ya.setProgress(com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(j10, j11));
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my, com.bykv.vk.openvk.jpo.jpo.jpo.cm.jd
    public void jpo() {
        jpo(false, this.f20183rq);
        jr();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(long j10) {
        this.f20136dn.setText(com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo(j10));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(dt dtVar, WeakReference<Context> weakReference, boolean z10) {
        String strXp;
        String strJpo;
        dt dtVar2;
        if (dtVar == null) {
            return;
        }
        jpo(this.wqx, sq.jpo());
        jpo(false, this.f20183rq);
        va.jpo(this.f20189yd, 0);
        va.jpo((View) this.f20180ju, 0);
        va.jpo(this.f114if, 0);
        if (this.f20180ju != null && (dtVar2 = this.f20181nq) != null && dtVar2.ww() != null && this.f20181nq.ww().yd() != null) {
            com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20181nq.ww().yd(), this.f20181nq.ww().wqx(), this.f20181nq.ww().jd(), this.f20180ju, this.f20181nq);
        }
        if (!TextUtils.isEmpty(dtVar.as())) {
            strXp = dtVar.as();
        } else if (!TextUtils.isEmpty(dtVar.ozw())) {
            strXp = dtVar.ozw();
        } else if (!TextUtils.isEmpty(dtVar.xp())) {
            strXp = dtVar.xp();
        } else {
            strXp = "";
        }
        dt dtVar3 = this.f20181nq;
        if (dtVar3 != null && dtVar3.ou() != null && this.f20181nq.ou().jpo() != null) {
            va.jpo((View) this.f20171au, 0);
            va.jpo((View) this.oya, 4);
            if (this.f20171au != null) {
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(this.f20181nq.ou(), this.f20171au, dtVar);
                this.f20171au.setOnClickListener(this.kln);
                this.f20171au.setOnTouchListener(this.kln);
            }
        } else if (!TextUtils.isEmpty(strXp)) {
            va.jpo((View) this.f20171au, 4);
            va.jpo((View) this.oya, 0);
            TextView textView = this.oya;
            if (textView != null) {
                textView.setText(strXp.substring(0, 1));
                this.oya.setOnClickListener(this.kln);
                this.oya.setOnTouchListener(this.kln);
            }
        }
        if (this.prr != null && !TextUtils.isEmpty(strXp)) {
            this.prr.setText(strXp);
        }
        va.jpo((View) this.prr, 0);
        va.jpo((View) this.hna, 0);
        int iPzk = dtVar.pzk();
        if (iPzk == 4) {
            strJpo = com.bytedance.sdk.component.utils.dt.jpo(this.f20185se, "tt_video_download_apk");
        } else if (iPzk != 5) {
            strJpo = com.bytedance.sdk.component.utils.dt.jpo(this.f20185se, "tt_video_mobile_go_detail");
        } else {
            strJpo = com.bytedance.sdk.component.utils.dt.jpo(this.f20185se, "tt_video_dial_phone");
        }
        TextView textView2 = this.hna;
        if (textView2 != null) {
            textView2.setText(strJpo);
            this.hna.setOnClickListener(this.kln);
            this.hna.setOnTouchListener(this.kln);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public boolean jd(int i10) {
        SeekBar seekBar = this.f20147ya;
        return seekBar != null && i10 > seekBar.getSecondaryProgress();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(ViewGroup viewGroup) {
        if (viewGroup != null && (this.wqx.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            this.cgn = true;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.wqx.getLayoutParams();
            this.f20137et = marginLayoutParams.leftMargin;
            this.rxq = marginLayoutParams.topMargin;
            this.f20139ii = marginLayoutParams.width;
            this.cql = marginLayoutParams.height;
            marginLayoutParams.width = -1;
            marginLayoutParams.height = -1;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.leftMargin = 0;
            this.wqx.setLayoutParams(marginLayoutParams);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams instanceof RelativeLayout.LayoutParams) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                int[] rules = layoutParams2.getRules();
                this.ota = rules.length > 0 ? rules[3] : 0;
                layoutParams2.addRule(3, 0);
                viewGroup.setLayoutParams(layoutParams2);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
                this.wad.set(marginLayoutParams2.leftMargin, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin, marginLayoutParams2.bottomMargin);
                va.jpo(viewGroup, 0, 0, 0, 0);
            }
            jd(true);
            this.sbx.setImageDrawable(com.bytedance.sdk.component.utils.dt.wqx(this.f20185se, "tt_shrink_video"));
            this.f20147ya.setThumb(ju.jpo(this.f20185se, "tt_seek_thumb_fullscreen_selector"));
            this.f20147ya.setThumbOffset(0);
            com.bykv.vk.openvk.jpo.jpo.jd.cm.jpo.jpo((View) this.wqx, false);
            my(this.cgn);
            va.jpo(this.tic, 8);
            if (!this.f20183rq) {
                va.jpo((View) this.f20135dm, 8);
                va.jpo((View) this.duq, 8);
            } else if ((this.hmu & 1) == 1) {
                va.jpo((View) this.f20135dm, 8);
            }
        }
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my, com.bytedance.sdk.component.utils.hx.jpo
    public void jpo(Message message) {
        if (message.what != 1) {
            return;
        }
        ju();
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(boolean z10, boolean z11, boolean z12) {
        va.jpo(this.huv, 0);
        if (this.cgn) {
            va.jpo(this.tic, 0);
            va.jpo((View) this.vrc, 0);
        } else if (z12) {
            va.jpo(this.tic, 8);
        }
        va.jpo((View) this.my, (!z10 || this.f20178jj.getVisibility() == 0) ? 8 : 0);
        if (!this.f20183rq && !this.cgn) {
            if ((this.hmu & 1) != 1 && !z12) {
                va.jpo((View) this.f20135dm, 0);
            }
            va.jpo((View) this.duq, z12 ? 8 : 0);
        }
        va.jpo((View) this.wcn, 0);
        va.jpo((View) this.f20136dn, 0);
        va.jpo((View) this.f20147ya, 0);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my
    public void jpo(boolean z10, boolean z11) {
        va.jpo(this.huv, 8);
        va.jpo(this.tic, 8);
        va.jpo((View) this.my, 8);
        if (!this.f20183rq && !this.cgn) {
            va.jpo((View) this.f20135dm, 8);
            if ((this.hmu & 2) != 2) {
                va.jpo((View) this.duq, 8);
            }
        } else if ((this.hmu & 1) == 1) {
            va.jpo((View) this.f20135dm, 8);
        }
        if (z11) {
            va.jpo((View) this.f20135dm, 8);
            va.jpo((View) this.duq, 8);
        }
        wqx(false);
    }

    @Override // com.bytedance.sdk.openadsdk.core.au.jd.my, com.bytedance.sdk.openadsdk.core.widget.jr.jpo
    public void jpo(View view, boolean z10) {
        if (yd()) {
            String str = new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date());
            dt dtVar = this.f20181nq;
            if (dtVar != null && !TextUtils.isEmpty(dtVar.ozw())) {
                jpo(this.f20181nq.ozw());
            }
            this.roc.setText(str);
        } else {
            jpo("");
            this.roc.setText("");
        }
        if (this.f20184rv) {
            return;
        }
        wqx(this.f20183rq && !this.cgn);
        if (hna()) {
            this.pdm.jpo(this, view, true, this.f20178jj.getVisibility() != 0);
        }
    }
}
