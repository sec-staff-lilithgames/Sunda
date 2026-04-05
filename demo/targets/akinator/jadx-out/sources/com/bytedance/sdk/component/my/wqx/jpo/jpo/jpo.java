package com.bytedance.sdk.component.my.wqx.jpo.jpo;

import a.b;
import android.util.Log;
import com.bytedance.sdk.component.utils.yd;
import com.ironsource.C3191e4;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;
import p0.o2;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class jpo implements Closeable {
    static final Pattern jpo = Pattern.compile("[a-z0-9_-]{1,120}");
    public static final OutputStream wqx = new OutputStream() { // from class: com.bytedance.sdk.component.my.wqx.jpo.jpo.jpo.2
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    };

    /* renamed from: cm, reason: collision with root package name */
    private final File f18911cm;

    /* renamed from: if, reason: not valid java name */
    private Writer f76if;

    /* renamed from: jd, reason: collision with root package name */
    final ExecutorService f18912jd;

    /* renamed from: jj, reason: collision with root package name */
    private final File f18913jj;
    private final File my;
    private int oya;

    /* renamed from: qk, reason: collision with root package name */
    private final File f18915qk;
    private final int xyk;

    /* renamed from: yd, reason: collision with root package name */
    private final int f18917yd;
    private long zz;

    /* renamed from: ju, reason: collision with root package name */
    private long f18914ju = 0;

    /* renamed from: au, reason: collision with root package name */
    private final LinkedHashMap<String, jd> f18910au = new LinkedHashMap<>(0, 0.75f, true);
    private long prr = -1;
    private long hna = 0;

    /* renamed from: sq, reason: collision with root package name */
    private final Callable<Void> f18916sq = new Callable<Void>() { // from class: com.bytedance.sdk.component.my.wqx.jpo.jpo.jpo.1
        @Override // java.util.concurrent.Callable
        /* renamed from: jpo, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (jpo.this) {
                try {
                    if (jpo.this.f76if == null) {
                        return null;
                    }
                    jpo.this.xyk();
                    if (jpo.this.jj()) {
                        jpo.this.my();
                        jpo.this.oya = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    };

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class jd {

        /* renamed from: cm, reason: collision with root package name */
        private boolean f18918cm;

        /* renamed from: jd, reason: collision with root package name */
        private final String f18919jd;

        /* renamed from: jj, reason: collision with root package name */
        private long f18920jj;
        private C0088jpo my;
        private final long[] wqx;

        private jd(String str) {
            this.f18919jd = str;
            this.wqx = new long[jpo.this.f18917yd];
        }

        private IOException jd(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File jd(int i10) {
            return new File(jpo.this.f18911cm, this.f18919jd + "." + i10 + ".tmp");
        }

        public String jpo() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.wqx) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void jpo(String[] strArr) throws IOException {
            if (strArr.length == jpo.this.f18917yd) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.wqx[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw jd(strArr);
                    }
                }
                return;
            }
            throw jd(strArr);
        }

        public File jpo(int i10) {
            return new File(jpo.this.f18911cm, this.f18919jd + "." + i10);
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    /* renamed from: com.bytedance.sdk.component.my.wqx.jpo.jpo.jpo$jpo, reason: collision with other inner class name */
    public final class C0088jpo {

        /* renamed from: cm, reason: collision with root package name */
        private boolean f18921cm;

        /* renamed from: jd, reason: collision with root package name */
        private final jd f18922jd;
        private boolean my;
        private final boolean[] wqx;

        /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
        /* renamed from: com.bytedance.sdk.component.my.wqx.jpo.jpo.jpo$jpo$jpo, reason: collision with other inner class name */
        public class C0089jpo extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0088jpo.this.f18921cm = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0088jpo.this.f18921cm = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0088jpo.this.f18921cm = true;
                }
            }

            private C0089jpo(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) throws IOException {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0088jpo.this.f18921cm = true;
                }
            }
        }

        private C0088jpo(jd jdVar) {
            this.f18922jd = jdVar;
            this.wqx = jdVar.f18918cm ? null : new boolean[jpo.this.f18917yd];
        }

        public void jd() throws IOException {
            jpo.this.jpo(this, false);
        }

        public OutputStream jpo(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0089jpo c0089jpo;
            if (i10 >= 0 && i10 < jpo.this.f18917yd) {
                synchronized (jpo.this) {
                    try {
                        if (this.f18922jd.my == this) {
                            if (!this.f18922jd.f18918cm) {
                                this.wqx[i10] = true;
                            }
                            File fileJd = this.f18922jd.jd(i10);
                            try {
                                fileOutputStream = new FileOutputStream(fileJd);
                            } catch (FileNotFoundException unused) {
                                jpo.this.f18911cm.mkdirs();
                                try {
                                    fileOutputStream = new FileOutputStream(fileJd);
                                } catch (FileNotFoundException unused2) {
                                    return jpo.wqx;
                                }
                            }
                            c0089jpo = new C0089jpo(fileOutputStream);
                        } else {
                            throw new IllegalStateException();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return c0089jpo;
            }
            StringBuilder sbT = o2.t(i10, "Expected index ", " to be greater than 0 and less than the maximum value count of ");
            sbT.append(jpo.this.f18917yd);
            throw new IllegalArgumentException(sbT.toString());
        }

        public void jpo() throws IOException {
            if (this.f18921cm) {
                jpo.this.jpo(this, false);
                jpo.this.wqx(this.f18922jd.f18919jd);
            } else {
                jpo.this.jpo(this, true);
            }
            this.my = true;
        }
    }

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public final class wqx implements Closeable {

        /* renamed from: cm, reason: collision with root package name */
        private final InputStream[] f18923cm;

        /* renamed from: jd, reason: collision with root package name */
        private final String f18924jd;
        private final long[] my;
        private final long wqx;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            for (InputStream inputStream : this.f18923cm) {
                yd.jpo(inputStream);
            }
        }

        public InputStream jpo(int i10) {
            return this.f18923cm[i10];
        }

        private wqx(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f18924jd = str;
            this.wqx = j10;
            this.f18923cm = inputStreamArr;
            this.my = jArr;
        }
    }

    private jpo(File file, int i10, int i11, long j10, ExecutorService executorService) {
        this.f18911cm = file;
        this.xyk = i10;
        this.my = new File(file, "journal");
        this.f18913jj = new File(file, "journal.tmp");
        this.f18915qk = new File(file, "journal.bkp");
        this.f18917yd = i11;
        this.zz = j10;
        this.f18912jd = executorService;
    }

    private void qk() {
        if (this.f76if == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xyk() throws IOException {
        long j10 = this.zz;
        long j11 = this.prr;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.f18914ju > j10) {
            wqx(this.f18910au.entrySet().iterator().next().getKey());
        }
        this.prr = -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        try {
            if (this.f76if == null) {
                return;
            }
            Iterator it = new ArrayList(this.f18910au.values()).iterator();
            while (it.hasNext()) {
                jd jdVar = (jd) it.next();
                if (jdVar.my != null) {
                    jdVar.my.jd();
                }
            }
            xyk();
            this.f76if.close();
            this.f76if = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private void cm(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f18910au.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        jd jdVar = this.f18910au.get(strSubstring);
        if (jdVar == null) {
            jdVar = new jd(strSubstring);
            this.f18910au.put(strSubstring, jdVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            jdVar.f18918cm = true;
            jdVar.my = null;
            jdVar.jpo(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            jdVar.my = new C0088jpo(jdVar);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean jj() {
        int i10 = this.oya;
        return i10 >= 2000 && i10 >= this.f18910au.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void my() throws IOException {
        try {
            Writer writer = this.f76if;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f18913jj), cm.jpo));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.xyk));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f18917yd));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (jd jdVar : this.f18910au.values()) {
                    if (jdVar.my != null) {
                        bufferedWriter.write("DIRTY " + jdVar.f18919jd + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + jdVar.f18919jd + jdVar.jpo() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.my.exists()) {
                    jpo(this.my, this.f18915qk, true);
                }
                jpo(this.f18913jj, this.my, false);
                this.f18915qk.delete();
                this.f76if = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.my, true), cm.jpo));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    private void wqx() throws IOException {
        com.bytedance.sdk.component.my.wqx.jpo.jpo.wqx wqxVar = new com.bytedance.sdk.component.my.wqx.jpo.jpo.wqx(new FileInputStream(this.my), cm.jpo);
        try {
            String strJpo = wqxVar.jpo();
            String strJpo2 = wqxVar.jpo();
            String strJpo3 = wqxVar.jpo();
            String strJpo4 = wqxVar.jpo();
            String strJpo5 = wqxVar.jpo();
            if (!"libcore.io.DiskLruCache".equals(strJpo) || !"1".equals(strJpo2) || !Integer.toString(this.xyk).equals(strJpo3) || !Integer.toString(this.f18917yd).equals(strJpo4) || !"".equals(strJpo5)) {
                throw new IOException("unexpected journal header: [" + strJpo + ", " + strJpo2 + ", " + strJpo4 + ", " + strJpo5 + C3191e4.i.f36531e);
            }
            int i10 = 0;
            while (true) {
                try {
                    cm(wqxVar.jpo());
                    i10++;
                } catch (EOFException unused) {
                    this.oya = i10 - this.f18910au.size();
                    if (wqxVar.jd()) {
                        my();
                    } else {
                        this.f76if = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.my, true), cm.jpo));
                    }
                    yd.jpo(wqxVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            yd.jpo(wqxVar);
            throw th2;
        }
    }

    public C0088jpo jd(String str) throws IOException {
        return jpo(str, -1L);
    }

    public void jd() throws IOException {
        close();
        cm.jpo(this.f18911cm);
    }

    public static jpo jpo(File file, int i10, int i11, long j10, ExecutorService executorService) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    jpo(file2, file3, false);
                }
            }
            jpo jpoVar = new jpo(file, i10, i11, j10, executorService);
            if (jpoVar.my.exists()) {
                try {
                    jpoVar.wqx();
                    jpoVar.cm();
                    return jpoVar;
                } catch (IOException e10) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e10.getMessage() + ", removing");
                    jpoVar.jd();
                }
            }
            file.mkdirs();
            jpo jpoVar2 = new jpo(file, i10, i11, j10, executorService);
            jpoVar2.my();
            return jpoVar2;
        }
        throw new IllegalArgumentException("valueCount <= 0");
    }

    public synchronized boolean wqx(String str) throws IOException {
        try {
            qk();
            my(str);
            jd jdVar = this.f18910au.get(str);
            if (jdVar != null && jdVar.my == null) {
                for (int i10 = 0; i10 < this.f18917yd; i10++) {
                    File fileJpo = jdVar.jpo(i10);
                    if (fileJpo.exists() && !fileJpo.delete()) {
                        throw new IOException("failed to delete ".concat(String.valueOf(fileJpo)));
                    }
                    this.f18914ju -= jdVar.wqx[i10];
                    jdVar.wqx[i10] = 0;
                }
                this.oya++;
                this.f76if.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f18910au.remove(str);
                if (jj()) {
                    this.f18912jd.submit(this.f18916sq);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    private void cm() throws IOException {
        jpo(this.f18913jj);
        Iterator<jd> it = this.f18910au.values().iterator();
        while (it.hasNext()) {
            jd next = it.next();
            int i10 = 0;
            if (next.my != null) {
                next.my = null;
                while (i10 < this.f18917yd) {
                    jpo(next.jpo(i10));
                    jpo(next.jd(i10));
                    i10++;
                }
                it.remove();
            } else {
                while (i10 < this.f18917yd) {
                    this.f18914ju += next.wqx[i10];
                    i10++;
                }
            }
        }
    }

    private static void jpo(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void jpo(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            jpo(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    private void my(String str) {
        if (!jpo.matcher(str).matches()) {
            throw new IllegalArgumentException(b.l("keys must match regex [a-z0-9_-]{1,120}: \"", str, "\""));
        }
    }

    public synchronized wqx jpo(String str) throws Throwable {
        Throwable th2;
        InputStream inputStream;
        try {
            qk();
            my(str);
            jd jdVar = this.f18910au.get(str);
            if (jdVar == null) {
                return null;
            }
            if (!jdVar.f18918cm) {
                return null;
            }
            InputStream[] inputStreamArr = new InputStream[this.f18917yd];
            for (int i10 = 0; i10 < this.f18917yd; i10++) {
                try {
                    try {
                        try {
                            inputStreamArr[i10] = new FileInputStream(jdVar.jpo(i10));
                        } catch (Throwable th3) {
                            th2 = th3;
                            throw th2;
                        }
                    } catch (FileNotFoundException unused) {
                        for (int i11 = 0; i11 < this.f18917yd && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            yd.jpo(inputStream);
                        }
                        return null;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            }
            this.oya++;
            this.f76if.append((CharSequence) ("READ " + str + '\n'));
            if (jj()) {
                this.f18912jd.submit(this.f18916sq);
            }
            return new wqx(str, jdVar.f18920jj, inputStreamArr, jdVar.wqx);
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private synchronized C0088jpo jpo(String str, long j10) throws IOException {
        qk();
        my(str);
        jd jdVar = this.f18910au.get(str);
        if (j10 != -1 && (jdVar == null || jdVar.f18920jj != j10)) {
            return null;
        }
        if (jdVar != null) {
            if (jdVar.my != null) {
                return null;
            }
        } else {
            jdVar = new jd(str);
            this.f18910au.put(str, jdVar);
        }
        C0088jpo c0088jpo = new C0088jpo(jdVar);
        jdVar.my = c0088jpo;
        this.f76if.write("DIRTY " + str + '\n');
        this.f76if.flush();
        return c0088jpo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void jpo(C0088jpo c0088jpo, boolean z10) throws IOException {
        jd jdVar = c0088jpo.f18922jd;
        if (jdVar.my == c0088jpo) {
            if (z10 && !jdVar.f18918cm) {
                for (int i10 = 0; i10 < this.f18917yd; i10++) {
                    if (c0088jpo.wqx[i10]) {
                        if (!jdVar.jd(i10).exists()) {
                            c0088jpo.jd();
                            return;
                        }
                    } else {
                        c0088jpo.jd();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.f18917yd; i11++) {
                File fileJd = jdVar.jd(i11);
                if (z10) {
                    if (fileJd.exists()) {
                        File fileJpo = jdVar.jpo(i11);
                        fileJd.renameTo(fileJpo);
                        long j10 = jdVar.wqx[i11];
                        long length = fileJpo.length();
                        jdVar.wqx[i11] = length;
                        this.f18914ju = (this.f18914ju - j10) + length;
                    }
                } else {
                    jpo(fileJd);
                }
            }
            this.oya++;
            jdVar.my = null;
            if (!(jdVar.f18918cm | z10)) {
                this.f18910au.remove(jdVar.f18919jd);
                this.f76if.write("REMOVE " + jdVar.f18919jd + '\n');
            } else {
                jdVar.f18918cm = true;
                this.f76if.write("CLEAN " + jdVar.f18919jd + jdVar.jpo() + '\n');
                if (z10) {
                    long j11 = this.hna;
                    this.hna = 1 + j11;
                    jdVar.f18920jj = j11;
                }
            }
            this.f76if.flush();
            if (this.f18914ju > this.zz || jj()) {
                this.f18912jd.submit(this.f18916sq);
            }
            return;
        }
        throw new IllegalStateException();
    }

    public synchronized void jpo() throws IOException {
        qk();
        xyk();
        this.f76if.flush();
    }
}
