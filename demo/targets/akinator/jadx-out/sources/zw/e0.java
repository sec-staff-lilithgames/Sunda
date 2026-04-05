package zw;

import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class e0 implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f98862a;

    /* renamed from: b, reason: collision with root package name */
    public final String f98863b;

    public e0() {
        this(",");
    }

    public e0(String str) {
        this.f98862a = Pattern.compile(str);
        this.f98863b = str;
    }

    @Override // zw.h0
    public String[] read(String str) {
        String[] strArrSplit = this.f98862a.split(str);
        for (int i10 = 0; i10 < strArrSplit.length; i10++) {
            String str2 = strArrSplit[i10];
            if (str2 != null) {
                strArrSplit[i10] = str2.trim();
            }
        }
        return strArrSplit;
    }

    @Override // zw.h0
    public String write(String[] strArr) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : strArr) {
            if (str != null) {
                if (sb2.length() > 0) {
                    sb2.append(this.f98863b);
                    sb2.append(' ');
                }
                sb2.append(str);
            }
        }
        return sb2.toString();
    }
}
