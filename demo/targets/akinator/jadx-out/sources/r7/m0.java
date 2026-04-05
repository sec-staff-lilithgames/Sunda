package r7;

import java.util.Comparator;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class m0 implements Comparator {
    @Override // java.util.Comparator
    public int compare(w3.e eVar, w3.e eVar2) {
        float fFloatValue = ((Float) eVar.f90369b).floatValue();
        float fFloatValue2 = ((Float) eVar2.f90369b).floatValue();
        if (fFloatValue2 > fFloatValue) {
            return 1;
        }
        return fFloatValue > fFloatValue2 ? -1 : 0;
    }
}
