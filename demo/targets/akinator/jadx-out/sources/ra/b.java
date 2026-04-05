package ra;

import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.u;
import lb.a1;
import org.json.JSONException;
import org.json.JSONObject;
import qb.d0;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public abstract class b extends d0 {

    /* renamed from: i, reason: collision with root package name */
    public String f84065i;

    /* renamed from: h, reason: collision with root package name */
    public final int f84064h = DtbConstants.NETWORK_READ_TIMEOUT;

    /* renamed from: j, reason: collision with root package name */
    public final String f84066j = "https://api-users.akinator.com/ws";

    /* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
    public static final class a {
        public a(u uVar) {
        }
    }

    static {
        new a(null);
    }

    public abstract void a(JSONObject jSONObject);

    @Override // qb.d0
    public int getMTimeout() {
        return this.f84064h;
    }

    @Override // qb.d0
    public String getMUrl() {
        return w0.i.d(this.f84066j, "/", this.f84065i);
    }

    @Override // qb.d0
    public int parseWSResponse(String response) throws JSONException {
        e0.checkNotNullParameter(response, "response");
        JSONObject jSONObject = new JSONObject(response);
        int iTestNodeCompletion = a1.f72726a.testNodeCompletion(jSONObject);
        if (iTestNodeCompletion == 0) {
            a(jSONObject);
        }
        return iTestNodeCompletion;
    }
}
