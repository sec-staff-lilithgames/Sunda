package o5;

import java.util.List;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class d implements x5.d {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x5.d f77523b;

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(kotlin.jvm.internal.u uVar) {
        }
    }

    static {
        new a(null);
    }

    public d(x5.d delegate) {
        kotlin.jvm.internal.e0.checkNotNullParameter(delegate, "delegate");
        this.f77523b = delegate;
    }

    @Override // x5.d
    public void bindBlob(int i10, byte[] value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f77523b.bindBlob(i10, value);
    }

    @Override // x5.d
    public void bindBoolean(int i10, boolean z10) {
        this.f77523b.bindBoolean(i10, z10);
    }

    @Override // x5.d
    public void bindDouble(int i10, double d10) {
        this.f77523b.bindDouble(i10, d10);
    }

    @Override // x5.d
    public void bindFloat(int i10, float f10) {
        this.f77523b.bindFloat(i10, f10);
    }

    @Override // x5.d
    public void bindInt(int i10, int i11) {
        this.f77523b.bindInt(i10, i11);
    }

    @Override // x5.d
    public void bindLong(int i10, long j10) {
        this.f77523b.bindLong(i10, j10);
    }

    @Override // x5.d
    public void bindNull(int i10) {
        this.f77523b.bindNull(i10);
    }

    @Override // x5.d
    public void bindText(int i10, String value) {
        kotlin.jvm.internal.e0.checkNotNullParameter(value, "value");
        this.f77523b.bindText(i10, value);
    }

    @Override // x5.d
    public void clearBindings() {
        this.f77523b.clearBindings();
    }

    @Override // x5.d, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public byte[] getBlob(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public boolean getBoolean(int i10) {
        return this.f77523b.getBoolean(i10);
    }

    @Override // x5.d
    public int getColumnCount() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public String getColumnName(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public List<String> getColumnNames() {
        return this.f77523b.getColumnNames();
    }

    @Override // x5.d
    public int getColumnType(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public double getDouble(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public float getFloat(int i10) {
        return this.f77523b.getFloat(i10);
    }

    @Override // x5.d
    public int getInt(int i10) {
        return this.f77523b.getInt(i10);
    }

    @Override // x5.d
    public long getLong(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public String getText(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public boolean isNull(int i10) {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public void reset() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }

    @Override // x5.d
    public boolean step() {
        throw new IllegalStateException("Only bind*() calls are allowed on the RoomRawQuery received statement.");
    }
}
