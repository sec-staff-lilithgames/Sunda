package pi;

import android.content.SharedPreferences;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes4.dex */
public final class f implements SuccessContinuation {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ii.g f81396b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f81397c;

    public f(g gVar, ii.g gVar2) {
        this.f81397c = gVar;
        this.f81396b = gVar2;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task<Void> then(Void r62) throws Exception {
        JSONObject jSONObject = (JSONObject) this.f81396b.f59616c.getExecutor().submit(new com.vungle.ads.internal.session.a(this, 12)).get();
        if (jSONObject != null) {
            g gVar = this.f81397c;
            d settingsJson = gVar.f81400c.parseSettingsJson(jSONObject);
            gVar.f81402e.writeCachedSettings(settingsJson.f81383c, jSONObject);
            ei.f.getLogger().d("Loaded settings: " + jSONObject.toString());
            String str = gVar.f81399b.f81413f;
            SharedPreferences.Editor editorEdit = hi.j.getSharedPrefs(gVar.f81398a).edit();
            editorEdit.putString("existing_instance_identifier", str);
            editorEdit.apply();
            gVar.f81405h.set(settingsJson);
            ((TaskCompletionSource) gVar.f81406i.get()).trySetResult(settingsJson);
        }
        return Tasks.forResult(null);
    }
}
