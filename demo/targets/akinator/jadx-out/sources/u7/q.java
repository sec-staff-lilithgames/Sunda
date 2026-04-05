package u7;

import android.graphics.PointF;
import j1.o2;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class q extends m {

    /* renamed from: i, reason: collision with root package name */
    public final PointF f88009i;

    public q(List<f8.a> list) {
        super(list);
        this.f88009i = new PointF();
    }

    @Override // u7.f
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final PointF e(f8.a aVar, float f10, float f11, float f12) {
        Object obj;
        PointF pointF;
        Object obj2 = aVar.f55489b;
        if (obj2 == null || (obj = aVar.f55490c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF2 = (PointF) obj2;
        PointF pointF3 = (PointF) obj;
        f8.c cVar = this.f87985e;
        if (cVar != null && (pointF = (PointF) cVar.getValueInternal(aVar.f55494g, aVar.f55495h.floatValue(), pointF2, pointF3, f10, d(), getProgress())) != null) {
            return pointF;
        }
        float f13 = pointF2.x;
        float fA = o2.a(pointF3.x, f13, f11, f13);
        float f14 = pointF2.y;
        float fA2 = o2.a(pointF3.y, f14, f12, f14);
        PointF pointF4 = this.f88009i;
        pointF4.set(fA, fA2);
        return pointF4;
    }

    @Override // u7.f
    public PointF getValue(f8.a aVar, float f10) {
        return e(aVar, f10, f10, f10);
    }
}
