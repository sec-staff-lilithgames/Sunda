package su;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f86116a;

    /* renamed from: b, reason: collision with root package name */
    public static /* synthetic */ Class f86117b;

    static {
        try {
            f86116a = System.getProperty("xml.stream.debug") != null;
        } catch (Exception unused) {
        }
    }

    public static void a(String str) {
        if (f86116a) {
            PrintStream printStream = System.err;
            StringBuffer stringBuffer = new StringBuffer("STREAM: ");
            stringBuffer.append(str);
            printStream.println(stringBuffer.toString());
        }
    }

    public static Object b(ClassLoader classLoader, String str) throws IOException {
        boolean z10 = f86116a;
        try {
            String property = System.getProperty(str);
            if (property != null) {
                a("found system property".concat(property));
                return c(classLoader, property);
            }
        } catch (SecurityException unused) {
        }
        try {
            String property2 = System.getProperty("java.home");
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(property2);
            String str2 = File.separator;
            stringBuffer.append(str2);
            stringBuffer.append("lib");
            stringBuffer.append(str2);
            stringBuffer.append("jaxp.properties");
            File file = new File(stringBuffer.toString());
            if (file.exists()) {
                Properties properties = new Properties();
                properties.load(new FileInputStream(file));
                String property3 = properties.getProperty(str);
                if (property3 != null && property3.length() > 0) {
                    a("found java.home property ".concat(property3));
                    return c(classLoader, property3);
                }
            }
        } catch (Exception e10) {
            if (z10) {
                e10.printStackTrace();
            }
        }
        StringBuffer stringBuffer2 = new StringBuffer("META-INF/services/");
        stringBuffer2.append(str);
        String string = stringBuffer2.toString();
        try {
            InputStream systemResourceAsStream = classLoader == null ? ClassLoader.getSystemResourceAsStream(string) : classLoader.getResourceAsStream(string);
            if (systemResourceAsStream != null) {
                StringBuffer stringBuffer3 = new StringBuffer("found ");
                stringBuffer3.append(string);
                a(stringBuffer3.toString());
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(systemResourceAsStream, C.UTF8_NAME));
                String line = bufferedReader.readLine();
                bufferedReader.close();
                if (line != null && !"".equals(line)) {
                    a("loaded from services: ".concat(line));
                    return c(classLoader, line);
                }
            }
        } catch (Exception e11) {
            if (z10) {
                e11.printStackTrace();
            }
        }
        a("loaded from fallback value: ".concat("com.bea.xml.stream.MXParserFactory"));
        return c(classLoader, "com.bea.xml.stream.MXParserFactory");
    }

    public static Object c(ClassLoader classLoader, String str) {
        try {
            return (classLoader == null ? Class.forName(str) : classLoader.loadClass(str)).newInstance();
        } catch (ClassNotFoundException e10) {
            StringBuffer stringBuffer = new StringBuffer("Provider ");
            stringBuffer.append(str);
            stringBuffer.append(" not found");
            throw new a(stringBuffer.toString(), e10);
        } catch (Exception e11) {
            StringBuffer stringBuffer2 = new StringBuffer("Provider ");
            stringBuffer2.append(str);
            stringBuffer2.append(" could not be instantiated: ");
            stringBuffer2.append(e11);
            throw new a(stringBuffer2.toString(), e11);
        }
    }
}
