package zw;

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public class y implements h0 {

    /* renamed from: a, reason: collision with root package name */
    public final Pattern f98883a = Pattern.compile("_");

    @Override // zw.h0
    public Locale read(String str) throws Exception {
        String[] strArrSplit = this.f98883a.split(str);
        if (strArrSplit.length < 1) {
            throw new x("Invalid locale %s", str);
        }
        String[] strArr = new String[3];
        strArr[0] = "";
        strArr[1] = "";
        strArr[2] = "";
        for (int i10 = 0; i10 < 3; i10++) {
            if (i10 < strArrSplit.length) {
                strArr[i10] = strArrSplit[i10];
            }
        }
        return new Locale(strArr[0], strArr[1], strArr[2]);
    }

    @Override // zw.h0
    public String write(Locale locale) {
        return locale.toString();
    }
}
