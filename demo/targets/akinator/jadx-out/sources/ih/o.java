package ih;

import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes6.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f59599b = Pattern.compile("lib/([^/]+)/(.*\\.so)$");

    /* renamed from: a, reason: collision with root package name */
    public final f f59600a;

    public o(f fVar) {
        this.f59600a = fVar;
    }

    public static void b(c cVar, l lVar) throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        ZipFile zipFile;
        try {
            zipFile = new ZipFile(cVar.f59580a);
        } catch (IOException e10) {
            e = e10;
            zipFile = null;
        }
        try {
            String str = cVar.f59581b;
            HashMap map = new HashMap();
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = f59599b.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    String strGroup = matcher.group(1);
                    String strGroup2 = matcher.group(2);
                    Log.d("SplitCompat", "NativeLibraryExtractor: split '" + str + "' has native library '" + strGroup2 + "' for ABI '" + strGroup + "'");
                    Set hashSet = (Set) map.get(strGroup);
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(strGroup, hashSet);
                    }
                    hashSet.add(new n(zipEntryNextElement, strGroup2));
                }
            }
            HashMap map2 = new HashMap();
            for (String str2 : Build.SUPPORTED_ABIS) {
                if (map.containsKey(str2)) {
                    Log.d("SplitCompat", "NativeLibraryExtractor: there are native libraries for supported ABI " + str2 + "; will use this ABI");
                    for (n nVar : (Set) map.get(str2)) {
                        String str3 = nVar.f59597a;
                        if (map2.containsKey(str3)) {
                            Log.d("SplitCompat", "NativeLibraryExtractor: skipping library " + str3 + " for ABI " + str2 + "; already present for a better ABI");
                        } else {
                            map2.put(str3, nVar);
                            Log.d("SplitCompat", "NativeLibraryExtractor: using library " + str3 + " for ABI " + str2);
                        }
                    }
                } else {
                    Log.d("SplitCompat", "NativeLibraryExtractor: there are no native libraries for supported ABI " + str2);
                }
            }
            lVar.zza(zipFile, new HashSet(map2.values()));
            zipFile.close();
        } catch (IOException e11) {
            e = e11;
            if (zipFile != null) {
                try {
                    zipFile.close();
                } catch (IOException e12) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(e, e12);
                }
            }
            throw e;
        }
    }

    public final HashSet a() throws IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        Log.d("SplitCompat", "NativeLibraryExtractor: synchronizing native libraries");
        f fVar = this.f59600a;
        HashSet hashSetA = fVar.a();
        ArrayList arrayList = new ArrayList();
        File file = new File(fVar.e(), "native-libraries");
        f.c(file);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    arrayList.add(file2.getName());
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = hashSetA.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    Log.i("SplitCompat", "NativeLibraryExtractor: extracted split '" + str + "' has no corresponding split; deleting");
                    File file3 = new File(fVar.e(), "native-libraries");
                    f.c(file3);
                    File fileB = f.b(file3, str);
                    f.c(fileB);
                    f.zzl(fileB);
                    break;
                }
                if (((c) it2.next()).f59581b.equals(str)) {
                    break;
                }
            }
        }
        HashSet hashSet = new HashSet();
        Iterator it3 = hashSetA.iterator();
        while (it3.hasNext()) {
            c cVar = (c) it3.next();
            HashSet hashSet2 = new HashSet();
            b(cVar, new j(this, hashSet2, cVar));
            String str2 = cVar.f59581b;
            HashSet hashSet3 = new HashSet();
            File file4 = new File(fVar.e(), "native-libraries");
            f.c(file4);
            File fileB2 = f.b(file4, str2);
            f.c(fileB2);
            File[] fileArrListFiles2 = fileB2.listFiles();
            if (fileArrListFiles2 != null) {
                for (File file5 : fileArrListFiles2) {
                    if (file5.isFile()) {
                        hashSet3.add(file5);
                    }
                }
            }
            Iterator it4 = hashSet3.iterator();
            while (it4.hasNext()) {
                File file6 = (File) it4.next();
                if (!hashSet2.contains(file6)) {
                    String absolutePath = file6.getAbsolutePath();
                    String absolutePath2 = cVar.f59580a.getAbsolutePath();
                    StringBuilder sbB = b3.h.b("NativeLibraryExtractor: file '", absolutePath, "' found in split '", str2, "' that is not in the split file '");
                    sbB.append(absolutePath2);
                    sbB.append("'; removing");
                    Log.i("SplitCompat", sbB.toString());
                    File parentFile = file6.getParentFile().getParentFile();
                    File file7 = new File(fVar.e(), "native-libraries");
                    f.c(file7);
                    if (!parentFile.equals(file7)) {
                        throw new IllegalStateException("File to remove is not a native library");
                    }
                    f.zzl(file6);
                }
            }
            hashSet.addAll(hashSet2);
        }
        return hashSet;
    }

    public final void c(c cVar, Set set, m mVar) throws IOException {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            File fileZzc = this.f59600a.zzc(cVar.f59581b, nVar.f59597a);
            boolean z10 = false;
            if (fileZzc.exists() && fileZzc.length() == nVar.f59598b.getSize() && f.zzp(fileZzc)) {
                z10 = true;
            }
            mVar.zza(nVar, fileZzc, z10);
        }
    }
}
