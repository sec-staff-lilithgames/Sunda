package com.bytedance.sdk.openadsdk.opi.jpo;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bytedance.sdk.component.utils.cm;
import com.bytedance.sdk.component.utils.nmd;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jd {

    /* renamed from: cm, reason: collision with root package name */
    private Bitmap f21415cm;

    /* renamed from: jd, reason: collision with root package name */
    private Drawable f21416jd;
    int jpo;
    private Bitmap my;
    private byte[] wqx;

    public jd(Drawable drawable, int i10) {
        this.wqx = null;
        this.f21415cm = null;
        this.my = null;
        this.f21416jd = drawable;
        this.jpo = i10;
    }

    public Drawable cm() {
        return this.f21416jd;
    }

    public Bitmap jd() {
        return this.my;
    }

    public Bitmap jpo() {
        return this.f21415cm;
    }

    public boolean my() {
        if (this.f21415cm != null || this.f21416jd != null) {
            return true;
        }
        byte[] bArr = this.wqx;
        return bArr != null && bArr.length > 0;
    }

    public byte[] wqx() {
        try {
            if (this.wqx == null) {
                this.wqx = cm.jpo(this.f21415cm);
            }
        } catch (OutOfMemoryError e10) {
            nmd.wqx("GifRequestResult", e10.getMessage());
        }
        return this.wqx;
    }

    public jd(byte[] bArr, int i10) {
        this.f21416jd = null;
        this.f21415cm = null;
        this.my = null;
        this.wqx = bArr;
        this.jpo = i10;
    }

    public jd(Bitmap bitmap, Bitmap bitmap2, int i10) {
        this.f21416jd = null;
        this.wqx = null;
        this.my = bitmap2;
        this.f21415cm = bitmap;
        this.jpo = i10;
    }
}
