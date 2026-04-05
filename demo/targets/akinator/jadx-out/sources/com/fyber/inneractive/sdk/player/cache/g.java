package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3191e4;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public final class g implements Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f24356p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: q, reason: collision with root package name */
    public static final b f24357q = new b();

    /* renamed from: a, reason: collision with root package name */
    public final File f24358a;

    /* renamed from: b, reason: collision with root package name */
    public final File f24359b;

    /* renamed from: c, reason: collision with root package name */
    public final File f24360c;

    /* renamed from: d, reason: collision with root package name */
    public final File f24361d;

    /* renamed from: f, reason: collision with root package name */
    public final long f24363f;

    /* renamed from: i, reason: collision with root package name */
    public BufferedWriter f24366i;

    /* renamed from: k, reason: collision with root package name */
    public int f24368k;

    /* renamed from: l, reason: collision with root package name */
    public f f24369l;

    /* renamed from: h, reason: collision with root package name */
    public long f24365h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f24367j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: m, reason: collision with root package name */
    public long f24370m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f24371n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o, reason: collision with root package name */
    public final a f24372o = new a(this);

    /* renamed from: e, reason: collision with root package name */
    public final int f24362e = 0;

    /* renamed from: g, reason: collision with root package name */
    public final int f24364g = 1;

    public g(File file, long j10) {
        this.f24358a = file;
        this.f24359b = new File(file, "journal");
        this.f24360c = new File(file, "journal.tmp");
        this.f24361d = new File(file, "journal.bkp");
        this.f24363f = j10;
    }

    public static void a(g gVar, d dVar, boolean z10) {
        int i10;
        synchronized (gVar) {
            e eVar = dVar.f24347a;
            if (eVar.f24354d != dVar) {
                throw new IllegalStateException();
            }
            if (z10 && !eVar.f24353c) {
                for (int i11 = 0; i11 < gVar.f24364g; i11++) {
                    if (!dVar.f24348b[i11]) {
                        a(dVar.f24350d, dVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                    if (!eVar.b(i11).exists()) {
                        a(dVar.f24350d, dVar, false);
                        return;
                    }
                }
            }
            for (int i12 = 0; i12 < gVar.f24364g; i12++) {
                File fileB = eVar.b(i12);
                if (!z10) {
                    a(fileB);
                } else if (fileB.exists()) {
                    File fileA = eVar.a(i12);
                    fileB.renameTo(fileA);
                    long j10 = eVar.f24352b[i12];
                    long length = fileA.length();
                    eVar.f24352b[i12] = length;
                    gVar.f24365h = (gVar.f24365h - j10) + length;
                }
            }
            gVar.f24368k++;
            eVar.f24354d = null;
            if (eVar.f24353c || z10) {
                eVar.f24353c = true;
                BufferedWriter bufferedWriter = gVar.f24366i;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(eVar.f24351a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : eVar.f24352b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    gVar.f24370m++;
                }
            } else {
                gVar.f24367j.remove(eVar.f24351a);
                gVar.f24366i.write("REMOVE " + eVar.f24351a + '\n');
            }
            gVar.f24366i.flush();
            if (gVar.f24365h > gVar.f24363f || ((i10 = gVar.f24368k) >= 2000 && i10 >= gVar.f24367j.size())) {
                gVar.f24371n.submit(gVar.f24372o);
            }
        }
    }

    public final void b() {
        FileInputStream fileInputStream = new FileInputStream(this.f24359b);
        Charset charset = l.f24380a;
        k kVar = new k(fileInputStream);
        try {
            String strA = kVar.a();
            String strA2 = kVar.a();
            String strA3 = kVar.a();
            String strA4 = kVar.a();
            String strA5 = kVar.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f24362e).equals(strA3) || !Integer.toString(this.f24364g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C3191e4.i.f36531e);
            }
            int i10 = 0;
            while (true) {
                try {
                    b(kVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f24368k = i10 - this.f24367j.size();
                    if (kVar.f24379e == -1) {
                        c();
                    } else {
                        this.f24366i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f24359b, true), l.f24380a));
                    }
                    try {
                        kVar.close();
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
                kVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final synchronized void c() {
        try {
            BufferedWriter bufferedWriter = this.f24366i;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f24360c), l.f24380a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f24362e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f24364g));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (e eVar : this.f24367j.values()) {
                    if (eVar.f24354d != null) {
                        bufferedWriter2.write("DIRTY " + eVar.f24351a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(eVar.f24351a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : eVar.f24352b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f24359b.exists()) {
                    File file = this.f24359b;
                    File file2 = this.f24361d;
                    a(file2);
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f24360c.renameTo(this.f24359b)) {
                    throw new IOException();
                }
                this.f24361d.delete();
                this.f24366i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f24359b, true), l.f24380a));
            } catch (Throwable th2) {
                bufferedWriter2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f24366i == null) {
                return;
            }
            Iterator it = new ArrayList(this.f24367j.values()).iterator();
            while (it.hasNext()) {
                d dVar = ((e) it.next()).f24354d;
                if (dVar != null) {
                    a(dVar.f24350d, dVar, false);
                }
            }
            d();
            this.f24366i.close();
            this.f24366i = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void d() {
        while (this.f24365h > this.f24363f) {
            String str = (String) ((Map.Entry) this.f24367j.entrySet().iterator().next()).getKey();
            f fVar = this.f24369l;
            if (fVar == null) {
                c(str);
            } else if (fVar.a(str)) {
                c(str);
            } else {
                boolean zC = false;
                for (String str2 : this.f24367j.keySet()) {
                    if (this.f24369l.a(str2)) {
                        zC |= c(str2);
                    }
                }
                if (!zC) {
                    return;
                }
            }
        }
    }

    public final void b(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i10);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i10);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.f24367j.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i10, iIndexOf2);
            }
            e eVar = (e) this.f24367j.get(strSubstring);
            if (eVar == null) {
                eVar = new e(this, strSubstring);
                this.f24367j.put(strSubstring, eVar);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                eVar.f24353c = true;
                eVar.f24354d = null;
                if (strArrSplit.length == eVar.f24355e.f24364g) {
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        try {
                            eVar.f24352b[i11] = Long.parseLong(strArrSplit[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                eVar.f24354d = new d(this, eVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized boolean c(String str) {
        try {
            IAlog.e("DiskLruCache remove %s", str);
            if (this.f24366i != null) {
                if (f24356p.matcher(str).matches()) {
                    e eVar = (e) this.f24367j.get(str);
                    if (eVar != null && eVar.f24354d == null) {
                        for (int i10 = 0; i10 < this.f24364g; i10++) {
                            File fileA = eVar.a(i10);
                            if (fileA.exists() && !fileA.delete()) {
                                throw new IOException("failed to delete " + fileA);
                            }
                            long j10 = this.f24365h;
                            long[] jArr = eVar.f24352b;
                            this.f24365h = j10 - jArr[i10];
                            jArr[i10] = 0;
                        }
                        this.f24368k++;
                        this.f24366i.append((CharSequence) ("REMOVE " + str + '\n'));
                        this.f24367j.remove(str);
                        int i11 = this.f24368k;
                        if (i11 >= 2000 && i11 >= this.f24367j.size()) {
                            this.f24371n.submit(this.f24372o);
                        }
                        return true;
                    }
                    return false;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        } finally {
        }
    }

    public static g a(File file, long j10) throws IOException {
        if (j10 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            g gVar = new g(file, j10);
            if (gVar.f24359b.exists()) {
                try {
                    gVar.b();
                    gVar.a();
                    return gVar;
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    IAlog.e("DiskLruCache delete cache", new Object[0]);
                    gVar.close();
                    l.a(gVar.f24358a);
                }
            }
            file.mkdirs();
            g gVar2 = new g(file, j10);
            gVar2.c();
            return gVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void a() throws IOException {
        a(this.f24360c);
        Iterator it = this.f24367j.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i10 = 0;
            if (eVar.f24354d == null) {
                while (i10 < this.f24364g) {
                    this.f24365h += eVar.f24352b[i10];
                    i10++;
                }
            } else {
                eVar.f24354d = null;
                while (i10 < this.f24364g) {
                    a(eVar.a(i10));
                    a(eVar.b(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public static void a(File file) throws IOException {
        IAlog.e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final d a(String str) {
        synchronized (this) {
            try {
                if (this.f24366i != null) {
                    if (f24356p.matcher(str).matches()) {
                        e eVar = (e) this.f24367j.get(str);
                        if (eVar == null) {
                            eVar = new e(this, str);
                            this.f24367j.put(str, eVar);
                        } else if (eVar.f24354d != null) {
                            return null;
                        }
                        d dVar = new d(this, eVar);
                        eVar.f24354d = dVar;
                        this.f24366i.write("DIRTY " + str + '\n');
                        this.f24366i.flush();
                        return dVar;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
