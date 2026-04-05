package com.bytedance.sdk.openadsdk.wqx;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import b0.e2;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.Locale;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* renamed from: com.bytedance.sdk.openadsdk.wqx.if, reason: invalid class name */
/* loaded from: classes4.dex */
public class Cif extends Dialog {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.xyk f21630cm;

    /* renamed from: jd, reason: collision with root package name */
    private jpo f21631jd;

    /* renamed from: jj, reason: collision with root package name */
    private com.bytedance.sdk.openadsdk.core.jj.cm f21632jj;
    private com.bytedance.sdk.openadsdk.core.jj.my jpo;
    private com.bytedance.sdk.openadsdk.core.jj.xyk my;

    /* renamed from: qk, reason: collision with root package name */
    private final yd f21633qk;
    private com.bytedance.sdk.openadsdk.core.jj.jd wqx;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.wqx.if$jpo */
    public interface jpo {
        void jd();

        void jpo();

        void jpo(int i10, FilterWord filterWord, String str);

        void wqx();
    }

    public Cif(Context context, yd ydVar) {
        super(context, dt.jj(context, "tt_quick_option_dialog"));
        setCanceledOnTouchOutside(false);
        this.f21633qk = ydVar;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        jd();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        com.bytedance.sdk.openadsdk.core.jj.my myVarJpo = jpo(sq.jpo());
        this.jpo = myVarJpo;
        setContentView(myVarJpo);
        jpo(this.jpo);
        wqx();
        jpo();
        cm();
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        jpo jpoVar = this.f21631jd;
        if (jpoVar != null) {
            jpoVar.jpo();
        }
    }

    private void cm() {
        setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.bytedance.sdk.openadsdk.wqx.if.5
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(DialogInterface dialogInterface) {
                if (Cif.this.f21631jd != null) {
                    Cif.this.f21631jd.wqx();
                }
            }
        });
    }

    private void jpo(View view) {
        jpo((EditText) this.wqx);
        yd ydVar = this.f21633qk;
        if (ydVar != null) {
            String strQk = ydVar.qk();
            if (!TextUtils.isEmpty(strQk)) {
                this.wqx.setText(strQk);
                this.f21630cm.setText(String.format(Locale.getDefault(), "%d%s", Integer.valueOf(strQk.length()), "/200"));
            }
            this.my.setEnabled(!TextUtils.isEmpty(strQk));
        }
        this.my.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.wqx.if.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                String string = Cif.this.wqx.getText().toString();
                if (Cif.this.f21631jd != null) {
                    Cif.this.f21631jd.jpo(4, yd.jpo, string);
                }
                Cif.this.dismiss();
            }
        });
        this.f21632jj.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.wqx.if.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (Cif.this.f21631jd != null) {
                    Cif.this.f21631jd.jd();
                }
                Cif.this.dismiss();
            }
        });
        this.wqx.addTextChangedListener(new TextWatcher() { // from class: com.bytedance.sdk.openadsdk.wqx.if.3
            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
                com.bytedance.sdk.openadsdk.core.jj.xyk xykVar;
                int iRound = Math.round(charSequence.length());
                Cif.this.f21630cm.setText(o2.j(iRound, "/200"));
                boolean z10 = true;
                if (iRound <= 0) {
                    xykVar = Cif.this.my;
                    if (Cif.this.f21633qk == null || TextUtils.isEmpty(Cif.this.f21633qk.qk())) {
                        z10 = false;
                    }
                } else if (Cif.this.my.isEnabled()) {
                    return;
                } else {
                    xykVar = Cif.this.my;
                }
                xykVar.setEnabled(z10);
            }

            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            }
        });
    }

    private void wqx() {
        setCanceledOnTouchOutside(true);
        setCancelable(true);
        Window window = getWindow();
        if (window != null) {
            if (window.getDecorView() != null) {
                window.getDecorView().setPadding(0, 0, 0, 0);
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -2;
            window.setAttributes(attributes);
            window.setGravity(80);
        }
    }

    public void jd() {
        InputMethodManager inputMethodManager;
        com.bytedance.sdk.openadsdk.core.jj.jd jdVar = this.wqx;
        if (jdVar == null || (inputMethodManager = (InputMethodManager) jdVar.getContext().getSystemService("input_method")) == null) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.jpo.getWindowToken(), 0);
    }

    public static void jpo(EditText editText) {
        editText.setFilters(new InputFilter[]{new InputFilter() { // from class: com.bytedance.sdk.openadsdk.wqx.if.4
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
                while (i10 < i11) {
                    int type = Character.getType(charSequence.charAt(i10));
                    if (type == 19 || type == 28) {
                        return "";
                    }
                    i10++;
                }
                return null;
            }
        }, new InputFilter.LengthFilter(200)});
    }

    public void jpo(jpo jpoVar) {
        this.f21631jd = jpoVar;
    }

    public void jpo() {
        com.bytedance.sdk.openadsdk.core.jj.jd jdVar = this.wqx;
        if (jdVar == null) {
            return;
        }
        jdVar.requestFocus();
        Window window = getWindow();
        if (window != null) {
            window.setSoftInputMode(5);
        }
    }

    public void jpo(String str, com.bytedance.sdk.openadsdk.core.model.dt dtVar) {
        yd ydVar = this.f21633qk;
        if (ydVar != null) {
            ydVar.jpo(str, dtVar);
        }
    }

    private com.bytedance.sdk.openadsdk.core.jj.my jpo(Context context) {
        com.bytedance.sdk.openadsdk.core.jj.my myVar = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        myVar.setOrientation(1);
        myVar.setBackground(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_dislike_dialog_bg"));
        com.bytedance.sdk.openadsdk.core.jj.qk qkVar = new com.bytedance.sdk.openadsdk.core.jj.qk(context);
        qkVar.setLayoutParams(new LinearLayout.LayoutParams(-1, va.jd(context, 48.0f)));
        this.f21632jj = new com.bytedance.sdk.openadsdk.core.jj.cm(context);
        int iJd = va.jd(context, 24.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iJd, iJd);
        layoutParams.addRule(16);
        layoutParams.addRule(11);
        int iJd2 = va.jd(context, 10.0f);
        layoutParams.topMargin = iJd2;
        layoutParams.rightMargin = iJd2;
        this.f21632jj.setLayoutParams(layoutParams);
        this.f21632jj.setClickable(true);
        this.f21632jj.setFocusable(true);
        this.f21632jj.setImageDrawable(com.bytedance.sdk.openadsdk.utils.ju.jpo(context, "tt_titlebar_close_seletor"));
        com.bytedance.sdk.openadsdk.core.jj.xyk xykVar = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        RelativeLayout.LayoutParams layoutParamsE = e2.e(-1, -2, 16);
        layoutParamsE.topMargin = va.jd(context, 12.0f);
        xykVar.setLayoutParams(layoutParamsE);
        xykVar.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        xykVar.setGravity(17);
        xykVar.setSingleLine(true);
        xykVar.setText(dt.jpo(context, "tt_other_reason"));
        xykVar.setTextColor(Color.parseColor("#161823"));
        xykVar.setTextSize(15.0f);
        xykVar.setTypeface(Typeface.defaultFromStyle(0));
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, va.jd(context, 0.5f)));
        view.setBackgroundColor(Color.argb(51, 22, 24, 35));
        com.bytedance.sdk.openadsdk.core.jj.my myVar2 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        myVar2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        myVar2.setOrientation(1);
        com.bytedance.sdk.openadsdk.core.jj.jd jdVar = new com.bytedance.sdk.openadsdk.core.jj.jd(context);
        this.wqx = jdVar;
        jdVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(200), new InputFilter.AllCaps()});
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = va.jd(context, 16.0f);
        layoutParams2.rightMargin = va.jd(context, 16.0f);
        layoutParams2.topMargin = va.jd(context, 11.5f);
        this.wqx.setLayoutParams(layoutParams2);
        this.wqx.setLines(4);
        this.wqx.setGravity(48);
        this.wqx.setTextSize(15.0f);
        this.wqx.setTextColor(Color.rgb(22, 24, 35));
        this.wqx.setHintTextColor(Color.parseColor("#57161823"));
        this.wqx.setBackground(null);
        this.wqx.setImeOptions(268435456);
        com.bytedance.sdk.openadsdk.core.jj.my myVar3 = new com.bytedance.sdk.openadsdk.core.jj.my(context);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        int iJd3 = va.jd(context, 16.0f);
        int iJd4 = va.jd(context, 17.0f);
        myVar3.setPadding(iJd3, iJd4, iJd3, iJd4);
        myVar3.setLayoutParams(layoutParams3);
        myVar3.setOrientation(0);
        this.f21630cm = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2);
        layoutParams4.weight = 1.0f;
        layoutParams4.gravity = 8388611;
        this.f21630cm.setLayoutParams(layoutParams4);
        this.f21630cm.setText("0/200");
        this.f21630cm.setGravity(8388611);
        this.f21630cm.setTextColor(Color.parseColor("#57161823"));
        this.f21630cm.setTextSize(15.0f);
        this.my = new com.bytedance.sdk.openadsdk.core.jj.xyk(context);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 8388613;
        this.my.setLayoutParams(layoutParams5);
        this.my.setTextSize(14.0f);
        this.my.setTextColor(-1);
        this.my.setVisibility(0);
        this.my.setSingleLine(true);
        int iJd5 = va.jd(context, 27.0f);
        int iJd6 = va.jd(context, 5.0f);
        this.my.setPadding(iJd5, iJd6, iJd5, iJd6);
        int iJd7 = va.jd(context, 6.0f);
        GradientDrawable gradientDrawable = new GradientDrawable();
        float f10 = iJd7;
        gradientDrawable.setCornerRadius(f10);
        int iRgb = Color.rgb(254, 44, 85);
        gradientDrawable.setColor(iRgb);
        gradientDrawable.setAlpha(102);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(f10);
        gradientDrawable2.setColor(iRgb);
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        this.my.setBackground(stateListDrawable);
        this.my.setText(dt.jpo(context, "tt_done"));
        this.my.setEnabled(false);
        myVar.addView(qkVar);
        myVar.addView(view);
        myVar.addView(myVar2);
        qkVar.addView(this.f21632jj);
        qkVar.addView(xykVar);
        myVar2.addView(this.wqx);
        myVar2.addView(myVar3);
        myVar3.addView(this.f21630cm);
        myVar3.addView(this.my);
        return myVar;
    }
}
