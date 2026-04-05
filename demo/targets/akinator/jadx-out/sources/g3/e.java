package g3;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f56930a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f56930a = sparseIntArray;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(11, 2);
        sparseIntArray.append(7, 4);
        sparseIntArray.append(8, 5);
        sparseIntArray.append(9, 6);
        sparseIntArray.append(1, 19);
        sparseIntArray.append(2, 20);
        sparseIntArray.append(5, 7);
        sparseIntArray.append(18, 8);
        sparseIntArray.append(17, 9);
        sparseIntArray.append(15, 10);
        sparseIntArray.append(13, 12);
        sparseIntArray.append(12, 13);
        sparseIntArray.append(6, 14);
        sparseIntArray.append(3, 15);
        sparseIntArray.append(4, 16);
        sparseIntArray.append(10, 17);
        sparseIntArray.append(14, 18);
    }

    public static void read(f fVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            SparseIntArray sparseIntArray = f56930a;
            switch (sparseIntArray.get(index)) {
                case 1:
                    fVar.f56934g = typedArray.getFloat(index, fVar.f56934g);
                    break;
                case 2:
                    fVar.f56935h = typedArray.getDimension(index, fVar.f56935h);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyAttribute", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 4:
                    fVar.f56936i = typedArray.getFloat(index, fVar.f56936i);
                    break;
                case 5:
                    fVar.f56937j = typedArray.getFloat(index, fVar.f56937j);
                    break;
                case 6:
                    fVar.f56938k = typedArray.getFloat(index, fVar.f56938k);
                    break;
                case 7:
                    fVar.f56942o = typedArray.getFloat(index, fVar.f56942o);
                    break;
                case 8:
                    fVar.f56941n = typedArray.getFloat(index, fVar.f56941n);
                    break;
                case 9:
                    typedArray.getString(index);
                    fVar.getClass();
                    break;
                case 10:
                    if (i0.f56980z0) {
                        int resourceId = typedArray.getResourceId(index, fVar.f56926b);
                        fVar.f56926b = resourceId;
                        if (resourceId == -1) {
                            fVar.f56927c = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        fVar.f56927c = typedArray.getString(index);
                        break;
                    } else {
                        fVar.f56926b = typedArray.getResourceId(index, fVar.f56926b);
                        break;
                    }
                case 12:
                    fVar.f56925a = typedArray.getInt(index, fVar.f56925a);
                    break;
                case 13:
                    fVar.f56933f = typedArray.getInteger(index, fVar.f56933f);
                    break;
                case 14:
                    fVar.f56943p = typedArray.getFloat(index, fVar.f56943p);
                    break;
                case 15:
                    fVar.f56944q = typedArray.getDimension(index, fVar.f56944q);
                    break;
                case 16:
                    fVar.f56945r = typedArray.getDimension(index, fVar.f56945r);
                    break;
                case 17:
                    fVar.f56946s = typedArray.getDimension(index, fVar.f56946s);
                    break;
                case 18:
                    fVar.f56947t = typedArray.getFloat(index, fVar.f56947t);
                    break;
                case 19:
                    fVar.f56939l = typedArray.getDimension(index, fVar.f56939l);
                    break;
                case 20:
                    fVar.f56940m = typedArray.getDimension(index, fVar.f56940m);
                    break;
            }
        }
    }
}
