package ni;

import android.content.Context;
import ei.f;
import ei.h;
import hi.j;
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f76847a;

    /* renamed from: b, reason: collision with root package name */
    public final File f76848b;

    /* renamed from: c, reason: collision with root package name */
    public final File f76849c;

    /* renamed from: d, reason: collision with root package name */
    public final File f76850d;

    /* renamed from: e, reason: collision with root package name */
    public final File f76851e;

    /* renamed from: f, reason: collision with root package name */
    public final File f76852f;

    /* renamed from: g, reason: collision with root package name */
    public final File f76853g;

    public d(Context context) {
        String string;
        String processName = h.f54405a.getCurrentProcessDetails(context).getProcessName();
        this.f76847a = processName;
        File filesDir = context.getFilesDir();
        this.f76848b = filesDir;
        if (processName.isEmpty()) {
            string = ".com.google.firebase.crashlytics.files.v1";
        } else {
            StringBuilder sb2 = new StringBuilder(".crashlytics.v3");
            sb2.append(File.separator);
            sb2.append(processName.length() > 40 ? j.sha1(processName) : processName.replaceAll("[^a-zA-Z0-9.]", "_"));
            string = sb2.toString();
        }
        File file = new File(filesDir, string);
        b(file);
        this.f76849c = file;
        File file2 = new File(file, "open-sessions");
        b(file2);
        this.f76850d = file2;
        File file3 = new File(file, "reports");
        b(file3);
        this.f76851e = file3;
        File file4 = new File(file, "priority-reports");
        b(file4);
        this.f76852f = file4;
        File file5 = new File(file, "native-reports");
        b(file5);
        this.f76853g = file5;
    }

    public static synchronized void b(File file) {
        try {
            if (file.exists()) {
                if (file.isDirectory()) {
                    return;
                }
                f.getLogger().d("Unexpected non-directory file: " + file + "; deleting file and creating new directory.");
                file.delete();
            }
            if (!file.mkdirs()) {
                f.getLogger().e("Could not create Crashlytics-specific directory: " + file);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static boolean c(File file) {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                c(file2);
            }
        }
        return file.delete();
    }

    public static List d(Object[] objArr) {
        return objArr == null ? Collections.EMPTY_LIST : Arrays.asList(objArr);
    }

    public final void a(String str) {
        File file = new File(this.f76848b, str);
        if (file.exists() && c(file)) {
            f.getLogger().d("Deleted previous Crashlytics file system: " + file.getPath());
        }
    }

    public void cleanupPreviousFileSystems() {
        String[] list;
        a(".com.google.firebase.crashlytics");
        a(".com.google.firebase.crashlytics-ndk");
        if (this.f76847a.isEmpty()) {
            return;
        }
        a(".com.google.firebase.crashlytics.files.v1");
        final String str = ".com.google.firebase.crashlytics.files.v2" + File.pathSeparator;
        File file = this.f76848b;
        if (!file.exists() || (list = file.list(new FilenameFilter() { // from class: ni.c
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str2) {
                return str2.startsWith(str);
            }
        })) == null) {
            return;
        }
        for (String str2 : list) {
            a(str2);
        }
    }

    public void deleteAllCrashlyticsFiles() {
        c(this.f76849c);
    }

    public boolean deleteSessionFiles(String str) {
        return c(new File(this.f76850d, str));
    }

    public List<String> getAllOpenSessionIds() {
        return d(this.f76850d.list());
    }

    public File getCommonFile(String str) {
        return new File(this.f76849c, str);
    }

    public List<File> getCommonFiles(FilenameFilter filenameFilter) {
        return d(this.f76849c.listFiles(filenameFilter));
    }

    public File getNativeReport(String str) {
        return new File(this.f76853g, str);
    }

    public List<File> getNativeReports() {
        return d(this.f76853g.listFiles());
    }

    public File getNativeSessionDir(String str) {
        File file = new File(this.f76850d, str);
        file.mkdirs();
        File file2 = new File(file, "native");
        file2.mkdirs();
        return file2;
    }

    public File getPriorityReport(String str) {
        return new File(this.f76852f, str);
    }

    public List<File> getPriorityReports() {
        return d(this.f76852f.listFiles());
    }

    public File getReport(String str) {
        return new File(this.f76851e, str);
    }

    public List<File> getReports() {
        return d(this.f76851e.listFiles());
    }

    public File getSessionFile(String str, String str2) {
        File file = new File(this.f76850d, str);
        file.mkdirs();
        return new File(file, str2);
    }

    public List<File> getSessionFiles(String str, FilenameFilter filenameFilter) {
        File file = new File(this.f76850d, str);
        file.mkdirs();
        return d(file.listFiles(filenameFilter));
    }
}
