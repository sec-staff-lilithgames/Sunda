package ic;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.regex.Pattern;
import ub.p0;
import ub.q0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f59515a = Pattern.compile("[-_./;:]");

    public static int a(String str) {
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt > '9' || cCharAt < '0') {
                break;
            }
            i10 = (i10 * 10) + (cCharAt - '0');
        }
        return i10;
    }

    @Deprecated
    public static p0 mavenVersionFor(ClassLoader classLoader, String str, String str2) throws IOException {
        InputStream resourceAsStream = classLoader.getResourceAsStream("META-INF/maven/" + str.replaceAll("\\.", "/") + "/" + str2 + "/pom.properties");
        if (resourceAsStream != null) {
            try {
                try {
                    Properties properties = new Properties();
                    properties.load(resourceAsStream);
                    p0 version = parseVersion(properties.getProperty("version"), properties.getProperty("groupId"), properties.getProperty("artifactId"));
                    try {
                        resourceAsStream.close();
                    } catch (IOException unused) {
                    }
                    return version;
                } catch (IOException unused2) {
                }
            } catch (IOException unused3) {
                resourceAsStream.close();
            } catch (Throwable th2) {
                try {
                    resourceAsStream.close();
                } catch (IOException unused4) {
                }
                throw th2;
            }
        }
        return p0.unknownVersion();
    }

    @Deprecated
    public static p0 packageVersionFor(Class<?> cls) {
        return versionFor(cls);
    }

    public static p0 parseVersion(String str, String str2, String str3) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.length() > 0) {
                String[] strArrSplit = f59515a.split(strTrim);
                return new p0(a(strArrSplit[0]), strArrSplit.length > 1 ? a(strArrSplit[1]) : 0, strArrSplit.length > 2 ? a(strArrSplit[2]) : 0, strArrSplit.length > 3 ? strArrSplit[3] : null, str2, str3);
            }
        }
        return p0.unknownVersion();
    }

    public static final void throwInternal() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static final <T> T throwInternalReturnAny() {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public static p0 versionFor(Class<?> cls) throws ClassNotFoundException {
        p0 p0VarVersion = null;
        try {
            Class<?> cls2 = Class.forName(cls.getPackage().getName() + ".PackageVersion", true, cls.getClassLoader());
            try {
                p0VarVersion = ((q0) cls2.getDeclaredConstructor(null).newInstance(null)).version();
            } catch (Exception unused) {
                throw new IllegalArgumentException("Failed to get Versioned out of " + cls2);
            }
        } catch (Exception unused2) {
        }
        return p0VarVersion == null ? p0.unknownVersion() : p0VarVersion;
    }
}
