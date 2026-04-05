package com.bytedance.sdk.component.my.cm.wqx.jpo.jd;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.my.sq;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo implements sq {

    /* renamed from: cm, reason: collision with root package name */
    private com.bytedance.sdk.component.my.cm.wqx.jpo.wqx<String, Bitmap> f18823cm;

    /* renamed from: jd, reason: collision with root package name */
    private int f18824jd;
    private long jpo = 4194304;
    private int wqx;

    public jpo(int i10, int i11) {
        this.f18824jd = i11;
        this.wqx = i10;
        this.f18823cm = new com.bytedance.sdk.component.my.cm.wqx.jpo.wqx<>(i11);
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jd(String str) {
        return this.f18823cm.jpo((com.bytedance.sdk.component.my.cm.wqx.jpo.wqx<String, Bitmap>) str) != null;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public boolean jpo(String str, Bitmap bitmap) {
        if (str != null && bitmap != null) {
            try {
                int iJpo = jpo(bitmap);
                if (iJpo <= this.jpo && iJpo != 0) {
                    this.f18823cm.jpo(str, bitmap);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.my.jpo
    public Bitmap jpo(String str) {
        try {
            return this.f18823cm.jpo((com.bytedance.sdk.component.my.cm.wqx.jpo.wqx<String, Bitmap>) str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static int jpo(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        return bitmap.getAllocationByteCount();
    }
}
