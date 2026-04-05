package ih;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.play.core.splitinstall.internal.o0;
import com.google.android.play.core.splitinstall.internal.z;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicReference f59574e = new AtomicReference(null);

    /* renamed from: a, reason: collision with root package name */
    public final f f59575a;

    /* renamed from: b, reason: collision with root package name */
    public final jh.c f59576b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f59577c = new HashSet();

    /* renamed from: d, reason: collision with root package name */
    public final b f59578d;

    public a(Context context) {
        try {
            f fVar = new f(context);
            this.f59575a = fVar;
            this.f59578d = new b(fVar);
            this.f59576b = new jh.c(context);
        } catch (PackageManager.NameNotFoundException e10) {
            throw new z("Failed to initialize FileStorage", e10);
        }
    }

    public static boolean b(Context context, boolean z10) {
        AtomicReference atomicReference;
        boolean z11;
        final Context context2;
        a aVar = new a(context);
        while (true) {
            atomicReference = f59574e;
            if (!atomicReference.compareAndSet(null, aVar)) {
                if (atomicReference.get() != null && atomicReference.get() != null) {
                    z11 = false;
                    break;
                }
            } else {
                z11 = true;
                break;
            }
        }
        a aVar2 = (a) atomicReference.get();
        if (z11) {
            context2 = context;
            jh.j.f69551b.zzb(new com.google.android.play.core.splitinstall.internal.e(context2, e.zza(), new com.google.android.play.core.splitinstall.internal.g(context, aVar2.f59575a, new com.google.android.play.core.splitinstall.internal.b()), aVar2.f59575a, new t()));
            jh.l.zzb(new q(aVar2));
            e.zza().execute(new Runnable() { // from class: ih.p
                @Override // java.lang.Runnable
                public final void run() {
                    Context context3 = context2;
                    AtomicReference atomicReference2 = a.f59574e;
                    try {
                        jh.p.zzg(context3).zzc(true);
                    } catch (SecurityException unused) {
                        Log.e("SplitCompat", "Failed to set broadcast receiver to always on.");
                    }
                }
            });
        } else {
            context2 = context;
        }
        try {
            aVar2.a(context2, z10);
            return true;
        } catch (Exception e10) {
            Log.e("SplitCompat", "Error installing additional splits", e10);
            return false;
        }
    }

    public static boolean install(Context context) {
        return b(context, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0051 A[Catch: all -> 0x0061, Exception -> 0x0063, LOOP:0: B:25:0x004b->B:27:0x0051, LOOP_END, TryCatch #5 {Exception -> 0x0063, blocks: (B:24:0x0042, B:25:0x004b, B:27:0x0051, B:32:0x0065), top: B:52:0x0042, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006a A[Catch: all -> 0x0035, TRY_ENTER, TRY_LEAVE, TryCatch #1 {, blocks: (B:14:0x002a, B:15:0x002e, B:34:0x006a, B:45:0x0082, B:46:0x0085, B:39:0x0079, B:23:0x003b, B:24:0x0042, B:25:0x004b, B:27:0x0051, B:32:0x0065, B:37:0x0070), top: B:53:0x002a, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean installActivity(android.content.Context r6) {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = ih.a.f59574e
            java.lang.Object r0 = r0.get()
            ih.a r0 = (ih.a) r0
            if (r0 != 0) goto L1c
            android.content.Context r0 = r6.getApplicationContext()
            if (r0 == 0) goto L17
            android.content.Context r0 = r6.getApplicationContext()
            install(r0)
        L17:
            boolean r6 = install(r6)
            return r6
        L1c:
            ih.b r1 = r0.f59578d
            java.util.HashSet r2 = r0.f59577c
            monitor-enter(r2)
            java.util.HashSet r3 = new java.util.HashSet     // Catch: java.lang.Throwable -> L88
            java.util.HashSet r0 = r0.f59577c     // Catch: java.lang.Throwable -> L88
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L88
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            monitor-enter(r1)
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.getThreadPolicy()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L39
            android.os.StrictMode.allowThreadDiskReads()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            android.os.StrictMode.allowThreadDiskWrites()     // Catch: java.lang.Throwable -> L35 java.lang.Exception -> L37
            goto L42
        L35:
            r6 = move-exception
            goto L86
        L37:
            r2 = move-exception
            goto L3b
        L39:
            r2 = move-exception
            r0 = 0
        L3b:
            java.lang.String r4 = "SplitCompat"
            java.lang.String r5 = "Unable to set up strict mode."
            android.util.Log.i(r4, r5, r2)     // Catch: java.lang.Throwable -> L35
        L42:
            java.util.HashSet r2 = new java.util.HashSet     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r2.<init>()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
        L4b:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r4 == 0) goto L65
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            ih.f r5 = r1.f59579a     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            java.io.File r4 = r5.zzg(r4)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            r2.add(r4)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            goto L4b
        L61:
            r6 = move-exception
            goto L7f
        L63:
            r6 = move-exception
            goto L70
        L65:
            r1.zza(r6, r2)     // Catch: java.lang.Throwable -> L61 java.lang.Exception -> L63
            if (r0 == 0) goto L6d
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
        L6d:
            monitor-exit(r1)
            r6 = 1
            goto L7e
        L70:
            java.lang.String r2 = "SplitCompat"
            java.lang.String r3 = "Error installing additional splits"
            android.util.Log.e(r2, r3, r6)     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L7c
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
        L7c:
            monitor-exit(r1)
            r6 = 0
        L7e:
            return r6
        L7f:
            if (r0 != 0) goto L82
            goto L85
        L82:
            android.os.StrictMode.setThreadPolicy(r0)     // Catch: java.lang.Throwable -> L35
        L85:
            throw r6     // Catch: java.lang.Throwable -> L35
        L86:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L35
            throw r6
        L88:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L88
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ih.a.installActivity(android.content.Context):boolean");
    }

    public static boolean zzd(Context context) {
        return b(context, true);
    }

    public static boolean zze() {
        return f59574e.get() != null;
    }

    public final synchronized void a(Context context, boolean z10) {
        ZipFile zipFile;
        try {
            if (z10) {
                this.f59575a.zzk();
            } else {
                e.zza().execute(new r(this));
            }
            String packageName = context.getPackageName();
            try {
                String[] strArr = context.getPackageManager().getPackageInfo(packageName, 0).splitNames;
                List<String> arrayList = strArr == null ? new ArrayList() : Arrays.asList(strArr);
                HashSet hashSetA = this.f59575a.a();
                Set setZza = this.f59576b.zza();
                HashSet hashSet = new HashSet();
                Iterator it = hashSetA.iterator();
                while (it.hasNext()) {
                    String str = ((c) it.next()).f59581b;
                    if (arrayList.contains(str) || setZza.contains(jh.m.zzb(str))) {
                        hashSet.add(str);
                        it.remove();
                    }
                }
                if (z10) {
                    Iterator it2 = hashSet.iterator();
                    while (it2.hasNext()) {
                        f.zzl(this.f59575a.zzg((String) it2.next()));
                    }
                    this.f59576b.zzb();
                } else if (!hashSet.isEmpty()) {
                    e.zza().execute(new s(this, hashSet));
                }
                HashSet hashSet2 = new HashSet();
                Iterator it3 = hashSetA.iterator();
                while (it3.hasNext()) {
                    String str2 = ((c) it3.next()).f59581b;
                    if (!jh.m.zze(str2)) {
                        hashSet2.add(str2);
                    }
                }
                for (String str3 : arrayList) {
                    if (!jh.m.zze(str3)) {
                        hashSet2.add(str3);
                    }
                }
                HashSet hashSet3 = new HashSet(hashSetA.size());
                Iterator it4 = hashSetA.iterator();
                while (it4.hasNext()) {
                    c cVar = (c) it4.next();
                    String str4 = cVar.f59581b;
                    o0 o0Var = jh.m.f69555c;
                    if (str4.startsWith("config.") || hashSet2.contains(jh.m.zzb(cVar.f59581b))) {
                        hashSet3.add(cVar);
                    }
                }
                o oVar = new o(this.f59575a);
                com.google.android.play.core.splitinstall.internal.h hVarZza = com.google.android.play.core.splitinstall.internal.i.zza();
                ClassLoader classLoader = context.getClassLoader();
                ZipFile zipFile2 = null;
                if (z10) {
                    hVarZza.zza(classLoader, oVar.a());
                } else {
                    Iterator it5 = hashSet3.iterator();
                    while (it5.hasNext()) {
                        c cVar2 = (c) it5.next();
                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                        HashSet hashSet4 = new HashSet();
                        o.b(cVar2, new i(oVar, cVar2, hashSet4, atomicBoolean));
                        if (!atomicBoolean.get()) {
                            hashSet4 = null;
                        }
                        if (hashSet4 == null) {
                            it5.remove();
                        } else {
                            hVarZza.zza(classLoader, hashSet4);
                        }
                    }
                }
                HashSet hashSet5 = new HashSet();
                Iterator it6 = hashSet3.iterator();
                while (it6.hasNext()) {
                    c cVar3 = (c) it6.next();
                    try {
                        zipFile = new ZipFile(cVar3.f59580a);
                    } catch (IOException e10) {
                        e = e10;
                    }
                    try {
                        ZipEntry entry = zipFile.getEntry("classes.dex");
                        zipFile.close();
                        if (entry == null || hVarZza.zzb(classLoader, this.f59575a.zza(cVar3.f59581b), cVar3.f59580a, z10)) {
                            hashSet5.add(cVar3.f59580a);
                        } else {
                            Log.w("SplitCompat", "split was not installed ".concat(cVar3.f59580a.toString()));
                        }
                    } catch (IOException e11) {
                        e = e11;
                        zipFile2 = zipFile;
                        if (zipFile2 != null) {
                            try {
                                zipFile2.close();
                            } catch (IOException e12) {
                                try {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e12);
                                } catch (Exception unused) {
                                }
                            }
                        }
                        throw e;
                    }
                }
                this.f59578d.zza(context, hashSet5);
                HashSet hashSet6 = new HashSet();
                Iterator it7 = hashSet3.iterator();
                while (it7.hasNext()) {
                    c cVar4 = (c) it7.next();
                    if (hashSet5.contains(cVar4.f59580a)) {
                        Log.d("SplitCompat", "Split '" + cVar4.f59581b + "' installation emulated");
                        hashSet6.add(cVar4.f59581b);
                    } else {
                        Log.d("SplitCompat", "Split '" + cVar4.f59581b + "' installation not emulated.");
                    }
                }
                synchronized (this.f59577c) {
                    this.f59577c.addAll(hashSet6);
                }
            } catch (PackageManager.NameNotFoundException e13) {
                throw new IOException("Cannot load data for application '" + packageName + "'", e13);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
