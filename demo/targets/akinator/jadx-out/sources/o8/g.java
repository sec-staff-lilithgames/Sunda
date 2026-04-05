package o8;

import android.content.ContentResolver;
import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    public static final a f78008e = new a();

    /* renamed from: a, reason: collision with root package name */
    public final f f78009a;

    /* renamed from: b, reason: collision with root package name */
    public final q8.b f78010b;

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f78011c;

    /* renamed from: d, reason: collision with root package name */
    public final List f78012d;

    public g(List list, f fVar, q8.b bVar, ContentResolver contentResolver) {
        this.f78009a = fVar;
        this.f78010b = bVar;
        this.f78011c = contentResolver;
        this.f78012d = list;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x001d: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:30), block:B:10:0x001d */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[PHI: r3
      0x0024: PHI (r3v6 android.database.Cursor) = (r3v2 android.database.Cursor), (r3v8 android.database.Cursor) binds: [B:24:0x0043, B:13:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream open(android.net.Uri r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            java.lang.String r1 = "Failed to query for thumbnail for Uri: "
            r2 = 0
            o8.f r3 = r7.f78009a     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L2b
            android.database.Cursor r3 = r3.query(r8)     // Catch: java.lang.Throwable -> L29 java.lang.SecurityException -> L2b
            if (r3 == 0) goto L22
            boolean r4 = r3.moveToFirst()     // Catch: java.lang.Throwable -> L1c java.lang.SecurityException -> L20
            if (r4 == 0) goto L22
            r4 = 0
            java.lang.String r0 = r3.getString(r4)     // Catch: java.lang.Throwable -> L1c java.lang.SecurityException -> L20
            r3.close()
            goto L46
        L1c:
            r8 = move-exception
            r2 = r3
            goto L92
        L20:
            r4 = move-exception
            goto L2d
        L22:
            if (r3 == 0) goto L27
        L24:
            r3.close()
        L27:
            r0 = r2
            goto L46
        L29:
            r8 = move-exception
            goto L92
        L2b:
            r4 = move-exception
            r3 = r2
        L2d:
            r5 = 3
            boolean r5 = android.util.Log.isLoggable(r0, r5)     // Catch: java.lang.Throwable -> L1c
            if (r5 == 0) goto L43
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            r5.append(r8)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L1c
            android.util.Log.d(r0, r1, r4)     // Catch: java.lang.Throwable -> L1c
        L43:
            if (r3 == 0) goto L27
            goto L24
        L46:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L4d
            goto L91
        L4d:
            o8.a r1 = o8.g.f78008e
            java.io.File r0 = r1.get(r0)
            boolean r3 = r1.exists(r0)
            if (r3 == 0) goto L91
            r3 = 0
            long r5 = r1.length(r0)
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L91
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            android.content.ContentResolver r1 = r7.f78011c     // Catch: java.lang.NullPointerException -> L6e
            java.io.InputStream r8 = r1.openInputStream(r0)     // Catch: java.lang.NullPointerException -> L6e
            return r8
        L6e:
            r1 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "NPE opening uri: "
            r3.<init>(r4)
            r3.append(r8)
            java.lang.String r8 = " -> "
            r3.append(r8)
            r3.append(r0)
            java.lang.String r8 = r3.toString()
            r2.<init>(r8)
            java.lang.Throwable r8 = r2.initCause(r1)
            java.io.FileNotFoundException r8 = (java.io.FileNotFoundException) r8
            throw r8
        L91:
            return r2
        L92:
            if (r2 == 0) goto L97
            r2.close()
        L97:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.g.open(android.net.Uri):java.io.InputStream");
    }
}
