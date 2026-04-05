package com.bytedance.sdk.openadsdk.component.reward.view;

import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.ugeno.zz.cm.a;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.model.rv;
import com.bytedance.sdk.openadsdk.core.widget.hna;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import java.lang.ref.WeakReference;
import java.util.Locale;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class my extends com.bytedance.sdk.openadsdk.core.jj.my {

    /* renamed from: cm, reason: collision with root package name */
    private sq f20039cm;

    /* renamed from: jd, reason: collision with root package name */
    private TextView f20040jd;

    /* renamed from: jj, reason: collision with root package name */
    private TextView f20041jj;
    private hna jpo;
    private TextView my;

    /* renamed from: qk, reason: collision with root package name */
    private boolean f20042qk;
    private TextView wqx;
    private com.bytedance.sdk.openadsdk.component.reward.jpo.jpo xyk;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class jpo implements com.bytedance.sdk.component.my.hna {

        /* renamed from: cm, reason: collision with root package name */
        private final WeakReference<ImageView> f20044cm;

        /* renamed from: jd, reason: collision with root package name */
        private final String f20045jd;
        private final dt jpo;
        private final String wqx;

        public jpo(ImageView imageView, dt dtVar, String str, String str2) {
            this.f20044cm = new WeakReference<>(imageView);
            this.jpo = dtVar;
            this.f20045jd = str;
            this.wqx = str2;
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(com.bytedance.sdk.component.my.ju juVar) {
            Object objJd = juVar.jd();
            if (objJd != null) {
                ImageView imageView = this.f20044cm.get();
                if (objJd instanceof Bitmap) {
                    if (imageView != null) {
                        imageView.setImageBitmap((Bitmap) objJd);
                    }
                } else if (objJd instanceof Drawable) {
                    if (Build.VERSION.SDK_INT >= 28 && a.d(objJd)) {
                        a.b(objJd).start();
                    }
                    if (imageView != null) {
                        imageView.setImageDrawable((Drawable) objJd);
                    }
                }
                com.bytedance.sdk.openadsdk.cm.wqx.jd(this.jpo, this.wqx, "load_vast_icon_success", (JSONObject) null);
            }
        }

        @Override // com.bytedance.sdk.component.my.hna
        public void jpo(int i10, String str, Throwable th2) {
            jpo(i10, str, this.f20045jd);
        }

        private void jpo(final int i10, final String str, final String str2) {
            com.bytedance.sdk.openadsdk.cm.wqx.jpo(new com.bytedance.sdk.component.xyk.xyk("load_vast_icon_fail") { // from class: com.bytedance.sdk.openadsdk.component.reward.view.my.jpo.1
                @Override // java.lang.Runnable
                public void run() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("error_code", i10);
                        jSONObject.put("description", i10 + ":" + str);
                        jSONObject.put("url", str2);
                    } catch (Throwable unused) {
                    }
                    com.bytedance.sdk.openadsdk.cm.wqx.jd(jpo.this.jpo, jpo.this.wqx, "load_vast_icon_fail", jSONObject);
                }
            });
        }
    }

    public my(Context context) {
        super(context);
        setOrientation(1);
        setVisibility(8);
        setBackgroundColor(-1);
    }

    private void cm() {
        this.f20042qk = true;
        dt dtVar = this.xyk.f19914jd;
        int iJkt = dtVar.jkt();
        if ((iJkt == 43 || iJkt == 44) && rv.jd(dtVar)) {
            wqx();
        } else if (this.xyk.sbx == 1) {
            jj();
        } else {
            my();
        }
        if (this.f20040jd == null) {
            this.f20040jd = (TextView) this.xyk.f19930va.findViewById(520093705);
        }
        TextView textView = this.f20040jd;
        if (textView != null) {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.my.1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    int width = ((ViewGroup) my.this.f20040jd.getParent()).getWidth();
                    if (width > 0) {
                        my.this.f20040jd.setMaxWidth((int) (width * 0.45f));
                    }
                }
            });
            if (!dtVar.ig()) {
                this.f20040jd.setText(dtVar.wu() == 3 ? getButtonTextForNewStyleBar() : dtVar.clt());
            } else if (dtVar.zuz() != null && TextUtils.isEmpty(dtVar.zuz().jj())) {
                va.jpo((View) this.f20040jd, 8);
            }
        }
        if (this.f20039cm != null && dtVar.ou() != null && !TextUtils.isEmpty(dtVar.ou().jpo())) {
            String strJpo = dtVar.ou().jpo();
            if (dtVar.ig()) {
                com.bytedance.sdk.openadsdk.zz.cm.jpo(dtVar.ou()).wqx(1).jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, dtVar.ou().jpo(), new jpo(this.f20039cm, dtVar, strJpo, this.xyk.my)));
                if (dtVar.zuz() != null && dtVar.zuz().jd() != null) {
                    dtVar.zuz().jd().jd(0L);
                }
            } else {
                com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(dtVar.ou(), this.f20039cm, dtVar);
            }
        }
        TextView textView2 = this.my;
        if (textView2 != null) {
            textView2.setText(dtVar.ozw());
        }
        TextView textView3 = this.f20041jj;
        if (textView3 != null) {
            textView3.setText(jpo(dtVar));
        }
        if (this.wqx != null) {
            String strTu = rv.tu(this.xyk.f19914jd);
            if (TextUtils.isEmpty(strTu)) {
                strTu = "Play now";
            }
            this.wqx.setText(strTu);
            this.wqx.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.my.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (my.this.xyk != null) {
                        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo(my.this.xyk);
                    }
                }
            });
        }
        hna hnaVar = this.jpo;
        if (hnaVar != null) {
            va.jpo((TextView) null, hnaVar, dtVar);
        }
        if (this.xyk.sbx == 2 && dtVar.wu() == 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20040jd.getLayoutParams();
            layoutParams.height = va.jd(this.xyk.f19920pe, 55.0f);
            layoutParams.topMargin = va.jd(this.xyk.f19920pe, 20.0f);
            this.f20040jd.setLayoutParams(layoutParams);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) getLayoutParams();
            layoutParams2.bottomMargin = va.jd(this.xyk.f19920pe, 12.0f);
            setLayoutParams(layoutParams2);
        }
        jd();
    }

    private String getCnOrEnBtnText() {
        return this.xyk.f19914jd.pzk() != 4 ? "View" : "Install";
    }

    private void jj() {
        Context context = getContext();
        setPadding(va.jd(context, 16.0f), va.jd(context, 16.0f), va.jd(context, 16.0f), va.jd(context, 24.0f));
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setOrientation(0);
        myVar.setGravity(16);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = va.jd(context, 12.0f);
        addView(myVar, layoutParams);
        sq sqVar = new sq(context);
        this.f20039cm = sqVar;
        sqVar.setBackgroundColor(0);
        this.f20039cm.setId(com.bytedance.sdk.openadsdk.utils.hna.f21530jd);
        myVar.addView(this.f20039cm, new LinearLayout.LayoutParams(va.jd(context, 48.0f), va.jd(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = va.jd(context, 12.0f);
        myVar.addView(myVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.my = xykVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar.setEllipsize(truncateAt);
        this.my.setGravity(16);
        this.my.setSingleLine(true);
        this.my.setTextSize(2, 17.0f);
        this.my.setId(com.bytedance.sdk.openadsdk.utils.hna.wqx);
        this.my.setTextColor(-16777216);
        myVar2.addView(this.my, new LinearLayout.LayoutParams(-1, -2));
        hna hnaVar = new hna(context);
        this.jpo = hnaVar;
        hnaVar.setId(com.bytedance.sdk.openadsdk.utils.hna.my);
        myVar2.addView(this.jpo, new LinearLayout.LayoutParams(-2, va.jd(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20040jd = xykVar2;
        xykVar2.setGravity(17);
        this.f20040jd.setEllipsize(truncateAt);
        this.f20040jd.setSingleLine(true);
        this.f20040jd.setTextColor(-1);
        this.f20040jd.setTextSize(2, 16.0f);
        this.f20040jd.setId(520093705);
        this.f20040jd.setBackground(jpo(context));
        this.f20040jd.setText(this.xyk.f19914jd.clt());
        addView(this.f20040jd, new LinearLayout.LayoutParams(-1, va.jd(context, 36.0f)));
    }

    private void my() {
        setOrientation(0);
        setGravity(16);
        Context context = getContext();
        setPadding(va.jd(context, 16.0f), va.jd(context, 12.0f), va.jd(context, 16.0f), va.jd(context, 12.0f));
        sq sqVar = new sq(context);
        this.f20039cm = sqVar;
        sqVar.setBackgroundColor(0);
        this.f20039cm.setId(com.bytedance.sdk.openadsdk.utils.hna.f21530jd);
        addView(this.f20039cm, new LinearLayout.LayoutParams(va.jd(context, 48.0f), va.jd(context, 48.0f)));
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.leftMargin = va.jd(context, 12.0f);
        layoutParams.weight = 1.0f;
        addView(myVar, layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.my = xykVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar.setEllipsize(truncateAt);
        this.my.setGravity(16);
        this.my.setSingleLine(true);
        this.my.setTextSize(2, 17.0f);
        this.my.setId(com.bytedance.sdk.openadsdk.utils.hna.wqx);
        this.my.setTextColor(-16777216);
        myVar.addView(this.my, new LinearLayout.LayoutParams(-1, -2));
        hna hnaVar = new hna(context);
        this.jpo = hnaVar;
        hnaVar.setId(com.bytedance.sdk.openadsdk.utils.hna.my);
        myVar.addView(this.jpo, new LinearLayout.LayoutParams(-2, va.jd(context, 14.0f)));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20040jd = xykVar2;
        xykVar2.setGravity(17);
        this.f20040jd.setEllipsize(truncateAt);
        this.f20040jd.setSingleLine(true);
        this.f20040jd.setTextColor(-1);
        this.f20040jd.setTextSize(2, 16.0f);
        this.f20040jd.setId(520093705);
        this.f20040jd.setBackground(jpo(context));
        this.f20040jd.setText(this.xyk.f19914jd.clt());
        addView(this.f20040jd, new LinearLayout.LayoutParams(va.jd(context, 164.0f), va.jd(context, 36.0f)));
    }

    public String getButtonTextForNewStyleBar() {
        boolean zEquals;
        String strClt;
        String strWqx = tic.wqx(this.xyk.f19920pe);
        if (strWqx == null) {
            strWqx = "";
        }
        try {
            zEquals = strWqx.equals(Locale.ENGLISH.getLanguage());
        } catch (Throwable unused) {
            zEquals = false;
        }
        if (TextUtils.isEmpty(this.xyk.f19914jd.clt())) {
            strClt = this.xyk.f19914jd.pzk() != 4 ? "View" : "Install";
        } else {
            strClt = this.xyk.f19914jd.clt();
            if (strClt == null || !tic.jj(strClt) || strClt.length() <= 2) {
                if (strClt != null && !tic.jj(strClt) && strClt.length() > 7 && zEquals) {
                    strClt = getCnOrEnBtnText();
                }
            } else if (zEquals) {
                strClt = getCnOrEnBtnText();
            }
        }
        if (zEquals && !tic.jj(strClt)) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f20040jd.getLayoutParams();
            layoutParams.bottomMargin = va.jd(this.xyk.f19920pe, 4.0f);
            this.f20040jd.setLayoutParams(layoutParams);
        }
        return strClt;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0 || this.f20042qk) {
            return;
        }
        cm();
    }

    public void wqx() {
        Context context = getContext();
        int iJd = va.jd(context, 12.0f);
        setPadding(iJd, iJd, iJd, iJd);
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        myVar.setOrientation(0);
        myVar.setGravity(16);
        addView(myVar, layoutParams);
        sq sqVar = new sq(context);
        this.f20039cm = sqVar;
        sqVar.setBackgroundColor(0);
        this.f20039cm.setId(com.bytedance.sdk.openadsdk.utils.hna.f21530jd);
        myVar.addView(this.f20039cm, new LinearLayout.LayoutParams(va.jd(context, 54.0f), va.jd(context, 54.0f)));
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar2.setOrientation(1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = va.jd(context, 12.0f);
        myVar.addView(myVar2, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.my = xykVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar.setEllipsize(truncateAt);
        this.my.setGravity(16);
        this.my.setSingleLine(true);
        this.my.setTextSize(2, 17.0f);
        this.my.setId(com.bytedance.sdk.openadsdk.utils.hna.wqx);
        this.my.setTextColor(-16777216);
        myVar2.addView(this.my, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20041jj = xykVar2;
        xykVar2.setTextColor(-16777216);
        this.f20041jj.setTextSize(2, 13.0f);
        this.f20041jj.setMaxLines(2);
        this.f20041jj.setAlpha(0.8f);
        this.f20041jj.setEllipsize(truncateAt);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = va.jd(context, 4.0f);
        myVar2.addView(this.f20041jj, layoutParams3);
        com.bytedance.sdk.openadsdk.core.jj.my myVar3 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = va.jd(context, 12.0f);
        myVar3.setOrientation(0);
        addView(myVar3, layoutParams4);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.wqx = xykVar3;
        xykVar3.setGravity(17);
        this.wqx.setEllipsize(truncateAt);
        this.wqx.setSingleLine(true);
        this.wqx.setTextColor(-16777216);
        this.wqx.setTextSize(2, 16.0f);
        this.wqx.setBackground(jd(context));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, va.jd(context, 36.0f), 1.0f);
        layoutParams5.rightMargin = va.jd(context, 3.0f);
        myVar3.addView(this.wqx, layoutParams5);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar4 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20040jd = xykVar4;
        xykVar4.setGravity(17);
        this.f20040jd.setEllipsize(truncateAt);
        this.f20040jd.setSingleLine(true);
        this.f20040jd.setTextColor(-1);
        this.f20040jd.setTextSize(2, 16.0f);
        this.f20040jd.setId(520093705);
        this.f20040jd.setBackground(wqx(context));
        this.f20040jd.setText(this.xyk.f19914jd.clt());
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, va.jd(context, 36.0f), 1.0f);
        layoutParams6.leftMargin = va.jd(context, 3.0f);
        myVar3.addView(this.f20040jd, layoutParams6);
    }

    private String jpo(dt dtVar) {
        return !TextUtils.isEmpty(dtVar.ozw()) ? dtVar.ozw() : !TextUtils.isEmpty(dtVar.xp()) ? dtVar.xp() : "";
    }

    public void jd() {
        com.bytedance.sdk.openadsdk.core.wqx.my myVarMy = this.xyk.f19923rv.my();
        final com.bytedance.sdk.openadsdk.core.wqx.jd jdVarCm = this.xyk.f19923rv.cm();
        final dt dtVar = this.xyk.f19914jd;
        if (dtVar.sg() == null) {
            return;
        }
        if (dtVar.wu() != 5 && this.f20040jd != null) {
            if (dtVar.sg().my) {
                this.f20040jd.setOnClickListener(myVarMy);
                this.f20040jd.setOnTouchListener(myVarMy);
            } else {
                this.f20040jd.setOnClickListener(jdVarCm);
            }
        }
        if (dtVar.wu() == 1) {
            if (!dtVar.sg().jpo) {
                va.jpo((View) this, (View.OnClickListener) jdVarCm, "TTBaseVideoActivity#mRlDownloadBar");
                this.my.setOnClickListener(jdVarCm);
                this.jpo.setOnClickListener(jdVarCm);
                this.f20039cm.setOnClickListener(jdVarCm);
                return;
            }
            va.jpo((View) this, (View.OnClickListener) myVarMy, "TTBaseVideoActivity#mRlDownloadBar");
            va.jpo((View) this, (View.OnTouchListener) myVarMy, "TTBaseVideoActivity#mRlDownloadBar");
            this.my.setOnClickListener(myVarMy);
            this.my.setOnTouchListener(myVarMy);
            this.jpo.setOnClickListener(myVarMy);
            this.jpo.setOnTouchListener(myVarMy);
            this.f20039cm.setOnClickListener(myVarMy);
            this.f20039cm.setOnTouchListener(myVarMy);
            return;
        }
        if (dtVar.wu() != 5) {
            if (!dtVar.sg().wqx) {
                va.jpo((View) this, (View.OnClickListener) jdVarCm, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            } else {
                va.jpo((View) this, (View.OnClickListener) myVarMy, "TTBaseVideoActivity#mRlDownloadBar");
                va.jpo((View) this, (View.OnTouchListener) myVarMy, "TTBaseVideoActivity#mRlDownloadBar");
                return;
            }
        }
        String str = "VAST_ICON";
        if (!dtVar.sg().my) {
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.my.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    View.OnClickListener onClickListener2 = jdVarCm;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(view);
                    }
                    if (view == null || !"VAST_ICON".equals(view.getTag(570425345))) {
                        if (dtVar.zuz() != null) {
                            dtVar.zuz().jpo().qk(my.this.xyk.hmu.m442if());
                        }
                    } else {
                        if (dtVar.zuz() == null || dtVar.zuz().jd() == null) {
                            return;
                        }
                        dtVar.zuz().jd().jpo(my.this.xyk.hmu.m442if());
                    }
                }
            };
            TextView textView = this.f20040jd;
            if (textView != null) {
                textView.setOnClickListener(onClickListener);
            }
            TextView textView2 = this.my;
            if (textView2 != null && !TextUtils.isEmpty(textView2.getText())) {
                this.my.setOnClickListener(onClickListener);
            }
            sq sqVar = this.f20039cm;
            if (sqVar != null) {
                sqVar.setTag(570425345, "VAST_ICON");
                this.f20039cm.setOnClickListener(jdVarCm);
                return;
            }
            return;
        }
        com.bytedance.sdk.openadsdk.core.wqx.qk qkVar = new com.bytedance.sdk.openadsdk.core.wqx.qk("VAST_ACTION_BUTTON", dtVar.zuz(), myVarMy) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.my.3
        };
        com.bytedance.sdk.openadsdk.core.wqx.qk qkVar2 = new com.bytedance.sdk.openadsdk.core.wqx.qk(str, dtVar.zuz(), myVarMy) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.my.4
        };
        TextView textView3 = this.f20040jd;
        if (textView3 != null) {
            textView3.setOnClickListener(qkVar);
            this.f20040jd.setOnTouchListener(qkVar);
        }
        sq sqVar2 = this.f20039cm;
        if (sqVar2 != null) {
            sqVar2.setOnClickListener(qkVar2);
            this.f20039cm.setOnTouchListener(qkVar2);
        }
        TextView textView4 = this.my;
        if (textView4 == null || TextUtils.isEmpty(textView4.getText())) {
            return;
        }
        this.my.setOnClickListener(qkVar);
        this.my.setOnTouchListener(qkVar);
    }

    public void jpo() {
        Keyframe keyframeOfFloat = Keyframe.ofFloat(0.0f, 0.0f);
        Keyframe keyframeOfFloat2 = Keyframe.ofFloat(0.65f, 1.0f);
        Keyframe keyframeOfFloat3 = Keyframe.ofFloat(0.765f, 0.9f);
        Keyframe keyframeOfFloat4 = Keyframe.ofFloat(0.88f, 1.0f);
        Keyframe keyframeOfFloat5 = Keyframe.ofFloat(0.95f, 0.95f);
        Keyframe keyframeOfFloat6 = Keyframe.ofFloat(1.0f, 1.0f);
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofKeyframe("scaleX", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6), PropertyValuesHolder.ofKeyframe("scaleY", keyframeOfFloat, keyframeOfFloat2, keyframeOfFloat3, keyframeOfFloat4, keyframeOfFloat5, keyframeOfFloat6));
        objectAnimatorOfPropertyValuesHolder.setDuration(1000L);
        objectAnimatorOfPropertyValuesHolder.start();
    }

    public void jpo(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.xyk = jpoVar;
        if (jpoVar.f19914jd.wu() == 1) {
            cm();
        }
    }

    private static Drawable jpo(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#1A73E8"));
        gradientDrawable.setCornerRadius(va.jd(context, 18.0f));
        return gradientDrawable;
    }

    private static Drawable jd(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#000000"));
        gradientDrawable.setAlpha(30);
        gradientDrawable.setCornerRadius(va.jd(context, 8.0f));
        return gradientDrawable;
    }

    private static Drawable wqx(Context context) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor("#FE2C55"));
        gradientDrawable.setCornerRadius(va.jd(context, 8.0f));
        return gradientDrawable;
    }
}
