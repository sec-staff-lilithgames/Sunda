package k4;

import java.io.File;
import java.io.IOException;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final class u1 extends kotlin.jvm.internal.f0 implements kv.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q1 f70529e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(q1 q1Var) {
        super(0);
        this.f70529e = q1Var;
    }

    @Override // kv.a
    public final File invoke() throws IOException {
        q1 q1Var = this.f70529e;
        File fileAccess$fileWithSuffix = q1.access$fileWithSuffix(q1Var, q1Var.f70479d);
        q1.access$createIfNotExists(q1Var, fileAccess$fileWithSuffix);
        return fileAccess$fileWithSuffix;
    }
}
