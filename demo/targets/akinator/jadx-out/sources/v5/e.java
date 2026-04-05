package v5;

import android.os.Bundle;
import com.ironsource.G5;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import uu.p0;
import uu.v;
import uu.w;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract /* synthetic */ class e {
    public static final boolean a(Bundle bundle, Bundle bundle2) {
        if (bundle == bundle2) {
            return true;
        }
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if (obj != obj2 && !e0.areEqual(obj, obj2)) {
                if (obj != null && obj2 != null) {
                    if ((obj instanceof Bundle) && (obj2 instanceof Bundle)) {
                        if (!a((Bundle) obj, (Bundle) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
                        if (!w.contentDeepEquals((Object[]) obj, (Object[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
                        if (!Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof short[]) && (obj2 instanceof short[])) {
                        if (!Arrays.equals((short[]) obj, (short[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof int[]) && (obj2 instanceof int[])) {
                        if (!Arrays.equals((int[]) obj, (int[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof long[]) && (obj2 instanceof long[])) {
                        if (!Arrays.equals((long[]) obj, (long[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof float[]) && (obj2 instanceof float[])) {
                        if (!Arrays.equals((float[]) obj, (float[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof double[]) && (obj2 instanceof double[])) {
                        if (!Arrays.equals((double[]) obj, (double[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof char[]) && (obj2 instanceof char[])) {
                        if (!Arrays.equals((char[]) obj, (char[]) obj2)) {
                            return false;
                        }
                    } else if ((obj instanceof boolean[]) && (obj2 instanceof boolean[])) {
                        if (!Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                            return false;
                        }
                    } else if (!e0.areEqual(obj, obj2)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public static final int b(Bundle bundle) {
        Iterator<String> it = bundle.keySet().iterator();
        int iB = 1;
        while (it.hasNext()) {
            Object obj = bundle.get(it.next());
            iB = (iB * 31) + (obj instanceof Bundle ? b((Bundle) obj) : obj instanceof Object[] ? v.contentDeepHashCode((Object[]) obj) : obj instanceof byte[] ? Arrays.hashCode((byte[]) obj) : obj instanceof short[] ? Arrays.hashCode((short[]) obj) : obj instanceof int[] ? Arrays.hashCode((int[]) obj) : obj instanceof long[] ? Arrays.hashCode((long[]) obj) : obj instanceof float[] ? Arrays.hashCode((float[]) obj) : obj instanceof double[] ? Arrays.hashCode((double[]) obj) : obj instanceof char[] ? Arrays.hashCode((char[]) obj) : obj instanceof boolean[] ? Arrays.hashCode((boolean[]) obj) : obj != null ? obj.hashCode() : 0);
        }
        return iB;
    }

    public static final void c(Bundle bundle, StringBuilder sb2, List list) {
        if (list.contains(bundle)) {
            sb2.append("[...]");
            return;
        }
        list.add(bundle);
        sb2.append(AbstractJsonLexerKt.BEGIN_LIST);
        int i10 = 0;
        for (String str : bundle.keySet()) {
            int i11 = i10 + 1;
            if (i10 != 0) {
                sb2.append(", ");
            }
            sb2.append(str + G5.T);
            Object obj = bundle.get(str);
            if (obj == null) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (obj instanceof Bundle) {
                c((Bundle) obj, sb2, list);
            } else if (obj instanceof Object[]) {
                sb2.append(w.contentDeepToString((Object[]) obj));
            } else if (obj instanceof byte[]) {
                String string = Arrays.toString((byte[]) obj);
                e0.checkNotNullExpressionValue(string, "toString(...)");
                sb2.append(string);
            } else if (obj instanceof short[]) {
                String string2 = Arrays.toString((short[]) obj);
                e0.checkNotNullExpressionValue(string2, "toString(...)");
                sb2.append(string2);
            } else if (obj instanceof int[]) {
                String string3 = Arrays.toString((int[]) obj);
                e0.checkNotNullExpressionValue(string3, "toString(...)");
                sb2.append(string3);
            } else if (obj instanceof long[]) {
                String string4 = Arrays.toString((long[]) obj);
                e0.checkNotNullExpressionValue(string4, "toString(...)");
                sb2.append(string4);
            } else if (obj instanceof float[]) {
                String string5 = Arrays.toString((float[]) obj);
                e0.checkNotNullExpressionValue(string5, "toString(...)");
                sb2.append(string5);
            } else if (obj instanceof double[]) {
                String string6 = Arrays.toString((double[]) obj);
                e0.checkNotNullExpressionValue(string6, "toString(...)");
                sb2.append(string6);
            } else if (obj instanceof char[]) {
                String string7 = Arrays.toString((char[]) obj);
                e0.checkNotNullExpressionValue(string7, "toString(...)");
                sb2.append(string7);
            } else if (obj instanceof boolean[]) {
                String string8 = Arrays.toString((boolean[]) obj);
                e0.checkNotNullExpressionValue(string8, "toString(...)");
                sb2.append(string8);
            } else {
                sb2.append(obj.toString());
            }
            i10 = i11;
        }
        sb2.append(AbstractJsonLexerKt.END_LIST);
        list.remove(p0.getLastIndex(list));
    }
}
