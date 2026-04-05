package com.mbridge.msdk.foundation.feedback.bean;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.u0;
import com.mbridge.msdk.setting.b;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.widget.FeedBackButton;
import com.mbridge.msdk.widget.FeedbackRadioGroup;
import com.mbridge.msdk.widget.dialog.MBFeedBackDialog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import qm.zMPW.GalEuEfxjome;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class a {
    private static int A = -1;
    private static String B;

    /* renamed from: b, reason: collision with root package name */
    private String f40670b;

    /* renamed from: c, reason: collision with root package name */
    private CampaignEx f40671c;

    /* renamed from: e, reason: collision with root package name */
    private FeedBackButton f40673e;

    /* renamed from: f, reason: collision with root package name */
    private String f40674f;

    /* renamed from: i, reason: collision with root package name */
    private String f40677i;

    /* renamed from: j, reason: collision with root package name */
    private MBFeedBackDialog f40678j;

    /* renamed from: k, reason: collision with root package name */
    private Dialog f40679k;

    /* renamed from: l, reason: collision with root package name */
    private JSONArray f40680l;

    /* renamed from: q, reason: collision with root package name */
    private int f40685q;

    /* renamed from: r, reason: collision with root package name */
    private List<g> f40686r;

    /* renamed from: u, reason: collision with root package name */
    private int f40689u;

    /* renamed from: a, reason: collision with root package name */
    private float f40669a = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    private String f40672d = "";

    /* renamed from: g, reason: collision with root package name */
    private float f40675g = -1.0f;

    /* renamed from: h, reason: collision with root package name */
    private int f40676h = -1;

    /* renamed from: m, reason: collision with root package name */
    private int f40681m = -1;

    /* renamed from: n, reason: collision with root package name */
    private int f40682n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f40683o = -1;

    /* renamed from: p, reason: collision with root package name */
    private int f40684p = -1;

    /* renamed from: s, reason: collision with root package name */
    private int f40687s = com.google.android.gms.internal.play_billing.a.a(20.0f);

    /* renamed from: t, reason: collision with root package name */
    private String f40688t = "";

    /* renamed from: v, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f40690v = new C0269a();

    /* renamed from: w, reason: collision with root package name */
    private int f40691w = A;

    /* renamed from: x, reason: collision with root package name */
    private int f40692x = -1;

    /* renamed from: y, reason: collision with root package name */
    private int f40693y = -1;

    /* renamed from: z, reason: collision with root package name */
    private int f40694z = -1;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.mbridge.msdk.foundation.feedback.bean.a$a, reason: collision with other inner class name */
    public class C0269a implements com.mbridge.msdk.widget.dialog.b {
        public C0269a() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements com.mbridge.msdk.widget.dialog.b {
        public c() {
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            a.this.m();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            a.this.l();
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            a.this.n();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements CompoundButton.OnCheckedChangeListener {
        public d() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            if (z10) {
                String unused = a.B = (String) compoundButton.getText();
            }
            if (a.this.f40678j != null) {
                a.this.f40678j.setCancelButtonClickable(!TextUtils.isEmpty(a.B));
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                if (a.this.f40679k == null || !a.this.f40679k.isShowing()) {
                    return;
                }
                a.this.f40679k.dismiss();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class f implements View.OnClickListener {
        public f() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a.this.p();
        }
    }

    public a(String str) {
        this.f40686r = new ArrayList();
        this.f40677i = str;
        if (this.f40686r == null) {
            this.f40686r = new ArrayList();
        }
        d();
        e();
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f40677i, 1, 4, B, this.f40672d);
        List<g> list = this.f40686r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.b();
                }
            }
        }
        o();
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f40677i, 0, 4, B, this.f40672d);
        List<g> list = this.f40686r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        B = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.mbridge.msdk.foundation.feedback.b.b().a(this.f40677i, 0, 4, B, this.f40672d);
        Context contextF = com.mbridge.msdk.foundation.controller.c.m().f();
        if (contextF == null) {
            contextF = com.mbridge.msdk.foundation.controller.c.m().d();
        }
        List<g> list = this.f40686r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a();
                }
            }
        }
        a(contextF);
        B = "";
    }

    public void f() {
        FeedBackButton feedBackButton = this.f40673e;
        if (feedBackButton != null) {
            feedBackButton.setOnClickListener(null);
            this.f40673e.setVisibility(8);
            ViewGroup viewGroup = (ViewGroup) this.f40673e.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.f40673e);
            }
        }
        MBFeedBackDialog mBFeedBackDialog = this.f40678j;
        if (mBFeedBackDialog != null) {
            mBFeedBackDialog.cancel();
            this.f40678j.setListener(null);
        }
        this.f40678j = null;
        this.f40686r = null;
        this.f40673e = null;
        this.f40690v = null;
    }

    public void g() {
        MBFeedBackDialog mBFeedBackDialog = this.f40678j;
        if (mBFeedBackDialog == null || !mBFeedBackDialog.isShowing()) {
            return;
        }
        this.f40678j.cancel();
    }

    public CampaignEx h() {
        return this.f40671c;
    }

    public FeedBackButton i() {
        if (this.f40673e == null) {
            e();
        }
        return this.f40673e;
    }

    public int j() {
        return this.f40685q;
    }

    public int k() {
        return this.f40689u;
    }

    public void p() {
        try {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f40677i, 0, 1, B, this.f40672d);
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.m().d());
            MBFeedBackDialog mBFeedBackDialog = this.f40678j;
            if (mBFeedBackDialog == null || mBFeedBackDialog.getContext() != activityA) {
                c();
            }
            Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
            FeedBackButton feedBackButton = this.f40673e;
            if (feedBackButton != null) {
                contextD = feedBackButton.getContext();
            }
            boolean zA = com.mbridge.msdk.foundation.feedback.b.b().a(this.f40677i, contextD, this.f40678j);
            a(zA ? 2 : 3);
            if (zA) {
                return;
            }
            a(contextD);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void c() {
        try {
            if (com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.m().d()) != null) {
                com.mbridge.msdk.setting.g gVarD = h.b().d(com.mbridge.msdk.foundation.controller.c.m().b());
                if (gVarD == null) {
                    gVarD = h.b().a();
                }
                b.C0319b c0319bZ = gVarD.z();
                if (c0319bZ == null) {
                    p0.c("", "feedback fbk is null");
                    return;
                }
                d();
                this.f40678j = new MBFeedBackDialog(com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.m().d()), this.f40690v);
                FeedbackRadioGroup feedbackRadioGroupA = a(c0319bZ);
                this.f40678j.setCancelText(c0319bZ.d());
                this.f40678j.setConfirmText(c0319bZ.a());
                this.f40678j.setPrivacyText(c0319bZ.c());
                this.f40688t = c0319bZ.e();
                this.f40678j.setTitle(c0319bZ.f());
                this.f40678j.setContent(feedbackRadioGroupA);
                this.f40678j.setCancelButtonClickable(!TextUtils.isEmpty(B));
                a(feedbackRadioGroupA, c0319bZ);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    private void d() {
        if (this.f40690v == null) {
            this.f40690v = new c();
        }
    }

    private void e() {
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (contextD != null) {
            try {
                FeedBackButton feedBackButton = new FeedBackButton(contextD);
                this.f40673e = feedBackButton;
                int i10 = 8;
                if (this.f40691w != 8) {
                    i10 = 0;
                }
                feedBackButton.setVisibility(i10);
                this.f40673e.setOnClickListener(new b());
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    private void o() {
        if (TextUtils.isEmpty(this.f40688t)) {
            return;
        }
        try {
            Activity activityA = com.mbridge.msdk.foundation.feedback.b.b().a(com.mbridge.msdk.foundation.controller.c.m().d());
            if (activityA != null) {
                View viewInflate = LayoutInflater.from(activityA).inflate(h0.a(activityA, "mbridge_cm_feedback_notice_layout", GalEuEfxjome.yktU), (ViewGroup) null);
                Dialog dialog = new Dialog(activityA, 3);
                this.f40679k = dialog;
                dialog.requestWindowFeature(1);
                WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
                Window window = this.f40679k.getWindow();
                layoutParams.copyFrom(window.getAttributes());
                layoutParams.width = -2;
                layoutParams.height = -2;
                this.f40679k.setContentView(viewInflate);
                this.f40679k.show();
                window.setAttributes(layoutParams);
                viewInflate.postDelayed(new e(), 2000L);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    public void b(String str) {
        this.f40672d = str;
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class g implements com.mbridge.msdk.widget.dialog.b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.foundation.feedback.a f40701a;

        /* renamed from: b, reason: collision with root package name */
        private String f40702b;

        public g(String str, com.mbridge.msdk.foundation.feedback.a aVar) {
            this.f40701a = aVar;
            this.f40702b = str;
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void a() {
            com.mbridge.msdk.foundation.feedback.b.f40664f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f40701a;
            if (aVar != null) {
                aVar.close();
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void b() {
            com.mbridge.msdk.foundation.feedback.b.f40664f = false;
            com.mbridge.msdk.foundation.feedback.a aVar = this.f40701a;
            if (aVar != null) {
                aVar.a(a.B);
            }
        }

        @Override // com.mbridge.msdk.widget.dialog.b
        public void c() {
            com.mbridge.msdk.foundation.feedback.a aVar = this.f40701a;
            if (aVar != null) {
                aVar.close();
            }
        }

        public void a(int i10) {
            if (this.f40701a == null || i10 != 2) {
                return;
            }
            com.mbridge.msdk.foundation.feedback.b.f40664f = true;
            this.f40701a.a();
        }
    }

    private void b() {
        FeedBackButton feedBackButton = this.f40673e;
        if (feedBackButton != null) {
            int i10 = this.f40693y;
            if (i10 > -1) {
                feedBackButton.setX(i10);
            }
            int i11 = this.f40694z;
            if (i11 > -1) {
                this.f40673e.setY(i11);
            }
            float f10 = this.f40669a;
            if (f10 >= 0.0f) {
                this.f40673e.setAlpha(f10);
                this.f40673e.setEnabled(this.f40669a != 0.0f);
            }
            ViewGroup.LayoutParams layoutParams = this.f40673e.getLayoutParams();
            int i12 = this.f40692x;
            if (i12 > 0) {
                this.f40673e.setWidth(i12);
                if (layoutParams != null) {
                    layoutParams.width = this.f40692x;
                }
            }
            int i13 = this.f40676h;
            if (i13 > 0) {
                this.f40673e.setHeight(i13);
                if (layoutParams != null) {
                    layoutParams.height = this.f40676h;
                }
            }
            if (layoutParams != null) {
                this.f40673e.setLayoutParams(layoutParams);
            }
            try {
                if (!TextUtils.isEmpty(this.f40674f)) {
                    this.f40673e.setTextColor(Color.parseColor(this.f40674f));
                }
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            float f11 = this.f40675g;
            if (f11 > 0.0f) {
                this.f40673e.setTextSize(f11);
            }
            JSONArray jSONArray = this.f40680l;
            if (jSONArray != null && jSONArray.length() == 4) {
                Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
                this.f40673e.setPadding(u0.a(contextD, (float) this.f40680l.optDouble(0)), u0.a(contextD, (float) this.f40680l.optDouble(1)), u0.a(contextD, (float) this.f40680l.optDouble(2)), u0.a(contextD, (float) this.f40680l.optDouble(3)));
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i14 = this.f40687s;
            if (i14 > 0) {
                gradientDrawable.setCornerRadius(i14);
            }
            if (!TextUtils.isEmpty(this.f40670b)) {
                gradientDrawable.setColor(Color.parseColor(this.f40670b));
            } else {
                gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
            }
            this.f40673e.setBackground(gradientDrawable);
        }
    }

    public void a(g gVar) {
        if (this.f40686r == null) {
            this.f40686r = new ArrayList();
        }
        this.f40686r.add(gVar);
    }

    public void d(int i10) {
        this.f40691w = i10;
        FeedBackButton feedBackButton = this.f40673e;
        if (feedBackButton != null) {
            feedBackButton.setVisibility(i10);
        }
    }

    public void a(CampaignEx campaignEx) {
        this.f40671c = campaignEx;
    }

    private void a(int i10) {
        if (i10 == 2) {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f40677i, 0, 2, B, this.f40672d);
        } else {
            com.mbridge.msdk.foundation.feedback.b.b().a(this.f40677i, 0, 3, B, this.f40672d);
        }
        List<g> list = this.f40686r;
        if (list != null) {
            for (g gVar : list) {
                if (gVar != null) {
                    gVar.a(i10);
                }
            }
        }
    }

    private void a(Context context) {
        if (context != null) {
            try {
                com.mbridge.msdk.click.c.e(context, u0.a(this.f40671c));
            } catch (Exception unused) {
                com.mbridge.msdk.click.c.c(context, u0.a(this.f40671c));
            }
        }
    }

    private FeedbackRadioGroup a(b.C0319b c0319b) {
        JSONArray jSONArrayB = c0319b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return null;
        }
        FeedbackRadioGroup feedbackRadioGroup = new FeedbackRadioGroup(contextD);
        feedbackRadioGroup.setOrientation(0);
        return feedbackRadioGroup;
    }

    public void c(int i10) {
        this.f40689u = i10;
    }

    private void a(FeedbackRadioGroup feedbackRadioGroup, b.C0319b c0319b) throws Resources.NotFoundException {
        ColorStateList colorStateList;
        JSONArray jSONArrayB = c0319b.b();
        Context contextD = com.mbridge.msdk.foundation.controller.c.m().d();
        if (jSONArrayB == null || jSONArrayB.length() <= 0 || contextD == null) {
            return;
        }
        h0.a(contextD, "mbridge_cm_feedback_choice_btn_bg", "drawable");
        Resources resourcesA = h0.a(contextD);
        int iA = h0.a(contextD, "mbridge_cm_feedback_rb_text_color_color_list", "color");
        if (resourcesA != null) {
            try {
                colorStateList = resourcesA.getColorStateList(iA);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } else {
            colorStateList = null;
        }
        int iA2 = u0.a(contextD, 1.0f);
        int iA3 = u0.a(contextD, 1.0f);
        int iA4 = u0.a(contextD, 1.0f);
        for (int i10 = 0; i10 < jSONArrayB.length(); i10++) {
            String strOptString = jSONArrayB.optString(i10);
            RadioButton radioButton = new RadioButton(contextD);
            radioButton.setButtonTintList(colorStateList);
            radioButton.setText(strOptString);
            if (colorStateList != null) {
                radioButton.setTextColor(colorStateList);
            }
            radioButton.setCompoundDrawablePadding(iA2);
            radioButton.setPadding(iA2, iA3, iA2, iA3);
            radioButton.setEllipsize(TextUtils.TruncateAt.END);
            RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
            int i11 = iA4 / 4;
            layoutParams.setMargins(iA4, i11, iA4, i11);
            a(radioButton);
            feedbackRadioGroup.addView(radioButton, layoutParams);
        }
    }

    public void b(int i10) {
        this.f40685q = i10;
    }

    private void a(RadioButton radioButton) {
        if (radioButton != null) {
            radioButton.setOnCheckedChangeListener(new d());
        }
    }

    public void a(FeedBackButton feedBackButton) {
        FeedBackButton feedBackButton2 = this.f40673e;
        if (feedBackButton2 != null) {
            feedBackButton2.setVisibility(8);
        }
        if (feedBackButton != null) {
            feedBackButton.setAlpha(this.f40669a);
            feedBackButton.setEnabled(this.f40669a != 0.0f);
            feedBackButton.setVisibility(this.f40691w != 8 ? 0 : 8);
            this.f40673e = feedBackButton;
            CampaignEx campaignEx = this.f40671c;
            if (campaignEx != null && !campaignEx.isDynamicView()) {
                b();
            }
            feedBackButton.setOnClickListener(new f());
        }
    }

    public void a(int i10, int i11, int i12, int i13, int i14, float f10, String str, String str2, float f11, JSONArray jSONArray) {
        if (i10 > -1) {
            this.f40693y = i10;
        }
        if (i11 > -1) {
            this.f40694z = i11;
        }
        if (i12 > -1) {
            this.f40692x = i12;
        }
        if (i13 > -1) {
            this.f40676h = i13;
        }
        if (f11 > -1.0f) {
            this.f40675g = f11;
        }
        if (jSONArray != null) {
            this.f40680l = jSONArray;
        }
        this.f40674f = str;
        this.f40670b = str2;
        this.f40669a = f10;
        this.f40687s = i14;
        b();
    }
}
