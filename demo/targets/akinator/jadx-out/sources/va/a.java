package va;

import com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback;
import org.json.JSONException;
import org.json.JSONObject;
import ya.d;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class a extends IIgniteServiceCallback.Stub {

    /* renamed from: c, reason: collision with root package name */
    public final wa.a f89199c;

    public a(wa.a aVar) {
        this.f89199c = aVar;
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onError(String str) {
        this.f89199c.a(str);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onSuccess(String str) throws JSONException {
        String string;
        try {
            string = new JSONObject(str).getJSONObject("data").getString("token");
        } catch (Exception e10) {
            ya.b.a(d.ONE_DT_GENERAL_ERROR, e10);
            cb.b.b("%s : resolveClientToken : %s", "IgniteAuthenticationCallback", e10.toString());
            string = null;
        }
        this.f89199c.c(string);
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onProgress(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onScheduled(String str) {
    }

    @Override // com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback.Stub, com.digitalturbine.ignite.cl.aidl.IIgniteServiceCallback
    public final void onStart(String str) {
    }
}
