package com.bytedance.sdk.openadsdk.core.widget;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.window.OnBackInvokedCallback;
import b0.e2;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.utils.va;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public class jd extends Dialog {

    /* renamed from: au, reason: collision with root package name */
    private int f20890au;

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f20891cm;

    /* renamed from: if, reason: not valid java name */
    private String f141if;

    /* renamed from: jd, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.cm f20892jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.jpo f20893jj;
    public InterfaceC0134jd jpo;

    /* renamed from: ju, reason: collision with root package name */
    private String f20894ju;
    private com.bytedance.sdk.openadsdk.core.jj.jpo my;
    private OnBackInvokedCallback oya;
    private boolean prr;

    /* renamed from: qk, reason: collision with root package name */
    private View f20895qk;
    private com.bytedance.sdk.openadsdk.core.jj.xyk wqx;
    private final Context xyk;

    /* renamed from: yd, reason: collision with root package name */
    private String f20896yd;
    private String zz;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.core.widget.jd$jd, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0134jd {
        void jd();

        void jpo();
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* loaded from: classes4.dex */
    public static class jpo implements OnBackInvokedCallback {
        private final WeakReference<jd> jpo;

        public jpo(jd jdVar) {
            this.jpo = new WeakReference<>(jdVar);
        }

        public void onBackInvoked() {
            jd jdVar = this.jpo.get();
            if (jdVar != null) {
                com.bytedance.sdk.component.utils.nmd.jpo("CustomCommonDialog", "onBackInvoked");
                jdVar.onBackPressed();
            }
        }
    }

    public jd(Context context) {
        super(context, dt.jj(context, "tt_custom_dialog"));
        this.f20890au = -1;
        this.prr = false;
        this.xyk = context;
    }

    private void jd() {
        if (TextUtils.isEmpty(this.f20896yd)) {
            this.wqx.setVisibility(8);
        } else {
            this.wqx.setText(this.f20896yd);
            this.wqx.setVisibility(0);
        }
        if (!TextUtils.isEmpty(this.zz)) {
            this.f20891cm.setText(this.zz);
        }
        if (TextUtils.isEmpty(this.f20894ju)) {
            this.f20893jj.setText(dt.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), "tt_postive_txt"));
        } else {
            this.f20893jj.setText(this.f20894ju);
        }
        if (TextUtils.isEmpty(this.f141if)) {
            this.my.setText(dt.jpo(com.bytedance.sdk.openadsdk.core.sq.jpo(), "tt_negtive_txt"));
        } else {
            this.my.setText(this.f141if);
        }
        int i10 = this.f20890au;
        if (i10 != -1) {
            this.f20892jd.setImageResource(i10);
            this.f20892jd.setVisibility(0);
        } else {
            this.f20892jd.setVisibility(8);
        }
        if (this.prr) {
            this.f20895qk.setVisibility(8);
            this.my.setVisibility(8);
        } else {
            this.my.setVisibility(0);
            this.f20895qk.setVisibility(0);
        }
    }

    private void jpo() {
        this.f20893jj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jd.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0134jd interfaceC0134jd = jd.this.jpo;
                if (interfaceC0134jd != null) {
                    interfaceC0134jd.jpo();
                }
            }
        });
        this.my.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.core.widget.jd.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                InterfaceC0134jd interfaceC0134jd = jd.this.jpo;
                if (interfaceC0134jd != null) {
                    interfaceC0134jd.jd();
                }
            }
        });
    }

    private void wqx() {
        if (this.oya == null || !com.bytedance.sdk.openadsdk.utils.dt.jpo()) {
            return;
        }
        com.bytedance.sdk.component.utils.nmd.jpo("CustomCommonDialog", "isAtLeastT unregisterOnBackInvokedCallback");
        getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.oya);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        wqx();
    }

    @Override // android.app.Dialog
    public void onBackPressed() {
        com.bytedance.sdk.component.utils.nmd.jpo("CustomCommonDialog", "onBackPressed");
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        jd();
    }

    private View jpo(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        qkVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        RelativeLayout.LayoutParams layoutParamsE = e2.e(-1, -2, 13);
        myVar.setMinimumWidth(jpo(260.0f));
        myVar.setPadding(0, jpo(32.0f), 0, 0);
        myVar.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_custom_dialog_bg"));
        myVar.setOrientation(1);
        myVar.setLayoutParams(layoutParamsE);
        this.wqx = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        layoutParams.leftMargin = jpo(16.0f);
        layoutParams.rightMargin = jpo(16.0f);
        layoutParams.bottomMargin = jpo(16.0f);
        this.wqx.setGravity(17);
        this.wqx.setVisibility(0);
        this.wqx.setTextColor(Color.parseColor("#333333"));
        this.wqx.setTextSize(18.0f);
        this.wqx.setLayoutParams(layoutParams);
        this.f20892jd = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        layoutParams2.leftMargin = jpo(16.0f);
        layoutParams2.rightMargin = jpo(16.0f);
        layoutParams2.bottomMargin = jpo(10.0f);
        this.f20892jd.setMaxHeight(jpo(150.0f));
        this.f20892jd.setMaxWidth(jpo(150.0f));
        this.f20892jd.setVisibility(0);
        this.f20892jd.setLayoutParams(layoutParams2);
        this.f20891cm = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = jpo(20.0f);
        layoutParams3.rightMargin = jpo(20.0f);
        this.f20891cm.setGravity(17);
        this.f20891cm.setLineSpacing(jpo(3.0f), 1.2f);
        this.f20891cm.setTextSize(18.0f);
        this.f20891cm.setTextColor(Color.parseColor("#000000"));
        this.f20891cm.setLayoutParams(layoutParams3);
        View view = new View(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, 1);
        layoutParams4.topMargin = jpo(32.0f);
        view.setBackgroundColor(Color.parseColor("#E4E4E4"));
        view.setLayoutParams(layoutParams4);
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-1, -2);
        myVar2.setOrientation(0);
        myVar2.setLayoutParams(layoutParams5);
        com.bytedance.sdk.openadsdk.core.jj.jpo jpoVar = new com.bytedance.sdk.openadsdk.core.jj.jpo(context);
        this.my = jpoVar;
        jpoVar.setId(520093718);
        LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(0, -2);
        layoutParams6.leftMargin = jpo(10.0f);
        layoutParams6.weight = 1.0f;
        this.my.setPadding(0, jpo(16.0f), 0, jpo(16.0f));
        this.my.setBackground(null);
        this.my.setGravity(17);
        this.my.setSingleLine(true);
        this.my.setTextColor(Color.parseColor("#999999"));
        this.my.setTextSize(16.0f);
        this.my.setLayoutParams(layoutParams6);
        this.f20895qk = new View(context);
        LinearLayout.LayoutParams layoutParams7 = new LinearLayout.LayoutParams(1, -1);
        this.f20895qk.setBackgroundColor(Color.parseColor("#E4E4E4"));
        this.f20895qk.setLayoutParams(layoutParams7);
        this.f20893jj = new com.bytedance.sdk.openadsdk.core.jj.jpo(context);
        this.my.setId(520093719);
        LinearLayout.LayoutParams layoutParams8 = new LinearLayout.LayoutParams(0, -2);
        layoutParams8.rightMargin = jpo(10.0f);
        layoutParams8.weight = 1.0f;
        this.f20893jj.setPadding(0, jpo(16.0f), 0, jpo(16.0f));
        this.f20893jj.setBackground(null);
        this.f20893jj.setGravity(17);
        this.f20893jj.setSingleLine(true);
        this.f20893jj.setTextColor(Color.parseColor("#38ADFF"));
        this.f20893jj.setTextSize(16.0f);
        this.f20893jj.setLayoutParams(layoutParams8);
        qkVar.addView(myVar);
        myVar.addView(this.wqx);
        myVar.addView(this.f20892jd);
        myVar.addView(this.f20891cm);
        myVar.addView(view);
        myVar.addView(myVar2);
        myVar2.addView(this.my);
        myVar2.addView(this.f20895qk);
        myVar2.addView(this.f20893jj);
        return qkVar;
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(jpo(this.xyk));
        if (com.bytedance.sdk.openadsdk.utils.dt.jpo()) {
            com.bytedance.sdk.component.utils.nmd.jpo(QCmNMSGd.VEJsRlPswO, "isAtLeastT registerOnBackInvokedCallback");
            this.oya = new jpo(this);
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.oya);
        }
        setCanceledOnTouchOutside(false);
        jd();
        jpo();
    }

    public jd wqx(String str) {
        this.f141if = str;
        return this;
    }

    public jd jd(String str) {
        this.f20894ju = str;
        return this;
    }

    private int jpo(float f10) {
        return va.jd(getContext(), f10);
    }

    public jd jpo(InterfaceC0134jd interfaceC0134jd) {
        this.jpo = interfaceC0134jd;
        return this;
    }

    public jd jpo(String str) {
        this.zz = str;
        return this;
    }
}
