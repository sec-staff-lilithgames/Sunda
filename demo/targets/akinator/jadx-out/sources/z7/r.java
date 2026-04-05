package z7;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f97651a;

    /* renamed from: b, reason: collision with root package name */
    public PointF f97652b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f97653c;

    public r(PointF pointF, boolean z10, List<x7.a> list) {
        this.f97652b = pointF;
        this.f97653c = z10;
        this.f97651a = new ArrayList(list);
    }

    public List<x7.a> getCurves() {
        return this.f97651a;
    }

    public PointF getInitialPoint() {
        return this.f97652b;
    }

    public void interpolateBetween(r rVar, r rVar2, float f10) {
        if (this.f97652b == null) {
            this.f97652b = new PointF();
        }
        this.f97653c = rVar.isClosed() || rVar2.isClosed();
        if (rVar.getCurves().size() != rVar2.getCurves().size()) {
            e8.e.warning("Curves must have the same number of control points. Shape 1: " + rVar.getCurves().size() + "\tShape 2: " + rVar2.getCurves().size());
        }
        int iMin = Math.min(rVar.getCurves().size(), rVar2.getCurves().size());
        ArrayList arrayList = this.f97651a;
        if (arrayList.size() < iMin) {
            for (int size = arrayList.size(); size < iMin; size++) {
                arrayList.add(new x7.a());
            }
        } else if (arrayList.size() > iMin) {
            for (int size2 = arrayList.size() - 1; size2 >= iMin; size2--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF initialPoint = rVar.getInitialPoint();
        PointF initialPoint2 = rVar2.getInitialPoint();
        setInitialPoint(e8.j.lerp(initialPoint.x, initialPoint2.x, f10), e8.j.lerp(initialPoint.y, initialPoint2.y, f10));
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            x7.a aVar = rVar.getCurves().get(size3);
            x7.a aVar2 = rVar2.getCurves().get(size3);
            PointF controlPoint1 = aVar.getControlPoint1();
            PointF controlPoint2 = aVar.getControlPoint2();
            PointF vertex = aVar.getVertex();
            PointF controlPoint12 = aVar2.getControlPoint1();
            PointF controlPoint22 = aVar2.getControlPoint2();
            PointF vertex2 = aVar2.getVertex();
            ((x7.a) arrayList.get(size3)).setControlPoint1(e8.j.lerp(controlPoint1.x, controlPoint12.x, f10), e8.j.lerp(controlPoint1.y, controlPoint12.y, f10));
            ((x7.a) arrayList.get(size3)).setControlPoint2(e8.j.lerp(controlPoint2.x, controlPoint22.x, f10), e8.j.lerp(controlPoint2.y, controlPoint22.y, f10));
            ((x7.a) arrayList.get(size3)).setVertex(e8.j.lerp(vertex.x, vertex2.x, f10), e8.j.lerp(vertex.y, vertex2.y, f10));
        }
    }

    public boolean isClosed() {
        return this.f97653c;
    }

    public void setClosed(boolean z10) {
        this.f97653c = z10;
    }

    public void setInitialPoint(float f10, float f11) {
        if (this.f97652b == null) {
            this.f97652b = new PointF();
        }
        this.f97652b.set(f10, f11);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("ShapeData{numCurves=");
        sb2.append(this.f97651a.size());
        sb2.append("closed=");
        return a.b.p(sb2, this.f97653c, AbstractJsonLexerKt.END_OBJ);
    }

    public r() {
        this.f97651a = new ArrayList();
    }
}
