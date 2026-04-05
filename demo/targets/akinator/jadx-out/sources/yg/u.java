package yg;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class u extends w {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f94515c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f94516d;

    public u(ArrayList arrayList, Matrix matrix) {
        this.f94515c = arrayList;
        this.f94516d = matrix;
    }

    @Override // yg.w
    public void draw(Matrix matrix, xg.a aVar, int i10, Canvas canvas) {
        Iterator it = this.f94515c.iterator();
        while (it.hasNext()) {
            ((w) it.next()).draw(this.f94516d, aVar, i10, canvas);
        }
    }
}
