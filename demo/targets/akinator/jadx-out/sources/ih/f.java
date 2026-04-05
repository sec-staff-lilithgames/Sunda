package ih;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f59583a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f59584b;

    /* renamed from: c, reason: collision with root package name */
    public File f59585c;

    public f(Context context) throws PackageManager.NameNotFoundException {
        this.f59584b = context;
        this.f59583a = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
    }

    public static File b(File file, String str) {
        File file2 = new File(file, str);
        if (file2.getCanonicalPath().startsWith(file.getCanonicalPath())) {
            return file2;
        }
        throw new IllegalArgumentException("split ID cannot be placed in target directory");
    }

    public static void c(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("File input must be directory when it exists.");
            }
        } else {
            file.mkdirs();
            if (!file.isDirectory()) {
                throw new IOException("Unable to create directory: ".concat(String.valueOf(file.getAbsolutePath())));
            }
        }
    }

    public static void zzl(File file) throws IOException {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                zzl(file2);
            }
        }
        if (file.exists() && !file.delete()) {
            throw new IOException(a.b.l("Failed to delete '", file.getAbsolutePath(), "'"));
        }
    }

    public static void zzm(File file) {
        file.setWritable(false, true);
        file.setWritable(false, false);
    }

    public static boolean zzp(File file) {
        return !file.canWrite();
    }

    public final HashSet a() {
        File file = new File(e(), "verified-splits");
        c(file);
        HashSet hashSet = new HashSet();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && file2.getName().endsWith(".apk") && zzp(file2)) {
                    hashSet.add(new c(file2, file2.getName().substring(0, r5.length() - 4)));
                }
            }
        }
        return hashSet;
    }

    public final File d() {
        if (this.f59585c == null) {
            Context context = this.f59584b;
            if (context == null) {
                throw new IllegalStateException("context must be non-null to populate null filesDir");
            }
            this.f59585c = context.getFilesDir();
        }
        File file = new File(this.f59585c, "splitcompat");
        c(file);
        return file;
    }

    public final File e() {
        File file = new File(d(), Long.toString(this.f59583a));
        c(file);
        return file;
    }

    public final File zza(String str) throws IOException {
        File file = new File(e(), "dex");
        c(file);
        File fileB = b(file, str);
        c(fileB);
        return fileB;
    }

    public final File zzb() throws IOException {
        File file = new File(e(), "unverified-splits");
        c(file);
        return file;
    }

    public final File zzc(String str, String str2) throws IOException {
        File file = new File(e(), "native-libraries");
        c(file);
        File fileB = b(file, str);
        c(fileB);
        return b(fileB, str2);
    }

    public final File zzd() throws IOException {
        return new File(e(), "lock.tmp");
    }

    public final File zze(String str) throws IOException {
        return b(zzb(), String.valueOf(str).concat(".apk"));
    }

    public final File zzf(File file) throws IOException {
        File file2 = new File(e(), "verified-splits");
        c(file2);
        return b(file2, file.getName());
    }

    public final File zzg(String str) throws IOException {
        File file = new File(e(), "verified-splits");
        c(file);
        return b(file, String.valueOf(str).concat(".apk"));
    }

    public final void zzk() throws IOException {
        File fileD = d();
        String[] list = fileD.list();
        if (list != null) {
            for (String str : list) {
                long j10 = this.f59583a;
                if (!str.equals(Long.toString(j10))) {
                    File file = new File(fileD, str);
                    Log.d("SplitCompat", "FileStorage: removing directory for different version code (directory = " + file.toString() + ", current version code = " + j10 + ")");
                    zzl(file);
                }
            }
        }
    }
}
