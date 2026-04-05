package z5;

import android.database.sqlite.SQLiteProgram;
import kotlin.jvm.internal.e0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public class h implements y5.h {

    /* renamed from: b, reason: collision with root package name */
    public final SQLiteProgram f97567b;

    public h(SQLiteProgram delegate) {
        e0.checkNotNullParameter(delegate, "delegate");
        this.f97567b = delegate;
    }

    @Override // y5.h
    public void bindBlob(int i10, byte[] value) {
        e0.checkNotNullParameter(value, "value");
        this.f97567b.bindBlob(i10, value);
    }

    @Override // y5.h
    public void bindDouble(int i10, double d10) {
        this.f97567b.bindDouble(i10, d10);
    }

    @Override // y5.h
    public void bindLong(int i10, long j10) {
        this.f97567b.bindLong(i10, j10);
    }

    @Override // y5.h
    public void bindNull(int i10) {
        this.f97567b.bindNull(i10);
    }

    @Override // y5.h
    public void bindString(int i10, String value) {
        e0.checkNotNullParameter(value, "value");
        this.f97567b.bindString(i10, value);
    }

    @Override // y5.h
    public void clearBindings() {
        this.f97567b.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f97567b.close();
    }
}
