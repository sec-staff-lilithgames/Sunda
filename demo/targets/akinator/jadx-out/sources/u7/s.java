package u7;

import android.graphics.Path;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class s extends f {

    /* renamed from: i, reason: collision with root package name */
    public final z7.r f88011i;

    /* renamed from: j, reason: collision with root package name */
    public final Path f88012j;

    /* renamed from: k, reason: collision with root package name */
    public Path f88013k;

    /* renamed from: l, reason: collision with root package name */
    public Path f88014l;

    /* renamed from: m, reason: collision with root package name */
    public List f88015m;

    public s(List<f8.a> list) {
        super(list);
        this.f88011i = new z7.r();
        this.f88012j = new Path();
    }

    @Override // u7.f
    public final boolean f() {
        List list = this.f88015m;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public void setShapeModifiers(List<t7.t> list) {
        this.f88015m = list;
    }

    @Override // u7.f
    public Path getValue(f8.a aVar, float f10) {
        z7.r rVar = (z7.r) aVar.f55489b;
        z7.r rVar2 = (z7.r) aVar.f55490c;
        z7.r rVar3 = rVar2 == null ? rVar : rVar2;
        z7.r rVarModifyShape = this.f88011i;
        rVarModifyShape.interpolateBetween(rVar, rVar3, f10);
        List list = this.f88015m;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                rVarModifyShape = ((t7.t) this.f88015m.get(size)).modifyShape(rVarModifyShape);
            }
        }
        Path path = this.f88012j;
        e8.j.getPathFromData(rVarModifyShape, path);
        if (this.f87985e == null) {
            return path;
        }
        if (this.f88013k == null) {
            this.f88013k = new Path();
            this.f88014l = new Path();
        }
        e8.j.getPathFromData(rVar, this.f88013k);
        if (rVar2 != null) {
            e8.j.getPathFromData(rVar2, this.f88014l);
        }
        f8.c cVar = this.f87985e;
        float f11 = aVar.f55494g;
        float fFloatValue = aVar.f55495h.floatValue();
        Path path2 = this.f88013k;
        return (Path) cVar.getValueInternal(f11, fFloatValue, path2, rVar2 == null ? path2 : this.f88014l, f10, d(), getProgress());
    }
}
