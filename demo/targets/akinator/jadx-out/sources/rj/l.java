package rj;

import android.graphics.Bitmap;
import android.text.TextUtils;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final String f84473a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap f84474b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f84475a;

        /* renamed from: b, reason: collision with root package name */
        public Bitmap f84476b;

        public l build() {
            if (TextUtils.isEmpty(this.f84475a)) {
                throw new IllegalArgumentException("ImageData model must have an imageUrl");
            }
            return new l(this.f84475a, this.f84476b);
        }

        public a setBitmapData(Bitmap bitmap) {
            this.f84476b = bitmap;
            return this;
        }

        public a setImageUrl(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f84475a = str;
            }
            return this;
        }
    }

    public l(String str, Bitmap bitmap) {
        this.f84473a = str;
        this.f84474b = bitmap;
    }

    public static a builder() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return hashCode() == lVar.hashCode() && this.f84473a.equals(lVar.f84473a);
    }

    public Bitmap getBitmapData() {
        return this.f84474b;
    }

    public String getImageUrl() {
        return this.f84473a;
    }

    public int hashCode() {
        Bitmap bitmap = this.f84474b;
        return this.f84473a.hashCode() + (bitmap != null ? bitmap.hashCode() : 0);
    }
}
