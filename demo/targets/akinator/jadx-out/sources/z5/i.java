package z5;

import android.database.sqlite.SQLiteStatement;
import kotlin.jvm.internal.e0;
import y5.j;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class i extends h implements j {

    /* renamed from: c, reason: collision with root package name */
    public final SQLiteStatement f97568c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(SQLiteStatement delegate) {
        super(delegate);
        e0.checkNotNullParameter(delegate, "delegate");
        this.f97568c = delegate;
    }

    @Override // y5.j
    public void execute() {
        this.f97568c.execute();
    }

    @Override // y5.j
    public long executeInsert() {
        return this.f97568c.executeInsert();
    }

    @Override // y5.j
    public int executeUpdateDelete() {
        return this.f97568c.executeUpdateDelete();
    }

    @Override // y5.j
    public long simpleQueryForLong() {
        return this.f97568c.simpleQueryForLong();
    }

    @Override // y5.j
    public String simpleQueryForString() {
        return this.f97568c.simpleQueryForString();
    }
}
