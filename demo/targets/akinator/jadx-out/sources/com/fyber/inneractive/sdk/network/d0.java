package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f24202a;

    /* renamed from: b, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.cache.a f24203b;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f24204c;

    public d0(Context context, com.fyber.inneractive.sdk.cache.a aVar) {
        this.f24202a = context;
        this.f24203b = aVar;
    }

    public com.fyber.inneractive.sdk.cache.m a() throws Throwable {
        try {
            if (!this.f24203b.d()) {
                new c0();
                return new com.fyber.inneractive.sdk.cache.m();
            }
            Object objA = this.f24203b.a(a(this.f24203b.c()));
            if (this.f24204c == null) {
                this.f24204c = this.f24202a.getSharedPreferences("IAConfigurationPreferences", 0);
            }
            return new com.fyber.inneractive.sdk.cache.m(objA, this.f24204c.getString(this.f24203b.b(), null));
        } catch (Exception unused) {
            b();
            return new com.fyber.inneractive.sdk.cache.m();
        }
    }

    public final void b(String str) {
        if (this.f24204c == null) {
            this.f24204c = this.f24202a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f24204c.edit().putString(this.f24203b.b(), str).apply();
    }

    public final void b() {
        if (this.f24204c == null) {
            this.f24204c = this.f24202a.getSharedPreferences("IAConfigurationPreferences", 0);
        }
        this.f24204c.edit().remove(this.f24203b.b()).apply();
    }

    public boolean a(String str, String str2) throws IOException {
        boolean z10;
        IAlog.a("caching file %s", str);
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        boolean z11 = false;
        try {
            try {
                fileOutputStreamOpenFileOutput = this.f24202a.openFileOutput(str, 0);
                fileOutputStreamOpenFileOutput.write(str2.getBytes());
                z10 = true;
            } finally {
                if (fileOutputStreamOpenFileOutput != null) {
                    try {
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e10) {
                        IAlog.f("Failed closing cache file: %s", e10.getMessage());
                    }
                }
            }
        } catch (Exception e11) {
            e = e11;
        }
        try {
            IAlog.a("File cached successfully", new Object[0]);
            try {
                fileOutputStreamOpenFileOutput.close();
            } catch (Exception e12) {
                IAlog.f("Failed closing cache file: %s", e12.getMessage());
            }
        } catch (Exception e13) {
            e = e13;
            z11 = true;
            IAlog.f("Failed caching file: %s", e.getMessage());
            z10 = z11;
            return z10;
        }
        return z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(java.lang.String r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.String r0 = "Failed closing local file: %s"
            java.lang.Object[] r1 = new java.lang.Object[]{r7}
            java.lang.String r2 = "reading local file: %s"
            com.fyber.inneractive.sdk.util.IAlog.a(r2, r1)
            r1 = 0
            android.content.Context r2 = r6.f24202a     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            java.io.FileInputStream r2 = r2.openFileInput(r7)     // Catch: java.lang.Throwable -> L39 java.lang.Exception -> L3b
            int r3 = r2.available()     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r2.read(r3)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            java.lang.String r5 = "UTF-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L34 java.lang.Exception -> L37
            r2.close()     // Catch: java.lang.Exception -> L26
            goto L32
        L26:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.fyber.inneractive.sdk.util.IAlog.f(r0, r1)
        L32:
            r1 = r4
            goto L60
        L34:
            r7 = move-exception
            r1 = r2
            goto L70
        L37:
            r3 = move-exception
            goto L3d
        L39:
            r7 = move-exception
            goto L70
        L3b:
            r3 = move-exception
            r2 = r1
        L3d:
            boolean r4 = r3 instanceof java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L34
            if (r4 != 0) goto L6a
            java.lang.String r4 = "Failed reading local file: %s"
            java.lang.String r3 = r3.getMessage()     // Catch: java.lang.Throwable -> L34
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Throwable -> L34
            com.fyber.inneractive.sdk.util.IAlog.a(r4, r3)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L60
            r2.close()     // Catch: java.lang.Exception -> L54
            goto L60
        L54:
            r2 = move-exception
            java.lang.String r2 = r2.getMessage()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.fyber.inneractive.sdk.util.IAlog.f(r0, r2)
        L60:
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r0 = "local file %s read successfully"
            com.fyber.inneractive.sdk.util.IAlog.a(r0, r7)
            return r1
        L6a:
            java.io.FileNotFoundException r7 = new java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L34
            r7.<init>()     // Catch: java.lang.Throwable -> L34
            throw r7     // Catch: java.lang.Throwable -> L34
        L70:
            if (r1 == 0) goto L82
            r1.close()     // Catch: java.lang.Exception -> L76
            goto L82
        L76:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.fyber.inneractive.sdk.util.IAlog.f(r0, r1)
        L82:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.network.d0.a(java.lang.String):java.lang.String");
    }
}
