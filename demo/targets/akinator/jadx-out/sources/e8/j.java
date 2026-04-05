package e8;

import android.graphics.Path;
import android.graphics.PointF;
import j1.o2;
import java.util.List;
import z7.r;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final PointF f53941a = new PointF();

    public static int a(float f10, float f11) {
        int i10 = (int) f10;
        int i11 = (int) f11;
        int i12 = i10 / i11;
        int i13 = i10 % i11;
        if (!((i10 ^ i11) >= 0) && i13 != 0) {
            i12--;
        }
        return i10 - (i11 * i12);
    }

    public static PointF addPoints(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static int clamp(int i10, int i11, int i12) {
        return Math.max(i11, Math.min(i12, i10));
    }

    public static boolean contains(float f10, float f11, float f12) {
        return f10 >= f11 && f10 <= f12;
    }

    public static void getPathFromData(r rVar, Path path) {
        Path path2;
        path.reset();
        PointF initialPoint = rVar.getInitialPoint();
        path.moveTo(initialPoint.x, initialPoint.y);
        float f10 = initialPoint.x;
        float f11 = initialPoint.y;
        PointF pointF = f53941a;
        pointF.set(f10, f11);
        int i10 = 0;
        while (i10 < rVar.getCurves().size()) {
            x7.a aVar = rVar.getCurves().get(i10);
            PointF controlPoint1 = aVar.getControlPoint1();
            PointF controlPoint2 = aVar.getControlPoint2();
            PointF vertex = aVar.getVertex();
            if (controlPoint1.equals(pointF) && controlPoint2.equals(vertex)) {
                path.lineTo(vertex.x, vertex.y);
                path2 = path;
            } else {
                path2 = path;
                path2.cubicTo(controlPoint1.x, controlPoint1.y, controlPoint2.x, controlPoint2.y, vertex.x, vertex.y);
            }
            pointF.set(vertex.x, vertex.y);
            i10++;
            path = path2;
        }
        Path path3 = path;
        if (rVar.isClosed()) {
            path3.close();
        }
    }

    public static float lerp(float f10, float f11, float f12) {
        return o2.a(f11, f10, f12, f10);
    }

    public static void resolveKeyPath(x7.f fVar, int i10, List<x7.f> list, x7.f fVar2, t7.l lVar) {
        if (fVar.fullyResolvesTo(lVar.getName(), i10)) {
            list.add(fVar2.addKey(lVar.getName()).resolve(lVar));
        }
    }

    public static float clamp(float f10, float f11, float f12) {
        return Math.max(f11, Math.min(f12, f10));
    }

    public static double lerp(double d10, double d11, double d12) {
        return ((d11 - d10) * d12) + d10;
    }

    public static double clamp(double d10, double d11, double d12) {
        return Math.max(d11, Math.min(d12, d10));
    }

    public static int lerp(int i10, int i11, float f10) {
        return (int) ((f10 * (i11 - i10)) + i10);
    }
}
