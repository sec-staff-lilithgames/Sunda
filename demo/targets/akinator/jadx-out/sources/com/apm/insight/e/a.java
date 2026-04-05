package com.apm.insight.e;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.apm.insight.e;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f12978a;

    /* renamed from: b, reason: collision with root package name */
    private com.apm.insight.e.a.b f12979b;

    /* renamed from: c, reason: collision with root package name */
    private SQLiteDatabase f12980c;

    private a() {
    }

    public static a a() {
        if (f12978a == null) {
            synchronized (a.class) {
                try {
                    if (f12978a == null) {
                        f12978a = new a();
                    }
                } finally {
                }
            }
        }
        return f12978a;
    }

    private void b() {
        if (this.f12979b == null) {
            a(e.g());
        }
    }

    public final synchronized void a(Context context) {
        try {
            this.f12980c = new b(context).getWritableDatabase();
        } finally {
            this.f12979b = new com.apm.insight.e.a.b();
        }
        this.f12979b = new com.apm.insight.e.a.b();
    }

    public final synchronized void a(com.apm.insight.d.a aVar) {
        b();
        com.apm.insight.e.a.b bVar = this.f12979b;
        if (bVar != null) {
            bVar.a(this.f12980c, aVar);
        }
    }

    public final synchronized boolean a(String str) {
        b();
        com.apm.insight.e.a.b bVar = this.f12979b;
        if (bVar == null) {
            return false;
        }
        return bVar.a(this.f12980c, str);
    }
}
