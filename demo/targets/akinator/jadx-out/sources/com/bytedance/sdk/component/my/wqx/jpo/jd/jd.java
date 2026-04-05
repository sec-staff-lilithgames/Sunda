package com.bytedance.sdk.component.my.wqx.jpo.jd;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.my.sq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd implements sq {

    /* renamed from: jd, reason: collision with root package name */
    private int f18903jd;
    private int jpo;
    private com.bytedance.sdk.component.my.wqx.jpo.wqx<String, Bitmap> wqx;

    public jd(int i10, int i11) {
        this.f18903jd = i10;
        this.jpo = i11;
        this.wqx = new com.bytedance.sdk.component.my.wqx.jpo.wqx<String, Bitmap>(i10) { // from class: com.bytedance.sdk.component.my.wqx.jpo.jd.jd.1
            @Override // com.bytedance.sdk.component.my.wqx.jpo.wqx
            /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
            public int jd(String str, Bitmap bitmap) {
                if (bitmap == null) {
                    return 0;
                }
                return jd.jpo(bitmap);
            }
        };
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jd(String str) {
        return this.wqx.jpo((com.bytedance.sdk.component.my.wqx.jpo.wqx<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jpo(String str, Bitmap bitmap) {
        if (str == null || bitmap == null) {
            return false;
        }
        this.wqx.jpo(str, bitmap);
        return true;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public Bitmap jpo(String str) {
        return this.wqx.jpo((com.bytedance.sdk.component.my.wqx.jpo.wqx<String, Bitmap>) str);
    }

    public static int jpo(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
