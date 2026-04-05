package com.iab.omid.library.amazon.walking.async;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public abstract class b extends AsyncTask<Object, Void, String> {

    /* renamed from: a, reason: collision with root package name */
    private a f30196a;

    /* renamed from: b, reason: collision with root package name */
    protected final InterfaceC0168b f30197b;

    public interface a {
        void a(b bVar);
    }

    /* renamed from: com.iab.omid.library.amazon.walking.async.b$b, reason: collision with other inner class name */
    public interface InterfaceC0168b {
        JSONObject a();

        void a(JSONObject jSONObject);
    }

    public b(InterfaceC0168b interfaceC0168b) {
        this.f30197b = interfaceC0168b;
    }

    public void a(a aVar) {
        this.f30196a = aVar;
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String str) {
        a aVar = this.f30196a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }
}
