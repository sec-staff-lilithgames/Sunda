package com.apm.insight.nativecrash;

import com.apm.insight.l.j;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: i, reason: collision with root package name */
    private static final Pattern f13223i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j, reason: collision with root package name */
    private static final Pattern f13224j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k, reason: collision with root package name */
    private static final Pattern f13225k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l, reason: collision with root package name */
    private static final Pattern f13226l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m, reason: collision with root package name */
    private static final Pattern f13227m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a, reason: collision with root package name */
    private String f13228a;

    /* renamed from: b, reason: collision with root package name */
    private String f13229b;

    /* renamed from: c, reason: collision with root package name */
    private String f13230c;

    /* renamed from: d, reason: collision with root package name */
    private String f13231d;

    /* renamed from: e, reason: collision with root package name */
    private String f13232e;

    /* renamed from: f, reason: collision with root package name */
    private String f13233f;

    /* renamed from: g, reason: collision with root package name */
    private String f13234g;

    /* renamed from: h, reason: collision with root package name */
    private Map<String, String> f13235h = new HashMap();

    public c(File file) {
        c(j.b(file));
    }

    public final String a() {
        return this.f13234g;
    }

    public final Map<String, String> b() {
        return this.f13235h;
    }

    public final String c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f13232e;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f13233f;
        if (str2 != null) {
            sb2.append(str2);
        }
        String str3 = this.f13234g;
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }

    public final void a(File file) {
        File fileB = j.b(file);
        if (fileB.exists()) {
            fileB.renameTo(new File(fileB.getAbsoluteFile() + ".old"));
        }
        NativeImpl.a(file);
        c(j.b(file));
    }

    public final void b(File file) {
        c(j.b(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x018a, code lost:
    
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
    
        if (r12 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0196, code lost:
    
        if (r12.contains("BuildId:") == false) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0198, code lost:
    
        r12 = com.apm.insight.nativecrash.c.f13227m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01a2, code lost:
    
        if (r12.find() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01a4, code lost:
    
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x01b6, code lost:
    
        if (r0.equals("data") == false) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01b8, code lost:
    
        r11.f13235h.put(r1, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(java.io.File r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.c.c(java.io.File):void");
    }
}
