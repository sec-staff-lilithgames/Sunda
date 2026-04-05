package tj;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final long f86952b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f86953c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d, reason: collision with root package name */
    public static n f86954d;

    /* renamed from: a, reason: collision with root package name */
    public final xj.a f86955a;

    public n(xj.a aVar) {
        this.f86955a = aVar;
    }

    public static n getInstance() {
        return getInstance(xj.b.getInstance());
    }

    public long currentTimeInMillis() {
        return ((xj.b) this.f86955a).currentTimeMillis();
    }

    public long currentTimeInSecs() {
        return TimeUnit.MILLISECONDS.toSeconds(currentTimeInMillis());
    }

    public long getRandomDelayForSyncPrevention() {
        return (long) (Math.random() * 1000.0d);
    }

    public boolean isAuthTokenExpired(vj.f fVar) {
        if (TextUtils.isEmpty(fVar.getAuthToken())) {
            return true;
        }
        return fVar.getExpiresInSecs() + fVar.getTokenCreationEpochInSecs() < currentTimeInSecs() + f86952b;
    }

    public static n getInstance(xj.a aVar) {
        if (f86954d == null) {
            f86954d = new n(aVar);
        }
        return f86954d;
    }
}
