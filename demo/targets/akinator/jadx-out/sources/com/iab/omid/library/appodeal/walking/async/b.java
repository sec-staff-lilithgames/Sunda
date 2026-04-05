package com.iab.omid.library.appodeal.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f30467a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC0176b f30468b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.appodeal.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0176b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0176b interfaceC0176b) {
        this.f30468b = interfaceC0176b;
    }

    public void a(a aVar) {
        this.f30467a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f30467a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
