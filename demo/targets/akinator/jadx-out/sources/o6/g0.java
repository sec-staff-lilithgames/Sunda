package o6;

import android.content.Context;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import uu.o1;
import uu.p1;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final g0 f77892a = new g0();

    public static final void migrateDatabase(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        g0 g0Var = f77892a;
        if (g0Var.getDefaultDatabasePath(context).exists()) {
            n6.c0.get().debug(h0.f77898a, "Migrating WorkDatabase to the no-backup directory");
            for (Map.Entry<File, File> entry : g0Var.migrationPaths(context).entrySet()) {
                File key = entry.getKey();
                File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        n6.c0.get().warning(h0.f77898a, "Over-writing contents of " + value);
                    }
                    n6.c0.get().debug(h0.f77898a, key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed");
                }
            }
        }
    }

    public final File getDatabasePath(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(noBackupFilesDir, "getNoBackupFilesDir(...)");
        return noBackupFilesDir;
    }

    public final File getDefaultDatabasePath(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        kotlin.jvm.internal.e0.checkNotNullExpressionValue(databasePath, "getDatabasePath(...)");
        return databasePath;
    }

    public final Map<File, File> migrationPaths(Context context) {
        kotlin.jvm.internal.e0.checkNotNullParameter(context, "context");
        File defaultDatabasePath = getDefaultDatabasePath(context);
        File databasePath = getDatabasePath(context);
        String[] strArr = h0.f77899b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(qv.v.coerceAtLeast(o1.mapCapacity(strArr.length), 16));
        for (String str : strArr) {
            tu.v vVar = tu.e0.to(new File(defaultDatabasePath.getPath() + str), new File(databasePath.getPath() + str));
            linkedHashMap.put(vVar.getFirst(), vVar.getSecond());
        }
        return p1.plus(linkedHashMap, tu.e0.to(defaultDatabasePath, databasePath));
    }
}
