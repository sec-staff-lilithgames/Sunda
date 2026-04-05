package com.iab.omid.library.amazon.walking.async;

import com.iab.omid.library.amazon.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class e extends a {
    public e(b.InterfaceC0168b interfaceC0168b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0168b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.amazon.internal.c cVarC = com.iab.omid.library.amazon.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.amazon.adsession.a aVar : cVarC.b()) {
                if (this.f30193c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().a(str, this.f30195e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f30194d.toString();
    }

    @Override // com.iab.omid.library.amazon.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
