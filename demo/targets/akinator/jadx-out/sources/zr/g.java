package zr;

import java.util.ArrayList;
import java.util.Collections;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f98477a;

    public g(f fVar) {
        ArrayList arrayList = fVar.f98476a;
        this.f98477a = (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String get(String str) {
        String[] strArr = this.f98477a;
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public String name(int i10) {
        int i11 = i10 * 2;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f98477a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }

    public f newBuilder() {
        f fVar = new f();
        Collections.addAll(fVar.f98476a, this.f98477a);
        return fVar;
    }

    public int size() {
        return this.f98477a.length / 2;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            sb2.append(name(i10));
            sb2.append(": ");
            sb2.append(value(i10));
            sb2.append("\n");
        }
        return sb2.toString();
    }

    public String value(int i10) {
        int i11 = (i10 * 2) + 1;
        if (i11 < 0) {
            return null;
        }
        String[] strArr = this.f98477a;
        if (i11 >= strArr.length) {
            return null;
        }
        return strArr[i11];
    }
}
