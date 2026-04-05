package com.iab.omid.library.vungle.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f31518a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC0207b f31519b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.vungle.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0207b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0207b interfaceC0207b) {
        this.f31519b = interfaceC0207b;
    }

    public void a(a aVar) {
        this.f31518a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f31518a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
