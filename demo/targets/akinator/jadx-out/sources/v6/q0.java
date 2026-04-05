package v6;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class q0 extends o5.o {
    @Override // o5.o
    public final String a() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // o5.o
    public void bind(x5.d statement, Object obj) {
        o0 entity = (o0) obj;
        kotlin.jvm.internal.e0.checkNotNullParameter(statement, "statement");
        kotlin.jvm.internal.e0.checkNotNullParameter(entity, "entity");
        statement.bindText(1, entity.getTag());
        statement.bindText(2, entity.getWorkSpecId());
    }
}
