package w3;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final File f90365a;

    /* renamed from: b, reason: collision with root package name */
    public final File f90366b;

    /* renamed from: c, reason: collision with root package name */
    public final File f90367c;

    public a(File file) {
        this.f90365a = file;
        this.f90366b = new File(file.getPath() + ".new");
        this.f90367c = new File(file.getPath() + ".bak");
    }

    public static void a(File file, File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e("AtomicFile", "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e("AtomicFile", "Failed to rename " + file + " to " + file2);
    }

    public void delete() {
        this.f90365a.delete();
        this.f90366b.delete();
        this.f90367c.delete();
    }

    public void failWrite(FileOutputStream fileOutputStream) throws IOException {
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        File file = this.f90366b;
        if (file.delete()) {
            return;
        }
        Log.e("AtomicFile", "Failed to delete new file " + file);
    }

    public void finishWrite(FileOutputStream fileOutputStream) throws IOException {
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
            Log.e("AtomicFile", "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e("AtomicFile", "Failed to close file output stream", e10);
        }
        a(this.f90366b, this.f90365a);
    }

    public File getBaseFile() {
        return this.f90365a;
    }

    public FileInputStream openRead() throws FileNotFoundException {
        File file = this.f90367c;
        boolean zExists = file.exists();
        File file2 = this.f90365a;
        if (zExists) {
            a(file, file2);
        }
        File file3 = this.f90366b;
        if (file3.exists() && file2.exists() && !file3.delete()) {
            Log.e("AtomicFile", "Failed to delete outdated new file " + file3);
        }
        return new FileInputStream(file2);
    }

    public byte[] readFully() throws IOException {
        FileInputStream fileInputStreamOpenRead = openRead();
        try {
            byte[] bArr = new byte[fileInputStreamOpenRead.available()];
            int i10 = 0;
            while (true) {
                int i11 = fileInputStreamOpenRead.read(bArr, i10, bArr.length - i10);
                if (i11 <= 0) {
                    return bArr;
                }
                i10 += i11;
                int iAvailable = fileInputStreamOpenRead.available();
                if (iAvailable > bArr.length - i10) {
                    byte[] bArr2 = new byte[iAvailable + i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } finally {
            fileInputStreamOpenRead.close();
        }
    }

    public FileOutputStream startWrite() throws IOException {
        File file = this.f90366b;
        File file2 = this.f90367c;
        if (file2.exists()) {
            a(file2, this.f90365a);
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (!file.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + file);
            }
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + file, e10);
            }
        }
    }
}
