package com.inmobi.media;

import com.ironsource.C3191e4;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
/* loaded from: classes7.dex */
public final class Y3 implements Closeable {

    /* renamed from: p, reason: collision with root package name */
    public static final Pattern f32535p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: q, reason: collision with root package name */
    public static final T3 f32536q = new T3();

    /* renamed from: a, reason: collision with root package name */
    public final File f32537a;

    /* renamed from: b, reason: collision with root package name */
    public final File f32538b;

    /* renamed from: c, reason: collision with root package name */
    public final File f32539c;

    /* renamed from: d, reason: collision with root package name */
    public final File f32540d;

    /* renamed from: f, reason: collision with root package name */
    public final long f32542f;

    /* renamed from: g, reason: collision with root package name */
    public final Nf f32543g;

    /* renamed from: j, reason: collision with root package name */
    public BufferedWriter f32546j;

    /* renamed from: l, reason: collision with root package name */
    public int f32548l;

    /* renamed from: i, reason: collision with root package name */
    public long f32545i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final LinkedHashMap f32547k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: m, reason: collision with root package name */
    public long f32549m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f32550n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o, reason: collision with root package name */
    public final S3 f32551o = new S3(this);

    /* renamed from: e, reason: collision with root package name */
    public final int f32541e = 1;

    /* renamed from: h, reason: collision with root package name */
    public final int f32544h = 2;

    public Y3(File file, long j10, Nf nf2) {
        this.f32537a = file;
        this.f32538b = new File(file, "journal");
        this.f32539c = new File(file, "journal.tmp");
        this.f32540d = new File(file, "journal.bkp");
        this.f32542f = j10;
        this.f32543g = nf2;
    }

    public static void a(Y3 y32, V3 v32, boolean z10) {
        synchronized (y32) {
            W3 w32 = v32.f32386a;
            if (w32.f32434d != v32) {
                throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
            }
            if (z10 && !w32.f32433c) {
                for (int i10 = 0; i10 < y32.f32544h; i10++) {
                    if (!v32.f32387b[i10]) {
                        a(v32.f32389d, v32, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!w32.b(i10).exists()) {
                        a(v32.f32389d, v32, false);
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < y32.f32544h; i11++) {
                File fileB = w32.b(i11);
                if (z10) {
                    if (fileB.exists()) {
                        File fileA = w32.a(i11);
                        fileB.renameTo(fileA);
                        long j10 = w32.f32432b[i11];
                        long length = fileA.length();
                        w32.f32432b[i11] = length;
                        y32.f32545i = (y32.f32545i - j10) + length;
                    }
                } else if (fileB.exists() && !fileB.delete()) {
                    throw new IOException();
                }
            }
            y32.f32548l++;
            w32.f32434d = null;
            if (w32.f32433c || z10) {
                w32.f32433c = true;
                BufferedWriter bufferedWriter = y32.f32546j;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(w32.f32431a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : w32.f32432b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    y32.f32549m++;
                }
            } else {
                y32.f32547k.remove(w32.f32431a);
                y32.f32546j.write("REMOVE " + w32.f32431a + '\n');
            }
            y32.f32546j.flush();
            if (y32.f32545i > y32.f32542f || y32.a()) {
                y32.f32550n.submit(y32.f32551o);
            }
        }
    }

    public final void b() throws IOException {
        File file = this.f32539c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f32547k.values().iterator();
        while (it.hasNext()) {
            W3 w32 = (W3) it.next();
            int i10 = 0;
            if (w32.f32434d == null) {
                while (i10 < this.f32544h) {
                    this.f32545i += w32.f32432b[i10];
                    i10++;
                }
            } else {
                w32.f32434d = null;
                while (i10 < this.f32544h) {
                    File fileA = w32.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = w32.b(i10);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void c() throws IOException {
        C2757ee c2757ee = new C2757ee(new FileInputStream(this.f32538b), AbstractC2775ff.f32847a);
        try {
            String strA = c2757ee.a();
            String strA2 = c2757ee.a();
            String strA3 = c2757ee.a();
            String strA4 = c2757ee.a();
            String strA5 = c2757ee.a();
            if (!"libcore.io.DiskLruCache".equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f32541e).equals(strA3) || !Integer.toString(this.f32544h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C3191e4.i.f36531e);
            }
            int i10 = 0;
            while (true) {
                try {
                    c(c2757ee.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f32548l = i10 - this.f32547k.size();
                    AbstractC2775ff.a(c2757ee);
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC2775ff.a(c2757ee);
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f32546j == null) {
                return;
            }
            Iterator it = new ArrayList(this.f32547k.values()).iterator();
            while (it.hasNext()) {
                V3 v32 = ((W3) it.next()).f32434d;
                if (v32 != null) {
                    a(v32.f32389d, v32, false);
                }
            }
            while (this.f32545i > this.f32542f) {
                d((String) ((Map.Entry) this.f32547k.entrySet().iterator().next()).getKey());
            }
            this.f32546j.close();
            this.f32546j = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void d() {
        try {
            BufferedWriter bufferedWriter = this.f32546j;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f32539c), AbstractC2775ff.f32847a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write("1");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f32541e));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f32544h));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (W3 w32 : this.f32547k.values()) {
                    if (w32.f32434d != null) {
                        bufferedWriter2.write("DIRTY " + w32.f32431a + '\n');
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("CLEAN ");
                        sb2.append(w32.f32431a);
                        StringBuilder sb3 = new StringBuilder();
                        for (long j10 : w32.f32432b) {
                            sb3.append(' ');
                            sb3.append(j10);
                        }
                        sb2.append(sb3.toString());
                        sb2.append('\n');
                        bufferedWriter2.write(sb2.toString());
                    }
                }
                bufferedWriter2.close();
                if (this.f32538b.exists()) {
                    File file = this.f32538b;
                    File file2 = this.f32540d;
                    if (file2.exists() && !file2.delete()) {
                        throw new IOException();
                    }
                    if (!file.renameTo(file2)) {
                        throw new IOException();
                    }
                }
                if (!this.f32539c.renameTo(this.f32538b)) {
                    throw new IOException();
                }
                this.f32540d.delete();
                this.f32546j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f32538b, true), AbstractC2775ff.f32847a));
            } catch (Throwable th2) {
                bufferedWriter2.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i10);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i10);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.f32547k.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i10, iIndexOf2);
            }
            W3 w32 = (W3) this.f32547k.get(strSubstring);
            if (w32 == null) {
                w32 = new W3(this, strSubstring);
                this.f32547k.put(strSubstring, w32);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
                w32.f32433c = true;
                w32.f32434d = null;
                if (strArrSplit.length == w32.f32435e.f32544h) {
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        try {
                            w32.f32432b[i11] = Long.parseLong(strArrSplit[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                w32.f32434d = new V3(this, w32);
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

    public final synchronized X3 b(String key) {
        InputStream inputStream;
        if (this.f32546j != null) {
            if (f32535p.matcher(key).matches()) {
                W3 w32 = (W3) this.f32547k.get(key);
                if (w32 == null) {
                    return null;
                }
                if (!w32.f32433c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f32544h];
                for (int i10 = 0; i10 < this.f32544h; i10++) {
                    try {
                        inputStreamArr[i10] = new FileInputStream(w32.a(i10));
                    } catch (FileNotFoundException unused) {
                        if (this.f32543g != null) {
                            kotlin.jvm.internal.e0.checkNotNullParameter(key, "key");
                            Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to("urlKey", key));
                            C2926oe c2926oe = C2926oe.f33217a;
                            C2926oe.b("ResourceDiskCacheFileMissing", mapMutableMapOf, EnumC2993se.f33373a);
                        }
                        for (int i11 = 0; i11 < this.f32544h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            AbstractC2775ff.a(inputStream);
                        }
                        return null;
                    }
                }
                this.f32548l++;
                this.f32546j.append((CharSequence) ("READ " + key + '\n'));
                if (a()) {
                    this.f32550n.submit(this.f32551o);
                }
                return new X3(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void d(String str) {
        if (this.f32546j != null) {
            if (f32535p.matcher(str).matches()) {
                W3 w32 = (W3) this.f32547k.get(str);
                if (w32 != null && w32.f32434d == null) {
                    for (int i10 = 0; i10 < this.f32544h; i10++) {
                        File file = w32.a(i10);
                        if (this.f32543g != null) {
                            kotlin.jvm.internal.e0.checkNotNullParameter(file, "file");
                            if (str != null && i10 == 0) {
                                String str2 = "";
                                try {
                                    String strA = AbstractC2775ff.a(new InputStreamReader(new FileInputStream(file), AbstractC2775ff.f32848b));
                                    kotlin.jvm.internal.e0.checkNotNullExpressionValue(strA, "readFully(...)");
                                    str2 = strA;
                                } catch (Exception unused) {
                                }
                                Map mapMutableMapOf = uu.p1.mutableMapOf(tu.e0.to("urlKey", str), tu.e0.to("url", str2));
                                C2926oe c2926oe = C2926oe.f33217a;
                                C2926oe.b("ResourceDiskCacheFileEvicted", mapMutableMapOf, EnumC2993se.f33373a);
                            }
                        }
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j10 = this.f32545i;
                        long[] jArr = w32.f32432b;
                        this.f32545i = j10 - jArr[i10];
                        jArr[i10] = 0;
                    }
                    this.f32548l++;
                    this.f32546j.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f32547k.remove(str);
                    if (a()) {
                        this.f32550n.submit(this.f32551o);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final V3 a(String str) {
        synchronized (this) {
            try {
                if (this.f32546j != null) {
                    if (f32535p.matcher(str).matches()) {
                        W3 w32 = (W3) this.f32547k.get(str);
                        if (w32 == null) {
                            w32 = new W3(this, str);
                            this.f32547k.put(str, w32);
                        } else if (w32.f32434d != null) {
                            return null;
                        }
                        V3 v32 = new V3(this, w32);
                        w32.f32434d = v32;
                        this.f32546j.write("DIRTY " + str + '\n');
                        this.f32546j.flush();
                        return v32;
                    }
                    throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean a() {
        int i10 = this.f32548l;
        return i10 >= 2000 && i10 >= this.f32547k.size();
    }
}
