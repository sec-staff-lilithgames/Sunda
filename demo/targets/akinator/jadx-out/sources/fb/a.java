package fb;

import android.text.TextUtils;
import android.util.Pair;
import j1.o2;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import ya.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class a {
    public static Object[] a(Throwable th2, c cVar) {
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(new Pair("exception_name", th2.getClass().getSimpleName()));
        arrayList.add(new Pair("description", th2.getMessage()));
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String string = stringWriter.getBuffer().toString();
        if (!TextUtils.isEmpty(string)) {
            o2.z("stack_trace", string, arrayList);
        }
        if (cVar != null) {
            arrayList.add(new Pair("error_code", cVar.a()));
        }
        Object[] objArr = new Object[arrayList.size() * 2];
        int i10 = 1;
        int i11 = 0;
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            Pair pair = (Pair) arrayList.get(i12);
            objArr[i11] = pair.first;
            objArr[i10] = pair.second;
            i11 += 2;
            i10 += 2;
        }
        return objArr;
    }
}
