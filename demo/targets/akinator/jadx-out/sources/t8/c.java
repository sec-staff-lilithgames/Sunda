package t8;

import android.graphics.Bitmap;
import j9.s;
import java.util.HashMap;
import r8.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final o f86567a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.d f86568b;

    /* renamed from: c, reason: collision with root package name */
    public final n8.b f86569c;

    /* renamed from: d, reason: collision with root package name */
    public b f86570d;

    public c(o oVar, q8.d dVar, n8.b bVar) {
        this.f86567a = oVar;
        this.f86568b = dVar;
        this.f86569c = bVar;
    }

    public void preFill(e... eVarArr) {
        b bVar = this.f86570d;
        if (bVar != null) {
            bVar.cancel();
        }
        int length = eVarArr.length;
        f[] fVarArr = new f[length];
        for (int i10 = 0; i10 < eVarArr.length; i10++) {
            e eVar = eVarArr[i10];
            if (eVar.f86577c == null) {
                eVar.setConfig(this.f86569c == n8.b.f75829b ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            }
            fVarArr[i10] = new f(eVar.f86575a, eVar.f86576b, eVar.f86577c, eVar.f86578d);
        }
        o oVar = this.f86567a;
        long maxSize = oVar.getMaxSize() - oVar.getCurrentSize();
        q8.d dVar = this.f86568b;
        long maxSize2 = dVar.getMaxSize() + maxSize;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i11 += fVarArr[i12].f86582d;
        }
        float f10 = maxSize2 / i11;
        HashMap map = new HashMap();
        for (int i13 = 0; i13 < length; i13++) {
            f fVar = fVarArr[i13];
            map.put(fVar, Integer.valueOf(Math.round(fVar.f86582d * f10) / s.getBitmapByteSize(fVar.f86579a, fVar.f86580b, fVar.f86581c)));
        }
        b bVar2 = new b(dVar, oVar, new d(map));
        this.f86570d = bVar2;
        s.postOnUiThread(bVar2);
    }
}
