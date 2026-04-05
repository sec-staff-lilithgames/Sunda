package com.bytedance.adsdk.jd.cm;

import android.util.Pair;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class qk {
    private final my jpo;

    public qk(my myVar) {
        this.jpo = myVar;
    }

    private File jd(String str) throws FileNotFoundException {
        File file = new File(jpo(), jpo(str, wqx.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(jpo(), jpo(str, wqx.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        return null;
    }

    public Pair<wqx, InputStream> jpo(String str) {
        try {
            File fileJd = jd(str);
            if (fileJd == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(fileJd);
            wqx wqxVar = fileJd.getAbsolutePath().endsWith(".zip") ? wqx.ZIP : wqx.JSON;
            fileJd.getAbsolutePath();
            return new Pair<>(wqxVar, fileInputStream);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public File jpo(String str, InputStream inputStream, wqx wqxVar) throws IOException {
        File file = new File(jpo(), jpo(str, wqxVar, true));
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 != -1) {
                        fileOutputStream.write(bArr, 0, i10);
                    } else {
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (Throwable th2) {
                fileOutputStream.close();
                throw th2;
            }
        } finally {
            inputStream.close();
        }
    }

    public void jpo(String str, wqx wqxVar) {
        File file = new File(jpo(), jpo(str, wqxVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        file2.toString();
        if (zRenameTo) {
            return;
        }
        file.getAbsolutePath();
        file2.getAbsolutePath();
    }

    private File jpo() {
        File fileJpo = this.jpo.jpo();
        if (fileJpo.isFile()) {
            fileJpo.delete();
        }
        if (!fileJpo.exists()) {
            fileJpo.mkdirs();
        }
        return fileJpo;
    }

    private static String jpo(String str, wqx wqxVar, boolean z10) {
        StringBuilder sb2 = new StringBuilder("lottie_cache_");
        sb2.append(str.replaceAll("\\W+", ""));
        sb2.append(z10 ? wqxVar.jpo() : wqxVar.wqx);
        return sb2.toString();
    }
}
