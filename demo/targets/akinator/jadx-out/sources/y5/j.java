package y5;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public interface j extends h {
    @Override // y5.h
    /* synthetic */ void bindBlob(int i10, byte[] bArr);

    @Override // y5.h
    /* synthetic */ void bindDouble(int i10, double d10);

    @Override // y5.h
    /* synthetic */ void bindLong(int i10, long j10);

    @Override // y5.h
    /* synthetic */ void bindNull(int i10);

    @Override // y5.h
    /* synthetic */ void bindString(int i10, String str);

    @Override // y5.h
    /* synthetic */ void clearBindings();

    void execute();

    long executeInsert();

    int executeUpdateDelete();

    long simpleQueryForLong();

    String simpleQueryForString();
}
