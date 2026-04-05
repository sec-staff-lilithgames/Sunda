package com.mbridge.msdk.foundation.same.directory;

import com.mbridge.msdk.foundation.tools.p0;
import com.mbridge.msdk.foundation.tools.s0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: c, reason: collision with root package name */
    private static volatile e f40769c;

    /* renamed from: a, reason: collision with root package name */
    private final b f40770a;

    /* renamed from: b, reason: collision with root package name */
    private final ArrayList<a> f40771b = new ArrayList<>();

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public File f40772a;

        /* renamed from: b, reason: collision with root package name */
        public c f40773b;

        public a(c cVar, File file) {
            this.f40773b = cVar;
            this.f40772a = file;
        }
    }

    private e(b bVar) {
        this.f40770a = bVar;
    }

    public static File a(c cVar) {
        try {
            if (b() == null || b().f40771b == null || b().f40771b.isEmpty()) {
                return null;
            }
            Iterator<a> it = b().f40771b.iterator();
            while (it.hasNext()) {
                a next = it.next();
                if (next.f40773b.equals(cVar)) {
                    return next.f40772a;
                }
            }
            return null;
        } catch (Throwable th2) {
            p0.b("MBridgeDirManager", th2.getMessage(), th2);
            return null;
        }
    }

    public static String b(c cVar) {
        File fileA = a(cVar);
        if (fileA != null) {
            return fileA.getAbsolutePath();
        }
        return null;
    }

    public static synchronized e b() {
        try {
            if (f40769c == null && com.mbridge.msdk.foundation.controller.c.m().d() != null) {
                s0.a(com.mbridge.msdk.foundation.controller.c.m().d());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f40769c;
    }

    public static synchronized void a(b bVar) {
        if (f40769c == null) {
            f40769c = new e(bVar);
        }
    }

    public boolean a() {
        return a(this.f40770a.a());
    }

    private boolean a(com.mbridge.msdk.foundation.same.directory.a aVar) {
        String strB;
        com.mbridge.msdk.foundation.same.directory.a aVarC = aVar.c();
        if (aVarC == null) {
            strB = aVar.b();
        } else {
            File fileA = a(aVarC.d());
            if (fileA == null) {
                return false;
            }
            strB = fileA.getAbsolutePath() + File.separator + aVar.b();
        }
        File file = new File(strB);
        if (!(!file.exists() ? file.mkdirs() : true)) {
            return false;
        }
        this.f40771b.add(new a(aVar.d(), file));
        List<com.mbridge.msdk.foundation.same.directory.a> listA = aVar.a();
        if (listA != null) {
            Iterator<com.mbridge.msdk.foundation.same.directory.a> it = listA.iterator();
            while (it.hasNext()) {
                if (!a(it.next())) {
                    return false;
                }
            }
        }
        return true;
    }
}
