package a3;

import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f3979a = new HashMap();

    public float getFloatValue(Object obj, String str, int i10) {
        HashMap map;
        float[] fArr;
        HashMap map2 = this.f3979a;
        if (map2.containsKey(obj) && (map = (HashMap) map2.get(obj)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > i10) {
            return fArr[i10];
        }
        return Float.NaN;
    }

    public void setFloatValue(Object obj, String str, int i10, float f10) {
        HashMap map = this.f3979a;
        if (!map.containsKey(obj)) {
            HashMap map2 = new HashMap();
            float[] fArr = new float[i10 + 1];
            fArr[i10] = f10;
            map2.put(str, fArr);
            map.put(obj, map2);
            return;
        }
        HashMap map3 = (HashMap) map.get(obj);
        if (map3 == null) {
            map3 = new HashMap();
        }
        if (!map3.containsKey(str)) {
            float[] fArr2 = new float[i10 + 1];
            fArr2[i10] = f10;
            map3.put(str, fArr2);
            map.put(obj, map3);
            return;
        }
        float[] fArrCopyOf = (float[]) map3.get(str);
        if (fArrCopyOf == null) {
            fArrCopyOf = new float[0];
        }
        if (fArrCopyOf.length <= i10) {
            fArrCopyOf = Arrays.copyOf(fArrCopyOf, i10 + 1);
        }
        fArrCopyOf[i10] = f10;
        map3.put(str, fArrCopyOf);
    }
}
