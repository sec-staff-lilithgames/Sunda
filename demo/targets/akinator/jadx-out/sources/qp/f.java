package qp;

import io.bidmachine.media3.common.util.a1;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final String f83450a;

    /* renamed from: b, reason: collision with root package name */
    public final int f83451b;

    /* renamed from: c, reason: collision with root package name */
    public final String f83452c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f83453d;

    public f(String str, int i10, String str2, Set set) {
        this.f83451b = i10;
        this.f83450a = str;
        this.f83452c = str2;
        this.f83453d = set;
    }

    public static f buildStartTag(String str, int i10) {
        String str2;
        String strTrim = str.trim();
        io.bidmachine.media3.common.util.a.checkArgument(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String[] strArrSplit = a1.split(strTrim, "\\.");
        String str3 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i11 = 1; i11 < strArrSplit.length; i11++) {
            hashSet.add(strArrSplit[i11]);
        }
        return new f(str3, i10, str2, hashSet);
    }

    public static f buildWholeCueVirtualTag() {
        return new f("", 0, "", Collections.EMPTY_SET);
    }
}
