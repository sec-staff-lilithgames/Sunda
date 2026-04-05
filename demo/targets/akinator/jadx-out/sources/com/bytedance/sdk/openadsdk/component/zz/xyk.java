package com.bytedance.sdk.openadsdk.component.zz;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.widget.sq;
import com.bytedance.sdk.openadsdk.core.zz;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class xyk {

    /* renamed from: jd, reason: collision with root package name */
    private static Drawable f20122jd;
    private static boolean jpo;

    /* renamed from: cm, reason: collision with root package name */
    private TextView f20123cm;
    private sq wqx;

    public static Drawable wqx() {
        return f20122jd;
    }

    public void jd() {
        if (jpo) {
            return;
        }
        try {
            int iZz = zz.jd().zz();
            if (iZz != 0) {
                f20122jd = com.bytedance.sdk.openadsdk.core.sq.jpo().getResources().getDrawable(iZz);
            }
            jpo = true;
        } catch (Throwable unused) {
            jpo = true;
        }
    }

    public void jpo(wqx wqxVar, dt dtVar, float f10, float f11, boolean z10) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (wqxVar != null) {
            this.wqx = wqxVar.getHostAppIcon();
            this.f20123cm = wqxVar.getHostAppName();
            View userInfo = wqxVar.getUserInfo();
            if (wqxVar instanceof cm) {
                sq sqVar = this.wqx;
                if (sqVar != null && (layoutParams2 = sqVar.getLayoutParams()) != null) {
                    if (dtVar.ll() == 1) {
                        int iJd = va.jd(this.wqx.getContext(), 40.0f);
                        layoutParams2.width = iJd;
                        layoutParams2.height = iJd;
                    } else {
                        int iJd2 = va.jd(this.wqx.getContext(), 30.0f);
                        layoutParams2.width = iJd2;
                        layoutParams2.height = iJd2;
                    }
                    this.wqx.setLayoutParams(layoutParams2);
                }
                if (this.f20123cm != null) {
                    if (dtVar.ll() == 1) {
                        this.f20123cm.setTextSize(30.0f);
                    } else {
                        this.f20123cm.setTextSize(24.0f);
                    }
                }
                if (userInfo != null && (layoutParams = userInfo.getLayoutParams()) != null) {
                    if (dtVar.ll() == 1) {
                        layoutParams.height = va.jd(userInfo.getContext(), 107.0f);
                    } else {
                        layoutParams.height = va.jd(userInfo.getContext(), 60.0f);
                    }
                    userInfo.setLayoutParams(layoutParams);
                }
            }
            if (userInfo != null) {
                userInfo.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.component.zz.xyk.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                    }
                });
            }
        }
    }

    public void jpo() {
        String strXyk = zz.jd().xyk();
        if (TextUtils.isEmpty(strXyk)) {
            this.f20123cm.setVisibility(8);
        } else {
            this.f20123cm.setText(strXyk);
        }
        jd();
        try {
            Drawable drawable = f20122jd;
            if (drawable == null) {
                this.wqx.setVisibility(8);
                return;
            }
            this.wqx.setImageDrawable(drawable);
            if (this.f20123cm.getVisibility() == 8) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.wqx.getLayoutParams();
                marginLayoutParams.setMargins(0, 0, 0, 0);
                this.wqx.setLayoutParams(marginLayoutParams);
            }
        } catch (Throwable unused) {
            this.wqx.setVisibility(8);
        }
    }
}
