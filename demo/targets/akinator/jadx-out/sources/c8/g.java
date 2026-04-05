package c8;

import android.graphics.Color;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g f11881a = new g();

    @Override // c8.l0
    public Integer parse(d8.c cVar, float f10) throws IOException {
        boolean z10 = cVar.peek() == d8.b.f51924b;
        if (z10) {
            cVar.beginArray();
        }
        double dNextDouble = cVar.nextDouble();
        double dNextDouble2 = cVar.nextDouble();
        double dNextDouble3 = cVar.nextDouble();
        double dNextDouble4 = cVar.peek() == d8.b.f51930i ? cVar.nextDouble() : 1.0d;
        if (z10) {
            cVar.endArray();
        }
        if (dNextDouble <= 1.0d && dNextDouble2 <= 1.0d && dNextDouble3 <= 1.0d) {
            dNextDouble *= 255.0d;
            dNextDouble2 *= 255.0d;
            dNextDouble3 *= 255.0d;
            if (dNextDouble4 <= 1.0d) {
                dNextDouble4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) dNextDouble4, (int) dNextDouble, (int) dNextDouble2, (int) dNextDouble3));
    }
}
