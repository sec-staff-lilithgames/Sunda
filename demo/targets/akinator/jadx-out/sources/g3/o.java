package g3;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f57141a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57141a = sparseIntArray;
        sparseIntArray.append(0, 8);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 1);
        sparseIntArray.append(6, 2);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(9, 5);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(2, 10);
        sparseIntArray.append(8, 11);
        sparseIntArray.append(10, 12);
        sparseIntArray.append(11, 13);
        sparseIntArray.append(12, 14);
    }

    public static void read(p pVar, TypedArray typedArray, Context context) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            SparseIntArray sparseIntArray = f57141a;
            switch (sparseIntArray.get(index)) {
                case 1:
                    pVar.f57151o = typedArray.getString(index);
                    break;
                case 2:
                    pVar.f57152p = typedArray.getString(index);
                    break;
                case 3:
                default:
                    Log.e("KeyTrigger", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 4:
                    pVar.f57149m = typedArray.getString(index);
                    break;
                case 5:
                    pVar.f57142f = typedArray.getFloat(index, pVar.f57142f);
                    break;
                case 6:
                    pVar.f57153q = typedArray.getResourceId(index, pVar.f57153q);
                    break;
                case 7:
                    if (i0.f56980z0) {
                        int resourceId = typedArray.getResourceId(index, pVar.f56926b);
                        pVar.f56926b = resourceId;
                        if (resourceId == -1) {
                            pVar.f56927c = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        pVar.f56927c = typedArray.getString(index);
                        break;
                    } else {
                        pVar.f56926b = typedArray.getResourceId(index, pVar.f56926b);
                        break;
                    }
                case 8:
                    int integer = typedArray.getInteger(index, pVar.f56925a);
                    pVar.f56925a = integer;
                    pVar.f57159w = (integer + 0.5f) / 100.0f;
                    break;
                case 9:
                    pVar.f57154r = typedArray.getResourceId(index, pVar.f57154r);
                    break;
                case 10:
                    pVar.f57161y = typedArray.getBoolean(index, pVar.f57161y);
                    break;
                case 11:
                    pVar.f57150n = typedArray.getResourceId(index, pVar.f57150n);
                    break;
                case 12:
                    pVar.f57145i = typedArray.getResourceId(index, pVar.f57145i);
                    break;
                case 13:
                    pVar.f57143g = typedArray.getResourceId(index, pVar.f57143g);
                    break;
                case 14:
                    pVar.f57144h = typedArray.getResourceId(index, pVar.f57144h);
                    break;
            }
        }
    }
}
