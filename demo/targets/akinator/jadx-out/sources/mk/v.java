package mk;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public abstract class v {
    public static DateFormat getUsDateTimeFormat(int i10, int i11) {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder();
        if (i10 == 0) {
            str = "EEEE, MMMM d, yyyy";
        } else if (i10 == 1) {
            str = "MMMM d, yyyy";
        } else if (i10 == 2) {
            str = "MMM d, yyyy";
        } else {
            if (i10 != 3) {
                throw new IllegalArgumentException(a.b.e(i10, "Unknown DateFormat style: "));
            }
            str = "M/d/yy";
        }
        sb2.append(str);
        sb2.append(" ");
        if (i11 == 0 || i11 == 1) {
            str2 = "h:mm:ss a z";
        } else if (i11 == 2) {
            str2 = "h:mm:ss a";
        } else {
            if (i11 != 3) {
                throw new IllegalArgumentException(a.b.e(i11, "Unknown DateFormat style: "));
            }
            str2 = "h:mm a";
        }
        sb2.append(str2);
        return new SimpleDateFormat(sb2.toString(), Locale.US);
    }
}
