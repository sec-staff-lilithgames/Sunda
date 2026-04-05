package yv;

import com.ironsource.C3191e4;
import j$.util.DesugarTimeZone;
import j1.o2;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.e0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import o9.b3;
import pw.b1;
import pw.k;
import qv.m;
import qv.v;
import sv.n0;
import uu.j1;
import uu.p0;
import uu.q0;
import xv.b0;
import xv.c0;
import xv.f0;
import xv.g0;
import xv.l0;
import xv.v0;
import xv.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final TimeZone f96667a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f96668b;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        e0.checkNotNull(timeZone);
        f96667a = timeZone;
        String name = l0.class.getName();
        e0.checkNotNullExpressionValue(name, "getName(...)");
        f96668b = n0.removeSuffix(n0.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final c0 asFactory(b0 b0Var) {
        e0.checkNotNullParameter(b0Var, "<this>");
        return new b3(b0Var, 29);
    }

    public static final void assertLockNotHeld(x xVar) {
        e0.checkNotNullParameter(xVar, "<this>");
    }

    public static final boolean canReuseConnectionFor(g0 g0Var, g0 other) {
        e0.checkNotNullParameter(g0Var, "<this>");
        e0.checkNotNullParameter(other, "other");
        return e0.areEqual(g0Var.host(), other.host()) && g0Var.port() == other.port() && e0.areEqual(g0Var.scheme(), other.scheme());
    }

    public static final int checkDuration(String name, long j10, TimeUnit unit) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(unit, "unit");
        if (j10 < 0) {
            throw new IllegalStateException(o2.l(name, " < 0").toString());
        }
        long millis = unit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(o2.l(name, " too large").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(o2.l(name, " too small").toString());
    }

    /* renamed from: checkDuration-HG0u8IE, reason: not valid java name */
    public static final int m8014checkDurationHG0u8IE(String name, long j10) {
        e0.checkNotNullParameter(name, "name");
        if (tv.f.m7205isNegativeimpl(j10)) {
            throw new IllegalStateException(o2.l(name, " < 0").toString());
        }
        long jM7195getInWholeMillisecondsimpl = tv.f.m7195getInWholeMillisecondsimpl(j10);
        if (jM7195getInWholeMillisecondsimpl > 2147483647L) {
            throw new IllegalArgumentException(o2.l(name, " too large").toString());
        }
        if (jM7195getInWholeMillisecondsimpl == 0 && tv.f.m7206isPositiveimpl(j10)) {
            throw new IllegalArgumentException(o2.l(name, " too small").toString());
        }
        return (int) jM7195getInWholeMillisecondsimpl;
    }

    public static final void closeQuietly(Socket socket) throws IOException {
        e0.checkNotNullParameter(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!e0.areEqual(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean discard(b1 b1Var, int i10, TimeUnit timeUnit) {
        e0.checkNotNullParameter(b1Var, "<this>");
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return skipAll(b1Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String format(String format, Object... args) {
        e0.checkNotNullParameter(format, "format");
        e0.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        e0.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static final long headersContentLength(v0 v0Var) {
        e0.checkNotNullParameter(v0Var, "<this>");
        String str = v0Var.headers().get("Content-Length");
        if (str != null) {
            return h.toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... elements) {
        e0.checkNotNullParameter(elements, "elements");
        return toImmutableList(elements);
    }

    public static final boolean isHealthy(Socket socket, k source) throws SocketException {
        e0.checkNotNullParameter(socket, "<this>");
        e0.checkNotNullParameter(source, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !source.exhausted();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final String peerName(Socket socket) {
        e0.checkNotNullParameter(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        e0.checkNotNullExpressionValue(hostName, "getHostName(...)");
        return hostName;
    }

    public static final Charset readBomAsCharset(k kVar, Charset charset) throws IOException {
        e0.checkNotNullParameter(kVar, "<this>");
        e0.checkNotNullParameter(charset, "default");
        int iSelect = kVar.select(h.getUNICODE_BOMS());
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            return sv.g.f86134b;
        }
        if (iSelect == 1) {
            return sv.g.f86135c;
        }
        if (iSelect == 2) {
            return sv.g.f86133a.UTF32_LE();
        }
        if (iSelect == 3) {
            return sv.g.f86136d;
        }
        if (iSelect == 4) {
            return sv.g.f86133a.UTF32_BE();
        }
        throw new AssertionError();
    }

    public static final <T> T readFieldOrNull(Object instance, Class<T> fieldType, String fieldName) throws IllegalAccessException, NoSuchFieldException, SecurityException, IllegalArgumentException {
        T tCast;
        Object fieldOrNull;
        e0.checkNotNullParameter(instance, "instance");
        e0.checkNotNullParameter(fieldType, "fieldType");
        e0.checkNotNullParameter(fieldName, "fieldName");
        Class<?> superclass = instance.getClass();
        while (true) {
            tCast = null;
            if (e0.areEqual(superclass, Object.class)) {
                if (e0.areEqual(fieldName, "delegate") || (fieldOrNull = readFieldOrNull(instance, Object.class, "delegate")) == null) {
                    return null;
                }
                return (T) readFieldOrNull(fieldOrNull, fieldType, fieldName);
            }
            try {
                Field declaredField = superclass.getDeclaredField(fieldName);
                declaredField.setAccessible(true);
                Object obj = declaredField.get(instance);
                if (!fieldType.isInstance(obj)) {
                    break;
                }
                tCast = fieldType.cast(obj);
                break;
            } catch (NoSuchFieldException unused) {
                superclass = superclass.getSuperclass();
                e0.checkNotNullExpressionValue(superclass, "getSuperclass(...)");
            }
        }
        return tCast;
    }

    public static final boolean skipAll(b1 b1Var, int i10, TimeUnit timeUnit) throws IOException {
        e0.checkNotNullParameter(b1Var, "<this>");
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = b1Var.timeout().hasDeadline() ? b1Var.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        b1Var.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            pw.g gVar = new pw.g();
            while (b1Var.read(gVar, 8192L) != -1) {
                gVar.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                b1Var.timeout().clearDeadline();
                return true;
            }
            b1Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                b1Var.timeout().clearDeadline();
                return false;
            }
            b1Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th2) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                b1Var.timeout().clearDeadline();
            } else {
                b1Var.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th2;
        }
    }

    public static final ThreadFactory threadFactory(String name, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        return new k8.a(1, name, z10);
    }

    public static final void threadName(String name, kv.a block) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(block, "block");
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        threadCurrentThread.setName(name);
        try {
            block.invoke();
        } finally {
            kotlin.jvm.internal.b0.finallyStart(1);
            threadCurrentThread.setName(name2);
            kotlin.jvm.internal.b0.finallyEnd(1);
        }
    }

    public static final List<fw.f> toHeaderList(f0 f0Var) {
        e0.checkNotNullParameter(f0Var, "<this>");
        m mVarUntil = v.until(0, f0Var.size());
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(mVarUntil, 10));
        Iterator it = mVarUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j1) it).nextInt();
            arrayList.add(new fw.f(f0Var.name(iNextInt), f0Var.value(iNextInt)));
        }
        return arrayList;
    }

    public static final f0 toHeaders(List<fw.f> list) {
        e0.checkNotNullParameter(list, "<this>");
        f0.a aVar = new f0.a();
        for (fw.f fVar : list) {
            aVar.addLenient$okhttp(fVar.component1().utf8(), fVar.component2().utf8());
        }
        return aVar.build();
    }

    public static final String toHexString(long j10) {
        String hexString = Long.toHexString(j10);
        e0.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }

    public static final String toHostHeader(g0 g0Var, boolean z10) {
        String strHost;
        e0.checkNotNullParameter(g0Var, "<this>");
        if (n0.contains$default((CharSequence) g0Var.host(), (CharSequence) ":", false, 2, (Object) null)) {
            strHost = C3191e4.i.f36529d + g0Var.host() + AbstractJsonLexerKt.END_LIST;
        } else {
            strHost = g0Var.host();
        }
        if (!z10 && g0Var.port() == g0.f93628j.defaultPort(g0Var.scheme())) {
            return strHost;
        }
        StringBuilder sbS = a.b.s(strHost, AbstractJsonLexerKt.COLON);
        sbS.append(g0Var.port());
        return sbS.toString();
    }

    public static /* synthetic */ String toHostHeader$default(g0 g0Var, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toHostHeader(g0Var, z10);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        e0.checkNotNullParameter(list, "<this>");
        if (list.isEmpty()) {
            return p0.emptyList();
        }
        if (list.size() == 1) {
            List<T> listSingletonList = Collections.singletonList(list.get(0));
            e0.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        e0.checkNotNullExpressionValue(array, "toArray(...)");
        List<T> listUnmodifiableList = Collections.unmodifiableList(uu.f0.asList(array));
        e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        e0.checkNotNull(listUnmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return listUnmodifiableList;
    }

    public static final <T> List<T> unmodifiable(List<? extends T> list) {
        e0.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(list);
        e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }

    public static final String toHexString(int i10) {
        String hexString = Integer.toHexString(i10);
        e0.checkNotNullExpressionValue(hexString, "toHexString(...)");
        return hexString;
    }

    public static final <T> Set<T> unmodifiable(Set<? extends T> set) {
        e0.checkNotNullParameter(set, "<this>");
        Set<T> setUnmodifiableSet = Collections.unmodifiableSet(set);
        e0.checkNotNullExpressionValue(setUnmodifiableSet, "unmodifiableSet(...)");
        return setUnmodifiableSet;
    }

    public static final <K, V> Map<K, V> unmodifiable(Map<K, ? extends V> map) {
        e0.checkNotNullParameter(map, "<this>");
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(map);
        e0.checkNotNullExpressionValue(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public static final void closeQuietly(ServerSocket serverSocket) throws IOException {
        e0.checkNotNullParameter(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final <T> List<T> toImmutableList(T[] tArr) {
        if (tArr != null && tArr.length != 0) {
            if (tArr.length == 1) {
                List<T> listSingletonList = Collections.singletonList(tArr[0]);
                e0.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
                return listSingletonList;
            }
            List<T> listUnmodifiableList = Collections.unmodifiableList(uu.f0.asList((Object[]) tArr.clone()));
            e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(...)");
            return listUnmodifiableList;
        }
        return p0.emptyList();
    }

    public static final void skipAll(k kVar) throws IOException {
        e0.checkNotNullParameter(kVar, "<this>");
        while (!kVar.exhausted()) {
            kVar.skip(kVar.getBuffer().size());
        }
    }
}
