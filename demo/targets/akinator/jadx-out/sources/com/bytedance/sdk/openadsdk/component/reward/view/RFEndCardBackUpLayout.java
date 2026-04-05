package com.bytedance.sdk.openadsdk.component.reward.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.PAGLogoView;
import com.bytedance.sdk.openadsdk.core.widget.hna;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class RFEndCardBackUpLayout extends com.bytedance.sdk.openadsdk.core.jj.wqx {
    private static final String TAG = "TTAD.RFEndCardBackUpL";
    private com.bytedance.sdk.openadsdk.component.reward.jpo.jpo adContext;
    private PAGLogoView adLogo;
    private sq ivIcon;
    private boolean mInit;
    private hna rbScore;
    private int shownAdCount;
    private com.bytedance.sdk.openadsdk.core.jj.xyk tvDesc;
    private com.bytedance.sdk.openadsdk.core.jj.xyk tvDownload;
    private TextView tvTitle;

    public RFEndCardBackUpLayout(Context context) {
        super(context);
        setVisibility(8);
        setId(com.bytedance.sdk.openadsdk.utils.hna.gmx);
    }

    private void bindDescData(com.bytedance.sdk.openadsdk.core.jj.xyk xykVar, dt dtVar) {
        if (xykVar == null) {
            return;
        }
        String strXp = dtVar.xp();
        if (TextUtils.isEmpty(strXp)) {
            return;
        }
        xykVar.setText(strXp);
    }

    private void bindIconData(com.bytedance.sdk.openadsdk.core.jj.cm cmVar, dt dtVar) {
        if (cmVar == null || dtVar.ou() == null || TextUtils.isEmpty(dtVar.ou().jpo())) {
            return;
        }
        com.bytedance.sdk.openadsdk.opi.jd.jd().jpo(dtVar.ou(), cmVar, dtVar);
    }

    private void bindTitleData(TextView textView, dt dtVar, String str) {
        if (textView != null) {
            if (dtVar.xur() == null || TextUtils.isEmpty(dtVar.xur().jd())) {
                textView.setText(str);
            } else {
                textView.setText(dtVar.xur().jd());
            }
        }
    }

    private void initData(dt dtVar, com.bytedance.sdk.openadsdk.core.jj.xyk xykVar) {
        setDownloadButtonData(xykVar, dtVar, -1);
        bindIconData(this.ivIcon, dtVar);
        hna hnaVar = this.rbScore;
        if (hnaVar != null) {
            va.jpo((TextView) null, hnaVar, dtVar);
            if (dtVar.xur() != null) {
                this.rbScore.setVisibility(0);
            }
        }
        if (this.tvTitle != null) {
            if (dtVar.xur() != null && !TextUtils.isEmpty(dtVar.xur().jd())) {
                this.tvTitle.setText(dtVar.xur().jd());
            } else if (TextUtils.isEmpty(dtVar.as())) {
                this.tvTitle.setVisibility(8);
            } else {
                this.tvTitle.setText(dtVar.as());
            }
        }
        if (this.tvDesc != null) {
            String strOzw = dtVar.ozw();
            if (TextUtils.isEmpty(strOzw)) {
                this.tvDesc.setVisibility(8);
            } else {
                this.tvDesc.setText(strOzw);
            }
        }
        this.adLogo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                try {
                    TTWebsiteActivity.jpo(RFEndCardBackUpLayout.this.adContext.vrc, RFEndCardBackUpLayout.this.adContext.f19914jd, RFEndCardBackUpLayout.this.adContext.my);
                } catch (Throwable unused) {
                }
            }
        });
    }

    private void initOneSlotMultipleAdsLayout() {
        Context context = getContext();
        setBackgroundColor(Color.parseColor("#C2FFFFFF"));
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(va.jd(context, 16.0f), 0, va.jd(context, 16.0f), 0);
        layoutParams.gravity = 17;
        addView(myVar, layoutParams);
        if (this.adContext.sbx == 2) {
            com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
            myVar2.setOrientation(0);
            myVar.addView(myVar2, new FrameLayout.LayoutParams(-1, -2));
            initOneSlotMultipleAdsLayoutLandscape(myVar2, this.shownAdCount);
        } else if (this.shownAdCount == 2) {
            initOneSlotMultipleAdsLayoutForTwoAdVertical(myVar);
        } else {
            initOneSlotMultipleAdsLayoutForThreeAdVertical(myVar);
        }
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.adContext;
        View viewCreatePAGLogoViewByMaterial = PAGLogoView.createPAGLogoViewByMaterial(jpoVar.vrc, jpoVar.f19914jd);
        viewCreatePAGLogoViewByMaterial.setId(520093757);
        myVar.addView(viewCreatePAGLogoViewByMaterial);
        viewCreatePAGLogoViewByMaterial.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.view.RFEndCardBackUpLayout.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                TTWebsiteActivity.jpo(RFEndCardBackUpLayout.this.adContext.vrc, RFEndCardBackUpLayout.this.adContext.f19914jd, RFEndCardBackUpLayout.this.adContext.my);
            }
        });
    }

    private void initOneSlotMultipleAdsLayoutForThreeAdVertical(com.bytedance.sdk.openadsdk.core.jj.my myVar) {
        dt dtVar = this.adContext.f19914jd;
        if (dtVar != null) {
            List<dt> listCm = dtVar.cm().cm();
            for (int i10 = 0; i10 < listCm.size() && i10 < 3; i10++) {
                initSingleCardInThreeCardStyle(myVar, listCm.get(i10), i10);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutForTwoAdVertical(com.bytedance.sdk.openadsdk.core.jj.my myVar) {
        dt dtVar = this.adContext.f19914jd;
        if (dtVar != null) {
            List<dt> listCm = dtVar.cm().cm();
            for (int i10 = 0; i10 < listCm.size() && i10 < 2; i10++) {
                initSingleCardInTwoCardStyle(myVar, listCm.get(i10), i10);
            }
        }
    }

    private void initOneSlotMultipleAdsLayoutLandscape(com.bytedance.sdk.openadsdk.core.jj.my myVar, int i10) {
        dt dtVar = this.adContext.f19914jd;
        if (dtVar != null) {
            List<dt> listCm = dtVar.cm().cm();
            for (int i11 = 0; i11 < listCm.size() && i11 < i10 && i11 < 3; i11++) {
                initSingleCardInTwoCardStyleLandscape(myVar, listCm.get(i11), i11, i10);
            }
        }
    }

    private void initSingleCardInThreeCardStyle(com.bytedance.sdk.openadsdk.core.jj.my myVar, dt dtVar, int i10) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar2.setOrientation(1);
        myVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i10 > 0 ? va.jd(context, 12.0f) : 0, 0, 0);
        myVar2.setBackground(new jpo(context));
        myVar.addView(myVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.my myVar3 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar3.setOrientation(0);
        myVar3.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = va.jd(context, 20.0f);
        layoutParams2.leftMargin = va.jd(context, 17.0f);
        layoutParams2.rightMargin = va.jd(context, 30.0f);
        myVar2.addView(myVar3, layoutParams2);
        sq sqVar = new sq(context);
        myVar3.addView(sqVar, new FrameLayout.LayoutParams(va.jd(context, 70.0f), va.jd(context, 63.0f)));
        bindIconData(sqVar, dtVar);
        com.bytedance.sdk.openadsdk.core.jj.my myVar4 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = va.jd(context, 7.0f);
        myVar3.addView(myVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar.setEllipsize(truncateAt);
        xykVar.setTextSize(18.0f);
        xykVar.setTextColor(Color.parseColor("#161823"));
        xykVar.setGravity(8388611);
        xykVar.setTypeface(null, 1);
        myVar4.addView(xykVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(xykVar, dtVar, dtVar.as());
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar2.setSingleLine(true);
        xykVar2.setEllipsize(truncateAt);
        xykVar2.setTextSize(16.0f);
        xykVar2.setTextColor(Color.parseColor("#80161823"));
        myVar4.addView(xykVar2, new FrameLayout.LayoutParams(-1, -2));
        bindDescData(xykVar2, dtVar);
        com.bytedance.sdk.openadsdk.core.jj.my myVar5 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar5.setOrientation(0);
        myVar5.setGravity(16);
        myVar4.addView(myVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar3.setTextSize(16.0f);
        xykVar3.setTextColor(Color.parseColor("#80161823"));
        myVar5.addView(xykVar3, new ViewGroup.LayoutParams(-2, -2));
        hna hnaVar = new hna(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = va.jd(context, 8.0f);
        myVar5.addView(hnaVar, layoutParams4);
        va.jpo(xykVar3, hnaVar, dtVar, 18);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar4 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar4.setGravity(17);
        xykVar4.setId(520093707);
        xykVar4.setText(com.bytedance.sdk.component.utils.dt.jpo(context, "tt_video_download_apk"));
        xykVar4.setTextColor(-1);
        xykVar4.setTextSize(2, 16.0f);
        xykVar4.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, va.jd(context, 36.0f));
        layoutParams5.setMargins(va.jd(context, 20.0f), va.jd(context, 22.0f), va.jd(context, 20.0f), va.jd(context, 20.0f));
        myVar2.addView(xykVar4, layoutParams5);
        setDownloadButtonData(xykVar4, dtVar, i10);
    }

    private void initSingleCardInTwoCardStyle(com.bytedance.sdk.openadsdk.core.jj.my myVar, dt dtVar, int i10) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar2.setOrientation(1);
        myVar2.setGravity(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, i10 > 0 ? va.jd(context, 12.0f) : 0, 0, 0);
        myVar2.setBackground(new jpo(context));
        myVar.addView(myVar2, layoutParams);
        sq sqVar = new sq(context);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(va.jd(context, 70.0f), va.jd(context, 63.0f));
        layoutParams2.setMargins(0, va.jd(context, 24.0f), 0, va.jd(context, 12.0f));
        myVar2.addView(sqVar, layoutParams2);
        bindIconData(sqVar, dtVar);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar.setEllipsize(truncateAt);
        xykVar.setTextSize(18.0f);
        xykVar.setTextColor(Color.parseColor("#161823"));
        xykVar.setGravity(17);
        xykVar.setTypeface(null, 1);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(va.jd(context, 56.0f), 0, va.jd(context, 56.0f), 0);
        myVar2.addView(xykVar, layoutParams3);
        bindTitleData(xykVar, dtVar, dtVar.as());
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar2.setSingleLine(true);
        xykVar2.setEllipsize(truncateAt);
        xykVar2.setTextSize(16.0f);
        xykVar2.setTextColor(Color.parseColor("#80161823"));
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams4.setMargins(va.jd(context, 56.0f), va.jd(context, 4.0f), va.jd(context, 56.0f), 0);
        myVar2.addView(xykVar2, layoutParams4);
        bindDescData(xykVar2, dtVar);
        com.bytedance.sdk.openadsdk.core.jj.my myVar3 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar3.setOrientation(0);
        myVar3.setGravity(16);
        myVar2.addView(myVar3, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar3.setTextSize(16.0f);
        xykVar3.setTextColor(Color.parseColor("#80161823"));
        myVar3.addView(xykVar3, new ViewGroup.LayoutParams(-2, -2));
        hna hnaVar = new hna(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.leftMargin = va.jd(context, 8.0f);
        myVar3.addView(hnaVar, layoutParams5);
        va.jpo(xykVar3, hnaVar, dtVar, 18);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar4 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar4.setGravity(17);
        xykVar4.setId(520093707);
        xykVar4.setText(com.bytedance.sdk.component.utils.dt.jpo(context, "tt_video_download_apk"));
        xykVar4.setTextColor(-1);
        xykVar4.setTextSize(2, 16.0f);
        xykVar4.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, va.jd(context, 36.0f));
        layoutParams6.setMargins(va.jd(context, 20.0f), va.jd(context, 36.0f), va.jd(context, 20.0f), va.jd(context, 20.0f));
        myVar2.addView(xykVar4, layoutParams6);
        setDownloadButtonData(xykVar4, dtVar, i10);
    }

    private void initSingleCardInTwoCardStyleLandscape(com.bytedance.sdk.openadsdk.core.jj.my myVar, dt dtVar, int i10, int i11) {
        Context context = getContext();
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar2.setOrientation(1);
        myVar2.setGravity(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2);
        layoutParams.weight = 1.0f;
        if (i10 > 0) {
            layoutParams.setMargins(va.jd(context, 12.0f), 0, 0, 0);
        }
        myVar2.setBackground(new jpo(context));
        myVar.addView(myVar2, layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.my myVar3 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar3.setOrientation(0);
        myVar3.setGravity(48);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = va.jd(context, 20.0f);
        layoutParams2.leftMargin = va.jd(context, 17.0f);
        layoutParams2.rightMargin = va.jd(context, 30.0f);
        myVar2.addView(myVar3, layoutParams2);
        sq sqVar = new sq(context);
        myVar3.addView(sqVar, new FrameLayout.LayoutParams(va.jd(context, 44.0f), va.jd(context, 44.0f)));
        bindIconData(sqVar, dtVar);
        com.bytedance.sdk.openadsdk.core.jj.my myVar4 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar4.setOrientation(1);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = va.jd(context, 7.0f);
        myVar3.addView(myVar4, layoutParams3);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar.setEllipsize(truncateAt);
        xykVar.setTextSize(18.0f);
        xykVar.setTextColor(Color.parseColor("#161823"));
        xykVar.setGravity(8388611);
        xykVar.setTypeface(null, 1);
        myVar4.addView(xykVar, new FrameLayout.LayoutParams(-1, -2));
        bindTitleData(xykVar, dtVar, dtVar.as());
        com.bytedance.sdk.openadsdk.core.jj.my myVar5 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar5.setOrientation(0);
        myVar5.setGravity(16);
        myVar4.addView(myVar5, new FrameLayout.LayoutParams(-2, -2));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar2.setTextSize(16.0f);
        xykVar2.setTextColor(Color.parseColor("#80161823"));
        myVar5.addView(xykVar2, new ViewGroup.LayoutParams(-2, -2));
        hna hnaVar = new hna(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = va.jd(context, 8.0f);
        myVar5.addView(hnaVar, layoutParams4);
        va.jpo(xykVar2, hnaVar, dtVar, 18);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        if (i11 == 2) {
            xykVar3.setSingleLine(true);
        } else {
            xykVar3.setLines(2);
        }
        xykVar3.setEllipsize(truncateAt);
        xykVar3.setTextSize(16.0f);
        xykVar3.setTextColor(Color.parseColor("#80161823"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        int i12 = layoutParams2.leftMargin;
        layoutParams5.rightMargin = i12;
        layoutParams5.leftMargin = i12;
        layoutParams5.topMargin = va.jd(context, 12.0f);
        myVar2.addView(xykVar3, layoutParams5);
        bindDescData(xykVar3, dtVar);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar4 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        xykVar4.setGravity(17);
        xykVar4.setId(520093707);
        xykVar4.setText(com.bytedance.sdk.component.utils.dt.jpo(context, "tt_video_download_apk"));
        xykVar4.setTextColor(-1);
        xykVar4.setTextSize(2, 16.0f);
        xykVar4.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_reward_full_video_backup_btn_bg"));
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, va.jd(context, 36.0f));
        layoutParams6.setMargins(va.jd(context, 20.0f), va.jd(context, 22.0f), va.jd(context, 20.0f), va.jd(context, 20.0f));
        myVar2.addView(xykVar4, layoutParams6);
        setDownloadButtonData(xykVar4, dtVar, i10);
    }

    private void initViews() {
        com.bytedance.sdk.openadsdk.activity.xyk xykVar;
        if (this.mInit) {
            return;
        }
        this.mInit = true;
        if (this.adContext.f19914jd.va() && (xykVar = this.adContext.ux) != null && xykVar.vrc() && this.shownAdCount > 1) {
            initOneSlotMultipleAdsLayout();
            return;
        }
        dt dtVar = this.adContext.f19914jd;
        if (dtVar.ig()) {
            initViewsForVast();
        } else {
            initViewsDefault();
            initData(dtVar, this.tvDownload);
        }
    }

    private void initViewsDefault() {
        Context context = getContext();
        boolean z10 = this.adContext.f19914jd.ll() == 1;
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setGravity(1);
        myVar.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = z10 ? new FrameLayout.LayoutParams(-1, -2) : new FrameLayout.LayoutParams(va.jd(context, 327.0f), -2);
        layoutParams.gravity = 17;
        int iJd = va.jd(context, 24.0f);
        layoutParams.rightMargin = iJd;
        layoutParams.leftMargin = iJd;
        addView(myVar, layoutParams);
        sq sqVar = new sq(context);
        this.ivIcon = sqVar;
        sqVar.setBackgroundColor(0);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(va.jd(context, 80.0f), va.jd(context, 80.0f));
        layoutParams2.bottomMargin = va.jd(context, 12.0f);
        myVar.addView(this.ivIcon, layoutParams2);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.tvTitle = xykVar;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        xykVar.setEllipsize(truncateAt);
        this.tvTitle.setGravity(17);
        this.tvTitle.setMaxLines(2);
        this.tvTitle.setMaxWidth(va.jd(context, 180.0f));
        this.tvTitle.setTextColor(-1);
        this.tvTitle.setTextSize(2, 24.0f);
        myVar.addView(this.tvTitle, new LinearLayout.LayoutParams(-1, -2));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.tvDesc = xykVar2;
        xykVar2.setEllipsize(truncateAt);
        this.tvDesc.setGravity(17);
        this.tvDesc.setMaxLines(2);
        this.tvDesc.setTextColor(Color.parseColor("#BFFFFFFF"));
        this.tvDesc.setTextSize(2, 16.0f);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = va.jd(context, 8.0f);
        myVar.addView(this.tvDesc, layoutParams3);
        this.rbScore = new hna(context, true);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, va.jd(context, 16.0f));
        layoutParams4.topMargin = va.jd(context, 12.0f);
        this.rbScore.setVisibility(8);
        myVar.addView(this.rbScore, layoutParams4);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar3 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        this.tvDownload = xykVar3;
        xykVar3.setId(520093707);
        this.tvDownload.setGravity(17);
        this.tvDownload.setText(com.bytedance.sdk.component.utils.dt.jpo(context, "tt_video_download_apk"));
        this.tvDownload.setTextColor(-1);
        this.tvDownload.setTextSize(2, 16.0f);
        this.tvDownload.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_reward_full_video_backup_btn_bg"));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, va.jd(context, 44.0f));
        layoutParams5.topMargin = va.jd(context, 54.0f);
        myVar.addView(this.tvDownload, layoutParams5);
        this.adLogo = PAGLogoView.createPAGLogoViewByMaterial(context, this.adContext.f19914jd);
        FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-2, va.jd(context, 14.0f));
        layoutParams6.gravity = 8388691;
        layoutParams6.leftMargin = va.jd(context, 18.0f);
        if (z10) {
            layoutParams6.bottomMargin = va.jd(context, 61.0f);
        } else {
            layoutParams6.bottomMargin = va.jd(context, 24.0f);
        }
        addView(this.adLogo, layoutParams6);
    }

    private void initViewsForVast() {
        Context context = getContext();
        setBackgroundColor(-16777216);
        com.bytedance.sdk.openadsdk.core.jj.cm cmVar = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        cmVar.setId(com.bytedance.sdk.openadsdk.utils.hna.xyk);
        cmVar.setVisibility(8);
        addView(cmVar, new FrameLayout.LayoutParams(-1, -1));
        View jjVar = new com.bytedance.sdk.component.zz.jj(context, true);
        jjVar.setVisibility(8);
        jjVar.setId(com.bytedance.sdk.openadsdk.utils.hna.zz);
        addView(jjVar, new FrameLayout.LayoutParams(-1, -1));
    }

    private void setDownloadButtonData(com.bytedance.sdk.openadsdk.core.jj.xyk xykVar, dt dtVar, int i10) {
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar = this.adContext;
        com.bytedance.sdk.openadsdk.core.wqx.my myVarJpo = jpoVar.f19923rv.jpo(jpoVar, dtVar);
        com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar2 = this.adContext;
        myVarJpo.jpo(com.bytedance.sdk.openadsdk.jr.jpo.jpo.qk.jpo(jpoVar2.vrc, jpoVar2.my));
        if (i10 != -1) {
            HashMap map = new HashMap();
            int i11 = i10 + 1;
            map.put("ad_show_order", Integer.valueOf(i11));
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("ad_show_order", i11);
                map.put("pag_json_data", jSONObject.toString());
            } catch (Throwable unused) {
            }
            myVarJpo.jpo(map);
        }
        xykVar.setOnClickListener(myVarJpo);
        xykVar.setOnTouchListener(myVarJpo);
        CharSequence charSequenceClt = dtVar.clt();
        if (TextUtils.isEmpty(charSequenceClt)) {
            return;
        }
        xykVar.setText(charSequenceClt);
    }

    public void init(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        this.adContext = jpoVar;
        if (jpoVar.f19914jd.ig()) {
            initViews();
        }
    }

    public void setShownAdCount(int i10) {
        this.shownAdCount = i10;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 0) {
            initViews();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class jpo extends Drawable {

        /* renamed from: jd, reason: collision with root package name */
        private final Drawable f20014jd;
        Path jpo = new Path();
        private final int wqx;

        public jpo(Context context) {
            this.f20014jd = com.bytedance.sdk.component.utils.dt.wqx(context, "tt_ad_bg_header_gradient");
            this.wqx = va.jd(context, 8.0f);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            canvas.clipPath(this.jpo);
            canvas.drawColor(-1);
            this.f20014jd.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        @Override // android.graphics.drawable.Drawable
        public void setBounds(int i10, int i11, int i12, int i13) {
            super.setBounds(i10, i11, i12, i13);
            float f10 = i12;
            this.f20014jd.setBounds(i10, i11, i12, (int) (((1.0f * f10) / this.f20014jd.getIntrinsicWidth()) * this.f20014jd.getIntrinsicHeight()));
            this.jpo.reset();
            Path path = this.jpo;
            RectF rectF = new RectF(0.0f, 0.0f, f10, i13);
            int i14 = this.wqx;
            path.addRoundRect(rectF, i14, i14, Path.Direction.CCW);
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i10) {
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(ColorFilter colorFilter) {
        }
    }
}
