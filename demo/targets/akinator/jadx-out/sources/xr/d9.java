package xr;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes9.dex */
public final class d9 {

    /* renamed from: g, reason: collision with root package name */
    public static final wr.h f92427g = wr.h.create("io.grpc.internal.ManagedChannelServiceConfig.MethodInfo");

    /* renamed from: a, reason: collision with root package name */
    public final Long f92428a;

    /* renamed from: b, reason: collision with root package name */
    public final Boolean f92429b;

    /* renamed from: c, reason: collision with root package name */
    public final Integer f92430c;

    /* renamed from: d, reason: collision with root package name */
    public final Integer f92431d;

    /* renamed from: e, reason: collision with root package name */
    public final uc f92432e;

    /* renamed from: f, reason: collision with root package name */
    public final e5 f92433f;

    public d9(Map map, boolean z10, int i10, int i11) {
        long j10;
        boolean z11;
        uc ucVar;
        e5 e5Var;
        this.f92428a = o6.getStringAsDuration(map, "timeout");
        this.f92429b = o6.getBoolean(map, "waitForReady");
        Integer numberAsInteger = o6.getNumberAsInteger(map, "maxResponseMessageBytes");
        this.f92430c = numberAsInteger;
        if (numberAsInteger != null) {
            mh.p1.checkArgument(numberAsInteger.intValue() >= 0, "maxInboundMessageSize %s exceeds bounds", numberAsInteger);
        }
        Integer numberAsInteger2 = o6.getNumberAsInteger(map, "maxRequestMessageBytes");
        this.f92431d = numberAsInteger2;
        if (numberAsInteger2 != null) {
            mh.p1.checkArgument(numberAsInteger2.intValue() >= 0, "maxOutboundMessageSize %s exceeds bounds", numberAsInteger2);
        }
        Map<String, ?> object = z10 ? o6.getObject(map, "retryPolicy") : null;
        if (object == null) {
            j10 = 0;
            ucVar = null;
            z11 = true;
        } else {
            int iIntValue = ((Integer) mh.p1.checkNotNull(o6.getNumberAsInteger(object, "maxAttempts"), "maxAttempts cannot be empty")).intValue();
            mh.p1.checkArgument(iIntValue >= 2, "maxAttempts must be greater than 1: %s", iIntValue);
            int iMin = Math.min(iIntValue, i10);
            long jLongValue = ((Long) mh.p1.checkNotNull(o6.getStringAsDuration(object, "initialBackoff"), "initialBackoff cannot be empty")).longValue();
            mh.p1.checkArgument(jLongValue > 0, "initialBackoffNanos must be greater than 0: %s", jLongValue);
            long jLongValue2 = ((Long) mh.p1.checkNotNull(o6.getStringAsDuration(object, "maxBackoff"), "maxBackoff cannot be empty")).longValue();
            j10 = 0;
            z11 = true;
            mh.p1.checkArgument(jLongValue2 > 0, "maxBackoff must be greater than 0: %s", jLongValue2);
            Double d10 = (Double) mh.p1.checkNotNull(o6.getNumberAsDouble(object, "backoffMultiplier"), "backoffMultiplier cannot be empty");
            double dDoubleValue = d10.doubleValue();
            mh.p1.checkArgument(dDoubleValue > 0.0d, "backoffMultiplier must be greater than 0: %s", d10);
            Long stringAsDuration = o6.getStringAsDuration(object, "perAttemptRecvTimeout");
            mh.p1.checkArgument(stringAsDuration == null || stringAsDuration.longValue() >= 0, "perAttemptRecvTimeout cannot be negative: %s", stringAsDuration);
            Set setA = ke.a("retryableStatusCodes", object);
            mh.j3.verify(setA != null, "%s is required in retry policy", "retryableStatusCodes");
            mh.j3.verify(!setA.contains(wr.j6.OK), "%s must not contain OK", "retryableStatusCodes");
            mh.p1.checkArgument((stringAsDuration == null && setA.isEmpty()) ? false : true, "retryableStatusCodes cannot be empty without perAttemptRecvTimeout");
            ucVar = new uc(iMin, jLongValue, jLongValue2, dDoubleValue, stringAsDuration, setA);
        }
        this.f92432e = ucVar;
        Map<String, ?> object2 = z10 ? o6.getObject(map, "hedgingPolicy") : null;
        if (object2 == null) {
            e5Var = null;
        } else {
            int iIntValue2 = ((Integer) mh.p1.checkNotNull(o6.getNumberAsInteger(object2, "maxAttempts"), "maxAttempts cannot be empty")).intValue();
            mh.p1.checkArgument(iIntValue2 >= 2 ? z11 : false, "maxAttempts must be greater than 1: %s", iIntValue2);
            int iMin2 = Math.min(iIntValue2, i11);
            long jLongValue3 = ((Long) mh.p1.checkNotNull(o6.getStringAsDuration(object2, "hedgingDelay"), "hedgingDelay cannot be empty")).longValue();
            mh.p1.checkArgument(jLongValue3 >= j10 ? z11 : false, "hedgingDelay must not be negative: %s", jLongValue3);
            Set setA2 = ke.a("nonFatalStatusCodes", object2);
            if (setA2 == null) {
                setA2 = Collections.unmodifiableSet(EnumSet.noneOf(wr.j6.class));
            } else {
                mh.j3.verify(!setA2.contains(wr.j6.OK), "%s must not contain OK", "nonFatalStatusCodes");
            }
            e5Var = new e5(iMin2, jLongValue3, setA2);
        }
        this.f92433f = e5Var;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        return mh.h1.equal(this.f92428a, d9Var.f92428a) && mh.h1.equal(this.f92429b, d9Var.f92429b) && mh.h1.equal(this.f92430c, d9Var.f92430c) && mh.h1.equal(this.f92431d, d9Var.f92431d) && mh.h1.equal(this.f92432e, d9Var.f92432e) && mh.h1.equal(this.f92433f, d9Var.f92433f);
    }

    public int hashCode() {
        return mh.h1.hashCode(this.f92428a, this.f92429b, this.f92430c, this.f92431d, this.f92432e, this.f92433f);
    }

    public String toString() {
        return mh.g1.toStringHelper(this).add("timeoutNanos", this.f92428a).add("waitForReady", this.f92429b).add("maxInboundMessageSize", this.f92430c).add("maxOutboundMessageSize", this.f92431d).add("retryPolicy", this.f92432e).add("hedgingPolicy", this.f92433f).toString();
    }
}
