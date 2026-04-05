package com.bytedance.sdk.openadsdk.component.reward.view;

import android.graphics.Color;
import android.widget.FrameLayout;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.hna;
import com.bytedance.sdk.openadsdk.utils.va;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class ju extends Cif {
    public ju(com.bytedance.sdk.openadsdk.component.reward.jpo.jpo jpoVar) {
        super(jpoVar);
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.Cif
    public boolean jpo() {
        return false;
    }

    @Override // com.bytedance.sdk.openadsdk.component.reward.view.Cif
    public void jpo(int i10, int i11) {
        super.jpo(i10, i11);
        if (dt.my(this.f20021cm) && this.f20021cm.kb() == 3 && this.f20021cm.wu() == 0) {
            try {
                FrameLayout frameLayout = (FrameLayout) this.wqx.f19930va.findViewById(hna.f21562yd);
                frameLayout.setBackgroundColor(Color.parseColor("#000000"));
                if (this.f20021cm.ll() == 1) {
                    int iJd = va.jd(sq.jpo(), 90.0f);
                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) frameLayout.getLayoutParams();
                    layoutParams.bottomMargin = iJd;
                    frameLayout.setLayoutParams(layoutParams);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
