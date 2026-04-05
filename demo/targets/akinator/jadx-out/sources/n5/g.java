package n5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import com.applovin.impl.ga;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final d f75655a = new d();

    /* renamed from: b, reason: collision with root package name */
    public static final e f75656b = new e();

    public static void a(PackageInfo packageInfo, File file) throws IOException {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(android.content.Context r16, java.util.concurrent.Executor r17, n5.f r18, boolean r19) throws android.content.pm.PackageManager.NameNotFoundException, java.io.IOException {
        /*
            r1 = r16
            r5 = r18
            android.content.Context r0 = r1.getApplicationContext()
            java.lang.String r2 = r0.getPackageName()
            android.content.pm.ApplicationInfo r3 = r0.getApplicationInfo()
            android.content.res.AssetManager r4 = r0.getAssets()
            java.io.File r0 = new java.io.File
            java.lang.String r3 = r3.sourceDir
            r0.<init>(r3)
            java.lang.String r6 = r0.getName()
            android.content.pm.PackageManager r0 = r1.getPackageManager()
            r10 = 0
            android.content.pm.PackageInfo r11 = r0.getPackageInfo(r2, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lda
            java.io.File r12 = r1.getFilesDir()
            java.lang.String r3 = "ProfileInstaller"
            r13 = 1
            if (r19 != 0) goto L89
            java.io.File r0 = new java.io.File
            java.lang.String r7 = "profileinstaller_profileWrittenFor_lastUpdateTime.dat"
            r0.<init>(r12, r7)
            boolean r7 = r0.exists()
            if (r7 != 0) goto L40
        L3e:
            r0 = r10
            goto L6d
        L40:
            java.io.DataInputStream r7 = new java.io.DataInputStream     // Catch: java.io.IOException -> L3e
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.io.IOException -> L3e
            r8.<init>(r0)     // Catch: java.io.IOException -> L3e
            r7.<init>(r8)     // Catch: java.io.IOException -> L3e
            long r8 = r7.readLong()     // Catch: java.lang.Throwable -> L62
            r7.close()     // Catch: java.io.IOException -> L3e
            long r14 = r11.lastUpdateTime
            int r0 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r0 != 0) goto L59
            r0 = r13
            goto L5a
        L59:
            r0 = r10
        L5a:
            if (r0 == 0) goto L6d
            r7 = 2
            r8 = 0
            r5.onResultReceived(r7, r8)
            goto L6d
        L62:
            r0 = move-exception
            r8 = r0
            r7.close()     // Catch: java.lang.Throwable -> L68
            goto L6c
        L68:
            r0 = move-exception
            r8.addSuppressed(r0)     // Catch: java.io.IOException -> L3e
        L6c:
            throw r8     // Catch: java.io.IOException -> L3e
        L6d:
            if (r0 != 0) goto L70
            goto L89
        L70:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "Skipping profile installation for "
            r0.<init>(r2)
            java.lang.String r2 = r1.getPackageName()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            n5.m.c(r1, r10)
            goto Ld9
        L89:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r7 = "Installing profile for "
            r0.<init>(r7)
            java.lang.String r7 = r1.getPackageName()
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r3, r0)
            java.io.File r9 = new java.io.File
            java.io.File r0 = new java.io.File
            java.lang.String r3 = "/data/misc/profiles/cur/0"
            r0.<init>(r3, r2)
            java.lang.String r2 = "primary.prof"
            r9.<init>(r0, r2)
            n5.a r2 = new n5.a
            java.lang.String r7 = "dexopt/baseline.prof"
            java.lang.String r8 = "dexopt/baseline.profm"
            r3 = r4
            r4 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            boolean r0 = r2.deviceAllowsProfileInstallerAotWrites()
            if (r0 != 0) goto Lc0
            r0 = r10
            goto Ld1
        Lc0:
            n5.a r0 = r2.read()
            n5.a r0 = r0.transcodeIfNeeded()
            boolean r0 = r0.write()
            if (r0 == 0) goto Ld1
            a(r11, r12)
        Ld1:
            if (r0 == 0) goto Ld6
            if (r19 == 0) goto Ld6
            r10 = r13
        Ld6:
            n5.m.c(r1, r10)
        Ld9:
            return
        Lda:
            r0 = move-exception
            r2 = 7
            r5.onResultReceived(r2, r0)
            n5.m.c(r1, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n5.g.b(android.content.Context, java.util.concurrent.Executor, n5.f, boolean):void");
    }

    public static void writeProfile(Context context) {
        writeProfile(context, new ga(2), f75655a);
    }

    public static void writeProfile(Context context, Executor executor, f fVar) throws PackageManager.NameNotFoundException, IOException {
        b(context, executor, fVar, false);
    }
}
