package io.odeeo.internal.p0;

import android.net.Uri;
import io.odeeo.internal.p0.i;
import io.odeeo.internal.q0.g0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public interface t extends i {

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a extends c {
        public a(IOException iOException, m mVar) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, mVar, 2007, 1);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public interface b extends i.a {
        @Override // io.odeeo.internal.p0.i.a
        t createDataSource();

        b setDefaultRequestProperties(Map<String, String> map);
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class c extends j {

        /* renamed from: b, reason: collision with root package name */
        public final m f65725b;

        /* renamed from: c, reason: collision with root package name */
        public final int f65726c;

        @Deprecated
        public c(m mVar, int i10) {
            this(mVar, 2000, i10);
        }

        public static int a(int i10, int i11) {
            if (i10 == 2000 && i11 == 1) {
                return 2001;
            }
            return i10;
        }

        public static c createForIOException(IOException iOException, m mVar, int i10) {
            String message = iOException.getMessage();
            int i11 = iOException instanceof SocketTimeoutException ? 2002 : iOException instanceof InterruptedIOException ? 1004 : (message == null || !io.odeeo.internal.t0.c.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            return i11 == 2007 ? new a(iOException, mVar) : new c(iOException, mVar, i11, i10);
        }

        public c(m mVar, int i10, int i11) {
            super(a(i10, i11));
            this.f65725b = mVar;
            this.f65726c = i11;
        }

        @Deprecated
        public c(String str, m mVar, int i10) {
            this(str, mVar, 2000, i10);
        }

        public c(String str, m mVar, int i10, int i11) {
            super(str, a(i10, i11));
            this.f65725b = mVar;
            this.f65726c = i11;
        }

        @Deprecated
        public c(IOException iOException, m mVar, int i10) {
            this(iOException, mVar, 2000, i10);
        }

        public c(IOException iOException, m mVar, int i10, int i11) {
            super(iOException, a(i10, i11));
            this.f65725b = mVar;
            this.f65726c = i11;
        }

        @Deprecated
        public c(String str, IOException iOException, m mVar, int i10) {
            this(str, iOException, mVar, 2000, i10);
        }

        public c(String str, IOException iOException, m mVar, int i10, int i11) {
            super(str, iOException, a(i10, i11));
            this.f65725b = mVar;
            this.f65726c = i11;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class d extends c {

        /* renamed from: d, reason: collision with root package name */
        public final String f65727d;

        public d(String str, m mVar) {
            super(a.b.k("Invalid content type: ", str), mVar, 2003, 1);
            this.f65727d = str;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class e extends c {

        /* renamed from: d, reason: collision with root package name */
        public final int f65728d;

        /* renamed from: e, reason: collision with root package name */
        public final String f65729e;

        /* renamed from: f, reason: collision with root package name */
        public final Map<String, List<String>> f65730f;

        /* renamed from: g, reason: collision with root package name */
        public final byte[] f65731g;

        @Deprecated
        public e(int i10, Map<String, List<String>> map, m mVar) {
            this(i10, null, null, map, mVar, g0.f65866f);
        }

        @Deprecated
        public e(int i10, String str, Map<String, List<String>> map, m mVar) {
            this(i10, str, null, map, mVar, g0.f65866f);
        }

        public e(int i10, String str, IOException iOException, Map<String, List<String>> map, m mVar, byte[] bArr) {
            super(a.b.e(i10, "Response code: "), iOException, mVar, 2004, 1);
            this.f65728d = i10;
            this.f65729e = str;
            this.f65730f = map;
            this.f65731g = bArr;
        }
    }

    @Override // io.odeeo.internal.p0.i
    /* synthetic */ void addTransferListener(b0 b0Var);

    void clearAllRequestProperties();

    void clearRequestProperty(String str);

    @Override // io.odeeo.internal.p0.i
    void close() throws c;

    int getResponseCode();

    @Override // io.odeeo.internal.p0.i
    Map<String, List<String>> getResponseHeaders();

    @Override // io.odeeo.internal.p0.i
    /* synthetic */ Uri getUri();

    @Override // io.odeeo.internal.p0.i
    long open(m mVar) throws c;

    @Override // io.odeeo.internal.p0.i, io.odeeo.internal.p0.g
    int read(byte[] bArr, int i10, int i11) throws c;

    void setRequestProperty(String str, String str2);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final Map<String, String> f65732a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public Map<String, String> f65733b;

        public synchronized void clear() {
            this.f65733b = null;
            this.f65732a.clear();
        }

        public synchronized void clearAndSet(Map<String, String> map) {
            this.f65733b = null;
            this.f65732a.clear();
            this.f65732a.putAll(map);
        }

        public synchronized Map<String, String> getSnapshot() {
            try {
                if (this.f65733b == null) {
                    this.f65733b = Collections.unmodifiableMap(new HashMap(this.f65732a));
                }
            } catch (Throwable th2) {
                throw th2;
            }
            return this.f65733b;
        }

        public synchronized void remove(String str) {
            this.f65733b = null;
            this.f65732a.remove(str);
        }

        public synchronized void set(String str, String str2) {
            this.f65733b = null;
            this.f65732a.put(str, str2);
        }

        public synchronized void set(Map<String, String> map) {
            this.f65733b = null;
            this.f65732a.putAll(map);
        }
    }
}
