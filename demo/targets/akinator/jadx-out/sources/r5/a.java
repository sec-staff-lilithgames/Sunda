package r5;

import java.io.IOException;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class a implements x5.b {

    /* renamed from: b, reason: collision with root package name */
    public final y5.c f83783b;

    public a(y5.c db2) {
        e0.checkNotNullParameter(db2, "db");
        this.f83783b = db2;
    }

    @Override // x5.b, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f83783b.close();
    }

    public final y5.c getDb() {
        return this.f83783b;
    }

    @Override // x5.b
    public f prepare(String sql) {
        e0.checkNotNullParameter(sql, "sql");
        return f.f83794f.create(this.f83783b, sql);
    }
}
