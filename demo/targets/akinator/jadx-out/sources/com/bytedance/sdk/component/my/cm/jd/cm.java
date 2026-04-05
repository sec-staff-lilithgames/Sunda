package com.bytedance.sdk.component.my.cm.jd;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.my.cm.wqx.jd.jpo;
import com.bytedance.sdk.component.my.jr;
import com.bytedance.sdk.component.utils.ju;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class cm<T> implements jj {
    private void jd(final com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, final byte[] bArr, final com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        try {
            new com.bytedance.sdk.component.my.cm.wqx.jd.jpo().jpo(bArr, wqxVar.sq(), new jpo.InterfaceC0087jpo() { // from class: com.bytedance.sdk.component.my.cm.jd.cm.2
                @Override // com.bytedance.sdk.component.my.cm.wqx.jd.jpo.InterfaceC0087jpo
                public void jpo(Drawable drawable) {
                    jpoVar.jpo(new com.bytedance.sdk.component.my.cm.wqx.cm().jpo(wqxVar, drawable, null, true));
                }

                @Override // com.bytedance.sdk.component.my.cm.wqx.jd.jpo.InterfaceC0087jpo
                public void jpo() {
                    jpoVar.jpo(1002, "decode gif fail", new Exception("decode gif fail"));
                }

                @Override // com.bytedance.sdk.component.my.cm.wqx.jd.jpo.InterfaceC0087jpo
                public void jpo(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.jj.jpo(bArr)) {
                        cm.this.jpo(wqxVar, bArr, true, jpoVar);
                    } else {
                        jpoVar.jpo(1001, "result type is gif but data not image", new Exception("gif not image format"));
                    }
                }
            });
        } catch (Throwable th2) {
            jpoVar.jpo(2000, "decode gif error", th2);
        }
    }

    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public boolean jpo(com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, jr jrVar, com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        byte[] bArrOya = wqxVar.oya();
        if (bArrOya == null) {
            jpoVar.jpo(2000, "imageData is empty", new Exception("imageData is empty"));
            return false;
        }
        int iM418if = wqxVar.m418if();
        wqxVar.jpo(bArrOya.length);
        if (iM418if == 2) {
            boolean z10 = (com.bytedance.sdk.component.utils.jj.jd(bArrOya) || ju.jpo(bArrOya, 0)) ? false : true;
            if (com.bytedance.sdk.component.utils.jj.jpo(bArrOya)) {
                jpo(wqxVar, bArrOya, z10, jpoVar);
            } else {
                jpoVar.jpo(1001, "result type is bit but data not image", new Exception("not image format"));
            }
        } else if (iM418if == 3) {
            jpoVar.jpo(new com.bytedance.sdk.component.my.cm.wqx.cm().jpo(wqxVar, bArrOya, null, com.bytedance.sdk.component.utils.jj.jd(bArrOya)));
        } else if (com.bytedance.sdk.component.utils.jj.jd(bArrOya)) {
            jd(wqxVar, bArrOya, jpoVar);
        } else if (ju.jpo(bArrOya, 0)) {
            jpo(wqxVar, bArrOya, jpoVar);
        } else if (com.bytedance.sdk.component.utils.jj.jpo(bArrOya)) {
            jpo(wqxVar, bArrOya, true, jpoVar);
        } else {
            jpoVar.jpo(1001, "is not supprot image type", new Exception("not supprot image type"));
        }
        return false;
    }

    private void jpo(final com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, final byte[] bArr, final com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        try {
            new com.bytedance.sdk.component.my.cm.wqx.jd.jpo().jpo(bArr, new jpo.InterfaceC0087jpo() { // from class: com.bytedance.sdk.component.my.cm.jd.cm.1
                @Override // com.bytedance.sdk.component.my.cm.wqx.jd.jpo.InterfaceC0087jpo
                public void jpo(Drawable drawable) {
                    jpoVar.jpo(new com.bytedance.sdk.component.my.cm.wqx.cm().jpo(wqxVar, drawable, null, false));
                }

                @Override // com.bytedance.sdk.component.my.cm.wqx.jd.jpo.InterfaceC0087jpo
                public void jpo() {
                    jpoVar.jpo(1002, "decode webp animate fail", new Exception("decode webp animate fail"));
                }

                @Override // com.bytedance.sdk.component.my.cm.wqx.jd.jpo.InterfaceC0087jpo
                public void jpo(byte[] bArr2) {
                    if (com.bytedance.sdk.component.utils.jj.jpo(bArr)) {
                        cm.this.jpo(wqxVar, bArr, true, jpoVar);
                    } else {
                        jpoVar.jpo(1001, "result type is webp animated but data not image", new Exception("webp animated not image format"));
                    }
                }
            });
        } catch (Throwable th2) {
            jpoVar.jpo(2000, "decode webp animation error", th2);
        }
    }

    @Override // com.bytedance.sdk.component.my.cm.jd.jj
    public String jpo() {
        return "decode";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jpo(com.bytedance.sdk.component.my.cm.wqx.wqx wqxVar, byte[] bArr, boolean z10, com.bytedance.sdk.component.my.cm.wqx.jpo jpoVar) {
        try {
            com.bytedance.sdk.component.my.cm.wqx.jj jjVarSq = wqxVar.sq();
            Bitmap bitmapJpo = jjVarSq.jpo(wqxVar).jpo(bArr);
            if (bitmapJpo != null) {
                wqxVar.yd();
                wqxVar.jpo();
                bitmapJpo.getWidth();
                bitmapJpo.getHeight();
                bitmapJpo.getByteCount();
                jpoVar.jpo(new com.bytedance.sdk.component.my.cm.wqx.cm().jpo(wqxVar, bitmapJpo, null, false));
                if (z10) {
                    jpo(wqxVar.opi(), jjVarSq, wqxVar.yd(), bitmapJpo);
                    return;
                }
                return;
            }
            wqxVar.yd();
            wqxVar.jpo();
            jpoVar.jpo(1002, "decode failed bitmap null", new Exception("decode failed bitmap null"));
        } catch (Throwable th2) {
            wqxVar.yd();
            wqxVar.jpo();
            jpoVar.jpo(1002, "decode failed:" + th2.getMessage(), th2);
        }
    }

    private void jpo(com.bytedance.sdk.component.my.jd jdVar, com.bytedance.sdk.component.my.cm.wqx.jj jjVar, String str, Bitmap bitmap) {
        if (jdVar == null || jjVar == null || !jdVar.my()) {
            return;
        }
        jjVar.jpo(jdVar).jpo(str, bitmap);
    }
}
