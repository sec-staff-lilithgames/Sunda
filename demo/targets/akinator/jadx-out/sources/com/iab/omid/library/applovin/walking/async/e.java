package com.iab.omid.library.applovin.walking.async;

import com.iab.omid.library.applovin.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e extends a {
    public e(b.InterfaceC0172b interfaceC0172b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0172b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.applovin.internal.c cVarC = com.iab.omid.library.applovin.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.applovin.adsession.a aVar : cVarC.b()) {
                if (this.f30328c.contains(aVar.c())) {
                    aVar.d().a(str, this.f30330e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f30329d.toString();
    }

    @Override // com.iab.omid.library.applovin.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
