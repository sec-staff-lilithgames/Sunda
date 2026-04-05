package of;

import com.google.android.exoplayer2.util.n1;
import com.moloco.sdk.BKC.JzVV;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f79354a;

    /* renamed from: b, reason: collision with root package name */
    public final int f79355b;

    /* renamed from: c, reason: collision with root package name */
    public final String f79356c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f79357d;

    public g(String str, int i10, String str2, Set set) {
        this.f79355b = i10;
        this.f79354a = str;
        this.f79356c = str2;
        this.f79357d = set;
    }

    public static g buildStartTag(String str, int i10) {
        String str2;
        String strTrim = str.trim();
        com.google.android.exoplayer2.util.a.checkArgument(!strTrim.isEmpty());
        int iIndexOf = strTrim.indexOf(" ");
        if (iIndexOf == -1) {
            str2 = "";
        } else {
            String strTrim2 = strTrim.substring(iIndexOf).trim();
            strTrim = strTrim.substring(0, iIndexOf);
            str2 = strTrim2;
        }
        String[] strArrSplit = n1.split(strTrim, "\\.");
        String str3 = strArrSplit[0];
        HashSet hashSet = new HashSet();
        for (int i11 = 1; i11 < strArrSplit.length; i11++) {
            hashSet.add(strArrSplit[i11]);
        }
        return new g(str3, i10, str2, hashSet);
    }

    public static g buildWholeCueVirtualTag() {
        Set set = Collections.EMPTY_SET;
        String str = JzVV.aZGTxEJKZ;
        return new g(str, 0, str, set);
    }
}
