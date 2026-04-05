package com.applovin.shadow.okhttp3.internal;

import a.b;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.Headers;
import com.applovin.shadow.okhttp3.HttpUrl;
import com.applovin.shadow.okhttp3.MediaType;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.RequestBody;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import com.applovin.shadow.okhttp3.internal.http2.Header;
import com.applovin.shadow.okhttp3.internal.io.FileSystem;
import com.applovin.shadow.okio.Buffer;
import com.applovin.shadow.okio.BufferedSink;
import com.applovin.shadow.okio.BufferedSource;
import com.applovin.shadow.okio.ByteString;
import com.applovin.shadow.okio.Options;
import com.applovin.shadow.okio.Sink;
import com.applovin.shadow.okio.Source;
import com.bytedance.sdk.openadsdk.multipro.xsB.LJjmO;
import com.google.android.gms.ads.nonagon.util.logging.csi.iPgB.gjnZrsdA;
import com.ironsource.C3191e4;
import gv.d;
import ha.a;
import i2.hQ.aTNDubNmpwAqdU;
import j$.util.DesugarTimeZone;
import j1.o2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
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
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.h1;
import kotlin.jvm.internal.i;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import kv.l;
import qv.m;
import qv.v;
import sv.g;
import sv.n0;
import sv.x;
import tu.h;
import uu.j1;
import uu.k0;
import uu.p0;
import uu.p1;
import uu.q0;
import uu.y0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes2.dex */
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.Companion.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final Options UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final x VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.Companion, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.Companion, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        Options.Companion companion = Options.Companion;
        ByteString.Companion companion2 = ByteString.Companion;
        UNICODE_BOMS = companion.of(companion2.decodeHex("efbbbf"), companion2.decodeHex("feff"), companion2.decodeHex("fffe"), companion2.decodeHex("0000ffff"), companion2.decodeHex("ffff0000"));
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        e0.checkNotNull(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new x("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        e0.checkNotNullExpressionValue(name, "OkHttpClient::class.java.name");
        okHttpName = n0.removeSuffix(n0.removePrefix(name, (CharSequence) "com.applovin.shadow.okhttp3."), (CharSequence) "Client");
    }

    public static final <E> void addIfAbsent(List<E> list, E e10) {
        e0.checkNotNullParameter(list, "<this>");
        if (list.contains(e10)) {
            return;
        }
        list.add(e10);
    }

    public static final int and(byte b10, int i10) {
        return b10 & i10;
    }

    public static final EventListener.Factory asFactory(EventListener eventListener) {
        e0.checkNotNullParameter(eventListener, "<this>");
        return new a(eventListener, 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener this_asFactory, Call it) {
        e0.checkNotNullParameter(this_asFactory, "$this_asFactory");
        e0.checkNotNullParameter(it, "it");
        return this_asFactory;
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        e0.checkNotNullParameter(obj, "<this>");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + obj);
        }
    }

    public static final void assertThreadHoldsLock(Object obj) {
        e0.checkNotNullParameter(obj, "<this>");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + obj);
    }

    public static final boolean canParseAsIpAddress(String str) {
        e0.checkNotNullParameter(str, "<this>");
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl other) {
        e0.checkNotNullParameter(httpUrl, "<this>");
        e0.checkNotNullParameter(other, "other");
        return e0.areEqual(httpUrl.host(), other.host()) && httpUrl.port() == other.port() && e0.areEqual(httpUrl.scheme(), other.scheme());
    }

    public static final int checkDuration(String name, long j10, TimeUnit timeUnit) {
        e0.checkNotNullParameter(name, "name");
        if (j10 < 0) {
            throw new IllegalStateException(o2.l(name, " < 0").toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null");
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException(o2.l(name, " too large.").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException(o2.l(name, " too small.").toString());
    }

    public static final void checkOffsetAndCount(long j10, long j11, long j12) {
        if ((j11 | j12) < 0 || j11 > j10 || j10 - j11 < j12) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final void closeQuietly(Closeable closeable) throws IOException {
        e0.checkNotNullParameter(closeable, "<this>");
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String[] concat(String[] strArr, String value) {
        e0.checkNotNullParameter(strArr, "<this>");
        e0.checkNotNullParameter(value, "value");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        e0.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[k0.getLastIndex(strArr2)] = value;
        return strArr2;
    }

    public static final int delimiterOffset(String str, String delimiters, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        e0.checkNotNullParameter(delimiters, "delimiters");
        while (i10 < i11) {
            if (n0.contains$default((CharSequence) delimiters, str.charAt(i10), false, 2, (Object) null)) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, str2, i10, i11);
    }

    public static final boolean discard(Source source, int i10, TimeUnit timeUnit) {
        e0.checkNotNullParameter(source, "<this>");
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        try {
            return skipAll(source, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, l predicate) {
        e0.checkNotNullParameter(iterable, "<this>");
        e0.checkNotNullParameter(predicate, "predicate");
        List<T> listEmptyList = p0.emptyList();
        for (T t10 : iterable) {
            if (((Boolean) predicate.invoke(t10)).booleanValue()) {
                if (listEmptyList.isEmpty()) {
                    listEmptyList = new ArrayList<>();
                }
                e0.checkNotNull(listEmptyList, "null cannot be cast to non-null type kotlin.collections.MutableList<T of okhttp3.internal.Util.filterList>");
                h1.asMutableList(listEmptyList).add(t10);
            }
        }
        return listEmptyList;
    }

    public static final String format(String format, Object... args) {
        e0.checkNotNullParameter(format, "format");
        e0.checkNotNullParameter(args, "args");
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(locale, format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        e0.checkNotNullExpressionValue(str, "format(locale, format, *args)");
        return str;
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        e0.checkNotNullParameter(strArr, "<this>");
        e0.checkNotNullParameter(comparator, "comparator");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator it = i.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final long headersContentLength(Response response) {
        e0.checkNotNullParameter(response, "<this>");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final void ignoreIoExceptions(kv.a block) {
        e0.checkNotNullParameter(block, "block");
        try {
            block.invoke();
        } catch (IOException unused) {
        }
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... elements) {
        e0.checkNotNullParameter(elements, "elements");
        Object[] objArr = (Object[]) elements.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(p0.listOf(Arrays.copyOf(objArr, objArr.length)));
        e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(listOf(*elements.clone()))");
        return listUnmodifiableList;
    }

    public static final int indexOf(String[] strArr, String value, Comparator<String> comparator) {
        e0.checkNotNullParameter(strArr, "<this>");
        e0.checkNotNullParameter(value, "value");
        e0.checkNotNullParameter(comparator, "comparator");
        int length = strArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (comparator.compare(strArr[i10], value) == 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        int i12 = i11 - 1;
        if (i10 <= i12) {
            while (true) {
                char cCharAt = str.charAt(i12);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i12 + 1;
                }
                if (i12 == i10) {
                    break;
                }
                i12--;
            }
        }
        return i10;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i10, i11);
    }

    public static final int indexOfNonWhitespace(String str, int i10) {
        e0.checkNotNullParameter(str, "<this>");
        int length = str.length();
        while (i10 < length) {
            char cCharAt = str.charAt(i10);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return indexOfNonWhitespace(str, i10);
    }

    public static final String[] intersect(String[] strArr, String[] other, Comparator<? super String> comparator) {
        e0.checkNotNullParameter(strArr, "<this>");
        e0.checkNotNullParameter(other, "other");
        e0.checkNotNullParameter(comparator, "comparator");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            int length = other.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (comparator.compare(str, other[i10]) == 0) {
                    arrayList.add(str);
                    break;
                }
                i10++;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) throws IOException {
        e0.checkNotNullParameter(fileSystem, "<this>");
        e0.checkNotNullParameter(file, "file");
        Sink sink = fileSystem.sink(file);
        try {
            fileSystem.delete(file);
            d.closeFinally(sink, null);
            return true;
        } catch (IOException unused) {
            d.closeFinally(sink, null);
            fileSystem.delete(file);
            return false;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                d.closeFinally(sink, th2);
                throw th3;
            }
        }
    }

    public static final boolean isHealthy(Socket socket, BufferedSource source) throws SocketException {
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

    public static final boolean isSensitiveHeader(String name) {
        e0.checkNotNullParameter(name, "name");
        return sv.k0.equals(name, "Authorization", true) || sv.k0.equals(name, "Cookie", true) || sv.k0.equals(name, "Proxy-Authorization", true) || sv.k0.equals(name, "Set-Cookie", true);
    }

    public static final void notify(Object obj) {
        e0.checkNotNullParameter(obj, "<this>");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        e0.checkNotNullParameter(obj, "<this>");
        obj.notifyAll();
    }

    public static final int parseHexDigit(char c10) {
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        if ('a' <= c10 && c10 < 'g') {
            return c10 - 'W';
        }
        if ('A' > c10 || c10 >= 'G') {
            return -1;
        }
        return c10 - '7';
    }

    public static final String peerName(Socket socket) {
        e0.checkNotNullParameter(socket, "<this>");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        e0.checkNotNullExpressionValue(hostName, "address.hostName");
        return hostName;
    }

    public static final Charset readBomAsCharset(BufferedSource bufferedSource, Charset charset) throws IOException {
        e0.checkNotNullParameter(bufferedSource, "<this>");
        e0.checkNotNullParameter(charset, "default");
        int iSelect = bufferedSource.select(UNICODE_BOMS);
        if (iSelect == -1) {
            return charset;
        }
        if (iSelect == 0) {
            Charset UTF_8 = StandardCharsets.UTF_8;
            e0.checkNotNullExpressionValue(UTF_8, "UTF_8");
            return UTF_8;
        }
        if (iSelect == 1) {
            Charset UTF_16BE = StandardCharsets.UTF_16BE;
            e0.checkNotNullExpressionValue(UTF_16BE, "UTF_16BE");
            return UTF_16BE;
        }
        if (iSelect == 2) {
            Charset UTF_16LE = StandardCharsets.UTF_16LE;
            e0.checkNotNullExpressionValue(UTF_16LE, "UTF_16LE");
            return UTF_16LE;
        }
        if (iSelect == 3) {
            return g.f86133a.UTF32_BE();
        }
        if (iSelect == 4) {
            return g.f86133a.UTF32_LE();
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
                e0.checkNotNullExpressionValue(superclass, "c.superclass");
            }
        }
        return tCast;
    }

    public static final int readMedium(BufferedSource bufferedSource) throws IOException {
        e0.checkNotNullParameter(bufferedSource, "<this>");
        return and(bufferedSource.readByte(), 255) | (and(bufferedSource.readByte(), 255) << 16) | (and(bufferedSource.readByte(), 255) << 8);
    }

    public static final boolean skipAll(Source source, int i10, TimeUnit timeUnit) throws IOException {
        e0.checkNotNullParameter(source, "<this>");
        e0.checkNotNullParameter(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = source.timeout().hasDeadline() ? source.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        source.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            Buffer buffer = new Buffer();
            while (source.read(buffer, 8192L) != -1) {
                buffer.clear();
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return true;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
                return false;
            }
            source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th2) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                source.timeout().clearDeadline();
            } else {
                source.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th2;
        }
    }

    public static final ThreadFactory threadFactory(String name, boolean z10) {
        e0.checkNotNullParameter(name, "name");
        return new k8.a(0, name, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String name, boolean z10, Runnable runnable) {
        e0.checkNotNullParameter(name, "$name");
        Thread thread = new Thread(runnable, name);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List<Header> toHeaderList(Headers headers) {
        e0.checkNotNullParameter(headers, "<this>");
        m mVarUntil = v.until(0, headers.size());
        ArrayList arrayList = new ArrayList(q0.collectionSizeOrDefault(mVarUntil, 10));
        Iterator it = mVarUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j1) it).nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    public static final Headers toHeaders(List<Header> list) {
        e0.checkNotNullParameter(list, "<this>");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            builder.addLenient$okhttp(header.component1().utf8(), header.component2().utf8());
        }
        return builder.build();
    }

    public static final String toHexString(long j10) {
        String hexString = Long.toHexString(j10);
        e0.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z10) {
        String strHost;
        e0.checkNotNullParameter(httpUrl, "<this>");
        if (n0.contains$default((CharSequence) httpUrl.host(), (CharSequence) ":", false, 2, (Object) null)) {
            strHost = C3191e4.i.f36529d + httpUrl.host() + AbstractJsonLexerKt.END_LIST;
        } else {
            strHost = httpUrl.host();
        }
        if (!z10 && httpUrl.port() == HttpUrl.Companion.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        StringBuilder sbS = b.s(strHost, AbstractJsonLexerKt.COLON);
        sbS.append(httpUrl.port());
        return sbS.toString();
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return toHostHeader(httpUrl, z10);
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        e0.checkNotNullParameter(list, "<this>");
        List<T> listUnmodifiableList = Collections.unmodifiableList(y0.toMutableList((Collection) list));
        e0.checkNotNullExpressionValue(listUnmodifiableList, "unmodifiableList(toMutableList())");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        e0.checkNotNullParameter(map, "<this>");
        if (map.isEmpty()) {
            return p1.emptyMap();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        e0.checkNotNullExpressionValue(mapUnmodifiableMap, "{\n    Collections.unmodi…(LinkedHashMap(this))\n  }");
        return mapUnmodifiableMap;
    }

    public static final long toLongOrDefault(String str, long j10) {
        e0.checkNotNullParameter(str, "<this>");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j10;
        }
    }

    public static final int toNonNegativeInt(String str, int i10) throws NumberFormatException {
        if (str != null) {
            try {
                long j10 = Long.parseLong(str);
                if (j10 > 2147483647L) {
                    return Integer.MAX_VALUE;
                }
                if (j10 < 0) {
                    return 0;
                }
                return (int) j10;
            } catch (NumberFormatException unused) {
            }
        }
        return i10;
    }

    public static final String trimSubstring(String str, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i10, i11);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i11));
        e0.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        return trimSubstring(str, i10, i11);
    }

    public static final void wait(Object obj) throws InterruptedException {
        e0.checkNotNullParameter(obj, "<this>");
        obj.wait();
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> suppressed) {
        e0.checkNotNullParameter(exc, "<this>");
        e0.checkNotNullParameter(suppressed, "suppressed");
        Iterator<? extends Exception> it = suppressed.iterator();
        while (it.hasNext()) {
            h.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final void writeMedium(BufferedSink bufferedSink, int i10) throws IOException {
        e0.checkNotNullParameter(bufferedSink, "<this>");
        bufferedSink.writeByte((i10 >>> 16) & 255);
        bufferedSink.writeByte((i10 >>> 8) & 255);
        bufferedSink.writeByte(i10 & 255);
    }

    public static final int and(short s10, int i10) {
        return s10 & i10;
    }

    public static final int delimiterOffset(String str, char c10, int i10, int i11) {
        e0.checkNotNullParameter(str, "<this>");
        while (i10 < i11) {
            if (str.charAt(i10) == c10) {
                return i10;
            }
            i10++;
        }
        return i11;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = str.length();
        }
        return delimiterOffset(str, c10, i10, i11);
    }

    public static final int indexOfControlOrNonAscii(String str) {
        e0.checkNotNullParameter(str, gjnZrsdA.WngREYIozv);
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (e0.compare((int) cCharAt, 31) <= 0 || e0.compare((int) cCharAt, 127) >= 0) {
                return i10;
            }
        }
        return -1;
    }

    public static final void threadName(String name, kv.a aVar) {
        e0.checkNotNullParameter(name, "name");
        e0.checkNotNullParameter(aVar, aTNDubNmpwAqdU.MLdTTS);
        Thread threadCurrentThread = Thread.currentThread();
        String name2 = threadCurrentThread.getName();
        threadCurrentThread.setName(name);
        try {
            aVar.invoke();
        } finally {
            b0.finallyStart(1);
            threadCurrentThread.setName(name2);
            b0.finallyEnd(1);
        }
    }

    public static final String toHexString(int i10) {
        String hexString = Integer.toHexString(i10);
        e0.checkNotNullExpressionValue(hexString, "toHexString(this)");
        return hexString;
    }

    public static final long and(int i10, long j10) {
        return i10 & j10;
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

    public static final void closeQuietly(ServerSocket serverSocket) throws IOException {
        e0.checkNotNullParameter(serverSocket, "<this>");
        try {
            serverSocket.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final int skipAll(Buffer buffer, byte b10) throws EOFException {
        e0.checkNotNullParameter(buffer, LJjmO.DHDfsEhq);
        int i10 = 0;
        while (!buffer.exhausted() && buffer.getByte(0L) == b10) {
            i10++;
            buffer.readByte();
        }
        return i10;
    }
}
