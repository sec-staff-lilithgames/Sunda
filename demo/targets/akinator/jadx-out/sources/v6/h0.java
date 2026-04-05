package v6;

import tu.x0;
import v6.m0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements kv.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f89125b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f89126c;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f89127e;

    public /* synthetic */ h0(long j10, String str, int i10) {
        this.f89125b = i10;
        this.f89126c = j10;
        this.f89127e = str;
    }

    @Override // kv.l
    public final Object invoke(Object obj) {
        x5.d dVarPrepare;
        int i10 = this.f89125b;
        x0 x0Var = x0.f87415a;
        String str = this.f89127e;
        long j10 = this.f89126c;
        x5.b _connection = (x5.b) obj;
        switch (i10) {
            case 0:
                m0.a aVar = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("UPDATE workspec SET next_schedule_time_override=? WHERE id=?");
                try {
                    dVarPrepare.bindLong(1, j10);
                    dVarPrepare.bindText(2, str);
                    dVarPrepare.step();
                    return x0Var;
                } finally {
                }
            case 1:
                m0.a aVar2 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    dVarPrepare.bindLong(1, j10);
                    dVarPrepare.bindText(2, str);
                    dVarPrepare.step();
                    int totalChangedRows = u5.r.getTotalChangedRows(_connection);
                    dVarPrepare.close();
                    return Integer.valueOf(totalChangedRows);
                } finally {
                }
            default:
                m0.a aVar3 = m0.f89142d;
                kotlin.jvm.internal.e0.checkNotNullParameter(_connection, "_connection");
                dVarPrepare = _connection.prepare("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    dVarPrepare.bindLong(1, j10);
                    dVarPrepare.bindText(2, str);
                    dVarPrepare.step();
                    return x0Var;
                } finally {
                }
        }
    }
}
