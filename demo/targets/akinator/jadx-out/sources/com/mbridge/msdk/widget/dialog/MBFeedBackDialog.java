package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.ktor.util.cio.ByteBufferPoolKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBFeedBackDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private Button f45431a;

    /* renamed from: b, reason: collision with root package name */
    private Button f45432b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f45433c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f45434d;

    /* renamed from: e, reason: collision with root package name */
    private Button f45435e;

    /* renamed from: f, reason: collision with root package name */
    private TextView f45436f;

    /* renamed from: g, reason: collision with root package name */
    private int f45437g;

    /* renamed from: h, reason: collision with root package name */
    private int f45438h;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.f45434d != null) {
                MBFeedBackDialog.this.f45434d.b();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MBFeedBackDialog.this.f45434d != null) {
                MBFeedBackDialog.this.f45434d.a();
            }
            MBFeedBackDialog.this.dismiss();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MBFeedBackDialog.this.dismiss();
            if (MBFeedBackDialog.this.f45434d != null) {
                MBFeedBackDialog.this.f45434d.c();
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class d implements DialogInterface.OnCancelListener {
        public d() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface dialogInterface) {
            if (MBFeedBackDialog.this.f45434d != null) {
                MBFeedBackDialog.this.f45434d.a();
            }
        }
    }

    public MBFeedBackDialog(Context context, com.mbridge.msdk.widget.dialog.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(h0.a(context, "mbridge_cm_feedbackview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        setDialogWidthAndHeight(0.5f, 0.8f);
        this.f45434d = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f45436f = (TextView) viewInflate.findViewById(h0.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e10) {
                p0.a("MBAlertDialog", e10.getMessage());
            }
            try {
                this.f45433c = (LinearLayout) viewInflate.findViewById(h0.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f45432b = (Button) viewInflate.findViewById(h0.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f45431a = (Button) viewInflate.findViewById(h0.a(context, "mbridge_video_common_alertview_cancel_button", "id"));
                this.f45435e = (Button) viewInflate.findViewById(h0.a(context, "mbridge_video_common_alertview_private_action_button", "id"));
            } catch (Exception e11) {
                p0.a("MBAlertDialog", e11.getMessage());
            }
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
        a();
    }

    public static boolean isScreenOrientationPortrait(Context context) {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public void clear() {
        if (this.f45434d != null) {
            this.f45434d = null;
        }
    }

    public com.mbridge.msdk.widget.dialog.b getListener() {
        return this.f45434d;
    }

    public void hideNavigationBar(Window window) {
        if (window != null) {
            window.setFlags(1024, 1024);
            window.addFlags(67108864);
            window.getDecorView().setSystemUiVisibility(ByteBufferPoolKt.DEFAULT_BUFFER_SIZE);
            e1.a(window);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    public void setCancelButtonClickable(boolean z10) {
        Button button = this.f45431a;
        if (button != null) {
            button.setClickable(z10);
            if (z10) {
                this.f45431a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
                this.f45431a.setAlpha(1.0f);
            } else {
                this.f45431a.setBackgroundResource(getContext().getResources().getIdentifier("mbridge_cm_feedback_choice_btn_bg_pressed", "drawable", com.mbridge.msdk.foundation.controller.c.m().h()));
                this.f45431a.setAlpha(0.4f);
            }
        }
    }

    public void setCancelText(String str) {
        Button button = this.f45431a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setContent(ViewGroup viewGroup) {
        LinearLayout linearLayout = this.f45433c;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(viewGroup);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.leftMargin = com.google.android.gms.internal.play_billing.a.a(16.0f);
            layoutParams.rightMargin = com.google.android.gms.internal.play_billing.a.a(16.0f);
            layoutParams.topMargin = com.google.android.gms.internal.play_billing.a.a(3.0f);
            layoutParams.bottomMargin = com.google.android.gms.internal.play_billing.a.a(3.0f);
            this.f45433c.addView(viewGroup, layoutParams);
        }
    }

    public void setDialogWidthAndHeight(float f10, float f11) {
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        if (!isScreenOrientationPortrait(getContext())) {
            this.f45438h = displayMetrics.heightPixels;
            this.f45437g = displayMetrics.widthPixels;
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = (int) (this.f45437g * f10);
            attributes.height = -1;
            attributes.gravity = 17;
            getWindow().setAttributes(attributes);
            return;
        }
        this.f45438h = displayMetrics.widthPixels;
        this.f45437g = displayMetrics.heightPixels;
        WindowManager.LayoutParams attributes2 = getWindow().getAttributes();
        attributes2.width = -1;
        attributes2.height = (int) (this.f45437g * f11);
        attributes2.gravity = 80;
        getWindow().setAttributes(attributes2);
    }

    public void setListener(com.mbridge.msdk.widget.dialog.b bVar) {
        this.f45434d = bVar;
    }

    public void setPrivacyText(String str) {
        Button button = this.f45435e;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f45436f;
        if (textView != null) {
            textView.setText(str);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        super.show();
        try {
            getWindow().setFlags(8, 8);
            super.show();
            hideNavigationBar(getWindow());
            getWindow().clearFlags(8);
        } catch (Exception e10) {
            p0.b("MBAlertDialog", e10.getMessage());
            super.show();
        }
    }

    private void a() {
        Button button = this.f45431a;
        if (button != null) {
            button.setOnClickListener(new a());
        }
        Button button2 = this.f45432b;
        if (button2 != null) {
            button2.setOnClickListener(new b());
        }
        Button button3 = this.f45435e;
        if (button3 != null) {
            button3.setOnClickListener(new c());
        }
        setOnCancelListener(new d());
    }

    public void setConfirmText(String str) {
    }
}
