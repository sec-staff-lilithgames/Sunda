package g3;

import android.content.res.TypedArray;
import android.util.Log;
import android.util.SparseIntArray;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final SparseIntArray f57105a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f57105a = sparseIntArray;
        sparseIntArray.append(0, 1);
        sparseIntArray.append(9, 2);
        sparseIntArray.append(5, 4);
        sparseIntArray.append(6, 5);
        sparseIntArray.append(7, 6);
        sparseIntArray.append(3, 7);
        sparseIntArray.append(15, 8);
        sparseIntArray.append(14, 9);
        sparseIntArray.append(13, 10);
        sparseIntArray.append(11, 12);
        sparseIntArray.append(10, 13);
        sparseIntArray.append(4, 14);
        sparseIntArray.append(1, 15);
        sparseIntArray.append(2, 16);
        sparseIntArray.append(8, 17);
        sparseIntArray.append(12, 18);
        sparseIntArray.append(18, 20);
        sparseIntArray.append(17, 21);
        sparseIntArray.append(20, 19);
    }

    public static void read(n nVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            SparseIntArray sparseIntArray = f57105a;
            switch (sparseIntArray.get(index)) {
                case 1:
                    nVar.f57126g = typedArray.getFloat(index, nVar.f57126g);
                    break;
                case 2:
                    nVar.f57127h = typedArray.getDimension(index, nVar.f57127h);
                    break;
                case 3:
                case 11:
                default:
                    Log.e("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                case 4:
                    nVar.f57128i = typedArray.getFloat(index, nVar.f57128i);
                    break;
                case 5:
                    nVar.f57129j = typedArray.getFloat(index, nVar.f57129j);
                    break;
                case 6:
                    nVar.f57130k = typedArray.getFloat(index, nVar.f57130k);
                    break;
                case 7:
                    nVar.f57132m = typedArray.getFloat(index, nVar.f57132m);
                    break;
                case 8:
                    nVar.f57131l = typedArray.getFloat(index, nVar.f57131l);
                    break;
                case 9:
                    typedArray.getString(index);
                    nVar.getClass();
                    break;
                case 10:
                    if (i0.f56980z0) {
                        int resourceId = typedArray.getResourceId(index, nVar.f56926b);
                        nVar.f56926b = resourceId;
                        if (resourceId == -1) {
                            nVar.f56927c = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        nVar.f56927c = typedArray.getString(index);
                        break;
                    } else {
                        nVar.f56926b = typedArray.getResourceId(index, nVar.f56926b);
                        break;
                    }
                case 12:
                    nVar.f56925a = typedArray.getInt(index, nVar.f56925a);
                    break;
                case 13:
                    nVar.f57125f = typedArray.getInteger(index, nVar.f57125f);
                    break;
                case 14:
                    nVar.f57133n = typedArray.getFloat(index, nVar.f57133n);
                    break;
                case 15:
                    nVar.f57134o = typedArray.getDimension(index, nVar.f57134o);
                    break;
                case 16:
                    nVar.f57135p = typedArray.getDimension(index, nVar.f57135p);
                    break;
                case 17:
                    nVar.f57136q = typedArray.getDimension(index, nVar.f57136q);
                    break;
                case 18:
                    nVar.f57137r = typedArray.getFloat(index, nVar.f57137r);
                    break;
                case 19:
                    if (typedArray.peekValue(index).type == 3) {
                        typedArray.getString(index);
                        nVar.getClass();
                        nVar.f57138s = 7;
                        break;
                    } else {
                        nVar.f57138s = typedArray.getInt(index, nVar.f57138s);
                        break;
                    }
                case 20:
                    nVar.f57139t = typedArray.getFloat(index, nVar.f57139t);
                    break;
                case 21:
                    if (typedArray.peekValue(index).type == 5) {
                        nVar.f57140u = typedArray.getDimension(index, nVar.f57140u);
                        break;
                    } else {
                        nVar.f57140u = typedArray.getFloat(index, nVar.f57140u);
                        break;
                    }
            }
        }
    }
}
