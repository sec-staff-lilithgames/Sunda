package kb;

import com.sfbx.appconsent.core.BuildConfig;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class f {
    public static String getHoursPlayedFrom(int i10) {
        int i11 = i10 / BuildConfig.VERSION_CODE;
        return String.format("%02d:%s", Integer.valueOf(i11), getMinPlayedFrom(i10 - (i11 * BuildConfig.VERSION_CODE)));
    }

    public static String getMinPlayedFrom(int i10) {
        int i11 = i10 / 60;
        return String.format("%02d:%s", Integer.valueOf(i11), getSecPlayedFrom(i10 - (i11 * 60)));
    }

    public static String getSecPlayedFrom(int i10) {
        return String.format("%02d", Integer.valueOf(i10));
    }
}
