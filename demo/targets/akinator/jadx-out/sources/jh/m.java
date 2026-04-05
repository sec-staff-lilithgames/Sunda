package jh;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.google.android.play.core.splitinstall.internal.o0;
import ih.q;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final o0 f69555c = new o0("SplitInstallInfoProvider");

    /* renamed from: a, reason: collision with root package name */
    public final Context f69556a;

    /* renamed from: b, reason: collision with root package name */
    public final String f69557b;

    public m(Context context, String str) {
        this.f69556a = context;
        this.f69557b = str;
    }

    public static final HashSet a(PackageInfo packageInfo) {
        Bundle bundle = packageInfo.applicationInfo.metaData;
        HashSet hashSet = new HashSet();
        o0 o0Var = f69555c;
        if (bundle != null) {
            String string = bundle.getString("com.android.dynamic.apk.fused.modules");
            if (string == null || string.isEmpty()) {
                o0Var.zza("App has no fused modules.", new Object[0]);
            } else {
                Collections.addAll(hashSet, string.split(",", -1));
                hashSet.remove("");
                hashSet.remove("base");
            }
        }
        String[] strArr = packageInfo.splitNames;
        if (strArr != null) {
            o0Var.zza("Adding splits from package manager: %s", Arrays.toString(strArr));
            Collections.addAll(hashSet, strArr);
        } else {
            o0Var.zza("No splits are found or app cannot be found in package manager.", new Object[0]);
        }
        k kVar = (k) l.f69554a.get();
        if (kVar != null) {
            hashSet.addAll(((q) kVar).zza());
        }
        return hashSet;
    }

    public static String zzb(String str) {
        return str.startsWith("config.") ? "" : str.split("\\.config\\.", 2)[0];
    }

    public static boolean zze(String str) {
        return str.startsWith("config.") || str.contains(".config.");
    }

    public static final Set zzf(PackageInfo packageInfo) {
        HashSet hashSet = new HashSet();
        Iterator it = a(packageInfo).iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!zze(str)) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jh.h zza(android.os.Bundle r10) throws android.content.res.Resources.NotFoundException {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            com.google.android.play.core.splitinstall.internal.o0 r2 = jh.m.f69555c
            if (r10 != 0) goto Le
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "No metadata found in Context."
            r2.zze(r1, r10)
            return r0
        Le:
            java.lang.String r3 = "com.android.vending.splits"
            int r10 = r10.getInt(r3)
            if (r10 != 0) goto L1e
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "No metadata found in AndroidManifest."
            r2.zze(r1, r10)
            return r0
        L1e:
            android.content.Context r3 = r9.f69556a     // Catch: android.content.res.Resources.NotFoundException -> Le2
            android.content.res.Resources r3 = r3.getResources()     // Catch: android.content.res.Resources.NotFoundException -> Le2
            android.content.res.XmlResourceParser r10 = r3.getXml(r10)     // Catch: android.content.res.Resources.NotFoundException -> Le2
            jh.g r3 = new jh.g
            r3.<init>()
        L2d:
            int r4 = r10.next()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            r5 = 1
            if (r4 == r5) goto Lcc
            int r4 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            r5 = 2
            if (r4 != r5) goto L2d
            java.lang.String r4 = r10.getName()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            java.lang.String r6 = "splits"
            boolean r4 = r4.equals(r6)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r4 != 0) goto L54
            kc.p.Y(r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            goto L2d
        L4b:
            r10 = move-exception
            goto Ld1
        L4e:
            r10 = move-exception
            goto Ld1
        L51:
            r10 = move-exception
            goto Ld1
        L54:
            int r4 = r10.next()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            r6 = 3
            if (r4 == r6) goto L2d
            int r4 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r4 != r5) goto L54
            java.lang.String r4 = r10.getName()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            java.lang.String r7 = "module"
            boolean r4 = r4.equals(r7)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r4 == 0) goto Lc8
            java.lang.String r4 = "name"
            java.lang.String r4 = kc.p.X(r4, r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r4 == 0) goto Lc4
        L75:
            int r7 = r10.next()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r7 == r6) goto L54
            int r7 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r7 != r5) goto L75
            java.lang.String r7 = r10.getName()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            java.lang.String r8 = "language"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r7 != 0) goto L91
            kc.p.Y(r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            goto L75
        L91:
            int r7 = r10.next()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r7 == r6) goto L75
            int r7 = r10.getEventType()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r7 != r5) goto L91
            java.lang.String r7 = r10.getName()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            java.lang.String r8 = "entry"
            boolean r7 = r7.equals(r8)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r7 == 0) goto Lc0
            java.lang.String r7 = "key"
            java.lang.String r7 = kc.p.X(r7, r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            java.lang.String r8 = "split"
            java.lang.String r8 = kc.p.X(r8, r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            kc.p.Y(r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            if (r7 == 0) goto L91
            if (r8 == 0) goto L91
            r3.zza(r4, r7, r8)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            goto L91
        Lc0:
            kc.p.Y(r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            goto L91
        Lc4:
            kc.p.Y(r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            goto L54
        Lc8:
            kc.p.Y(r10)     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            goto L54
        Lcc:
            jh.h r0 = r3.zzb()     // Catch: java.lang.IllegalStateException -> L4b java.io.IOException -> L4e org.xmlpull.v1.XmlPullParserException -> L51
            goto Ld8
        Ld1:
            java.lang.String r3 = "SplitInstall"
            java.lang.String r4 = "Error while parsing splits.xml"
            android.util.Log.e(r3, r4, r10)
        Ld8:
            if (r0 != 0) goto Le1
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "Can't parse languages metadata."
            r2.zze(r1, r10)
        Le1:
            return r0
        Le2:
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r1 = "Resource with languages metadata doesn't exist."
            r2.zze(r1, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jh.m.zza(android.os.Bundle):jh.h");
    }

    public final Set zzc() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        try {
            packageInfo = this.f69556a.getPackageManager().getPackageInfo(this.f69557b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f69555c.zzb("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        return (packageInfo == null || packageInfo.applicationInfo == null) ? new HashSet() : zzf(packageInfo);
    }

    public final Set zzd() throws PackageManager.NameNotFoundException {
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        h hVarZza;
        HashSet hashSet = null;
        try {
            packageInfo = this.f69556a.getPackageManager().getPackageInfo(this.f69557b, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            f69555c.zzb("App is not found in PackageManager", new Object[0]);
            packageInfo = null;
        }
        if (packageInfo != null && (applicationInfo = packageInfo.applicationInfo) != null && (hVarZza = zza(applicationInfo.metaData)) != null) {
            hashSet = new HashSet();
            HashSet hashSetA = a(packageInfo);
            hashSetA.add("");
            Set setZzf = zzf(packageInfo);
            setZzf.add("");
            for (Map.Entry entry : hVarZza.zza(setZzf).entrySet()) {
                if (hashSetA.containsAll((Collection) entry.getValue())) {
                    hashSet.add((String) entry.getKey());
                }
            }
        }
        return hashSet;
    }
}
