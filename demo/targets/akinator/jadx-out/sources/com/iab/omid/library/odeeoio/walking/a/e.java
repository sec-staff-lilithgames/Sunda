package com.iab.omid.library.odeeoio.walking.a;

import com.iab.omid.library.odeeoio.walking.a.b;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-329fa88356c9e071bedcd87e8cbc16a4cb0c028932e63902b8210957806638ae */
/* loaded from: classes7.dex */
public class e extends a {
    public e(b.InterfaceC0199b interfaceC0199b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0199b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.odeeoio.b.a aVarA = com.iab.omid.library.odeeoio.b.a.a();
        if (aVarA != null) {
            for (com.iab.omid.library.odeeoio.adsession.a aVar : aVarA.b()) {
                if (((a) this).f31252a.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f31254c);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        return this.f31253b.toString();
    }

    @Override // com.iab.omid.library.odeeoio.walking.a.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        b(str);
        super.onPostExecute(str);
    }
}
