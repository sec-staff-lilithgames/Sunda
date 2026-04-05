package bd;

import java.io.IOException;
import java.text.DateFormat;
import java.util.Calendar;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes5.dex */
public class h extends l {

    /* renamed from: h, reason: collision with root package name */
    public static final h f9080h = new h();

    public h() {
        this(null, null);
    }

    public h(Boolean bool, DateFormat dateFormat) {
        super(Calendar.class, bool, dateFormat);
    }

    @Override // bd.l, bd.z0, jc.w
    public void serialize(Calendar calendar, ub.o oVar, jc.u0 u0Var) throws IOException {
        if (e(u0Var)) {
            oVar.writeNumber(calendar == null ? 0L : calendar.getTimeInMillis());
        } else {
            f(calendar.getTime(), oVar, u0Var);
        }
    }

    @Override // bd.l
    public h withFormat(Boolean bool, DateFormat dateFormat) {
        return new h(bool, dateFormat);
    }
}
