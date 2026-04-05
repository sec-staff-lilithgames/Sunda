package b8;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import o6.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final e f8921a;

    public g(e eVar) {
        this.f8921a = eVar;
    }

    public static String a(String str, c cVar, boolean z10) {
        String strTempExtension = z10 ? cVar.tempExtension() : cVar.f8920b;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance(SameMD5.TAG).digest(strReplaceAll.getBytes());
                StringBuilder sb2 = new StringBuilder();
                for (byte b10 : bArrDigest) {
                    sb2.append(String.format("%02x", Byte.valueOf(b10)));
                }
                strReplaceAll = sb2.toString();
            } catch (NoSuchAlgorithmException unused) {
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        return a.b.l("lottie_cache_", strReplaceAll, strTempExtension);
    }

    public final File b(String str) {
        File file = new File(c(), a(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(c(), a(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(c(), a(str, c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    public final File c() {
        File cacheDir = ((e0) this.f8921a).getCacheDir();
        if (cacheDir.isFile()) {
            cacheDir.delete();
        }
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        return cacheDir;
    }

    public void clear() {
        File fileC = c();
        if (fileC.exists()) {
            File[] fileArrListFiles = fileC.listFiles();
            if (fileArrListFiles != null && fileArrListFiles.length > 0) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
            fileC.delete();
        }
    }

    public final File d(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(c(), a(str, cVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }
}
