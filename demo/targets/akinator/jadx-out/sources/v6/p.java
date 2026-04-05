package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class p extends o5.o {
    @Override // o5.o
    public final String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // o5.o
    public void bind(x5.d statement, Object obj) {
        n entity = (n) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(statement, "statement");
        kotlin.jvm.internal.e0.checkNotNullParameter(entity, "entity");
        statement.bindText(1, entity.f89146a);
        statement.bindLong(2, entity.getGeneration());
        statement.bindLong(3, entity.f89148c);
    }
}
