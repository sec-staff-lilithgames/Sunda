package u7;

import android.graphics.Path;
import android.graphics.PointF;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class o extends f8.a {

    /* renamed from: q, reason: collision with root package name */
    public Path f88002q;

    /* renamed from: r, reason: collision with root package name */
    public final f8.a f88003r;

    public o(r7.h hVar, f8.a aVar) {
        super(hVar, (PointF) aVar.f55489b, (PointF) aVar.f55490c, aVar.f55491d, aVar.f55492e, aVar.f55493f, aVar.f55494g, aVar.f55495h);
        this.f88003r = aVar;
        createPath();
    }

    public void createPath() {
        Object obj;
        Object obj2 = this.f55490c;
        Object obj3 = this.f55489b;
        boolean z10 = (obj2 == null || obj3 == null || !((PointF) obj3).equals(((PointF) obj2).x, ((PointF) obj2).y)) ? false : true;
        if (obj3 == null || (obj = this.f55490c) == null || z10) {
            return;
        }
        f8.a aVar = this.f88003r;
        this.f88002q = e8.n.createPath((PointF) obj3, (PointF) obj, aVar.f55502o, aVar.f55503p);
    }
}
