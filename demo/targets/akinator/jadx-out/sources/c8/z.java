package c8;

import android.graphics.PointF;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class z implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final z f11929a = new z();

    @Override // c8.l0
    public PointF parse(d8.c cVar, float f10) throws IOException {
        d8.b bVarPeek = cVar.peek();
        if (bVarPeek == d8.b.f51924b) {
            return s.b(cVar, f10);
        }
        if (bVarPeek == d8.b.f51926e) {
            return s.b(cVar, f10);
        }
        if (bVarPeek != d8.b.f51930i) {
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + bVarPeek);
        }
        PointF pointF = new PointF(((float) cVar.nextDouble()) * f10, ((float) cVar.nextDouble()) * f10);
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        return pointF;
    }
}
