package pc;

import jc.o;
import ub.u;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class e extends f {

    /* renamed from: g, reason: collision with root package name */
    public final o f80940g;

    /* renamed from: h, reason: collision with root package name */
    public final String f80941h;

    public e(u uVar, String str, o oVar, String str2) {
        super(uVar, str, (o) null);
        this.f80940g = oVar;
        this.f80941h = str2;
    }

    public static e from(u uVar, String str, o oVar, String str2) {
        return new e(uVar, str, oVar, str2);
    }

    public o getBaseType() {
        return this.f80940g;
    }

    public String getTypeId() {
        return this.f80941h;
    }
}
