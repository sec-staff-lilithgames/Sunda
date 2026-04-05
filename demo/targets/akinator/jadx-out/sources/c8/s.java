package c8;

import android.graphics.Color;
import android.graphics.PointF;
import java.io.IOException;
import java.util.ArrayList;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final d8.a f11914a = d8.a.of("x", "y");

    public static int a(d8.c cVar) throws IOException {
        cVar.beginArray();
        int iNextDouble = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (cVar.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (cVar.nextDouble() * 255.0d);
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF b(d8.c cVar, float f10) throws IOException {
        int iOrdinal = cVar.peek().ordinal();
        if (iOrdinal == 0) {
            cVar.beginArray();
            float fNextDouble = (float) cVar.nextDouble();
            float fNextDouble2 = (float) cVar.nextDouble();
            while (cVar.peek() != d8.b.f51925c) {
                cVar.skipValue();
            }
            cVar.endArray();
            return new PointF(fNextDouble * f10, fNextDouble2 * f10);
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 6) {
                throw new IllegalArgumentException("Unknown point starts with " + cVar.peek());
            }
            float fNextDouble3 = (float) cVar.nextDouble();
            float fNextDouble4 = (float) cVar.nextDouble();
            while (cVar.hasNext()) {
                cVar.skipValue();
            }
            return new PointF(fNextDouble3 * f10, fNextDouble4 * f10);
        }
        cVar.beginObject();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (cVar.hasNext()) {
            int iSelectName = cVar.selectName(f11914a);
            if (iSelectName == 0) {
                fD = d(cVar);
            } else if (iSelectName != 1) {
                cVar.skipName();
                cVar.skipValue();
            } else {
                fD2 = d(cVar);
            }
        }
        cVar.endObject();
        return new PointF(fD * f10, fD2 * f10);
    }

    public static ArrayList c(d8.c cVar, float f10) throws IOException {
        ArrayList arrayList = new ArrayList();
        cVar.beginArray();
        while (cVar.peek() == d8.b.f51924b) {
            cVar.beginArray();
            arrayList.add(b(cVar, f10));
            cVar.endArray();
        }
        cVar.endArray();
        return arrayList;
    }

    public static float d(d8.c cVar) throws IOException {
        d8.b bVarPeek = cVar.peek();
        int iOrdinal = bVarPeek.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 6) {
                return (float) cVar.nextDouble();
            }
            throw new IllegalArgumentException("Unknown value for token of type " + bVarPeek);
        }
        cVar.beginArray();
        float fNextDouble = (float) cVar.nextDouble();
        while (cVar.hasNext()) {
            cVar.skipValue();
        }
        cVar.endArray();
        return fNextDouble;
    }
}
