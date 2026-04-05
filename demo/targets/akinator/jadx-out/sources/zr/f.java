package zr;

import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f98476a = new ArrayList(20);

    public g build() {
        return new g(this);
    }

    public f removeAll(String str) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f98476a;
            if (i10 >= arrayList.size()) {
                return this;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i10))) {
                arrayList.remove(i10);
                arrayList.remove(i10);
                i10 -= 2;
            }
            i10 += 2;
        }
    }

    public f set(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("name == null");
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException("name is empty");
        }
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt <= 31 || cCharAt >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header name: %s", Integer.valueOf(cCharAt), Integer.valueOf(i10), str));
            }
        }
        if (str2 == null) {
            throw new IllegalArgumentException("value == null");
        }
        int length2 = str2.length();
        for (int i11 = 0; i11 < length2; i11++) {
            char cCharAt2 = str2.charAt(i11);
            if (cCharAt2 <= 31 || cCharAt2 >= 127) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected char %#04x at %d in header value: %s", Integer.valueOf(cCharAt2), Integer.valueOf(i11), str2));
            }
        }
        removeAll(str);
        ArrayList arrayList = this.f98476a;
        arrayList.add(str);
        arrayList.add(str2.trim());
        return this;
    }
}
