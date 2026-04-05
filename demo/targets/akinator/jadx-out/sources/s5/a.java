package s5;

import kotlin.jvm.internal.e0;
import y5.c;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface a {
    default void onPostMigrate(c db2) {
        e0.checkNotNullParameter(db2, "db");
    }

    default void onPostMigrate(x5.b connection) {
        e0.checkNotNullParameter(connection, "connection");
        if (connection instanceof r5.a) {
            onPostMigrate(((r5.a) connection).getDb());
        }
    }
}
