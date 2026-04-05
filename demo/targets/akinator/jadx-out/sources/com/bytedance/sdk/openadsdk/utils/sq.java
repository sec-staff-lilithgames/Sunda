package com.bytedance.sdk.openadsdk.utils;

import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bytedance.sdk.openadsdk.opi.jpo.jpo;
import java.util.Objects;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class sq {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface jpo {
        void jpo();

        void jpo(com.bytedance.sdk.openadsdk.opi.jpo.jd jdVar);
    }

    public static void jpo(com.bytedance.sdk.openadsdk.opi.jpo jpoVar, int i10, int i11, jpo jpoVar2, String str) {
        jpo(jpoVar, i10, i11, jpoVar2, str, 0);
    }

    public static void jpo(com.bytedance.sdk.openadsdk.opi.jpo jpoVar, int i10, int i11, final jpo jpoVar2, String str, int i12) {
        Objects.toString(jpoVar);
        com.bytedance.sdk.openadsdk.opi.jd.jd().cm().jpo(jpoVar, new jpo.InterfaceC0151jpo() { // from class: com.bytedance.sdk.openadsdk.utils.sq.1
            @Override // com.bytedance.sdk.openadsdk.opi.jpo.jpo.InterfaceC0151jpo
            public void jpo(String str2, com.bytedance.sdk.openadsdk.opi.jpo.jd jdVar) {
                jpo jpoVar3;
                if (jdVar.my() && (jpoVar3 = jpoVar2) != null) {
                    jpoVar3.jpo(jdVar);
                    return;
                }
                jpo jpoVar4 = jpoVar2;
                if (jpoVar4 != null) {
                    jpoVar4.jpo();
                }
            }

            @Override // com.bytedance.sdk.openadsdk.opi.jpo.jpo.InterfaceC0151jpo
            public void jpo(int i13, String str2, Throwable th2) {
                jpo jpoVar3 = jpoVar2;
                if (jpoVar3 != null) {
                    jpoVar3.jpo();
                }
            }
        }, i10, i11, ImageView.ScaleType.CENTER_INSIDE, str, i12, null);
    }

    public static Drawable jpo(byte[] bArr, int i10) {
        if (bArr != null && bArr.length > 0) {
            try {
                return new BitmapDrawable(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
            } catch (Throwable unused) {
                return new ColorDrawable(0);
            }
        }
        return new ColorDrawable(0);
    }
}
