package c7;

import android.content.Context;
import c7.s;
import java.io.Closeable;
import java.io.File;
import pw.n0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class t {
    public static final s create(n0 n0Var, pw.r rVar, String str, Closeable closeable) {
        return new r(n0Var, rVar, str, closeable, null);
    }

    public static /* synthetic */ s create$default(n0 n0Var, pw.r rVar, String str, Closeable closeable, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rVar = pw.r.f81966c;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        return create(n0Var, rVar, str, closeable);
    }

    public static final s create(n0 n0Var, pw.r rVar, String str, Closeable closeable, s.a aVar) {
        return new r(n0Var, rVar, str, closeable, aVar);
    }

    public static final s create(pw.k kVar, Context context) {
        return new v(kVar, q7.n.getSafeCacheDir(context), null);
    }

    public static /* synthetic */ s create$default(n0 n0Var, pw.r rVar, String str, Closeable closeable, s.a aVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rVar = pw.r.f81966c;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            closeable = null;
        }
        if ((i10 & 16) != 0) {
            aVar = null;
        }
        return create(n0Var, rVar, str, closeable, aVar);
    }

    public static final s create(pw.k kVar, Context context, s.a aVar) {
        return new v(kVar, q7.n.getSafeCacheDir(context), aVar);
    }

    public static final s create(pw.k kVar, File file) {
        return new v(kVar, file, null);
    }

    public static /* synthetic */ s create$default(pw.k kVar, Context context, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return create(kVar, context, aVar);
    }

    public static final s create(pw.k kVar, File file, s.a aVar) {
        return new v(kVar, file, aVar);
    }

    public static /* synthetic */ s create$default(pw.k kVar, File file, s.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        return create(kVar, file, aVar);
    }
}
