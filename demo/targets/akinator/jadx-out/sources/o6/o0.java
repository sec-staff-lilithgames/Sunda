package o6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class o0 extends s5.b {
    public o0() {
        super(20, 21);
    }

    @Override // s5.b
    public void migrate(x5.b connection) throws Exception {
        kotlin.jvm.internal.e0.checkNotNullParameter(connection, "connection");
        x5.a.execSQL(connection, "ALTER TABLE `WorkSpec` ADD COLUMN `required_network_request` BLOB NOT NULL DEFAULT x''");
    }
}
