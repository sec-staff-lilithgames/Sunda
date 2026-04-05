package f9;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import n8.q;
import n8.u;
import n8.z;
import x8.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class i extends a {
    public static i C;
    public static i D;
    public static i E;
    public static i F;
    public static i G;
    public static i H;
    public static i I;
    public static i J;

    public static i bitmapTransform(z zVar) {
        return (i) new i().transform(zVar);
    }

    public static i centerCropTransform() {
        if (G == null) {
            G = (i) ((i) new i().centerCrop()).autoClone();
        }
        return G;
    }

    public static i centerInsideTransform() {
        if (F == null) {
            F = (i) ((i) new i().centerInside()).autoClone();
        }
        return F;
    }

    public static i circleCropTransform() {
        if (H == null) {
            H = (i) ((i) new i().circleCrop()).autoClone();
        }
        return H;
    }

    public static i decodeTypeOf(Class<?> cls) {
        return (i) new i().decode(cls);
    }

    public static i diskCacheStrategyOf(p8.z zVar) {
        return (i) new i().diskCacheStrategy(zVar);
    }

    public static i downsampleOf(x xVar) {
        return (i) new i().downsample(xVar);
    }

    public static i encodeFormatOf(Bitmap.CompressFormat compressFormat) {
        return (i) new i().encodeFormat(compressFormat);
    }

    public static i encodeQualityOf(int i10) {
        return (i) new i().encodeQuality(i10);
    }

    public static i errorOf(Drawable drawable) {
        return (i) new i().error(drawable);
    }

    public static i fitCenterTransform() {
        if (E == null) {
            E = (i) ((i) new i().fitCenter()).autoClone();
        }
        return E;
    }

    public static i formatOf(n8.b bVar) {
        return (i) new i().format(bVar);
    }

    public static i frameOf(long j10) {
        return (i) new i().frame(j10);
    }

    public static i noAnimation() {
        if (J == null) {
            J = (i) ((i) new i().dontAnimate()).autoClone();
        }
        return J;
    }

    public static i noTransformation() {
        if (I == null) {
            I = (i) ((i) new i().dontTransform()).autoClone();
        }
        return I;
    }

    public static <T> i option(u uVar, T t10) {
        return (i) new i().set(uVar, t10);
    }

    public static i overrideOf(int i10, int i11) {
        return (i) new i().override(i10, i11);
    }

    public static i placeholderOf(Drawable drawable) {
        return (i) new i().placeholder(drawable);
    }

    public static i priorityOf(com.bumptech.glide.l lVar) {
        return (i) new i().priority(lVar);
    }

    public static i signatureOf(q qVar) {
        return (i) new i().signature(qVar);
    }

    public static i sizeMultiplierOf(float f10) {
        return (i) new i().sizeMultiplier(f10);
    }

    public static i skipMemoryCacheOf(boolean z10) {
        if (z10) {
            if (C == null) {
                C = (i) ((i) new i().skipMemoryCache(true)).autoClone();
            }
            return C;
        }
        if (D == null) {
            D = (i) ((i) new i().skipMemoryCache(false)).autoClone();
        }
        return D;
    }

    public static i timeoutOf(int i10) {
        return (i) new i().timeout(i10);
    }

    @Override // f9.a
    public boolean equals(Object obj) {
        return (obj instanceof i) && super.equals(obj);
    }

    @Override // f9.a
    public int hashCode() {
        return super.hashCode();
    }

    public static i errorOf(int i10) {
        return (i) new i().error(i10);
    }

    public static i overrideOf(int i10) {
        return overrideOf(i10, i10);
    }

    public static i placeholderOf(int i10) {
        return (i) new i().placeholder(i10);
    }
}
