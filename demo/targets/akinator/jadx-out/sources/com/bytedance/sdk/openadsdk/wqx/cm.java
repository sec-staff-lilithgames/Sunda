package com.bytedance.sdk.openadsdk.wqx;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.bytedance.sdk.component.utils.dt;
import com.bytedance.sdk.openadsdk.FilterWord;
import com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract;
import com.bytedance.sdk.openadsdk.utils.va;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm extends TTDislikeDialogAbstract {

    /* renamed from: cm, reason: collision with root package name */
    private jpo f21629cm;
    private String my;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jd();

        void jpo();

        void jpo(int i10, FilterWord filterWord);
    }

    public cm(Context context, String str, List<FilterWord> list) {
        super(context, dt.jj(context, "tt_dislikeDialog"));
        this.jpo = str;
        this.f19146jd = list;
    }

    private void jd() {
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.bytedance.sdk.openadsdk.wqx.cm.1
            @Override // android.content.DialogInterface.OnShowListener
            public void onShow(DialogInterface dialogInterface) {
                if (cm.this.f21629cm != null) {
                    jpo unused = cm.this.f21629cm;
                }
            }
        });
        setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.bytedance.sdk.openadsdk.wqx.cm.2
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(DialogInterface dialogInterface) {
                if (cm.this.f21629cm != null) {
                    cm.this.f21629cm.jd();
                }
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public ViewGroup.LayoutParams getLayoutParams() {
        return new ViewGroup.LayoutParams(va.wqx(getContext()) - 120, -2);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract
    public View getLayoutView() {
        return new zz(getContext(), this.wqx, this.f19146jd);
    }

    @Override // com.bytedance.sdk.openadsdk.TTDislikeDialogAbstract, android.app.Dialog
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            setCanceledOnTouchOutside(true);
            setCancelable(true);
            jpo();
            jd();
            setMaterialMeta(this.jpo, this.f19146jd);
        } catch (Throwable unused) {
            dismiss();
        }
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    public void jpo(jpo jpoVar) {
        this.f21629cm = jpoVar;
    }

    public void jpo(String str) {
        this.my = str;
    }

    @Override // com.bytedance.sdk.openadsdk.wqx.yd.jd
    public void jpo(int i10) {
        FilterWord filterWordJd;
        if (yd.wqx == i10) {
            dismiss();
            return;
        }
        if (yd.my == i10) {
            jpo jpoVar = this.f21629cm;
            if (jpoVar != null) {
                jpoVar.jpo();
                return;
            }
            return;
        }
        if (yd.f21646jd != i10 || (filterWordJd = this.wqx.jd()) == null || yd.jpo.equals(filterWordJd)) {
            return;
        }
        jpo jpoVar2 = this.f21629cm;
        if (jpoVar2 != null) {
            try {
                jpoVar2.jpo(0, filterWordJd);
            } catch (Throwable unused) {
            }
        }
        dismiss();
    }

    private void jpo() {
        Window window = getWindow();
        if (window == null || window.getAttributes() == null) {
            return;
        }
        window.getAttributes().windowAnimations = 0;
    }
}
