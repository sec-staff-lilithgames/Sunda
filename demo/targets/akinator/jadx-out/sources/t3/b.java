package t3;

import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class b {
    static {
        int i10 = Build.VERSION.SDK_INT;
        a aVar = a.f86284a;
        if (i10 >= 30) {
            aVar.getExtensionVersion(30);
        }
        if (i10 >= 30) {
            aVar.getExtensionVersion(31);
        }
        if (i10 >= 30) {
            aVar.getExtensionVersion(33);
        }
        if (i10 >= 30) {
            aVar.getExtensionVersion(1000000);
        }
    }

    public static final boolean isAtLeastB() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            return true;
        }
        if (i10 < 35) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        e0.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Baklava", CODENAME);
    }

    @tu.f
    public static final boolean isAtLeastN() {
        return true;
    }

    @tu.f
    public static final boolean isAtLeastNMR1() {
        return Build.VERSION.SDK_INT >= 25;
    }

    @tu.f
    public static final boolean isAtLeastO() {
        return Build.VERSION.SDK_INT >= 26;
    }

    @tu.f
    public static final boolean isAtLeastOMR1() {
        return Build.VERSION.SDK_INT >= 27;
    }

    @tu.f
    public static final boolean isAtLeastP() {
        return Build.VERSION.SDK_INT >= 28;
    }

    public static final boolean isAtLeastPreReleaseCodename(String codename, String buildCodename) {
        e0.checkNotNullParameter(codename, "codename");
        e0.checkNotNullParameter(buildCodename, "buildCodename");
        if (!e0.areEqual("REL", buildCodename)) {
            Locale locale = Locale.ROOT;
            String upperCase = buildCodename.toUpperCase(locale);
            e0.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            Integer num = e0.areEqual(upperCase, "BAKLAVA") ? num : null;
            String upperCase2 = codename.toUpperCase(locale);
            e0.checkNotNullExpressionValue(upperCase2, "toUpperCase(...)");
            num = e0.areEqual(upperCase2, "BAKLAVA") ? 0 : null;
            if (num == null || num == null) {
                if (num == null && num == null) {
                    String upperCase3 = buildCodename.toUpperCase(locale);
                    e0.checkNotNullExpressionValue(upperCase3, "toUpperCase(...)");
                    String upperCase4 = codename.toUpperCase(locale);
                    e0.checkNotNullExpressionValue(upperCase4, "toUpperCase(...)");
                    if (upperCase3.compareTo(upperCase4) >= 0) {
                        return true;
                    }
                } else if (num != null) {
                    return true;
                }
            } else if (num.intValue() >= num.intValue()) {
                return true;
            }
        }
        return false;
    }

    @tu.f
    public static final boolean isAtLeastQ() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @tu.f
    public static final boolean isAtLeastR() {
        return Build.VERSION.SDK_INT >= 30;
    }

    @tu.f
    public static final boolean isAtLeastS() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            return true;
        }
        if (i10 < 30) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        e0.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("S", CODENAME);
    }

    @tu.f
    public static final boolean isAtLeastSv2() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 32) {
            return true;
        }
        if (i10 < 31) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        e0.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Sv2", CODENAME);
    }

    @tu.f
    public static final boolean isAtLeastT() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 33) {
            return true;
        }
        if (i10 < 32) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        e0.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("Tiramisu", CODENAME);
    }

    @tu.f
    public static final boolean isAtLeastU() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 34) {
            return true;
        }
        if (i10 < 33) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        e0.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("UpsideDownCake", CODENAME);
    }

    @tu.f
    public static final boolean isAtLeastV() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 35) {
            return true;
        }
        if (i10 < 34) {
            return false;
        }
        String CODENAME = Build.VERSION.CODENAME;
        e0.checkNotNullExpressionValue(CODENAME, "CODENAME");
        return isAtLeastPreReleaseCodename("VanillaIceCream", CODENAME);
    }
}
