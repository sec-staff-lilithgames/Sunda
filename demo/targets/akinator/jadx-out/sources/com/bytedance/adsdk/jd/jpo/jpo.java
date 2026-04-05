package com.bytedance.adsdk.jd.jpo;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.bytedance.adsdk.jd.jj.my;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo extends Paint {
    public jpo() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            super.setAlpha(my.jpo(i10, 0, 255));
        } else {
            setColor((my.jpo(i10, 0, 255) << 24) | (getColor() & 16777215));
        }
    }

    public jpo(int i10) {
        super(i10);
    }

    public jpo(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public jpo(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }
}
