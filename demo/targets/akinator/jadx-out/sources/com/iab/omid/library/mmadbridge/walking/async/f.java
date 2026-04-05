package com.iab.omid.library.mmadbridge.walking.async;

import android.text.TextUtils;
import com.iab.omid.library.mmadbridge.walking.async.b;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class f extends a {
    public f(b.InterfaceC0196b interfaceC0196b, HashSet<String> hashSet, JSONObject jSONObject, long j10) {
        super(interfaceC0196b, hashSet, jSONObject, j10);
    }

    private void b(String str) {
        com.iab.omid.library.mmadbridge.internal.c cVarC = com.iab.omid.library.mmadbridge.internal.c.c();
        if (cVarC != null) {
            for (com.iab.omid.library.mmadbridge.adsession.a aVar : cVarC.b()) {
                if (this.f31135c.contains(aVar.getAdSessionId())) {
                    aVar.getAdSessionStatePublisher().b(str, this.f31137e);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public String doInBackground(Object... objArr) {
        if (com.iab.omid.library.mmadbridge.utils.c.h(this.f31136d, this.f31139b.a())) {
            return null;
        }
        this.f31139b.a(this.f31136d);
        return this.f31136d.toString();
    }

    @Override // com.iab.omid.library.mmadbridge.walking.async.b, android.os.AsyncTask
    /* renamed from: a */
    public void onPostExecute(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        }
        super.onPostExecute(str);
    }
}
