package r7;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f83884a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83885b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83886c;

    /* renamed from: d, reason: collision with root package name */
    public final String f83887d;

    /* renamed from: e, reason: collision with root package name */
    public final String f83888e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f83889f;

    public d0(int i10, int i11, String str, String str2, String str3) {
        this.f83884a = i10;
        this.f83885b = i11;
        this.f83886c = str;
        this.f83887d = str2;
        this.f83888e = str3;
    }

    public d0 copyWithScale(float f10) {
        d0 d0Var = new d0((int) (this.f83884a * f10), (int) (this.f83885b * f10), this.f83886c, this.f83887d, this.f83888e);
        Bitmap bitmap = this.f83889f;
        if (bitmap != null) {
            d0Var.setBitmap(Bitmap.createScaledBitmap(bitmap, d0Var.f83884a, d0Var.f83885b, true));
        }
        return d0Var;
    }

    public Bitmap getBitmap() {
        return this.f83889f;
    }

    public String getDirName() {
        return this.f83888e;
    }

    public String getFileName() {
        return this.f83887d;
    }

    public int getHeight() {
        return this.f83885b;
    }

    public String getId() {
        return this.f83886c;
    }

    public int getWidth() {
        return this.f83884a;
    }

    public boolean hasBitmap() {
        if (this.f83889f != null) {
            return true;
        }
        String str = this.f83887d;
        return str.startsWith("data:") && str.indexOf("base64,") > 0;
    }

    public void setBitmap(Bitmap bitmap) {
        this.f83889f = bitmap;
    }
}
