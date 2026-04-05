package com.bytedance.sdk.openadsdk.component.zz;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b0.e2;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.hna;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.ju;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends wqx {

    /* renamed from: au, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.jj.wqx f20101au;
    private final com.bytedance.sdk.openadsdk.core.jj.cm hna;
    private final hna oya;
    private final com.bytedance.sdk.openadsdk.core.jj.xyk prr;

    /* renamed from: sq, reason: collision with root package name */
    private final com.bytedance.sdk.openadsdk.core.jj.my f20102sq;

    public cm(Context context, dt dtVar) {
        super(context);
        setId(520093753);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        setBackgroundColor(0);
        int iJd = va.jd(context, 8.0f);
        int iJd2 = va.jd(context, 9.0f);
        int iJd3 = va.jd(context, 10.0f);
        int iJd4 = va.jd(context, 40.0f);
        com.bytedance.sdk.openadsdk.core.widget.wqx wqxVar = new com.bytedance.sdk.openadsdk.core.widget.wqx(context);
        this.f112if = wqxVar;
        wqxVar.setPadding(iJd2, 0, iJd2, 0);
        this.f112if.setScaleType(ImageView.ScaleType.FIT_CENTER);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(va.jd(context, 32.0f), va.jd(context, 14.0f));
        layoutParams.addRule(12);
        layoutParams.addRule(11);
        layoutParams.setMargins(0, 0, iJd3, iJd3);
        this.f112if.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar2 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        this.f20101au = wqxVar2;
        wqxVar2.setBackgroundColor(-1);
        wqxVar2.setId(520093758);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, va.jd(context, 107.0f));
        layoutParams2.addRule(12);
        wqxVar2.setLayoutParams(layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setOrientation(0);
        myVar.setGravity(16);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 17;
        myVar.setLayoutParams(layoutParams3);
        wqxVar2.addView(myVar);
        sq sqVar = new sq(context);
        this.f20118jj = sqVar;
        sqVar.setId(520093759);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(iJd4, iJd4);
        layoutParams4.rightMargin = iJd;
        layoutParams4.setMarginEnd(iJd);
        this.f20118jj.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.f20120qk = xykVar;
        xykVar.setId(520093761);
        this.f20120qk.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = this.f20120qk;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar2.setEllipsize(truncateAt);
        this.f20120qk.setMaxLines(2);
        this.f20120qk.setTextColor(Color.parseColor("#161823"));
        this.f20120qk.setTextSize(30.0f);
        myVar.addView(this.f20118jj);
        myVar.addView(this.f20120qk);
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar3 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams5.addRule(2, wqxVar2.getId());
        layoutParams5.addRule(10);
        wqxVar3.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        this.jpo = cmVar;
        cmVar.setId(520093754);
        this.jpo.setScaleType(ImageView.ScaleType.CENTER_CROP);
        wqxVar3.addView(this.jpo, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.wqx wqxVar4 = new com.bytedance.sdk.openadsdk.core.jj.wqx(context);
        this.f20117jd = wqxVar4;
        wqxVar4.setId(520093755);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams6.gravity = 17;
        wqxVar3.addView(this.f20117jd, layoutParams6);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar2 = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        this.wqx = cmVar2;
        cmVar2.setId(520093756);
        wqxVar3.addView(this.wqx, new FrameLayout.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.my = xykVar3;
        xykVar3.setId(520093717);
        this.my.setBackground(ju.jpo(context, Color.parseColor("#b3000000"), 24));
        this.my.setEllipsize(truncateAt);
        this.my.setGravity(17);
        this.my.setSingleLine(true);
        this.my.setText(com.bytedance.sdk.component.utils.dt.jpo(context, "tt_video_download_apk"));
        this.my.setTextColor(-1);
        this.my.setTextSize(1, 16.0f);
        this.my.setTag("open_ad_click_button_tag");
        FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(va.jd(context, 236.0f), va.jd(context, 48.0f));
        layoutParams7.gravity = 81;
        layoutParams7.bottomMargin = va.jd(context, 32.0f);
        wqxVar3.addView(this.my, layoutParams7);
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        this.f20102sq = myVar2;
        myVar2.setOrientation(0);
        myVar2.setGravity(16);
        myVar2.setBackground(new jpo(context));
        myVar2.setPadding(va.jd(context, 16.0f), va.jd(context, 8.0f), va.jd(context, 16.0f), va.jd(context, 8.0f));
        RelativeLayout.LayoutParams layoutParamsE = e2.e(-2, -2, 10);
        layoutParamsE.topMargin = va.jd(context, 90.0f);
        myVar2.setLayoutParams(layoutParamsE);
        sq sqVar2 = new sq(context);
        this.hna = sqVar2;
        myVar2.addView(sqVar2, new LinearLayout.LayoutParams(va.jd(context, 36.0f), va.jd(context, 36.0f)));
        com.bytedance.sdk.openadsdk.core.jj.my myVar3 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar3.setOrientation(1);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams8.leftMargin = va.jd(context, 8.0f);
        myVar2.addView(myVar3, layoutParams8);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar4 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.prr = xykVar4;
        xykVar4.setTextColor(-1);
        myVar3.addView(xykVar4, new LinearLayout.LayoutParams(-2, -2));
        hna hnaVar = new hna(context, true);
        this.oya = hnaVar;
        myVar3.addView(hnaVar, new LinearLayout.LayoutParams(-2, -2));
        PAGLogoView pAGLogoViewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(context, dtVar);
        this.f20116cm = pAGLogoViewCreatePAGLogoViewByMaterial;
        pAGLogoViewCreatePAGLogoViewByMaterial.setId(520093757);
        FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-2, va.jd(context, 14.0f));
        layoutParams9.gravity = 83;
        wqxVar3.addView(this.f20116cm, layoutParams9);
        addView(wqxVar3);
        addView(this.f112if);
        addView(wqxVar2);
        addView(this.xyk);
        addView(myVar2);
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public com.bytedance.sdk.openadsdk.core.jj.cm getAdIconView() {
        return this.hna;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public com.bytedance.sdk.openadsdk.core.jj.xyk getAdTitleTextView() {
        return this.prr;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public com.bytedance.sdk.openadsdk.core.jj.my getOverlayLayout() {
        return this.f20102sq;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public hna getScoreBar() {
        return this.oya;
    }

    @Override // com.bytedance.sdk.openadsdk.component.zz.wqx
    public View getUserInfo() {
        return this.f20101au;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo extends Drawable {

        /* renamed from: cm, reason: collision with root package name */
        private final boolean f20104cm;
        private static final int my = Color.parseColor("#b0000000");

        /* renamed from: jj, reason: collision with root package name */
        private static final int f20103jj = Color.parseColor("#40000000");
        private final RectF jpo = new RectF();

        /* renamed from: jd, reason: collision with root package name */
        private final Paint f20105jd = new Paint();
        private final Path wqx = new Path();

        public jpo(Context context) {
            this.f20104cm = com.bytedance.sdk.component.adexpress.cm.jd.jpo(context);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.drawPath(this.wqx, this.f20105jd);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void onBoundsChange(Rect rect) {
            float[] fArr;
            super.onBoundsChange(rect);
            this.jpo.set(rect);
            this.wqx.reset();
            int iHeight = rect.height() / 2;
            Path path = this.wqx;
            RectF rectF = this.jpo;
            if (this.f20104cm) {
                float f10 = iHeight;
                fArr = new float[]{f10, f10, 0.0f, 0.0f, 0.0f, 0.0f, f10, f10};
            } else {
                float f11 = iHeight;
                fArr = new float[]{0.0f, 0.0f, f11, f11, f11, f11, 0.0f, 0.0f};
            }
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            float f12 = rect.right;
            boolean z10 = this.f20104cm;
            this.f20105jd.setShader(new LinearGradient(0.0f, 0.0f, f12, 0.0f, new int[]{z10 ? f20103jj : my, z10 ? my : f20103jj}, (float[]) null, Shader.TileMode.CLAMP));
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
