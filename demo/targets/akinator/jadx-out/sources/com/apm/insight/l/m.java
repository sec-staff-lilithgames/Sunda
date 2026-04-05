package com.apm.insight.l;

import android.text.TextUtils;
import com.apm.insight.l.e;
import com.apm.insight.nativecrash.NativeImpl;
import com.ironsource.C3191e4;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import io.ktor.util.date.GMTDateParser;
import j1.o2;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final StackTraceElement f13190a = new StackTraceElement("", "", "", 0);

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f13191a;

        /* renamed from: b, reason: collision with root package name */
        public int f13192b;

        public a(int i10, int i11) {
            this.f13191a = i10;
            this.f13192b = i11;
        }

        public final JSONObject a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f13191a);
                jSONObject.put(TtmlNode.END, this.f13192b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    public static String a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            a(stackTraceElement, sb2);
        }
        return sb2.toString();
    }

    public static StackTraceElement[] b(Throwable th2) {
        ArrayList arrayList = new ArrayList();
        try {
            a(th2, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    private static boolean c(String str) {
        Set<String> setA = g.a();
        if (setA.contains(str)) {
            return true;
        }
        for (String str2 : setA) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i10 = 0;
        while (th2 != null) {
            try {
                if ((th2 instanceof OutOfMemoryError) && (th2.getMessage().contains("allocate") || th2.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i10 > 20) {
                    return false;
                }
                i10++;
                th2 = th2.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    public static StringBuilder a(StackTraceElement stackTraceElement, StringBuilder sb2) {
        String className = stackTraceElement.getClassName();
        sb2.append("  at ");
        sb2.append(className);
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        sb2.append("(");
        sb2.append(stackTraceElement.getFileName());
        sb2.append(":");
        sb2.append(stackTraceElement.getLineNumber());
        sb2.append(")\n");
        return sb2;
    }

    public static JSONObject b(String str) {
        try {
            Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
            JSONObject jSONObject = new JSONObject();
            if (allStackTraces == null) {
                return null;
            }
            jSONObject.put("thread_all_count", allStackTraces.size());
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
                JSONObject jSONObject2 = new JSONObject();
                Thread key = entry.getKey();
                String name = key.getName();
                if (!c(name) && (str == null || (!str.equals(name) && !name.startsWith(str) && !name.endsWith(str)))) {
                    jSONObject2.put("thread_name", key.getName() + "(" + key.getId() + ")");
                    StackTraceElement[] value = entry.getValue();
                    if (value != null) {
                        JSONArray jSONArray2 = new JSONArray();
                        for (StackTraceElement stackTraceElement : value) {
                            jSONArray2.put(stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName() + "(" + stackTraceElement.getLineNumber() + ")");
                        }
                        jSONObject2.put("thread_stack", jSONArray2);
                        if (jSONArray2.length() > 0) {
                        }
                    }
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("thread_stacks", jSONArray);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean c(Throwable th2) {
        if (th2 == null) {
            return false;
        }
        int i10 = 0;
        while (th2 != null) {
            if (th2 instanceof OutOfMemoryError) {
                return true;
            }
            if (i10 > 20) {
                return false;
            }
            i10++;
            try {
                th2 = th2.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public static String a(Throwable th2) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            a(th2, printWriter);
            String string = stringWriter.toString();
            printWriter.close();
            return string;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    public static String a(Throwable th2, PrintStream printStream, e.a aVar) throws IOException {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        } catch (Throwable unused) {
            messageDigest = null;
        }
        e eVar = new e(printStream, messageDigest, aVar);
        try {
            a(th2, eVar);
        } catch (Throwable unused2) {
        }
        eVar.close();
        if (messageDigest == null) {
            return null;
        }
        byte[] bArrDigest = messageDigest.digest();
        if (bArrDigest != null && bArrDigest.length > 0) {
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', GMTDateParser.DAY_OF_MONTH, 'e', 'f'};
            char[] cArr2 = new char[bArrDigest.length << 1];
            int i10 = 0;
            for (byte b10 : bArrDigest) {
                int i11 = i10 + 1;
                cArr2[i10] = cArr[(b10 >>> 4) & 15];
                i10 += 2;
                cArr2[i11] = cArr[b10 & 15];
            }
            return new String(cArr2);
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L14
            return r1
        L14:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 10
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5b
            java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            r0 = r5
        L31:
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L56
            r7 = 256(0x100, float:3.59E-43)
            if (r0 > r7) goto L45
            r8.add(r1)     // Catch: java.lang.Throwable -> L5a
            r3.append(r1)     // Catch: java.lang.Throwable -> L5a
            r3.append(r4)     // Catch: java.lang.Throwable -> L5a
            goto L53
        L45:
            r2.add(r1)     // Catch: java.lang.Throwable -> L5a
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L5a
            if (r1 <= r7) goto L53
            r2.poll()     // Catch: java.lang.Throwable -> L5a
            int r5 = r5 + 1
        L53:
            int r0 = r0 + 1
            goto L31
        L56:
            com.apm.insight.a.a(r6)
            goto L5e
        L5a:
            r1 = r6
        L5b:
            com.apm.insight.a.a(r1)
        L5e:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L8a
            if (r5 == 0) goto L73
            java.lang.String r8 = "\t... skip "
            r3.append(r8)
            r3.append(r5)
            java.lang.String r8 = " lines\n"
            r3.append(r8)
        L73:
            java.util.Iterator r8 = r2.iterator()
        L77:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            r3.append(r4)
            goto L77
        L8a:
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.l.m.a(java.lang.String):java.lang.String");
    }

    private static void b(Throwable th2, int i10) {
        th2.getClass();
        String localizedMessage = th2.getLocalizedMessage();
        try {
            NativeImpl.a(i10, th2.getClass().getName());
            if (localizedMessage != null) {
                NativeImpl.a(i10, ": ");
                NativeImpl.a(i10, localizedMessage);
            }
            NativeImpl.a(i10, "\n");
        } catch (Throwable unused) {
        }
    }

    private static void a(StackTraceElement stackTraceElement, int i10) {
        try {
            NativeImpl.a(i10, "\tat ");
            NativeImpl.a(i10, stackTraceElement.getClassName());
            NativeImpl.a(i10, ".");
            NativeImpl.a(i10, stackTraceElement.getMethodName());
            if (stackTraceElement.isNativeMethod()) {
                NativeImpl.a(i10, "(Native Method)");
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    NativeImpl.a(i10, "(");
                    NativeImpl.a(i10, stackTraceElement.getFileName());
                    NativeImpl.a(i10, ":");
                    NativeImpl.a(i10, String.valueOf(stackTraceElement.getLineNumber()));
                    NativeImpl.a(i10, ")");
                } else {
                    NativeImpl.a(i10, "(");
                    NativeImpl.a(i10, stackTraceElement.getFileName());
                    NativeImpl.a(i10, ")");
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                NativeImpl.a(i10, "(Unknown Source:");
                NativeImpl.a(i10, String.valueOf(stackTraceElement.getLineNumber()));
                NativeImpl.a(i10, ")");
            } else {
                NativeImpl.a(i10, "(Unknown Source)");
            }
            NativeImpl.a(i10, "\n");
        } catch (Throwable unused) {
        }
    }

    private static void a(Throwable th2, List<StackTraceElement> list) {
        if (th2 == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th2);
        list.add(f13190a);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > 384;
        int length = stackTrace.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (z10 && i11 > 256) {
                list.add(f13190a);
                break;
            } else {
                list.add(stackTraceElement);
                i11++;
                i10++;
            }
        }
        if (z10) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                list.add(stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            a(th3, list, "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            a(cause, list, "", setNewSetFromMap, 128);
        }
    }

    private static void a(Throwable th2, List<StackTraceElement> list, String str, Set<Throwable> set, int i10) {
        while (!set.contains(th2)) {
            set.add(th2);
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int i11 = 0;
            boolean z10 = stackTrace.length > i10;
            list.add(f13190a);
            int length = stackTrace.length;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                if (i12 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i12];
                if (z10 && i13 > i10) {
                    list.add(f13190a);
                    break;
                } else {
                    list.add(stackTraceElement);
                    i13++;
                    i12++;
                }
            }
            if (z10) {
                for (int length2 = stackTrace.length - (i10 / 2); length2 < stackTrace.length; length2++) {
                    list.add(stackTrace[length2]);
                }
            }
            Throwable[] suppressed = th2.getSuppressed();
            int length3 = suppressed.length;
            while (true) {
                int i14 = 10;
                if (i11 >= length3) {
                    break;
                }
                Throwable th3 = suppressed[i11];
                String strL = o2.l(str, "\t");
                int i15 = i10 / 2;
                if (i15 > 10) {
                    i14 = i15;
                }
                a(th3, list, strL, set, i14);
                i11++;
            }
            th2 = th2.getCause();
            if (th2 == null) {
                return;
            }
            i10 /= 2;
            if (i10 <= 10) {
                i10 = 10;
            }
        }
        list.add(f13190a);
    }

    private static void a(Throwable th2, PrintWriter printWriter) {
        if (th2 == null) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.add(th2);
        printWriter.println(th2);
        StackTraceElement[] stackTrace = th2.getStackTrace();
        boolean z10 = stackTrace.length > 384;
        int length = stackTrace.length;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i10];
            if (z10 && i11 > 256) {
                StringBuilder sb2 = new StringBuilder("\t... skip ");
                sb2.append((stackTrace.length - i11) - 128);
                sb2.append(" lines");
                printWriter.println(sb2.toString());
                break;
            }
            printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
            i11++;
            i10++;
        }
        if (z10) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th3 : th2.getSuppressed()) {
            a(th3, printWriter, "Suppressed: ", "\t", setNewSetFromMap, 128);
        }
        Throwable cause = th2.getCause();
        if (cause != null) {
            a(cause, printWriter, "Caused by: ", "", setNewSetFromMap, 128);
        }
    }

    private static void a(Throwable th2, int i10, String str, String str2) {
        while (true) {
            StackTraceElement[] stackTrace = th2.getStackTrace();
            try {
                NativeImpl.a(i10, str2);
                NativeImpl.a(i10, str);
            } catch (Throwable unused) {
            }
            b(th2, i10);
            for (StackTraceElement stackTraceElement : stackTrace) {
                a(stackTraceElement, i10);
            }
            for (Throwable th3 : th2.getSuppressed()) {
                a(th3, i10, "Suppressed: ", o2.l(str2, "\t"));
            }
            th2 = th2.getCause();
            if (th2 == null) {
                return;
            } else {
                str = "Caused by: ";
            }
        }
    }

    private static void a(Throwable th2, PrintWriter printWriter, String str, String str2, Set<Throwable> set, int i10) {
        while (!set.contains(th2)) {
            set.add(th2);
            StackTraceElement[] stackTrace = th2.getStackTrace();
            boolean z10 = stackTrace.length > i10;
            printWriter.println(str2 + str + th2);
            int length = stackTrace.length;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i11];
                if (z10 && i12 > i10) {
                    printWriter.println("\t... skip " + ((stackTrace.length - i12) - (i10 / 2)) + " lines");
                    break;
                }
                printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
                i12++;
                i11++;
            }
            if (z10) {
                for (int length2 = stackTrace.length - (i10 / 2); length2 < stackTrace.length; length2++) {
                    printWriter.println("\tat " + stackTrace[length2]);
                }
            }
            for (Throwable th3 : th2.getSuppressed()) {
                int i13 = i10 / 2;
                a(th3, printWriter, "Suppressed: ", o2.l(str2, "\t"), set, i13 > 10 ? i13 : 10);
            }
            PrintWriter printWriter2 = printWriter;
            Set<Throwable> set2 = set;
            th2 = th2.getCause();
            if (th2 == null) {
                return;
            }
            i10 /= 2;
            if (i10 <= 10) {
                i10 = 10;
            }
            str = "Caused by: ";
            printWriter = printWriter2;
            set = set2;
        }
        printWriter.println("\t[CIRCULAR REFERENCE:" + th2 + C3191e4.i.f36531e);
    }

    private static boolean a(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static JSONArray a(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < stackTraceElementArr.length; i10++) {
            if (aVar.f13191a == -1) {
                if (a(stackTraceElementArr[i10].getClassName(), strArr)) {
                    aVar.f13191a = i10;
                    aVar.f13192b = i10;
                }
            } else if (!a(stackTraceElementArr[i10].getClassName(), strArr)) {
                aVar.f13192b = i10;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f13191a != -1) {
            aVar.f13192b = stackTraceElementArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static JSONArray a(String[] strArr, String[] strArr2) {
        a aVar = new a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (aVar.f13191a == -1) {
                if (a(strArr[i10], strArr2)) {
                    aVar.f13191a = i10;
                    aVar.f13192b = i10;
                }
            } else if (!a(strArr[i10], strArr2)) {
                aVar.f13192b = i10;
                jSONArray.put(aVar.a());
                aVar = new a(-1, -1);
            }
        }
        if (aVar.f13191a != -1) {
            aVar.f13192b = strArr.length;
            jSONArray.put(aVar.a());
        }
        return jSONArray;
    }

    public static void a(Throwable th2, int i10) {
        if (th2 == null || i10 <= 0) {
            return;
        }
        try {
            b(th2, i10);
            for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                a(stackTraceElement, i10);
            }
            for (Throwable th3 : th2.getSuppressed()) {
                a(th3, i10, "Suppressed: ", "\t");
            }
            Throwable cause = th2.getCause();
            if (cause != null) {
                a(cause, i10, "Caused by: ", "");
            }
        } catch (Throwable unused) {
        }
    }
}
