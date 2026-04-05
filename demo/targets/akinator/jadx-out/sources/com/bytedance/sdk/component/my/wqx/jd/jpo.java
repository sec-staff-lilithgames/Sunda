package com.bytedance.sdk.component.my.wqx.jd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class jpo {

    /* renamed from: cm, reason: collision with root package name */
    private int f18893cm;

    /* renamed from: jj, reason: collision with root package name */
    private final int f18894jj;
    private int my;

    /* renamed from: qk, reason: collision with root package name */
    private final int f18895qk;
    private final Bitmap.Config wqx;
    private final ImageView.ScaleType xyk;
    public static final ImageView.ScaleType jpo = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: jd, reason: collision with root package name */
    public static final Bitmap.Config f18892jd = Bitmap.Config.ARGB_4444;
    private final int zz = 3840;

    /* renamed from: yd, reason: collision with root package name */
    private final int f18896yd = 104857600;

    public jpo(int i10, int i11, ImageView.ScaleType scaleType, Bitmap.Config config, int i12, int i13) {
        this.wqx = config;
        this.f18893cm = i10;
        this.my = i11;
        this.xyk = scaleType;
        this.f18894jj = i12;
        this.f18895qk = i13;
        jpo(i10, i11);
    }

    public static int jpo(int i10, int i11, int i12, int i13, int i14, int i15) {
        double dMin = Math.min(i10 / i12, i11 / i13);
        if (i14 > 0 && i15 > 0) {
            dMin = Math.max(dMin, Math.min(Math.max(i10, i11) / Math.max(i14, i15), Math.min(i10, i11) / Math.min(i14, i15)));
        }
        float f10 = 1.0f;
        while (true) {
            float f11 = 2.0f * f10;
            if (f11 > dMin) {
                return (int) f10;
            }
            f10 = f11;
        }
    }

    private static int jpo(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        if (i10 != 0 || i11 != 0) {
            if (scaleType != ImageView.ScaleType.FIT_XY) {
                if (i10 == 0) {
                    return (int) (i12 * (i11 / i13));
                }
                if (i11 == 0) {
                    return i10;
                }
                double d10 = i13 / i12;
                if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                    double d11 = i11;
                    return ((double) i10) * d10 < d11 ? (int) (d11 / d10) : i10;
                }
                double d12 = i11;
                return ((double) i10) * d10 > d12 ? (int) (d12 / d10) : i10;
            }
            if (i10 != 0) {
                return i10;
            }
        }
        return i12;
    }

    public Bitmap jpo(byte[] bArr) {
        Bitmap bitmapDecodeByteArray;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f18893cm == 0 && this.my == 0) {
            options.inPreferredConfig = this.wqx;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i10 = options.outWidth;
            int i11 = options.outHeight;
            int iJpo = jpo(this.f18893cm, this.my, i10, i11, this.xyk);
            int iJpo2 = jpo(this.my, this.f18893cm, i11, i10, this.xyk);
            options.inJustDecodeBounds = false;
            options.inSampleSize = jpo(i10, i11, iJpo, iJpo2, this.f18894jj, this.f18895qk);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iJpo || bitmapDecodeByteArray.getHeight() > iJpo2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iJpo, iJpo2, true);
                if (bitmapCreateScaledBitmap != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        if (bitmapDecodeByteArray != null && bitmapDecodeByteArray.getByteCount() > 104857600) {
            int width = bitmapDecodeByteArray.getWidth() / 2;
            int height = bitmapDecodeByteArray.getHeight() / 2;
            if (width > 0 && height > 0) {
                Bitmap bitmapCreateScaledBitmap2 = Bitmap.createScaledBitmap(bitmapDecodeByteArray, width, height, true);
                if (bitmapCreateScaledBitmap2 != bitmapDecodeByteArray) {
                    bitmapDecodeByteArray.recycle();
                }
                return bitmapCreateScaledBitmap2;
            }
        }
        return bitmapDecodeByteArray;
    }

    private void jpo(int i10, int i11) {
        if (i10 > 3840 && i11 > 3840) {
            if (i10 > i11) {
                this.f18893cm = 3840;
                this.my = (i11 * 3840) / i10;
                return;
            } else {
                this.f18893cm = (i10 * 3840) / i11;
                this.my = 3840;
                return;
            }
        }
        if (i10 > 3840) {
            this.f18893cm = 3840;
            this.my = (i11 * 3840) / i10;
        } else if (i11 > 3840) {
            this.f18893cm = (i10 * 3840) / i11;
            this.my = 3840;
        }
    }
}
