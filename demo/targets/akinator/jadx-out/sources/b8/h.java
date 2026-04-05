package b8;

import android.content.Context;
import com.ironsource.G5;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import r7.i0;
import r7.o;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final g f8922a;

    /* renamed from: b, reason: collision with root package name */
    public final f f8923b;

    public h(g gVar, f fVar) {
        this.f8922a = gVar;
        this.f8923b = fVar;
    }

    public final i0 a(Context context, String str, InputStream inputStream, String str2, String str3) {
        i0 i0VarFromZipStreamSync;
        c cVar;
        if (str2 == null) {
            str2 = G5.L;
        }
        boolean zContains = str2.contains("application/zip");
        g gVar = this.f8922a;
        if (zContains || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            e8.e.debug("Handling zip response.");
            c cVar2 = c.ZIP;
            i0VarFromZipStreamSync = (str3 == null || gVar == null) ? o.fromZipStreamSync(context, new ZipInputStream(inputStream), (String) null) : o.fromZipStreamSync(context, new ZipInputStream(new FileInputStream(gVar.d(str, inputStream, cVar2))), str);
            cVar = cVar2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            e8.e.debug("Handling gzip response.");
            cVar = c.GZIP;
            i0VarFromZipStreamSync = (str3 == null || gVar == null) ? o.fromJsonInputStreamSync(new GZIPInputStream(inputStream), null) : o.fromJsonInputStreamSync(new GZIPInputStream(new FileInputStream(gVar.d(str, inputStream, cVar))), str);
        } else {
            e8.e.debug("Received json response.");
            cVar = c.JSON;
            i0VarFromZipStreamSync = (str3 == null || gVar == null) ? o.fromJsonInputStreamSync(inputStream, null) : o.fromJsonInputStreamSync(new FileInputStream(gVar.d(str, inputStream, cVar).getAbsolutePath()), str);
        }
        if (str3 != null && i0VarFromZipStreamSync.getValue() != null && gVar != null) {
            gVar.getClass();
            File file = new File(gVar.c(), g.a(str, cVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            e8.e.debug("Copying temp file to real file (" + file2 + ")");
            if (!zRenameTo) {
                e8.e.warning("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return i0VarFromZipStreamSync;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r7.i0 fetchSync(android.content.Context r12, java.lang.String r13, java.lang.String r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b8.h.fetchSync(android.content.Context, java.lang.String, java.lang.String):r7.i0");
    }
}
