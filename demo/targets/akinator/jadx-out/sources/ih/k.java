package ih;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.util.HashSet;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class k implements m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HashSet f59594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f59595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ZipFile f59596c;

    public k(HashSet hashSet, c cVar, ZipFile zipFile) {
        this.f59594a = hashSet;
        this.f59595b = cVar;
        this.f59596c = zipFile;
    }

    @Override // ih.m
    public final void zza(n nVar, File file, boolean z10) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        this.f59594a.add(file);
        if (z10) {
            return;
        }
        c cVar = this.f59595b;
        String str = cVar.f59581b;
        String str2 = nVar.f59597a;
        ZipEntry zipEntry = nVar.f59598b;
        String absolutePath = cVar.f59580a.getAbsolutePath();
        String name = zipEntry.getName();
        String absolutePath2 = file.getAbsolutePath();
        StringBuilder sbB = b3.h.b("NativeLibraryExtractor: split '", str, "' has native library '", str2, "' that does not exist; extracting from '");
        com.google.android.gms.internal.play_billing.a.B(sbB, absolutePath, "!", name, "' to '");
        sbB.append(absolutePath2);
        sbB.append("'");
        Log.i("SplitCompat", sbB.toString());
        byte[] bArr = new byte[4096];
        if (file.exists()) {
            file.delete();
        }
        InputStream inputStream = this.f59596c.getInputStream(zipEntry);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                f.zzm(file);
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 <= 0) {
                        fileOutputStream.close();
                        inputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, i10);
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Throwable th3) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                }
            }
            throw th2;
        }
    }
}
