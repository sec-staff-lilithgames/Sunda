package y5;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import sv.k0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f94074a;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public d(int i10) {
        this.f94074a = i10;
    }

    public static void a(String str) {
        if (k0.equals(str, ":memory:", true)) {
            return;
        }
        int length = str.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = e0.compare((int) str.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        if (str.subSequence(i10, length + 1).toString().length() == 0) {
            return;
        }
        Log.w("SupportSQLite", "deleting the database file: ".concat(str));
        try {
            SQLiteDatabase.deleteDatabase(new File(str));
        } catch (Exception e10) {
            Log.w("SupportSQLite", "delete failed: ", e10);
        }
    }

    public void onConfigure(c db2) {
        e0.checkNotNullParameter(db2, "db");
    }

    public void onCorruption(c db2) {
        e0.checkNotNullParameter(db2, "db");
        Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + db2 + ".path");
        if (!db2.isOpen()) {
            String path = db2.getPath();
            if (path != null) {
                a(path);
                return;
            }
            return;
        }
        List<Pair<String, String>> attachedDbs = null;
        try {
            try {
                attachedDbs = db2.getAttachedDbs();
            } catch (SQLiteException unused) {
            }
            try {
                db2.close();
            } catch (IOException unused2) {
            }
            if (attachedDbs != null) {
                return;
            }
        } finally {
            if (attachedDbs != null) {
                Iterator<T> it = attachedDbs.iterator();
                while (it.hasNext()) {
                    Object second = ((Pair) it.next()).second;
                    e0.checkNotNullExpressionValue(second, "second");
                    a((String) second);
                }
            } else {
                String path2 = db2.getPath();
                if (path2 != null) {
                    a(path2);
                }
            }
        }
    }

    public abstract void onCreate(c cVar);

    public void onDowngrade(c db2, int i10, int i11) {
        e0.checkNotNullParameter(db2, "db");
        throw new SQLiteException(w0.i.a(i10, i11, "Can't downgrade database from version ", " to "));
    }

    public void onOpen(c db2) {
        e0.checkNotNullParameter(db2, "db");
    }

    public abstract void onUpgrade(c cVar, int i10, int i11);
}
