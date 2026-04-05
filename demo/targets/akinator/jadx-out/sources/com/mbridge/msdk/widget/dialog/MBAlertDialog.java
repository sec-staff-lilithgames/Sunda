package com.mbridge.msdk.widget.dialog;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.e1;
import com.mbridge.msdk.foundation.tools.h0;
import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.x0;
import com.mbridge.msdk.playercommon.exoplayer2.drm.szH.SFPXhf;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.h;
import io.ktor.util.cio.ByteBufferPoolKt;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes8.dex */
public class MBAlertDialog extends Dialog {

    /* renamed from: a, reason: collision with root package name */
    private Button f45422a;

    /* renamed from: b, reason: collision with root package name */
    private Button f45423b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f45424c;

    /* renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.widget.dialog.b f45425d;

    /* renamed from: e, reason: collision with root package name */
    private TextView f45426e;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.widget.dialog.b f45427a;

        public a(com.mbridge.msdk.widget.dialog.b bVar) {
            this.f45427a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.widget.dialog.b bVar = this.f45427a;
            if (bVar != null) {
                bVar.b();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public class b implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.widget.dialog.b f45429a;

        public b(com.mbridge.msdk.widget.dialog.b bVar) {
            this.f45429a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.mbridge.msdk.widget.dialog.b bVar = this.f45429a;
            if (bVar != null) {
                bVar.a();
            }
            MBAlertDialog.this.cancel();
            MBAlertDialog.this.clear();
        }
    }

    private void a(int i10) {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle(i10 == com.mbridge.msdk.foundation.same.a.H ? "Confirm" : "Tips");
            setContent(i10 == com.mbridge.msdk.foundation.same.a.H ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?");
            setConfirmText(i10 == com.mbridge.msdk.foundation.same.a.H ? "Close" : "Cancel");
            setCancelText("Continue");
            return;
        }
        setTitle(i10 == com.mbridge.msdk.foundation.same.a.H ? "确认关闭？" : "提示");
        setContent(i10 == com.mbridge.msdk.foundation.same.a.H ? "如果你选择继续，结束后将会获得奖励。确认关闭吗？" : "如果你选择继续，结束后将会获得奖励。是否继续？");
        setConfirmText(i10 == com.mbridge.msdk.foundation.same.a.H ? "确认关闭" : "取消");
        setCancelText("继续");
    }

    private void b() {
        String language = Locale.getDefault().getLanguage();
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            setTitle("Confirm to close? ");
            setContent("You will not be rewarded after closing the window");
            setConfirmText("Close it");
            setCancelText("Continue");
            return;
        }
        setTitle("确认关闭？");
        setContent("关闭后您将不会获得任何奖励噢~ ");
        setConfirmText("确认关闭");
        setCancelText("继续观看");
    }

    public void clear() {
        if (this.f45425d != null) {
            this.f45425d = null;
        }
    }

    public com.mbridge.msdk.widget.dialog.b getListener() {
        return this.f45425d;
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

    public void makeDownloadAlert(String str) {
        com.mbridge.msdk.widget.dialog.a.a(this, str);
    }

    public void makeIVAlertView(int i10, String str) {
        try {
            String string = x0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = x0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = x0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = x0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                a(i10);
            } else {
                a(string, string2, string3, string4);
            }
        } catch (Exception e10) {
            p0.a("MBAlertDialog", e10.getMessage());
        }
    }

    public void makeInsAlert(String str) {
        com.mbridge.msdk.widget.dialog.a.b(this, str);
    }

    public void makePlayableAlertView() {
        g gVarF = com.google.android.gms.internal.play_billing.a.f(h.b());
        if (gVarF != null) {
            a(gVarF.s(), gVarF.q(), gVarF.r(), gVarF.o());
        } else {
            a();
        }
    }

    public void makeRVAlertView(String str) {
        try {
            String string = x0.a(getContext(), "MBridge_ConfirmTitle" + str, "").toString();
            String string2 = x0.a(getContext(), "MBridge_ConfirmContent" + str, "").toString();
            String string3 = x0.a(getContext(), "MBridge_CancelText" + str, "").toString();
            String string4 = x0.a(getContext(), "MBridge_ConfirmText" + str, "").toString();
            g gVarD = h.b().d(c.m().b());
            if (TextUtils.isEmpty(string) && TextUtils.isEmpty(string2) && TextUtils.isEmpty(string3) && TextUtils.isEmpty(string4)) {
                if (gVarD != null) {
                    a(gVarD.s(), gVarD.q(), gVarD.r(), gVarD.p());
                    return;
                } else {
                    b();
                    return;
                }
            }
            String language = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty(string)) {
                if (gVarD != null) {
                    string = gVarD.s();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setTitle("Confirm to close? ");
                } else {
                    setTitle("确认关闭？");
                }
            }
            if (TextUtils.isEmpty(string2)) {
                if (gVarD != null) {
                    string2 = gVarD.q();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setContent("You will not be rewarded after closing the window");
                } else {
                    setContent("关闭后您将不会获得任何奖励噢~ ");
                }
            }
            if (TextUtils.isEmpty(string4)) {
                if (gVarD != null) {
                    string4 = gVarD.r();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setConfirmText("Close it");
                } else {
                    setConfirmText("确认关闭");
                }
            }
            if (TextUtils.isEmpty(string3)) {
                if (gVarD != null) {
                    string3 = gVarD.p();
                } else if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                    setCancelText("Continue");
                } else {
                    setCancelText("继续观看");
                }
            }
            a(string, string2, string4, string3);
        } catch (Exception e10) {
            p0.a("MBAlertDialog", e10.getMessage());
        }
    }

    public void onlyShow() {
        super.show();
    }

    public void setCancelText(String str) {
        Button button = this.f45422a;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setConfirmText(String str) {
        Button button = this.f45423b;
        if (button != null) {
            button.setText(str);
        }
    }

    public void setContent(String str) {
        TextView textView = this.f45424c;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void setTitle(String str) {
        TextView textView = this.f45426e;
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

    public MBAlertDialog(Context context, com.mbridge.msdk.widget.dialog.b bVar) {
        super(context);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        requestWindowFeature(1);
        View viewInflate = LayoutInflater.from(context).inflate(h0.a(context, "mbridge_cm_alertview", TtmlNode.TAG_LAYOUT), (ViewGroup) null);
        this.f45425d = bVar;
        if (viewInflate != null) {
            setContentView(viewInflate);
            try {
                this.f45426e = (TextView) viewInflate.findViewById(h0.a(context, "mbridge_video_common_alertview_titleview", "id"));
            } catch (Exception e10) {
                p0.a("MBAlertDialog", e10.getMessage());
            }
            try {
                this.f45424c = (TextView) viewInflate.findViewById(h0.a(context, "mbridge_video_common_alertview_contentview", "id"));
                this.f45423b = (Button) viewInflate.findViewById(h0.a(context, "mbridge_video_common_alertview_confirm_button", "id"));
                this.f45422a = (Button) viewInflate.findViewById(h0.a(context, SFPXhf.SGFFSocwsemvu, "id"));
            } catch (Exception e11) {
                p0.a("MBAlertDialog", e11.getMessage());
            }
        }
        Button button = this.f45422a;
        if (button != null) {
            button.setOnClickListener(new a(bVar));
        }
        Button button2 = this.f45423b;
        if (button2 != null) {
            button2.setOnClickListener(new b(bVar));
        }
        setCanceledOnTouchOutside(false);
        setCancelable(false);
    }

    private void a(String str, String str2, String str3, String str4) {
        setTitle(str);
        setContent(str2);
        setConfirmText(str3);
        setCancelText(str4);
    }

    private void a() {
        String language = Locale.getDefault().getLanguage();
        if (!TextUtils.isEmpty(language) && language.equals("zh")) {
            setTitle("确认关闭？");
            setContent("关闭后您将不会获得任何奖励噢~ ");
            setConfirmText("确认关闭");
            setCancelText("继续试玩");
            return;
        }
        setTitle("Confirm to close? ");
        setContent("You will not be rewarded after closing the window");
        setConfirmText("Close it");
        setCancelText("Continue");
    }
}
