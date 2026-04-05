package t7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface f extends d {
    void draw(Canvas canvas, Matrix matrix, int i10, e8.b bVar);

    void getBounds(RectF rectF, Matrix matrix, boolean z10);

    @Override // t7.d
    /* synthetic */ String getName();

    @Override // t7.d
    /* synthetic */ void setContents(List list, List list2);
}
