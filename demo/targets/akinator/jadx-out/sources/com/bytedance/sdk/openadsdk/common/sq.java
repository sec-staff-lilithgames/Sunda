package com.bytedance.sdk.openadsdk.common;

import android.app.Dialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.component.utils.nmd;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.utils.tic;
import com.bytedance.sdk.openadsdk.utils.va;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq extends Dialog {

    /* renamed from: jd, reason: collision with root package name */
    private static final String[] f19751jd = {"SDK version", "App", "App version", "OS", "Device", "Creative info"};

    /* renamed from: cm, reason: collision with root package name */
    private TextView f19752cm;

    /* renamed from: jj, reason: collision with root package name */
    private ImageView f19753jj;
    private final Handler jpo;
    private Button my;
    private String wqx;

    public sq(Context context) {
        super(context, dt.jj(context, "tt_privacy_dialog_theme_ad_report"));
        this.jpo = new Handler(Looper.getMainLooper());
        this.wqx = "";
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(jpo(getContext()), new ViewGroup.LayoutParams(va.wqx(getContext()), (int) (va.my(getContext()) * 0.9d)));
        jd();
        if (getWindow() != null) {
            getWindow().setGravity(80);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
            this.jpo.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.common.sq.3
                @Override // java.lang.Runnable
                public void run() {
                    sq.this.f19752cm.setText(sq.this.wqx);
                }
            }, 1000L);
        } catch (Exception e10) {
            ApmHelper.reportCustomError("showPrivacyAdReportDialogError", "showPrivacyAdReportDialogError", e10);
        }
    }

    private void jd() {
        final String strJj = tic.jj();
        final String strXyk = tic.xyk();
        final String str = "Android " + Build.VERSION.RELEASE;
        final String str2 = Build.BRAND + " " + Build.MODEL;
        this.my.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.sq.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ClipboardManager clipboardManager = (ClipboardManager) sq.this.getContext().getSystemService("clipboard");
                if (clipboardManager != null) {
                    StringBuilder sb2 = new StringBuilder();
                    String[] strArr = {BuildConfig.VERSION_NAME, strJj, strXyk, str, str2, sq.this.wqx};
                    for (int i10 = 0; i10 < sq.f19751jd.length; i10++) {
                        sb2.append(sq.f19751jd[i10]);
                        sb2.append(": ");
                        sb2.append(strArr[i10]);
                        sb2.append("\n");
                    }
                    try {
                        clipboardManager.setPrimaryClip(ClipData.newPlainText("pangle sdk build info", sb2));
                    } catch (Throwable unused) {
                    }
                }
            }
        });
        this.f19753jj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.common.sq.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                sq.this.f19752cm.setText("loading ...");
                sq.this.cancel();
            }
        });
    }

    public void jpo(String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        JSONObject jSONObjectXfa;
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObjectXfa = new JSONObject(str);
            } else {
                jSONObjectXfa = dtVar.xfa();
            }
            this.wqx = com.bytedance.sdk.component.utils.jpo.jpo(jSONObjectXfa).toString();
        } catch (JSONException e10) {
            nmd.wqx("TTPrivacyAdReportDialog", e10.getMessage());
        }
    }

    private View jpo(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        myVar.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_ad_report_info_bg"));
        myVar.setOrientation(1);
        myVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        qkVar.setLayoutParams(new ViewGroup.LayoutParams(-1, jpo(44.0f)));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(jpo(191.0f), jpo(24.0f));
        layoutParams2.addRule(13);
        xykVar.setGravity(17);
        xykVar.setText("Ad Report");
        xykVar.setTextColor(Color.parseColor("#161823"));
        xykVar.setTextSize(1, 17.0f);
        xykVar.setLayoutParams(layoutParams2);
        this.f19753jj = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(jpo(40.0f), jpo(44.0f));
        layoutParams3.addRule(11);
        layoutParams3.addRule(15);
        layoutParams3.rightMargin = jpo(8.0f);
        this.f19753jj.setPadding(jpo(12.0f), jpo(14.0f), jpo(12.0f), jpo(14.0f));
        this.f19753jj.setImageResource(dt.cm(context, "tt_ad_xmark"));
        this.f19753jj.setLayoutParams(layoutParams3);
        View view = new View(context);
        ViewGroup.LayoutParams layoutParams4 = new ViewGroup.LayoutParams(-1, jpo(0.5f));
        view.setBackgroundColor(Color.parseColor("#1F161823"));
        view.setLayoutParams(layoutParams4);
        ScrollView scrollView = new ScrollView(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams5.leftMargin = jpo(16.0f);
        layoutParams5.rightMargin = jpo(16.0f);
        layoutParams5.weight = 1.0f;
        layoutParams5.setMarginStart(jpo(16.0f));
        layoutParams5.setMarginEnd(jpo(16.0f));
        scrollView.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        ViewGroup.LayoutParams layoutParams6 = new ViewGroup.LayoutParams(-1, -1);
        myVar2.setOrientation(1);
        myVar2.setLayoutParams(layoutParams6);
        String strJj = tic.jj();
        String strXyk = tic.xyk();
        String str = "Android " + Build.VERSION.RELEASE;
        String str2 = Build.BRAND + " " + Build.MODEL;
        com.bytedance.sdk.openadsdk.core.jj.my myVarJpo = jpo(context, "SDK version", BuildConfig.VERSION_NAME);
        com.bytedance.sdk.openadsdk.core.jj.my myVarJpo2 = jpo(context, "App", strJj);
        com.bytedance.sdk.openadsdk.core.jj.my myVarJpo3 = jpo(context, "App version", strXyk);
        com.bytedance.sdk.openadsdk.core.jj.my myVarJpo4 = jpo(context, "OS", str);
        com.bytedance.sdk.openadsdk.core.jj.my myVarJpo5 = jpo(context, "Device", str2);
        com.bytedance.sdk.openadsdk.core.jj.my myVarJpo6 = jpo(context, "Creative info", "loading ...");
        com.bytedance.sdk.openadsdk.core.jj.my myVar3 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(-1, jpo(76.0f));
        myVar3.setBackgroundColor(-1);
        myVar3.setLayoutParams(layoutParams7);
        this.my = new Button(context);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(-1, -1);
        int iJpo = jpo(16.0f);
        layoutParams8.setMargins(iJpo, iJpo, iJpo, iJpo);
        this.my.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_ad_report_info_button_bg"));
        this.my.setText("copy all");
        this.my.setTextColor(Color.parseColor("#333333"));
        this.my.setTextSize(14.0f);
        this.my.setLayoutParams(layoutParams8);
        myVar.addView(qkVar);
        qkVar.addView(xykVar);
        qkVar.addView(this.f19753jj);
        myVar.addView(view);
        myVar.addView(scrollView);
        scrollView.addView(myVar2);
        myVar2.addView(myVarJpo);
        myVar2.addView(myVarJpo2);
        myVar2.addView(myVarJpo3);
        myVar2.addView(myVarJpo4);
        myVar2.addView(myVarJpo5);
        myVar2.addView(myVarJpo6);
        myVar.addView(myVar3);
        myVar3.addView(this.my);
        return myVar;
    }

    private com.bytedance.sdk.openadsdk.core.jj.my jpo(Context context, String str, String str2) {
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, str.equals("Creative info") ? -2 : jpo(74.0f));
        myVar.setOrientation(1);
        myVar.setPadding(0, jpo(16.0f), 0, jpo(16.0f));
        myVar.setLayoutParams(layoutParams);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.bottomMargin = jpo(7.0f);
        xykVar.setIncludeFontPadding(false);
        xykVar.setText(str);
        xykVar.setTextColor(Color.parseColor("#333333"));
        xykVar.setTextSize(16.0f);
        xykVar.setTypeface(Typeface.defaultFromStyle(1));
        xykVar.setLayoutParams(layoutParams2);
        myVar.addView(xykVar);
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar2 = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        if (str.equals("Creative info")) {
            this.f19752cm = xykVar2;
        }
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        xykVar2.setIncludeFontPadding(false);
        xykVar2.setTextColor(Color.parseColor("#666666"));
        xykVar2.setText(str2);
        xykVar2.setTextSize(14.0f);
        xykVar2.setLayoutParams(layoutParams3);
        myVar.addView(xykVar2);
        return myVar;
    }

    private int jpo(float f10) {
        return va.jd(getContext(), f10);
    }
}
