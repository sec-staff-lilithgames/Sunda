package q8;

import android.graphics.Bitmap;
import q8.s;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class t extends c {
    public s.a get(int i10, Bitmap.Config config) {
        Object aVar = (q) this.f82570a.poll();
        if (aVar == null) {
            aVar = new s.a(this);
        }
        s.a aVar2 = (s.a) aVar;
        aVar2.init(i10, config);
        return aVar2;
    }
}
