package kotlinx.coroutines.internal;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import gv.d;
import io.odeeo.internal.h.vfsA.QCmNMSGd;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kv.l;
import sv.k0;
import sv.n0;
import tu.h;
import uu.q0;
import uu.v0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class FastServiceLoader {
    public static final FastServiceLoader INSTANCE = new FastServiceLoader();
    private static final String PREFIX = "META-INF/services/";

    private FastServiceLoader() {
    }

    private final MainDispatcherFactory createInstanceOf(Class<MainDispatcherFactory> cls, String str) {
        try {
            return cls.cast(Class.forName(str, true, cls.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private final <S> S getProviderInstance(String str, ClassLoader classLoader, Class<S> cls) throws ClassNotFoundException {
        Class<?> cls2 = Class.forName(str, false, classLoader);
        if (cls.isAssignableFrom(cls2)) {
            return cls.cast(cls2.getDeclaredConstructor(null).newInstance(null));
        }
        throw new IllegalArgumentException(("Expected service of class " + cls + ", but found " + cls2).toString());
    }

    private final <S> List<S> load(Class<S> cls, ClassLoader classLoader) {
        try {
            return loadProviders$kotlinx_coroutines_core(cls, classLoader);
        } catch (Throwable unused) {
            return y0.toList(ServiceLoader.load(cls, classLoader));
        }
    }

    private final List<String> parse(URL url) throws IOException {
        BufferedReader bufferedReader;
        String string = url.toString();
        if (!k0.startsWith$default(string, "jar", false, 2, null)) {
            bufferedReader = new BufferedReader(new InputStreamReader(url.openStream()));
            try {
                List<String> file = INSTANCE.parseFile(bufferedReader);
                d.closeFinally(bufferedReader, null);
                return file;
            } catch (Throwable th2) {
                try {
                    throw th2;
                } finally {
                }
            }
        }
        String strSubstringBefore$default = n0.substringBefore$default(n0.substringAfter$default(string, "jar:file:", (String) null, 2, (Object) null), '!', (String) null, 2, (Object) null);
        String strSubstringAfter$default = n0.substringAfter$default(string, "!/", (String) null, 2, (Object) null);
        JarFile jarFile = new JarFile(strSubstringBefore$default, false);
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(jarFile.getInputStream(new ZipEntry(strSubstringAfter$default)), C.UTF8_NAME));
            try {
                List<String> file2 = INSTANCE.parseFile(bufferedReader);
                d.closeFinally(bufferedReader, null);
                jarFile.close();
                return file2;
            } finally {
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                try {
                    jarFile.close();
                    throw th4;
                } catch (Throwable th5) {
                    h.addSuppressed(th3, th5);
                    throw th3;
                }
            }
        }
    }

    private final <R> R use(JarFile jarFile, l lVar) throws IOException {
        try {
            R r10 = (R) lVar.invoke(jarFile);
            b0.finallyStart(1);
            jarFile.close();
            b0.finallyEnd(1);
            return r10;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                b0.finallyStart(1);
                try {
                    jarFile.close();
                    b0.finallyEnd(1);
                    throw th3;
                } catch (Throwable th4) {
                    h.addSuppressed(th2, th4);
                    throw th2;
                }
            }
        }
    }

    public final List<MainDispatcherFactory> loadMainDispatcherFactory$kotlinx_coroutines_core() {
        MainDispatcherFactory mainDispatcherFactory;
        if (!FastServiceLoaderKt.getANDROID_DETECTED()) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory2 = null;
            try {
                mainDispatcherFactory = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused) {
                mainDispatcherFactory = null;
            }
            if (mainDispatcherFactory == null) {
                return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
            }
            arrayList.add(mainDispatcherFactory);
            try {
                mainDispatcherFactory2 = (MainDispatcherFactory) MainDispatcherFactory.class.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, MainDispatcherFactory.class.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            } catch (ClassNotFoundException unused2) {
            }
            if (mainDispatcherFactory2 == null) {
                return arrayList;
            }
            arrayList.add(mainDispatcherFactory2);
            return arrayList;
        } catch (Throwable unused3) {
            return load(MainDispatcherFactory.class, MainDispatcherFactory.class.getClassLoader());
        }
    }

    public final <S> List<S> loadProviders$kotlinx_coroutines_core(Class<S> cls, ClassLoader classLoader) {
        ArrayList list = Collections.list(classLoader.getResources(PREFIX.concat(cls.getName())));
        e0.checkNotNullExpressionValue(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            v0.addAll(arrayList, INSTANCE.parse((URL) it.next()));
        }
        Set set = y0.toSet(arrayList);
        if (set.isEmpty()) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
        }
        Set set2 = set;
        ArrayList arrayList2 = new ArrayList(q0.collectionSizeOrDefault(set2, 10));
        Iterator it2 = set2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(INSTANCE.getProviderInstance((String) it2.next(), classLoader, cls));
        }
        return arrayList2;
    }

    private final List<String> parseFile(BufferedReader bufferedReader) throws IOException {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                return y0.toList(linkedHashSet);
            }
            String string = n0.trim(n0.substringBefore$default(line, QCmNMSGd.MrV, (String) null, 2, (Object) null)).toString();
            for (int i10 = 0; i10 < string.length(); i10++) {
                char cCharAt = string.charAt(i10);
                if (cCharAt != '.' && !Character.isJavaIdentifierPart(cCharAt)) {
                    throw new IllegalArgumentException(a.b.k("Illegal service provider class name: ", string).toString());
                }
            }
            if (string.length() > 0) {
                linkedHashSet.add(string);
            }
        }
    }
}
