package o5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class v1 implements y5.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f77750b;

    public v1(w1 w1Var) {
        this.f77750b = w1Var;
    }

    @Override // y5.h
    public void bindBlob(int i10, byte[] value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f77750b.bindBlob(i10, value);
    }

    @Override // y5.h
    public void bindDouble(int i10, double d10) {
        this.f77750b.bindDouble(i10, d10);
    }

    @Override // y5.h
    public void bindLong(int i10, long j10) {
        this.f77750b.bindLong(i10, j10);
    }

    @Override // y5.h
    public void bindNull(int i10) {
        this.f77750b.bindNull(i10);
    }

    @Override // y5.h
    public void bindString(int i10, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f77750b.bindString(i10, value);
    }

    @Override // y5.h
    public void clearBindings() {
        this.f77750b.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f77750b.close();
    }
}
