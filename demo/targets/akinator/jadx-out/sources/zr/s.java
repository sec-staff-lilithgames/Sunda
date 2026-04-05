package zr;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f98524a = new String[0];

    /* renamed from: b, reason: collision with root package name */
    public static final Charset f98525b = Charset.forName(C.UTF8_NAME);

    public static boolean equal(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <T> List<T> immutableList(T[] tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T[] intersect(Class<T> cls, T[] tArr, T[] tArr2) {
        ArrayList arrayList = new ArrayList();
        for (Object[] objArr : tArr) {
            int length = tArr2.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    T t10 = tArr2[i10];
                    if (objArr.equals(t10)) {
                        arrayList.add(t10);
                        break;
                    }
                    i10++;
                }
            }
        }
        return (T[]) arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, arrayList.size()));
    }
}
