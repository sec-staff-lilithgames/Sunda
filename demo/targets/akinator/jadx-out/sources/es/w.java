package es;

import com.applovin.shadow.okhttp3.internal.connection.RealConnection;
import mh.p1;
import xr.je;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public Long f55108a = Long.valueOf(RealConnection.IDLE_CONNECTION_HEALTHY_NS);

    /* renamed from: b, reason: collision with root package name */
    public Long f55109b = 30000000000L;

    /* renamed from: c, reason: collision with root package name */
    public Long f55110c = 300000000000L;

    /* renamed from: d, reason: collision with root package name */
    public Integer f55111d = 10;

    /* renamed from: e, reason: collision with root package name */
    public a0 f55112e;

    /* renamed from: f, reason: collision with root package name */
    public y f55113f;

    /* renamed from: g, reason: collision with root package name */
    public je f55114g;

    public b0 build() {
        p1.checkState(this.f55114g != null);
        return new b0(this.f55108a, this.f55109b, this.f55110c, this.f55111d, this.f55112e, this.f55113f, this.f55114g);
    }

    public w setBaseEjectionTimeNanos(Long l9) {
        p1.checkArgument(l9 != null);
        this.f55109b = l9;
        return this;
    }

    public w setChildPolicy(je jeVar) {
        p1.checkState(jeVar != null);
        this.f55114g = jeVar;
        return this;
    }

    public w setFailurePercentageEjection(y yVar) {
        this.f55113f = yVar;
        return this;
    }

    public w setIntervalNanos(Long l9) {
        p1.checkArgument(l9 != null);
        this.f55108a = l9;
        return this;
    }

    public w setMaxEjectionPercent(Integer num) {
        p1.checkArgument(num != null);
        this.f55111d = num;
        return this;
    }

    public w setMaxEjectionTimeNanos(Long l9) {
        p1.checkArgument(l9 != null);
        this.f55110c = l9;
        return this;
    }

    public w setSuccessRateEjection(a0 a0Var) {
        this.f55112e = a0Var;
        return this;
    }
}
