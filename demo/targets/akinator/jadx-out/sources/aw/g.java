package aw;

import androidx.lifecycle.c3;
import j1.o2;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import pw.b1;
import pw.h0;
import pw.n0;
import pw.r;
import pw.z0;
import sv.k0;
import sv.x;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes10.dex */
public final class g implements Closeable, Flushable {
    public static final String A;
    public static final String B;
    public static final long C;
    public static final x D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;

    /* renamed from: x, reason: collision with root package name */
    public static final String f8260x;

    /* renamed from: y, reason: collision with root package name */
    public static final String f8261y;

    /* renamed from: z, reason: collision with root package name */
    public static final String f8262z;

    /* renamed from: b, reason: collision with root package name */
    public final n0 f8263b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8264c;

    /* renamed from: e, reason: collision with root package name */
    public final int f8265e;

    /* renamed from: f, reason: collision with root package name */
    public final j f8266f;

    /* renamed from: g, reason: collision with root package name */
    public long f8267g;

    /* renamed from: h, reason: collision with root package name */
    public final n0 f8268h;

    /* renamed from: i, reason: collision with root package name */
    public final n0 f8269i;

    /* renamed from: j, reason: collision with root package name */
    public final n0 f8270j;

    /* renamed from: k, reason: collision with root package name */
    public long f8271k;

    /* renamed from: l, reason: collision with root package name */
    public pw.j f8272l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f8273m;

    /* renamed from: n, reason: collision with root package name */
    public int f8274n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8275o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8276p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8277q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f8278r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8279s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f8280t;

    /* renamed from: u, reason: collision with root package name */
    public long f8281u;

    /* renamed from: v, reason: collision with root package name */
    public final bw.c f8282v;

    /* renamed from: w, reason: collision with root package name */
    public final i f8283w;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class b {

        /* renamed from: a, reason: collision with root package name */
        public final c f8284a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f8285b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f8286c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f8287d;

        public b(g gVar, c entry) {
            e0.checkNotNullParameter(entry, "entry");
            this.f8287d = gVar;
            this.f8284a = entry;
            this.f8285b = entry.getReadable$okhttp() ? null : new boolean[gVar.getValueCount$okhttp()];
        }

        public final void abort() throws IOException {
            g gVar = this.f8287d;
            synchronized (gVar) {
                try {
                    if (this.f8286c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (e0.areEqual(this.f8284a.getCurrentEditor$okhttp(), this)) {
                        gVar.completeEdit$okhttp(this, false);
                    }
                    this.f8286c = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void commit() throws IOException {
            g gVar = this.f8287d;
            synchronized (gVar) {
                try {
                    if (this.f8286c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (e0.areEqual(this.f8284a.getCurrentEditor$okhttp(), this)) {
                        gVar.completeEdit$okhttp(this, true);
                    }
                    this.f8286c = true;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void detach$okhttp() throws IOException {
            c cVar = this.f8284a;
            if (e0.areEqual(cVar.getCurrentEditor$okhttp(), this)) {
                g gVar = this.f8287d;
                if (gVar.f8276p) {
                    gVar.completeEdit$okhttp(this, false);
                } else {
                    cVar.setZombie$okhttp(true);
                }
            }
        }

        public final c getEntry$okhttp() {
            return this.f8284a;
        }

        public final boolean[] getWritten$okhttp() {
            return this.f8285b;
        }

        public final z0 newSink(int i10) {
            g gVar = this.f8287d;
            synchronized (gVar) {
                if (this.f8286c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!e0.areEqual(this.f8284a.getCurrentEditor$okhttp(), this)) {
                    return h0.blackhole();
                }
                if (!this.f8284a.getReadable$okhttp()) {
                    boolean[] zArr = this.f8285b;
                    e0.checkNotNull(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new l(gVar.getFileSystem$okhttp().sink(this.f8284a.getDirtyFiles$okhttp().get(i10)), new c3(3, gVar, this));
                } catch (FileNotFoundException unused) {
                    return h0.blackhole();
                }
            }
        }

        public final b1 newSource(int i10) {
            g gVar = this.f8287d;
            synchronized (gVar) {
                if (this.f8286c) {
                    throw new IllegalStateException("Check failed.");
                }
                b1 b1VarSource = null;
                if (!this.f8284a.getReadable$okhttp() || !e0.areEqual(this.f8284a.getCurrentEditor$okhttp(), this) || this.f8284a.getZombie$okhttp()) {
                    return null;
                }
                try {
                    b1VarSource = gVar.getFileSystem$okhttp().source(this.f8284a.getCleanFiles$okhttp().get(i10));
                } catch (FileNotFoundException unused) {
                }
                return b1VarSource;
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class c {

        /* renamed from: a, reason: collision with root package name */
        public final String f8288a;

        /* renamed from: b, reason: collision with root package name */
        public final long[] f8289b;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayList f8290c;

        /* renamed from: d, reason: collision with root package name */
        public final ArrayList f8291d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f8292e;

        /* renamed from: f, reason: collision with root package name */
        public boolean f8293f;

        /* renamed from: g, reason: collision with root package name */
        public b f8294g;

        /* renamed from: h, reason: collision with root package name */
        public int f8295h;

        /* renamed from: i, reason: collision with root package name */
        public long f8296i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ g f8297j;

        public c(g gVar, String key) {
            e0.checkNotNullParameter(key, "key");
            this.f8297j = gVar;
            this.f8288a = key;
            this.f8289b = new long[gVar.getValueCount$okhttp()];
            this.f8290c = new ArrayList();
            this.f8291d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(key);
            sb2.append('.');
            int length = sb2.length();
            int valueCount$okhttp = gVar.getValueCount$okhttp();
            for (int i10 = 0; i10 < valueCount$okhttp; i10++) {
                sb2.append(i10);
                ArrayList arrayList = this.f8290c;
                n0 directory = this.f8297j.getDirectory();
                String string = sb2.toString();
                e0.checkNotNullExpressionValue(string, "toString(...)");
                arrayList.add(directory.resolve(string));
                sb2.append(".tmp");
                ArrayList arrayList2 = this.f8291d;
                n0 directory2 = this.f8297j.getDirectory();
                String string2 = sb2.toString();
                e0.checkNotNullExpressionValue(string2, "toString(...)");
                arrayList2.add(directory2.resolve(string2));
                sb2.setLength(length);
            }
        }

        public final List<n0> getCleanFiles$okhttp() {
            return this.f8290c;
        }

        public final b getCurrentEditor$okhttp() {
            return this.f8294g;
        }

        public final List<n0> getDirtyFiles$okhttp() {
            return this.f8291d;
        }

        public final String getKey$okhttp() {
            return this.f8288a;
        }

        public final long[] getLengths$okhttp() {
            return this.f8289b;
        }

        public final int getLockingSourceCount$okhttp() {
            return this.f8295h;
        }

        public final boolean getReadable$okhttp() {
            return this.f8292e;
        }

        public final long getSequenceNumber$okhttp() {
            return this.f8296i;
        }

        public final boolean getZombie$okhttp() {
            return this.f8293f;
        }

        public final void setCurrentEditor$okhttp(b bVar) {
            this.f8294g = bVar;
        }

        public final void setLengths$okhttp(List<String> strings) throws IOException {
            e0.checkNotNullParameter(strings, "strings");
            if (strings.size() != this.f8297j.getValueCount$okhttp()) {
                throw new IOException("unexpected journal line: " + strings);
            }
            try {
                int size = strings.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f8289b[i10] = Long.parseLong(strings.get(i10));
                }
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + strings);
            }
        }

        public final void setLockingSourceCount$okhttp(int i10) {
            this.f8295h = i10;
        }

        public final void setReadable$okhttp(boolean z10) {
            this.f8292e = z10;
        }

        public final void setSequenceNumber$okhttp(long j10) {
            this.f8296i = j10;
        }

        public final void setZombie$okhttp(boolean z10) {
            this.f8293f = z10;
        }

        public final d snapshot$okhttp() throws IOException {
            TimeZone timeZone = yv.i.f96667a;
            if (!this.f8292e) {
                return null;
            }
            g gVar = this.f8297j;
            if (!gVar.f8276p && (this.f8294g != null || this.f8293f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f8289b.clone();
            try {
                int valueCount$okhttp = gVar.getValueCount$okhttp();
                for (int i10 = 0; i10 < valueCount$okhttp; i10++) {
                    b1 b1VarSource = gVar.getFileSystem$okhttp().source((n0) this.f8290c.get(i10));
                    if (!gVar.f8276p) {
                        this.f8295h++;
                        b1VarSource = new h(b1VarSource, gVar, this);
                    }
                    arrayList.add(b1VarSource);
                }
                return new d(this.f8297j, this.f8288a, this.f8296i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    yv.h.closeQuietly((b1) it.next());
                }
                try {
                    gVar.removeEntry$okhttp(this);
                    return null;
                } catch (IOException unused2) {
                    return null;
                }
            }
        }

        public final void writeLengths$okhttp(pw.j writer) throws IOException {
            e0.checkNotNullParameter(writer, "writer");
            for (long j10 : this.f8289b) {
                writer.writeByte(32).writeDecimalLong(j10);
            }
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class d implements Closeable {

        /* renamed from: b, reason: collision with root package name */
        public final String f8298b;

        /* renamed from: c, reason: collision with root package name */
        public final long f8299c;

        /* renamed from: e, reason: collision with root package name */
        public final List f8300e;

        /* renamed from: f, reason: collision with root package name */
        public final long[] f8301f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ g f8302g;

        public d(g gVar, String key, long j10, List<? extends b1> sources, long[] lengths) {
            e0.checkNotNullParameter(key, "key");
            e0.checkNotNullParameter(sources, "sources");
            e0.checkNotNullParameter(lengths, "lengths");
            this.f8302g = gVar;
            this.f8298b = key;
            this.f8299c = j10;
            this.f8300e = sources;
            this.f8301f = lengths;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Iterator it = this.f8300e.iterator();
            while (it.hasNext()) {
                yv.h.closeQuietly((b1) it.next());
            }
        }

        public final b edit() throws IOException {
            return this.f8302g.edit(this.f8298b, this.f8299c);
        }

        public final long getLength(int i10) {
            return this.f8301f[i10];
        }

        public final b1 getSource(int i10) {
            return (b1) this.f8300e.get(i10);
        }

        public final String key() {
            return this.f8298b;
        }
    }

    static {
        new a(null);
        f8260x = "journal";
        f8261y = "journal.tmp";
        f8262z = "journal.bkp";
        A = "libcore.io.DiskLruCache";
        B = "1";
        C = -1L;
        D = new x("[a-z0-9_-]{1,120}");
        E = "CLEAN";
        F = "DIRTY";
        G = "REMOVE";
        H = "READ";
    }

    public g(r fileSystem, n0 directory, int i10, int i11, long j10, bw.g taskRunner) {
        e0.checkNotNullParameter(fileSystem, "fileSystem");
        e0.checkNotNullParameter(directory, "directory");
        e0.checkNotNullParameter(taskRunner, "taskRunner");
        this.f8263b = directory;
        this.f8264c = i10;
        this.f8265e = i11;
        this.f8266f = new j(fileSystem);
        this.f8267g = j10;
        this.f8273m = new LinkedHashMap(0, 0.75f, true);
        this.f8282v = taskRunner.newQueue();
        this.f8283w = new i(this, o2.o(new StringBuilder(), yv.i.f96668b, " Cache"));
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f8268h = directory.resolve(f8260x);
        this.f8269i = directory.resolve(f8261y);
        this.f8270j = directory.resolve(f8262z);
    }

    public static /* synthetic */ b edit$default(g gVar, String str, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = C;
        }
        return gVar.edit(str, j10);
    }

    public static void n(String str) {
        if (!D.matches(str)) {
            throw new IllegalArgumentException(o2.f(AbstractJsonLexerKt.STRING, "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        b currentEditor$okhttp;
        try {
            if (this.f8277q && !this.f8278r) {
                Collection collectionValues = this.f8273m.values();
                e0.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    e0.checkNotNull(cVar);
                    if (cVar.getCurrentEditor$okhttp() != null && (currentEditor$okhttp = cVar.getCurrentEditor$okhttp()) != null) {
                        currentEditor$okhttp.detach$okhttp();
                    }
                }
                trimToSize();
                pw.j jVar = this.f8272l;
                if (jVar != null) {
                    yv.h.closeQuietly(jVar);
                }
                this.f8272l = null;
                this.f8278r = true;
                return;
            }
            this.f8278r = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void completeEdit$okhttp(b editor, boolean z10) throws IOException {
        e0.checkNotNullParameter(editor, "editor");
        c entry$okhttp = editor.getEntry$okhttp();
        if (!e0.areEqual(entry$okhttp.getCurrentEditor$okhttp(), editor)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !entry$okhttp.getReadable$okhttp()) {
            int i10 = this.f8265e;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] written$okhttp = editor.getWritten$okhttp();
                e0.checkNotNull(written$okhttp);
                if (!written$okhttp[i11]) {
                    editor.abort();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f8266f.exists(entry$okhttp.getDirtyFiles$okhttp().get(i11))) {
                    editor.abort();
                    return;
                }
            }
        }
        int i12 = this.f8265e;
        for (int i13 = 0; i13 < i12; i13++) {
            n0 n0Var = entry$okhttp.getDirtyFiles$okhttp().get(i13);
            if (!z10 || entry$okhttp.getZombie$okhttp()) {
                yv.h.deleteIfExists(this.f8266f, n0Var);
            } else if (this.f8266f.exists(n0Var)) {
                n0 n0Var2 = entry$okhttp.getCleanFiles$okhttp().get(i13);
                this.f8266f.atomicMove(n0Var, n0Var2);
                long j10 = entry$okhttp.getLengths$okhttp()[i13];
                Long size = this.f8266f.metadata(n0Var2).getSize();
                long jLongValue = size != null ? size.longValue() : 0L;
                entry$okhttp.getLengths$okhttp()[i13] = jLongValue;
                this.f8271k = (this.f8271k - j10) + jLongValue;
            }
        }
        entry$okhttp.setCurrentEditor$okhttp(null);
        if (entry$okhttp.getZombie$okhttp()) {
            removeEntry$okhttp(entry$okhttp);
            return;
        }
        this.f8274n++;
        pw.j jVar = this.f8272l;
        e0.checkNotNull(jVar);
        if (entry$okhttp.getReadable$okhttp() || z10) {
            entry$okhttp.setReadable$okhttp(true);
            jVar.writeUtf8(E).writeByte(32);
            jVar.writeUtf8(entry$okhttp.getKey$okhttp());
            entry$okhttp.writeLengths$okhttp(jVar);
            jVar.writeByte(10);
            if (z10) {
                long j11 = this.f8281u;
                this.f8281u = 1 + j11;
                entry$okhttp.setSequenceNumber$okhttp(j11);
            }
        } else {
            this.f8273m.remove(entry$okhttp.getKey$okhttp());
            jVar.writeUtf8(G).writeByte(32);
            jVar.writeUtf8(entry$okhttp.getKey$okhttp());
            jVar.writeByte(10);
        }
        jVar.flush();
        if (this.f8271k > this.f8267g || h()) {
            bw.c.schedule$default(this.f8282v, this.f8283w, 0L, 2, null);
        }
    }

    public final synchronized void d() {
        if (this.f8278r) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public final void delete() throws IOException {
        close();
        yv.h.deleteContents(this.f8266f, this.f8263b);
    }

    public final b edit(String key) throws IOException {
        e0.checkNotNullParameter(key, "key");
        return edit$default(this, key, 0L, 2, null);
    }

    public final synchronized void evictAll() throws IOException {
        try {
            initialize();
            Collection collectionValues = this.f8273m.values();
            e0.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
            for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                e0.checkNotNull(cVar);
                removeEntry$okhttp(cVar);
            }
            this.f8279s = false;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() throws IOException {
        if (this.f8277q) {
            d();
            trimToSize();
            pw.j jVar = this.f8272l;
            e0.checkNotNull(jVar);
            jVar.flush();
        }
    }

    public final synchronized d get(String key) throws IOException {
        e0.checkNotNullParameter(key, "key");
        initialize();
        d();
        n(key);
        c cVar = (c) this.f8273m.get(key);
        if (cVar == null) {
            return null;
        }
        d dVarSnapshot$okhttp = cVar.snapshot$okhttp();
        if (dVarSnapshot$okhttp == null) {
            return null;
        }
        this.f8274n++;
        pw.j jVar = this.f8272l;
        e0.checkNotNull(jVar);
        jVar.writeUtf8(H).writeByte(32).writeUtf8(key).writeByte(10);
        if (h()) {
            bw.c.schedule$default(this.f8282v, this.f8283w, 0L, 2, null);
        }
        return dVarSnapshot$okhttp;
    }

    public final boolean getClosed$okhttp() {
        return this.f8278r;
    }

    public final n0 getDirectory() {
        return this.f8263b;
    }

    public final r getFileSystem$okhttp() {
        return this.f8266f;
    }

    public final LinkedHashMap<String, c> getLruEntries$okhttp() {
        return this.f8273m;
    }

    public final synchronized long getMaxSize() {
        return this.f8267g;
    }

    public final int getValueCount$okhttp() {
        return this.f8265e;
    }

    public final boolean h() {
        int i10 = this.f8274n;
        return i10 >= 2000 && i10 >= this.f8273m.size();
    }

    public final synchronized void initialize() throws IOException {
        try {
            TimeZone timeZone = yv.i.f96667a;
            if (this.f8277q) {
                return;
            }
            if (this.f8266f.exists(this.f8270j)) {
                if (this.f8266f.exists(this.f8268h)) {
                    this.f8266f.delete(this.f8270j);
                } else {
                    this.f8266f.atomicMove(this.f8270j, this.f8268h);
                }
            }
            this.f8276p = yv.h.isCivilized(this.f8266f, this.f8270j);
            if (this.f8266f.exists(this.f8268h)) {
                try {
                    l();
                    k();
                    this.f8277q = true;
                    return;
                } catch (IOException e10) {
                    okhttp3.internal.platform.c.f79515a.get().log("DiskLruCache " + this.f8263b + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        delete();
                        this.f8278r = false;
                    } catch (Throwable th2) {
                        this.f8278r = false;
                        throw th2;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.f8277q = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized boolean isClosed() {
        return this.f8278r;
    }

    public final void k() throws IOException {
        n0 n0Var = this.f8269i;
        j jVar = this.f8266f;
        yv.h.deleteIfExists(jVar, n0Var);
        Iterator it = this.f8273m.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            e0.checkNotNullExpressionValue(next, "next(...)");
            c cVar = (c) next;
            b currentEditor$okhttp = cVar.getCurrentEditor$okhttp();
            int i10 = this.f8265e;
            int i11 = 0;
            if (currentEditor$okhttp == null) {
                while (i11 < i10) {
                    this.f8271k += cVar.getLengths$okhttp()[i11];
                    i11++;
                }
            } else {
                cVar.setCurrentEditor$okhttp(null);
                while (i11 < i10) {
                    yv.h.deleteIfExists(jVar, cVar.getCleanFiles$okhttp().get(i11));
                    yv.h.deleteIfExists(jVar, cVar.getDirtyFiles$okhttp().get(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() throws java.lang.Throwable {
        /*
            r11 = this;
            java.lang.String r0 = ", "
            java.lang.String r1 = "unexpected journal header: ["
            aw.j r2 = r11.f8266f
            pw.n0 r3 = r11.f8268h
            pw.b1 r4 = r2.source(r3)
            pw.k r4 = pw.h0.buffer(r4)
            java.lang.String r5 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r6 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r8 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r9 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = aw.g.A     // Catch: java.lang.Throwable -> L5d
            boolean r10 = kotlin.jvm.internal.e0.areEqual(r10, r5)     // Catch: java.lang.Throwable -> L5d
            if (r10 == 0) goto L95
            java.lang.String r10 = aw.g.B     // Catch: java.lang.Throwable -> L5d
            boolean r10 = kotlin.jvm.internal.e0.areEqual(r10, r6)     // Catch: java.lang.Throwable -> L5d
            if (r10 == 0) goto L95
            int r10 = r11.f8264c     // Catch: java.lang.Throwable -> L5d
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L5d
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r10, r7)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L95
            int r7 = r11.f8265e     // Catch: java.lang.Throwable -> L5d
            java.lang.String r7 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L5d
            boolean r7 = kotlin.jvm.internal.e0.areEqual(r7, r8)     // Catch: java.lang.Throwable -> L5d
            if (r7 == 0) goto L95
            int r7 = r9.length()     // Catch: java.lang.Throwable -> L5d
            if (r7 > 0) goto L95
            r0 = 0
        L53:
            java.lang.String r1 = r4.readUtf8LineStrict()     // Catch: java.lang.Throwable -> L5d java.io.EOFException -> L5f
            r11.m(r1)     // Catch: java.lang.Throwable -> L5d java.io.EOFException -> L5f
            int r0 = r0 + 1
            goto L53
        L5d:
            r0 = move-exception
            goto Lbe
        L5f:
            java.util.LinkedHashMap r1 = r11.f8273m     // Catch: java.lang.Throwable -> L5d
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L5d
            int r0 = r0 - r1
            r11.f8274n = r0     // Catch: java.lang.Throwable -> L5d
            boolean r0 = r4.exhausted()     // Catch: java.lang.Throwable -> L5d
            if (r0 != 0) goto L72
            r11.rebuildJournal$okhttp()     // Catch: java.lang.Throwable -> L5d
            goto L8e
        L72:
            pw.j r0 = r11.f8272l     // Catch: java.lang.Throwable -> L5d
            if (r0 == 0) goto L79
            yv.h.closeQuietly(r0)     // Catch: java.lang.Throwable -> L5d
        L79:
            pw.z0 r0 = r2.appendingSink(r3)     // Catch: java.lang.Throwable -> L5d
            aw.l r1 = new aw.l     // Catch: java.lang.Throwable -> L5d
            aw.f r2 = new aw.f     // Catch: java.lang.Throwable -> L5d
            r3 = 0
            r2.<init>(r11, r3)     // Catch: java.lang.Throwable -> L5d
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L5d
            pw.j r0 = pw.h0.buffer(r1)     // Catch: java.lang.Throwable -> L5d
            r11.f8272l = r0     // Catch: java.lang.Throwable -> L5d
        L8e:
            r4.close()     // Catch: java.lang.Throwable -> L93
            r0 = 0
            goto Lc8
        L93:
            r0 = move-exception
            goto Lc8
        L95:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L5d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5d
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L5d
            r3.append(r5)     // Catch: java.lang.Throwable -> L5d
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            r3.append(r6)     // Catch: java.lang.Throwable -> L5d
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            r3.append(r8)     // Catch: java.lang.Throwable -> L5d
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            r3.append(r9)     // Catch: java.lang.Throwable -> L5d
            r0 = 93
            r3.append(r0)     // Catch: java.lang.Throwable -> L5d
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L5d
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L5d
            throw r2     // Catch: java.lang.Throwable -> L5d
        Lbe:
            if (r4 == 0) goto Lc8
            r4.close()     // Catch: java.lang.Throwable -> Lc4
            goto Lc8
        Lc4:
            r1 = move-exception
            tu.h.addSuppressed(r0, r1)
        Lc8:
            if (r0 != 0) goto Lcb
            return
        Lcb:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.g.l():void");
    }

    public final void m(String str) throws IOException {
        String strSubstring;
        int iIndexOf$default = sv.n0.indexOf$default((CharSequence) str, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default == -1) {
            throw new IOException(a.b.k("unexpected journal line: ", str));
        }
        int i10 = iIndexOf$default + 1;
        int iIndexOf$default2 = sv.n0.indexOf$default((CharSequence) str, ' ', i10, false, 4, (Object) null);
        LinkedHashMap linkedHashMap = this.f8273m;
        if (iIndexOf$default2 == -1) {
            strSubstring = str.substring(i10);
            e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
            String str2 = G;
            if (iIndexOf$default == str2.length() && k0.startsWith$default(str, str2, false, 2, null)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf$default2);
            e0.checkNotNullExpressionValue(strSubstring, "substring(...)");
        }
        c cVar = (c) linkedHashMap.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            linkedHashMap.put(strSubstring, cVar);
        }
        if (iIndexOf$default2 != -1) {
            String str3 = E;
            if (iIndexOf$default == str3.length() && k0.startsWith$default(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iIndexOf$default2 + 1);
                e0.checkNotNullExpressionValue(strSubstring2, "substring(...)");
                List<String> listSplit$default = sv.n0.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
                cVar.setReadable$okhttp(true);
                cVar.setCurrentEditor$okhttp(null);
                cVar.setLengths$okhttp(listSplit$default);
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str4 = F;
            if (iIndexOf$default == str4.length() && k0.startsWith$default(str, str4, false, 2, null)) {
                cVar.setCurrentEditor$okhttp(new b(this, cVar));
                return;
            }
        }
        if (iIndexOf$default2 == -1) {
            String str5 = H;
            if (iIndexOf$default == str5.length() && k0.startsWith$default(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException(a.b.k("unexpected journal line: ", str));
    }

    public final synchronized void rebuildJournal$okhttp() throws IOException {
        Throwable th2;
        try {
            pw.j jVar = this.f8272l;
            if (jVar != null) {
                jVar.close();
            }
            pw.j jVarBuffer = h0.buffer(this.f8266f.sink(this.f8269i, false));
            try {
                jVarBuffer.writeUtf8(A).writeByte(10);
                jVarBuffer.writeUtf8(B).writeByte(10);
                jVarBuffer.writeDecimalLong(this.f8264c).writeByte(10);
                jVarBuffer.writeDecimalLong(this.f8265e).writeByte(10);
                jVarBuffer.writeByte(10);
                for (Object obj : this.f8273m.values()) {
                    e0.checkNotNullExpressionValue(obj, "next(...)");
                    c cVar = (c) obj;
                    if (cVar.getCurrentEditor$okhttp() != null) {
                        jVarBuffer.writeUtf8(F).writeByte(32);
                        jVarBuffer.writeUtf8(cVar.getKey$okhttp());
                        jVarBuffer.writeByte(10);
                    } else {
                        jVarBuffer.writeUtf8(E).writeByte(32);
                        jVarBuffer.writeUtf8(cVar.getKey$okhttp());
                        cVar.writeLengths$okhttp(jVarBuffer);
                        jVarBuffer.writeByte(10);
                    }
                }
                try {
                    jVarBuffer.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                if (jVarBuffer != null) {
                    try {
                        jVarBuffer.close();
                    } catch (Throwable th5) {
                        tu.h.addSuppressed(th4, th5);
                    }
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.f8266f.exists(this.f8268h)) {
                this.f8266f.atomicMove(this.f8268h, this.f8270j);
                this.f8266f.atomicMove(this.f8269i, this.f8268h);
                yv.h.deleteIfExists(this.f8266f, this.f8270j);
            } else {
                this.f8266f.atomicMove(this.f8269i, this.f8268h);
            }
            pw.j jVar2 = this.f8272l;
            if (jVar2 != null) {
                yv.h.closeQuietly(jVar2);
            }
            this.f8272l = h0.buffer(new l(this.f8266f.appendingSink(this.f8268h), new f(this, 0)));
            this.f8275o = false;
            this.f8280t = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }

    public final synchronized boolean remove(String key) throws IOException {
        e0.checkNotNullParameter(key, "key");
        initialize();
        d();
        n(key);
        c cVar = (c) this.f8273m.get(key);
        if (cVar == null) {
            return false;
        }
        boolean zRemoveEntry$okhttp = removeEntry$okhttp(cVar);
        if (zRemoveEntry$okhttp && this.f8271k <= this.f8267g) {
            this.f8279s = false;
        }
        return zRemoveEntry$okhttp;
    }

    public final boolean removeEntry$okhttp(c entry) throws IOException {
        pw.j jVar;
        e0.checkNotNullParameter(entry, "entry");
        if (!this.f8276p) {
            if (entry.getLockingSourceCount$okhttp() > 0 && (jVar = this.f8272l) != null) {
                jVar.writeUtf8(F);
                jVar.writeByte(32);
                jVar.writeUtf8(entry.getKey$okhttp());
                jVar.writeByte(10);
                jVar.flush();
            }
            if (entry.getLockingSourceCount$okhttp() > 0 || entry.getCurrentEditor$okhttp() != null) {
                entry.setZombie$okhttp(true);
                return true;
            }
        }
        b currentEditor$okhttp = entry.getCurrentEditor$okhttp();
        if (currentEditor$okhttp != null) {
            currentEditor$okhttp.detach$okhttp();
        }
        for (int i10 = 0; i10 < this.f8265e; i10++) {
            yv.h.deleteIfExists(this.f8266f, entry.getCleanFiles$okhttp().get(i10));
            this.f8271k -= entry.getLengths$okhttp()[i10];
            entry.getLengths$okhttp()[i10] = 0;
        }
        this.f8274n++;
        pw.j jVar2 = this.f8272l;
        if (jVar2 != null) {
            jVar2.writeUtf8(G);
            jVar2.writeByte(32);
            jVar2.writeUtf8(entry.getKey$okhttp());
            jVar2.writeByte(10);
        }
        this.f8273m.remove(entry.getKey$okhttp());
        if (h()) {
            bw.c.schedule$default(this.f8282v, this.f8283w, 0L, 2, null);
        }
        return true;
    }

    public final void setClosed$okhttp(boolean z10) {
        this.f8278r = z10;
    }

    public final synchronized void setMaxSize(long j10) {
        this.f8267g = j10;
        if (this.f8277q) {
            bw.c.schedule$default(this.f8282v, this.f8283w, 0L, 2, null);
        }
    }

    public final synchronized long size() throws IOException {
        initialize();
        return this.f8271k;
    }

    public final synchronized Iterator<d> snapshots() throws IOException {
        initialize();
        return new k(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0029, code lost:
    
        removeEntry$okhttp(r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void trimToSize() throws java.io.IOException {
        /*
            r4 = this;
        L0:
            long r0 = r4.f8271k
            long r2 = r4.f8267g
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L2e
            java.util.LinkedHashMap r0 = r4.f8273m
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2d
            java.lang.Object r1 = r0.next()
            java.lang.String r2 = "next(...)"
            kotlin.jvm.internal.e0.checkNotNullExpressionValue(r1, r2)
            aw.g$c r1 = (aw.g.c) r1
            boolean r2 = r1.getZombie$okhttp()
            if (r2 != 0) goto L12
            r4.removeEntry$okhttp(r1)
            goto L0
        L2d:
            return
        L2e:
            r0 = 0
            r4.f8279s = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: aw.g.trimToSize():void");
    }

    public final synchronized b edit(String key, long j10) throws IOException {
        e0.checkNotNullParameter(key, "key");
        initialize();
        d();
        n(key);
        c cVar = (c) this.f8273m.get(key);
        if (j10 != C && (cVar == null || cVar.getSequenceNumber$okhttp() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.getCurrentEditor$okhttp() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.getLockingSourceCount$okhttp() != 0) {
            return null;
        }
        if (!this.f8279s && !this.f8280t) {
            pw.j jVar = this.f8272l;
            e0.checkNotNull(jVar);
            jVar.writeUtf8(F).writeByte(32).writeUtf8(key).writeByte(10);
            jVar.flush();
            if (this.f8275o) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, key);
                this.f8273m.put(key, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.setCurrentEditor$okhttp(bVar);
            return bVar;
        }
        bw.c.schedule$default(this.f8282v, this.f8283w, 0L, 2, null);
        return null;
    }
}
