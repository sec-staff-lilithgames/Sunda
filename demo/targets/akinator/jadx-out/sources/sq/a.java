package sq;

import android.graphics.Bitmap;
import android.graphics.Color;
import br.u;
import dq.d0;
import ir.q;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final u f86111a;

    public a(u algorithmParams) {
        e0.checkNotNullParameter(algorithmParams, "algorithmParams");
        this.f86111a = algorithmParams;
    }

    public final u a() {
        return this.f86111a;
    }

    public abstract Boolean a(Bitmap bitmap);

    public final Boolean b(Bitmap image) {
        e0.checkNotNullParameter(image, "image");
        try {
            return a(image);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void a(Float f10, Boolean bool) {
        if (d0.b()) {
            d0.b("BrokenCreativeDetector", this.f86111a.getType().name() + " result - " + f10 + " (isBroken - " + bool + ')', new Object[0]);
        }
    }

    public final int b(int i10) {
        return (int) ((Color.blue(i10) * 0.114f) + (Color.green(i10) * 0.587f) + (Color.red(i10) * 0.299f));
    }

    public final float a(int i10) {
        return (q.blueToRatio(i10) * 0.114f) + (q.greenToRatio(i10) * 0.587f) + (q.redToRatio(i10) * 0.299f);
    }

    public final int a(Bitmap bitmap, int i10, int i11) {
        e0.checkNotNullParameter(bitmap, "<this>");
        return b(bitmap.getPixel(i10, i11));
    }
}
