package xr;

import androidx.core.app.NotificationCompat;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class g4 extends x9 {

    /* renamed from: b, reason: collision with root package name */
    public boolean f92546b;

    /* renamed from: c, reason: collision with root package name */
    public final wr.m6 f92547c;

    /* renamed from: d, reason: collision with root package name */
    public final l1 f92548d;

    /* renamed from: e, reason: collision with root package name */
    public final wr.u[] f92549e;

    public g4(wr.m6 m6Var, wr.u[] uVarArr) {
        this(m6Var, l1.f92748b, uVarArr);
    }

    @Override // xr.x9, xr.k1
    public void appendTimeoutInsight(l5 l5Var) {
        l5Var.appendKeyValue("error", this.f92547c).appendKeyValue(NotificationCompat.CATEGORY_PROGRESS, this.f92548d);
    }

    @Override // xr.x9, xr.k1
    public void start(m1 m1Var) {
        mh.p1.checkState(!this.f92546b, "already started");
        this.f92546b = true;
        wr.u[] uVarArr = this.f92549e;
        int length = uVarArr.length;
        int i10 = 0;
        while (true) {
            wr.m6 m6Var = this.f92547c;
            if (i10 >= length) {
                m1Var.closed(m6Var, this.f92548d, new wr.e4());
                return;
            } else {
                uVarArr[i10].streamClosed(m6Var);
                i10++;
            }
        }
    }

    public g4(wr.m6 m6Var, l1 l1Var, wr.u[] uVarArr) {
        mh.p1.checkArgument(!m6Var.isOk(), "error must not be OK");
        this.f92547c = m6Var;
        this.f92548d = l1Var;
        this.f92549e = uVarArr;
    }
}
