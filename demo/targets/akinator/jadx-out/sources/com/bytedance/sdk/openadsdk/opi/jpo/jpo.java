package com.bytedance.sdk.openadsdk.opi.jpo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.widget.ImageView;
import com.bytedance.sdk.component.my.hna;
import com.bytedance.sdk.component.my.ju;
import com.bytedance.sdk.component.my.xyk;
import com.bytedance.sdk.component.my.yd;
import com.bytedance.sdk.openadsdk.core.model.dt;
import com.bytedance.sdk.openadsdk.core.sq;
import com.bytedance.sdk.openadsdk.utils.va;
import com.bytedance.sdk.openadsdk.zz.cm;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.openadsdk.opi.jpo.jpo$jpo, reason: collision with other inner class name */
    public interface InterfaceC0151jpo {
        void jpo(int i10, String str, Throwable th2);

        void jpo(String str, jd jdVar);
    }

    public void jpo(com.bytedance.sdk.openadsdk.opi.jpo jpoVar, final InterfaceC0151jpo interfaceC0151jpo, int i10, int i11, ImageView.ScaleType scaleType, String str, final int i12, dt dtVar) {
        yd ydVarJpo = cm.jpo(jpoVar.jpo).jpo(jpoVar.f21414jd).jpo(i10).jd(i11).my(va.my(sq.jpo())).cm(va.wqx(sq.jpo())).jd(str).jpo(scaleType).jpo(!TextUtils.isEmpty(str));
        if (i12 <= 0 || Build.VERSION.SDK_INT < 26) {
            ydVarJpo.wqx(1);
        } else {
            ydVarJpo.wqx(2).jpo(new xyk() { // from class: com.bytedance.sdk.openadsdk.opi.jpo.jpo.1
                @Override // com.bytedance.sdk.component.my.xyk
                public Bitmap jpo(Bitmap bitmap) {
                    return com.bytedance.sdk.component.adexpress.cm.jpo.jpo(sq.jpo(), bitmap, i12);
                }
            });
        }
        ydVarJpo.jpo(new com.bytedance.sdk.openadsdk.zz.jd(dtVar, jpoVar.jpo, new hna() { // from class: com.bytedance.sdk.openadsdk.opi.jpo.jpo.2
            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(ju juVar) {
                jpo.this.jpo(juVar, interfaceC0151jpo);
            }

            @Override // com.bytedance.sdk.component.my.hna
            public void jpo(int i13, String str2, Throwable th2) {
                jpo.this.jpo(i13, str2, th2, interfaceC0151jpo);
            }
        }));
    }

    public void jpo(ju juVar, InterfaceC0151jpo interfaceC0151jpo) {
        if (interfaceC0151jpo != null) {
            Object objJd = juVar.jd();
            int iJpo = jpo(juVar);
            if (objJd instanceof Drawable) {
                interfaceC0151jpo.jpo(juVar.jpo(), new jd((Drawable) objJd, iJpo));
                return;
            }
            if (objJd instanceof byte[]) {
                interfaceC0151jpo.jpo(juVar.jpo(), new jd((byte[]) objJd, iJpo));
                return;
            }
            if (objJd instanceof Bitmap) {
                interfaceC0151jpo.jpo(juVar.jpo(), new jd((Bitmap) objJd, juVar.wqx() instanceof Bitmap ? (Bitmap) juVar.wqx() : null, iJpo));
            } else {
                interfaceC0151jpo.jpo(0, "not bitmap or gif result!", null);
            }
        }
    }

    private int jpo(ju juVar) {
        Object obj;
        Map<String, String> mapCm = juVar.cm();
        if (mapCm == null || (obj = mapCm.get(CampaignEx.JSON_KEY_IMAGE_SIZE)) == null || !(obj instanceof Integer)) {
            return 0;
        }
        return ((Integer) obj).intValue();
    }

    public void jpo(int i10, String str, Throwable th2, InterfaceC0151jpo interfaceC0151jpo) {
        if (interfaceC0151jpo != null) {
            interfaceC0151jpo.jpo(i10, str, th2);
        }
    }
}
