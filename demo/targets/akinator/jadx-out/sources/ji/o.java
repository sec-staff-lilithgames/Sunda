package ji;

import com.inmobi.commons.core.configs.AdConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class o implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f69601i = Logger.getLogger(o.class.getName());

    /* renamed from: b, reason: collision with root package name */
    public final RandomAccessFile f69602b;

    /* renamed from: c, reason: collision with root package name */
    public int f69603c;

    /* renamed from: e, reason: collision with root package name */
    public int f69604e;

    /* renamed from: f, reason: collision with root package name */
    public l f69605f;

    /* renamed from: g, reason: collision with root package name */
    public l f69606g;

    /* renamed from: h, reason: collision with root package name */
    public final byte[] f69607h;

    public o(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f69607h = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i10 = 0;
                for (int i11 = 0; i11 < 4; i11++) {
                    h(i10, iArr[i11], bArr2);
                    i10 += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th2) {
                randomAccessFile.close();
                throw th2;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f69602b = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iC = c(0, bArr);
        this.f69603c = iC;
        if (iC > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f69603c + ", Actual length: " + randomAccessFile2.length());
        }
        this.f69604e = c(4, bArr);
        int iC2 = c(8, bArr);
        int iC3 = c(12, bArr);
        this.f69605f = b(iC2);
        this.f69606g = b(iC3);
    }

    public static int c(int i10, byte[] bArr) {
        return ((bArr[i10] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 24) + ((bArr[i10 + 1] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 16) + ((bArr[i10 + 2] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8) + (bArr[i10 + 3] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public static void h(int i10, int i11, byte[] bArr) {
        bArr[i10] = (byte) (i11 >> 24);
        bArr[i10 + 1] = (byte) (i11 >> 16);
        bArr[i10 + 2] = (byte) (i11 >> 8);
        bArr[i10 + 3] = (byte) i11;
    }

    public final void a(int i10) throws IOException {
        int i11 = i10 + 4;
        int iUsedBytes = this.f69603c - usedBytes();
        if (iUsedBytes >= i11) {
            return;
        }
        int i12 = this.f69603c;
        do {
            iUsedBytes += i12;
            i12 <<= 1;
        } while (iUsedBytes < i11);
        RandomAccessFile randomAccessFile = this.f69602b;
        randomAccessFile.setLength(i12);
        randomAccessFile.getChannel().force(true);
        l lVar = this.f69606g;
        int iF = f(lVar.f69596a + 4 + lVar.f69597b);
        if (iF < this.f69605f.f69596a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f69603c);
            long j10 = iF - 4;
            if (channel.transferTo(16L, j10, channel) != j10) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i13 = this.f69606g.f69596a;
        int i14 = this.f69605f.f69596a;
        if (i13 < i14) {
            int i15 = (this.f69603c + i13) - 16;
            g(i12, this.f69604e, i14, i15);
            this.f69606g = new l(i15, this.f69606g.f69597b);
        } else {
            g(i12, this.f69604e, i14, i13);
        }
        this.f69603c = i12;
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public final l b(int i10) throws IOException {
        if (i10 == 0) {
            return l.f69595c;
        }
        RandomAccessFile randomAccessFile = this.f69602b;
        randomAccessFile.seek(i10);
        return new l(i10, randomAccessFile.readInt());
    }

    public synchronized void clear() throws IOException {
        g(4096, 0, 0, 0);
        this.f69604e = 0;
        l lVar = l.f69595c;
        this.f69605f = lVar;
        this.f69606g = lVar;
        if (this.f69603c > 4096) {
            RandomAccessFile randomAccessFile = this.f69602b;
            randomAccessFile.setLength(4096);
            randomAccessFile.getChannel().force(true);
        }
        this.f69603c = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f69602b.close();
    }

    public final void d(int i10, int i11, int i12, byte[] bArr) {
        int iF = f(i10);
        int i13 = iF + i12;
        int i14 = this.f69603c;
        RandomAccessFile randomAccessFile = this.f69602b;
        if (i13 <= i14) {
            randomAccessFile.seek(iF);
            randomAccessFile.readFully(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iF;
        randomAccessFile.seek(iF);
        randomAccessFile.readFully(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i11 + i15, i12 - i15);
    }

    public final void e(int i10, int i11, int i12, byte[] bArr) throws IOException {
        int iF = f(i10);
        int i13 = iF + i12;
        int i14 = this.f69603c;
        RandomAccessFile randomAccessFile = this.f69602b;
        if (i13 <= i14) {
            randomAccessFile.seek(iF);
            randomAccessFile.write(bArr, i11, i12);
            return;
        }
        int i15 = i14 - iF;
        randomAccessFile.seek(iF);
        randomAccessFile.write(bArr, i11, i15);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i11 + i15, i12 - i15);
    }

    public final int f(int i10) {
        int i11 = this.f69603c;
        return i10 < i11 ? i10 : (i10 + 16) - i11;
    }

    public synchronized void forEach(n nVar) throws IOException {
        int iF = this.f69605f.f69596a;
        for (int i10 = 0; i10 < this.f69604e; i10++) {
            l lVarB = b(iF);
            nVar.read(new m(this, lVarB), lVarB.f69597b);
            iF = f(lVarB.f69596a + 4 + lVarB.f69597b);
        }
    }

    public final void g(int i10, int i11, int i12, int i13) throws IOException {
        int[] iArr = {i10, i11, i12, i13};
        int i14 = 0;
        int i15 = 0;
        while (true) {
            byte[] bArr = this.f69607h;
            if (i14 >= 4) {
                RandomAccessFile randomAccessFile = this.f69602b;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                h(i15, iArr[i14], bArr);
                i15 += 4;
                i14++;
            }
        }
    }

    public boolean hasSpaceFor(int i10, int i11) {
        return (usedBytes() + 4) + i10 <= i11;
    }

    public synchronized boolean isEmpty() {
        return this.f69604e == 0;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        l lVar = this.f69605f;
        int i10 = lVar.f69597b;
        byte[] bArr = new byte[i10];
        d(lVar.f69596a + 4, 0, i10, bArr);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        try {
            if (isEmpty()) {
                throw new NoSuchElementException();
            }
            if (this.f69604e == 1) {
                clear();
            } else {
                l lVar = this.f69605f;
                int iF = f(lVar.f69596a + 4 + lVar.f69597b);
                d(iF, 0, 4, this.f69607h);
                int iC = c(0, this.f69607h);
                g(this.f69603c, this.f69604e - 1, iF, this.f69606g.f69596a);
                this.f69604e--;
                this.f69605f = new l(iF, iC);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int size() {
        return this.f69604e;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f69603c);
        sb2.append(", size=");
        sb2.append(this.f69604e);
        sb2.append(", first=");
        sb2.append(this.f69605f);
        sb2.append(", last=");
        sb2.append(this.f69606g);
        sb2.append(", element lengths=[");
        try {
            forEach(new k(sb2));
        } catch (IOException e10) {
            f69601i.log(Level.WARNING, "read error", (Throwable) e10);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public int usedBytes() {
        if (this.f69604e == 0) {
            return 16;
        }
        l lVar = this.f69606g;
        int i10 = lVar.f69596a;
        int i11 = this.f69605f.f69596a;
        return i10 >= i11 ? (i10 - i11) + 4 + lVar.f69597b + 16 : (((i10 + 4) + lVar.f69597b) + this.f69603c) - i11;
    }

    public synchronized void add(byte[] bArr, int i10, int i11) throws IOException {
        int iF;
        if (bArr == null) {
            throw new NullPointerException("buffer");
        }
        if ((i10 | i11) < 0 || i11 > bArr.length - i10) {
            throw new IndexOutOfBoundsException();
        }
        a(i11);
        boolean zIsEmpty = isEmpty();
        if (zIsEmpty) {
            iF = 16;
        } else {
            l lVar = this.f69606g;
            iF = f(lVar.f69596a + 4 + lVar.f69597b);
        }
        l lVar2 = new l(iF, i11);
        h(0, i11, this.f69607h);
        e(iF, 0, 4, this.f69607h);
        e(iF + 4, i10, i11, bArr);
        g(this.f69603c, this.f69604e + 1, zIsEmpty ? iF : this.f69605f.f69596a, iF);
        this.f69606g = lVar2;
        this.f69604e++;
        if (zIsEmpty) {
            this.f69605f = lVar2;
        }
    }

    public synchronized void peek(n nVar) throws IOException {
        if (this.f69604e > 0) {
            nVar.read(new m(this, this.f69605f), this.f69605f.f69597b);
        }
    }
}
