package l8;

import android.os.Build;
import android.os.StrictMode;
import com.ironsource.C3191e4;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements Closeable {

    /* renamed from: b, reason: collision with root package name */
    public final File f72687b;

    /* renamed from: c, reason: collision with root package name */
    public final File f72688c;

    /* renamed from: e, reason: collision with root package name */
    public final File f72689e;

    /* renamed from: f, reason: collision with root package name */
    public final File f72690f;

    /* renamed from: g, reason: collision with root package name */
    public final int f72691g;

    /* renamed from: h, reason: collision with root package name */
    public long f72692h;

    /* renamed from: i, reason: collision with root package name */
    public final int f72693i;

    /* renamed from: k, reason: collision with root package name */
    public BufferedWriter f72695k;

    /* renamed from: m, reason: collision with root package name */
    public int f72697m;

    /* renamed from: j, reason: collision with root package name */
    public long f72694j = 0;

    /* renamed from: l, reason: collision with root package name */
    public final LinkedHashMap f72696l = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: n, reason: collision with root package name */
    public long f72698n = 0;

    /* renamed from: o, reason: collision with root package name */
    public final ThreadPoolExecutor f72699o = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b());

    /* renamed from: p, reason: collision with root package name */
    public final a f72700p = new a(this);

    public f(File file, int i10, int i11, long j10) {
        this.f72687b = file;
        this.f72691g = i10;
        this.f72688c = new File(file, "journal");
        this.f72689e = new File(file, "journal.tmp");
        this.f72690f = new File(file, "journal.bkp");
        this.f72693i = i11;
        this.f72692h = j10;
    }

    public static String a(FileInputStream fileInputStream) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, i.f72708b);
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int i10 = inputStreamReader.read(cArr);
                if (i10 == -1) {
                    String string = stringWriter.toString();
                    inputStreamReader.close();
                    return string;
                }
                stringWriter.write(cArr, 0, i10);
            }
        } catch (Throwable th2) {
            inputStreamReader.close();
            throw th2;
        }
    }

    public static void b(f fVar, c cVar, boolean z10) {
        synchronized (fVar) {
            d dVar = cVar.f72670a;
            if (dVar.f72679f != cVar) {
                throw new IllegalStateException();
            }
            if (z10 && !dVar.f72678e) {
                for (int i10 = 0; i10 < fVar.f72693i; i10++) {
                    if (!cVar.f72671b[i10]) {
                        cVar.abort();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!dVar.getDirtyFile(i10).exists()) {
                        cVar.abort();
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < fVar.f72693i; i11++) {
                File dirtyFile = dVar.getDirtyFile(i11);
                if (!z10) {
                    d(dirtyFile);
                } else if (dirtyFile.exists()) {
                    File cleanFile = dVar.getCleanFile(i11);
                    dirtyFile.renameTo(cleanFile);
                    long j10 = dVar.f72675b[i11];
                    long length = cleanFile.length();
                    dVar.f72675b[i11] = length;
                    fVar.f72694j = (fVar.f72694j - j10) + length;
                }
            }
            fVar.f72697m++;
            dVar.f72679f = null;
            if (dVar.f72678e || z10) {
                dVar.f72678e = true;
                fVar.f72695k.append((CharSequence) "CLEAN");
                fVar.f72695k.append(' ');
                fVar.f72695k.append((CharSequence) dVar.f72674a);
                fVar.f72695k.append((CharSequence) dVar.getLengths());
                fVar.f72695k.append('\n');
                if (z10) {
                    long j11 = fVar.f72698n;
                    fVar.f72698n = 1 + j11;
                    dVar.f72680g = j11;
                }
            } else {
                fVar.f72696l.remove(dVar.f72674a);
                fVar.f72695k.append((CharSequence) "REMOVE");
                fVar.f72695k.append(' ');
                fVar.f72695k.append((CharSequence) dVar.f72674a);
                fVar.f72695k.append('\n');
            }
            f(fVar.f72695k);
            if (fVar.f72694j > fVar.f72692h || fVar.h()) {
                fVar.f72699o.submit(fVar.f72700p);
            }
        }
    }

    public static void c(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void d(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void f(BufferedWriter bufferedWriter) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            bufferedWriter.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void o(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            d(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public static f open(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                o(file2, file3, false);
            }
        }
        f fVar = new f(file, i10, i11, j10);
        if (fVar.f72688c.exists()) {
            try {
                fVar.l();
                fVar.k();
                return fVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                fVar.delete();
            }
        }
        file.mkdirs();
        f fVar2 = new f(file, i10, i11, j10);
        fVar2.n();
        return fVar2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f72695k == null) {
                return;
            }
            Iterator it = new ArrayList(this.f72696l.values()).iterator();
            while (it.hasNext()) {
                c cVar = ((d) it.next()).f72679f;
                if (cVar != null) {
                    cVar.abort();
                }
            }
            p();
            c(this.f72695k);
            this.f72695k = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void delete() throws IOException {
        close();
        i.a(this.f72687b);
    }

    public final synchronized c e(long j10, String str) {
        if (this.f72695k == null) {
            throw new IllegalStateException("cache is closed");
        }
        d dVar = (d) this.f72696l.get(str);
        if (j10 != -1 && (dVar == null || dVar.f72680g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str);
            this.f72696l.put(str, dVar);
        } else if (dVar.f72679f != null) {
            return null;
        }
        c cVar = new c(this, dVar);
        dVar.f72679f = cVar;
        this.f72695k.append((CharSequence) "DIRTY");
        this.f72695k.append(' ');
        this.f72695k.append((CharSequence) str);
        this.f72695k.append('\n');
        f(this.f72695k);
        return cVar;
    }

    public c edit(String str) throws IOException {
        return e(-1L, str);
    }

    public synchronized void flush() throws IOException {
        if (this.f72695k == null) {
            throw new IllegalStateException("cache is closed");
        }
        p();
        f(this.f72695k);
    }

    public synchronized e get(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                if (this.f72695k == null) {
                    throw new IllegalStateException("cache is closed");
                }
                d dVar = (d) this.f72696l.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f72678e) {
                    return null;
                }
                for (File file : dVar.f72676c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                }
                this.f72697m++;
                this.f72695k.append((CharSequence) "READ");
                this.f72695k.append(' ');
                this.f72695k.append((CharSequence) str);
                this.f72695k.append('\n');
                if (h()) {
                    this.f72699o.submit(this.f72700p);
                }
                return new e(this, str, dVar.f72680g, dVar.f72676c, dVar.f72675b);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    public File getDirectory() {
        return this.f72687b;
    }

    public synchronized long getMaxSize() {
        return this.f72692h;
    }

    public final boolean h() {
        int i10 = this.f72697m;
        return i10 >= 2000 && i10 >= this.f72696l.size();
    }

    public synchronized boolean isClosed() {
        return this.f72695k == null;
    }

    public final void k() throws IOException {
        d(this.f72689e);
        Iterator it = this.f72696l.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            c cVar = dVar.f72679f;
            int i10 = this.f72693i;
            int i11 = 0;
            if (cVar == null) {
                while (i11 < i10) {
                    this.f72694j += dVar.f72675b[i11];
                    i11++;
                }
            } else {
                dVar.f72679f = null;
                while (i11 < i10) {
                    d(dVar.getCleanFile(i11));
                    d(dVar.getDirtyFile(i11));
                    i11++;
                }
                it.remove();
            }
        }
    }

    public final void l() throws IOException {
        File file = this.f72688c;
        h hVar = new h(new FileInputStream(file), i.f72707a);
        try {
            String line = hVar.readLine();
            String line2 = hVar.readLine();
            String line3 = hVar.readLine();
            String line4 = hVar.readLine();
            String line5 = hVar.readLine();
            if (!"libcore.io.DiskLruCache".equals(line) || !"1".equals(line2) || !Integer.toString(this.f72691g).equals(line3) || !Integer.toString(this.f72693i).equals(line4) || !"".equals(line5)) {
                throw new IOException("unexpected journal header: [" + line + ", " + line2 + ", " + line4 + ", " + line5 + C3191e4.i.f36531e);
            }
            int i10 = 0;
            while (true) {
                try {
                    m(hVar.readLine());
                    i10++;
                } catch (EOFException unused) {
                    this.f72697m = i10 - this.f72696l.size();
                    if (hVar.hasUnterminatedLine()) {
                        n();
                    } else {
                        this.f72695k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), i.f72707a));
                    }
                    try {
                        hVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                hVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final void m(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        LinkedHashMap linkedHashMap = this.f72696l;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) linkedHashMap.get(strSubstring);
        if (dVar == null) {
            dVar = new d(this, strSubstring);
            linkedHashMap.put(strSubstring, dVar);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                dVar.f72679f = new c(this, dVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        dVar.f72678e = true;
        dVar.f72679f = null;
        if (strArrSplit.length != dVar.f72681h.f72693i) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                dVar.f72675b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    public final synchronized void n() {
        try {
            BufferedWriter bufferedWriter = this.f72695k;
            if (bufferedWriter != null) {
                c(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f72689e), i.f72707a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f72691g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f72693i));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (d dVar : this.f72696l.values()) {
                    if (dVar.f72679f != null) {
                        bufferedWriter2.write("DIRTY " + dVar.f72674a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + dVar.f72674a + dVar.getLengths() + '\n');
                    }
                }
                c(bufferedWriter2);
                if (this.f72688c.exists()) {
                    o(this.f72688c, this.f72690f, true);
                }
                o(this.f72689e, this.f72688c, false);
                this.f72690f.delete();
                this.f72695k = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f72688c, true), i.f72707a));
            } catch (Throwable th2) {
                c(bufferedWriter2);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void p() throws IOException {
        while (this.f72694j > this.f72692h) {
            remove((String) ((Map.Entry) this.f72696l.entrySet().iterator().next()).getKey());
        }
    }

    public synchronized boolean remove(String str) throws IOException {
        try {
            if (this.f72695k == null) {
                throw new IllegalStateException("cache is closed");
            }
            d dVar = (d) this.f72696l.get(str);
            if (dVar != null && dVar.f72679f == null) {
                for (int i10 = 0; i10 < this.f72693i; i10++) {
                    File cleanFile = dVar.getCleanFile(i10);
                    if (cleanFile.exists() && !cleanFile.delete()) {
                        throw new IOException("failed to delete " + cleanFile);
                    }
                    long j10 = this.f72694j;
                    long[] jArr = dVar.f72675b;
                    this.f72694j = j10 - jArr[i10];
                    jArr[i10] = 0;
                }
                this.f72697m++;
                this.f72695k.append((CharSequence) "REMOVE");
                this.f72695k.append(' ');
                this.f72695k.append((CharSequence) str);
                this.f72695k.append('\n');
                this.f72696l.remove(str);
                if (h()) {
                    this.f72699o.submit(this.f72700p);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public synchronized void setMaxSize(long j10) {
        this.f72692h = j10;
        this.f72699o.submit(this.f72700p);
    }

    public synchronized long size() {
        return this.f72694j;
    }
}
