package t8;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f86575a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86576b;

    /* renamed from: c, reason: collision with root package name */
    public Bitmap.Config f86577c;

    /* renamed from: d, reason: collision with root package name */
    public int f86578d;

    public e(int i10) {
        this(i10, i10);
    }

    public e setConfig(Bitmap.Config config) {
        this.f86577c = config;
        return this;
    }

    public e setWeight(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("Weight must be > 0");
        }
        this.f86578d = i10;
        return this;
    }

    public e(int i10, int i11) {
        this.f86578d = 1;
        if (i10 <= 0) {
            throw new IllegalArgumentException("Width must be > 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("Height must be > 0");
        }
        this.f86575a = i10;
        this.f86576b = i11;
    }
}
