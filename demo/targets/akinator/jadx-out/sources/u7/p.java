package u7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class p extends m {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f88004i;

    /* renamed from: j, reason: collision with root package name */
    public final float[] f88005j;

    /* renamed from: k, reason: collision with root package name */
    public final float[] f88006k;

    /* renamed from: l, reason: collision with root package name */
    public final PathMeasure f88007l;

    /* renamed from: m, reason: collision with root package name */
    public o f88008m;

    public p(List<? extends f8.a> list) {
        super(list);
        this.f88004i = new PointF();
        this.f88005j = new float[2];
        this.f88006k = new float[2];
        this.f88007l = new PathMeasure();
    }

    @Override // u7.f
    public PointF getValue(f8.a aVar, float f10) {
        float f11;
        o oVar = (o) aVar;
        Path path = oVar.f88002q;
        f8.c cVar = this.f87985e;
        if (cVar == null || aVar.f55495h == null) {
            f11 = f10;
        } else {
            f11 = f10;
            PointF pointF = (PointF) cVar.getValueInternal(oVar.f55494g, oVar.f55495h.floatValue(), (PointF) oVar.f55489b, (PointF) oVar.f55490c, d(), f11, getProgress());
            if (pointF != null) {
                return pointF;
            }
        }
        if (path == null) {
            return (PointF) aVar.f55489b;
        }
        o oVar2 = this.f88008m;
        PathMeasure pathMeasure = this.f88007l;
        if (oVar2 != oVar) {
            pathMeasure.setPath(path, false);
            this.f88008m = oVar;
        }
        float length = pathMeasure.getLength();
        float f12 = f11 * length;
        float[] fArr = this.f88005j;
        float[] fArr2 = this.f88006k;
        pathMeasure.getPosTan(f12, fArr, fArr2);
        float f13 = fArr[0];
        float f14 = fArr[1];
        PointF pointF2 = this.f88004i;
        pointF2.set(f13, f14);
        if (f12 < 0.0f) {
            pointF2.offset(fArr2[0] * f12, fArr2[1] * f12);
        } else if (f12 > length) {
            float f15 = f12 - length;
            pointF2.offset(fArr2[0] * f15, fArr2[1] * f15);
        }
        return pointF2;
    }
}
